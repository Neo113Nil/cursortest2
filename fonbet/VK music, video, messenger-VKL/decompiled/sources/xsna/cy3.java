package xsna;

import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.f;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.gleffects.util.AsyncEffectResourceProvider;
import xsna.a9q0;
import xsna.l0n0;
import xsna.l0n0.a.RunnableC3222a;
import xsna.snw;
import xsna.ub9;
import xsna.vo9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class cy3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cy3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        ugz ugzVar;
        switch (this.b) {
            case 0:
                ((AsyncEffectResourceProvider) this.c).lambda$getEffectResourcepackFile$0((o7j) this.d);
                return;
            case 1:
                nx5 nx5Var = (nx5) this.c;
                Object obj = this.d;
                if (nx5Var.f == 0) {
                    nx5Var.c(obj);
                    return;
                }
                return;
            case 2:
                re9 re9Var = (re9) this.c;
                ub9.a aVar = (ub9.a) this.d;
                zvr zvrVar = re9Var.i;
                if (!zvrVar.d) {
                    aVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                f.a aVar2 = new f.a();
                aVar2.c = 1;
                aVar2.e = true;
                androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                androidx.camera.core.impl.a aVar3 = if9.t;
                z.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), 1);
                aVar2.c(new if9(androidx.camera.core.impl.o.y(z)));
                aVar2.b(new awr(aVar));
                zvrVar.a.m(Collections.singletonList(aVar2.d()));
                return;
            case 3:
                vo9 vo9Var = (vo9) this.c;
                ub9.a aVar4 = (ub9.a) this.d;
                synchronized (vo9Var.b) {
                    try {
                        vo9Var.e.removeCallbacksAndMessages("retry_token");
                        int i = vo9.a.a[vo9Var.k.ordinal()];
                        if (i == 1) {
                            vo9Var.k = vo9.b.SHUTDOWN;
                            ugzVar = snw.c.c;
                        } else {
                            if (i == 2) {
                                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                            }
                            if (i == 3) {
                                vo9Var.k = vo9.b.SHUTDOWN;
                                vo9Var.l = ub9.a(new k7(vo9Var, 4));
                            }
                            ugzVar = vo9Var.l;
                        }
                    } finally {
                    }
                }
                r0t.f(true, ugzVar, aVar4, xo9.g());
                return;
            case 4:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                sq60 sq60Var = (sq60) this.d;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                a9q0 a9q0Var = sq60Var.h;
                if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
                    bs60.b(faveFeedFragment.go().d());
                    faveFeedFragment.go().d().c();
                }
                if (!faveFeedFragment.go().c().A0(sq60Var.a)) {
                    faveFeedFragment.q0.d(sq60Var, (tc60) faveFeedFragment.go().q.getValue(), faveFeedFragment.O.get());
                }
                faveFeedFragment.go().d().l();
                return;
            case 5:
                ((sg40) this.c).e.n((MusicTrack) this.d, CorruptedReason.MALFORMED);
                return;
            case 6:
                PhotoEditorView photoEditorView = (PhotoEditorView) this.c;
                gzs gzsVar = (gzs) this.d;
                photoEditorView.D = null;
                photoEditorView.v();
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            case 7:
                pro0.c(new a2j0(((dev0) this.c).refresh(), (com.vk.core.view.components.spinner.c) this.d));
                return;
            case 8:
                ((SharedPeerConnectionFactory) this.c).b((SharedPeerConnectionFactory.AudioEventsListener) this.d);
                return;
            case 9:
                l0n0.a aVar5 = (l0n0.a) this.c;
                l0n0 l0n0Var = (l0n0) this.d;
                l0n0.a.RunnableC3222a runnableC3222a = aVar5.c;
                if (runnableC3222a != null && !runnableC3222a.b && l0n0.f != null) {
                    l0n0.a aVar6 = l0n0.a.this;
                    int i2 = l0n0.this.c;
                    String g0 = j5g.g0(aVar6.b, null, null, null, 0, null, 63);
                    AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.SUBSTITUTION_SERVICE_STUCK);
                    aggregateEventBuilder.v(0, i2);
                    aggregateEventBuilder.w(0, g0);
                    aggregateEventBuilder.q();
                }
                l0n0.a.RunnableC3222a runnableC3222a2 = aVar5.new RunnableC3222a();
                aVar5.c = runnableC3222a2;
                l0n0Var.d.submit(runnableC3222a2);
                return;
            case 10:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2((IUnityAdsInitializationListener) this.c, (Throwable) this.d);
                return;
            case 11:
                mgx0 mgx0Var = (mgx0) this.c;
                CommunityInviteLink communityInviteLink = (CommunityInviteLink) this.d;
                pnx pnxVar = mgx0Var.b;
                Intent intent = new Intent();
                intent.putExtra("link", communityInviteLink);
                s3q0 s3q0Var = s3q0.a;
                pnxVar.f(intent);
                return;
            default:
                ((com.my.tracker.obfuscated.n1) this.c).b((List) this.d);
                return;
        }
    }
}
