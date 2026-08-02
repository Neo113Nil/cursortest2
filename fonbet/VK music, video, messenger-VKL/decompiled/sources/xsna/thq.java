package xsna;

import android.opengl.GLES20;
import android.os.Handler;
import com.vk.core.serialize.Serializer;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class thq implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ thq(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                GLES20.glClear(16640);
                break;
            case 1:
                boolean z = false;
                if (!fmr.e) {
                    Handler handler = fmr.a;
                    HashSet<String> hashSet = fmr.b;
                    if (!hashSet.isEmpty() && fmr.f) {
                        z = izi0.j(fmr.c, fmr.d).containsAll(hashSet);
                    }
                }
                if (z) {
                    fmr.e = true;
                    Handler handler2 = fmr.a;
                    handler2.removeCallbacks(fmr.h);
                    handler2.removeCallbacks(fmr.g);
                    break;
                }
                break;
            default:
                Serializer.c<TargetSharingTask> cVar = TargetSharingTask.CREATOR;
                break;
        }
    }
}
