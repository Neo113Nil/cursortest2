package androidx.compose.ui;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.e530;
import defpackage.n;
import defpackage.tls;
import defpackage.v0y;
import defpackage.x910;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class c extends e530 implements v0y {
    public float a;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        final o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((o.a) obj).g(o.this, 0, 0, this.a);
                return zy11.a;
            }
        });
    }

    public final String toString() {
        return n.n(new StringBuilder("ZIndexModifier(zIndex="), this.a, ')');
    }
}
