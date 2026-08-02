package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.q630;
import xsna.xro0;
import xsna.xro0.a;

/* compiled from: AwaitFirstLayoutModifier.kt */
/* loaded from: classes11.dex */
public final class cu5 extends d730<a> {
    public a a;
    public o7i b;

    /* compiled from: AwaitFirstLayoutModifier.kt */
    public final class a extends q630.c {
        public xro0.a p;

        public a() {
        }

        @Override // xsna.q630.c
        public final void a2() {
            cu5 cu5Var = cu5.this;
            cu5Var.a = this;
            if (cu5Var.b != null) {
                i2();
            }
        }

        @Override // xsna.q630.c
        public final void b2() {
            cu5 cu5Var = cu5.this;
            if (cu5Var.a == this) {
                cu5Var.a = null;
            }
            xro0.a aVar = this.p;
            if (aVar != null) {
                aVar.b();
            }
            this.p = null;
        }

        public final void i2() {
            uf1 uf1Var = new uf1(8, this, cu5.this);
            LayoutNode f = itl.f(this);
            int i = f.c;
            fif0 rectManager = voy.a(f).getRectManager();
            xro0 xro0Var = rectManager.c;
            xro0Var.getClass();
            pg50<xro0.a> pg50Var = xro0Var.a;
            xro0.a aVar = xro0Var.new a(i, this, uf1Var);
            xro0.a b = pg50Var.b(i);
            if (b == null) {
                pg50Var.k(i, aVar);
                b = aVar;
            }
            xro0.a aVar2 = b;
            if (aVar2 != aVar) {
                while (true) {
                    xro0.a aVar3 = aVar2.d;
                    if (aVar3 == null) {
                        break;
                    } else {
                        aVar2 = aVar3;
                    }
                }
                aVar2.d = aVar;
            }
            if (itl.f(this.b).h) {
                rectManager.b.c(i, true);
            }
            rectManager.e = true;
            rectManager.h();
            this.p = aVar;
        }
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // xsna.d730
    public final a r() {
        return new a();
    }

    @Override // xsna.d730
    public final /* bridge */ /* synthetic */ void s(a aVar) {
    }

    public final Object t(ContinuationImpl continuationImpl) {
        o7i o7iVar = this.b;
        if (o7iVar == null) {
            o7iVar = p7i.a();
            this.b = o7iVar;
            a aVar = this.a;
            if (aVar != null && aVar.o) {
                aVar.i2();
            }
        }
        Object J = o7iVar.J(continuationImpl);
        return J == CoroutineSingletons.COROUTINE_SUSPENDED ? J : s3q0.a;
    }
}
