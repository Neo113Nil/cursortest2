package xsna;

import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b7x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7x(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                c7xVar.f(th);
                return c7xVar.e(th);
            default:
                ((VkMainTracker) this.c).v((Event) this.d);
                return s3q0.a;
        }
    }
}
