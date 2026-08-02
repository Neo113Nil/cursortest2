package xsna;

import android.view.View;
import com.vk.profile.core.tabs.ui.clips.Clips;
import xsna.ebt;
import xsna.q630;
import xsna.r2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class uq5 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uq5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(spg0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-490628903, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.SettingOption.<anonymous> (AvatarContainer.kt:127)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.X;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, spg0Var.b(1.0f, q630.a.a, true), ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                yp8 yp8Var = (yp8) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1184668094, intValue2, -1, "com.vk.core.tool.compose.onboarding.ButtonImpl.Content.<anonymous> (ButtonImpl.kt:49)");
                    }
                    yqv0.a((String) ((zak0) yp8Var.a).getValue(), null, 0L, 0L, null, u4s.b, 0L, 0, 0L, null, 0, false, 0, 0, null, null, aVar2, 0, 0, 1048510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                Clips clips = (Clips) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1270329597, intValue3, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsViewHolder.setupShimmers.<anonymous>.<anonymous>.<anonymous> (CommunityProfileContentClipsViewHolder.kt:272)");
                    }
                    ngh.b(clips.l, null, 0, 0, 0L, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                ebt ebtVar = (ebt) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-209727053, intValue4, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:66)");
                    }
                    lft.a(((ebt.e) ebtVar).a, null, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                r2s0 r2s0Var = (r2s0) this.c;
                ((Integer) obj3).getClass();
                r2s0Var.e.bk(new r3t0(r2s0Var.d, ((r2s0.a) obj2).a));
                r2s0Var.b((View) obj);
                break;
        }
        return s3q0.a;
    }
}
