package xsna;

import android.view.ViewGroup;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhLoading.kt */
/* loaded from: classes2.dex */
public final class zrr0 extends kqr0<yyb.e> {
    public final jj0 l;
    public final ShimmerFrameLayout m;

    public zrr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(R.layout.vkim_chat_settings_loading, viewGroup);
        this.l = jj0Var;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.skeleton);
        this.m = shimmerFrameLayout;
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        cVar.k(b6g.a(R.attr.vk_legacy_im_bubble_incoming, this.itemView.getContext()));
        cVar.a.d = b6g.a(R.attr.vk_legacy_loader_track_fill, this.itemView.getContext());
        shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
    }

    @Override // xsna.kqr0, xsna.vfz
    public final void W5(hfz hfzVar) {
        this.m.d();
        if (((yyb.e) hfzVar).b) {
            this.l.c();
        }
    }

    @Override // xsna.kqr0
    /* renamed from: h6 */
    public final void W5(yyb.e eVar) {
        this.m.d();
        if (eVar.b) {
            this.l.c();
        }
    }
}
