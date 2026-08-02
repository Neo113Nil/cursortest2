package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.location.Location;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogVideo;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.dto.common.Peer;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.profile.core.content.profilelist.fragments.AbsUserListFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import xsna.bsr0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.jm1;
import xsna.ngd;
import xsna.p66;
import xsna.sj8;
import xsna.tgd;
import xsna.xn50;
import xsna.xxd0;
import xsna.zy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ec implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [xsna.xub] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [xsna.yub] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Window window;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = AbsUserListFragment.N0;
                ((AbsUserListFragment) obj2).getClass();
                return s3q0.a;
            case 1:
                fj0 fj0Var = (fj0) obj2;
                bsr0.a aVar = bsr0.q;
                return new bsr0(fj0Var.h.inflate(R.layout.vkim_custom_mention_item, (ViewGroup) obj, false), fj0Var.i);
            case 2:
                sn0 sn0Var = (sn0) obj2;
                b6m.a().p(sn0Var.itemView.getContext(), sn0Var.n);
                return s3q0.a;
            case 3:
                ux0 ux0Var = (ux0) obj2;
                if (zy0.a.$EnumSwitchMapping$1[((RestrictionOverlayRenderDelegate.RestrictionOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ux0Var.a(AdsItemViewEvent.m.b);
                return s3q0.a;
            case 4:
                jm1.a aVar2 = ((jm1) obj2).b;
                if (aVar2 != null) {
                    AlbumsFragment albumsFragment = (AlbumsFragment) ((ux0) aVar2).c;
                    int i4 = AlbumsFragment.j0;
                    ((oga0) albumsFragment.X.getValue()).r(albumsFragment, albumsFragment.ho(), EmptyList.b);
                }
                return s3q0.a;
            case 5:
                jr4 jr4Var = (jr4) obj2;
                it80 it80Var = (it80) obj;
                rr4 rr4Var = jr4Var.s;
                if (rr4Var != null) {
                    ur4 ur4Var = (ur4) it80Var.a;
                    rr4Var.e(ur4Var != null ? ur4Var.f : null);
                }
                rr4 rr4Var2 = jr4Var.s;
                if (rr4Var2 != null) {
                    ur4 ur4Var2 = (ur4) it80Var.a;
                    rr4Var2.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ur4Var2 != null ? Integer.valueOf(ur4Var2.g) : null);
                }
                return s3q0.a;
            case 6:
                r46 r46Var = (r46) obj2;
                xxd0.b bVar = (xxd0.b) obj;
                List<xub> list = bVar.o;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ?? r1 = (xub) it.next();
                    if (r1 instanceof awb) {
                        r1 = new yub(r46Var.b);
                    }
                    arrayList.add(r1);
                }
                return xxd0.b.a(bVar, null, arrayList, null, 4177919);
            case 7:
                p66 p66Var = (p66) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                boolean z = th instanceof VKApiExecutionException;
                if (z) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 9) {
                        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                        SchemeStatSak$TypeRegistrationItem.Error error = SchemeStatSak$TypeRegistrationItem.Error.FLOOD;
                        bVar2.getClass();
                        com.vk.registration.funnels.b.i(error);
                    } else if (vKApiExecutionException.s() == 1004) {
                        com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                        SchemeStatSak$TypeRegistrationItem.Error error2 = SchemeStatSak$TypeRegistrationItem.Error.PHONE_ALREADY_USED;
                        bVar3.getClass();
                        com.vk.registration.funnels.b.i(error2);
                    } else if (vKApiExecutionException.s() == 10 || vKApiExecutionException.s() == 118 || vKApiExecutionException.s() == 2000 || vKApiExecutionException.s() == 4607 || vKApiExecutionException.s() == 2605) {
                        com.vk.registration.funnels.b bVar4 = com.vk.registration.funnels.b.a;
                        SchemeStatSak$TypeRegistrationItem.Error error3 = SchemeStatSak$TypeRegistrationItem.Error.SERVER_ERROR;
                        bVar4.getClass();
                        com.vk.registration.funnels.b.i(error3);
                    } else if (vKApiExecutionException.Z()) {
                        com.vk.registration.funnels.b bVar5 = com.vk.registration.funnels.b.a;
                        SchemeStatSak$TypeRegistrationItem.Error error4 = SchemeStatSak$TypeRegistrationItem.Error.PHONE_BANNED;
                        bVar5.getClass();
                        com.vk.registration.funnels.b.i(error4);
                    } else {
                        com.vk.registration.funnels.b.a.getClass();
                        com.vk.registration.funnels.b.i(null);
                    }
                } else {
                    com.vk.registration.funnels.b.t(com.vk.registration.funnels.b.a);
                }
                VKApiExecutionException vKApiExecutionException2 = z ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException2 != null && vKApiExecutionException2.g0()) {
                    com.vk.registration.funnels.b bVar6 = com.vk.registration.funnels.b.a;
                    SchemeStatSak$TypeRegistrationItem.Error error5 = SchemeStatSak$TypeRegistrationItem.Error.PHONE_BANNED;
                    bVar6.getClass();
                    com.vk.registration.funnels.b.i(error5);
                }
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    p66Var.u0(th);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 8:
                Object obj3 = ((ta6) obj2).o;
                ((l0c) (obj3 != null ? obj3 : null)).a();
                return s3q0.a;
            case 9:
                int i5 = BaseVkSearchView.P;
                ((BaseVkSearchView) obj2).U4();
                return s3q0.a;
            case 10:
                ((com.vk.feed.blacklist.impl.presentation.blacklist.b) obj2).g.b(new f.b.a((Throwable) obj));
                return s3q0.a;
            case 11:
                BotButton.VkPay vkPay = (BotButton.VkPay) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(vkPay.g.h()), "type");
                w9yVar.e(vkPay.h, "payload");
                w9yVar.c(Integer.valueOf(vkPay.i), TtmlNode.TAG_SPAN);
                w9yVar.e(vkPay.j, "hash");
                w9yVar.b(Boolean.valueOf(vkPay.k), "inline");
                w9yVar.d(Long.valueOf(vkPay.l.b), "author");
                return s3q0.a;
            case 12:
                wf8 wf8Var = (wf8) obj2;
                sj8.a aVar3 = (sj8.a) obj;
                wf8Var.b();
                wf8Var.c(aVar3.a, aVar3.b);
                return s3q0.a;
            case 13:
                ek8 ek8Var = (ek8) obj2;
                Boolean bool = (Boolean) obj;
                LinearLayout linearLayout = ek8Var.d;
                Activity activity = ek8Var.D;
                ek8Var.o = bool.booleanValue();
                nzb nzbVar = ek8Var.z;
                if (nzbVar != null) {
                    nzbVar.setIsEmojiKeyboardVisibility(bool.booleanValue());
                }
                if (iah0.r(activity) && !fnj.d(activity)) {
                    if (bool.booleanValue()) {
                        linearLayout.setTranslationY(-linearLayout.getMeasuredHeight());
                    } else {
                        int i6 = ify.a;
                        if (!ify.e(ify.c)) {
                            linearLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                }
                ek8Var.b();
                return s3q0.a;
            case 14:
                ((com.vk.voip.ui.settings.participants_view.c) obj2).a(j.h.a);
                return s3q0.a;
            case 15:
                ((zi9) obj2).b.onNext((Location) obj);
                return s3q0.a;
            case 16:
                ((CameraUIView) obj2).j1 = (etv0) obj;
                return s3q0.a;
            case 17:
                lu9 lu9Var = (lu9) obj2;
                PreviewRatio previewRatio = (PreviewRatio) obj;
                if (lu9Var.g) {
                    lu9Var.j = previewRatio;
                } else {
                    lu9Var.a.i1(previewRatio);
                }
                return s3q0.a;
            case 18:
                CatalogVideo catalogVideo = ((CatalogExtendedData) obj2).f.get((String) obj);
                if (catalogVideo != null) {
                    return catalogVideo.c;
                }
                return null;
            case 19:
                ((gta) obj2).a();
                return s3q0.a;
            case 20:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new nh3(5, (ymb) obj2, (ProfilesInfo) obj));
                return s3q0.a;
            case 21:
                oob oobVar = (oob) obj2;
                zal0.D(g2v.d().a(), oobVar.k.getApplicationContext(), ((dqt) obj).b.b.c, oobVar.m, null, "sticker_longtap_keyboard", 40);
                return s3q0.a;
            case 22:
                ((vsb) obj2).a.d();
                return s3q0.a;
            case 23:
                g2v.c().getClass();
                return n0v0.a.d(((ryb) obj2).i, (ViewGroup) obj, R.layout.vkim_chat_members_item_with_actions);
            case 24:
                return ((xgl0) obj2).o().q((Peer) obj);
            case 25:
                ((w6d) obj2).e.a(m3d.b);
                return s3q0.a;
            case 26:
                ((c9d) obj2).r(((OneVideoPlayer) obj).getCurrentPosition());
                return s3q0.a;
            case 27:
                ((io.reactivex.rxjava3.disposables.c) obj2).dispose();
                return s3q0.a;
            case 28:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) obj2;
                tgd tgdVar = (tgd) obj;
                int i7 = ClipsAudioFragment.Y;
                if (tgdVar instanceof tgd.c) {
                    hb hbVar = clipsAudioFragment.Q;
                    if (hbVar != null) {
                        hbVar.invoke(Integer.valueOf(((tgd.c) tgdVar).a));
                    }
                    clipsAudioFragment.Q = null;
                } else if (tgdVar instanceof tgd.e) {
                    Dialog dialog = clipsAudioFragment.s;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        ikv0.a aVar4 = new ikv0.a(clipsAudioFragment.go());
                        aVar4.o = 0;
                        aVar4.u = new ikv0.d(new ikv0.d.c(clipsAudioFragment.go().getString(R.string.clips_audio_dialog_recommended_time_selected)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                        aVar4.p(window);
                    }
                } else if (tgdVar instanceof tgd.a) {
                    clipsAudioFragment.fo().stop(32);
                    xn50.a.c(clipsAudioFragment, ngd.f.b);
                } else if (tgdVar instanceof tgd.f) {
                    clipsAudioFragment.fo().stop(32);
                } else if (tgdVar instanceof tgd.d) {
                    go1 go1Var = clipsAudioFragment.S;
                    if (go1Var != null) {
                        go1Var.invoke(((tgd.d) tgdVar).a);
                    }
                    clipsAudioFragment.dismiss();
                } else {
                    if (!(tgdVar instanceof tgd.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i8 = h7u0.p;
                    h7u0.a c = h7u0.b.c(clipsAudioFragment.go());
                    c.h0(clipsAudioFragment.go().getString(R.string.clips_audio_dialog_exit_title));
                    c.a.f = clipsAudioFragment.go().getString(R.string.clips_audio_dialog_exit_message);
                    c.X(clipsAudioFragment.go().getString(R.string.clips_audio_dialog_exit_cancel), null);
                    c.d0(clipsAudioFragment.go().getString(R.string.clips_audio_dialog_exit_confirm), new wgd(clipsAudioFragment, i2));
                    c.m();
                }
                return s3q0.a;
            default:
                rxd rxdVar = (rxd) obj2;
                rxdVar.d.onNext(Boolean.FALSE);
                rxdVar.d.onComplete();
                L.g("ClipsEditorDraftLoadingInteractor", (Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ ec(p66.c cVar, p66 p66Var) {
        this.b = 7;
        this.c = p66Var;
    }
}
