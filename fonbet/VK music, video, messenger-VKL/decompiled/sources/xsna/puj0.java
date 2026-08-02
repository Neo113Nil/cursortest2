package xsna;

import com.vk.reefton.literx.SimpleDisposable;

/* compiled from: SingleJust.kt */
/* loaded from: classes5.dex */
public final class puj0<T> extends dtj0<T> {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public puj0(tnf0 tnf0Var) {
        this.a = tnf0Var;
    }

    @Override // xsna.dtj0
    public final void a(xuj0<T> xuj0Var) {
        xuj0Var.a(new SimpleDisposable());
        xuj0Var.onSuccess(this.a);
    }
}
