package xsna;

import java.util.ArrayList;

/* compiled from: StickerStatEvent.kt */
/* loaded from: classes4.dex */
public interface z6l0 extends srk0 {

    /* compiled from: StickerStatEvent.kt */
    public static final class a implements z6l0 {
        public static final a a = new a();
    }

    /* compiled from: StickerStatEvent.kt */
    public static final class b implements z6l0 {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Save(stickers=" + this.a + ")";
        }
    }
}
