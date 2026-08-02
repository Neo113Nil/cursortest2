package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.CustomBottomSheetBehavior;
import com.yandex.fintechsdk.entities.theme.Theme;

/* loaded from: classes12.dex */
public final class og6 {
    public final Activity a;
    public final View b;
    public final int c;
    public final int d;
    public final View e;
    public final View f;
    public final Theme g;
    public BottomSheetBehavior h;
    public CustomBottomSheetBehavior i;
    public boolean j = true;
    public final c06 k;
    public boolean l;

    public og6(Activity activity, View view, int i, int i2, View view2, l95 l95Var, View view3, Theme theme) {
        this.a = activity;
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = view2;
        this.f = view3;
        this.g = theme;
        this.k = new c06(l95Var);
    }
}
