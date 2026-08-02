package one.video.upload.exceptions;

import java.io.IOException;
import xsna.zcl;

/* compiled from: TlsBufferOverflowException.kt */
/* loaded from: classes8.dex */
public final class TlsBufferOverflowException extends IOException {
    public /* synthetic */ TlsBufferOverflowException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public TlsBufferOverflowException(String str, Throwable th) {
        super(str, th);
    }
}
