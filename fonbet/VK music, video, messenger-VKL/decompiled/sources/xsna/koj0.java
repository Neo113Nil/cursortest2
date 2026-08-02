package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: SimilarVideoItemDelegate.kt */
/* loaded from: classes7.dex */
public final class koj0 extends p1u0<AboutVideoItem.SimilarVideoRedesign> {
    public final o440 a;

    /* compiled from: SimilarVideoItemDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.SimilarVideoRedesign> {
        public final izs<AboutVideoItem.SimilarVideoRedesign, s3q0> l;
        public final wh50 m;

        public a(ViewGroup viewGroup, o440 o440Var) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.l = o440Var;
            this.m = androidx.compose.runtime.k.b(null);
            ((ComposeView) this.itemView).setContent(new jai(777623483, new v95(this, 14), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.SimilarVideoRedesign similarVideoRedesign) {
            ((zak0) this.m).setValue(similarVideoRedesign);
        }
    }

    public koj0(o440 o440Var) {
        this.a = o440Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.SimilarVideoRedesign> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.SimilarVideoRedesign;
    }
}
