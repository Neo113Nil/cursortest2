package xsna;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Lambda;
import xsna.g6k;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes.dex */
public final class b6k extends Lambda implements gzs<String> {
    public static final b6k i = new b6k(0);

    @Override // xsna.gzs
    public final String invoke() {
        StringBuilder sb = new StringBuilder("Must be called on a background thread, was called on ");
        g6k.d.getClass();
        sb.append(g6k.a.b());
        sb.append(JwtParser.SEPARATOR_CHAR);
        return sb.toString();
    }
}
