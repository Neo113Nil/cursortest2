package xsna;

import androidx.camera.view.PreviewView;
import androidx.media3.common.VideoFrameProcessingException;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.translate.impl.views.TranslateFailedView;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import java.util.List;
import kotlin.Triple;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import xsna.dgh;
import xsna.fit;
import xsna.kms0;
import xsna.o0u;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tp1 implements io.reactivex.rxjava3.functions.l, VideoTracker, io.reactivex.rxjava3.functions.m, o0u.a, h9l, TranslateFailedView.a, f0t, ub9.c, m6o {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tp1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.o0u.a
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((kms0.c) this.c).a(videoFrameProcessingException);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((sp1) this.c).invoke(obj);
            case 1:
                return (Boolean) ((ci3) this.c).invoke(obj);
            case 2:
                return (qa7) ((ci3) this.c).invoke(obj);
            case 3:
                return (k8x0) ((ci3) this.c).invoke(obj);
            case 4:
            case 8:
            case 10:
            case 14:
            case 16:
            case 17:
            case 19:
            case 22:
            case 26:
            default:
                return (kru) ((gvs) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((yx0) this.c).invoke(obj);
            case 6:
                return (List) ((lt0) this.c).invoke(obj);
            case 7:
                return ((dgh.d) this.c).invoke(obj);
            case 9:
                return (List) ((ci3) this.c).invoke(obj);
            case 11:
                return (b0l0) ((ci3) this.c).invoke(obj);
            case 12:
                return (List) ((wl2) this.c).invoke(obj);
            case 13:
                return (WebApiApplication) ((fit.j) this.c).invoke(obj);
            case 15:
                return (Triple) ((eqq) this.c).invoke(obj);
            case 18:
                return (Boolean) ((q140) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.b0) ((d0w) this.c).invoke(obj);
            case 21:
                return (String) ((d0w) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.o) ((eoa0) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((d0w) this.c).invoke(obj);
            case 25:
                ((androidx.camera.view.b) this.c).a(PreviewView.StreamState.STREAMING);
                return null;
            case 27:
                return (ncq0) ((d0w) this.c).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ghd0 ghd0Var = (ghd0) this.c;
        synchronized (ghd0Var.a) {
            ghd0Var.k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // xsna.m6o
    public double b(double d) {
        return ((njg0) this.c).n.b(swe0.e(d, r0.e, r0.f));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.VideoTracker
    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((sc9) this.c).a.b.invoke()).booleanValue();
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new i2r((NewsfeedRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 8:
                break;
            case 19:
                break;
            default:
                int i2 = PictureInPictureOverlayService.g;
                break;
        }
        return ((Boolean) ((gvs) obj2).invoke(obj)).booleanValue();
    }
}
