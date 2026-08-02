package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: ActionButton.kt */
/* loaded from: classes7.dex */
public abstract class ku<S, V extends View> {
    public final gzs<s3q0> a;
    public V b;
    public final io.reactivex.rxjava3.subjects.d<S> c = io.reactivex.rxjava3.subjects.d.N0();

    public ku(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    public final View a(ViewGroup viewGroup, izs izsVar, boolean z) {
        V v = this.b;
        if (v != null) {
            return v;
        }
        V e = e(z ? viewGroup.getContext() : new l7s(viewGroup.getContext(), R.style.VoipPrimaryButtons));
        bwt0.p0(e, z);
        h(e);
        bwt0.i0(e, new ju(0, this, e));
        viewGroup.addView(e);
        this.b = e;
        izsVar.invoke(this.c);
        return e;
    }

    public final void b(ViewGroup viewGroup) {
        V v = this.b;
        if (v == null) {
            return;
        }
        viewGroup.removeView(v);
        this.b = null;
        f();
    }

    public boolean c() {
        return false;
    }

    public void d(V v) {
        gzs<s3q0> gzsVar = this.a;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public abstract V e(Context context);

    public final void i(S s) {
        this.c.onNext(s);
    }

    public void f() {
    }

    public void h(V v) {
    }

    public void g(View view, Object obj) {
    }
}
