package xsna;

import androidx.compose.runtime.a;

/* compiled from: EventsFlow.kt */
/* loaded from: classes16.dex */
public final class c1q {

    /* compiled from: EventsFlow.kt */
    public static final class a implements lsr, g0t {
        public final /* synthetic */ wzs b;

        public a(wzs wzsVar) {
            this.b = wzsVar;
        }

        @Override // xsna.lsr
        public final /* synthetic */ Object emit(Object obj, spj spjVar) {
            return this.b.invoke(obj, spjVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void a(ksr ksrVar, wzs wzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-868861322);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(wzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-868861322, i2, -1, "com.vk.catalog.mvi.block.ui.HandleEvents (EventsFlow.kt:16)");
            }
            a1q a1qVar = new a1q(ksrVar);
            int i3 = i2 & 14;
            boolean y = M.y(wzsVar) | (i3 == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new b1q(ksrVar, wzsVar, null);
                M.R(x);
            }
            bap.g(a1qVar, (wzs) x, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qz5(ksrVar, wzsVar, i, 3);
        }
    }
}
