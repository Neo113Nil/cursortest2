package xsna;

import com.vk.story.api.domain.interactor.upload.StoryMultiData;

/* compiled from: SendStoryUsersSideEffect.kt */
/* loaded from: classes16.dex */
public abstract class dji0 {

    /* compiled from: SendStoryUsersSideEffect.kt */
    public static final class a extends dji0 {
        public static final a a = new a();
    }

    /* compiled from: SendStoryUsersSideEffect.kt */
    public static final class b extends dji0 {
        public static final b a = new b();
    }

    /* compiled from: SendStoryUsersSideEffect.kt */
    public static final class c extends dji0 {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenDialog(dialogId="));
        }
    }

    /* compiled from: SendStoryUsersSideEffect.kt */
    public static final class d extends dji0 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ReloadHelper(query="), this.a, ')');
        }
    }

    /* compiled from: SendStoryUsersSideEffect.kt */
    public static final class e extends dji0 {
        public final StoryMultiData a;
        public final long b;

        public e(StoryMultiData storyMultiData, long j) {
            this.a = storyMultiData;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            StoryMultiData storyMultiData = this.a;
            return Long.hashCode(this.b) + ((storyMultiData == null ? 0 : storyMultiData.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendToChat(storyMultiData=");
            sb.append(this.a);
            sb.append(", dialogId=");
            return vu5.a(')', this.b, sb);
        }
    }
}
