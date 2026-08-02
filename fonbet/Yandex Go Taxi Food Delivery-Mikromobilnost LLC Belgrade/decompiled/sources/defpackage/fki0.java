package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class fki0 implements gki0 {
    public final /* synthetic */ LinearLayoutManager a;

    public fki0(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // defpackage.gki0
    public final int a() {
        return this.a.K1();
    }

    @Override // defpackage.gki0
    public final int b() {
        return this.a.M1();
    }

    @Override // defpackage.gki0
    public final void m(View view, Rect rect) {
        this.a.m(view, rect);
    }

    @Override // defpackage.gki0
    public final void r(int i, int i2) {
        this.a.r(i, i2);
    }

    @Override // defpackage.gki0
    public final void v(RecyclerView.j jVar) {
        this.a.v(jVar);
    }
}
