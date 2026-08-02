package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;

/* compiled from: SimilarSliderEmptyDelegate.kt */
/* loaded from: classes7.dex */
public final class aoj0 extends p1u0<AboutVideoItem.w.b.C1217b> {
    public final b6f0 a;

    /* compiled from: SimilarSliderEmptyDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.w.b.C1217b> {
        public final gzs<s3q0> l;
        public final String m;
        public final String n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, b6f0 b6f0Var) {
            super(r0);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            vq.b(-1, -1, composeView);
            this.l = b6f0Var;
            this.m = this.itemView.getContext().getString(R.string.vkvideo_empty_recommendations_catalog);
            this.n = this.itemView.getContext().getString(R.string.vkvideo_try_again);
            ((ComposeView) this.itemView).setContent(new jai(731996223, new fne(this, 8), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(AboutVideoItem.w.b.C1217b c1217b) {
        }
    }

    public aoj0(b6f0 b6f0Var) {
        this.a = b6f0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.w.b.C1217b> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.w.b.C1217b;
    }
}
