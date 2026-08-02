package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment;

/* loaded from: classes2.dex */
public final class blz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogsFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ blz(LogsFragment logsFragment, int i, int i2) {
        this.a = i2;
        this.b = logsFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        LogsFragment logsFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = logsFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (Button) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = logsFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (ImageButton) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = logsFragment.requireView().findViewById(i2);
                    if (findViewById3 != null) {
                        return (Spinner) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Spinner");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = logsFragment.requireView().findViewById(i2);
                    if (findViewById4 != null) {
                        return (FloatingActionButton) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            default:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = logsFragment.requireView().findViewById(i2);
                    if (findViewById5 != null) {
                        return (RecyclerView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
        }
    }
}
