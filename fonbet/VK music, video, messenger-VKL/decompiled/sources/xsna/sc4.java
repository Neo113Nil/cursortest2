package xsna;

import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.ironsource.P2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.ml.MLFeatures;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import com.vk.network.eventhub.impl.a;
import com.vk.network.eventhub.impl.c;
import com.vk.network.eventhub.impl.exception.FloodControlException;
import com.vk.network.eventhub.impl.exception.HandshakeException;
import com.vk.network.eventhub.impl.exception.InvalidTokenException;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import okhttp3.o;
import okhttp3.p;
import xsna.d5h;
import xsna.ikv0;
import xsna.j1n;
import xsna.tc4;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class sc4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sc4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        a.c P0;
        switch (this.b) {
            case 0:
                tc4.a aVar = (tc4.a) this.c;
                if (tc4.this.d) {
                    androidx.media3.exoplayer.c.this.U(3, false);
                    return;
                }
                return;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                com.vk.ml.b bVar = MLFeatures.a;
                MLFeatures.a(true);
                cameraUIView.getDeps().a.getClass();
                xkg.c.b = false;
                i0q0.f(new defpackage.r(cameraUIView, 16));
                return;
            case 2:
                vve.e(((nre) this.c).i, qve.a, false, false, 6);
                return;
            case 3:
                com.vk.clips.upload.vk.impl.uploader.f fVar = (com.vk.clips.upload.vk.impl.uploader.f) this.c;
                fVar.i.set(null);
                fVar.d.onCancel();
                return;
            case 4:
                d5h.c cVar = (d5h.c) this.c;
                cVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.COPY, (z4h.a) cVar.m, Integer.valueOf(((wak0) cVar.o).getIntValue())));
                return;
            case 5:
                jse0 jse0Var = ((x5n) this.c).c;
                if (jse0Var != null) {
                    jse0Var.f();
                    return;
                }
                return;
            case 6:
                EventHubServiceClient eventHubServiceClient = (EventHubServiceClient) this.c;
                while (true) {
                    EventHubServiceClient.Op take = eventHubServiceClient.m.take();
                    if (take instanceof EventHubServiceClient.Op.b) {
                        com.vk.network.eventhub.impl.a aVar2 = ((EventHubServiceClient.Op.b) take).b;
                        if (eventHubServiceClient.s != ConnectionState.DISCONNECTED) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient", "EventHubServiceClient.internalConnect return because current connectionState==" + eventHubServiceClient.s});
                            }
                        } else {
                            com.vk.network.eventhub.impl.b bVar2 = new com.vk.network.eventhub.impl.b(eventHubServiceClient, aVar2);
                            eventHubServiceClient.q.getClass();
                            com.vk.network.eventhub.impl.c.c();
                            long uptimeMillis = SystemClock.uptimeMillis() / 1000;
                            com.vk.network.eventhub.impl.c.k = Long.valueOf(uptimeMillis);
                            Preference.F(uptimeMillis, "master_service_perf_prefs", "connectRequestedTime");
                            com.vk.network.eventhub.impl.c.g();
                            eventHubServiceClient.n(ConnectionState.CONNECTING);
                            aVar2.Q0();
                            r1w0 r1w0Var = eventHubServiceClient.l;
                            o.a aVar3 = (o.a) r1w0Var.f.invoke();
                            long j = r1w0Var.d;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            aVar3.getClass();
                            aVar3.z = x2r0.b("interval", j, timeUnit);
                            Pair<Boolean, Long> pair = r1w0Var.h;
                            if (pair.i().booleanValue()) {
                                pair.j().longValue();
                            } else {
                                aVar3.a(new q1w0());
                            }
                            long longValue = pair.j().longValue();
                            if (longValue < 0) {
                                throw new IllegalArgumentException(defpackage.k0.a(longValue, "minWebSocketMessageToCompress must be positive: ").toString());
                            }
                            aVar3.A = longValue;
                            okhttp3.o oVar = new okhttp3.o(aVar3);
                            com.vk.network.websocket.internal.a aVar4 = new com.vk.network.websocket.internal.a(bVar2, r1w0Var.e, r1w0Var.g);
                            String str = (String) r1w0Var.c.invoke();
                            p.a aVar5 = new p.a();
                            aVar5.i(r1w0Var.a);
                            aVar5.c.h("User-Agent", r1w0Var.b);
                            aVar5.c.h("Sec-Websocket-Protocol", tdj.a(new StringBuilder(), r1w0Var.i, ", ", str));
                            okhttp3.p b = aVar5.b();
                            r1w0Var.a();
                            r1w0Var.j = oVar.f(b, aVar4);
                        }
                    } else if (take instanceof EventHubServiceClient.Op.c) {
                        EventHubServiceClient.Op.c cVar2 = (EventHubServiceClient.Op.c) take;
                        j1n j1nVar = cVar2.b;
                        com.vk.network.eventhub.impl.a aVar6 = cVar2.c;
                        AtomicBoolean atomicBoolean = cVar2.d;
                        pzp pzpVar = eventHubServiceClient.i.a;
                        if (pzpVar != null) {
                            ReentrantLock reentrantLock = pzpVar.b;
                            reentrantLock.lock();
                            try {
                                pzpVar.c.clear();
                                s3q0 s3q0Var = s3q0.a;
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                        if (j1nVar instanceof j1n.a) {
                            P0 = a.b.a;
                        } else if (j1nVar instanceof j1n.b) {
                            P0 = aVar6.P0(((j1n.b) j1nVar).a);
                        } else if (j1nVar instanceof j1n.f) {
                            P0 = aVar6.P0(((j1n.f) j1nVar).a);
                        } else if (j1nVar instanceof j1n.d) {
                            P0 = aVar6.P0(new HandshakeException(((j1n.d) j1nVar).toString()));
                        } else if (epx.f(j1nVar, j1n.c.a)) {
                            P0 = aVar6.P0(new FloodControlException());
                        } else {
                            if (!(j1nVar instanceof j1n.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            P0 = aVar6.P0(new InvalidTokenException(((j1n.e) j1nVar).c));
                        }
                        if (!(P0 instanceof a.e) && atomicBoolean.compareAndSet(true, false)) {
                            aVar6.N0();
                        }
                        if (epx.f(P0, a.e.a)) {
                            eventHubServiceClient.k(new EventHubServiceClient.Op.b(aVar6));
                        } else {
                            if (P0 instanceof a.f) {
                                throw ((a.f) P0).a;
                            }
                            if (!epx.f(P0, a.b.a)) {
                                if (P0 instanceof a.C1362a) {
                                    throw ((a.C1362a) P0).a;
                                }
                                if (!(P0 instanceof a.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw ((a.d) P0).a;
                            }
                            eventHubServiceClient.k(EventHubServiceClient.Op.a.b);
                        }
                    } else {
                        if (take instanceof EventHubServiceClient.Op.a) {
                            return;
                        }
                        if (!(take instanceof EventHubServiceClient.Op.NewMessage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EventHubServiceClient.Op.NewMessage newMessage = (EventHubServiceClient.Op.NewMessage) take;
                        int i = EventHubServiceClient.a.$EnumSwitchMapping$0[newMessage.c.ordinal()];
                        if (i == 1) {
                            eventHubServiceClient.l(newMessage.b);
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Message message = newMessage.b;
                            com.vk.network.eventhub.impl.c cVar3 = eventHubServiceClient.q;
                            try {
                                eventHubServiceClient.m(message);
                            } catch (IOException e) {
                                c.a.C1363a c1363a = new c.a.C1363a(e);
                                cVar3.getClass();
                                com.vk.network.eventhub.impl.c.e(c1363a);
                                eventHubServiceClient.k(new EventHubServiceClient.Op.NewMessage(message, EventHubServiceClient.Op.NewMessage.Type.OUTGOING));
                            } catch (InterruptedException e2) {
                                eventHubServiceClient.k(new EventHubServiceClient.Op.NewMessage(message, EventHubServiceClient.Op.NewMessage.Type.OUTGOING));
                                throw e2;
                            } catch (Exception e3) {
                                com.vk.metrics.eventtracking.b.a.a(e3);
                                c.a.C1364c c1364c = new c.a.C1364c(e3);
                                cVar3.getClass();
                                com.vk.network.eventhub.impl.c.e(c1364c);
                                eventHubServiceClient.k(new EventHubServiceClient.Op.NewMessage(message, EventHubServiceClient.Op.NewMessage.Type.OUTGOING));
                            }
                        }
                    }
                }
                break;
            case 7:
                f4m.j(((FastScrollerView) this.c).c);
                return;
            case 8:
                crx0.E((EditText) this.c, true);
                return;
            case 9:
                vky vkyVar = (vky) this.c;
                synchronized (vkyVar) {
                    AudioTrack audioTrack = vkyVar.d;
                    if (audioTrack != null && audioTrack.getPlayState() != 3) {
                        vkyVar.d.play();
                        synchronized (vkyVar.c) {
                            vkyVar.c.notify();
                        }
                    }
                }
                return;
            case 10:
                P2.c((P2) this.c);
                return;
            case 11:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i2 = PostingFragment.L0;
                ikv0.a aVar7 = new ikv0.a(postingFragment.requireContext());
                aVar7.t = new ikv0.c.C3058c(R.drawable.vk_icon_crop_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                aVar7.u = new ikv0.d(new ikv0.d.c(postingFragment.requireContext().getString(R.string.posting_crop_snackbar_title)), (ikv0.d.b) null, new ikv0.d.a(postingFragment.requireContext().getString(R.string.posting_crop_snackbar_button), null, qfc0.b, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                aVar7.n();
                return;
            case 12:
                ((androidx.media3.exoplayer.source.m) this.c).p();
                return;
            case 13:
                SimpleVideoView.h((SimpleVideoView) this.c);
                return;
            case 14:
                z370 z370Var = ((StoryReactionViewGroup) this.c).e;
                (z370Var != null ? z370Var : null).setVisibility(4);
                return;
            case 15:
                tnp0 tnp0Var = (tnp0) this.c;
                View view = tnp0Var.a;
                tnp0Var.f.removeCallbacksAndMessages(null);
                tnp0Var.h = false;
                tnp0Var.a();
                boolean[] zArr = tnp0Var.j;
                if (tnp0Var.k) {
                    int length = zArr.length;
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    for (int i3 = 0; viewGroup != null && i3 < length; i3++) {
                        viewGroup.setClipChildren(zArr[i3]);
                        s3q0 s3q0Var2 = s3q0.a;
                        ViewParent parent2 = viewGroup.getParent();
                        viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    }
                    tnp0Var.k = false;
                }
                view.setVisibility(0);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            case 16:
                VKSuperAppBrowserFragment vKSuperAppBrowserFragment = (VKSuperAppBrowserFragment) this.c;
                int i4 = VKSuperAppBrowserFragment.Y;
                Bundle arguments = vKSuperAppBrowserFragment.getArguments();
                String string = arguments != null ? arguments.getString("key_url") : null;
                afx0 afx0Var = e370.r;
                if (afx0Var != null) {
                    afx0Var.d(string, vKSuperAppBrowserFragment.mo());
                    return;
                }
                return;
            case 17:
                VideoView videoView = (VideoView) this.c;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                LinearLayout linearLayout = videoView.getViewBinding().J;
                if (linearLayout != null) {
                    d3m.e(linearLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    return;
                }
                return;
            default:
                ((ru.mail.libverify.api.s) this.c).K();
                return;
        }
    }
}
