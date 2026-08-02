package xsna;

import java.util.List;
import xsna.t70;

/* compiled from: FeedbackButtonsFeatureState.kt */
/* loaded from: classes7.dex */
public final class u5r implements t70.c {
    public final boolean a;
    public final List<b69> b;
    public final a c;

    /* compiled from: FeedbackButtonsFeatureState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnHandState(isRaised=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public u5r(boolean z, List<b69> list, a aVar) {
        this.a = z;
        this.b = list;
        this.c = aVar;
    }

    @Override // xsna.t70.c
    public final boolean a() {
        return this.a;
    }
}
