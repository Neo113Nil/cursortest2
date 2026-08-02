package xsna;

import java.util.function.ToIntFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class bey0 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ bey0(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        tly0 tly0Var = (tly0) obj;
        switch (this.a) {
            case 0:
                return tly0Var.q();
            default:
                return tly0Var.c.stream().filter(new mjy0(0)).mapToInt(new njy0()).sum();
        }
    }
}
