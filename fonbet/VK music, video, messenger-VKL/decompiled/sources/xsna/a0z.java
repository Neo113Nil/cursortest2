package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LeftSheetDelegate.java */
/* loaded from: classes13.dex */
public final class a0z extends cdj0 {
    public final SideSheetBehavior<? extends View> a;

    public a0z(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // xsna.cdj0
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // xsna.cdj0
    public final float b(int i) {
        float e = e();
        return (i - e) / (d() - e);
    }

    @Override // xsna.cdj0
    public final int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // xsna.cdj0
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.o + sideSheetBehavior.p);
    }

    @Override // xsna.cdj0
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return (-sideSheetBehavior.m) - sideSheetBehavior.p;
    }

    @Override // xsna.cdj0
    public final int f() {
        return this.a.p;
    }

    @Override // xsna.cdj0
    public final int g() {
        return -this.a.m;
    }

    @Override // xsna.cdj0
    public final <V extends View> int h(@NonNull V v) {
        return v.getRight() + this.a.p;
    }

    @Override // xsna.cdj0
    public final int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // xsna.cdj0
    public final int j() {
        return 1;
    }

    @Override // xsna.cdj0
    public final boolean k(float f) {
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.cdj0
    public final boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // xsna.cdj0
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // xsna.cdj0
    public final boolean n(@NonNull View view, float f) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        float abs = Math.abs((f * sideSheetBehavior.l) + left);
        sideSheetBehavior.getClass();
        return abs > 0.5f;
    }

    @Override // xsna.cdj0
    public final void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // xsna.cdj0
    public final void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.n) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
