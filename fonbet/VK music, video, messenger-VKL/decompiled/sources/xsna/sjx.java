package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.dto.common.Image;
import java.util.Map;
import java.util.Set;

/* compiled from: InternalNpsPatch.kt */
/* loaded from: classes16.dex */
public abstract class sjx implements xl50 {

    /* compiled from: InternalNpsPatch.kt */
    public static final class a extends sjx {
        public final boolean b;
        public final Set<String> c;

        public a(Set set, boolean z) {
            this.b = z;
            this.c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeSelectedValues(nextAllowed=");
            sb.append(this.b);
            sb.append(", selectedValues=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: InternalNpsPatch.kt */
    public static final class b extends sjx {
        public final String b;
        public final Image c;
        public final int d;
        public final InternalNpsQuestion e;
        public final boolean f;
        public final Map<String, InternalNpsQuestion> g;

        public b(String str, Image image, int i, InternalNpsQuestion internalNpsQuestion, boolean z, Map<String, InternalNpsQuestion> map) {
            this.b = str;
            this.c = image;
            this.d = i;
            this.e = internalNpsQuestion;
            this.f = z;
            this.g = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + qoy.b((this.e.hashCode() + shy.a(this.d, fq.b(this.c, this.b.hashCode() * 31, 31), 31)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(contentId=");
            sb.append(this.b);
            sb.append(", image=");
            sb.append(this.c);
            sb.append(", longestQuestionsChain=");
            sb.append(this.d);
            sb.append(", currentQuestion=");
            sb.append(this.e);
            sb.append(", nextActionAllowed=");
            sb.append(this.f);
            sb.append(", allQuestions=");
            return cjl0.a(sb, this.g, ')');
        }
    }

    /* compiled from: InternalNpsPatch.kt */
    public static final class c extends sjx {
        public final boolean b;
        public final int c;
        public final InternalNpsQuestion d;

        public c(boolean z, int i, InternalNpsQuestion internalNpsQuestion) {
            this.b = z;
            this.c = i;
            this.d = internalNpsQuestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, Boolean.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            return "NewQuestionSelected(nextActionAllowed=" + this.b + ", currentQuestionIndex=" + this.c + ", currentQuestion=" + this.d + ')';
        }
    }

    /* compiled from: InternalNpsPatch.kt */
    public static final class d extends sjx {
        public static final d b = new d();
    }
}
