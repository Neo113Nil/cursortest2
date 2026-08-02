package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.psn0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t26 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t26(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        sg50 sg50Var;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(colVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(665978706, intValue, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Content.<anonymous>.<anonymous> (BannerScreenContent.kt:89)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i = intValue;
                        z = true;
                    } else {
                        i = intValue;
                        z = false;
                    }
                    Object x = aVar.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new a36(0, wh50Var);
                        aVar.R(x);
                    }
                    int i2 = ((i << 21) & 29360128) | 48;
                    colVar.c(z, (gzs) x, null, psn0.a.C3529a.a("Banner", aVar), null, null, null, aVar, i2, 116);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar.x();
                    if (x2 == obj4) {
                        x2 = new c36(0, wh50Var);
                        aVar.R(x2);
                    }
                    colVar.c(z2, (gzs) x2, null, psn0.a.C3529a.a("Notification", aVar), null, null, null, aVar, i2, 116);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                gzs gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-756081143);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-756081143, intValue2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:144)");
                }
                buw buwVar = (buw) aVar2.r(cuw.a);
                if (buwVar instanceof guw) {
                    aVar2.K(-1604682242);
                    aVar2.j();
                    sg50Var = null;
                } else {
                    aVar2.K(-1604549624);
                    Object x3 = aVar2.x();
                    if (x3 == a.C0011a.a) {
                        x3 = ir.h(aVar2);
                    }
                    sg50Var = (sg50) x3;
                    aVar2.j();
                }
                q630 a = ojc.a(q630.a.a, sg50Var, buwVar, true, null, null, gzsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                break;
            case 2:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1642646876, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:120)");
                    }
                    v0rVar.g(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                o8d0 o8d0Var = (o8d0) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-997553846, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsShimmerContentImpl.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsShimmerContentImpl.kt:40)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, o8d0Var.c, o8d0Var.d, false, null, aVar4, 0, 25);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 4:
                jhk0 jhk0Var = (jhk0) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar5.J(q630Var) ? 4 : 2;
                }
                if (aVar5.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(588429220, intValue5, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.pages.<anonymous> (SpacingAndSeparatorScreenContent.kt:48)");
                    }
                    jhk0Var.c(q630Var, aVar5, intValue5 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                b78.g gVar = (b78.g) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= aVar6.l(booleanValue) ? 4 : 2;
                }
                if (aVar6.t(intValue6 & 1, (intValue6 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1469986842, intValue6, -1, "com.vk.music.stickyplayer.presentation.components.MusicButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:483)");
                    }
                    q630.a aVar7 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar6.K(891520427);
                        q630 E = ahn.E(aVar7, "deleteFromMyMusicBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                        }
                        lg90 a2 = pg90.a(R.drawable.vk_icon_done_24, 0, aVar6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N = d370.N(R.string.music_talkback_player_remove_track_from_favorite, 0, aVar6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J = aVar6.J(gVar);
                        Object x4 = aVar6.x();
                        if (J || x4 == c0012a) {
                            x4 = new uhs0(gVar, 7);
                            aVar6.R(x4);
                        }
                        nzu0.c((gzs) x4, a2, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar6, 3136, 2000);
                        aVar6.j();
                    } else {
                        aVar6.K(892253143);
                        q630 E2 = ahn.E(aVar7, "addToMyMusicBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                        }
                        lg90 b = or.b(aVar6, -1058716730, R.drawable.vk_icon_add_24, aVar6, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N2 = d370.N(R.string.music_talkback_player_add_track_to_favorite, 0, aVar6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().a;
                        boolean J2 = aVar6.J(gVar);
                        Object x5 = aVar6.x();
                        if (J2 || x5 == c0012a) {
                            x5 = new afl0(gVar, 24);
                            aVar6.R(x5);
                        }
                        nzu0.c((gzs) x5, b, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar6, 3136, 2000);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
        }
        return s3q0.a;
    }
}
