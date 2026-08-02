package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.RadioButtonView;

/* loaded from: classes2.dex */
public final class d6i0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RadioButtonView b;
    public final /* synthetic */ int c;

    public /* synthetic */ d6i0(RadioButtonView radioButtonView, int i, int i2) {
        this.a = i2;
        this.b = radioButtonView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        RadioButtonView radioButtonView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = radioButtonView.findViewById(i2);
                    if (findViewById != null) {
                        return (Guideline) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = radioButtonView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ConstraintLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById3 = radioButtonView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (f9f0) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.ProductTexts");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = radioButtonView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ImageView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            default:
                kgx kgxVar5 = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById5 = radioButtonView.findViewById(i2);
                    if (findViewById5 != null) {
                        return (xn4) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.Badges");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
        }
    }
}
