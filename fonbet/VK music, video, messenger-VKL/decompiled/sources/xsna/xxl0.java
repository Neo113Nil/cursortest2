package xsna;

/* compiled from: StoryAvatarConfig.kt */
/* loaded from: classes6.dex */
public interface xxl0 {

    /* compiled from: StoryAvatarConfig.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddPlusBadgeParams(avatarImageSize=");
            sb.append(this.a);
            sb.append(", storyBorderPadding=");
            sb.append(this.b);
            sb.append(", storyBorderStrokeWidth=");
            return xq.c(')', this.c, sb);
        }
    }

    int a();

    boolean b();

    int c();

    int d();

    a e();

    int f();

    int g();

    a h();

    int i();
}
