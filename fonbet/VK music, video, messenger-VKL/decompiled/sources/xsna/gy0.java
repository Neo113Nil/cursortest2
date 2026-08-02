package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.authorpage.ui.ArticleAuthorPageRecyclerPaginatedView;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import java.util.ArrayList;
import java.util.List;
import xsna.bsb;
import xsna.dzc;
import xsna.h7u0;
import xsna.p16;
import xsna.x3b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gy0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        ChatInviteFragment.b bVar;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                return com.vk.clips.sdk.shared.item.ads.c.k((com.vk.clips.sdk.shared.item.ads.c) obj);
            case 1:
                d12 d12Var = (d12) obj;
                wh50 wh50Var = d12Var.l;
                wh50 wh50Var2 = d12Var.g;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) d12Var.j).getFloatValue();
                return !Float.isNaN(floatValue) ? d12Var.c(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((zak0) wh50Var2).getValue()) : ((zak0) wh50Var2).getValue();
            case 2:
                return Boolean.valueOf(!((Boolean) ((on2) obj).b.getValue()).booleanValue());
            case 3:
                Context context = ((dh3) obj).a;
                return Boolean.FALSE;
            case 4:
                int i2 = ArticleAuthorPageRecyclerPaginatedView.Q;
                ((VkErrorView) obj).a();
                return s3q0.a;
            case 5:
                return (AvatarView) ((aw3) obj).b.findViewById(R.id.avatar_icon);
            case 6:
                return ((VkOnboardingComponent) m7m.d((iq5) obj).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 7:
                bp50 bp50Var = new bp50();
                p16.a aVar = new p16.a((p16) obj);
                bp50Var.e = true;
                bp50Var.d = aVar;
                return bp50Var;
            case 8:
                lm6 lm6Var = (lm6) obj;
                return lm6Var.b.a(new irh0(false, false, 239), lm6Var.c.c.copy());
            case 9:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.settings.g) obj).f.b(f.b.a);
                return s3q0.a;
            case 10:
                BonusCatalogFragment bonusCatalogFragment = ((fk7) obj).l;
                bonusCatalogFragment.getClass();
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(bonusCatalogFragment.requireContext());
                c.g0(R.string.stickers_bonus_catalog_leave_dialog_title);
                c.U(R.string.stickers_bonus_catalog_leave_dialog_message);
                c.c0(R.string.stickers_bonus_catalog_leave_dialog_refuse, new com.vk.stickers.bonus.catalog.a(bonusCatalogFragment, r2));
                c.W(R.string.cancel, null);
                c.m();
                return s3q0.a;
            case 11:
                return new mca(((lca) obj).g.b.L.getValue());
            case 12:
                CatalogViewHolder catalogViewHolder = ((zha) obj).b;
                if (!(catalogViewHolder instanceof HorizontalListVh)) {
                    if (catalogViewHolder instanceof CatalogBasePaginatedListVh) {
                        return new u060(((CatalogBasePaginatedListVh) catalogViewHolder).j);
                    }
                    return null;
                }
                HorizontalListVh horizontalListVh = (HorizontalListVh) catalogViewHolder;
                y1a y1aVar = horizontalListVh.p;
                lca lcaVar = horizontalListVh.j;
                UIBlockList uIBlockList = y1aVar.k;
                CatalogViewType catalogViewType = (uIBlockList == null || (arrayList = uIBlockList.y) == null || (uIBlock = (UIBlock) j5g.a0(arrayList)) == null) ? null : uIBlock.d;
                CatalogViewType catalogViewType2 = CatalogViewType.FLOOR_CLIPS;
                if ((catalogViewType != catalogViewType2 && catalogViewType != CatalogViewType.CAROUSEL_CLIPS && catalogViewType != CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS && catalogViewType != CatalogViewType.SEARCH_FLOOR_CLIPS && catalogViewType != CatalogViewType.SEARCH_CAROUSEL_CLIPS) || !fxc0.B().J().b2()) {
                    return new u060(lcaVar);
                }
                hbt0 hbt0Var = horizontalListVh.v;
                if (hbt0Var == null) {
                    return null;
                }
                if (catalogViewType != catalogViewType2 && catalogViewType != CatalogViewType.SEARCH_FLOOR_CLIPS) {
                    z = false;
                }
                RecyclerPaginatedView recyclerPaginatedView = horizontalListVh.n;
                return new wli0((recyclerPaginatedView != null ? recyclerPaginatedView : null).getRecyclerView(), lcaVar, hbt0Var, z);
            case 13:
                ((k4b) obj).d.invoke(x3b.c.b);
                return s3q0.a;
            case 14:
                int i4 = ChannelProfileFragment.e0;
                return new bzb0(((ChannelProfileFragment) obj).requireContext());
            case 15:
                smb smbVar = (smb) obj;
                smbVar.f.k().z(smbVar.b, smbVar.g);
                return s3q0.a;
            case 16:
                return (FragmentImpl) ((Fragment) obj);
            case 17:
                bsb.b bVar2 = ((isb) obj).p;
                if (bVar2 != null && (bVar = bsb.this.o) != null) {
                    bVar.b();
                }
                return s3q0.a;
            case 18:
                int i5 = ClipFeedListFragment.a2;
                return (ClipsInterestsComponent) m7m.d((ClipFeedListFragment) obj).a(fpf0.a(ClipsInterestsComponent.class));
            case 19:
                return new dzc.g((dzc) obj);
            case 20:
                ((w2d) obj).b.a(i5d.b);
                return s3q0.a;
            case 21:
                dw20 dw20Var = ((iqd) obj).d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 22:
                rwi.d().h().d(982, ((axd) obj).a.a, new v7(18));
                return s3q0.a;
            case 23:
                bzd bzdVar = (bzd) obj;
                return new eyd(bzdVar.n, bzdVar.c.getStickersInteractor(), bzdVar.p, bzdVar.q, bzdVar.e);
            case 24:
                return new i4l0(((q0e) obj).e);
            case 25:
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a = ((roe) obj).a();
                aVar2.getClass();
                if (a != null) {
                    return (SearchStatsLoggingInfo) a.getParcelable("search_stats_logging_info");
                }
                return null;
            case 26:
                qcy<Object>[] qcyVarArr = ClipsPublishViewerOverlayFragment.T;
                return Boolean.valueOf(((ClipPreviewInputParams) ((ClipsPublishViewerOverlayFragment) obj).R.getValue()).f);
            case 27:
                iff iffVar = (iff) obj;
                return iffVar.c().k() ? new vlf(((ClipsUploadSdkUploaderComponent) iffVar.l.getValue()).Zb(), iffVar.k().v9()) : new wlf(iffVar.k().Uc());
            case 28:
                int i6 = ClipsWrapperFragment.Q0;
                return ((BridgeComponent) m7m.d((ClipsWrapperFragment) obj).a(fpf0.a(BridgeComponent.class))).x().e();
            default:
                ClipsWrapperInputArguments.a aVar3 = ClipsWrapperInputArguments.r;
                Bundle a2 = ((ClipsWrapperInputArguments) obj).a();
                aVar3.getClass();
                List c2 = ClipsWrapperInputArguments.a.c(a2);
                int b = ClipsWrapperInputArguments.a.b(c2, a2);
                Parcelable parcelable = (ClipFeedTab) j5g.b0(b >= 0 ? b : 0, c2);
                ClipFeedTab.WithPayload withPayload = parcelable instanceof ClipFeedTab.WithPayload ? (ClipFeedTab.WithPayload) parcelable : null;
                if (withPayload != null) {
                    return withPayload.getPayload();
                }
                return null;
        }
    }
}
