package ru.ok.android.externcalls.sdk.watch_together.exceptions;

import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import xsna.zcl;

/* compiled from: WatchTogetherException.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherException extends RuntimeException {
    private final Throwable cause;
    private final String message;
    private final WatchTogetherError reason;

    public WatchTogetherException(WatchTogetherError watchTogetherError) {
        this(watchTogetherError, null, null, 6, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final WatchTogetherError getReason() {
        return this.reason;
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str) {
        this(watchTogetherError, str, null, 4, null);
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th) {
        super(str, th);
        this.reason = watchTogetherError;
        this.message = str;
        this.cause = th;
    }

    public /* synthetic */ WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th, int i, zcl zclVar) {
        this(watchTogetherError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }
}
