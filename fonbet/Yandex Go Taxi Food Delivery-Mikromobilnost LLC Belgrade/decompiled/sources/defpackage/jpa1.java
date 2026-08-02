package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class jpa1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(z91 z91Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        yur yurVar2;
        tls tlsVar2;
        f530 f530Var3;
        yur yurVar3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-118619404);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(z91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                yurVar2 = yurVar;
                i3 |= btsVar.k(yurVar2) ? 256 : 128;
                if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
                }
                if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
                    f530 f530Var4 = c530.a;
                    f530 f530Var5 = i5 != 0 ? f530Var4 : f530Var2;
                    yur yurVar4 = i4 != 0 ? null : yurVar2;
                    if (yurVar4 != null) {
                        f530Var4 = hi91.d(gi91.b(f530Var4, yurVar4), false, null, 3);
                    }
                    f530 f530Var6 = f530Var4;
                    f530 c = ljs0.c(f530Var5, 1.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
                    doa1.b(z91Var.a, f530Var6, tlsVar, btsVar, (i3 >> 3) & 896, 0);
                    tlsVar2 = tlsVar;
                    g.b(uic.a, z91Var.b.f, null, k.d(null, null, 15).a(k.e(null, 3)), k.l(null, null, 15).a(k.f(null, 3)), "DestinationAddressItem", wwg.S(1892421570, true, new u5(20, z91Var, tlsVar2), btsVar), btsVar, 1797126, 2);
                    btsVar.t(true);
                    f530Var3 = f530Var5;
                    yurVar3 = yurVar4;
                } else {
                    tlsVar2 = tlsVar;
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    yurVar3 = yurVar2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new p91(z91Var, f530Var3, yurVar3, tlsVar2, i, i2, 0);
                    return;
                }
                return;
            }
            yurVar2 = yurVar;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        yurVar2 = yurVar;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(z91 z91Var, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(671410167);
        int i3 = i | (btsVar.k(z91Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i5 = i3 | (btsVar.e(tlsVar) ? 256 : 128);
        int i6 = 0;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            Object Q = btsVar.Q();
            int i7 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i7);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i7);
                btsVar.o0(Q2);
            }
            f530 f530Var3 = f530Var;
            ttb1.a(z91Var, f530Var3, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "AddressesItem", wwg.S(-66716107, true, new o91(i6, tlsVar), btsVar), btsVar, (i5 & 14) | 224640 | (i5 & 112), 0);
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(z91Var, f530Var2, tlsVar, i, i2, 2);
        }
    }

    public static final void c(z91 z91Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1021943198);
        int i2 = i | (btsVar.k(z91Var) ? 4 : 2) | 48 | (btsVar.k(yurVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            ttb1.a(z91Var, c530Var, k.q(3, null, null).a(k.d(null, null, 15)).a(k.e(null, 3)), k.v(3, null, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "AddressesItem", wwg.S(900831588, true, new n91(yurVar, tlsVar, i3), btsVar), btsVar, (i2 & 14) | 224688, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(z91Var, f530Var2, yurVar, tlsVar, i);
        }
    }

    public static final yir d(xir xirVar, zzs zzsVar, r0t r0tVar) {
        return new yir(xirVar.b(), zzsVar, xirVar.c(), Collections.singleton(r0tVar));
    }

    public static GoLinearLayout e(Context context, bts0 bts0Var, List list) {
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        goLinearLayout.setOrientation(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wik0 wik0Var = (wik0) it.next();
            SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, null, 0, ((grs0) bts0Var).a, 6, null);
            slotItemViewComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            slotItemViewComponent.render(wik0Var.c, wik0Var.e, new uz1(3));
            View asView = slotItemViewComponent.asView();
            asView.setTag(wik0Var.a);
            goLinearLayout.addView(asView);
        }
        return goLinearLayout;
    }

    public static int f(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }
}
