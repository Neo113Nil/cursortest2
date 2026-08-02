package xsna;

import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.offline.VideoScreenMode;

/* compiled from: SimilarCompactVideoDelegate.kt */
/* loaded from: classes7.dex */
public final class unj0 extends p1u0<AboutVideoItem.SimilarVideoRedesign> {
    public final c4 a;
    public final boolean b;
    public final VideoScreenMode c;

    public unj0(c4 c4Var, boolean z, VideoScreenMode videoScreenMode) {
        this.a = c4Var;
        this.b = z;
        this.c = videoScreenMode;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.SimilarVideoRedesign> b(ViewGroup viewGroup) {
        return new voj0(viewGroup, this.a, new h6i(), this.c);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return this.b && (hfzVar instanceof AboutVideoItem.SimilarVideoRedesign) && ((AboutVideoItem.SimilarVideoRedesign) hfzVar).h != AboutVideoItem.SimilarVideoRedesign.Style.NORMAL;
    }
}
