package xsna;

import xsna.pew0;

/* compiled from: VoipCallMediaAnalyticsDelegate.kt */
/* loaded from: classes11.dex */
public final class lhw0 {
    public final pew0 a;

    /* compiled from: VoipCallMediaAnalyticsDelegate.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final pew0.b a;

        public a(com.vk.voip.ui.a aVar) {
            this.a = aVar;
        }

        public final pew0.b a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AnalyticsSource(audioOutput=" + this.a + ')';
        }
    }

    public lhw0(pew0 pew0Var) {
        this.a = pew0Var;
    }
}
