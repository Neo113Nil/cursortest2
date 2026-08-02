package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import org.webrtc.RenderSynchronizer;

/* loaded from: classes2.dex */
public final /* synthetic */ class esb implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ esb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gsb gsbVar = (gsb) obj;
                if (gsbVar.b) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j2 = gsbVar.e;
                    long j3 = uptimeMillis - j2;
                    if (j3 >= gsbVar.a) {
                        hoz hozVar = new hoz(j2, j3);
                        if (gsbVar.d == null) {
                            gsbVar.c.add(hozVar);
                        } else {
                            gsbVar.d.b(Collections.singletonList(hozVar));
                        }
                    }
                    gsbVar.e = uptimeMillis;
                    fsb.a.postFrameCallback(gsbVar.f);
                    break;
                }
                break;
            case 1:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                break;
            default:
                aaz0 aaz0Var = (aaz0) obj;
                if (!aaz0Var.h) {
                    aaz0Var.e = 0L;
                    break;
                } else {
                    aaz0Var.f = SystemClock.elapsedRealtime() - aaz0Var.e;
                    aaz0Var.h = false;
                    RecyclerView recyclerView = aaz0Var.b.a;
                    if (recyclerView != null) {
                        recyclerView.invalidate();
                    }
                    Choreographer choreographer = aaz0Var.c;
                    esb esbVar = aaz0Var.d;
                    choreographer.removeFrameCallback(esbVar);
                    choreographer.postFrameCallback(esbVar);
                    break;
                }
        }
    }
}
