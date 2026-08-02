package xsna;

import xsna.ln50;
import xsna.on50;

/* compiled from: ClipCtaWithDonutMviTask.kt */
/* loaded from: classes16.dex */
public interface xpc extends hn50 {

    /* compiled from: ClipCtaWithDonutMviTask.kt */
    public static final class a implements xpc {
        public static final a b = new a();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 1005999231;
        }

        public final String toString() {
            return "Init";
        }
    }
}
