package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.dy5;

/* compiled from: BufferEmitProcessorFactory.kt */
/* loaded from: classes9.dex */
public final class bm8 {
    public static final <T> am8<T> a(dy5 dy5Var, vq70<T> vq70Var, pcn pcnVar) {
        if (dy5Var instanceof dy5.a) {
            ((dy5.a) dy5Var).getClass();
            return new yl8(vq70Var, 128, pcnVar);
        }
        if (dy5Var instanceof dy5.b) {
            return new zl8(vq70Var, 0, pcnVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
