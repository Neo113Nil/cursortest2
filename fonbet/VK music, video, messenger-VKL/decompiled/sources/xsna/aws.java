package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stickers.StickerItem;
import com.vk.lists.c;
import kotlin.collections.EmptyList;

/* compiled from: FullSearchPagedDataProvider.kt */
/* loaded from: classes15.dex */
public final class aws implements c.l<VKList<StickerItem>> {
    public final gws b;
    public final zvs c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final fm20 e;
    public final p00 f;
    public final jw30 g;

    public aws(gws gwsVar, zvs zvsVar, io.reactivex.rxjava3.disposables.b bVar, fm20 fm20Var, p00 p00Var, jw30 jw30Var) {
        this.b = gwsVar;
        this.c = zvsVar;
        this.d = bVar;
        this.e = fm20Var;
        this.f = p00Var;
        this.g = jw30Var;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<StickerItem>> hj(com.vk.lists.c cVar, boolean z) {
        this.b.c = EmptyList.b;
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<StickerItem>> ui(int i, com.vk.lists.c cVar) {
        String b = ((afi0) this.e.c).b();
        if (!drm0.N(b) && ((Boolean) this.g.invoke()).booleanValue()) {
            return this.c.c(cVar.i(), b);
        }
        cVar.q(0);
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<StickerItem>> qVar, boolean z, com.vk.lists.c cVar) {
        asu0 asu0Var = asu0.a;
        this.d.b(qVar.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new bg1(new k8(16, this, cVar), 25), new hz(new k60(29), 27)));
    }
}
