package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import kotlin.NoWhenBranchMatchedException;
import xsna.lum0;
import xsna.q630;

/* compiled from: VkSubnavigationBar.kt */
/* loaded from: classes17.dex */
public final class num0 extends lum0 {
    public final tpg0 a = tpg0.a;
    public final boolean b;
    public final SubnavigationBarAppearance c;

    /* compiled from: VkSubnavigationBar.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubnavigationButtonAppearance.values().length];
            try {
                iArr[SubnavigationButtonAppearance.Inherit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubnavigationButtonAppearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubnavigationButtonAppearance.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public num0(boolean z, SubnavigationBarAppearance subnavigationBarAppearance) {
        this.b = z;
        this.c = subnavigationBarAppearance;
    }

    @Override // xsna.lum0
    public final void b(lum0.a aVar, gzs gzsVar, q630 q630Var, lg90 lg90Var, uum0 uum0Var, Integer num, androidx.compose.runtime.a aVar2, int i) {
        SubnavigationBarAppearance subnavigationBarAppearance;
        aVar2.K(-1847565922);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1847565922, i, -1, "com.vk.core.compose.component.subnavigation.SubnavigationBarScopeImpl.VkSubnavigationButtonInternal (VkSubnavigationBar.kt:133)");
        }
        boolean z = this.b;
        q630 q630Var2 = q630.a.a;
        if (z) {
            q630Var2 = this.a.b(1.0f, q630Var2, true);
        }
        q630 g = q630Var2.g(q630Var);
        aVar2.K(-829524176);
        SubnavigationButtonSize subnavigationButtonSize = aVar.a;
        SubnavigationButtonMode subnavigationButtonMode = aVar.b;
        int i2 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
        if (i2 == 1) {
            subnavigationBarAppearance = this.c;
        } else if (i2 == 2) {
            subnavigationBarAppearance = SubnavigationBarAppearance.Neutral;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            subnavigationBarAppearance = SubnavigationBarAppearance.Accent;
        }
        int i3 = i << 9;
        SubnavigationBarAppearance subnavigationBarAppearance2 = subnavigationBarAppearance;
        mnv0.a(subnavigationButtonSize, subnavigationButtonMode, subnavigationBarAppearance2, aVar.d, gzsVar, g, aVar.e, lg90Var, uum0Var, num, this.b, aVar.f, aVar2, (57344 & i3) | C.DEFAULT_MUXED_BUFFER_SIZE | ((i << 12) & 29360128) | (234881024 & i3) | (i3 & 1879048192), 0);
        aVar2.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
    }
}
