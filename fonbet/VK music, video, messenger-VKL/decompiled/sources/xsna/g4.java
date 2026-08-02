package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.tooling.PreviewActivity;
import com.facebook.soloader.MinElf;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentVh;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import one.video.calls.sdk.experiments.c;
import xsna.bex0;
import xsna.bxi;
import xsna.duo;
import xsna.hud0;
import xsna.ixe;
import xsna.o0r0;
import xsna.sx40;
import xsna.whg;
import xsna.yt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Thumb thumb;
        pni0 pni0Var;
        duo.b bVar;
        yvj initialize$lambda$220$lambda$13;
        int i = 0;
        switch (this.b) {
            case 0:
                n4 n4Var = (n4) this.c;
                yks0 yks0Var = n4Var.e;
                if (!n4Var.c(yks0Var.e)) {
                    n4Var.f(DiscoveryAction.f.a, yks0Var.e);
                    yks0.g(n4Var.e, n4Var.b, new e4(n4Var, i), 4);
                }
                return s3q0.a;
            case 1:
                hud0 hud0Var = (hud0) this.c;
                izs izsVar = (izs) this.d;
                if (hud0Var instanceof hud0.e) {
                    izsVar.invoke(new ixe.c((ClipsAuthor) ((hud0.e) hud0Var).b().a));
                }
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke(new yt.d((ikr0) this.d));
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke(new ur2(((ms2) this.d).b));
                return s3q0.a;
            case 4:
                View view = (View) this.c;
                AudioContentVh audioContentVh = (AudioContentVh) this.d;
                Activity h = e3m.h(view.getContext());
                UIBlockAudioContentCard uIBlockAudioContentCard = audioContentVh.d;
                UIBlockAudioContentCard.PodcastCard podcastCard = uIBlockAudioContentCard instanceof UIBlockAudioContentCard.PodcastCard ? (UIBlockAudioContentCard.PodcastCard) uIBlockAudioContentCard : null;
                Podcast podcast = podcastCard != null ? podcastCard.A : null;
                if (h != null && podcast != null) {
                    String str = podcast.d;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    List<Thumb> list = podcast.f;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int i2 = ((Thumb) next).c;
                            do {
                                Object next2 = it.next();
                                int i3 = ((Thumb) next2).c;
                                if (i2 > i3) {
                                    next = next2;
                                    i2 = i3;
                                }
                            } while (it.hasNext());
                        }
                        thumb = (Thumb) next;
                    } else {
                        thumb = null;
                    }
                    PodcastInfo podcastInfo = new PodcastInfo(str2, null, null, null, null, null, thumb, false, false, false, false, false, Integer.MIN_VALUE, null);
                    bpn0 bpn0Var = lyd.d;
                    ((fl4) (bpn0Var != null ? bpn0Var : null).getValue()).w().a(h, audioContentVh.b, podcastInfo, new AudioContentVh.a(1, audioContentVh, AudioContentVh.class, "onActionIdClick", "onActionIdClick(I)V", 0));
                    UIBlockAudioContentCard uIBlockAudioContentCard2 = audioContentVh.d;
                    if (uIBlockAudioContentCard2 != null) {
                        audioContentVh.c.a(new cfp0(uIBlockAudioContentCard2, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Menu)));
                    }
                }
                return s3q0.a;
            case 5:
                ((izs) this.c).invoke((String) this.d);
                return s3q0.a;
            case 6:
                ((izs) this.c).invoke(new a.i(((BookingCalendarScreenState.TimeSlotSelector.b) this.d).c));
                return s3q0.a;
            case 7:
                wgb wgbVar = (wgb) this.c;
                return wgbVar.s + ": updateExpiredProfiles: started, profileIds=" + ((f1e0) this.d);
            case 8:
                Context context = (Context) this.c;
                o1d o1dVar = (o1d) this.d;
                return new w0d(context, new w1d(o1dVar.x0, o1dVar));
            case 9:
                xwk.e().m(((ede) this.c).m.getContext(), ((ClipsGridHeaderEntry.Author) ((nmv) this.d)).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 10:
                yhg yhgVar = (yhg) this.c;
                whg.p pVar = (whg.p) this.d;
                yhgVar.c.j().d(yhgVar.a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), pVar.a, pVar.b);
                return s3q0.a;
            case 11:
                String str3 = ((bxi.a.C2631a) this.c).b;
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.d;
                d6q0.a.getClass();
                Iterator<ny1> it2 = d6q0.d.iterator();
                while (it2.hasNext()) {
                    it2.next().e();
                }
                if (epx.f(str3, "vpn_settings")) {
                    wp80.d(appCompatActivity);
                } else {
                    d6q0.a.getClass();
                    bxi bxiVar = d6q0.b;
                    if (bxiVar != null && (pni0Var = bxiVar.i) != null) {
                        pni0Var.invoke(appCompatActivity, str3);
                    }
                }
                return s3q0.a;
            case 12:
                duo duoVar = (duo) this.c;
                j0d0 j0d0Var = (j0d0) this.d;
                synchronized (duoVar.h) {
                    try {
                        Queue queue = (Queue) duoVar.i.get(j0d0Var.b);
                        if (queue != null && (bVar = (duo.b) queue.poll()) != null) {
                            if (j0d0Var.b.d(bVar.a.getItemViewType(), bVar.b)) {
                                j0d0Var.b.i(bVar.a);
                                j0d0Var.b.e(j0d0Var, "create");
                            }
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            case 13:
                ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) this.c;
                WeakReference weakReference = (WeakReference) this.d;
                imSettingsDialogThemeFragment.P.getClass();
                SharedPreferences.Editor edit = cew.h().edit();
                edit.putBoolean("pref_cfg_chat_should_override_theme", false);
                edit.apply();
                cew.f.onNext(Boolean.FALSE);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    view2.performHapticFeedback(0, 2);
                }
                imSettingsDialogThemeFragment.ho();
                return s3q0.a;
            case 14:
                String str4 = (String) this.c;
                x6y x6yVar = (x6y) this.d;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (!(superappUiRouterBridge != null ? superappUiRouterBridge : null).l(str4)) {
                    bex0.a.a(x6yVar, JsApiMethodType.USERS_SEARCH, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                }
                return s3q0.a;
            case 15:
                c.a aVar = (c.a) this.c;
                String name = ((qcy) this.d).getName();
                Object obj = aVar.d;
                Object obj2 = aVar.b;
                boolean z = aVar.c;
                StringBuilder a = xe9.a("Feature", "", " ", name, ": ");
                a.append(obj);
                a.append(", default: ");
                a.append(obj2);
                a.append(", modified: ");
                a.append(z);
                return a.toString();
            case 16:
                ((ygp0) this.c).a((one.video.exo.offline.f) this.d);
                return s3q0.a;
            case 17:
                rg50 rg50Var = (rg50) this.c;
                Object[] objArr = (Object[]) this.d;
                int i4 = PreviewActivity.f;
                rg50Var.C((rg50Var.getIntValue() + 1) % objArr.length);
                return s3q0.a;
            case 18:
                ReactionsFeedMviState reactionsFeedMviState = (ReactionsFeedMviState) this.c;
                return reactionsFeedMviState == null ? new ReactionsFeedMviState(((h5f0) this.d).h.a, ur60.h) : reactionsFeedMviState;
            case 19:
                initialize$lambda$220$lambda$13 = ServiceProvider.initialize$lambda$220$lambda$13((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$13;
            case 20:
                ((uhj0) this.c).x(((com.vkontakte.android.actionlinks.a) this.d).e);
                return s3q0.a;
            case 21:
                View view3 = (View) this.c;
                izs izsVar2 = (izs) this.d;
                cl40.a(view3, MusicHapticEvent.LIGHT);
                izsVar2.invoke(sx40.j0.b);
                return s3q0.a;
            case 22:
                ((twb) this.c).invoke(((nlh0) this.d).k());
                return s3q0.a;
            case 23:
                myc0.h((yvj) this.c, null, null, new myn0((yjl) this.d, null), 3);
                return s3q0.a;
            case 24:
                dmb0 dmb0Var = (dmb0) this.c;
                zhf0 e = p490.e((Float.floatToRawIntBits(dmb0Var.I0((trp0.a + irp0.d) - irp0.e) + ((lqr) this.d).b) << 32) | (Float.floatToRawIntBits(dmb0Var.I0(irp0.c)) & 4294967295L), (Float.floatToRawIntBits(dmb0Var.I0(irp0.g)) & 4294967295L) | (Float.floatToRawIntBits(dmb0Var.I0(irp0.f)) << 32));
                float I0 = dmb0Var.I0(irp0.h);
                return new zhf0(e.a - I0, e.b - I0, e.c + I0, e.d + I0);
            case 25:
                ((ioq0) this.c).w.c((User) this.d);
                return s3q0.a;
            default:
                ((VideoItemNoAutoPlayVh) this.c).e((View) this.d);
                return s3q0.a;
        }
    }
}
