package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.android.gms.internal.cast.zzpm;
import com.vk.videomessage.impl.BackgroundBlurView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import ru.mail.libverify.j.b;
import xsna.y8x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class aw5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aw5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex10 c;
        switch (this.b) {
            case 0:
                BackgroundBlurView backgroundBlurView = (BackgroundBlurView) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                backgroundBlurView.b = false;
                izs<Bitmap, s3q0> blurCallback = backgroundBlurView.getBlurCallback();
                if (blurCallback != null) {
                    blurCallback.invoke(bitmap);
                    return;
                }
                return;
            case 1:
                Context context = (Context) this.c;
                nw10 nw10Var = (nw10) this.d;
                ArrayList arrayList = oz9.a;
                exc0.e("Must be called from the main thread.");
                if (nw10Var != null) {
                    exc0.e("Must be called from the main thread.");
                    uz9 g = uz9.g(context);
                    if (g != null && (c = g.c()) != null) {
                        nw10Var.setRouteSelector(c);
                    }
                    synchronized (oz9.d) {
                        oz9.c.add(new WeakReference(nw10Var));
                    }
                }
                com.google.android.gms.internal.cast.zzr.zzb(zzpm.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
                return;
            case 2:
                ((VideoSink.a) this.c).onVideoSizeChanged((xgt0) this.d);
                return;
            case 3:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.c;
                Future future = (Future) this.d;
                int i = VideoSeekPreviewImage.q;
                try {
                    videoSeekPreviewImage.post(new iv1(videoSeekPreviewImage, 15));
                    videoSeekPreviewImage.post(new ja3(8, videoSeekPreviewImage, (Bitmap) future.get()));
                    return;
                } catch (Exception e) {
                    videoSeekPreviewImage.post(new e6(9, e, videoSeekPreviewImage));
                    return;
                }
            case 4:
                ((oeu0) this.c).Ln((View) this.d);
                return;
            case 5:
                y8x0 y8x0Var = (y8x0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                y8x0.a aVar = y8x0Var.a;
                aVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new ger(3, aVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 6:
                b.C2205b.a((ru.mail.libverify.j.b) this.c, (List) this.d);
                return;
            default:
                ((ru.ok.android.webrtc.protocol.screenshare.recv.c) this.c).a((z3z0) this.d);
                return;
        }
    }
}
