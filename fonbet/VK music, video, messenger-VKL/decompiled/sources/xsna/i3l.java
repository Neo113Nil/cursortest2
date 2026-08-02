package xsna;

import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import ru.ok.tracer.profiler.sampling.SamplingProfiler;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class i3l implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ i3l(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String[] strArr = DebugDevSettingsFragment.t0;
                o260 o260Var = d260.a;
                (o260Var != null ? o260Var : null).h().refresh();
                break;
            case 1:
                t9o t9oVar = tci.e;
                tci.f = false;
                tci.e = null;
                if (t9oVar != null) {
                    t9oVar.d();
                    break;
                }
                break;
            case 2:
                SamplingProfiler.onStart$lambda$3();
                break;
        }
    }

    private final void a() {
    }
}
