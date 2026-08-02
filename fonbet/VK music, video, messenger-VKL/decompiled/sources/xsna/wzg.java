package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.a0h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wzg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vif0 d;

    public /* synthetic */ wzg(vif0 vif0Var, boolean z, int i) {
        this.b = i;
        this.d = vif0Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        us2 s6;
        Object x;
        switch (this.b) {
            case 0:
                a0h.a aVar = (a0h.a) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1103954792, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityCreationOnboardingItem.CommunityNewOnBoardingHolder.<anonymous> (CommunityCreationOnboardingItem.kt:56)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-50162883, new xzg(aVar, this.c), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ttq0 ttq0Var = (ttq0) this.d;
                wh50 wh50Var = ttq0Var.r;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-655741546, intValue2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfilePromoBirthdayHiddenViewHolder.Content.<anonymous> (UserProfilePromoBirthdayHiddenViewHolder.kt:57)");
                    }
                    qzu0.a.getClass();
                    lg90 X = qzu0.X(aVar3);
                    Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
                    View view = ttq0Var.itemView;
                    rg50 rg50Var = ttq0Var.o;
                    Context context = view.getContext();
                    boolean z = this.c;
                    int i = R.attr.vk_ui_accent_purple;
                    com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(X, size, f870.c(krv0.m(z ? R.attr.vk_ui_accent_purple : R.attr.vk_ui_accent_raspberry_pink, context)), null, null, aVar3, 196664, 24), null, aVar3, 2);
                    if (z) {
                        int intValue3 = ((wak0) rg50Var).getIntValue();
                        ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) ((zak0) wh50Var).getValue();
                        str = extendedUserProfile != null ? extendedUserProfile.b : null;
                        s6 = new us2(ttq0Var.h6(intValue3, str != null ? str : ""));
                    } else {
                        int intValue4 = ((wak0) rg50Var).getIntValue();
                        ExtendedUserProfile extendedUserProfile2 = (ExtendedUserProfile) ((zak0) wh50Var).getValue();
                        str = extendedUserProfile2 != null ? extendedUserProfile2.b : null;
                        s6 = ttq0Var.s6(R.attr.vk_ui_accent_raspberry_pink, ttq0Var.h6(intValue4, str != null ? str : ""));
                    }
                    com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(s6, null, null, null, 0, 0, null, null, null, aVar3, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                    String g6 = ttq0Var.g6(((wak0) ttq0Var.p).getIntValue());
                    if (!z) {
                        i = R.attr.vk_ui_text_accent;
                    }
                    com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(b, Cell$Middle.c.b.a(ttq0Var.s6(i, g6), null, 0, 0, null, null, null, null, aVar3, 805306368, 510), null, null, aVar3, 196608, 28);
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar3.K(-1683274986);
                        boolean y = aVar3.y(ttq0Var);
                        x = aVar3.x();
                        if (y || x == c0012a) {
                            x = new ud5(ttq0Var, 3);
                            aVar3.R(x);
                        }
                        fcy fcyVar = (fcy) x;
                        aVar3.j();
                        wiu0.b(null, false, a, a2, null, (gzs) fcyVar, null, aVar3, 0, 83);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.K(-1683247613);
                        boolean y2 = aVar3.y(ttq0Var);
                        x = aVar3.x();
                        if (y2 || x == c0012a) {
                            x = new e27(ttq0Var, 2);
                            aVar3.R(x);
                        }
                        fcy fcyVar2 = (fcy) x;
                        aVar3.j();
                        wiu0.b(null, false, a, a2, null, (gzs) fcyVar2, null, aVar3, 0, 83);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
