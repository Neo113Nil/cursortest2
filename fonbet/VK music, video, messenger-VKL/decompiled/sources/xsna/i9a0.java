package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.view.VKImageView;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.photoviewer.PhotoViewer;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ej0;
import xsna.uut0.a;

/* compiled from: PhotoGalleryPageVH.kt */
/* loaded from: classes4.dex */
public final class i9a0 extends yj3<ej0.b> {
    public final /* synthetic */ j9a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9a0(j9a0 j9a0Var, RecyclerView recyclerView) {
        super(recyclerView);
        this.v = j9a0Var;
    }

    @Override // xsna.yj3
    public final boolean k(int i) {
        return ((Boolean) this.v.c.invoke()).booleanValue();
    }

    @Override // xsna.yj3
    public final void m(ej0.b bVar) {
        ej0.b bVar2 = bVar;
        uut0 uut0Var = this.v.l;
        if (uut0Var == null) {
            uut0Var = null;
        }
        VKImageView vKImageView = bVar2.l;
        int adapterPosition = bVar2.getAdapterPosition();
        k5t k5tVar = uut0Var.j;
        PhotoGalleryView.b g = uut0Var.d.g();
        if (g instanceof PhotoGalleryView.b.C1474b) {
            ((PhotoGalleryView.b.C1474b) g).b.invoke((q4t) j5g.b0(adapterPosition, k5tVar.c().a));
            return;
        }
        if (!(g instanceof PhotoGalleryView.b.c) && !(g instanceof PhotoGalleryView.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<q4t> list = k5tVar.c().a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (q4t q4tVar : list) {
            arrayList.add(q4tVar instanceof yuz ? new zuz((yuz) q4tVar) : q4tVar instanceof vuz ? new wuz((vuz) q4tVar) : q4tVar instanceof fwz ? new gwz((fwz) q4tVar) : new knk(q4tVar));
        }
        new PhotoViewer(adapterPosition, arrayList, vKImageView.getContext(), uut0Var.new a(), false, false, 112).s();
    }

    @Override // xsna.yj3
    public final void s(int i, ej0.b bVar) {
        j9a0 j9a0Var = this.v;
        q4t q4tVar = j9a0Var.g.c().a.get(i);
        uut0 uut0Var = j9a0Var.l;
        if (uut0Var == null) {
            uut0Var = null;
        }
        uut0Var.b(q4tVar, i);
    }

    @Override // xsna.yj3
    public final void v(int i, ej0.b bVar) {
        j9a0 j9a0Var = this.v;
        q4t q4tVar = j9a0Var.g.c().a.get(i);
        uut0 uut0Var = j9a0Var.l;
        if (uut0Var == null) {
            uut0Var = null;
        }
        uut0Var.b(q4tVar, i);
    }
}
