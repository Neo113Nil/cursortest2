package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.widget.TextView;
import com.google.zxing.MultiFormatReader;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.attachpicker.widget.TopShadowLinearLayout;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.catalog2.feature.music.holders.MusicKidsCollectionVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.music.design.view.subscription.MusicSubscriptionBannerView;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.EnumMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.media.OkmpStreamPublisher$createPublisherCallback$1;
import xsna.aka0;
import xsna.cqc0;
import xsna.ejd0;
import xsna.ikv0;
import xsna.pgc0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vt30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType eventType;
        String string;
        s3q0 handleHandshakeComplete$lambda$2;
        int i = this.b;
        int i2 = 6;
        int i3 = 2;
        boolean z = false;
        z = false;
        z = false;
        int i4 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new fk30(((xt30) obj).t());
            case 1:
                rw30 rw30Var = (rw30) obj;
                int i5 = ImSearchAnalytics.a.$EnumSwitchMapping$0[ImSearchAnalytics.SyncContactsResult.ACCEPT.ordinal()];
                int i6 = 3;
                if (i5 == 1) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.ACCEPT_IMPORT_CONTACTS;
                } else if (i5 == 2) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.DECLINE_IMPORT_CONTACTS;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.IMPORT_CONTACTS_SUCCESS;
                }
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCallsStat$TypeVoipImportContactsAction(eventType, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.Source.CALLS_SERVICES), 3)).q();
                VkSearchView vkSearchView = rw30Var.b1().k;
                if (vkSearchView == null) {
                    vkSearchView = null;
                }
                vkSearchView.d0();
                iy30 b1 = rw30Var.b1();
                Context context = b1.c;
                tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_search_sync_snack_loading_text);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_spinner_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) (null == true ? 1 : 0), 12);
                aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) (null == true ? 1 : 0), (ikv0.d.a) (null == true ? 1 : 0), i2);
                aVar.e = 15000L;
                b1.p = aVar.n();
                io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.observable.h1(rw30Var.a1("ImMsgSearch")).r();
                if (rw30Var.t == null) {
                    io.reactivex.rxjava3.internal.operators.observable.c3 G0 = r.G0(io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(0), rw30Var.j.f()), new s11(19));
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    rw30Var.t = new io.reactivex.rxjava3.internal.operators.observable.a0(G0.r0(asu0.r()).a0(asu0Var.d()), new wyb(rw30Var, i6)).subscribe(new fl30(new qw30(rw30Var, false ? 1 : 0), i4), new hms(new qi00(rw30Var, 8), 11));
                }
                return s3q0.a;
            case 2:
                MusicKidsCollectionVh musicKidsCollectionVh = (MusicKidsCollectionVh) obj;
                return new ul40(musicKidsCollectionVh.b, new cv4(musicKidsCollectionVh, 5));
            case 3:
                Bundle bundle = (Bundle) obj;
                if (bundle != null && (string = bundle.getString("key_url")) != null && drm0.D(string, "kids_section", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 5:
                int i7 = MusicSubscriptionBannerView.x;
                return (TextView) ((MusicSubscriptionBannerView) obj).findViewById(R.id.offer_title);
            case 6:
                yk50 yk50Var = (yk50) obj;
                return new zk50(yk50Var, yk50Var, yk50Var);
            case 7:
                long j = CodeState.d;
                ((i060) obj).getClass();
                return new CodeState.SmsWait(System.currentTimeMillis(), j, 0, 4, null);
            case 8:
                handleHandshakeComplete$lambda$2 = OkmpStreamPublisher$createPublisherCallback$1.handleHandshakeComplete$lambda$2((OkmpStreamPublisher) obj);
                return handleHandshakeComplete$lambda$2;
            case 9:
                ((com.vk.donut.impl.a) obj).b.jo();
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.CHAT_OPEN_TO_RENDER));
            case 11:
                return ((x2a0) obj).itemView.findViewById(R.id.video_wrap);
            case 12:
                PhotoAlbumFragment photoAlbumFragment = (PhotoAlbumFragment) obj;
                f5a0 f5a0Var = photoAlbumFragment.p0;
                if (f5a0Var != null) {
                    f5a0Var.l = !f5a0Var.l;
                }
                photoAlbumFragment.ko();
                aq2 aq2Var = photoAlbumFragment.Y;
                (aq2Var != null ? aq2Var : null).e0();
                photoAlbumFragment.po().clear();
                if (f5a0Var != null) {
                    f5a0Var.d();
                }
                return s3q0.a;
            case 13:
                gzs<s3q0> gzsVar = ((aka0.b) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 14:
                return ((gfb0) obj).c;
            case 15:
                return (TopShadowLinearLayout) ((hpb0) obj).g(R.id.poll_top_shadow_layout);
            case 16:
                int i8 = PollPickerFragment.W;
                Bundle arguments = ((PollPickerFragment) obj).getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("source", 0) : 0);
            case 17:
                com.vk.newsfeed.common.util.j jVar = (com.vk.newsfeed.common.util.j) obj;
                return new u5t0(jVar.C(), (b6n0) jVar.v.getValue());
            case 18:
                ((w3c0) obj).j7(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_MODAL_PHOTO);
                return s3q0.a;
            case 19:
                ((dcc0) obj).b.no(true);
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr = PostingComponentImpl.j;
                return new e0a(((PostingComponentImpl) obj).G4());
            case 21:
                return new pgc0.a((pgc0) obj);
            case 22:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.newsfeed_newpost_for_all);
                f4m.t(y8g0.a(R.dimen.posting_visibility_post_first_element_top_margin), modalSettingsPrivacyOption);
                return modalSettingsPrivacyOption;
            case 23:
                ((jkd0) obj).n.invoke(ejd0.b.e.b);
                return s3q0.a;
            case 24:
                return ((SharingComponent) ((zqd0) obj).c.getValue()).v();
            case 25:
                return new zbe0(((PublishFragmentInternalComponent) obj).c.a);
            case 26:
                MultiFormatReader multiFormatReader = new MultiFormatReader();
                multiFormatReader.setHints((EnumMap) ((one0) obj).c.getValue());
                return multiFormatReader;
            case 27:
                ((ste0) obj).onClick();
                return s3q0.a;
            case 28:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
                ofFloat.setDuration(100L);
                ofFloat.addUpdateListener(new qf0((m6f0) obj, i3));
                return ofFloat;
            default:
                lgh0 lgh0Var = (lgh0) obj;
                ScrollToBottomView scrollToBottomView = (ScrollToBottomView) lgh0Var.a.getValue();
                scrollToBottomView.setIconDrawable(R.drawable.vk_icon_deprecated_vkim_arrow_down_28);
                kkm kkmVar = lgh0Var.k;
                if (kkmVar != null) {
                    kkmVar.e(scrollToBottomView, new yh3(10));
                }
                return scrollToBottomView;
        }
    }
}
