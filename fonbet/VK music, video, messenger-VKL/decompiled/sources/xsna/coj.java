package xsna;

import android.view.View;
import com.vkontakte.android.R;
import xsna.ik70;
import xsna.q630;
import xsna.yit0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class coj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ coj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                znj znjVar = (znj) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1425016881, intValue, -1, "com.vk.core.compose.component.menu.ContextMenuScopeImpl.item.<anonymous> (VkContextMenu.kt:916)");
                    }
                    znjVar.g(znjVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1061691197, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:110)");
                    }
                    axqVar.f(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                ((gxu) this.c).c((View) obj);
                break;
            case 3:
                String str = (String) this.c;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(spg0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(16703332, intValue3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.SettingOption.<anonymous> (NicknameContainer.kt:93)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.X;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, spg0Var.b(1.0f, q630.a.a, true), ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar3, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                ik70 ik70Var = (ik70) this.c;
                ((Integer) obj3).intValue();
                ik70Var.e.invoke(((ik70.a) obj2).a);
                ik70Var.b((View) obj);
                break;
            case 5:
                ixj ixjVar = (ixj) this.c;
                yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar = (yzs) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.y(yzsVar) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1112128010, intValue4, -1, "com.vk.core.compose.component.UserStackScopeImpl.counter.<anonymous> (VkUserStack.kt:374)");
                    }
                    ixjVar.e(yzsVar, aVar4, intValue4 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                yit0 yit0Var = (yit0) this.c;
                View view = (View) obj;
                ((Integer) obj3).getClass();
                d3b0 d3b0Var = yit0Var.d;
                int i = ((yit0.a) obj2).a;
                yit0Var.e.bk(new xit0(d3b0Var, i, i != R.id.video_subtitles_off));
                yit0Var.b(view);
                break;
        }
        return s3q0.a;
    }
}
