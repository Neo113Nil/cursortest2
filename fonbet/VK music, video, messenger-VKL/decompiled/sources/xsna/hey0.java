package xsna;

import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class hey0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hey0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                jey0 jey0Var = (jey0) this.b;
                jey0Var.b.f((ihy0) obj, aF.d, new hey0(jey0Var, 0));
                break;
            default:
                ((vmy0) this.b).f.remove(((xmy0) obj).b.p());
                break;
        }
    }
}
