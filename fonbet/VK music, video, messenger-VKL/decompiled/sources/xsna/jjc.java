package xsna;

import android.view.View;

/* compiled from: ClickWithLockExt.kt */
/* loaded from: classes17.dex */
public final class jjc {
    public static final bpn0 a = new bpn0(new uz(4));

    public static final void a(gzs<s3q0> gzsVar) {
        if (d().a()) {
            return;
        }
        gzsVar.invoke();
    }

    public static final boolean b() {
        return d().a();
    }

    public static final boolean c(long j) {
        return d().b(j);
    }

    public static final pxo0 d() {
        return (pxo0) a.getValue();
    }

    public static final boolean e() {
        return d().c();
    }

    public static final void f(View.OnClickListener onClickListener, View view) {
        if (onClickListener == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new q01(onClickListener, 2));
        }
    }

    public static final void g(View view, izs<? super View, s3q0> izsVar) {
        if (izsVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new ijc(400L, izsVar));
        }
    }

    public static final q01 h(View.OnClickListener onClickListener) {
        return new q01(onClickListener, 2);
    }
}
