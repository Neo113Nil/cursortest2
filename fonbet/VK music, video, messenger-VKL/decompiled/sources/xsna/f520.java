package xsna;

/* compiled from: MenuBottomSheetActionType.kt */
/* loaded from: classes17.dex */
public abstract class f520 {

    /* compiled from: MenuBottomSheetActionType.kt */
    public static final class a extends f520 {
        public final String a = "getting_qualities";

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
            return ho8.a(new StringBuilder("VideoDownload(payload="), this.a, ')');
        }
    }
}
