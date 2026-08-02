package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze4 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ze4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        int i2 = 3;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1810437752, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.DownloadAudioBookButton.<anonymous> (AudioBookChaptersHeaderButtons.kt:306)");
                    }
                    qzu0.a.getClass();
                    pzu0.b(qzu0.L(aVar), d370.N(R.string.music_audio_books_talkback_download, 0, aVar), null, ((l5g) mtk0Var.getValue()).a, aVar, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                f15 f15Var = (f15) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1320364734, intValue2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.Component.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudiobookListContent.kt:84)");
                    }
                    f15Var.h(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                axq axqVar = (axq) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1919795878, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:96)");
                    }
                    axqVar.e(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2130623203, intValue4, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.nextPageLoadingError.<anonymous> (MusicPickerItems.kt:665)");
                    }
                    q630 j = txj0.j(158, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f));
                    vl20 a = zra0.a.a(null, null, d370.N(R.string.music_picker_error_description, 0, aVar4), null, aVar4, 196608, 27);
                    String N = d370.N(R.string.music_picker_error_retry_button, 0, aVar4);
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    boolean J = aVar4.J(izsVar);
                    Object x = aVar4.x();
                    if (J || x == c0012a) {
                        x = new gc0(izsVar, 5);
                        aVar4.R(x);
                    }
                    ldv0.d(j, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, aVar4, 28032, 12582912, 131040), null, null, aVar4, 14), null, null, false, aVar4, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                d8d0 d8d0Var = (d8d0) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1294603106, intValue5, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ProductTileSkeleton.<anonymous> (PrimaryBlockGoodsContentImpl.kt:180)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, d8d0Var.c, d8d0Var.d, false, null, aVar5, 0, 25);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                g9d0 g9d0Var = (g9d0) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue6 & 1, (intValue6 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1190169792, intValue6, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileShimmerContentImpl.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockServicesTileShimmerContentImpl.kt:40)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, g9d0Var.b, g9d0Var.c, true, null, aVar6, 3072, 17);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 6:
                gho0 gho0Var = (gho0) obj4;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                aVar7.K(1980580247);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1980580247, intValue7, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:54)");
                }
                azl azlVar = (azl) aVar7.r(uvi.h);
                Object x2 = aVar7.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(new q9x(0L));
                    aVar7.R(x2);
                }
                wh50 wh50Var = (wh50) x2;
                boolean y = aVar7.y(gho0Var);
                Object x3 = aVar7.x();
                if (y || x3 == c0012a) {
                    x3 = new u14(19, gho0Var, wh50Var);
                    aVar7.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                boolean J2 = aVar7.J(azlVar);
                Object x4 = aVar7.x();
                if (J2 || x4 == c0012a) {
                    x4 = new o6i0(i2, azlVar, wh50Var);
                    aVar7.R(x4);
                }
                tq2 tq2Var = sdi0.a;
                q630 a2 = qri.a(q630Var, a5x.a, new tp7(r4, gzsVar, (izs) x4));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return a2;
            default:
                VkTopBar vkTopBar = (VkTopBar) obj4;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                int i3 = VkTopBar.I;
                if ((intValue8 & 6) == 0) {
                    intValue8 |= aVar8.J(q630Var2) ? 4 : 2;
                }
                if (aVar8.t(intValue8 & 1, (intValue8 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(804248496, intValue8, -1, "com.vk.core.view.components.topbar.VkTopBar.ThemedContent.<anonymous> (VkTopBar.kt:156)");
                    }
                    View bottomSlot = vkTopBar.getBottomSlot();
                    if (bottomSlot == null) {
                        aVar8.K(2039416477);
                    } else {
                        aVar8.K(2039416478);
                        boolean y2 = aVar8.y(bottomSlot);
                        Object x5 = aVar8.x();
                        if (y2 || x5 == c0012a) {
                            x5 = new kcv(bottomSlot, r8 ? 1 : 0);
                            aVar8.R(x5);
                        }
                        ae2.a((intValue8 << 3) & 112, 4, aVar8, (izs) x5, null, q630Var2);
                    }
                    aVar8.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
        }
    }
}
