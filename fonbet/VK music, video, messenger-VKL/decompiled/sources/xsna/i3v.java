package xsna;

import xsna.hsk0;

/* compiled from: HideAppContentSideEffect.kt */
/* loaded from: classes15.dex */
public interface i3v {

    /* compiled from: HideAppContentSideEffect.kt */
    public static final class a implements i3v {
        public final hsk0.e a;

        public a(hsk0.e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a.a);
        }

        public final String toString() {
            return "StatEvent(item=" + this.a + ')';
        }
    }
}
