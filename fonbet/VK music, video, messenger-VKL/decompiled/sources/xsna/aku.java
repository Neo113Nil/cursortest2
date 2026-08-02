package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public interface aku {

    /* compiled from: GroupHeader.kt */
    public static final class a implements aku {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c = androidx.compose.runtime.k.b(null);
        public final wh50 d;

        /* compiled from: GroupHeader.kt */
        /* renamed from: xsna.aku$a$a, reason: collision with other inner class name */
        public static final class C2548a {
            public static a a(lg90 lg90Var, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
                long j = l5g.k;
                if ((i & 8) != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-169701215, 24584, -1, "com.vk.core.compose.component.group.header.GroupHeader.Left.Icon.Companion.invoke (GroupHeader.kt:107)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new a(lg90Var, j, aVar);
                    aVar2.R(x);
                }
                a aVar3 = (a) x;
                ((zak0) aVar3.a).setValue(lg90Var);
                ((zak0) aVar3.b).setValue(new l5g(j));
                ((zak0) aVar3.c).setValue(null);
                ((zak0) aVar3.d).setValue(aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return aVar3;
            }
        }

        public a(lg90 lg90Var, long j, SemanticsConfiguration semanticsConfiguration) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
            this.b = zy60.d(j);
            this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // xsna.aku
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1525497210);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = (M.J(aVar2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1525497210, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Left.Icon.Content (GroupHeader.kt:88)");
                }
                vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), txj0.q(com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.d).getValue()), jgz.s().c), ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new rma(this, i);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
