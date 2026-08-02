package ru.ok.android.externcalls.sdk.sessionroom.exceptions;

import xsna.zcl;

/* compiled from: SessionRoomException.kt */
/* loaded from: classes9.dex */
public class SessionRoomException extends RuntimeException {
    private final Throwable cause;
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionRoomException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionRoomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public SessionRoomException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    public /* synthetic */ SessionRoomException(String str, Throwable th, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
