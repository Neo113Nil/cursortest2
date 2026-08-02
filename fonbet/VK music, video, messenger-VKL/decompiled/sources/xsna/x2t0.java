package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.r2t0;

/* compiled from: VideoPickerReducer.kt */
/* loaded from: classes4.dex */
public final class x2t0 extends dm50<i3t0, r2t0, c3t0> {
    public final l0w0 d;

    public x2t0(c3t0 c3t0Var) {
        super(c3t0Var);
        this.d = new l0w0();
    }

    @Override // xsna.dm50
    public final c3t0 c(c3t0 c3t0Var, r2t0 r2t0Var) {
        c3t0 c3t0Var2 = c3t0Var;
        r2t0 r2t0Var2 = r2t0Var;
        Set<String> set = c3t0Var2.d;
        if (r2t0Var2 instanceof r2t0.a) {
            r2t0.a aVar = (r2t0.a) r2t0Var2;
            if (epx.f(aVar, r2t0.a.b.b)) {
                return c3t0.a(c3t0Var2, null, null, true, null, null, 103);
            }
            if (aVar instanceof r2t0.a.C3595a) {
                return c3t0.a(c3t0Var2, null, null, false, ((r2t0.a.C3595a) aVar).b, null, 103);
            }
            if (aVar instanceof r2t0.a.c) {
                return c3t0.a(c3t0Var2, ((r2t0.a.c) aVar).b, null, false, null, null, 101);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (r2t0Var2 instanceof r2t0.b) {
            r2t0.b bVar = (r2t0.b) r2t0Var2;
            boolean z = bVar.c;
            String str = bVar.b;
            return c3t0.a(c3t0Var2, null, z ? izi0.k(set, str) : izi0.f(set, str), false, null, null, 123);
        }
        if (r2t0Var2 instanceof t2t0) {
            return c3t0.a(c3t0Var2, null, null, false, null, new PickerTechMetrics(((t2t0) r2t0Var2).b, null, null), 95);
        }
        if (r2t0Var2 instanceof s2t0) {
            return c3t0.a(c3t0Var2, null, null, false, null, null, 63);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final i3t0 d() {
        return new i3t0(e(new dso0(this, 17)));
    }

    @Override // xsna.dm50
    public final void h(c3t0 c3t0Var, i3t0 i3t0Var) {
        f(i3t0Var.a, c3t0Var);
    }
}
