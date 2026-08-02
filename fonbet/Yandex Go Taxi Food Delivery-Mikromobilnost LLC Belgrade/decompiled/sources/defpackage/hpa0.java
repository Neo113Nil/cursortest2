package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.divkit.challenger.DKChallengerInputView;

/* loaded from: classes2.dex */
public final class hpa0 implements zo31 {
    public final DKChallengerInputView a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;
    public final EditText r;

    public hpa0(DKChallengerInputView dKChallengerInputView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view2, View view3, View view4, View view5, View view6, View view7, View view8, EditText editText) {
        this.a = dKChallengerInputView;
        this.b = view;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
        this.j = textView8;
        this.k = view2;
        this.l = view3;
        this.m = view4;
        this.n = view5;
        this.o = view6;
        this.p = view7;
        this.q = view8;
        this.r = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
