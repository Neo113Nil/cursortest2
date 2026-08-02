package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qvo implements r800 {
    public final /* synthetic */ int a;

    public /* synthetic */ qvo(int i) {
        this.a = i;
    }

    @Override // xsna.r800
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            default:
                L.i(th);
                break;
        }
    }
}
