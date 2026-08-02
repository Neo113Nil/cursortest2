package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: ModernSmallPlayerView.kt */
/* loaded from: classes3.dex */
public final class o630 implements View.OnAttachStateChangeListener {
    public final io.reactivex.rxjava3.disposables.g b = new io.reactivex.rxjava3.disposables.g();
    public final /* synthetic */ p630 c;

    /* compiled from: ModernSmallPlayerView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<yj40, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(yj40 yj40Var) {
            p630.Q4((p630) this.receiver, yj40Var);
            return s3q0.a;
        }
    }

    public o630(p630 p630Var) {
        this.c = p630Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        this.b.b(r5v0Var.a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cw(new a(1, this.c, p630.class, "onMusicEvent", "onMusicEvent(Lcom/vk/music/events/MusicEvent;)V", 0), 28)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.b(null);
    }
}
