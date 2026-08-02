package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: VkUserStackAvatar.kt */
/* loaded from: classes17.dex */
public interface ayv0 {

    /* compiled from: VkUserStackAvatar.kt */
    public static final class a implements ayv0 {
        public final Drawable a;

        public a(Drawable drawable) {
            this.a = drawable;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: VkUserStackAvatar.kt */
    public static final class b implements ayv0 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    /* compiled from: VkUserStackAvatar.kt */
    public static final class c implements ayv0 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
