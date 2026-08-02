package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class de9 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ de9(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.b) {
            case 0:
                L.g("Camera1View", th);
                break;
            default:
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
        }
    }
}
