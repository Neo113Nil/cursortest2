package xsna;

import android.view.View;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PreviewProfileVc.kt */
/* loaded from: classes2.dex */
public final class i5d0 implements View.OnAttachStateChangeListener {
    public io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public final /* synthetic */ h5d0 c;

    /* compiled from: PreviewProfileVc.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<f5d0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(f5d0 f5d0Var) {
            ((h5d0) this.receiver).a(f5d0Var);
            return s3q0.a;
        }
    }

    public i5d0(h5d0 h5d0Var) {
        this.c = h5d0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h5d0 h5d0Var = this.c;
        this.b = h5d0Var.u.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new skz(new a(1, h5d0Var, h5d0.class, "updateView", "updateView(Lcom/vk/im/ui/components/chat_profile/preview_profile/PreviewProfileData;)V", 0), 19));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.dispose();
    }
}
