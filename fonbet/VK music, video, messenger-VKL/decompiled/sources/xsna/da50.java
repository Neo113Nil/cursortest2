package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.a;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.feed.blacklist.api.di.BlacklistComponent;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stories.StorySettingsActivity;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import xsna.c090;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class da50 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        UserId userId;
        AndroidOmInteraction initialize$lambda$220$lambda$159;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((MusicTrack.AssistantData) obj).e;
                if (str != null) {
                    return new JSONObject(str);
                }
                return null;
            case 1:
                qcy<Object>[] qcyVarArr = MyTargetComponentImpl.f;
                nwy nwyVar = ((MyTargetComponentImpl) obj).a;
                qcy<Object> qcyVar = MyTargetComponentImpl.f[0];
                zix zixVar = (zix) nwyVar.c();
                if (zixVar != null) {
                    return zixVar.b();
                }
                return null;
            case 2:
                mo60 mo60Var = (mo60) obj;
                ib60 ib60Var = new ib60();
                p170 p170Var = new p170(ib60Var);
                mbs mbsVar = mo60Var.b;
                dui duiVar = (dui) mo60Var.T.getValue();
                a4r a4rVar = mo60Var.n;
                bpn0 bpn0Var = mo60Var.F;
                ua4 a = ((AudienceResearchComponent) bpn0Var.getValue()).y7().a();
                ua4 b = ((AudienceResearchComponent) bpn0Var.getValue()).y7().b();
                CoreFeatures coreFeatures = CoreFeatures.ADAPTIVE_FEED_MEDIA;
                coreFeatures.getClass();
                return new o170(mbsVar, ib60Var, p170Var, duiVar, a4rVar, a, b, com.vk.toggle.b.A.a(coreFeatures), mo60Var.c);
            case 3:
                return new uu0(((AttachmentMappersComponent) ((NewsfeedMappersComponentImpl) obj).b.getValue()).g4());
            case 4:
                return ((StoriesComponent) ((j070) obj).j.getValue()).bf();
            case 5:
                ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj).d = false;
                return s3q0.a;
            case 6:
                c090.a.C2632a c2632a = (c090.a.C2632a) obj;
                jo3 jo3Var = c2632a.q;
                MarketFavable marketFavable = ((a090) c2632a.m).b;
                int absoluteAdapterPosition = c2632a.getAbsoluteAdapterPosition();
                e090 e090Var = c2632a.n;
                if (e090Var == null || (commonMarketStat$TypeRefSource = e090Var.d) == null) {
                    commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.OTHER_ITEMS;
                }
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = commonMarketStat$TypeRefSource;
                MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = e090Var != null ? e090Var.b : null;
                GoodFragment goodFragment = (GoodFragment) jo3Var.c;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                com.vk.ecomm.market.good.a aVar = (com.vk.ecomm.market.good.a) goodFragment.Po().a.s0.getValue();
                cxo Po = goodFragment.Po();
                Context requireContext = goodFragment.requireContext();
                Bundle arguments = goodFragment.getArguments();
                String string = arguments != null ? arguments.getString("access_key") : null;
                Integer valueOf = Integer.valueOf(absoluteAdapterPosition);
                Good good = goodFragment.Po().r;
                Integer valueOf2 = good != null ? Integer.valueOf((int) good.b) : null;
                Good good2 = goodFragment.Po().r;
                Long valueOf3 = (good2 == null || (userId = good2.c) == null) ? null : Long.valueOf(userId.b);
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = goodFragment.Po().g;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams2 = new GoodFragmentAnalyticsParams(valueOf, valueOf2, valueOf3, mobileOfficialAppsMarketStat$ReferrerItemType, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, null, null, null, null, null, null, null, null, null, null, 28672, null);
                a.C0945a c0945a = new a.C0945a(requireContext, marketFavable, string, goodFragmentAnalyticsParams2, commonMarketStat$TypeRefSource2, new per(3));
                aVar.getClass();
                isq.b((isq) Po.a.C.getValue(), requireContext, marketFavable, new jkg(Po, 5), new g06(marketFavable, aVar, c0945a), new qpj(c0945a, 16), true, string, goodFragmentAnalyticsParams2.f, 128);
                return s3q0.a;
            case 7:
                return (TextView) ((rm90) obj).itemView.findViewById(R.id.past_asr_subtitle);
            case 8:
                String str2 = ((VkPeopleSearchParams) ((zak0) ((lv90) obj).l1).getValue()).h;
                if (str2 == null) {
                    str2 = "";
                }
                return new tho0(str2, 0L, 6);
            case 9:
                RoomDatabase.a a2 = bhv0.a(((PhotoEditorComponentImpl) obj).a.a, "photo_editor_params_db", PhotoParamsDatabase.class);
                a2.c();
                return (PhotoParamsDatabase) a2.b();
            case 10:
                ((q1b0) obj).a().invoke();
                return s3q0.a;
            case 11:
                return ((PlaylistScreenFragmentInternalComponent) obj).c.s();
            case 12:
                nib0 nib0Var = (nib0) obj;
                int l = ((int) (nib0Var.r.l() * 10)) - 5;
                RecyclerView recyclerView = nib0Var.c;
                int i2 = nib0Var.n;
                recyclerView.scrollBy(Math.round(i2 / 2.0f) + (l * i2), 0);
                nib0Var.p = true;
                nib0Var.d.attachToRecyclerView(recyclerView);
                return s3q0.a;
            case 13:
                AtomicInteger atomicInteger = PopupStickerView.q;
                ((PopupStickerView) obj).b();
                return s3q0.a;
            case 14:
                ((com.vk.im.popup.b) obj).dismiss();
                return s3q0.a;
            case 15:
                return PreferencesHelper.b((PreferencesHelper) obj);
            case 16:
                return ((MarketInternalComponent) ((rkd0) obj).d.getValue()).c;
            case 17:
                return Integer.valueOf(((obf0) obj).getBindingAdapterPosition());
            case 18:
                fii0 fii0Var = (fii0) obj;
                fii0Var.b.setAlpha(1.0f);
                bwt0.p0(fii0Var.b, false);
                bwt0.p0(fii0Var.a, true);
                return s3q0.a;
            case 19:
                initialize$lambda$220$lambda$159 = ServiceProvider.initialize$lambda$220$lambda$159((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$159;
            case 20:
                return new y3j0(((SettingsFragmentInternalComponent) obj).a.a);
            case 21:
                int i3 = SettingsListFragment.X0;
                return ((BlacklistComponent) m7m.d((SettingsListFragment) obj).a(fpf0.a(BlacklistComponent.class))).B5();
            case 22:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_settings_button);
            case 23:
                return ((LinksBridgeComponent) ((k7m) m7m.c(((SnowballsCoverHolder) obj).a)).a(fpf0.a(LinksBridgeComponent.class))).p().e();
            case 24:
                return new nrj0(((StoryEditorExtDepsComponentImpl) obj).b.id());
            case 25:
                int i4 = StorySettingsActivity.P;
                return ((StoriesSettingsComponent) m7m.a((StorySettingsActivity) obj).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 26:
                return new q1z((Context) ((mg6) obj).d);
            case 27:
                ((cmo0) obj).getClass();
                return s3q0.a;
            case 28:
                int i5 = TimeAndStatusView.h;
                return (TextView) ((TimeAndStatusView) obj).findViewById(R.id.im_time_and_status__time);
            default:
                int i6 = UserProfileHeaderView.G;
                return ((VkOnboardingComponent) ((k7m) m7m.c((UserProfileHeaderView) obj)).a(fpf0.a(VkOnboardingComponent.class))).p3();
        }
    }
}
