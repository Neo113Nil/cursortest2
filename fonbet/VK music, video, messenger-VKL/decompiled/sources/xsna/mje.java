package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: ClipsLikesTransitionAnimation.kt */
/* loaded from: classes17.dex */
public final class mje {
    public final gzs<s3q0> a;
    public final com.vk.movika.tools.controls.seekbar.i b;
    public a c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new hh1(this, 17));

    /* compiled from: ClipsLikesTransitionAnimation.kt */
    public static final class a {
        public final Pair<Float, Float> a;
        public final Pair<Float, Float> b;

        public a(Pair pair, Pair pair2) {
            this.a = pair;
            this.b = pair2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(100L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "TransitionConfig(from=" + this.a + ", to=" + this.b + ", durationMs=100)";
        }
    }

    public mje(gzs gzsVar, com.vk.movika.tools.controls.seekbar.i iVar) {
        this.a = gzsVar;
        this.b = iVar;
    }
}
