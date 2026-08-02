package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.dto.polls.Poll;

/* compiled from: PollV3ViewState.kt */
/* loaded from: classes4.dex */
public final class atb0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: PollV3ViewState.kt */
    public static final class a implements fm50<usb0> {
        public final yzt0<Poll> a;
        public final yzt0<Boolean> b;
        public final yzt0<C2570a> c;
        public final yzt0<Integer> d;

        /* compiled from: PollV3ViewState.kt */
        /* renamed from: xsna.atb0$a$a, reason: collision with other inner class name */
        public static final class C2570a {
            public final int a;
            public final VkButton.Mode b;
            public final VkButton.Appearance c;
            public final boolean d;

            public C2570a(int i, VkButton.Mode mode, VkButton.Appearance appearance, boolean z) {
                this.a = i;
                this.b = mode;
                this.c = appearance;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2570a)) {
                    return false;
                }
                C2570a c2570a = (C2570a) obj;
                return this.a == c2570a.a && this.b == c2570a.b && this.c == c2570a.c && this.d == c2570a.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VoteButtonState(text=");
                sb.append(this.a);
                sb.append(", mode=");
                sb.append(this.b);
                sb.append(", appearance=");
                sb.append(this.c);
                sb.append(", enabled=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }
    }

    /* compiled from: PollV3ViewState.kt */
    public static final class b implements fm50<usb0> {
        public final yzt0<Boolean> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(isError="), this.a, ')');
        }
    }

    public atb0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
