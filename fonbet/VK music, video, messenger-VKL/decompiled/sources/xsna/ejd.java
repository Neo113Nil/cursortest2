package xsna;

import com.vk.core.view.components.picture.c;

/* compiled from: ClipsAvatarCommentBubbleView.kt */
/* loaded from: classes16.dex */
public final class ejd {
    public final c.d a;
    public final a b;

    /* compiled from: ClipsAvatarCommentBubbleView.kt */
    public static final class a {
        public final float a;
        public final x7g b;

        public a(float f, x7g x7gVar) {
            this.a = f;
            this.b = x7gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "VkPictureBorder(width=" + this.a + ", color=" + this.b + ')';
        }
    }

    public ejd(c.d dVar, a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejd)) {
            return false;
        }
        ejd ejdVar = (ejd) obj;
        return this.a.equals(ejdVar.a) && this.b.equals(ejdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(picture=" + this.a + ", border=" + this.b + ')';
    }
}
