package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: Doc2DocBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class atn extends p1u0<AboutVideoItem.l> {
    public final oa5 a;

    /* compiled from: Doc2DocBannerDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.l> {
        public final wzs<Doc2DocItem.Banner.Action, String, s3q0> l;
        public final wh50 m;

        public a(ViewGroup viewGroup, oa5 oa5Var) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.l = oa5Var;
            this.m = androidx.compose.runtime.k.b(null);
            ((ComposeView) this.itemView).setContent(new jai(444436415, new com.vk.movika.tools.controls.seekbar.t(this, 4), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.l lVar) {
            ((zak0) this.m).setValue(lVar);
        }
    }

    public atn(oa5 oa5Var) {
        this.a = oa5Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.l> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.l;
    }
}
