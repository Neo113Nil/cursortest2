package xsna;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh;
import com.vk.contacts.ContactSyncAdapterService;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.good.router.model.MarketBusinessOnboardingParams;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.log.L;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import java.io.File;
import java.util.UUID;
import xsna.m5u;
import xsna.qfa0;
import xsna.w1g0;
import xsna.xdr;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fbh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fbh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object serializable;
        Object obj2;
        Object obj3;
        Object parcelable;
        Object parcelable2;
        int i = this.b;
        Integer num = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj4;
                int i2 = CommunityNotificationSettingsFragment.b0;
                communityNotificationSettingsFragment.setResult(-1);
                communityNotificationSettingsFragment.finish();
                return s3q0.a;
            case 1:
                return ((StorefrontComponent) ((h7m) obj4).a(fpf0.a(StorefrontComponent.class))).a();
            case 2:
                mph mphVar = (mph) obj4;
                ((VideoGrowthComponent) mphVar.b.a1.getValue()).Z7().e(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.BOTTOM_BANNER);
                mphVar.l.invoke(CommunityProfileAction.y.b);
                return s3q0.a;
            case 3:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj4;
                int i3 = CommunityRepliesFragment.d0;
                w1g0.i iVar = w1g0.i.b;
                communityRepliesFragment.getClass();
                xn50.a.c(communityRepliesFragment, iVar);
                return s3q0.a;
            case 4:
                dw20 dw20Var = ((ryh) obj4).g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 5:
                int i4 = ComposeConfigurableHeaderVh.F;
                return (TextView) ((ComposeConfigurableHeaderVh) obj4).a().findViewById(R.id.ds_internal_group_header_title);
            case 6:
                i1j i1jVar = (i1j) obj4;
                g1j g1jVar = new g1j(i1jVar, r4);
                t0j t0jVar = new t0j(new q0j());
                t0jVar.setHasStableIds(true);
                t0jVar.x0(u0j.class, new dz(16));
                t0jVar.x0(w0j.class, new i8(27));
                t0jVar.y0(new i0j(g1jVar));
                i1jVar.a().setAdapter(t0jVar);
                return t0jVar;
            case 7:
                return (TextView) ((k2j) obj4).itemView.findViewById(R.id.room_name);
            case 8:
                int i5 = ContactSyncAdapterService.c;
                return new ContactSyncAdapterService.a((ContactSyncAdapterService) obj4, true);
            case 9:
                gik gikVar = (gik) obj4;
                gikVar.c.c(false);
                gikVar.K();
                gikVar.j.b(CropStatEvent.a.a);
                return s3q0.a;
            case 10:
                int i6 = DonutLevelsFragment.R;
                Bundle arguments = ((DonutLevelsFragment) obj4).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = arguments.getSerializable("uuid", UUID.class);
                        obj = serializable;
                    } else {
                        Object serializable2 = arguments.getSerializable("uuid");
                        obj = (UUID) (serializable2 instanceof UUID ? serializable2 : null);
                    }
                    UUID uuid = (UUID) obj;
                    if (uuid != null) {
                        return uuid;
                    }
                }
                return UUID.randomUUID();
            case 11:
                int i7 = ExploreFragment.h0;
                h3p0.b((ExploreFragment) obj4);
                return s3q0.a;
            case 12:
                gzs<s3q0> gzsVar = ((txq) obj4).h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 13:
                n5r n5rVar = (n5r) obj4;
                u1c0 J0 = n5rVar.J0();
                r4 = J0 != null ? J0.k : 0;
                FeedbackPoll q6 = n5rVar.q6();
                String str = q6 != null ? q6.k : null;
                ilt0 ilt0Var = new ilt0("newsfeed.hidePollFeedback");
                ilt0Var.K("track_code", str);
                ilt0Var.C(r4, X3.i.L);
                ilt0Var.k = true;
                rsg0.y0(ilt0Var, null, null, 3).subscribe(new bw(new r3h(n5rVar, 12), 25), new om1(new dhh(n5rVar, 11), 18));
                return s3q0.a;
            case 14:
                File file = ((iar) obj4).h;
                return z9r.a(file != null ? file : null, "Can not ensure directory ");
            case 15:
                v3p v3pVar = ((com.vk.photo.editor.features.filter.b) obj4).d;
                v3pVar.c(false);
                v3pVar.b().b(xdr.b.a);
                return s3q0.a;
            case 16:
                ((xor) obj4).b.invalidate();
                return s3q0.a;
            case 17:
                dw20 dw20Var2 = ((yls) obj4).b;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                return s3q0.a;
            case 18:
                rys rysVar = (rys) ((tys) obj4).a;
                if (rysVar != null) {
                    rysVar.e();
                }
                return s3q0.a;
            case 19:
                int i8 = GalleryFragmentImpl.R0;
                PhotosComponent photosComponent = (PhotosComponent) ((k7m) m7m.f((GalleryFragmentImpl) obj4)).a(fpf0.a(PhotosComponent.class));
                return (qfa0.f) photosComponent.F4().c(photosComponent.z8().b()).c.getValue();
            case 20:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                return Boolean.valueOf(!((GeoFragment) obj4).requireArguments().getBoolean("geo_fragment:remove_feed"));
            case 21:
                f18 f18Var = ((wot) obj4).e.a;
                qcy<Object> qcyVar = cpt.b[0];
                return f18Var.a();
            case 22:
                GoodFragment goodFragment = (GoodFragment) obj4;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                UserId No = goodFragment.No();
                long Mo = goodFragment.Mo();
                String string = goodFragment.requireArguments().getString("access_key");
                Bundle requireArguments = goodFragment.requireArguments();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 33) {
                    parcelable2 = requireArguments.getParcelable("analytics_params", GoodFragmentAnalyticsParams.class);
                    obj2 = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("analytics_params");
                    if (!(parcelable3 instanceof GoodFragmentAnalyticsParams)) {
                        parcelable3 = null;
                    }
                    obj2 = (GoodFragmentAnalyticsParams) parcelable3;
                }
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = (GoodFragmentAnalyticsParams) obj2;
                String string2 = goodFragment.requireArguments().getString("source");
                if (string2 == null) {
                    string2 = "";
                }
                CommonMarketStat$TypeRefSource valueOf = CommonMarketStat$TypeRefSource.valueOf(string2);
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = goodFragment.Po().h;
                String str2 = goodFragment.Po().d0;
                Bundle requireArguments2 = goodFragment.requireArguments();
                if (i9 >= 33) {
                    parcelable = requireArguments2.getParcelable("business_onboarding_params", MarketBusinessOnboardingParams.class);
                    obj3 = (Parcelable) parcelable;
                } else {
                    Object parcelable4 = requireArguments2.getParcelable("business_onboarding_params");
                    obj3 = (MarketBusinessOnboardingParams) (parcelable4 instanceof MarketBusinessOnboardingParams ? parcelable4 : null);
                }
                return new pmd0(new kjd0(No, Mo, string, goodFragmentAnalyticsParams, valueOf, mobileOfficialAppsCoreNavStat$EventScreen, str2, (MarketBusinessOnboardingParams) obj3), (rkd0) goodFragment.L0.getValue());
            case 23:
                w6u w6uVar = (w6u) obj4;
                sop sopVar = w6uVar.l;
                v6u v6uVar = w6uVar.p;
                k7u k7uVar = (v6uVar == null ? null : v6uVar).b;
                r41 r41Var = ((n5u) w6uVar.m.c).i;
                if (r41Var != null) {
                    num = r41Var.b((v6uVar != null ? v6uVar : null).b);
                }
                sopVar.invoke(new m5u.p(k7uVar, num));
                return s3q0.a;
            case 24:
                bev bevVar = (bev) obj4;
                try {
                    TypedArray obtainStyledAttributes = bevVar.k.obtainStyledAttributes(R.style.VkUiTypography_FootnoteMedium, new int[]{android.R.attr.fontFamily});
                    try {
                        int resourceId = obtainStyledAttributes.getResourceId(0, R.font.vk_roboto_medium);
                        yfb.d(obtainStyledAttributes, null);
                        return dbg0.a(resourceId, bevVar.k);
                    } finally {
                    }
                } catch (Throwable th) {
                    L.i(th);
                    return null;
                }
            case 25:
                return quv.o((quv) obj4);
            case 26:
                qcy<Object>[] qcyVarArr3 = ImContactsListFragment.k0;
                ((ImContactsListFragment) obj4).requireContext();
                return Boolean.FALSE;
            case 27:
                return zr.a("#startBgSync - ", (String) obj4, " - peerId=null");
            case 28:
                m7w m7wVar = (m7w) obj4;
                boolean b = m7wVar.b();
                jpf jpfVar = m7wVar.c;
                if (b) {
                    ((jtm) jpfVar.invoke()).c();
                    ((jtm) jpfVar.invoke()).b(m7wVar.b);
                } else {
                    m7wVar.a();
                }
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr4 = ImRequestsFragment.Z;
                ((io.reactivex.rxjava3.disposables.c) obj4).dispose();
                return s3q0.a;
        }
    }
}
