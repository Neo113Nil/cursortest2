package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: TrapBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class gpp0 extends p1u0<AboutVideoItem.a0> {
    public final c4 a;

    /* compiled from: TrapBannerDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.a0> {
        public final c4 l;
        public final wh50 m;

        public a(ViewGroup viewGroup, c4 c4Var) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.l = c4Var;
            this.m = androidx.compose.runtime.k.b(null);
            ((ComposeView) this.itemView).setContent(new jai(-1650428115, new jd4(this, 15), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.a0 a0Var) {
            ((zak0) this.m).setValue(a0Var);
        }
    }

    public gpp0(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.a0> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.a0;
    }
}
