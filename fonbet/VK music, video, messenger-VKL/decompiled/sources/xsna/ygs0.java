package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: VideoDiscoverySpacerDelegate.kt */
/* loaded from: classes7.dex */
public final class ygs0 extends p1u0<zgs0> {

    /* compiled from: VideoDiscoverySpacerDelegate.kt */
    public static final class a extends vfz<zgs0> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(zgs0 zgs0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends zgs0> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.video_discovert_spacer_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof zgs0;
    }
}
