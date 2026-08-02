package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: SimilarVideoDelegate.kt */
/* loaded from: classes18.dex */
public final class hoj0 extends p1u0<joj0> {
    @Override // xsna.p1u0
    public final vfz<? extends joj0> b(ViewGroup viewGroup) {
        return new ioj0(tf3.b(viewGroup, R.layout.similar_video_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof joj0;
    }
}
