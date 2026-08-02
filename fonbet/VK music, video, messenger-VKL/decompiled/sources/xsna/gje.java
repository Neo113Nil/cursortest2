package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsLikesDisappearAnimation.kt */
/* loaded from: classes17.dex */
public final class gje {
    public final com.vk.im.ui.components.viewcontrollers.dialog_header.info.a a;
    public final gzs<s3q0> b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new eu1(this, 24));

    /* compiled from: ClipsLikesDisappearAnimation.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + (Long.hashCode(150L) * 31);
        }

        public final String toString() {
            return "DisappearConfig(durationMs=150, startDelayMs=0)";
        }
    }

    public gje(com.vk.im.ui.components.viewcontrollers.dialog_header.info.a aVar, gzs gzsVar) {
        this.a = aVar;
        this.b = gzsVar;
    }
}
