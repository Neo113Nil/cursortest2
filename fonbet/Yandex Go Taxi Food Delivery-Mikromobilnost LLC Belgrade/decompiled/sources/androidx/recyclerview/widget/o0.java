package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hp31;

/* loaded from: classes.dex */
public final class o0 implements hp31 {
    public final /* synthetic */ RecyclerView.e a;

    public o0(RecyclerView.e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.hp31
    public final int a() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.hp31
    public final int b() {
        RecyclerView.e eVar = this.a;
        return eVar.H - eVar.getPaddingRight();
    }

    @Override // defpackage.hp31
    public final View c(int i) {
        return this.a.c0(i);
    }

    @Override // defpackage.hp31
    public final int d(View view) {
        return this.a.j0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.hp31
    public final int e(View view) {
        return this.a.m0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }
}
