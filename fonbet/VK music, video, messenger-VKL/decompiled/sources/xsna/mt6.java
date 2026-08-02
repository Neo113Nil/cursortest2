package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTextContextMenuProvider.kt */
/* loaded from: classes11.dex */
public final class mt6 implements gdo0 {
    public final jai a;
    public final ni50 b = new ni50();
    public final wh50 c = androidx.compose.runtime.k.b(null);

    /* compiled from: BasicTextContextMenuProvider.kt */
    public final class a implements jdo0 {
        public final wco0 a;
        public final nm8 b = w0b.a(0, null, null, 7);

        public a(wco0 wco0Var) {
            this.a = wco0Var;
        }

        @Override // xsna.jdo0
        public final void close() {
            this.b.f(s3q0.a);
        }
    }

    public mt6(jai jaiVar) {
        this.a = jaiVar;
    }

    @Override // xsna.gdo0
    public final Object a(wco0 wco0Var, SuspendLambda suspendLambda) {
        Object b = this.b.b(MutatePriority.Default, new nt6(this, new a(wco0Var), null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public final void b(gzs<? extends tny> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<? extends tny> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(723898654);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(723898654, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            a aVar2 = (a) ((zak0) this.c).getValue();
            if (aVar2 == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new q2(this, gzsVar, i, 2);
                    return;
                }
                return;
            }
            gzsVar2 = gzsVar;
            this.a.invoke(aVar2, aVar2.a, gzsVar2, M, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ne4(this, gzsVar2, i, 1);
        }
    }
}
