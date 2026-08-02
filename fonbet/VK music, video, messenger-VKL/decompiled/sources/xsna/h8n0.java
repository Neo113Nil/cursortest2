package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.market.api.web.di.MarketWebComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment.c;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.HashSet;
import java.util.Locale;
import xsna.h7u0;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h8n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Activity c;
        int i = this.b;
        boolean z = false;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = SuperAppFragment.o0;
                ((mqe0) obj).invoke();
                return Boolean.TRUE;
            case 1:
                fyn0 fyn0Var = (fyn0) obj;
                return new gyn0(fyn0Var.n, fyn0Var.i);
            case 2:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj;
                VkTopBar vkTopBar = toolbarRedesignVh.r;
                if (vkTopBar == null || (c = g2u0.c(vkTopBar)) == null || s200.v(c) == null) {
                    Context b = toolbarRedesignVh.b();
                    HashSet hashSet = iah0.a;
                    if (!fnj.d(b)) {
                        z = true;
                    }
                } else {
                    Context b2 = toolbarRedesignVh.b();
                    HashSet hashSet2 = iah0.a;
                    z = !fnj.d(b2);
                }
                return Boolean.valueOf(z);
            case 3:
                ((ww50) obj).J();
                return s3q0.a;
            case 4:
                u9q0 u9q0Var = ((y9q0) obj).a;
                int i4 = u9q0Var.m;
                if (i4 != 0) {
                    u9q0Var.i.add(Integer.valueOf(i4));
                    u9q0Var.b.c(u9q0Var.m);
                    u9q0Var.a.b.invoke(Integer.valueOf(u9q0Var.m));
                    u9q0Var.d.onNext(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
                    io.reactivex.rxjava3.disposables.c cVar = u9q0Var.g;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    u9q0Var.g = null;
                    u9q0Var.j = null;
                }
                return s3q0.a;
            case 5:
                User user = (User) obj;
                Serializer.c<User> cVar2 = User.CREATOR;
                user.getClass();
                return user.Q2(UserNameCase.NOM).toLowerCase(Locale.getDefault());
            case 6:
                wm80 wm80Var = ((cpq0) obj).c;
                if (wm80Var != null) {
                    wm80Var.invoke();
                }
                return s3q0.a;
            case 7:
                return ((vxq0) obj).b;
            case 8:
                return ((NotificationsComponent) m7m.d(((UsersDiscoverPresenter) obj).b).a(fpf0.a(NotificationsComponent.class))).b();
            case 9:
                VideoAboutFragment videoAboutFragment = (VideoAboutFragment) obj;
                int i5 = VideoAboutFragment.S;
                com.vk.video.kidsprofile.restricteduseractions.a e2 = ((VideoRestrictedUserActionsComponent) m7m.d(videoAboutFragment).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
                q530 b3 = ((ModerationComponent) m7m.d(videoAboutFragment).mo408a(fpf0.a(ModerationComponent.class))).pa().b(videoAboutFragment.requireContext(), videoAboutFragment.getViewLifecycleOwner(), false);
                l7v b4 = ((InfoBridgeComponent) m7m.d(videoAboutFragment).a(fpf0.a(InfoBridgeComponent.class))).t().b();
                VideoAboutFragment.c cVar3 = videoAboutFragment.new c();
                NotificationsPermission V = ((VideoNotificationsPermissionComponent) m7m.d(videoAboutFragment).a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
                Context requireContext = videoAboutFragment.requireContext();
                HashSet hashSet3 = iah0.a;
                return new com.vk.libvideo.bottomsheet.about.delegate.c(b4, cVar3, V, fnj.d(requireContext), new vpn0(e2, 7), new sni(15), fxc0.B().s(), b3);
            case 10:
                return VideoEditTimelineView.V4((VideoEditTimelineView) obj);
            case 11:
                int i6 = VideoRelatedVideosFragment.n0;
                return ((AuthBridgeComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 12:
                return VideoSkippablePartView.h((VideoSkippablePartView) obj);
            case 13:
                ((VideoTooltip.a) obj).a();
                return s3q0.a;
            case 14:
                ggu0 ggu0Var = (ggu0) obj;
                return new mov0(ggu0Var.r, ggu0Var.d, ggu0Var.e, new dck0(ggu0Var, 20), new clt0(ggu0Var, 4));
            case 15:
                ((ihu0) obj).a.d.t(true);
                return s3q0.a;
            case 16:
                return ((MarketWebComponent) ((k7m) m7m.f((oxv0) obj)).mo408a(fpf0.a(MarketWebComponent.class))).gc();
            case 17:
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.sizeLimit", 2147483648L);
                ((VideoUploadFragment) obj).startActivityForResult(intent, IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION);
                return s3q0.a;
            case 18:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i7 = VoipCallServiceFragment.Y;
                rhw0.f fVar = rhw0.f.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, fVar);
                return s3q0.a;
            case 19:
                return (ViewFlipper) LayoutInflater.from(((sow0) obj).a).inflate(R.layout.voip_call_group_selector_view, (ViewGroup) null);
            case 20:
                return (RecyclerView) ((oxw0) obj).findViewById(R.id.voip_schedule_call_recycler);
            case 21:
                Activity activity = (Activity) obj;
                h7u0.a aVar = new h7u0.a(activity);
                aVar.U(R.string.log_out_warning);
                aVar.g0(R.string.log_out);
                aVar.c0(R.string.yes, new tld(activity, i2));
                aVar.W(R.string.no, null);
                aVar.m();
                return s3q0.a;
            default:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                int i8 = WebViewFragment.O0;
                nr4.b().w(webViewFragment.kn(), webViewFragment.requireArguments().getString("url_to_copy"), webViewFragment.t0, null, null, false);
                return null;
        }
    }
}
