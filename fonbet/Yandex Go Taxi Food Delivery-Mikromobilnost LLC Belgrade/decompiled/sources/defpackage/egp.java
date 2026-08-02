package defpackage;

import android.view.View;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public final class egp {
    public final View a;
    public final View b;
    public final AnimatedListItemInputComponent c;
    public final AnimatedListItemInputComponent d;
    public final AnimatedListItemInputComponent e;
    public final AnimatedListItemInputComponent f;
    public final AnimatedListItemInputComponent g;
    public final AnimatedListItemInputComponent h;
    public final AnimatedListItemInputComponent i;

    public egp(View view, View view2, AnimatedListItemInputComponent animatedListItemInputComponent, AnimatedListItemInputComponent animatedListItemInputComponent2, AnimatedListItemInputComponent animatedListItemInputComponent3, AnimatedListItemInputComponent animatedListItemInputComponent4, AnimatedListItemInputComponent animatedListItemInputComponent5, AnimatedListItemInputComponent animatedListItemInputComponent6, AnimatedListItemInputComponent animatedListItemInputComponent7, kfp kfpVar) {
        d(animatedListItemInputComponent, kfpVar);
        this.c = animatedListItemInputComponent;
        this.a = view;
        this.b = view2;
        d(animatedListItemInputComponent2, kfpVar);
        this.d = animatedListItemInputComponent2;
        d(animatedListItemInputComponent3, kfpVar);
        this.e = animatedListItemInputComponent3;
        d(animatedListItemInputComponent4, kfpVar);
        this.f = animatedListItemInputComponent4;
        d(animatedListItemInputComponent5, kfpVar);
        this.g = animatedListItemInputComponent5;
        d(animatedListItemInputComponent6, kfpVar);
        this.h = animatedListItemInputComponent6;
        d(animatedListItemInputComponent7, kfpVar);
        this.i = animatedListItemInputComponent7;
    }

    public static int c(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static void d(AnimatedListItemInputComponent animatedListItemInputComponent, kfp kfpVar) {
        animatedListItemInputComponent.setOnKeyboardClosed(new c1o(15, animatedListItemInputComponent));
        animatedListItemInputComponent.setOnFocusStateChanged(new dzm(19, kfpVar));
    }

    public final String a() {
        return nnm.k(this.c);
    }

    public final void b() {
        this.c.clearInputFocus();
        this.d.clearInputFocus();
        this.e.clearInputFocus();
        this.f.clearInputFocus();
        this.g.clearInputFocus();
        this.h.clearInputFocus();
        this.i.clearInputFocus();
    }
}
