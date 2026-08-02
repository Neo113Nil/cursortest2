package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gd3 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                uao0 a = ((tao0) obj2).a((Context) obj3);
                if (a != null) {
                    StringBuilder b = v1v.b(str, ' ');
                    b.append(a.a);
                    break;
                }
                break;
            case 1:
                ((izs) this.c).invoke((Throwable) obj);
                break;
            case 2:
                q8d0 q8d0Var = (q8d0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1316620818, intValue, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockHeaderBaseRightActionsImpl.Content.<anonymous>.<anonymous> (PrimaryBlockHeaderBaseRightActionsImpl.kt:54)");
                }
                qzu0.a.getClass();
                q8d0Var.b(qzu0.c(aVar), null, (gzs) ((zak0) q8d0Var.c).getValue(), (SemanticsConfiguration) ((zak0) q8d0Var.e).getValue(), aVar, 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 3:
                jhk0 jhk0Var = (jhk0) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(q630Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1683038525, intValue2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.pages.<anonymous> (SpacingAndSeparatorScreenContent.kt:54)");
                    }
                    jhk0Var.b(q630Var, aVar2, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                b78.g gVar = (b78.g) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.l(booleanValue) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(317053187, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.MusicButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:521)");
                    }
                    q630.a aVar4 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar3.K(698467613);
                        q630 E = ahn.E(aVar4, "nextBtn");
                        qzu0.a.getClass();
                        lg90 o1 = qzu0.o1(aVar3);
                        String N = d370.N(R.string.music_talkback_player_go_forward, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J = aVar3.J(gVar);
                        Object x = aVar3.x();
                        if (J || x == c0012a) {
                            x = new rqs0(gVar, 4);
                            aVar3.R(x);
                        }
                        nzu0.c((gzs) x, o1, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar3, 3136, 2000);
                        aVar3.j();
                    } else {
                        aVar3.K(698982802);
                        q630 E2 = ahn.E(aVar4, "closeBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b2 = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N2 = d370.N(R.string.ui_accessibility_close, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().l;
                        boolean J2 = aVar3.J(gVar);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new sgt0(gVar, 2);
                            aVar3.R(x2);
                        }
                        nzu0.c((gzs) x2, b2, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar3, 3136, 2000);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
