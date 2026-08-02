package xsna;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.MediaUtils;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a86 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StoryEntry storyEntry;
        UserProfile userProfile;
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                u440 u440Var = (u440) obj3;
                float floatValue = ((Float) obj).floatValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                tam0 tam0Var = u440Var.B0;
                if (tam0Var == null || !tam0Var.g) {
                    if (tam0Var == null || !tam0Var.f()) {
                        if (u440Var.d8()) {
                            u440Var.r0.getClass();
                            com.vk.stories.b.a.getClass();
                            break;
                        } else {
                            com.vk.stories.b.a.getClass();
                            break;
                        }
                    } else {
                        u440Var.s0.getClass();
                        com.vk.stories.b.a.getClass();
                        MediaUtils.d h = com.vk.stories.b.h(floatValue, 1080, 1920);
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"CameraPhotoDelegate", "PublishSize for aspectRatio: " + floatValue + " = " + h});
                        }
                        break;
                    }
                } else {
                    bh9 bh9Var = u440Var.t0;
                    if (((Boolean) bh9Var.d.invoke()).booleanValue() || ((storyEntry = (StoryEntry) bh9Var.c.invoke()) != null && storyEntry.Tb())) {
                        com.vk.stories.b.a.getClass();
                        break;
                    } else {
                        com.vk.stories.b.a.getClass();
                        break;
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((o48) obj3).d(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                CatalogMviVh catalogMviVh = (CatalogMviVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-769728075, intValue, -1, "com.vk.catalog2.common.ui.holders.CatalogMviVh.createView.<anonymous>.<anonymous>.<anonymous> (CatalogMviVh.kt:74)");
                    }
                    e8a e8aVar = catalogMviVh.f;
                    if (e8aVar == null) {
                        aVar2.K(-138659933);
                    } else {
                        aVar2.K(-974304226);
                        e8aVar.a(0, aVar2);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.k((ImageView) obj, true, ((uzo0) obj3).b, false, false, 40);
                break;
            case 4:
                fxv0.a().a(new hvv0(((Long) obj).longValue(), (String) obj2, new pxv0((VkUiUploadFailureType) obj3)));
                break;
            case 5:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(143141336, intValue2, -1, "com.vk.music.screens.about.CommunityProfileLinksScreen.<anonymous>.<anonymous> (CommunityProfileLinksComponent.kt:38)");
                    }
                    pqh.c(0, aVar3, d370.N(R.string.community_profile_links_screen_title, 0, aVar3), izsVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 6:
                v0o v0oVar = (v0o) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1926062765, intValue3, -1, "com.vk.profile.community.impl.ui.donut.modalhint.DonutModalHintContent.<anonymous> (DonutModalHintContent.kt:27)");
                    }
                    lg90 l2 = fwu0.l(v0oVar.a, null, null, null, aVar4, 0, 62);
                    String str = v0oVar.b;
                    float f = 32;
                    ldv0.d(s200.H(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), cvk.p(phw.a.a(l2, null, null, null, str != null ? com.vk.core.compose.component.semantics.b.a(null, new tmg(str, r8 ? 1 : 0), 3) : null, aVar4, 196616, 14), 56, kpv.a.a(pg90.a(R.drawable.vk_icon_donut_color_16, 0, aVar4), l5g.k, 0L, null, true, null, null, aVar4, 100859960, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), null, null, aVar4, 196608, 24), zra0.a.a(v0oVar.c, null, v0oVar.d, null, aVar4, 196608, 26), null, null, null, false, aVar4, 1572870, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 7:
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((rmp) obj3).a.e(floatValue2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.d0) obj3).a(tpg0.a, aVar, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((co20) obj3).e(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.b.a((a.C0461a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                String str2 = (String) obj2;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                Fragment parentFragment = ((NewsfeedCustomFragment2) obj3).getParentFragment();
                hes hesVar = parentFragment instanceof hes ? (hes) parentFragment : null;
                if (hesVar != null) {
                    hesVar.m(str2);
                }
                break;
            case 12:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((NewsfeedSearchFragment) obj3).e0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((yl70) obj3).C(ne7.I(71), (androidx.compose.runtime.a) obj);
                break;
            case 14:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i2 = ProductsSelectionBottomSheet.u1;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-874414618, intValue4, -1, "com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet.configureErrorStateView.<anonymous> (ProductsSelectionBottomSheet.kt:272)");
                    }
                    if (productsSelectionBottomSheet.l1) {
                        aVar5.K(-709193087);
                        rrv0.e(true, null, null, null, null, null, kai.c(-1138654040, new cv4(productsSelectionBottomSheet, 8), aVar5), aVar5, 1572870, 62);
                        aVar5.j();
                    } else {
                        aVar5.K(-708938980);
                        rrv0.d(null, null, null, null, kai.c(262802109, new w61(productsSelectionBottomSheet, 11), aVar5), aVar5, 24576, 15);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 15:
                h0b h0bVar = (h0b) obj3;
                int i3 = ((hgm0) obj2).c;
                List<cgm0> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (cgm0 cgm0Var : list) {
                    jgz jgzVar = (jgz) h0bVar.d;
                    bgm0 bgm0Var = cgm0Var.e;
                    jgzVar.getClass();
                    dgm0 dgm0Var = bgm0Var.f;
                    if (dgm0Var != null) {
                        UserProfile userProfile2 = new UserProfile();
                        userProfile2.c = dgm0Var.a;
                        userProfile2.e = dgm0Var.b;
                        userProfile2.d = dgm0Var.c;
                        userProfile2.O = dgm0Var.d;
                        userProfile2.g = dgm0Var.e;
                        String str3 = dgm0Var.g;
                        Bundle bundle = userProfile2.s;
                        bundle.putString("first_name_gen", str3);
                        bundle.putString("name_acc", dgm0Var.h);
                        userProfile2.a0(dgm0Var.f);
                        userProfile = userProfile2;
                    } else {
                        userProfile = null;
                    }
                    arrayList.add(new StoryQuestionEntry(bgm0Var.a, bgm0Var.b, bgm0Var.c, bgm0Var.d, bgm0Var.e, userProfile, bgm0Var.g, bgm0Var.h, bgm0Var.i));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(i3);
                vKList.l(vKList.size() < i3);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((hrq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((u4a) obj3).b.e.b(new oyp0((UIBlockList) obj, (CatalogExtendedData) obj2), false);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a86(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
