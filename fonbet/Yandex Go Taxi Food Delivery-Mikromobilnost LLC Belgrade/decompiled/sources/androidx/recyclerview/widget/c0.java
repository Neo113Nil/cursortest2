package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends d0 {
    @Override // androidx.recyclerview.widget.d0
    public final int b(View view) {
        return this.a.h0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.a.k0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.a.l0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int e(View view) {
        return this.a.n0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        return this.a.I;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int g() {
        RecyclerView.e eVar = this.a;
        return eVar.I - eVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int h() {
        return this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int i() {
        return this.a.G;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int j() {
        return this.a.F;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int k() {
        return this.a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int l() {
        RecyclerView.e eVar = this.a;
        return (eVar.I - eVar.getPaddingTop()) - eVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(View view) {
        RecyclerView.e eVar = this.a;
        Rect rect = this.c;
        eVar.w0(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int o(View view) {
        RecyclerView.e eVar = this.a;
        Rect rect = this.c;
        eVar.w0(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void p(int i) {
        this.a.F0(i);
    }
}
