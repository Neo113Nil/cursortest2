package xsna;

import android.view.ViewGroup;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;
import com.vk.lists.c;
import xsna.m8j0;

/* compiled from: ShareStoryDataAuthorDelegate.kt */
/* loaded from: classes16.dex */
public final class g8j0 extends p1u0<m8j0.a> {
    public final n8 a;
    public final d9j0 b;
    public final int c;
    public final int d;
    public final boolean e;

    /* compiled from: ShareStoryDataAuthorDelegate.kt */
    public static final class a extends vfz<m8j0.a> {
        public final h8j0 l;

        public a(h8j0 h8j0Var) {
            super(h8j0Var);
            this.l = h8j0Var;
            ShareStoryDataRecyclerView shareStoryDataRecyclerView = h8j0Var.u;
            com.vk.lists.c cVar = h8j0Var.x;
            shareStoryDataRecyclerView.setLoadingHoldersCount(Math.min(cVar.k(), h8j0Var.t - cVar.i()));
        }

        @Override // xsna.vfz
        public final void W5(m8j0.a aVar) {
            m8j0.a aVar2 = aVar;
            h8j0 h8j0Var = this.l;
            ShareStoryDataRecyclerView shareStoryDataRecyclerView = h8j0Var.u;
            com.vk.lists.c cVar = h8j0Var.x;
            shareStoryDataRecyclerView.setLoadingHoldersCount(Math.min(cVar.k(), h8j0Var.t - cVar.i()));
            h8j0Var.v.setText(h8j0Var.getContext().getString(aVar2.c));
            h8j0Var.w.setItems(aVar2.d);
        }
    }

    public g8j0(n8 n8Var, d9j0 d9j0Var, int i, int i2, boolean z) {
        this.a = n8Var;
        this.b = d9j0Var;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.a> b(ViewGroup viewGroup) {
        c.h hVar = new c.h(this.b);
        hVar.k = String.valueOf(this.c);
        hVar.g = this.e;
        return new a(new h8j0(viewGroup.getContext(), this.a, hVar, this.d));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.a;
    }
}
