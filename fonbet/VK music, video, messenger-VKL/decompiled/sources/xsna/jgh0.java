package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Scroll.kt */
/* loaded from: classes11.dex */
public final class jgh0 implements khh0 {
    public static final fh9 j = new fh9(new mq2(10), new uuz(23));
    public final rg50 a;
    public float f;
    public final rg50 b = androidx.compose.runtime.i.a(0);
    public final rg50 c = androidx.compose.runtime.i.a(0);
    public final tg50 d = new tg50();
    public final rg50 e = androidx.compose.runtime.i.a(Integer.MAX_VALUE);
    public final bml g = new bml(new r820(this, 22));
    public final f1m h = bbk0.b(new v100(this, 25));
    public final f1m i = bbk0.b(new fr20(this, 29));

    public jgh0(int i) {
        this.a = androidx.compose.runtime.i.a(i);
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.g.a();
    }

    @Override // xsna.khh0
    public final Object b(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        Object b = this.g.b(mutatePriority, wzsVar, spjVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    @Override // xsna.khh0
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.g.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final int f() {
        return ((wak0) this.e).getIntValue();
    }
}
