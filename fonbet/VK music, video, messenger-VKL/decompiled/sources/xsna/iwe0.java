package xsna;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import xsna.xgl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class iwe0 implements Supplier {
    public final /* synthetic */ int b;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return ThreadLocalRandom.current();
            default:
                xgl0.a aVar = xgl0.a.a;
                return null;
        }
    }
}
