package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import xsna.uii0;

/* compiled from: SendStoryUsersSearchDelegate.kt */
/* loaded from: classes16.dex */
public final class bji0 extends p1u0<uii0.d> {
    public final q99 a;

    /* compiled from: SendStoryUsersSearchDelegate.kt */
    public static final class a extends vfz<uii0.d> {
        public final izs<nii0, s3q0> l;
        public io.reactivex.rxjava3.disposables.c m;
        public final VkSearchView n;

        public a(ViewGroup viewGroup, q99 q99Var) {
            super(R.layout.layout_story_send_search, viewGroup);
            this.l = q99Var;
            VkSearchView vkSearchView = (VkSearchView) this.itemView;
            this.n = vkSearchView;
            orl.a(vkSearchView);
            vkSearchView.X4(false);
            vkSearchView.setOnActionSearchQueryClick(new be6(this, 10));
        }

        @Override // xsna.vfz
        public final void V5() {
            this.m = d02.y(this.n, 200L, 2).subscribe(new skz(new r8a0(this, 18), 24));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(uii0.d dVar) {
            if (dVar.c) {
                this.n.d0();
            }
        }

        @Override // xsna.vfz
        public final void a6() {
            io.reactivex.rxjava3.disposables.c cVar = this.m;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    public bji0(q99 q99Var) {
        this.a = q99Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends uii0.d> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof uii0.d;
    }
}
