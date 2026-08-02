package xsna;

import com.vk.clips.design.view.recording.StopwatchView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class igl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ igl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                StopwatchView stopwatchView = (StopwatchView) this.c;
                stopwatchView.j = false;
                Iterator it = new ArrayList(stopwatchView.c).iterator();
                while (it.hasNext()) {
                    ((StopwatchView.a) it.next()).b(stopwatchView);
                }
                break;
            case 1:
                dou0 dou0Var = (dou0) this.c;
                if (sxc0.b(dou0Var.a)) {
                    dou0Var.b(dou0Var.e);
                    break;
                }
                break;
            default:
                ((com.my.tracker.obfuscated.a) this.c).c();
                break;
        }
    }
}
