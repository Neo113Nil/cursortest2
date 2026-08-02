package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class dwu0 implements ylr {
    public final /* synthetic */ rl60 a;

    public dwu0(rl60 rl60Var) {
        this.a = rl60Var;
    }

    @Override // defpackage.ylr
    public final void addScrollListener(RecyclerView.g gVar) {
    }

    @Override // defpackage.ylr
    public final View asView() {
        return new ViewStub(this.a.a);
    }

    @Override // defpackage.ylr
    public final boolean interceptOnBackPressed() {
        return false;
    }

    @Override // defpackage.ylr
    public final void removeScrollListener(RecyclerView.g gVar) {
    }
}
