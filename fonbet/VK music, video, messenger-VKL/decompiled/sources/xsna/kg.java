package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarNewVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.tools.VkViewStub;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e8v0;
import xsna.egm;
import xsna.fja;
import xsna.fnc;
import xsna.hud0;
import xsna.ixe;
import xsna.pnb0;
import xsna.sx40;
import xsna.u4a;
import xsna.wed0;
import xsna.wml0;
import xsna.x2a;
import xsna.xn50;
import xsna.z890;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 showReceivedReward$lambda$3;
        o0o0 o0o0Var;
        yvj initialize$lambda$220$lambda$12;
        int i = this.b;
        r2 = null;
        MusicPagePhoneHeaderNewVh musicPagePhoneHeaderNewVh = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                return new kad0(((MusicPlaybackQueueComponent) obj2).e4(), ((OfflineAudioComponent) obj).U8());
            case 1:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                Collection<CallMemberId> collection = (Collection) obj;
                accessibilityEvents.c("usersStopStreaming(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.STREAMING_STOPPED, AccessibilityEvents.Event.STREAMING_STARTED, collection);
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(new ixe.r((ClipsAuthor) ((hud0.e) obj).b().a));
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(new wml0.a.C3942a(((foi0) obj).a));
                return s3q0.a;
            case 4:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                ((o84) obj2).m = null;
                izs izsVar = (izs) ref$ObjectRef.element;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.FALSE);
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 5:
                ((izs) obj2).invoke(new fja.b(((z890.d) obj).a));
                return s3q0.a;
            case 6:
                izs izsVar2 = (izs) obj;
                ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = ((znc) obj2).c;
                if (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.AcceptRequest) {
                    izsVar2.invoke(new fnc.a(true));
                } else if (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeclineRequest) {
                    izsVar2.invoke(new fnc.a(false));
                } else {
                    if (!(clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar2.invoke(new fnc.b(((ClipCoauthorsDecisionLaunchType.DeleteClip) clipCoauthorsDecisionLaunchType).b));
                }
                return s3q0.a;
            case 7:
                e2d e2dVar = (e2d) obj2;
                return new v1d((u6d) obj, ((x6d) e2dVar.a.getValue()).l, e2dVar.b);
            case 8:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.post(new vv4(2, (ule) obj, recyclerView));
                return s3q0.a;
            case 9:
                int i2 = ClipsVideoAttachmentPickerFragment.W;
                RectF o = zjq.o(((ClipsVideoAttachmentPickerFragment.b) obj).a.getTitleRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                rect.bottom = iah0.a(13) + rect.bottom;
                xn50.a.c((ClipsVideoAttachmentPickerFragment) obj2, new a.k(rect));
                return s3q0.a;
            case 10:
                CommunityProfileFragment communityProfileFragment = ((ynh) obj).a;
                return up2.f((h7m) obj2, communityProfileFragment.requireContext(), communityProfileFragment);
            case 11:
                hgm hgmVar = (hgm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                Context context = hgmVar.d;
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setId(R.id.dialog_item_reply_button);
                Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_SubheadMedium), Integer.valueOf(R.attr.vk_ui_text_accent_themed));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                vkText.setTextAppearance(intValue);
                vkText.setText(R.string.vkim_dialog_reply_to);
                vkText.setTextColor(e3m.f(intValue2, context));
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                egm.b bVar = hgmVar.m;
                vkText.setLayoutParams(egm.W(hgmVar, 0, 0, (bVar != null ? bVar : null).h, 0, 0, 0, 59));
                viewGroup.addView(vkText);
                return vkText;
            case 12:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(sx40.g.b);
                return s3q0.a;
            case 13:
                ((syr) obj2).l.invoke(((w4e) obj).f);
                return s3q0.a;
            case 14:
                rey reyVar = (rey) obj2;
                String str = (String) obj;
                reyVar.b.execSQL("DELETE FROM key_value WHERE key = ?", new String[]{str});
                ReentrantLock reentrantLock = reyVar.d;
                reentrantLock.lock();
                try {
                    reyVar.c.remove(str);
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 15:
                showReceivedReward$lambda$3 = LegacyShowUseCase.showReceivedReward$lambda$3((Listeners) obj2, (String) obj);
                return showReceivedReward$lambda$3;
            case 16:
                ie10 ie10Var = (ie10) obj2;
                maz.c(ie10Var.b, ie10Var.a, (String) obj, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 17:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) obj2;
                kbj0 kbj0Var = (kbj0) obj;
                ArtistInfoNewVh artistInfoNewVh = (ArtistInfoNewVh) musicArtistCatalogRootVh.w.getValue();
                if (artistInfoNewVh != null && musicArtistCatalogRootVh.p) {
                    MusicPageToolbarNewVh musicPageToolbarNewVh = (MusicPageToolbarNewVh) musicArtistCatalogRootVh.t.getValue();
                    if (musicPageToolbarNewVh == null) {
                        u4a u4aVar = musicArtistCatalogRootVh.m;
                        mba mbaVar = u4aVar.c.a;
                        u4a.a aVar = u4aVar.b;
                        musicPageToolbarNewVh = new MusicPageToolbarNewVh(mbaVar, aVar.f, kbj0Var, aVar.c);
                    }
                    musicPagePhoneHeaderNewVh = new MusicPagePhoneHeaderNewVh(artistInfoNewVh, musicPageToolbarNewVh);
                }
                return musicPagePhoneHeaderNewVh;
            case 18:
                qcy<Object>[] qcyVarArr2 = MusicPlaybackQueueComponentImpl.f;
                t4v0 E0 = ((MixSettingsComponent) obj2).E0();
                nwy nwyVar = ((MusicPlaybackQueueComponentImpl) obj).e;
                qcy<Object> qcyVar = MusicPlaybackQueueComponentImpl.f[4];
                return new oxa0(E0, (pxa0) nwyVar.c());
            case 19:
                pha0 pha0Var = (pha0) obj2;
                via0 via0Var = (via0) obj;
                Photo photo = pha0Var.o;
                if (photo != null && (o0o0Var = pha0Var.i) != null) {
                    o0o0Var.c(photo, via0Var);
                }
                return s3q0.a;
            case 20:
                ((ujb0) obj2).m6((MusicTrack) obj);
                return s3q0.a;
            case 21:
                ((izs) obj2).invoke(new pnb0.c.g(new PollEditorScreen.PollTimePicker(((Calendar) obj).getTimeInMillis())));
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(new wed0.i(((PrivacyPostType.SingleDonutLevel) ((PrivacyPostType) obj)).b));
                return s3q0.a;
            case 23:
                m0f0 m0f0Var = (m0f0) obj2;
                k0f0 k0f0Var = (k0f0) obj;
                paw pawVar = m0f0Var.j;
                if (pawVar != null) {
                    pawVar.b(m0f0Var.r, k0f0Var);
                }
                return s3q0.a;
            case 24:
                wzh0 wzh0Var = (wzh0) obj2;
                u4a u4aVar2 = (u4a) obj;
                u4a a = wzh0Var.r.a(u4aVar2);
                u4a.a aVar2 = a.b;
                CatalogConfiguration catalogConfiguration = aVar2.s;
                g3a g3aVar = new g3a(catalogConfiguration, u4aVar2, catalogConfiguration.K(a), new x2a.e(), null, null, null, aVar2.H, wzh0Var.d, null, 28912);
                hui huiVar = wzh0Var.q;
                int i3 = 0;
                g3aVar.q = new xzh0(0, huiVar, uzh0.class, "onSearchRequestStart", "onSearchRequestStart()V", 0, i3);
                int i4 = 4;
                g3aVar.r = new acd(0, huiVar, uzh0.class, "onSearchRequestLoaded", "onSearchRequestLoaded()V", i3, i4);
                g3aVar.s = new jn2(0, huiVar, uzh0.class, "onSearchRequestFailed", "onSearchRequestFailed()V", i3, i4);
                return g3aVar;
            case 25:
                initialize$lambda$220$lambda$12 = ServiceProvider.initialize$lambda$220$lambda$12((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$12;
            case 26:
                ClipActionButton clipActionButton = new ClipActionButton(((VkViewStub) obj2).getContext());
                jjc.g(clipActionButton, new waf0((awk0) obj, 11));
                return clipActionButton;
            case 27:
                ldn0 ldn0Var = (ldn0) obj;
                u7n0 u7n0Var = ((kdn0) obj2).p;
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = ldn0Var.e;
                u7n0Var.e0(superAppShowcaseConfirmNumberWidget.j, superAppShowcaseConfirmNumberWidget.o.j);
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget2 = ldn0Var.e;
                if (superAppShowcaseConfirmNumberWidget2.o.h.length() != 0) {
                    u7n0Var.g0(superAppShowcaseConfirmNumberWidget2.o.h);
                }
                return s3q0.a;
            case 28:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                gzs gzsVar = (gzs) obj;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.b.b);
                }
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                com.vk.writebar.g gVar = (com.vk.writebar.g) obj2;
                gVar.f = true;
                ((WriteBar) obj).l0();
                h1y0 h1y0Var = gVar.d;
                if (h1y0Var != null) {
                    h1y0Var.c(false);
                }
                return s3q0.a;
        }
    }
}
