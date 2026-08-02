package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes13.dex */
public final class okg0 extends cdj0 {
    public final SideSheetBehavior<? extends View> a;

    public okg0(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // xsna.cdj0
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // xsna.cdj0
    public final float b(int i) {
        float f = this.a.n;
        return (f - i) / (f - d());
    }

    @Override // xsna.cdj0
    public final int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // xsna.cdj0
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, (sideSheetBehavior.n - sideSheetBehavior.m) - sideSheetBehavior.p);
    }

    @Override // xsna.cdj0
    public final int e() {
        return this.a.n;
    }

    @Override // xsna.cdj0
    public final int f() {
        return this.a.n;
    }

    @Override // xsna.cdj0
    public final int g() {
        return d();
    }

    @Override // xsna.cdj0
    public final <V extends View> int h(@NonNull V v) {
        return v.getLeft() - this.a.p;
    }

    @Override // xsna.cdj0
    public final int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // xsna.cdj0
    public final int j() {
        return 0;
    }

    @Override // xsna.cdj0
    public final boolean k(float f) {
        return f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.cdj0
    public final boolean l(@NonNull View view) {
        return view.getLeft() > (d() + this.a.n) / 2;
    }

    @Override // xsna.cdj0
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // xsna.cdj0
    public final boolean n(@NonNull View view, float f) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        float abs = Math.abs((f * sideSheetBehavior.l) + right);
        sideSheetBehavior.getClass();
        return abs > 0.5f;
    }

    @Override // xsna.cdj0
    public final void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // xsna.cdj0
    public final void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.n;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
