package xsna;

import java.util.List;
import xsna.b280;
import xsna.c280;

/* compiled from: OldUserOnBoardingFlow.kt */
/* loaded from: classes5.dex */
public final class d080 {
    public final List<a<c280.c, b280.c>> a;

    /* compiled from: OldUserOnBoardingFlow.kt */
    public static final class a<Top extends c280, Bottom extends b280> {
        public final Top a;
        public final Bottom b;

        public a(Top top, Bottom bottom) {
            this.a = top;
            this.b = bottom;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Screen(top=" + this.a + ", bottom=" + this.b + ')';
        }
    }

    public d080(List<a<c280.c, b280.c>> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d080) && epx.f(this.a, ((d080) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("OldUserOnBoardingFlow(stepScreens="), this.a);
    }
}
