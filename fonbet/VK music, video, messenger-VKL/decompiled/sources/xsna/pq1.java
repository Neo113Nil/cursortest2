package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.ListDataSet;
import xsna.vp1;

/* compiled from: AlbumsSettingsView.kt */
/* loaded from: classes4.dex */
public final class pq1 extends r.g {
    public boolean g;
    public final /* synthetic */ com.vk.movika.sdk.base.logic.interactor.p h;
    public final /* synthetic */ qq1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq1(com.vk.movika.sdk.base.logic.interactor.p pVar, qq1 qq1Var) {
        super(3, 0);
        this.h = pVar;
        this.i = qq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        if (!(e0Var instanceof ql1) || !(e0Var2 instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) e0Var;
        int bindingAdapterPosition = ql1Var.getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((ql1) e0Var2).getBindingAdapterPosition();
        if (!this.g) {
            this.h.invoke(new vp1.j((PhotoAlbum) ql1Var.m));
        }
        this.g = true;
        this.i.g.A0(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        if (i == 0 && this.g) {
            this.h.invoke(new vp1.d(((ListDataSet) this.i.g.c).d));
            this.g = false;
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
