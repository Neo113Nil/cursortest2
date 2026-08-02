package xsna;

import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;

/* compiled from: MainOverlayState.kt */
/* loaded from: classes17.dex */
public interface vf00 extends r3q0 {

    /* compiled from: MainOverlayState.kt */
    public static final class a implements vf00 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.r3q0
        public final String F() {
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
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class b {
        public final jvm0 a;
        public final boolean b;

        public b(jvm0 jvm0Var, boolean z) {
            this.a = jvm0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightTitleState(subscribeButtonState=");
            sb.append(this.a);
            sb.append(", dotSeparatorVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class c implements vf00 {
        public final String a;
        public final lw b;
        public final DescriptionViewState c;
        public final ti50 d;
        public final g1n e;
        public final x590 f;
        public final b g;

        public c(String str, lw lwVar, DescriptionViewState descriptionViewState, ti50 ti50Var, g1n g1nVar, x590 x590Var, b bVar) {
            this.a = str;
            this.b = lwVar;
            this.c = descriptionViewState;
            this.d = ti50Var;
            this.e = g1nVar;
            this.f = x590Var;
            this.g = bVar;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Visible(uniqueKey=" + this.a + ", actionButtonState=" + this.b + ", descriptionState=" + this.c + ", muteState=" + this.d + ", disclaimerState=" + this.e + ", ownerState=" + this.f + ", rightTitleState=" + this.g + ')';
        }
    }
}
