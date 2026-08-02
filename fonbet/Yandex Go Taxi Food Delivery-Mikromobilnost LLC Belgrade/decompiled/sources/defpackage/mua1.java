package defpackage;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class mua1 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, final kfs kfsVar, zls zlsVar, final a aVar, fid fidVar, final int i, final int i2) {
        zls zlsVar2;
        f530 f530Var2;
        kfs kfsVar2;
        a aVar2;
        final zls zlsVar3;
        aii0 v;
        wls wlsVar;
        final zls zlsVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1711437581);
        int i3 = (i & 6) == 0 ? (btsVar.k(f530Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? btsVar.k(kfsVar) : btsVar.e(kfsVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            zlsVar2 = zlsVar;
            i3 |= btsVar.e(zlsVar2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(aVar) ? 2048 : 1024;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                f530Var2 = f530Var;
                kfsVar2 = kfsVar;
                aVar2 = aVar;
                btsVar.Y();
                zlsVar3 = zlsVar2;
            } else {
                if (i4 != 0) {
                    o7d.a.getClass();
                    zlsVar4 = o7d.b;
                } else {
                    zlsVar4 = zlsVar2;
                }
                boolean z = kfsVar instanceof ifs;
                if (z && ((ifs) kfsVar).a.isEmpty()) {
                    v = btsVar.v();
                    if (v != null) {
                        final int i5 = 0;
                        wlsVar = new wls() { // from class: res
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                switch (i6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i7 | 1);
                                        mua1.a(f530Var, kfsVar, zlsVar4, aVar, (fid) obj, O, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int O2 = vng.O(i7 | 1);
                                        mua1.a(f530Var, kfsVar, zlsVar4, aVar, (fid) obj, O2, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v.d = wlsVar;
                        return;
                    }
                    return;
                }
                f530Var2 = f530Var;
                kfsVar2 = kfsVar;
                zls zlsVar5 = zlsVar4;
                aVar2 = aVar;
                boolean k = btsVar.k(ty2.a(btsVar));
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = mfs.a;
                    btsVar.o0(Q);
                }
                lfs lfsVar = (lfs) Q;
                lfsVar.getClass();
                f530 u = ljs0.u(ljs0.c(ooc.d(bzk0.c(ymb1.l(f530Var2, cyk0.c(16.0f)), lfsVar.a, qke.q), null, 3), 1.0f), null, 3);
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, u);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                if (kfsVar2 instanceof jfs) {
                    btsVar.e0(-304225630);
                    com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530.a, 1.0f), ((jfs) kfsVar2).a), cyk0.c(0.0f), false, null, AppColor$Palette.BgMinor, AppColor$Palette.Background, false, btsVar, 1769472, 156);
                    btsVar.t(false);
                } else {
                    if (!z) {
                        throw unr0.y(-2088025023, btsVar, false);
                    }
                    btsVar.e0(-303940678);
                    int i6 = 0;
                    for (Object obj : ((ifs) kfsVar2).a) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            scc.m();
                            throw null;
                        }
                        if (i6 > 0) {
                            btsVar.e0(1139994517);
                            zlsVar5.invoke(obj, btsVar, Integer.valueOf((i3 >> 3) & 112));
                            btsVar.t(false);
                        } else {
                            btsVar.e0(1140038723);
                            btsVar.t(false);
                        }
                        aVar2.invoke(uic.a, obj, btsVar, Integer.valueOf(((i3 >> 3) & 896) | 6));
                        i6 = i7;
                    }
                    btsVar.t(false);
                }
                btsVar.t(true);
                zlsVar3 = zlsVar5;
            }
            v = btsVar.v();
            if (v == null) {
                final int i8 = 1;
                final f530 f530Var3 = f530Var2;
                final kfs kfsVar3 = kfsVar2;
                final a aVar3 = aVar2;
                wlsVar = new wls() { // from class: res
                    @Override // defpackage.wls
                    public final Object invoke(Object obj2, Object obj22) {
                        int i62 = i8;
                        zy11 zy11Var = zy11.a;
                        int i72 = i;
                        switch (i62) {
                            case 0:
                                ((Integer) obj22).getClass();
                                int O = vng.O(i72 | 1);
                                mua1.a(f530Var3, kfsVar3, zlsVar3, aVar3, (fid) obj2, O, i2);
                                break;
                            default:
                                ((Integer) obj22).getClass();
                                int O2 = vng.O(i72 | 1);
                                mua1.a(f530Var3, kfsVar3, zlsVar3, aVar3, (fid) obj2, O2, i2);
                                break;
                        }
                        return zy11Var;
                    }
                };
                v.d = wlsVar;
                return;
            }
            return;
        }
        zlsVar2 = zlsVar;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(ibp0 ibp0Var, nvi0 nvi0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-655679141);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(nvi0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            if (nvi0Var == null) {
                btsVar.e0(1252540838);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            } else {
                btsVar.e0(1252541706);
                tdb1.d(ibp0Var, nvi0Var, an91.k(ljs0.m(c530Var, ibp0Var.c().getSize()), 12.0f), null, null, null, 0.0f, 0, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD, 508);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(ibp0Var, nvi0Var, i, 25);
        }
    }

    public static final void c(String str, nvi0 nvi0Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        nvi0 nvi0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-999205112);
        int i4 = i | (btsVar.k(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (btsVar.k(nvi0Var) ? 32 : 16);
        }
        int i6 = i3 | (btsVar.e(slsVar) ? 256 : 128);
        int i7 = 0;
        if (btsVar.V(i6 & 1, (i6 & 147) != 146)) {
            nvi0 nvi0Var3 = i5 != 0 ? null : nvi0Var;
            ydb1.a(q791.d(c530.a, false, null, new awk0(0), slsVar, 11), wwg.S(-535432270, true, new ses(nvi0Var3, i7), btsVar), wwg.S(1284454935, true, new le(str, 26), btsVar), null, na01.a, null, null, false, btsVar, 432, 232);
            nvi0Var2 = nvi0Var3;
        } else {
            btsVar.Y();
            nvi0Var2 = nvi0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(str, nvi0Var2, slsVar, i, i2);
        }
    }

    public static final MotionEvent d(bsv bsvVar) {
        return ((y92) bsvVar).c;
    }

    public static final int e(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            ny61.g("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                        if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static void f(com.yandex.fintechsdk.core.navigation.impl.api.router.a aVar, String str, gbr gbrVar, int i) {
        Map f = kotlin.collections.b.f();
        if ((i & 4) != 0) {
            gbrVar = null;
        }
        aVar.getClass();
        aVar.b(new wfl0(str, f, gbrVar));
    }

    public static void g(int i, int i2) {
        String d;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                d = sua1.d("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(unr0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                d = sua1.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(d);
        }
    }

    public static void h(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? i(i, i3, "start index") : (i2 < 0 || i2 > i3) ? i(i2, i3, "end index") : sua1.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String i(int i, int i2, String str) {
        if (i < 0) {
            return sua1.d("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return sua1.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(unr0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
