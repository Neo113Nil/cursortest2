package xsna;

import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.TopBottomAnimView;
import com.vk.im.channelcreation.impl.h;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.reefton.dto.ReefHeartbeatType;
import com.vk.reefton.trackers.ReefContentStateTracker;
import com.vk.reefton.trackers.j;
import com.vk.reefton.trackers.l;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.toggle.Features;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import org.chromium.base.task.ChainedTasks;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.media.NativeAACCaptureAndEncode;
import ru.ok.proto.okmp.OkmpPublisher;
import xsna.nfp0;
import xsna.wl80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        Reef reef = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.c;
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                aboutAppFragment.finish();
                return;
            case 1:
                ((ml2) this.c).e.m0();
                return;
            case 2:
                ((dg8) this.c).i();
                return;
            case 3:
                ((ChainedTasks) this.c).lambda$start$0();
                return;
            case 4:
                mhy.j(((h.a) this.c).b);
                return;
            case 5:
                View view = (View) this.c;
                int i3 = ChatClipsReplyFragment.T;
                view.setVisibility(0);
                return;
            case 6:
                ((fzf) this.c).d();
                return;
            case 7:
                try {
                    com.vkontakte.android.data.b.n((nfp0.a) this.c, null, null);
                    return;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                }
            case 8:
                ((ExtraVideoSupplier) this.c).audioStartListener();
                return;
            case 9:
                ((AtomicBoolean) this.c).set(true);
                return;
            case 10:
                ((MoreOfferContainerView) this.c).a();
                return;
            case 11:
                NativeAACCaptureAndEncode.stop$lambda$1((NativeAACCaptureAndEncode) this.c);
                return;
            case 12:
                ((OkmpPublisher) this.c).checkTimeout();
                return;
            case 13:
                wl80.a aVar = (wl80.a) this.c;
                if (aVar.o()) {
                    return;
                }
                if (wl80.this.G == OneVideoPlayer.State.BUFFERING || wl80.this.G == OneVideoPlayer.State.PLAYING) {
                    wl80 wl80Var = wl80.this;
                    if (wl80Var.S) {
                        return;
                    }
                    BaseVideoPlayer.c(new cr20(wl80Var, 15), null);
                    wl80Var.S = true;
                    wl80Var.l.l(wl80Var);
                    return;
                }
                return;
            case 14:
                nza0 nza0Var = (nza0) this.c;
                if (com.vk.toggle.b.A.a(Features.Type.FEATURE_REEF)) {
                    if (jfv0.e != null) {
                        jfv0.b();
                        cnf0 cnf0Var = new cnf0(jfv0.e);
                        int i4 = 16;
                        cnf0Var.e = new d2c0(i4);
                        cnf0Var.i = new cfi0(7);
                        cnf0Var.h = new g2c0(i4);
                        cnf0Var.m = new qpt0(3);
                        cnf0Var.l = new z3x0(i2);
                        cnf0Var.f(ReefHeartbeatType.PLAYER, null, null);
                        Set<l.a> set = cnf0Var.c;
                        set.add(new j.b());
                        set.add(new ReefContentStateTracker.a());
                        cnf0Var.b = true;
                        if (!jfv0.k) {
                            cnf0Var.f = new vxl0(8);
                            cnf0Var.g = new ifv0(i);
                            cnf0Var.j = new hyd0(12);
                            cnf0Var.k = new im80(17);
                        }
                        if (BuildInfo.h()) {
                            L.e("REEF", "Init reef for video player on thread " + Thread.currentThread().getName());
                        }
                        reef = cnf0Var.a();
                    }
                    if (reef != null) {
                        nza0Var.c = reef;
                        if (nza0Var.q) {
                            nza0Var.f = new gof0(new com.vk.reefton.b(reef));
                            return;
                        }
                        if (((Boolean) nza0Var.d.getValue()).booleanValue()) {
                            hwl0 hwl0Var = (hwl0) nza0Var.e;
                            hwl0Var.a = reef;
                            owl0 owl0Var = hwl0Var.c;
                            if (owl0Var.c == null) {
                                i0q0.j(new h(10, owl0Var, reef));
                            }
                        } else {
                            nza0Var.e = new oy3(reef);
                        }
                        en80 en80Var = nza0Var.e;
                        if (en80Var != null) {
                            en80Var.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                throw ((Throwable) this.c);
            case 16:
                TopBottomAnimView.setVisibility$lambda$1$lambda$0((TopBottomAnimView) this.c);
                return;
            case 17:
                ((yads.m33) this.c).a();
                return;
            case 18:
                ((yads.qq2) this.c).a();
                return;
            default:
                yads.wg.a((yads.vg) this.c);
                return;
        }
    }
}
