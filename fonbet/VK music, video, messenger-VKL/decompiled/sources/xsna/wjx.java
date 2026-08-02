package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.dto.common.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.rpe0;

/* compiled from: InternalNpsState.kt */
/* loaded from: classes16.dex */
public interface wjx extends km50 {

    /* compiled from: InternalNpsState.kt */
    public static final class a implements wjx {
        public final String b;
        public final Image c;
        public final int d;
        public final int e;
        public final boolean f;
        public final InternalNpsQuestion g;
        public final rpe0 h;
        public final Map<String, Set<String>> i;
        public final Map<String, InternalNpsQuestion> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Image image, int i, int i2, boolean z, InternalNpsQuestion internalNpsQuestion, rpe0 rpe0Var, Map<String, ? extends Set<String>> map, Map<String, InternalNpsQuestion> map2) {
            this.b = str;
            this.c = image;
            this.d = i;
            this.e = i2;
            this.f = z;
            this.g = internalNpsQuestion;
            this.h = rpe0Var;
            this.i = map;
            this.j = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, int i, boolean z, InternalNpsQuestion internalNpsQuestion, rpe0.a aVar2, LinkedHashMap linkedHashMap, int i2) {
            String str = aVar.b;
            Image image = aVar.c;
            int i3 = aVar.d;
            if ((i2 & 8) != 0) {
                i = aVar.e;
            }
            int i4 = i;
            if ((i2 & 32) != 0) {
                internalNpsQuestion = aVar.g;
            }
            InternalNpsQuestion internalNpsQuestion2 = internalNpsQuestion;
            Map map = linkedHashMap;
            if ((i2 & 128) != 0) {
                map = aVar.i;
            }
            Map<String, InternalNpsQuestion> map2 = aVar.j;
            aVar.getClass();
            return new a(str, image, i3, i4, z, internalNpsQuestion2, aVar2, map, map2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int hashCode = (this.g.hashCode() + qoy.b(shy.a(this.e, shy.a(this.d, fq.b(this.c, this.b.hashCode() * 31, 31), 31), 31), 31, this.f)) * 31;
            rpe0 rpe0Var = this.h;
            return this.j.hashCode() + v11.a((hashCode + (rpe0Var == null ? 0 : rpe0Var.hashCode())) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(contentId=");
            sb.append(this.b);
            sb.append(", image=");
            sb.append(this.c);
            sb.append(", questionsAmount=");
            sb.append(this.d);
            sb.append(", currentQuestionIndex=");
            sb.append(this.e);
            sb.append(", nextActionAllowed=");
            sb.append(this.f);
            sb.append(", currentQuestion=");
            sb.append(this.g);
            sb.append(", questionPayload=");
            sb.append(this.h);
            sb.append(", selectedValues=");
            sb.append(this.i);
            sb.append(", allQuestions=");
            return cjl0.a(sb, this.j, ')');
        }
    }

    /* compiled from: InternalNpsState.kt */
    public static final class b implements wjx {
        public static final b b = new b();
    }

    /* compiled from: InternalNpsState.kt */
    public static final class c implements wjx {
        public static final c b = new c();
    }
}
