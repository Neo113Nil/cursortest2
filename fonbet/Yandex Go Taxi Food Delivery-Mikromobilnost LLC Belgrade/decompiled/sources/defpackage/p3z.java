package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes6.dex */
public abstract class p3z {
    public static final a7u0 a = new a7u0(new o3z(0));

    public static final void a(eyr eyrVar, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(966053865);
        int i2 = (btsVar.k(eyrVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sb2.b(a.a(eyrVar), aVar, btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(eyrVar, aVar, i, 14);
        }
    }
}
