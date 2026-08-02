package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.api.generated.market.dto.MarketProfileInfoLocationDto;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.OnboardingDetails;
import com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.OnboardingType;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.sync.SyncStartCause;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import xsna.a400;
import xsna.qtt0;
import xsna.so00;
import xsna.srw0;
import xsna.ugf;
import xsna.y1h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ByteStringDataSource initialize$lambda$220$lambda$26;
        int i = this.b;
        boolean z = true;
        r3 = false;
        boolean z2 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                ArrayList arrayList = (ArrayList) obj;
                accessibilityEvents.c("usersRaiseHand(" + arrayList.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.HAND_RAISED, AccessibilityEvents.Event.HAND_LOWERED, arrayList);
                break;
            case 1:
                kx5 kx5Var = (kx5) obj2;
                y400 y400Var = kx5Var.b;
                LongPollType longPollType = LongPollType.MESSAGES;
                w400 a = y400Var.a(longPollType);
                c500 c500Var = kx5Var.c;
                SyncStartCause.PUSH.getClass();
                q6o0 e = c500Var.e(longPollType);
                w2w w2wVar = kx5Var.a;
                a400 a2 = e.a(w2wVar, a.a(), (Long) obj);
                a.b(((a400.b) a2).a);
                w2wVar.K().t().b().a();
                break;
            case 2:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj2;
                int i2 = BonusCatalogFragment.f0;
                ((qdz) bonusCatalogFragment.d0.getValue()).e().a(bonusCatalogFragment.requireContext(), (String) obj);
                break;
            case 3:
                izs izsVar = (izs) obj;
                if (((BookingCalendarScreenState.TimeSlotSelector.a) obj2).c) {
                    izsVar.invoke(a.g.b);
                } else {
                    izsVar.invoke(a.f.b);
                }
                break;
            case 4:
                ((izs) obj2).invoke(new CatalogBannerView.b.C0458b(((CatalogBannerView.BannerViewState) obj).b));
                break;
            case 5:
                MarketProfileInfoLocationDto marketProfileInfoLocationDto = (MarketProfileInfoLocationDto) obj2;
                hl1 hl1Var = (hl1) obj;
                if (marketProfileInfoLocationDto != null) {
                    hl1Var.invoke(marketProfileInfoLocationDto);
                }
                break;
            case 6:
                b2d b2dVar = (b2d) obj2;
                break;
            case 7:
                ((y1h.a) obj2).q6((y1h) obj, false);
                break;
            case 8:
                xvy xvyVar = (xvy) obj2;
                yvj yvjVar = (yvj) obj;
                if (xvyVar.c()) {
                    myc0.h(yvjVar, null, null, new c1l(xvyVar, null), 3);
                } else {
                    z = false;
                }
                break;
            case 9:
                hgm hgmVar = (hgm) obj2;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_hidden_icon);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_hide_16), Integer.valueOf(R.attr.vk_ui_icon_tertiary));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setContentDescription(null);
                int i3 = hgmVar.o0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i3, i3, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                ((ViewGroup) obj).addView(vkImageSimple);
                break;
            case 10:
                ArrayList arrayList2 = (ArrayList) obj;
                StringBuilder sb = new StringBuilder("feedbackListeners: ");
                CopyOnWriteArraySet<f39> copyOnWriteArraySet = ((i6r) obj2).b;
                L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
                Iterator<f39> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().j(arrayList2);
                }
                break;
            case 11:
                break;
            case 12:
                v110 v110Var = (v110) obj2;
                Integer num = (Integer) obj;
                fhb0 fhb0Var = v110Var.m;
                a210 a210Var = v110Var.p;
                long j = (a210Var == null ? null : a210Var).b;
                if (a210Var == null) {
                    a210Var = null;
                }
                fhb0Var.a(new ro00(a210Var.c, j, num != null ? num.intValue() : 0));
                a210 a210Var2 = v110Var.p;
                fhb0Var.a(new so00.a((a210Var2 == null ? null : a210Var2).l, (a210Var2 == null ? null : a210Var2).m, (a210Var2 != null ? a210Var2 : null).n));
                break;
            case 13:
                rn90 rn90Var = (rn90) obj2;
                VKImageView vKImageView = rn90Var.p;
                vKImageView.setVisibility(0);
                rn90Var.q.setVisibility(0);
                f4m.j(rn90Var.m);
                vKImageView.setPlaceholderImage(m33.a(R.drawable.default_placeholder_6, rn90Var.itemView.getContext()));
                vKImageView.F0(m33.a(R.drawable.video_placeholder_64, rn90Var.itemView.getContext()), ImageView.ScaleType.FIT_XY);
                ImageSize Cb = ((VideoFile) obj).getImage().Cb(rn90Var.itemView.getResources().getDimensionPixelSize(R.dimen.voip_small_content_item_width), true, false);
                vKImageView.s0(Cb != null ? Cb.d.d : null);
                break;
            case 14:
                ((du90) obj2).l.b((wt90) obj);
                break;
            case 15:
                break;
            case 16:
                ProductsSelectionBottomSheet.Builder.b bVar = (ProductsSelectionBottomSheet.Builder.b) obj;
                Activity h = e3m.h(((ProductsSelectionBottomSheet) obj2).requireContext());
                ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y != null) {
                    Y.S(bVar);
                }
                break;
            case 17:
                initialize$lambda$220$lambda$26 = ServiceProvider.initialize$lambda$220$lambda$26((UnityAdsModule) obj2, (ServicesRegistry) obj);
                break;
            case 18:
                ((com.vk.newsfeed.impl.items.posting.item.modals.a) obj).a().invoke();
                s3q0 s3q0Var = s3q0.a;
                dw20 dw20Var = ((com.vk.newsfeed.impl.items.posting.item.modals.d) obj2).e;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 19:
                q7v0 q7v0Var = (q7v0) obj2;
                ytl0 ytl0Var = (ytl0) obj;
                Integer valueOf = Integer.valueOf(R.string.clips_publish_allow_auto_repost_subtitle_2);
                VkOnboardingCampaign e2 = q7v0Var.e("stories:auto_repost_clip:likes");
                if (e2 != null && q7v0Var.d(e2)) {
                    z2 = q7v0Var.b(e2, false);
                }
                Pair pair2 = z2 ? new Pair(OnboardingType.SUBTITLE, valueOf) : new Pair(OnboardingType.NONE, valueOf);
                ytl0Var.c.invoke(new ugf.g.c(new OnboardingDetails((OnboardingType) pair2.d(), ((Number) pair2.g()).intValue())));
                break;
            case 20:
                ram0 ram0Var = (ram0) obj2;
                String str = (String) obj;
                Triple h2 = ram0.h();
                if (h2 != null) {
                    ram0Var.g((Context) h2.d(), (Activity) h2.g(), str, PublishedKind.CLIP).d((Window) h2.h());
                    break;
                } else {
                    break;
                }
            case 21:
                ((izs) obj2).invoke(new AuthorHeaderEvent.Info.SubscribersClick.d((zhf0) ((wh50) obj).getValue()));
                break;
            case 22:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj2;
                videoCatalogRootVh.U.add((String) obj);
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar = videoCatalogRootVh.L0;
                aVar.b();
                aVar.c.getClass();
                if (((Boolean) aVar.a.b.invoke()).booleanValue()) {
                    aVar.h.b(TimeUnit.SECONDS.toMillis(15L));
                }
                break;
            case 23:
                ((izs) obj2).invoke(new qtt0.c(((rtt0) obj).b));
                break;
            case 24:
                VkPayFragment vkPayFragment = (VkPayFragment) obj2;
                int i4 = VkPayFragment.g0;
                ((xuv0) vkPayFragment.d0.getValue()).a(vkPayFragment.kn(), ((Intent) obj).getData());
                break;
            default:
                a3x0.p(((srw0) obj2).a, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_ALL_TO_UNMUTE_VIDEO, ((srw0.b.a) obj).a, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741682);
                break;
        }
        return s3q0.a;
    }
}
