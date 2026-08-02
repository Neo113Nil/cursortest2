package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rvy0 {
    public static int b;
    public final SparseIntArray a = new SparseIntArray();
    public static final int c = d();
    public static final int d = d();
    public static final int e = d();
    public static final int f = d();
    public static final int g = d();
    public static final int h = d();
    public static final int i = d();
    public static final int j = d();
    public static final int k = d();
    public static final int l = d();
    public static final int m = d();
    public static final int n = d();
    public static final int o = d();
    public static final int p = d();
    public static final int q = d();
    public static final int r = d();
    public static final int s = d();
    public static final int t = d();
    public static final int u = d();
    public static final int v = d();
    public static final int w = d();
    public static final int x = d();
    public static final int y = d();
    public static final int z = d();
    public static final int A = d();
    public static final int B = d();
    public static final int C = d();
    public static final int D = d();
    public static final int E = d();
    public static final int F = d();
    public static final int G = d();
    public static final int H = d();
    public static final int I = d();

    public rvy0(Context context) {
        boolean z2 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        c(c, 724315791);
        c(d, 1711276032);
        c(e, -3806472);
        c(f, 724315791);
        c(g, 1040187391);
        c(h, -1711276033);
        c(l, -1555741356);
        c(i, -52409);
        c(n, -14251797);
        c(o, -1685946);
        c(k, 335544320);
        int i2 = m;
        c(i2, -2144588498);
        c(j, -1315344);
        c(p, -1);
        int i3 = A;
        c(i3, -3158065);
        c(E, z2 ? 1711276032 : -1560281088);
        c(B, z2 ? -1 : -14251797);
        int i4 = z2 ? -1543503873 : -1557755669;
        int i5 = C;
        c(i5, i4);
        c(i2, -2144588498);
        c(i3, -3158065);
        c(q, z2 ? -6907233 : -9602939);
        c(w, z2 ? 452984831 : 167772160);
        c(x, z2 ? -16119286 : -1315344);
        c(r, z2 ? -15132390 : -1);
        c(s, z2 ? -1 : -16777216);
        c(v, z2 ? -9013126 : -8287079);
        c(i5, z2 ? -1543503873 : -1557755669);
        c(y, z2 ? -16777216 : -1);
        c(z, z2 ? -9602939 : -6907233);
        c(F, z2 ? -13224136 : -2631463);
        int i6 = z2 ? -11362572 : -14251797;
        int i7 = G;
        c(i7, i6);
        int i8 = z2 ? -10657951 : -4668980;
        int i9 = H;
        c(i9, i8);
        c(D, z2 ? 352321535 : 335544320);
        c(i7, z2 ? -11362572 : -14251797);
        c(i9, z2 ? -10657951 : -4668980);
        c(t, z2 ? -1973274 : -13882066);
        c(u, z2 ? -9013126 : -6708563);
        c(I, z2 ? -14474460 : -657931);
    }

    public static StateListDrawable b(float f2, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i4);
        gradientDrawable.setCornerRadius(f2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadius(f2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setColor(i2);
        gradientDrawable3.setCornerRadius(f2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, new RippleDrawable(ColorStateList.valueOf(i3), gradientDrawable3, gradientDrawable2));
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable2.addState(new int[]{R.attr.state_enabled}, stateListDrawable);
        return stateListDrawable2;
    }

    public static int d() {
        int i2 = b;
        b = i2 + 1;
        return i2;
    }

    public final ShapeDrawable a(float f2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(this.a.get(D));
        shapeDrawable.getPaint().setStrokeWidth(f2);
        return shapeDrawable;
    }

    public final void c(int i2, int i3) {
        this.a.put(i2, i3);
    }
}
