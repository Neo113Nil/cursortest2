package xsna;

import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;

/* compiled from: MainOverlayState.kt */
/* loaded from: classes17.dex */
public interface uf00 extends r3q0 {

    /* compiled from: MainOverlayState.kt */
    public static final class a implements uf00 {
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
    public static final class b implements uf00 {
        public final String a;
        public final lw b;
        public final DescriptionViewState c;
        public final ti50 d;
        public final r0n e;
        public final g1n f;
        public final x590 g;

        public b(String str, lw lwVar, DescriptionViewState descriptionViewState, ti50 ti50Var, r0n r0nVar, g1n g1nVar, x590 x590Var) {
            this.a = str;
            this.b = lwVar;
            this.c = descriptionViewState;
            this.d = ti50Var;
            this.e = r0nVar;
            this.f = g1nVar;
            this.g = x590Var;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Visible(uniqueKey=" + this.a + ", actionButtonState=" + this.b + ", descriptionState=" + this.c + ", muteState=" + this.d + ", disclaimerBannerState=" + this.e + ", disclaimerState=" + this.f + ", ownerState=" + this.g + ')';
        }
    }
}
