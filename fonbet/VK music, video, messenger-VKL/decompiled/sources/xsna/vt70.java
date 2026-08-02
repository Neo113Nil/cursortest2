package xsna;

import ru.ok.tracer.profiler.sampling.SamplingProfiler;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt70 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ vt70() {
        this.b = 1;
        io.reactivex.rxjava3.subjects.e eVar = pk90.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                if (tci.e == null && !tci.f) {
                    t9o t9oVar = new t9o(null, false);
                    tci.e = t9oVar;
                    t9oVar.a();
                    tci.f = true;
                    break;
                }
                break;
            case 1:
                io.reactivex.rxjava3.subjects.e eVar = pk90.a;
                pk90.a();
                break;
            case 2:
                SamplingProfiler.abort$lambda$2();
                break;
        }
    }

    public /* synthetic */ vt70(int i) {
        this.b = i;
    }

    private final void a() {
    }
}
