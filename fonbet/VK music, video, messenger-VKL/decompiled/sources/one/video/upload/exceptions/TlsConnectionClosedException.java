package one.video.upload.exceptions;

import java.io.IOException;
import xsna.zcl;

/* compiled from: TlsConnectionClosedException.kt */
/* loaded from: classes8.dex */
public final class TlsConnectionClosedException extends IOException {
    public /* synthetic */ TlsConnectionClosedException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public TlsConnectionClosedException(String str, Throwable th) {
        super(str, th);
    }
}
