package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.messagetemplates.impl.keyboard.ButtonState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CreateButton.kt */
/* loaded from: classes3.dex */
public final class n6k {

    /* compiled from: CreateButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ButtonState buttonState, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-2024161142);
        if ((i & 6) == 0) {
            i2 = (M.o(buttonState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2024161142, i2, -1, "com.vk.messagetemplates.impl.keyboard.ui.CreateButton (CreateButton.kt:25)");
            }
            q630 E = ahn.E(txj0.f(q630Var, 1.0f), "templates_add_button");
            boolean z3 = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new com.vk.movika.sdk.base.logic.interactor.e(buttonState, 24);
                M.R(x);
            }
            q630 b = egi0.b(E, false, (izs) x);
            String N = d370.N(R.string.templates_create_button, 0, M);
            lg90 a2 = pg90.a(R.drawable.vk_icon_lego_add_alt_20, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int[] iArr = a.$EnumSwitchMapping$0;
            int i3 = iArr[buttonState.ordinal()];
            if (i3 == 1) {
                z = true;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            int i4 = iArr[buttonState.ordinal()];
            if (i4 == 1) {
                z2 = false;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = true;
            }
            boolean z4 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new os7(izsVar, 3);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b, null, z, false, a2, null, null, N, null, null, null, null, z2, null, null, null, aVar2, 1073745328, 0, 0, 4058464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pha(buttonState, q630Var, izsVar, i);
        }
    }
}
