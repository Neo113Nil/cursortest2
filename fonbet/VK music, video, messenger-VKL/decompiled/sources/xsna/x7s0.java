package xsna;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$LongRef;
import one.video.exo.offline.g;
import xsna.v7s0;

/* compiled from: VideoCacheManager.kt */
/* loaded from: classes8.dex */
public final class x7s0 implements g.a {
    public final /* synthetic */ v7s0 a;
    public final /* synthetic */ k7s0 b;
    public final /* synthetic */ Ref$LongRef c;

    public x7s0(v7s0 v7s0Var, k7s0 k7s0Var, Ref$LongRef ref$LongRef) {
        this.a = v7s0Var;
        this.b = k7s0Var;
        this.c = ref$LongRef;
    }

    @Override // one.video.exo.offline.g.a
    public final void a() {
        List<o7o> list;
        List<v7s0.a> list2 = this.a.d.get(this.b.a);
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        if (list2.isEmpty()) {
            return;
        }
        k7s0 k7s0Var = this.b;
        androidx.media3.exoplayer.offline.c cVar = k7s0Var.f;
        long j = 0;
        if (cVar != null && (list = cVar.o) != null) {
            for (o7o o7oVar : list) {
                k7s0Var.g = pn00.o(k7s0Var.g, new Pair(o7oVar.a.b, o7oVar));
                j += o7oVar.h.a;
            }
        }
        Ref$LongRef ref$LongRef = this.c;
        if (ref$LongRef.element != j) {
            ref$LongRef.element = j;
            v7s0.a(this.a, this.b);
        }
    }
}
