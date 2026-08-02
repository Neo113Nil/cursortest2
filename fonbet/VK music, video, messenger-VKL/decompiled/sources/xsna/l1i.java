package xsna;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.OnlineFriendsTabFragment;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.design.view.subscription.MusicSubscriptionBannerView;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.integration.friends.api.di.SearchFriendsIntegrationComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.video.music.dialog.api.domain.entity.PlaylistOnboardingButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.caa0.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class l1i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l1i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        l7m f;
        int i = this.b;
        int i2 = 6;
        Object obj = this.c;
        switch (i) {
            case 0:
                o1i o1iVar = (o1i) obj;
                n6h.b((n6h) o1iVar.u.getValue(), o1iVar.c, false, "community_page", o1iVar.j, null, 48);
                return s3q0.a;
            case 1:
                i1j i1jVar = (i1j) obj;
                View view = i1jVar.c;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_room_participants_list);
                view.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setItemAnimator(null);
                recyclerView.addItemDecoration(new v0j(recyclerView.getContext(), new r41(i1jVar, 19), 0, cn70.b(8), 4));
                recyclerView.setRecycledViewPool(new rru());
                recyclerView.setHasFixedSize(false);
                return recyclerView;
            case 2:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj;
                cVar.Z0(cVar.A.a);
                return s3q0.a;
            case 3:
                nul nulVar = (nul) obj;
                if (((blg0) ovi.a(nulVar, ilg0.a)) == null) {
                    dc2 dc2Var = nulVar.v;
                    if (dc2Var != null) {
                        nulVar.j2(dc2Var);
                    }
                    nulVar.v = null;
                } else if (nulVar.v == null) {
                    kul kulVar = new kul(nulVar);
                    l9h l9hVar = new l9h(nulVar, i2);
                    wax waxVar = nulVar.r;
                    boolean z = nulVar.s;
                    float f2 = nulVar.t;
                    dtp0<Float> dtp0Var = hlg0.a;
                    dc2 dc2Var2 = new dc2(waxVar, z, f2, kulVar, l9hVar);
                    nulVar.i2(dc2Var2);
                    nulVar.v = dc2Var2;
                }
                return s3q0.a;
            case 4:
                wu6 wu6Var = ((o4m) obj).j;
                if (wu6Var != null) {
                    wu6Var.run();
                }
                return s3q0.a;
            case 5:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setImageDrawable(egmVar.o());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(30), cn70.b(10), cn70.b(8), cn70.b(1), cn70.b(8), 0, 32));
                vkImageSimple.setVisibility(0);
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 6:
                return (VkSimpleButton) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).c.findViewById(R.id.profile_retry_button);
            case 7:
                return ((EduCommonComponent) ((i6p) obj).a.mo408a(fpf0.a(EduCommonComponent.class))).hc();
            case 8:
                xmp xmpVar = (xmp) obj;
                xmpVar.z.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ALERT, "", "", "email_did_not_send_alert"));
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SEND_AGAIN_TAP, arrayList, null, null, null, null, null, 252);
                xmpVar.y0();
                return s3q0.a;
            case 9:
                return ((l4y) obj).o(VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUT_PERMISSION_GF);
            case 10:
                return new d4y((r6y) obj);
            case 11:
                LibverifyPresenter libverifyPresenter = (LibverifyPresenter) obj;
                par0.a.getClass();
                par0.a("[LibverifyPresenter] Permissions were denied, waiting for an sms");
                libverifyPresenter.b0 = LibverifyPresenter.PermissionsStatus.DENIED;
                libverifyPresenter.R0();
                return s3q0.a;
            case 12:
                com.vk.libvideo.live.impl.views.live.b bVar = (com.vk.libvideo.live.impl.views.live.b) obj;
                if (bVar.Q) {
                    bVar.a();
                } else {
                    bVar.B0();
                    bVar.start();
                }
                return s3q0.a;
            case 13:
                ((mo10) obj).b(true);
                return s3q0.a;
            case 14:
                int i3 = MusicCatalogFragment.W;
                return ((VkClientMultiAccountComponent) m7m.d((MusicCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 15:
                int i4 = MusicSubscriptionBannerView.x;
                return (CardView) ((MusicSubscriptionBannerView) obj).findViewById(R.id.card_background);
            case 16:
                return ((MusicPrefsComponent) ((k7m) m7m.f((ef50) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 17:
                return new gjl((dl50) obj);
            case 18:
                return ((NewsFeedComponent) ((k7m) m7m.c(((xq50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 19:
                RecyclerView recyclerView2 = ((rm60) obj).a;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return com.vk.toggle.b.A.a(smbAdFeatures) ? new x0n(recyclerView2) : new v0n(recyclerView2);
            case 20:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                Bundle requireArguments = ((NewsfeedSearchFragment) obj).requireArguments();
                String string = requireArguments.containsKey("key_owner_name") ? requireArguments.getString("key_owner_name") : null;
                if (requireArguments.containsKey("owner")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = requireArguments.getParcelable("owner", UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = requireArguments.getParcelable("owner");
                        if (!(parcelable3 instanceof UserId)) {
                            parcelable3 = null;
                        }
                        parcelable = (UserId) parcelable3;
                    }
                    userId = (UserId) parcelable;
                } else {
                    userId = null;
                }
                return new xw60(userId, string, requireArguments.containsKey("key_hint") ? requireArguments.getString("key_hint") : null, requireArguments.containsKey("key_query") ? requireArguments.getString("key_query") : null, requireArguments.containsKey("key_domain") ? requireArguments.getString("key_domain") : null, requireArguments.getBoolean("key_start_speech_to_text", false), requireArguments.containsKey("key_situational_suggest_id") ? requireArguments.getString("key_situational_suggest_id") : null);
            case 21:
                OnlineFriendsTabFragment onlineFriendsTabFragment = (OnlineFriendsTabFragment) obj;
                int i5 = OnlineFriendsTabFragment.c0;
                ((SearchFriendsIntegrationComponent) ((k7m) m7m.f(onlineFriendsTabFragment)).mo408a(fpf0.a(SearchFriendsIntegrationComponent.class))).getClass();
                return new vth0(onlineFriendsTabFragment.R, onlineFriendsTabFragment);
            case 22:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.MESSAGES_EMPTY_HISTORY_MERGE));
            case 23:
                return ((caa0) obj).new a();
            case 24:
                xbb0 xbb0Var = (xbb0) obj;
                xbb0Var.a.invoke(PlaylistOnboardingButton.OpenPlayList);
                dw20 dw20Var = xbb0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 25:
                ComponentCallbacks2 componentCallbacks2 = ((ifb0) obj).D;
                w8i w8iVar = componentCallbacks2 instanceof w8i ? (w8i) componentCallbacks2 : null;
                if (w8iVar == null || (f = m7m.f(w8iVar)) == null) {
                    return null;
                }
                PlayerAnalyticsComponent playerAnalyticsComponent = (PlayerAnalyticsComponent) ((k7m) f).a(fpf0.a(PlayerAnalyticsComponent.class));
                if (playerAnalyticsComponent != null) {
                    return playerAnalyticsComponent.z7();
                }
                return null;
            case 26:
                return (ImageView) ((hpb0) obj).g(R.id.poll_create_btn);
            case 27:
                PostHeaderSubtitleTextView postHeaderSubtitleTextView = (PostHeaderSubtitleTextView) obj;
                return new xxk0(postHeaderSubtitleTextView.z, postHeaderSubtitleTextView.getPaint(), Integer.MAX_VALUE, null, postHeaderSubtitleTextView.getLineSpacingMultiplier(), postHeaderSubtitleTextView.getLineSpacingExtra(), null, 1, 5944).a();
            case 28:
                String[] strArr = PostViewFragment.T0;
                return ((AudioModelsComponent) m7m.d((PostViewFragment) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            default:
                ((dcc0) obj).g();
                return s3q0.a;
        }
    }
}
