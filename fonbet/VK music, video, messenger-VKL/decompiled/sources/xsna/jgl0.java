package xsna;

import com.vk.clips.design.view.recording.StopwatchView;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jgl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jgl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        switch (this.b) {
            case 0:
                StopwatchView stopwatchView = (StopwatchView) this.c;
                long j = stopwatchView.f;
                long j2 = stopwatchView.i;
                if (j2 > 0) {
                    long j3 = j2 - 1;
                    stopwatchView.i = j3;
                    stopwatchView.setText(j3 != 0 ? String.valueOf(j3) : "");
                    if (stopwatchView.i <= 0) {
                        stopwatchView.postDelayed(stopwatchView.d, j);
                        return;
                    }
                    Iterator<StopwatchView.a> it = stopwatchView.c.iterator();
                    while (it.hasNext()) {
                        stopwatchView.postDelayed(new ov(it.next(), 15), j);
                    }
                    stopwatchView.postDelayed(stopwatchView.e, 1000L);
                    return;
                }
                return;
            case 1:
                ((gsp0) this.c).b();
                return;
            default:
                alq0 alq0Var = (alq0) this.c;
                synchronized (alq0Var.g) {
                    try {
                        z = false;
                        if (alq0Var.g.isMarked()) {
                            str = alq0Var.g.getReference();
                            alq0Var.g.set(str, false);
                            z = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    alq0Var.a.i(alq0Var.c, str);
                    return;
                }
                return;
        }
    }
}
