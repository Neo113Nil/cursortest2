package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hp31;

/* loaded from: classes.dex */
public final class p0 implements hp31 {
    public final /* synthetic */ RecyclerView.e a;

    public p0(RecyclerView.e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.hp31
    public final int a() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.hp31
    public final int b() {
        RecyclerView.e eVar = this.a;
        return eVar.I - eVar.getPaddingBottom();
    }

    @Override // defpackage.hp31
    public final View c(int i) {
        return this.a.c0(i);
    }

    @Override // defpackage.hp31
    public final int d(View view) {
        return this.a.n0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.hp31
    public final int e(View view) {
        return this.a.h0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }
}
