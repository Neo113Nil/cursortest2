package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import xsna.msn0;
import xsna.q630;

/* compiled from: VkTabItem.kt */
/* loaded from: classes17.dex */
public interface msn0 {

    /* compiled from: VkTabItem.kt */
    public static final class a implements msn0 {
        @Override // xsna.msn0
        public final void a(final int i, androidx.compose.runtime.a aVar) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1252552131);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = (M.J(aVar2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1252552131, i2, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Badge.Content (VkTabItem.kt:249)");
                }
                rdu0.a(aVar2, null, M, i2 & 14, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs() { // from class: xsna.lsn0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        msn0.a.this.a(I, (androidx.compose.runtime.a) obj);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: VkTabItem.kt */
    public static final class b implements msn0 {
        public final wh50 a = androidx.compose.runtime.k.b(123);
        public final wh50 b;
        public final wh50 c;

        /* compiled from: VkTabItem.kt */
        public static final class a {
            public static b a(androidx.compose.runtime.a aVar) {
                CounterAppearance.Design design = CounterAppearance.Design.AccentRed;
                CounterMode counterMode = CounterMode.Primary;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1187436882, 3078, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Counter.Companion.invoke (VkTabItem.kt:287)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new b(design, counterMode);
                    aVar.R(x);
                }
                b bVar = (b) x;
                ((zak0) bVar.a).setValue(123);
                ((zak0) bVar.b).setValue(design);
                ((zak0) bVar.c).setValue(counterMode);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return bVar;
            }
        }

        public b(CounterAppearance counterAppearance, CounterMode counterMode) {
            this.b = androidx.compose.runtime.k.b(counterAppearance);
            this.c = androidx.compose.runtime.k.b(counterMode);
        }

        @Override // xsna.msn0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1406188284);
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
                    androidx.compose.runtime.b.f(-1406188284, i2, -1, "com.vk.core.compose.component.tabs.TabItem.Indicator.Counter.Content (VkTabItem.kt:271)");
                }
                nou0.a(((Number) ((zak0) this.a).getValue()).intValue(), CounterSize.Small, (CounterAppearance) ((zak0) this.b).getValue(), aVar2, (CounterMode) ((zak0) this.c).getValue(), false, M, ((i2 << 9) & 7168) | 48, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new a0l(this, i);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
