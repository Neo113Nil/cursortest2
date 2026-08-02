package xsna;

/* compiled from: VkAvatarDefault.kt */
/* loaded from: classes17.dex */
public interface zr5 {

    /* compiled from: VkAvatarDefault.kt */
    public static final class a implements zr5 {
        public static final a a = new a();
    }

    /* compiled from: VkAvatarDefault.kt */
    @vby
    public static final class b implements zr5 {
        public final long a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return q9k.d("Dialog(dialogId=", this.a, ')');
        }
    }

    /* compiled from: VkAvatarDefault.kt */
    public static final class c implements zr5 {
        public static final c a = new c();
    }
}
