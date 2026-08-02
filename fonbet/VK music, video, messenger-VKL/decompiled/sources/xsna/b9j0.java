package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import xsna.m8j0;

/* compiled from: ShareStorySpaceDelegate.kt */
/* loaded from: classes16.dex */
public final class b9j0 extends p1u0<m8j0.f> {

    /* compiled from: ShareStorySpaceDelegate.kt */
    public static final class a extends vfz<m8j0.f> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(m8j0.f fVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.f> b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(73)));
        return new a(frameLayout);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.f;
    }
}
