package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyView;

/* loaded from: classes2.dex */
public final class i7d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusPanelStatusAndFamilyView b;
    public final /* synthetic */ int c;

    public /* synthetic */ i7d0(PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView, int i, int i2) {
        this.a = i2;
        this.b = plusPanelStatusAndFamilyView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusPanelStatusAndFamilyView.findViewById(i2);
                    if (findViewById != null) {
                        return (ViewGroup) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusPanelStatusAndFamilyView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ViewGroup) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = plusPanelStatusAndFamilyView.findViewById(i2);
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
                    View findViewById4 = plusPanelStatusAndFamilyView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ImageView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            case 4:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = plusPanelStatusAndFamilyView.findViewById(i2);
                    if (findViewById5 != null) {
                        return findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
            case 5:
                kgx kgxVar6 = (kgx) obj;
                try {
                    return (ImageView) plusPanelStatusAndFamilyView.findViewById(i2);
                } catch (ClassCastException e6) {
                    dy31.f(kgxVar6, e6);
                    return null;
                }
            default:
                kgx kgxVar7 = (kgx) obj;
                try {
                    return (TextView) plusPanelStatusAndFamilyView.findViewById(i2);
                } catch (ClassCastException e7) {
                    dy31.f(kgxVar7, e7);
                    return null;
                }
        }
    }
}
