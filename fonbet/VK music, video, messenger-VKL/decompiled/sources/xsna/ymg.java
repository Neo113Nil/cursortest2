package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ymg implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.b) {
            case 0:
                h03.b(th);
                break;
            default:
                L.i(th);
                break;
        }
    }
}
