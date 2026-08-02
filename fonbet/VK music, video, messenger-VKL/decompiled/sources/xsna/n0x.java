package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;

/* compiled from: InlineNpsState.kt */
/* loaded from: classes17.dex */
public interface n0x {

    /* compiled from: InlineNpsState.kt */
    public static final class a implements n0x {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1543115478;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: InlineNpsState.kt */
    public static final class b implements n0x {
        public final InternalNpsQuestions a;
        public final InternalNpsQuestion b;
        public final boolean c;

        public b(InternalNpsQuestions internalNpsQuestions, InternalNpsQuestion internalNpsQuestion) {
            this.a = internalNpsQuestions;
            this.b = internalNpsQuestion;
            this.c = epx.f(internalNpsQuestion.c, internalNpsQuestions.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Question(questionnaire=" + this.a + ", question=" + this.b + ')';
        }
    }

    /* compiled from: InlineNpsState.kt */
    public static final class c implements n0x {
        public final boolean a;

        public c(InternalNpsQuestions internalNpsQuestions, InternalNpsQuestion internalNpsQuestion) {
            this.a = epx.f(internalNpsQuestion.c, internalNpsQuestions.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Thanks(isStartQuestion="), this.a, ')');
        }
    }
}
