package xsna;

import com.vk.ml.api.tf.TensorflowFacade;

/* compiled from: CommonMLFacade.kt */
/* loaded from: classes.dex */
public final class xkg implements xb00 {
    public static final xkg a = new xkg();
    public static final z9o0 b;
    public static final yb00 c;

    static {
        z9o0 z9o0Var = new z9o0();
        b = z9o0Var;
        c = new yb00(z9o0Var);
    }

    @Override // xsna.xb00
    public final TensorflowFacade a() {
        return b;
    }

    @Override // xsna.xb00
    public final yb00 b() {
        return c;
    }
}
