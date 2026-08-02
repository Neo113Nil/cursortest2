package xsna;

import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gu2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gu2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ju2 ju2Var = (ju2) this.c;
                return ju2Var.a.invoke((com.vk.toggle.anonymous.a) this.d);
            default:
                ((VkMainTracker) this.c).v((Event) this.d);
                return s3q0.a;
        }
    }
}
