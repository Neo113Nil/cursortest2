package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;

/* loaded from: classes2.dex */
public final class k27 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ButtonSectionView b;
    public final /* synthetic */ int c;

    public /* synthetic */ k27(ButtonSectionView buttonSectionView, int i, int i2) {
        this.a = i2;
        this.b = buttonSectionView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ButtonSectionView buttonSectionView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = buttonSectionView.findViewById(i2);
                    if (findViewById != null) {
                        return (FrameLayout) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById2 = buttonSectionView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (e0d0) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.api.PlusAcquisitionPurchaseButton");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = buttonSectionView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (TextView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            default:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = buttonSectionView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ProgressBar) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
        }
    }
}
