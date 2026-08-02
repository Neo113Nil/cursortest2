package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment;

/* loaded from: classes2.dex */
public final class etv implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ InfoFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ etv(InfoFragment infoFragment, int i, int i2) {
        this.a = i2;
        this.b = infoFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        InfoFragment infoFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = infoFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (RecyclerView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = infoFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (Button) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            default:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = infoFragment.requireView().findViewById(i2);
                    if (findViewById3 != null) {
                        return (Button) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
        }
    }
}
