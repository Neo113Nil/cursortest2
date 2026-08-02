package xsna;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: InitCommunityWallDecorationsAction.kt */
/* loaded from: classes4.dex */
public final class jxw extends gux {
    public final RecyclerView a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new krh(this, 24));

    public jxw(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gux
    public final void a() {
        RecyclerView.n nVar;
        if (!com.vk.toggle.d.i() || (nVar = (RecyclerView.n) this.b.getValue()) == null) {
            return;
        }
        this.a.addItemDecoration(nVar);
    }
}
