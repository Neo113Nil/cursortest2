package xsna;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.impl.CameraCaptureFailure;
import com.vk.cameraui.utils.TipsPriority;
import com.vk.core.tips.TipAnchorView;
import java.util.PriorityQueue;
import java.util.concurrent.CountDownLatch;
import ru.ok.media.StreamingLaunchScheduler;
import ru.ok.media.api.StreamerState;
import xsna.j40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qe9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qe9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j40.a poll;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gg9) obj2).c((CameraCaptureFailure) obj);
                break;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj2;
                frameLayout.removeAllViews();
                frameLayout.addView((v0f0) obj);
                break;
            case 2:
                baf bafVar = (baf) obj2;
                View view = (View) obj;
                if (bafVar.d) {
                    bafVar.d = false;
                    j40.a aVar = new j40.a(TipsPriority.DUET_RECORDING.ordinal(), new cy0(6, view, bafVar));
                    j40 j40Var = bafVar.a;
                    PriorityQueue<j40.a> priorityQueue = j40Var.b;
                    priorityQueue.add(aVar);
                    if (j40Var.a == null && (poll = priorityQueue.poll()) != null) {
                        j40Var.a = poll;
                        poll.c.invoke();
                        break;
                    }
                }
                break;
            case 3:
                ((gzs) obj2).invoke();
                ((CountDownLatch) obj).countDown();
                break;
            case 4:
                ((f5z) obj2).getLifecycle().addObserver(((v530) obj).c);
                break;
            case 5:
                ((androidx.media3.transformer.y) obj2).i((Bitmap) obj);
                break;
            case 6:
                StreamingLaunchScheduler.access$handleStreamerState((StreamingLaunchScheduler) obj2, (StreamerState) obj);
                break;
            case 7:
                int i2 = TipAnchorView.m;
                ((Handler) obj2).removeCallbacksAndMessages(null);
                ((b990) obj).invoke();
                break;
            case 8:
                uyy0 uyy0Var = (uyy0) obj2;
                kiw kiwVar = (kiw) obj;
                uyy0Var.getClass();
                Size c = uyy0Var.c(kiwVar.b, kiwVar.c);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c.getWidth(), c.getHeight());
                layoutParams.gravity = 17;
                m0z0 m0z0Var = uyy0Var.p;
                m0z0Var.getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                m0z0Var.getImageView().setLayoutParams(layoutParams);
                break;
            case 9:
                yads.ps.b((yads.ps) obj2, (yads.g9) obj);
                break;
            default:
                yads.ts.a((yads.ts) obj2, (yads.g9) obj);
                break;
        }
    }
}
