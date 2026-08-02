package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;

/* loaded from: classes2.dex */
public final /* synthetic */ class ddr implements Choreographer.FrameCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ lwa0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ddr(edr edrVar, lwa0 lwa0Var, String str) {
        this.c = edrVar;
        this.b = lwa0Var;
        this.w = str;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                edr edrVar = (edr) obj2;
                lwa0 lwa0Var = new lwa0(SystemClock.uptimeMillis());
                edrVar.g.postDelayed(new l9(edrVar, this.b, lwa0Var, (String) obj, 13), edrVar.b);
                break;
            default:
                ((ResponsivenessTracker) obj2).a(((qwj0) obj).b, this.b, new lwa0(SystemClock.uptimeMillis()));
                break;
        }
    }

    public /* synthetic */ ddr(ResponsivenessTracker responsivenessTracker, qwj0 qwj0Var, lwa0 lwa0Var) {
        this.c = responsivenessTracker;
        this.w = qwj0Var;
        this.b = lwa0Var;
    }
}
