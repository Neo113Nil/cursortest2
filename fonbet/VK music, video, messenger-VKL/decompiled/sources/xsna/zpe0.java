package xsna;

import com.vk.video.polls.entrypoint.model.UxPollType;

/* compiled from: QuestionViewParams.kt */
/* loaded from: classes6.dex */
public final class zpe0 {
    public final a a;
    public final UxPollType b;

    /* compiled from: QuestionViewParams.kt */
    public interface a {

        /* compiled from: QuestionViewParams.kt */
        /* renamed from: xsna.zpe0$a$a, reason: collision with other inner class name */
        public static final class C4194a implements a {
            public static final C4194a a = new C4194a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4194a);
            }

            public final int hashCode() {
                return -1916906189;
            }

            public final String toString() {
                return "EntryPoint";
            }
        }

        /* compiled from: QuestionViewParams.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -724945804;
            }

            public final String toString() {
                return "Poll";
            }
        }
    }

    public zpe0(a aVar, UxPollType uxPollType) {
        this.a = aVar;
        this.b = uxPollType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpe0)) {
            return false;
        }
        zpe0 zpe0Var = (zpe0) obj;
        return epx.f(this.a, zpe0Var.a) && this.b == zpe0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuestionViewParams(pollViewType=" + this.a + ", pollType=" + this.b + ')';
    }

    public /* synthetic */ zpe0(UxPollType uxPollType) {
        this(a.b.a, uxPollType);
    }
}
