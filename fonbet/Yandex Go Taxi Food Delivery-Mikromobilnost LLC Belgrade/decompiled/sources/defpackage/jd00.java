package defpackage;

import android.net.Uri;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.node.d;
import com.google.common.collect.ImmutableMap;
import com.yandex.smartcamera.arscene.ui.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class jd00 {
    public static volatile k6u a;

    public static final void a(final t33 t33Var, final int i, final tls tlsVar, final sls slsVar, fid fidVar, final int i2) {
        aii0 v;
        wls wlsVar;
        uo5 uo5Var = x4c.A;
        v33 v33Var = t33Var.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1524964924);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.e(slsVar) ? 2048 : 1024) | i2 | (btsVar.e(t33Var) ? 4 : 2) | (btsVar.c(i) ? 32 : 16);
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            List list = t33Var.a.a;
            if (list.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    final int i4 = 0;
                    wlsVar = new wls(t33Var, i, tlsVar, slsVar, i2, i4) { // from class: k33
                        public final /* synthetic */ int a;
                        public final /* synthetic */ t33 b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ sls x;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(385);
                                    jd00.a(this.b, this.c, this.w, this.x, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(385);
                                    jd00.a(this.b, this.c, this.w, this.x, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = new g400(((j33) list.get(i)).b);
                btsVar.o0(Q);
            }
            final g400 g400Var = (g400) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = f.j(v33Var.a);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            k3r k3rVar = ljs0.c;
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = new w5(9, oz40Var);
                btsVar.o0(Q3);
            }
            com.yandex.smartcamera.arscene.ui.f.a(g400Var, v33Var, (tls) Q3, slsVar, btsVar, (i3 & 7168) | 384);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(i9a1.g(c530Var), 1.0f);
            uo5 uo5Var2 = x4c.c;
            cj6 cj6Var = cj6.a;
            wqy0.b((String) oz40Var.getValue(), an91.o(cj6Var.a(c, uo5Var2), 32.0f, 16.0f, 32.0f, 0.0f, 8), ldc.f, uh6.E(28), null, null, null, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, null, btsVar, 3456, 0, 130544);
            btsVar = btsVar;
            f530 a2 = cj6Var.a(ljs0.e(i9a1.d(ljs0.c(c530Var, 1.0f)), 48.0f), uo5Var);
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((j33) it.next()).a);
            }
            boolean e = btsVar.e(g400Var) | btsVar.e(list);
            Object Q4 = btsVar.Q();
            if (e || Q4 == obj) {
                Q4 = new q(11, g400Var, list, tlsVar);
                btsVar.o0(Q4);
            }
            a.a(a2, i, arrayList, (tls) Q4, btsVar, i3 & 112);
            f530 d3 = i9a1.d(an91.o(cj6Var.a(c530Var, uo5Var), 0.0f, 0.0f, 0.0f, 100.0f, 7));
            final int i5 = 0;
            lhl0 a3 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, d3);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o2);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar3);
            }
            qje.W(btsVar, d.d, d4);
            boolean e2 = btsVar.e(g400Var);
            Object Q5 = btsVar.Q();
            if (e2 || Q5 == obj) {
                Q5 = new sls() { // from class: l33
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        g400 g400Var2 = g400Var;
                        switch (i6) {
                            case 0:
                                s33 s33Var = g400Var2.b;
                                if (s33Var != null) {
                                    s33Var.c0.c();
                                    break;
                                }
                                break;
                            default:
                                s33 s33Var2 = g400Var2.b;
                                if (s33Var2 != null) {
                                    s33Var2.c0.b();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q5);
            }
            t2d.a.getClass();
            androidx.compose.material.a.a((sls) Q5, null, false, null, null, null, null, t2d.b, btsVar, 805306368, 510);
            oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
            boolean e3 = btsVar.e(g400Var);
            Object Q6 = btsVar.Q();
            final int i6 = 1;
            if (e3 || Q6 == obj) {
                Q6 = new sls() { // from class: l33
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i62 = i6;
                        zy11 zy11Var = zy11.a;
                        g400 g400Var2 = g400Var;
                        switch (i62) {
                            case 0:
                                s33 s33Var = g400Var2.b;
                                if (s33Var != null) {
                                    s33Var.c0.c();
                                    break;
                                }
                                break;
                            default:
                                s33 s33Var2 = g400Var2.b;
                                if (s33Var2 != null) {
                                    s33Var2.c0.b();
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q6);
            }
            androidx.compose.material.a.a((sls) Q6, null, false, null, null, null, null, t2d.c, btsVar, 805306368, 510);
            btsVar.t(true);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            final int i7 = 1;
            wlsVar = new wls(t33Var, i, tlsVar, slsVar, i2, i7) { // from class: k33
                public final /* synthetic */ int a;
                public final /* synthetic */ t33 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ sls x;

                {
                    this.a = i7;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int O = vng.O(385);
                            jd00.a(this.b, this.c, this.w, this.x, (fid) obj2, O);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int O2 = vng.O(385);
                            jd00.a(this.b, this.c, this.w, this.x, (fid) obj2, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(jb2 jb2Var, ix80 ix80Var) {
        if (ix80Var instanceof gx80) {
            jb2Var.e(((gx80) ix80Var).a, Path$Direction.CounterClockwise);
            return;
        }
        if (ix80Var instanceof hx80) {
            jb2Var.f(((hx80) ix80Var).a, Path$Direction.CounterClockwise);
        } else if (ix80Var instanceof fx80) {
            jb2Var.d(((fx80) ix80Var).a);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static npg c(s4j0 s4j0Var, String str, w6i0 w6i0Var, int i, Map map) {
        mpg mpgVar = new mpg();
        mpgVar.a = m4m0.j(str, w6i0Var.c);
        mpgVar.f = w6i0Var.a;
        mpgVar.g = w6i0Var.b;
        String a2 = s4j0Var.a();
        if (a2 == null) {
            a2 = m4m0.j(((ic5) s4j0Var.b.get(0)).a, w6i0Var.c).toString();
        }
        mpgVar.h = a2;
        mpgVar.i = i;
        mpgVar.e = map;
        return mpgVar.a();
    }

    public static void d(qam qamVar, ix80 ix80Var, ml6 ml6Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = ix80Var instanceof gx80;
        i3r i3rVar = i3r.a;
        if (z) {
            zii0 zii0Var = ((gx80) ix80Var).a;
            float f3 = zii0Var.a;
            qamVar.c0(ml6Var, (Float.floatToRawIntBits(zii0Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3) << 32), l(zii0Var), f2, i3rVar, 3);
            return;
        }
        if (!(ix80Var instanceof hx80)) {
            if (ix80Var instanceof fx80) {
                qamVar.q0(((fx80) ix80Var).a, ml6Var, f2, i3rVar, 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        hx80 hx80Var = (hx80) ix80Var;
        jb2 jb2Var = hx80Var.b;
        if (jb2Var != null) {
            qamVar.q0(jb2Var, ml6Var, f2, i3rVar, 3);
            return;
        }
        sxk0 sxk0Var = hx80Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (sxk0Var.h >> 32));
        float f4 = sxk0Var.a;
        qamVar.v0(ml6Var, (Float.floatToRawIntBits(sxk0Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(sxk0Var.h()) << 32) | (Float.floatToRawIntBits(sxk0Var.c()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), f2, i3rVar);
    }

    public static void e(qam qamVar, ix80 ix80Var, long j) {
        if (ix80Var instanceof gx80) {
            zii0 zii0Var = ((gx80) ix80Var).a;
            float f = zii0Var.a;
            float f2 = zii0Var.b;
            qamVar.B0(j, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), l(zii0Var), 1.0f, null, 3);
            return;
        }
        boolean z = ix80Var instanceof hx80;
        i3r i3rVar = i3r.a;
        if (!z) {
            if (ix80Var instanceof fx80) {
                qamVar.a0(((fx80) ix80Var).a, j, i3rVar);
                return;
            } else {
                w511.b();
                return;
            }
        }
        hx80 hx80Var = (hx80) ix80Var;
        jb2 jb2Var = hx80Var.b;
        if (jb2Var != null) {
            qamVar.a0(jb2Var, j, i3rVar);
            return;
        }
        sxk0 sxk0Var = hx80Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (sxk0Var.h >> 32));
        float f3 = sxk0Var.a;
        float f4 = sxk0Var.b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float h = sxk0Var.h();
        float c = sxk0Var.c();
        qamVar.L(j, floatToRawIntBits, (Float.floatToRawIntBits(c) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(h) << 32), (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32), i3rVar, 3);
    }

    public static s4j0 f(int i, pxa0 pxa0Var) {
        List list = pxa0Var.c;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            if (((a70) list.get(i2)).b == i) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        List list2 = ((a70) list.get(i2)).c;
        if (list2.isEmpty()) {
            return null;
        }
        return (s4j0) list2.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(su6 su6Var, kpg kpgVar, s4j0 s4j0Var, boolean z) {
        w6i0 w6i0Var = s4j0Var.x;
        w6i0Var.getClass();
        if (z) {
            w6i0 c = s4j0Var.c();
            if (c == null) {
                return;
            }
            w6i0 a2 = w6i0Var.a(c, ((ic5) s4j0Var.b.get(0)).a);
            if (a2 == null) {
                h(kpgVar, s4j0Var, su6Var, w6i0Var);
                w6i0Var = c;
            } else {
                w6i0Var = a2;
            }
        }
        h(kpgVar, s4j0Var, su6Var, w6i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(kpg kpgVar, s4j0 s4j0Var, su6 su6Var, w6i0 w6i0Var) {
        new swv(kpgVar, c(s4j0Var, ((ic5) s4j0Var.b.get(0)).a, w6i0Var, 0, ImmutableMap.f()), s4j0Var.a, 0, null, su6Var).load();
    }

    public static egg i(kpg kpgVar, Uri uri) {
        ggg gggVar = new ggg();
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        npg a2 = mpgVar.a();
        x7u0 x7u0Var = new x7u0(kpgVar);
        uwy.f.getAndIncrement();
        x7u0Var.b = 0L;
        lpg lpgVar = new lpg(x7u0Var, a2);
        try {
            lpgVar.a();
            Uri inflatedUri = kpgVar.getInflatedUri();
            inflatedUri.getClass();
            Object parse = gggVar.parse(inflatedUri, (InputStream) lpgVar);
            tw21.g(lpgVar);
            parse.getClass();
            return (egg) parse;
        } catch (Throwable th) {
            tw21.g(lpgVar);
            throw th;
        }
    }

    public static final nkc j(t6z t6zVar) {
        Pair pair = new Pair("name", qcx.c("set_location"));
        Pair pair2 = new Pair("type", qcx.c("client_action"));
        Pair pair3 = new Pair("lat", qcx.b(Double.valueOf(t6zVar.a)));
        Pair pair4 = new Pair("lon", qcx.b(Double.valueOf(t6zVar.b)));
        Double valueOf = Double.valueOf(0.0d);
        return new nkc("set_location", new nng(new c(kotlin.collections.b.i(pair, pair2, new Pair("payload", new c(gw00.e(new Pair("location", new c(kotlin.collections.b.i(pair3, pair4, new Pair("recency", qcx.b(valueOf)), new Pair("accuracy", qcx.b(Double.valueOf(t6zVar.c))), new Pair("speed", qcx.b(valueOf)))))))))).toString(), null));
    }

    public static su6 k(int i, androidx.media3.common.a aVar) {
        String str = aVar.m;
        ity ityVar = o2v0.d4;
        return new su6((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new les(32, ityVar) : new q810(2, ityVar), i, aVar);
    }

    public static final long l(zii0 zii0Var) {
        float f = zii0Var.c - zii0Var.a;
        float f2 = zii0Var.d - zii0Var.b;
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }
}
