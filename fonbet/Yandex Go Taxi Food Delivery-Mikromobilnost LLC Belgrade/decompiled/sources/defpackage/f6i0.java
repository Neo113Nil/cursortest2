package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.RadioGroupView;

/* loaded from: classes2.dex */
public final class f6i0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RadioGroupView b;
    public final /* synthetic */ int c;

    public /* synthetic */ f6i0(RadioGroupView radioGroupView, int i, int i2) {
        this.a = i2;
        this.b = radioGroupView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        RadioGroupView radioGroupView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = radioGroupView.findViewById(i2);
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
                    View findViewById2 = radioGroupView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (LinearLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            default:
                kgx kgxVar3 = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById3 = radioGroupView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (k8f0) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.ProductExpandTexts");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
        }
    }
}
