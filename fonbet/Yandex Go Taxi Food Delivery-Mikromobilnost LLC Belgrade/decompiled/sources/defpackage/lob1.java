package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public abstract class lob1 {
    public static final void a(final f530 f530Var, final wls wlsVar, to5 to5Var, final wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, final float f, fid fidVar, final int i) {
        final to5 to5Var4;
        final to5 to5Var5;
        final wls wlsVar4;
        final to5 to5Var6;
        wp2 up2Var;
        to5 to5Var7 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1524787);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | 1794432 | (btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            w5d.a.getClass();
            a aVar = w5d.b;
            boolean k = btsVar.k(ty2.a(btsVar));
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = eic.a;
                btsVar.o0(Q);
            }
            dic dicVar = (dic) Q;
            oz40 n = f.n(Float.valueOf(f), btsVar);
            if (f <= 0.0f) {
                btsVar.e0(-1465301612);
                btsVar.t(false);
                up2Var = dicVar.a;
            } else if (f >= 1.0f) {
                btsVar.e0(-1465300292);
                btsVar.t(false);
                up2Var = dicVar.b;
            } else {
                btsVar.e0(-1465295391);
                long L = rzo.L(tje.n(dicVar.a, btsVar), f, tje.n(dicVar.b, btsVar));
                int i3 = up2.c;
                btsVar.t(false);
                up2Var = new up2(L);
            }
            k2z.a(up2Var, dicVar.c, wwg.S(668593757, true, new b0(dicVar, n, f530Var, wlsVar, wlsVar2, aVar), btsVar), btsVar, 384);
            to5Var4 = to5Var7;
            to5Var5 = to5Var4;
            to5Var6 = to5Var5;
            wlsVar4 = aVar;
        } else {
            btsVar.Y();
            to5Var4 = to5Var;
            to5Var5 = to5Var2;
            wlsVar4 = wlsVar3;
            to5Var6 = to5Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(wlsVar, to5Var4, wlsVar2, to5Var5, wlsVar4, to5Var6, f, i) { // from class: bic
                public final /* synthetic */ float A;
                public final /* synthetic */ wls b;
                public final /* synthetic */ to5 c;
                public final /* synthetic */ wls w;
                public final /* synthetic */ to5 x;
                public final /* synthetic */ wls y;
                public final /* synthetic */ to5 z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(3121);
                    lob1.a(f530.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tje.u(56, frameLayout.getContext()), tje.u(56, frameLayout.getContext()));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
    }

    public static final void c(ListItemComponent listItemComponent, int i) {
        bdc bdcVar = new bdc(xng0.textMain);
        listItemComponent.setTitleTextColor(bdcVar);
        listItemComponent.setTitleTypeface(i);
        listItemComponent.setSubtitleTextColor(bdcVar);
        listItemComponent.setSubtitleTypeface(i);
        listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static final void d(ListItemComponent listItemComponent) {
        listItemComponent.setMinHeight(tje.r(mrg0.list_item_component_size_XS, listItemComponent.getContext()));
    }

    public static final void e(ListItemComponent listItemComponent) {
        nzs.s(listItemComponent, -1, -2);
        listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
        listItemComponent.setTitleTextColor(new bdc(xng0.textMinor));
        listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
    }

    public static final boolean f(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ung0.ybsdk_is_dark_theme, typedValue, true);
        return typedValue.data != 0;
    }

    public static final eiy g(k911 k911Var) {
        if (k911Var instanceof i911) {
            return new ciy(((i911) k911Var).a);
        }
        if (k911Var instanceof h911) {
            return new ciy(((h911) k911Var).a);
        }
        if (jl40.l(k911Var, f911.a)) {
            return yhy.a;
        }
        if (jl40.l(k911Var, g911.a) || jl40.l(k911Var, j911.a)) {
            return aiy.a;
        }
        w511.b();
        return null;
    }
}
