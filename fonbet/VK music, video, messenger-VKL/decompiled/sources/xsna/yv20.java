package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.stickers.StickersPacksChunk;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;

/* compiled from: ModalAvailablePacksView.kt */
/* loaded from: classes6.dex */
public final class yv20 extends FrameLayout implements View.OnAttachStateChangeListener, c.m<StickersPacksChunk> {
    public static final /* synthetic */ int f = 0;
    public RecyclerPaginatedView b;
    public h890 c;
    public io.reactivex.rxjava3.disposables.c d;
    public com.vk.lists.c e;

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickersPacksChunk> O9(String str, com.vk.lists.c cVar) {
        int k = cVar.k();
        pil0 pil0Var = new pil0("store.getStickersRandomSelectorPacks");
        pil0Var.K("start_from", str);
        pil0Var.C(k, "count");
        return rsg0.y0(pil0Var, null, null, 3);
    }

    public final h890 getAdapter() {
        return this.c;
    }

    public final com.vk.lists.c getHelper() {
        com.vk.lists.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final RecyclerPaginatedView getRecycler() {
        return this.b;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickersPacksChunk> hj(com.vk.lists.c cVar, boolean z) {
        String j = cVar.j();
        if (j == null) {
            j = "0";
        }
        return O9(j, cVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (hg1.d(this.d)) {
            hg1.f(this.d);
        }
        if (hg1.d(this.d)) {
            hg1.f(this.d);
        }
    }

    public final void setAdapter(h890 h890Var) {
        this.c = h890Var;
    }

    public final void setHelper(com.vk.lists.c cVar) {
        this.e = cVar;
    }

    public final void setRecycler(RecyclerPaginatedView recyclerPaginatedView) {
        this.b = recyclerPaginatedView;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickersPacksChunk> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d = qVar.subscribe(new s520(new qd1(20, cVar, this), 1), new amt(new x620(3), 8));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
