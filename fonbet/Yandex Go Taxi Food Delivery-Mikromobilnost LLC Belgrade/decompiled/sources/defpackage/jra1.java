package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jra1 {
    public static final void a(d611 d611Var, f530 f530Var, boolean z, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1047801370);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(d611Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.a(z) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            f530 f530Var3 = i4 != 0 ? c530.a : f530Var;
            if (z) {
                btsVar.e0(771841189);
                c(d611Var, f530Var3, btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            } else {
                btsVar.e0(771901701);
                b(d611Var, f530Var3, btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            }
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new or1(d611Var, f530Var2, z, i, i2);
        }
    }

    public static final void b(d611 d611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-318793457);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(d611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.q(c530Var, 56.0f));
            d611Var.getClass();
            xtb1.a(null, d611Var.b, null, null, btsVar, 0, 12);
            jeb1.f(d611Var.a, an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Error, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.b, btsVar, 432, 0, 16248);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kr1(d611Var, f530Var, i, 0);
        }
    }

    public static final void c(d611 d611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1128280914);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(d611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            i3 = 1;
            ptb1.b(d611Var.c, false, an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), null, true, Integer.valueOf(f1h0.ic_warning_octagon_24), null, d611Var.a, new ldc(tje.n(AppColor$Palette.Error, btsVar)), null, btsVar, 28080, 576);
            btsVar.t(true);
        } else {
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kr1(d611Var, f530Var, i, i3);
        }
    }

    public static final void d(List list, f530 f530Var, boolean z, fid fidVar, int i) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1492294458);
        int i2 = i | (btsVar.e(list) ? 4 : 2) | 384;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = !list.isEmpty();
            ldf ldfVar = ubn.a;
            w2o a = k.e(sb2.K(320, 0, ldfVar, 2), 2).a(k.d(sb2.K(320, 0, ldfVar, 2), null, 12));
            ldf ldfVar2 = ubn.c;
            g.e(z3, f530Var, a, k.f(sb2.K(200, 0, ldfVar2, 2), 2).a(k.l(sb2.K(200, 0, ldfVar2, 2), null, 12)), null, wwg.S(-1814573214, true, new lr1(list, i3), btsVar), btsVar, 196656, 16);
            z2 = true;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(list, f530Var, z2, i, 0);
        }
    }

    public static final void e(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1543844);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1);
            f530Var = c530Var;
            ButtonSize buttonSize = ButtonSize.M;
            k7d.a.getClass();
            slsVar2 = slsVar;
            vpa1.a(o, false, buttonSize, slsVar2, k7d.b, btsVar, ((i2 << 9) & 7168) | 24960, 2);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, 5);
        }
    }

    public static final void f(final int i, final int i2, fid fidVar, f530 f530Var, final List list, boolean z) {
        int i3;
        bts btsVar;
        final boolean z2;
        aii0 v;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-243548586);
        int i4 = (btsVar2.e(list) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (btsVar2.a(z) ? 256 : 128);
        }
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                f530Var = c530.a;
            }
            boolean z3 = i6 != 0 ? true : z;
            if (list.isEmpty()) {
                v = btsVar2.v();
                if (v != null) {
                    final int i7 = 0;
                    final boolean z4 = z3;
                    final f530 f530Var2 = f530Var;
                    wlsVar = new wls() { // from class: nr1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            zy11 zy11Var = zy11.a;
                            int i9 = i;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    jra1.f(vng.O(i9 | 1), i2, (fid) obj, f530Var2, list, z4);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    jra1.f(vng.O(i9 | 1), i2, (fid) obj, f530Var2, list, z4);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar2, 6);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(1708452759);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((d611) it.next(), null, z3, btsVar2, i3 & 896, 2);
            }
            btsVar2.t(false);
            btsVar2.t(true);
            btsVar = btsVar2;
            z2 = z3;
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
            z2 = z;
        }
        final f530 f530Var3 = f530Var;
        v = btsVar.v();
        if (v != null) {
            final int i8 = 1;
            wlsVar = new wls() { // from class: nr1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i8;
                    zy11 zy11Var = zy11.a;
                    int i9 = i;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            jra1.f(vng.O(i9 | 1), i2, (fid) obj, f530Var3, list, z2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            jra1.f(vng.O(i9 | 1), i2, (fid) obj, f530Var3, list, z2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final CoreShapeDrawable g(int i, int i2, String str, Context context, List list) {
        int abs = Math.abs(str.hashCode()) % scc.f(list);
        float[] d = xrb1.d(Math.min(i, i2) / 2.0f);
        CoreShapeDrawable.Companion.getClass();
        CoreShapeDrawable coreShapeDrawable = new CoreShapeDrawable(d, new RoundRectShape(d, null, null));
        Paint paint = coreShapeDrawable.getPaint();
        paint.setColor(rje.a(context, ((Number) list.get(abs)).intValue()));
        paint.setStyle(Paint.Style.FILL);
        coreShapeDrawable.setBounds(0, 0, i, i2);
        return coreShapeDrawable;
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
