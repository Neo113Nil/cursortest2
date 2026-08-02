package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: ClipFeedAnimationUtils.kt */
/* loaded from: classes17.dex */
public final class vvc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ io2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gzs<s3q0> e;
    public final /* synthetic */ List<View> f;

    public vvc(RecyclerView recyclerView, io2 io2Var, boolean z, gzs gzsVar, List list) {
        this.b = recyclerView;
        this.c = io2Var;
        this.d = z;
        this.e = gzsVar;
        this.f = list;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        twc<Item> twcVar;
        yg5 autoPlay;
        d3b0 v0;
        RecyclerView recyclerView = this.b;
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        gzs<s3q0> gzsVar = this.e;
        io2 io2Var = this.c;
        boolean z = this.d;
        if (io2Var == null) {
            uvc.b(z, io2Var, gzsVar);
            return true;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            uvc.b(z, io2Var, gzsVar);
            return true;
        }
        Object findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(linearLayoutManager.v());
        if (z) {
            w4r w4rVar = findViewHolderForLayoutPosition instanceof w4r ? (w4r) findViewHolderForLayoutPosition : null;
            if (w4rVar != null) {
                w4rVar.E0();
            }
        }
        if (!(findViewHolderForLayoutPosition instanceof tqs0)) {
            if (!(findViewHolderForLayoutPosition instanceof z8e)) {
                uvc.b(z, io2Var, gzsVar);
                return true;
            }
            RecyclerView recyclerView2 = this.b;
            List<View> list = this.f;
            boolean z2 = this.d;
            io2 io2Var2 = this.c;
            uvc.a(list, z2, io2Var2, gzsVar, io2Var2, (z8e) findViewHolderForLayoutPosition, recyclerView2);
            return true;
        }
        if (z && (autoPlay = (twcVar = ((tqs0) findViewHolderForLayoutPosition).n).getAutoPlay()) != null && (v0 = autoPlay.v0()) != null) {
            v0.j(twcVar.getVideo());
        }
        RecyclerView recyclerView3 = this.b;
        List<View> list2 = this.f;
        boolean z3 = this.d;
        io2 io2Var3 = this.c;
        uvc.a(list2, z3, io2Var3, gzsVar, io2Var3, (z8e) findViewHolderForLayoutPosition, recyclerView3);
        return true;
    }
}
