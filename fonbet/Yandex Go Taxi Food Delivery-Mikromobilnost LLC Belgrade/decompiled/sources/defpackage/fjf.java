package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.core.debug.panel.internal.presentation.view.CustomDialogView;

/* loaded from: classes2.dex */
public final class fjf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CustomDialogView b;
    public final /* synthetic */ int c;

    public /* synthetic */ fjf(CustomDialogView customDialogView, int i, int i2) {
        this.a = i2;
        this.b = customDialogView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        CustomDialogView customDialogView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = customDialogView.findViewById(i2);
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
                    View findViewById2 = customDialogView.findViewById(i2);
                    if (findViewById2 != null) {
                        return findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = customDialogView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (TextView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = customDialogView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (TextView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            default:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = customDialogView.findViewById(i2);
                    if (findViewById5 != null) {
                        return (TextView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
        }
    }
}
