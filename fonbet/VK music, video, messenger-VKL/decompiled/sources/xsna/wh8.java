package xsna;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.video.dto.VideoStopStreamingResponseDto;
import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class wh8 extends io.reactivex.rxjava3.observers.a {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ pk6 d;

    public wh8(pmz pmzVar) {
        this.d = pmzVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        switch (this.c) {
            case 0:
                qh8 qh8Var = (qh8) this.d;
                qh8Var.v = null;
                LiveStatNew liveStatNew = qh8Var.g0;
                qh8Var.h.H();
                liveStatNew.getClass();
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_EVENT, "disconnected");
                liveStatNew.b(bundle);
                qyk0.a().e("live_action", bundle);
                qh8Var.Q(BroadcastContract$State.END_SCREEN);
                qh8Var.d();
                LiveStatNew liveStatNew2 = qh8Var.g0;
                if (liveStatNew2 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_type", "stop_streaming");
                    liveStatNew2.b(bundle2);
                    qyk0.a().e("live_action", bundle2);
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                L.i(th);
                qh8 qh8Var = (qh8) this.d;
                qh8Var.v = null;
                qh8Var.Q(BroadcastContract$State.END_SCREEN);
                qh8Var.d();
                break;
            default:
                mmz mmzVar = ((pmz) this.d).e;
                mmzVar.getRecommendedView().setProgressVisibility(false);
                mmzVar.getRecommendedView().setErrorVisibility(true);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        switch (this.c) {
            case 0:
                VideoStopStreamingResponseDto videoStopStreamingResponseDto = (VideoStopStreamingResponseDto) obj;
                qh8 qh8Var = (qh8) this.d;
                qh8Var.e0 = videoStopStreamingResponseDto.e() == null ? 0 : videoStopStreamingResponseDto.e().intValue();
                qh8Var.f0 = new ArrayList(j2r0.b(videoStopStreamingResponseDto.d()).values());
                break;
            default:
                pmz pmzVar = (pmz) this.d;
                mmz mmzVar = pmzVar.e;
                mmzVar.getRecommendedView().setProgressVisibility(false);
                mmzVar.getRecommendedView().setErrorVisibility(false);
                pmzVar.j.Q(false);
                pmzVar.t = (List) obj;
                pmzVar.o1();
                if (pmzVar.s >= 1) {
                    pmzVar.c.K();
                }
                pmzVar.s++;
                break;
        }
    }

    public wh8(qh8 qh8Var, j2r0 j2r0Var) {
        this.d = qh8Var;
    }

    private final void a() {
    }
}
