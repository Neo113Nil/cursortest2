package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.p651;
import defpackage.v2w;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.photocomments.a;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes5.dex */
public abstract class o9a1 {
    public static final dy31 a = new dy31(7);
    public static final dy31 b = new dy31(8);

    public static final void a(List list, sls slsVar, sls slsVar2, fid fidVar, int i) {
        sls slsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1420045837);
        int i2 = (btsVar.e(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            slsVar3 = slsVar;
            i2 |= btsVar.e(slsVar3) ? 32 : 16;
        } else {
            slsVar3 = slsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            int i3 = i2;
            a.b(new dlb0(list, 2), PhotocommentsMode.IMMUTABLE, new rkb0(), an91.o(c530Var, 0.0f, 12.0f, 0.0f, 8.0f, 5), null, null, null, null, btsVar, 3120, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            ymb1.j(ohb1.e(btsVar, c0i0.delivery_photocomment_error_dialog_title), an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
            f530 c = ljs0.c(ljs0.e(an91.o(c530Var, 8.0f, 0.0f, 8.0f, 4.0f, 2), 56.0f), 1.0f);
            d7d.a.getClass();
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar2, c, null, 0L, 0L, null, null, null, false, null, null, null, d7d.b, btsVar, (i3 >> 6) & 14, 384, 4092);
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar3, ljs0.c(ljs0.e(an91.o(c530Var, 8.0f, 0.0f, 8.0f, 16.0f, 2), 56.0f), 1.0f), null, 0L, 0L, null, false, null, null, null, d7d.c, btsVar, (i3 >> 3) & 14, 4092);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(list, slsVar, slsVar2, i, 7);
        }
    }

    public static final void b(CharSequence charSequence, long j, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-519620551);
        int i2 = i | (btsVar2.k(charSequence) ? 32 : 16) | (btsVar2.d(j) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 byk0Var = cyk0.a;
            c530 c530Var = c530.a;
            f530 b2 = m4m0.b(c530Var, j, byk0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, b2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            qgy.b(charSequence, null, an91.l(c530Var, 6.0f, 2.0f), AppColor$Palette.EverFront, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, ((i2 >> 3) & 14) | 3456, 0, 12274);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xrf0(charSequence, j, i, 0);
        }
    }

    public static final void c(f530 f530Var, final a8a a8aVar, sls slsVar, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1049306527);
        int i2 = i | (btsVar.e(a8aVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(wlsVar) ? 2048 : 1024);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new zvr(24, slsVar);
                btsVar.o0(Q);
            }
            ydb1.a(q791.b(f530Var, null, null, false, null, new awk0(0), (sls) Q, 12), wwg.S(1518042953, true, new zls() { // from class: wrf0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var = c530.a;
                    a8a a8aVar2 = a8aVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                String str = a8aVar2.e;
                                if (str == null) {
                                    btsVar2.e0(-1987975523);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(-1987975522);
                                    v0b1.a(mja1.a(str, null, 6), ljs0.m(an91.n(c530Var, 0.0f, 8.0f, 8.0f, 8.0f), 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
                                    btsVar2.t(false);
                                }
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d = b.d(btsVar3, c530Var);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a2);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d);
                                qgy.b(a8aVar2.b, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                CharSequence charSequence = a8aVar2.c;
                                if (charSequence == null) {
                                    btsVar3.e0(521730191);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(521730192);
                                    qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(-327881682, true, new zls() { // from class: wrf0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var = c530.a;
                    a8a a8aVar2 = a8aVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                String str = a8aVar2.e;
                                if (str == null) {
                                    btsVar2.e0(-1987975523);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(-1987975522);
                                    v0b1.a(mja1.a(str, null, 6), ljs0.m(an91.n(c530Var, 0.0f, 8.0f, 8.0f, 8.0f), 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
                                    btsVar2.t(false);
                                }
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d = b.d(btsVar3, c530Var);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a2);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d);
                                qgy.b(a8aVar2.b, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                CharSequence charSequence = a8aVar2.c;
                                if (charSequence == null) {
                                    btsVar3.e0(521730191);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(521730192);
                                    qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, wwg.S(909097780, true, new y740(13, a8aVar, wlsVar), btsVar), null, SlotSize.L, true, btsVar, 14180784, 40);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(f530Var, a8aVar, slsVar, wlsVar, i, 6);
        }
    }

    public static final void d(String str) {
        qc71.b(String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
    }

    public static final f530 e(f530 f530Var, final sd2 sd2Var) {
        return f530Var.k(new lxi(sd2Var, m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("insets", p651.this);
                return zy11.a;
            }
        } : m.a(), b));
    }

    public static final f530 f(final sd2 sd2Var) {
        return new lxi(sd2Var, m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("insets", p651.this);
                return zy11.a;
            }
        } : m.a(), a);
    }
}
