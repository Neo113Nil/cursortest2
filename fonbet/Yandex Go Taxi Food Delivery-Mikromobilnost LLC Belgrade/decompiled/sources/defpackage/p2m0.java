package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.scooters.experiments.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class p2m0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ p2m0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((rly0) obj2).a);
            case 1:
                soy0 soy0Var = (soy0) obj2;
                return scc.c(Float.valueOf(soy0Var.a), Float.valueOf(soy0Var.b));
            case 2:
                g1m0 g1m0Var = (g1m0) obj;
                apy0 apy0Var = (apy0) obj2;
                sty0 sty0Var = new sty0(apy0Var.a);
                s2m0 s2m0Var = t2m0.v;
                return scc.c(t2m0.a(sty0Var, s2m0Var, g1m0Var), t2m0.a(new sty0(apy0Var.b), s2m0Var, g1m0Var));
            case 3:
                return Integer.valueOf(((lzr) obj2).a);
            case 4:
                jky jkyVar = (jky) obj2;
                return scc.c(jkyVar.d(), t2m0.a(jkyVar.b(), t2m0.i, (g1m0) obj));
            case 5:
                return Float.valueOf(((td5) obj2).a);
            case 6:
                g1m0 g1m0Var2 = (g1m0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(t2m0.a((ik2) list.get(i), t2m0.b, g1m0Var2));
                }
                return arrayList;
            case 7:
                asy0 asy0Var = (asy0) obj2;
                return scc.c(Integer.valueOf((int) (asy0Var.a >> 32)), Integer.valueOf((int) (asy0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            case 8:
                g1m0 g1m0Var3 = (g1m0) obj;
                bgr0 bgr0Var = (bgr0) obj2;
                return scc.c(t2m0.a(new ldc(bgr0Var.a), t2m0.p, g1m0Var3), t2m0.a(new wu60(bgr0Var.b), t2m0.x, g1m0Var3), Float.valueOf(bgr0Var.c));
            case 9:
                return Integer.valueOf(((sjy0) obj2).a);
            case 10:
                return Integer.valueOf(((vly0) obj2).a);
            case 11:
                return Integer.valueOf(((n2v) obj2).a);
            case 12:
                return Integer.valueOf(((hzr) obj2).a);
            case 13:
                return Integer.valueOf(((izr) obj2).a);
            case 14:
                sty0 sty0Var2 = (sty0) obj2;
                return sty0Var2 != null ? sty0.a(sty0Var2.a, sty0.c) : false ? Boolean.FALSE : scc.c(Float.valueOf(sty0.c(sty0Var2.a)), t2m0.a(new tty0(sty0.b(sty0Var2.a)), t2m0.w, (g1m0) obj));
            case 15:
                iky ikyVar = (iky) obj2;
                return scc.c(ikyVar.d(), t2m0.a(ikyVar.b(), t2m0.i, (g1m0) obj));
            case 16:
                long j = ((tty0) obj2).a;
                if (tty0.a(j, 8589934592L)) {
                    return 0;
                }
                if (tty0.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 17:
                wu60 wu60Var = (wu60) obj2;
                return wu60Var != null ? wu60.c(wu60Var.a, 9205357640488583168L) : false ? Boolean.FALSE : scc.c(Float.valueOf(Float.intBitsToFloat((int) (wu60Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (wu60Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
            case 18:
                g1m0 g1m0Var4 = (g1m0) obj;
                List list2 = ((k5z) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(t2m0.a((h5z) list2.get(i2), t2m0.z, g1m0Var4));
                }
                return arrayList2;
            case 19:
                return ((h5z) obj2).a.toLanguageTag();
            case 20:
                g1m0 g1m0Var5 = (g1m0) obj;
                ehy ehyVar = (ehy) obj2;
                return scc.c(t2m0.a(new bhy(ehyVar.a), t2m0.B, g1m0Var5), t2m0.a(new dhy(ehyVar.b), t2m0.C, g1m0Var5), t2m0.a(new chy(ehyVar.c), t2m0.D, g1m0Var5));
            case 21:
                return Float.valueOf(((bhy) obj2).a);
            case 22:
                return Integer.valueOf(((dhy) obj2).a);
            case 23:
                return Integer.valueOf(((chy) obj2).a);
            case 24:
                return ((e731) obj2).a();
            case 25:
                g1m0 g1m0Var6 = (g1m0) obj;
                gc90 gc90Var = (gc90) obj2;
                Object a = t2m0.a(new sjy0(gc90Var.a), t2m0.q, g1m0Var6);
                Object a2 = t2m0.a(new vly0(gc90Var.b), t2m0.r, g1m0Var6);
                Object a3 = t2m0.a(new sty0(gc90Var.c), t2m0.v, g1m0Var6);
                apy0 apy0Var2 = gc90Var.d;
                apy0 apy0Var3 = apy0.c;
                Object a4 = t2m0.a(apy0Var2, t2m0.l, g1m0Var6);
                tvc0 tvc0Var = gc90Var.e;
                tvc0 tvc0Var2 = tvc0.c;
                Object a5 = t2m0.a(tvc0Var, gu91.a, g1m0Var6);
                ehy ehyVar2 = gc90Var.f;
                ehy ehyVar3 = ehy.d;
                return scc.c(a, a2, a3, a4, a5, t2m0.a(ehyVar2, t2m0.A, g1m0Var6), t2m0.a(new kgy(gc90Var.g), gu91.c, g1m0Var6), t2m0.a(new n2v(gc90Var.h), t2m0.s, g1m0Var6), t2m0.a(gc90Var.i, gu91.d, g1m0Var6));
            case 26:
                return ((sg21) obj2).a();
            case 27:
                g1m0 g1m0Var7 = (g1m0) obj;
                bmt0 bmt0Var = (bmt0) obj2;
                ldc ldcVar = new ldc(bmt0Var.a.b());
                s2m0 s2m0Var2 = t2m0.p;
                Object a6 = t2m0.a(ldcVar, s2m0Var2, g1m0Var7);
                sty0 sty0Var3 = new sty0(bmt0Var.b);
                s2m0 s2m0Var3 = t2m0.v;
                Object a7 = t2m0.a(sty0Var3, s2m0Var3, g1m0Var7);
                lzr lzrVar = bmt0Var.c;
                lzr lzrVar2 = lzr.b;
                Object a8 = t2m0.a(lzrVar, t2m0.m, g1m0Var7);
                Object a9 = t2m0.a(bmt0Var.d, t2m0.t, g1m0Var7);
                Object a10 = t2m0.a(bmt0Var.e, t2m0.u, g1m0Var7);
                String str = bmt0Var.g;
                Object a11 = t2m0.a(new sty0(bmt0Var.h), s2m0Var3, g1m0Var7);
                Object a12 = t2m0.a(bmt0Var.i, t2m0.n, g1m0Var7);
                Object a13 = t2m0.a(bmt0Var.j, t2m0.k, g1m0Var7);
                k5z k5zVar = bmt0Var.k;
                k5z k5zVar2 = k5z.c;
                Object a14 = t2m0.a(k5zVar, t2m0.y, g1m0Var7);
                Object a15 = t2m0.a(new ldc(bmt0Var.l), s2m0Var2, g1m0Var7);
                Object a16 = t2m0.a(bmt0Var.m, t2m0.j, g1m0Var7);
                bgr0 bgr0Var2 = bmt0Var.n;
                bgr0 bgr0Var3 = bgr0.d;
                return scc.c(a6, a7, a8, a9, a10, -1, str, a11, a12, a13, a14, a15, a16, t2m0.a(bgr0Var2, t2m0.o, g1m0Var7));
            case 28:
                g1m0 g1m0Var8 = (g1m0) obj;
                hry0 hry0Var = (hry0) obj2;
                bmt0 d = hry0Var.d();
                tig0 tig0Var = t2m0.h;
                return scc.c(t2m0.a(d, tig0Var, g1m0Var8), t2m0.a(hry0Var.a(), tig0Var, g1m0Var8), t2m0.a(hry0Var.b(), tig0Var, g1m0Var8), t2m0.a(hry0Var.c(), tig0Var, g1m0Var8));
            default:
                return Boolean.valueOf(((g0) obj).h() == ((g0) obj2).h());
        }
    }
}
