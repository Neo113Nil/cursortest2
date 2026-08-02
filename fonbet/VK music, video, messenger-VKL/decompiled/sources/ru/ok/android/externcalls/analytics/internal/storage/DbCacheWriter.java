package ru.ok.android.externcalls.analytics.internal.storage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import xsna.e9e0;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DbCacheWriter.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class DbCacheWriter implements CacheWriter {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallAnalyticsDbCacheWriter";
    private final DatabaseHelper dbHelper;
    private final Lock lock;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    /* compiled from: DbCacheWriter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DbCacheWriter(DatabaseHelper databaseHelper, Lock lock) {
        this.dbHelper = databaseHelper;
        this.lock = lock;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public int count() {
        Lock lock = this.lock;
        lock.lock();
        try {
            return this.dbHelper.count();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void drop() throws IOException {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.drop();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void grab(e9e0<File> e9e0Var) throws IOException {
        this.logger.d(LOG_TAG, "grab requested. noop for db driven uploader");
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public long length() {
        return 0L;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void writeToCache(CallAnalyticsEvent callAnalyticsEvent) {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.append(callAnalyticsEvent);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            lock.unlock();
        }
    }
}
