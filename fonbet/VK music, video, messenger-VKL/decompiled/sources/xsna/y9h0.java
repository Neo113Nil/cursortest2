package xsna;

import java.util.Objects;
import java.util.function.Function;
import xsna.x9h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class y9h0 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.toString((x9h0.a) obj);
            default:
                return ((String) obj).toLowerCase();
        }
    }
}
