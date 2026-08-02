package xsna;

import com.vk.photo.editor.ivm.autoenhance.AutoEnhanceMessage$Source;

/* compiled from: AutoEnhancePatch.kt */
/* loaded from: classes4.dex */
public interface bg5 extends mwx {

    /* compiled from: AutoEnhancePatch.kt */
    public static final class a implements bg5 {
        public final float a;
        public final AutoEnhanceMessage$Source b;

        public a(float f, AutoEnhanceMessage$Source autoEnhanceMessage$Source) {
            this.a = f;
            this.b = autoEnhanceMessage$Source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "UpdateEnhanceParams(intensity=" + this.a + ", source=" + this.b + ")";
        }
    }
}
