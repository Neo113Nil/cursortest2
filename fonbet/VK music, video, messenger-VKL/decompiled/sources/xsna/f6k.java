package xsna;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Lambda;
import xsna.g6k;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes.dex */
public final class f6k extends Lambda implements gzs<String> {
    public static final f6k i = new f6k(0);

    @Override // xsna.gzs
    public final String invoke() {
        StringBuilder sb = new StringBuilder("Must not be called on a main thread, was called on ");
        g6k.d.getClass();
        sb.append(g6k.a.b());
        sb.append(JwtParser.SEPARATOR_CHAR);
        return sb.toString();
    }
}
