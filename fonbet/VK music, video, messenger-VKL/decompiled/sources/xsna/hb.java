package xsna;

import android.content.Context;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.avatar.api.VKAvatarView;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.donut.a;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.rlottie.RLottieDrawable;
import com.vk.toggle.features.ImFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.am;
import xsna.aw9;
import xsna.ca9;
import xsna.cwb0;
import xsna.eqe;
import xsna.lab;
import xsna.nab;
import xsna.pwb;
import xsna.px9;
import xsna.rgd;
import xsna.rre;
import xsna.tj50;
import xsna.uxd0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class hb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v89, types: [xsna.j8i, xsna.smb$a] */
    /* JADX WARN: Type inference failed for: r1v93, types: [xsna.dqb$a, xsna.j8i] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 invoke$lambda$1;
        ArrayList arrayList;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        oo9 cameraView;
        SurfaceView c;
        oo9 cameraView2;
        SurfaceView c2;
        int i = 6;
        int i2 = 8;
        int i3 = 15;
        int i4 = 10;
        int i5 = 1;
        r7 = null;
        r7 = null;
        Object obj2 = null;
        int i6 = 0;
        switch (this.b) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
                int i7 = AbsFriendsAndFollowersTabFragment.X;
                pls fo = absFriendsAndFollowersTabFragment.fo();
                fo.a.setVisibility(8);
                fo.e.setVisibility(8);
                fo.b.setVisibility(0);
                fo.c.setVisibility(8);
                fo.d.setVisibility(8);
                fo.f.setVisibility(8);
                fo.g.setSeparatorAllowed(false);
                break;
            case 1:
                invoke$lambda$1 = AdRevenueObserver.invoke$lambda$1((AdRevenueObserver) this.c, (Throwable) obj);
                break;
            case 2:
                xn50.a.c(((com.vk.photos.root.albumdetails.presentation.c) this.c).c, new a.v(((k.c.C1491c) obj).a));
                break;
            case 3:
                ((e4) this.c).invoke();
                break;
            case 4:
                kn3 kn3Var = (kn3) this.c;
                TextView textView = kn3Var.n;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                textView.getContext();
                e.b bVar = new e.b(textView, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.l = kn3Var.p;
                VkContextMenu a = bVar.a();
                kn3Var.o = a;
                a.g();
                break;
            case 5:
                aw3 aw3Var = (aw3) this.c;
                bzb0.d(aw3Var.h, new cwb0.a1(R.string.voip_asr_stop_submit_title, null, R.string.voip_asr_stop_submit_subtitle, null, R.string.voip_asr_stop_submit_yes, null, R.string.voip_asr_stop_submit_no, null, null, null, 938), new yg(aw3Var, i), null, null, 28);
                break;
            case 6:
                wy3 wy3Var = (wy3) this.c;
                ez3 ez3Var = wy3Var.a;
                ez3Var.m = false;
                RLottieDrawable rLottieDrawable = wy3Var.b;
                rLottieDrawable.m();
                AtomicBoolean atomicBoolean = ez3Var.p;
                if (!atomicBoolean.get() && ez3Var.c) {
                    rLottieDrawable.l();
                    atomicBoolean.set(true);
                }
                rLottieDrawable.h();
                break;
            case 7:
                com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b bVar2 = (com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) this.c;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                g47Var.e(tci.l(bVar2.eo()), md5.b);
                g47Var.a(tci.k(bVar2.eo()));
                g47Var.d(new b.C2000b(bVar2.eo()));
                break;
            case 8:
                iq5 iq5Var = (iq5) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                wh50 wh50Var = iq5Var.p;
                ((zak0) wh50Var).setValue(bool);
                String str = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? "share_to_story_turn_on" : "share_to_story_turn_off";
                b.d dVar = new b.d("change_avatar_screen_actions");
                dVar.b(str, "event_type");
                dVar.e();
                break;
            case 9:
                VkBadge.Appearance.Design design = (VkBadge.Appearance.Design) this.c;
                VkBadge vkBadge = new VkBadge((Context) obj, null, 6);
                vkBadge.setAppearance(design);
                break;
            case 10:
                ((r46) this.c).k(new uxd0.w((Throwable) obj));
                break;
            case 11:
                am amVar = (am) obj;
                Context context = ((VKAvatarView) this.c).getContext();
                amVar.b(new am.a(16, context != null ? context.getString(R.string.accessibility_video_author_avatar_tap_action) : null));
                break;
            case 12:
                lo8 lo8Var = (lo8) this.c;
                if (!epx.f(((xpp) obj).a(), Boolean.FALSE)) {
                    break;
                } else {
                    break;
                }
            case 13:
                ((i330) this.c).b((CallParticipantsViewModel.b) obj);
                break;
            case 14:
                m99 m99Var = (m99) this.c;
                if (m99Var.j().c instanceof ca9.c) {
                    m99Var.p.dispose();
                    m99Var.p = io.reactivex.rxjava3.kotlin.c.e(xa4.I(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new i5(4, m99Var, m99Var.j().a), 3)).q(m99Var.i).m(m99Var.j), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), new p99(m99Var, 0), new bw6(m99Var, 1));
                } else {
                    m99Var.p();
                }
                break;
            case 15:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) this.c;
                ActionLinks actionLinks = (ActionLinks) obj;
                if (actionLinks != null && (arrayList = actionLinks.d) != null) {
                    i6 = arrayList.size();
                }
                aVar.n0 = i6;
                CameraUIView cameraUIView = aVar.b;
                cameraUIView.setAttachCollectionSize(i6);
                if (i6 < 1 && aVar.i.G) {
                    cameraUIView.setAttachCollectionSize(1);
                }
                aVar.l0 = actionLinks;
                break;
            case 16:
                ((vw9) this.c).T(new px9.h.a((Cart) j5g.a0(((wy9) obj).a)));
                break;
            case 17:
                z9a z9aVar = (z9a) this.c;
                List<Playlist> list = (List) obj;
                nt70 nt70Var = new nt70(z9aVar.e);
                nt70Var.m = list;
                mt70 a2 = nt70Var.a(z9aVar.f);
                z9aVar.i.getClass();
                break;
            case 18:
                com.vk.channels.impl.donut.b bVar3 = (com.vk.channels.impl.donut.b) this.c;
                ((ikv0) obj).a();
                bVar3.b.invoke(a.d.b);
                break;
            case 19:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i8 = ChannelFragment.a1;
                eg20 eg20Var = channelFragment.ro().k;
                eg20Var.getClass();
                eg20Var.j.b(new io.reactivex.rxjava3.internal.operators.single.v(new the(new gd0(11, eg20Var, (DialogTheme) obj), i5)).q(eg20Var.i).subscribe());
                break;
            case 20:
                kab kabVar = (kab) this.c;
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException != null && vKApiExecutionException.s() == 15 && vKApiExecutionException.C() == 185) {
                    kabVar.k.b(nab.a.a);
                    kabVar.j.b(lab.a.a);
                }
                L.i(th);
                break;
            case 21:
                ?? r1 = ((smb) this.c).c;
                if (r1 != 0) {
                    r1.c0();
                }
                break;
            case 22:
                ((dqb) this.c).c.w0((Throwable) obj);
                break;
            case 23:
                pwb.a aVar2 = ((pwb) this.c).l;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                if (!com.vk.toggle.b.A.a(imFeatures)) {
                    break;
                } else {
                    break;
                }
            case 24:
                ((z4c) this.c).T(new aw9.b((com.vk.ecomm.cart.impl.checkout.feature.state.f) obj, false));
                break;
            case 25:
                rgd rgdVar = (rgd) this.c;
                int intValue = ((Integer) obj).intValue();
                rgd.a aVar3 = rgdVar.b;
                jpd jpdVar = aVar3.d;
                jpdVar.b.i.y = false;
                jpdVar.u(false);
                CameraUIView cameraUIView2 = aVar3.a;
                zd9 camera1View = cameraUIView2.getCamera1View();
                if (camera1View != null && (cameraView2 = camera1View.getCameraView()) != null && (c2 = cameraView2.c()) != null) {
                    obj2 = c2.getParent();
                }
                View view = (View) obj2;
                if (view == null) {
                    new Size(0, 0);
                } else {
                    int measuredHeight = cameraUIView2.getMeasuredHeight();
                    Context context2 = cameraUIView2.getContext();
                    HashSet hashSet = iah0.a;
                    int a3 = measuredHeight - fnj.a(context2);
                    zd9 camera1View2 = cameraUIView2.getCamera1View();
                    if (camera1View2 != null && (cameraView = camera1View2.getCameraView()) != null && (c = cameraView.c()) != null) {
                        i6 = c.getHeight();
                    }
                    int min = Math.min(i6, a3);
                    view.setClipToOutline(true);
                    view.setOutlineProvider(new co9(view));
                    int a4 = y8g0.a(R.dimen.editor_music_preview_top_margin);
                    float min2 = Math.min((((a3 - intValue) - a4) - y8g0.a(R.dimen.editor_music_preview_bottom_margin)) / a3, (iah0.f().widthPixels - y8g0.a(R.dimen.editor_music_preview_width_margin)) / iah0.f().widthPixels);
                    float f = (((1.0f - min2) * (-view.getMeasuredHeight())) / 2.0f) + a4;
                    zd9 camera1View3 = cameraUIView2.getCamera1View();
                    if (camera1View3 != null && (animate = camera1View3.animate()) != null && (translationY = animate.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (interpolator = translationY.setInterpolator(new AccelerateDecelerateInterpolator())) != null && (duration = interpolator.setDuration(350L)) != null) {
                        duration.start();
                    }
                    view.animate().scaleX(min2).scaleY(min2).translationY(f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(350L).start();
                    new Size((int) (view.getMeasuredWidth() * min2), (int) (min * min2));
                }
                break;
            case 26:
                tj50.a aVar4 = (tj50.a) obj;
                fnd fndVar = (fnd) ((dnd) this.c).d.getValue();
                fndVar.getClass();
                dz dzVar = new dz(fndVar, i4);
                ao8 ao8Var = ao8.d;
                break;
            case 27:
                jkq0 jkq0Var = (jkq0) this.c;
                break;
            case 28:
                nre nreVar = (nre) this.c;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                nreVar.p = false;
                List e = ums0.e(ums0.a, new fgg0(shortVideoGetOwnerVideosResponseDto.e()), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                Integer i9 = shortVideoGetOwnerVideosResponseDto.i();
                String g = (i9 != null ? i9.intValue() : 0) > 0 ? shortVideoGetOwnerVideosResponseDto.g() : null;
                nreVar.T(new rre.a(42, null, null, g, e));
                hqe hqeVar = nreVar.o;
                if (hqeVar != null) {
                    List list2 = e;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(nreVar.j.c((VideoFile) it.next()));
                    }
                    hqeVar.b(new eqe.b(g, arrayList2, false));
                }
                break;
            default:
                r1f r1fVar = (r1f) this.c;
                List list3 = (List) obj;
                if (!list3.isEmpty()) {
                    r1fVar.d.c(list3);
                }
                break;
        }
        return s3q0.a;
    }
}
