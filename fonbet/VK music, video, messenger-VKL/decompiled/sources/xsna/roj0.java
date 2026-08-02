package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: SimilarVideosHorizontalSkeletonDelegate.kt */
/* loaded from: classes7.dex */
public final class roj0 extends p1u0<AboutVideoItem.x> {
    public final io.reactivex.rxjava3.core.q<Float> a;

    /* compiled from: SimilarVideosHorizontalSkeletonDelegate.kt */
    public final class a extends vfz<AboutVideoItem.x> {
        public final io.reactivex.rxjava3.disposables.b l;
        public final wh50 m;

        public a(ViewGroup viewGroup) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.l = new io.reactivex.rxjava3.disposables.b();
            this.m = androidx.compose.runtime.k.b(Boolean.FALSE);
            ((ComposeView) this.itemView).setContent(new jai(473805247, new w61(this, 14), true));
        }

        @Override // xsna.vfz
        public final void V5() {
            this.l.b(hg1.h(roj0.this.a.U(new mau(new z7w(21), 13)), new ba40(this, 25)));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(AboutVideoItem.x xVar) {
        }

        @Override // xsna.vfz
        public final void a6() {
            this.l.e();
        }
    }

    public roj0(io.reactivex.rxjava3.core.q<Float> qVar) {
        this.a = qVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.x> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.x;
    }
}
