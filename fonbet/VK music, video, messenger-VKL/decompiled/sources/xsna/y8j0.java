package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.m8j0;

/* compiled from: ShareStorySendButtonDelegate.kt */
/* loaded from: classes16.dex */
public final class y8j0 extends p1u0<m8j0.d> {
    public final n8 a;

    /* compiled from: ShareStorySendButtonDelegate.kt */
    public static final class a extends vfz<m8j0.d> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(m8j0.d dVar) {
        }
    }

    public y8j0(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.d> b(ViewGroup viewGroup) {
        a aVar = new a(R.layout.layout_story_share_button, viewGroup);
        bwt0.i0(aVar.itemView, new x8j0(this.a, 0));
        return aVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.d;
    }
}
