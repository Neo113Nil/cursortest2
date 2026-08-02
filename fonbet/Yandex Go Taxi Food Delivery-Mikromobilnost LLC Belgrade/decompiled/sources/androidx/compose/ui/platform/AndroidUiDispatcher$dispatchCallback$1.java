package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Lzy11;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ f this$0;

    public AndroidUiDispatcher$dispatchCallback$1(f fVar) {
        this.this$0 = fVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        this.this$0.c.removeCallbacks(this);
        f.R(this.this$0);
        f fVar = this.this$0;
        synchronized (fVar.w) {
            if (fVar.B) {
                fVar.B = false;
                ArrayList arrayList = fVar.y;
                fVar.y = fVar.z;
                fVar.z = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(frameTimeNanos);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        f.R(this.this$0);
        f fVar = this.this$0;
        synchronized (fVar.w) {
            if (fVar.y.isEmpty()) {
                fVar.b.removeFrameCallback(this);
                fVar.B = false;
            }
        }
    }
}
