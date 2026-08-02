package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p050 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ p050(gzs gzsVar, String str, q630 q630Var, lg90 lg90Var, int i) {
        this.e = lg90Var;
        this.c = str;
        this.f = q630Var;
        this.g = gzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        tra0 tra0Var;
        long j;
        bsp0 bsp0Var;
        y2n0 y2n0Var;
        String str;
        boolean z;
        String substring;
        wjo0 wjo0Var;
        String str2;
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) this.e;
                q630 q630Var = (q630) this.f;
                gzs gzsVar = (gzs) this.g;
                ((Integer) obj2).getClass();
                s050.i(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, this.c, gzsVar, q630Var, lg90Var);
                return s3q0.a;
            default:
                frv0 frv0Var = (frv0) this.e;
                wjo0 wjo0Var2 = (wjo0) this.f;
                jai jaiVar = (jai) this.g;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                nmo0 nmo0Var = frv0Var.a;
                long j2 = o6jVar.a;
                String str3 = this.c;
                int i = this.d;
                ljo0 a = wjo0.a(wjo0Var2, str3, nmo0Var, i, j2, 968);
                long j3 = o6jVar.a;
                tra0 N = ((zo10) j5g.Y(ztm0Var.t1("suffixContent", new jai(-1834436868, new m2f(1, jaiVar), true)))).N(j3);
                int i2 = N.c;
                int i3 = N.b;
                ztm0Var.getDensity();
                int I0 = (int) ztm0Var.I0(6);
                nmo0 nmo0Var2 = frv0Var.a;
                long j4 = o6jVar.a;
                m540 m540Var = a.b;
                kjo0 kjo0Var = a.a;
                int i4 = m540Var.f;
                long j5 = j4;
                if (i4 == 0) {
                    tra0Var = N;
                    j = j3;
                    bsp0Var = new bsp0(kjo0Var.a.c, new y2n0(0, 0));
                } else if (i4 != 1) {
                    String str4 = kjo0Var.a.c;
                    int i5 = i4 - 1;
                    String str5 = kjo0Var.a.subSequence(m540Var.f(i5), m540Var.c(i5, true)).c;
                    tra0Var = N;
                    wjo0 wjo0Var3 = wjo0Var2;
                    j = j3;
                    ljo0 a2 = wjo0.a(wjo0Var3, str5, nmo0Var2, 0, 0L, 1020);
                    int i6 = (o6j.i(j5) - i3) - I0;
                    if (i6 < ((int) (a2.c >> 32))) {
                        str = str5;
                        i6 -= (int) (wjo0.a(wjo0Var3, "…", nmo0Var2, 0, 0L, 1020).c >> 32);
                        z = true;
                    } else {
                        str = str5;
                        z = false;
                    }
                    int length = str.length();
                    while (true) {
                        String str6 = str;
                        substring = str6.substring(0, length);
                        str = str6;
                        int i7 = i6;
                        long j6 = j5;
                        int i8 = length - 1;
                        wjo0Var = wjo0Var3;
                        if (((int) (wjo0.a(wjo0Var3, substring, nmo0Var2, 1, j6, 972).c >> 32)) > i7 && i8 >= 0) {
                            j5 = j6;
                            length = i8;
                            i6 = i7;
                            wjo0Var3 = wjo0Var;
                        }
                    }
                    if (z) {
                        str2 = drm0.p0(substring).toString() + (char) 8230;
                    } else {
                        str2 = substring;
                    }
                    String str7 = str4.substring(0, m540Var.f(i5)) + str2;
                    int i9 = (int) (wjo0.a(wjo0Var, str2, nmo0Var2, 0, 0L, 1020).c >> 32);
                    float g = m540Var.g(i5);
                    bsp0Var = new bsp0(str7, new y2n0(i9 + I0, an10.b(((m540Var.b(i5) - g) - i2) / 2) + an10.b(g)));
                } else {
                    j = j3;
                    tra0Var = N;
                    String str8 = kjo0Var.a.c;
                    ljo0 a3 = wjo0.a(wjo0Var2, str8, nmo0Var2, 1, j5, 972);
                    int i10 = (int) (a.c >> 32);
                    float g2 = m540Var.g(0);
                    float b = m540Var.b(0);
                    float f = b - g2;
                    if (o6j.i(j5) < ((int) (a3.c >> 32)) + i3 + I0) {
                        y2n0Var = new y2n0(0, an10.b((f - i2) / 2) + an10.b(b));
                        str8 = str8 + '\n';
                    } else {
                        y2n0Var = new y2n0(i10, an10.b((f - i2) / 2));
                    }
                    int i11 = y2n0Var.a;
                    if (i11 != 0) {
                        y2n0Var = new y2n0(i11 + I0, y2n0Var.b);
                    }
                    bsp0Var = new bsp0(str8, y2n0Var);
                }
                long j7 = j;
                tra0 N2 = ((zo10) j5g.Y(ztm0Var.t1("title", new jai(1404668476, new n2f(bsp0Var.a, i, frv0Var), true)))).N(j7);
                return ztm0Var.Q(o6j.i(j7), N2.c, jgp.b, new q66(N2, tra0Var, bsp0Var.b, 7));
        }
    }

    public /* synthetic */ p050(frv0 frv0Var, wjo0 wjo0Var, String str, int i, jai jaiVar) {
        this.e = frv0Var;
        this.f = wjo0Var;
        this.c = str;
        this.d = i;
        this.g = jaiVar;
    }
}
