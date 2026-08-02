package com.yandex.go.information.presentation;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.information.presentation.a;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bns;
import defpackage.bts;
import defpackage.bx2;
import defpackage.c530;
import defpackage.ctq;
import defpackage.cvw;
import defpackage.cx2;
import defpackage.did;
import defpackage.evu0;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ifs;
import defpackage.j6;
import defpackage.jfs;
import defpackage.jiu;
import defpackage.jxq0;
import defpackage.kfs;
import defpackage.ljs0;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.mr1;
import defpackage.mt71;
import defpackage.mua1;
import defpackage.nxu;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.oip0;
import defpackage.ouv;
import defpackage.pw91;
import defpackage.qy20;
import defpackage.s0v;
import defpackage.sb2;
import defpackage.sls;
import defpackage.smv;
import defpackage.tls;
import defpackage.uic;
import defpackage.ur70;
import defpackage.utv;
import defpackage.vuv;
import defpackage.vuz;
import defpackage.w2o;
import defpackage.w511;
import defpackage.w8a1;
import defpackage.wg0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x7d;
import defpackage.y7m;
import defpackage.ydb1;
import defpackage.ypu;
import defpackage.yrl;
import defpackage.yx40;
import defpackage.zmo;
import defpackage.zpn;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public abstract class a {
    public static final w2o a;
    public static final w2o b = k.n(sb2.K(300, 0, null, 6), new jiu(28));
    public static final zmo c = k.s(sb2.K(300, 0, null, 6), new jiu(29));
    public static final zmo d;

    static {
        int i = 29;
        a = k.n(sb2.K(300, 0, null, 6), new ur70(i));
        d = k.s(sb2.K(300, 0, null, 6), new ur70(i));
    }

    public static final void a(j6 j6Var, tls tlsVar, fid fidVar, int i) {
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1552534284);
        int i2 = (btsVar.k(j6Var) ? 32 : 16) | i | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            o4b1.b(mt71.m(j6Var.a, 0, btsVar), null, ljs0.i(an91.o(c530Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13).k(new ypu(x4c.H)), 120.0f), null, null, 0.0f, null, btsVar, 56, 120);
            if (j6Var.b.length() > 0) {
                btsVar.e0(-953600129);
                x7d.a.getClass();
                c530Var = c530Var2;
                ydb1.a(null, x7d.d, wwg.S(-2054090016, true, new ctq(15, j6Var), btsVar), null, wwg.S(485229670, true, new wg0(18, tlsVar), btsVar), null, null, false, btsVar, 25008, 233);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                btsVar.e0(-952901482);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(j6Var, tlsVar, i, 1);
        }
    }

    public static final void b(final jxq0 jxq0Var, final tls tlsVar, fid fidVar, final int i) {
        aii0 aii0Var;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-122299606);
        int i2 = (btsVar.k(jxq0Var) ? 32 : 16) | i | (btsVar.e(tlsVar) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            String str = jxq0Var != null ? jxq0Var.e : null;
            if (str == null || evu0.J(str)) {
                String str2 = jxq0Var != null ? jxq0Var.d : null;
                if (str2 == null || evu0.J(str2)) {
                    aii0Var = btsVar.v();
                    if (aii0Var != null) {
                        wlsVar = new wls(jxq0Var, tlsVar, i, i3) { // from class: nuv
                            public final /* synthetic */ int a;
                            public final /* synthetic */ jxq0 b;
                            public final /* synthetic */ tls c;

                            {
                                this.a = i3;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = this.a;
                                zy11 zy11Var = zy11.a;
                                tls tlsVar2 = this.c;
                                jxq0 jxq0Var2 = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i5) {
                                    case 0:
                                        a.b(jxq0Var2, tlsVar2, fidVar2, vng.O(7));
                                        break;
                                    default:
                                        a.b(jxq0Var2, tlsVar2, fidVar2, vng.O(7));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        aii0Var.d = wlsVar;
                    }
                    return;
                }
            }
            c530 c530Var = c530.a;
            uic uicVar = uic.a;
            oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
            g.b(uicVar, true, null, null, null, null, wwg.S(865800018, true, new ouv(jxq0Var, tlsVar, i3), btsVar), btsVar, 1572918, 30);
        } else {
            btsVar.Y();
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            wlsVar = new wls(jxq0Var, tlsVar, i, i4) { // from class: nuv
                public final /* synthetic */ int a;
                public final /* synthetic */ jxq0 b;
                public final /* synthetic */ tls c;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = this.c;
                    jxq0 jxq0Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            a.b(jxq0Var2, tlsVar2, fidVar2, vng.O(7));
                            break;
                        default:
                            a.b(jxq0Var2, tlsVar2, fidVar2, vng.O(7));
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    public static final void c(vuv vuvVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        vuv vuvVar2;
        tls tlsVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(382023762);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(vuvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            oip0 o = pw91.o(btsVar2);
            Object[] objArr = new Object[0];
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new smv(21);
                btsVar2.o0(Q);
            }
            yx40 yx40Var = (yx40) cvw.V(objArr, (sls) Q, btsVar2, 48);
            boolean c2 = btsVar2.c(yx40Var.getIntValue());
            Object Q2 = btsVar2.Q();
            if (c2 || Q2 == o430Var) {
                Q2 = ly3.h(fwiVar.H(yx40Var.getIntValue()), btsVar2);
            }
            float f = ((y7m) Q2).a;
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            float a2 = w8a1.f(vuz.o(btsVar2).e, btsVar2).a();
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.d(new bx2(o, yx40Var, 1));
                btsVar2.o0(Q3);
            }
            m3u0 m3u0Var = (m3u0) Q3;
            utv utvVar = vuvVar.f;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q4 = btsVar2.Q();
            if (z || Q4 == o430Var) {
                Q4 = new InformationScreenKt$InformationScreen$1$1(vuvVar, tlsVar, null);
                btsVar2.o0(Q4);
            }
            zpn.e(btsVar2, (wls) Q4, utvVar);
            boolean z2 = vuvVar.g;
            w2o w2oVar = z2 ? b : a;
            zmo zmoVar = z2 ? d : c;
            cx2 cx2Var = new cx2(o, f, a2, yx40Var, m3u0Var, vuvVar, tlsVar, 2);
            vuvVar2 = vuvVar;
            tlsVar2 = tlsVar;
            btsVar = btsVar2;
            qy20.a(null, w2oVar, zmoVar, false, wwg.S(-1041594640, true, cx2Var, btsVar2), btsVar, 27648, 1);
        } else {
            vuvVar2 = vuvVar;
            tlsVar2 = tlsVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(vuvVar2, tlsVar2, i, i3);
        }
    }

    public static final void d(boolean z, List list, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        kfs ifsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1005395204);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.k(list) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                float size = SlotSize.L.getSize() * 3.0f;
                AppColor$Palette appColor$Palette = yrl.a;
                ifsVar = new jfs(size + 1.0f);
            } else {
                if (z) {
                    w511.b();
                    return;
                }
                ifsVar = new ifs(list == null ? EmptyList.a : list);
            }
            mua1.a(an91.m(c530.a, 16.0f, 0.0f, 2), ifsVar, null, aVar, btsVar, 3078, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(z, list, aVar, i, 10);
        }
    }

    public static final void e(vuv vuvVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(244049627);
        int i2 = 16;
        int i3 = (btsVar.k(vuvVar) ? 32 : 16) | i;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            g.b(uic.a, true, null, null, null, null, wwg.S(1442841859, true, new ctq(i2, vuvVar), btsVar), btsVar, 1572918, 30);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(vuvVar, i, 15);
        }
    }
}
