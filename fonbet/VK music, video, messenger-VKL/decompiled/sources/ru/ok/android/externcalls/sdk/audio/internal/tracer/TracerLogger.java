package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* compiled from: TracerLogger.kt */
/* loaded from: classes9.dex */
public final class TracerLogger implements Logger {
    private final Logger delegate;
    private final TracerLiteFacade tracer;

    public TracerLogger(TracerLiteFacade tracerLiteFacade, Logger logger) {
        this.tracer = tracerLiteFacade;
        this.delegate = logger;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void d(String str, String str2) {
        this.delegate.d(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void e(String str, String str2) {
        this.delegate.e(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void i(String str, String str2) {
        this.delegate.i(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void reportError(String str, String str2, Throwable th) {
        this.delegate.reportError(str, str2, th);
        TracerLiteFacade.reportCrash$default(this.tracer, th, null, 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void v(String str, String str2) {
        this.delegate.v(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, String str2) {
        this.delegate.w(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void d(String str, String str2, Throwable th) {
        this.delegate.d(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void e(String str, String str2, Throwable th) {
        this.delegate.e(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void i(String str, String str2, Throwable th) {
        this.delegate.i(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void v(String str, String str2, Throwable th) {
        this.delegate.v(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, String str2, Throwable th) {
        this.delegate.w(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, Throwable th) {
        this.delegate.w(str, th);
    }
}
