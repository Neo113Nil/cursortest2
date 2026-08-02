package ru.ok.android.sdk.api;

import android.net.Uri;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.schedulers.a;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.sdk.api.ExternApiConfigProviderImpl;
import ru.ok.android.sdk.api.config.SdkApiConfig;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.gzs;
import xsna.m3g;
import xsna.s3q0;
import xsna.tx;

/* compiled from: ExternApiConfigProviderImpl.kt */
/* loaded from: classes9.dex */
public final class ExternApiConfigProviderImpl implements ExternApiConfigProvider {
    private final ApiAppKeyProvider appKeyProvider;
    private volatile SdkApiConfig config;
    private final ApiSessionStore store;
    private final b compositeDisposable = new b();
    private final ReentrantLock lock = new ReentrantLock();

    public ExternApiConfigProviderImpl(ApiSessionStore apiSessionStore, ApiAppKeyProvider apiAppKeyProvider) {
        this.store = apiSessionStore;
        this.appKeyProvider = apiAppKeyProvider;
    }

    private final void clearSessionInfo() {
        this.store.setSessionInfo(null);
    }

    private final void clearSessionInfoAsync() {
        doAsyncWithLock(new m3g(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 clearSessionInfoAsync$lambda$0(ExternApiConfigProviderImpl externApiConfigProviderImpl) {
        externApiConfigProviderImpl.clearSessionInfo();
        return s3q0.a;
    }

    private final void doAsyncWithLock(final gzs<s3q0> gzsVar) {
        this.compositeDisposable.b(new m(new Callable() { // from class: xsna.xdq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                s3q0 doAsyncWithLock$lambda$0;
                doAsyncWithLock$lambda$0 = ExternApiConfigProviderImpl.doAsyncWithLock$lambda$0(ExternApiConfigProviderImpl.this, gzsVar);
                return doAsyncWithLock$lambda$0;
            }
        }).q(a.b()).subscribe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 doAsyncWithLock$lambda$0(ExternApiConfigProviderImpl externApiConfigProviderImpl, gzs gzsVar) {
        ReentrantLock reentrantLock = externApiConfigProviderImpl.lock;
        reentrantLock.lock();
        try {
            gzsVar.invoke();
            reentrantLock.unlock();
            return s3q0.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final SdkApiConfig read() {
        ApiSessionStore.SessionInfo sessionInfo = this.store.getSessionInfo();
        SdkApiConfig withApplication = SdkApiConfig.EMPTY.withApplication(this.appKeyProvider.getAppKey());
        if ((sessionInfo != null ? sessionInfo.getApiEndpoint() : null) != null) {
            withApplication = withApplication.withUri("api", Uri.parse(sessionInfo.getApiEndpoint()));
        }
        return (sessionInfo != null ? sessionInfo.getSessionKey() : null) != null ? withApplication.withSession(sessionInfo.getSessionKey()) : withApplication;
    }

    private final void write(SdkApiConfig sdkApiConfig) {
        Uri uri = sdkApiConfig.getUri("api");
        this.store.setSessionInfo(new ApiSessionStore.SessionInfo(sdkApiConfig.getSessionKey(), uri != null ? uri.toString() : null));
    }

    private final void writeAsync(SdkApiConfig sdkApiConfig) {
        doAsyncWithLock(new tx(13, this, sdkApiConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 writeAsync$lambda$0(ExternApiConfigProviderImpl externApiConfigProviderImpl, SdkApiConfig sdkApiConfig) {
        externApiConfigProviderImpl.write(sdkApiConfig);
        return s3q0.a;
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    public void clearSession() {
        clearSessionInfoAsync();
        setApiConfig(SdkApiConfig.EMPTY.withApplication(this.appKeyProvider.getAppKey()));
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    public SdkApiConfig getApiConfig() {
        SdkApiConfig sdkApiConfig = this.config;
        if (sdkApiConfig == null) {
            sdkApiConfig = read();
        }
        this.config = sdkApiConfig;
        return sdkApiConfig;
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    public void setApiConfig(SdkApiConfig sdkApiConfig) {
        this.config = sdkApiConfig;
        writeAsync(sdkApiConfig);
    }
}
