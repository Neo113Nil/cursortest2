package xsna;

import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import xsna.jkp0;

/* compiled from: TransformNotifierExt.kt */
/* loaded from: classes3.dex */
public final class kkp0 implements jkp0.a {
    public final /* synthetic */ jkp0 a;
    public final /* synthetic */ ThreadStuckAnalyzer b;

    public kkp0(jkp0 jkp0Var, ThreadStuckAnalyzer threadStuckAnalyzer) {
        this.a = jkp0Var;
        this.b = threadStuckAnalyzer;
    }

    @Override // xsna.jkp0.a
    public final void a(int i) {
        this.a.a.a(i);
        ThreadStuckAnalyzer threadStuckAnalyzer = this.b;
        threadStuckAnalyzer.h = true;
        threadStuckAnalyzer.i = false;
    }

    @Override // xsna.jkp0.a
    public final void b(int i) {
        this.a.a.b(i);
        ThreadStuckAnalyzer threadStuckAnalyzer = this.b;
        threadStuckAnalyzer.h = true;
        threadStuckAnalyzer.i = false;
    }
}
