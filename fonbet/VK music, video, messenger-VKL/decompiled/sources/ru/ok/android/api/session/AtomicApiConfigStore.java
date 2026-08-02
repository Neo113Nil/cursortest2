package ru.ok.android.api.session;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigStore;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: AtomicApiConfigStore.kt */
/* loaded from: classes9.dex */
public final class AtomicApiConfigStore implements ApiConfigStore {
    public static final Companion Companion = new Companion(null);
    private final ApiConfigStore delegate;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* compiled from: AtomicApiConfigStore.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AtomicApiConfigStore create(ApiConfig apiConfig) {
            return new AtomicApiConfigStore(new SimpleApiConfigStore(apiConfig));
        }

        private Companion() {
        }
    }

    public AtomicApiConfigStore(ApiConfigStore apiConfigStore) {
        this.delegate = apiConfigStore;
    }

    public static final AtomicApiConfigStore create(ApiConfig apiConfig) {
        return Companion.create(apiConfig);
    }

    @Override // ru.ok.android.api.session.ApiConfigStore, ru.ok.android.api.core.ApiConfigProvider
    public ApiConfig getApiConfig() {
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            return this.delegate.getApiConfig();
        } finally {
            readLock.unlock();
        }
    }

    @Override // ru.ok.android.api.session.ApiConfigStore
    public void setApiConfig(ApiConfig apiConfig) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.delegate.setApiConfig(apiConfig);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ok.android.api.session.ApiConfigStore
    public ApiConfig updateApiConfig(ApiConfigStore.Updater updater) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return this.delegate.updateApiConfig(updater);
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
