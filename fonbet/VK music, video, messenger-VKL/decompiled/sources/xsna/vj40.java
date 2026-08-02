package xsna;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* compiled from: MusicErrorViewHelper.java */
@Deprecated
/* loaded from: classes3.dex */
public final class vj40 implements View.OnAttachStateChangeListener {
    public View b;
    public SparseArray<a> c;
    public View d;
    public TextView e;
    public z1q f;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: MusicErrorViewHelper.java */
    public static class a {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.vk.core.utils.newtork.b.a.getClass();
        this.g = com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cx00(this, 4));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g.dispose();
    }
}
