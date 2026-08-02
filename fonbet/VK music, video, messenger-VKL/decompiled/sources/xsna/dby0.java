package xsna;

import java.util.Map;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class dby0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ dby0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (Integer) ((Map.Entry) obj).getKey();
            case 1:
                return ((uny0) obj).a;
            default:
                return ((xmy0) obj).a;
        }
    }
}
