package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;

/* compiled from: ReactionItemVH.kt */
/* loaded from: classes2.dex */
public final class c1f0 extends RecyclerView.e0 {
    public final zaw l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final izs<yaw, s3q0> q;
    public final com.vk.im.reactions.impl.assets.a r;
    public final bpn0 s;

    public c1f0(View view, zaw zawVar, io.reactivex.rxjava3.disposables.b bVar, boolean z, int i, boolean z2, com.vk.im.reactions.impl.set_reaction.list.a aVar) {
        super(view);
        this.l = zawVar;
        this.m = bVar;
        this.n = z;
        this.o = i;
        this.p = z2;
        this.q = aVar;
        this.r = new com.vk.im.reactions.impl.assets.a(zawVar);
        this.s = new bpn0(new ni0(16, this, view));
    }

    public final ReactionAssetDrawable V5(View view, yaw yawVar, int i, boolean z) {
        if (z) {
            return this.r.a(view, yawVar.a, i, this.m);
        }
        return com.vk.im.reactions.impl.assets.a.b(this.r, view.getContext(), yawVar.a, i, null, this.m, this.p, 8);
    }
}
