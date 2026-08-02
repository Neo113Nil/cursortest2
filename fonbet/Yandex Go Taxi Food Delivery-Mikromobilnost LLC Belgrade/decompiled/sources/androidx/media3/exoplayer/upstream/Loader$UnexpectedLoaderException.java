package androidx.media3.exoplayer.upstream;

import defpackage.g8e;
import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Loader$UnexpectedLoaderException(Throwable th) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        sb.append(th.getMessage() != null ? g8e.s(th, new StringBuilder(Extension.COLON_SPACE)) : "");
    }
}
