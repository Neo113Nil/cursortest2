package one.video.upload.exceptions;

import java.io.IOException;
import xsna.zcl;

/* compiled from: TlsBufferUnderflowException.kt */
/* loaded from: classes8.dex */
public final class TlsBufferUnderflowException extends IOException {
    public /* synthetic */ TlsBufferUnderflowException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public TlsBufferUnderflowException(String str, Throwable th) {
        super(str, th);
    }
}
