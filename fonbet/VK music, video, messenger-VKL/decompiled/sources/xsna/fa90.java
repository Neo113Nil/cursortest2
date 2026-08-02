package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;

/* compiled from: IdeasPage.kt */
/* loaded from: classes6.dex */
public interface fa90 {

    /* compiled from: IdeasPage.kt */
    public static final class a implements fa90 {
        public static final a a = new a();
    }

    /* compiled from: IdeasPage.kt */
    public static final class b implements fa90 {
        public static final b a = new b();
    }

    /* compiled from: IdeasPage.kt */
    public static final class c implements fa90 {
        public static final c a = new c();
    }

    /* compiled from: IdeasPage.kt */
    public static final class d implements fa90 {
        public final StoryBoxPrepared a;
        public final boolean b;

        public d(StoryBoxPrepared storyBoxPrepared, boolean z) {
            this.a = storyBoxPrepared;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(prepared=");
            sb.append(this.a);
            sb.append(", rendered=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
