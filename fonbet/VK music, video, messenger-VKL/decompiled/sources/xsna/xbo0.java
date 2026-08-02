package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: TextArea.kt */
/* loaded from: classes17.dex */
public interface xbo0 {

    /* compiled from: TextArea.kt */
    public static final class a implements xbo0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d = androidx.compose.runtime.k.b(null);

        /* compiled from: TextArea.kt */
        /* renamed from: xsna.xbo0$a$a, reason: collision with other inner class name */
        public static final class C3992a {
            public static a a(lg90 lg90Var, long j, String str, androidx.compose.runtime.a aVar, int i, int i2) {
                if ((i2 & 2) != 0) {
                    s1v.k();
                    j = on20.a.e(aVar);
                }
                if ((i2 & 4) != 0) {
                    str = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1074952139, i, -1, "com.vk.core.compose.component.input.TextArea.Before.Icon.Companion.invoke (TextArea.kt:59)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new a(j, str, lg90Var);
                    aVar.R(x);
                }
                a aVar2 = (a) x;
                ((zak0) aVar2.a).setValue(lg90Var);
                ((zak0) aVar2.b).setValue(new l5g(j));
                ((zak0) aVar2.c).setValue(str);
                ((zak0) aVar2.d).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return aVar2;
            }
        }

        public a(long j, String str, lg90 lg90Var) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
            this.b = zy60.d(j);
            this.c = androidx.compose.runtime.k.b(str);
        }

        @Override // xsna.xbo0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a M = aVar.M(1928068137);
            int i2 = (M.J(this) ? 4 : 2) | i;
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1928068137, i2, -1, "com.vk.core.compose.component.input.TextArea.Before.Icon.Content (TextArea.kt:40)");
                }
                pzu0.b((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), com.vk.core.compose.component.semantics.b.b(txj0.q(q630.a.a, 24), (SemanticsConfiguration) ((zak0) this.d).getValue()), ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new x76(this, i, 11);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
