package androidx.compose.ui.node;

import defpackage.bqu;
import defpackage.kt1;
import defpackage.lt1;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class a {
    public final lt1 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public lt1 h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public a(lt1 lt1Var) {
        this.a = lt1Var;
    }

    public static final void a(a aVar, kt1 kt1Var, int i, s sVar) {
        long j;
        HashMap hashMap = aVar.i;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        loop0: while (true) {
            j = floatToRawIntBits | floatToRawIntBits2;
            do {
                j = aVar.b(sVar, j);
                sVar = sVar.K;
                if (sVar.equals(aVar.a.X())) {
                    break loop0;
                }
            } while (!aVar.c(sVar).containsKey(kt1Var));
            float d = aVar.d(sVar, kt1Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(d);
            long floatToRawIntBits4 = Float.floatToRawIntBits(d);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        }
        int round = Math.round(kt1Var instanceof bqu ? Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : Float.intBitsToFloat((int) (j >> 32)));
        if (hashMap.containsKey(kt1Var)) {
            round = androidx.compose.ui.layout.a.a(kt1Var, ((Number) kotlin.collections.b.g(kt1Var, hashMap)).intValue(), round);
        }
        hashMap.put(kt1Var, Integer.valueOf(round));
    }

    public abstract long b(s sVar, long j);

    public abstract Map c(s sVar);

    public abstract int d(s sVar, kt1 kt1Var);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    public final void g() {
        this.b = true;
        lt1 lt1Var = this.a;
        lt1 A = lt1Var.A();
        if (A == null) {
            return;
        }
        if (this.c) {
            A.x();
        } else if (this.e || this.d) {
            A.requestLayout();
        }
        if (this.f) {
            lt1Var.x();
        }
        if (this.g) {
            lt1Var.requestLayout();
        }
        A.b().g();
    }

    public final void h() {
        HashMap hashMap = this.i;
        hashMap.clear();
        tls tlsVar = new tls() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                lt1 lt1Var = (lt1) obj;
                if (lt1Var.o() != Integer.MAX_VALUE) {
                    if (lt1Var.b().b) {
                        lt1Var.O();
                    }
                    HashMap hashMap2 = lt1Var.b().i;
                    a aVar = a.this;
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        a.a(aVar, (kt1) entry.getKey(), ((Number) entry.getValue()).intValue(), lt1Var.X());
                    }
                    for (s sVar = lt1Var.X().K; !sVar.equals(a.this.a.X()); sVar = sVar.K) {
                        Set<kt1> keySet = a.this.c(sVar).keySet();
                        a aVar2 = a.this;
                        for (kt1 kt1Var : keySet) {
                            a.a(aVar2, kt1Var, aVar2.d(sVar, kt1Var), sVar);
                        }
                    }
                }
                return zy11.a;
            }
        };
        lt1 lt1Var = this.a;
        lt1Var.D(tlsVar);
        hashMap.putAll(c(lt1Var.X()));
        this.b = false;
    }

    public final void i() {
        a b;
        a b2;
        boolean e = e();
        lt1 lt1Var = this.a;
        if (!e) {
            lt1 A = lt1Var.A();
            if (A == null) {
                return;
            }
            lt1Var = A.b().h;
            if (lt1Var == null || !lt1Var.b().e()) {
                lt1 lt1Var2 = this.h;
                if (lt1Var2 == null || lt1Var2.b().e()) {
                    return;
                }
                lt1 A2 = lt1Var2.A();
                if (A2 != null && (b2 = A2.b()) != null) {
                    b2.i();
                }
                lt1 A3 = lt1Var2.A();
                lt1Var = (A3 == null || (b = A3.b()) == null) ? null : b.h;
            }
        }
        this.h = lt1Var;
    }
}
