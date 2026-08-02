package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class mew implements ylr {
    public final /* synthetic */ Cnew a;

    public mew(Cnew cnew) {
        this.a = cnew;
    }

    @Override // defpackage.ylr
    public final void addScrollListener(RecyclerView.g gVar) {
    }

    @Override // defpackage.ylr
    public final View asView() {
        return new ViewStub(this.a.F);
    }

    @Override // defpackage.ylr
    public final boolean interceptOnBackPressed() {
        return false;
    }

    @Override // defpackage.ylr
    public final void removeScrollListener(RecyclerView.g gVar) {
    }
}
