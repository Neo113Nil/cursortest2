package defpackage;

import java.io.BufferedInputStream;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* loaded from: classes6.dex */
public final class ff60 {
    public static if60 a(wnt wntVar, Throwable th) {
        try {
            BufferedInputStream N = s8o.N(th);
            if (N == null) {
                return null;
            }
            return (if60) ((xnt) wntVar).b(N, if60.Companion.serializer());
        } catch (SerializationException e) {
            jst.e.k(e, "failed to read body of RequestError");
            return null;
        }
    }

    public final KSerializer serializer() {
        return ef60.a;
    }
}
