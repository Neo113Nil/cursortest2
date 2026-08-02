package coil.compose;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.bvf0;
import defpackage.n8e;
import defpackage.rjs0;
import defpackage.s0y;
import defpackage.sx21;
import defpackage.syc;
import defpackage.tls;
import defpackage.x910;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class f implements rjs0, s0y {
    public final r0 a = bvf0.c(new n8e(sx21.a));

    @Override // defpackage.rjs0
    public final Object a(Continuation continuation) {
        return kotlinx.coroutines.flow.e.y(new syc(this.a, 3), continuation);
    }

    @Override // defpackage.s0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        n8e n8eVar = new n8e(j);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, n8eVar);
        final o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: coil.compose.ConstraintsSizeResolver$measure$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((o.a) obj).g(o.this, 0, 0, 0.0f);
                return zy11.a;
            }
        });
    }
}
