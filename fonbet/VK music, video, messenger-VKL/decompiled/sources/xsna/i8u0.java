package xsna;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: VkAndroidAutoIdGenericSerializer.kt */
/* loaded from: classes16.dex */
public final class i8u0<T> implements j8u0, h8u0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // xsna.h8u0
    public final T a(String str) {
        int L = drm0.L(str, '|', 0, 6);
        h8u0 h8u0Var = (h8u0) this.b.get(L == -1 ? "" : str.substring(0, L));
        if (h8u0Var != null) {
            return (T) h8u0Var.a(drm0.h0(str, '|'));
        }
        return null;
    }

    @Override // xsna.j8u0
    public final String serialize(T t) {
        Pair pair = (Pair) this.a.get(t.getClass());
        if (pair == null) {
            return "";
        }
        String str = (String) pair.d();
        j8u0 j8u0Var = (j8u0) pair.g();
        StringBuilder b = v1v.b(str, '|');
        b.append(j8u0Var.serialize(t));
        return b.toString();
    }
}
