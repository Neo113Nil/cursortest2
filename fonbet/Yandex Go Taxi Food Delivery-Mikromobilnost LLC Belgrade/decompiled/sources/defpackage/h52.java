package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes15.dex */
public abstract class h52 {
    public static final String a;

    static {
        byte[] bArr = of91.b;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ of91.a[i % 8]);
        }
        a = new String(bArr2, uza.a);
    }

    public static final Map a(h5a0 h5a0Var) {
        boolean z = h5a0Var instanceof c5a0;
        String str = a;
        if (z) {
            c5a0 c5a0Var = (c5a0) h5a0Var;
            MapBuilder y = qv10.y("method", "card");
            y.put("payment system", c5a0Var.g);
            String str2 = c5a0Var.l;
            if (str2 != null) {
                y.put(str, str2);
            }
            return y.j();
        }
        if (h5a0Var instanceof e5a0) {
            return b.i(new Pair("method", "me2me"), new Pair(str, ((e5a0) h5a0Var).f));
        }
        if (h5a0Var instanceof g5a0) {
            return b.i(new Pair("method", "yandex_account"), new Pair("agreement_id", ssa1.b(((g5a0) h5a0Var).h)));
        }
        if (h5a0Var instanceof f5a0) {
            return b.i(new Pair("method", "savings_account"), new Pair("agreement_id", ssa1.b(((f5a0) h5a0Var).e)));
        }
        if (h5a0Var == null) {
            return g8e.z("method", "new card");
        }
        w511.b();
        return null;
    }

    public static final Map b(h5a0 h5a0Var) {
        if (h5a0Var instanceof e5a0) {
            return b.i(new Pair("method", "me2me"), new Pair("nspk_id", ((e5a0) h5a0Var).f));
        }
        if (h5a0Var instanceof f5a0) {
            return b.i(new Pair("method", "savings_account"), new Pair("agreement_id", ssa1.b(((f5a0) h5a0Var).e)));
        }
        if ((h5a0Var instanceof g5a0) || (h5a0Var instanceof c5a0) || h5a0Var == null) {
            return g8e.z("method", "null");
        }
        w511.b();
        return null;
    }
}
