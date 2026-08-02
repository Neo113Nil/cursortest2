package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import java.util.List;

/* compiled from: QuestionnaireTrigger.kt */
/* loaded from: classes16.dex */
public interface cqe0 {

    /* compiled from: QuestionnaireTrigger.kt */
    public static final class a implements cqe0 {
        public final List<String> a;
        public final InternalNpsQuestions b;

        public a(List<String> list, InternalNpsQuestions internalNpsQuestions) {
            this.a = list;
            this.b = internalNpsQuestions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AfterViewVideo(videoIds=" + this.a + ", connectedQuestions=" + this.b + ')';
        }
    }
}
