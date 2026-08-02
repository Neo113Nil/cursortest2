package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.messagetemplates.impl.details.BottomBarViewState;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: TemplateDetailsBottomBar.kt */
/* loaded from: classes3.dex */
public final class j8o0 {

    /* compiled from: TemplateDetailsBottomBar.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomBarViewState.State.values().length];
            try {
                iArr[BottomBarViewState.State.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomBarViewState.State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(BottomBarViewState bottomBarViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i2;
        int i3;
        boolean z;
        BottomBarViewState.State state = bottomBarViewState.b;
        androidx.compose.runtime.a M = aVar.M(-915827822);
        int i4 = i | (M.J(bottomBarViewState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        boolean z2 = false;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-915827822, i4, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsBottomBar (TemplateDetailsBottomBar.kt:22)");
            }
            q630.a aVar3 = q630.a.a;
            q630 E = s200.E(ahn.E(txj0.f(aVar3, 1.0f), "template_save_button"), 16, 12);
            if (bottomBarViewState.a) {
                i2 = 357775559;
                i3 = R.string.template_details_action_edit;
            } else {
                i2 = 357777446;
                i3 = R.string.template_details_action_new;
            }
            String a2 = zq.a(M, i2, i3, M, 0);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int[] iArr = a.$EnumSwitchMapping$0;
            if (iArr[state.ordinal()] == 1) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            boolean z3 = iArr[state.ordinal()] == 2 ? true : z;
            boolean z4 = (i4 & 112) != 32 ? z : true;
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                x = new iyl(izsVar, 7);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, z2, false, null, null, null, a2, null, null, null, null, z3, null, null, null, aVar2, X2.b.f, 0, 0, 4058976);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ar0(i, 11, (Object) bottomBarViewState, izsVar, q630Var2);
        }
    }
}
