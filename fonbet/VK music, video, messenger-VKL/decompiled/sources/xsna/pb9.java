package xsna;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class pb9 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((jkh0) obj).b;
            default:
                int intValue = ((Integer) obj).intValue();
                List list = Collections.EMPTY_LIST;
                return new wl5(intValue);
        }
    }
}
