package defpackage;

import androidx.lifecycle.compose.a;
import com.ybsdk.core.compose.ComposeFragment;
import com.ybsdk.core.design.theme.ThemeType;

/* loaded from: classes15.dex */
public final class egd implements wls {
    public final /* synthetic */ ComposeFragment a;

    public egd(ComposeFragment composeFragment) {
        this.a = composeFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r5v22, types: [gwy0] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ThemeType themeType;
        n4u0 c;
        oz40 oz40Var;
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(1849434622);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        ComposeFragment composeFragment = this.a;
        if (Q == o430Var) {
            ?? r5 = composeFragment;
            while (true) {
                if (r5 == 0) {
                    xx60 activity = composeFragment.getActivity();
                    if (!(activity instanceof gwy0)) {
                        activity = null;
                    }
                    r5 = (gwy0) activity;
                    if (r5 == 0) {
                        r5 = 0;
                    }
                } else {
                    if (r5 instanceof gwy0) {
                        break;
                    }
                    r5 = r5.getParentFragment();
                }
            }
            Q = (gwy0) r5;
            btsVar2.o0(Q);
        }
        gwy0 gwy0Var = (gwy0) Q;
        btsVar2.t(false);
        if (gwy0Var == null || (c = gwy0Var.getThemeType()) == null) {
            ThemeType.Companion.getClass();
            themeType = ThemeType.DEFAULT_THEME_TYPE;
            c = bvf0.c(themeType);
        }
        vvf0 a = dr51.b.a((ThemeType) a.c(c, null, btsVar2, 0, 7).getValue());
        qwd qwdVar = g5z.a;
        oz40Var = composeFragment.windowInsetsState;
        sb2.c(new vvf0[]{a, qwdVar.a(oz40Var.getValue())}, wwg.S(898172163, true, new dgd(composeFragment, 1), btsVar2), btsVar2, 56);
        return zy11.a;
    }
}
