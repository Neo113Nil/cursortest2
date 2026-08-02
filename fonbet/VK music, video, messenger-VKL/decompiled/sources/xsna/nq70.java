package xsna;

import com.vk.reefton.literx.SimpleDisposable;

/* compiled from: ObservableError.kt */
/* loaded from: classes5.dex */
public final class nq70<T> extends iq70<T> {
    public final Exception b;

    public nq70(Exception exc) {
        this.b = exc;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        er70Var.a(new SimpleDisposable());
        er70Var.onError(this.b);
    }
}
