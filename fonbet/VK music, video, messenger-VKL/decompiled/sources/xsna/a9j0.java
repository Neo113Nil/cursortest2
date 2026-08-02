package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;

/* compiled from: ShareStorySideEffect.kt */
/* loaded from: classes16.dex */
public abstract class a9j0 {

    /* compiled from: ShareStorySideEffect.kt */
    public static final class a extends a9j0 {
        public final String a;
        public final String b;
        public final UserId c;

        public a(String str, String str2, UserId userId) {
            this.a = str;
            this.b = str2;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return Long.hashCode(this.c.b) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChooseAuthor(name=");
            sb.append(this.a);
            sb.append(", url=");
            sb.append(this.b);
            sb.append(", uid=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class b extends a9j0 {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CreateNarrativeDialog(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class c extends a9j0 {
        public static final c a = new c();
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class d extends a9j0 {
        public static final d a = new d();
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class e extends a9j0 {
        public static final e a = new e();
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class f extends a9j0 {
        public final StoryMultiData a;

        public f(StoryMultiData storyMultiData) {
            this.a = storyMultiData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            StoryMultiData storyMultiData = this.a;
            if (storyMultiData == null) {
                return 0;
            }
            return storyMultiData.hashCode();
        }

        public final String toString() {
            return "OpenSendStoryUsersBottomSheet(storyMultiData=" + this.a + ')';
        }
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class g extends a9j0 {
        public final UserId a;

        public g(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Publish(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ShareStorySideEffect.kt */
    public static final class h extends a9j0 {
        public final Throwable a;

        public h(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowErrorToast(throwable="), this.a, ')');
        }
    }
}
