package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.ajh;

/* compiled from: CommunityProfileView.kt */
/* loaded from: classes5.dex */
public final class gvh extends RecyclerView.t {
    public final /* synthetic */ com.vk.profile.community.impl.ui.profile.f b;

    public gvh(com.vk.profile.community.impl.ui.profile.f fVar) {
        this.b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            com.vk.profile.community.impl.ui.profile.f fVar = this.b;
            if (!fVar.v.m() || fVar.v.isLoading()) {
                return;
            }
            fVar.v.e();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.vk.profile.community.impl.ui.profile.f fVar = this.b;
        euh euhVar = fVar.v;
        if (!euhVar.isLoading()) {
            fVar.A.b(i2);
        }
        if (euhVar.isLoading()) {
            return;
        }
        fVar.B.a(new ajh.b(i2));
        xif0 xif0Var = (xif0) fVar.n.getValue();
        if (xif0Var != null) {
            xif0Var.a();
        }
    }
}
