package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import xsna.ao50;
import xsna.kj50;
import xsna.mk50;

/* compiled from: BaseMviViewController.kt */
/* loaded from: classes2.dex */
public abstract class fi6<S extends ao50, A extends kj50> extends ei6<S, A> {
    public final int b;
    public final my3 c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<mk50> e = io.reactivex.rxjava3.subjects.d.O0(mk50.a.a);

    public fi6(int i, my3 my3Var) {
        this.b = i;
        this.c = my3Var;
    }

    public void P(View view, View view2) {
        view2.setLayoutParams(view.getLayoutParams());
    }

    public abstract void Q(View view);

    @Override // xsna.wn50
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.b;
        my3 my3Var = this.c;
        if (my3Var == null) {
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            Q(inflate);
            return inflate;
        }
        if (viewGroup == null) {
            View inflate2 = layoutInflater.inflate(i, (ViewGroup) null, false);
            Q(inflate2);
            return inflate2;
        }
        Integer num = my3Var.b;
        View inflate3 = num != null ? layoutInflater.inflate(num.intValue(), viewGroup, false) : null;
        this.d.b(new nbu0(viewGroup.getContext()).a(i, viewGroup, new o43(5, this, viewGroup)));
        return inflate3;
    }

    @Override // xsna.wn50
    public void onDestroyView() {
        this.e.onNext(mk50.a.a);
        this.d.e();
    }
}
