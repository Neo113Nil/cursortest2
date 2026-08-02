package xsna;

import android.graphics.Bitmap;
import android.media.metrics.PlaybackErrorEvent;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.group.Group;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import xsna.e4t0;
import xsna.v14;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tou implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tou(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, xsna.dw20] */
    @Override // java.lang.Runnable
    public final void run() {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                uou uouVar = (uou) obj2;
                Group group = (Group) obj;
                uouVar.f.getClass();
                epu.d(group);
                uouVar.d(group);
                return;
            case 1:
                ((ps10) obj2).e.reportPlaybackErrorEvent((PlaybackErrorEvent) obj);
                return;
            case 2:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj2;
                List list = (List) obj;
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    int r1 = aVar.r1();
                    int i2 = 1;
                    int i3 = 0;
                    boolean z = list.size() > 1;
                    defpackage.u uVar = new defpackage.u(21, list, aVar);
                    v14.a aVar2 = new v14.a(vm30Var.a, null);
                    aVar2.e = new kk1(i2);
                    aVar2.f = new ig(i2);
                    int i4 = R.string.vkim_popup_download_attaches_single_message;
                    aVar2.g = R.string.vkim_popup_download_attaches_single_message;
                    aVar2.h = r1;
                    if (z) {
                        i4 = R.string.vkim_popup_download_attaches_multiple_message;
                    }
                    aVar2.g = i4;
                    aVar2.e = uVar;
                    aVar2.f = new vv20(vm30Var, 2);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    x14 x14Var = new x14(aVar2.c);
                    aVar2.D0(x14Var, false);
                    aVar2.q(true);
                    aVar2.p(true);
                    aVar2.a0(aVar2.f);
                    aVar2.c0(new t14(i3, ref$ObjectRef));
                    int i5 = v14.f1;
                    ref$ObjectRef.element = aVar2.I0("v14");
                    x14Var.setCancelAction(new u14(i3, aVar2, ref$ObjectRef));
                    x14Var.setMsgRes(aVar2.g);
                    x14Var.setProgress(aVar2.h);
                    vm30Var.u0 = (v14) ref$ObjectRef.element;
                    return;
                }
                return;
            case 3:
                ((PeerConnectionClient) obj2).a((String) obj);
                return;
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj;
                int i6 = PostFragment.S0;
                PostViewFragmentTimeSpentTracker Co = ((PostFragment) obj2).Co();
                if (Co != null) {
                    Co.a(recyclerView);
                    return;
                }
                return;
            case 5:
                VideoPlayerMode videoPlayerMode = (VideoPlayerMode) obj2;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) ((yg5) obj);
                if (e4t0.a == videoPlayerMode && epx.f(e4t0.b, videoAutoPlay.u.a1())) {
                    return;
                }
                e4t0.a = videoPlayerMode;
                e4t0.b = videoAutoPlay.u.a1();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                switch (e4t0.a.$EnumSwitchMapping$0[videoPlayerMode.ordinal()]) {
                    case 1:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
                        break;
                    case 2:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
                        break;
                    case 3:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
                        break;
                    case 4:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
                        break;
                    case 5:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.MINIMIZED;
                        break;
                    case 6:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PIP_EXTERNAL;
                        break;
                    case 7:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PIP_INTERNAL;
                        break;
                    case 8:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
                        break;
                    case 9:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.CHROMECAST;
                        break;
                    case 10:
                        mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DLNA;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode2 = mobileOfficialAppsVideoStat$TypeScreenMode;
                int position = (int) (videoAutoPlay.getPosition() / 1000);
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
                Long valueOf = Long.valueOf(videoAutoPlay.u.o0());
                Long valueOf2 = Long.valueOf(videoAutoPlay.u.I0().b);
                m7q m7qVar = videoAutoPlay.k0;
                new iid0(c, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoPlayerChangeMode(mobileOfficialAppsVideoStat$TypeScreenMode2, position, new SchemeStat$EventItem(type, valueOf, valueOf2, null, m7qVar != null ? m7qVar.g : null, null, 40, null), new CommonVideoStat$TypeVsidItem(videoAutoPlay.K), null, Long.valueOf(System.currentTimeMillis()), 16, null), 3)).q();
                return;
            case 6:
                com.mbridge.msdk.config.dynamic.utils.image.b.b((Bitmap) obj2, (ImageView) obj);
                return;
            default:
                zwy0 zwy0Var = (zwy0) obj2;
                Throwable th = (Throwable) obj;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandError(th);
                    } catch (Throwable th2) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th2);
                    }
                }
                return;
        }
    }
}
