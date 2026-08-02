package xsna;

import com.vk.dto.common.Image;
import java.util.ArrayList;
import xsna.tlo0;

/* compiled from: QuestionnaireUIModel.kt */
/* loaded from: classes16.dex */
public interface dqe0 {

    /* compiled from: QuestionnaireUIModel.kt */
    public interface a extends dqe0 {
        tlo0 a();

        boolean b();
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class b implements dqe0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1140164547;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class c implements dqe0 {
        public final Image a;
        public final tlo0.h b;

        public c(Image image, tlo0.h hVar) {
            this.a = image;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoreLessQuestionnaire(clipImage=");
            sb.append(this.a);
            sb.append(", titleText=");
            return jq.c(sb, this.b, ')');
        }
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class d implements a {
        public final tlo0.g a;
        public final tlo0.h b;
        public final boolean c;
        public final ArrayList d;

        public d(tlo0.g gVar, tlo0.h hVar, boolean z, ArrayList arrayList) {
            this.a = gVar;
            this.b = hVar;
            this.c = z;
            this.d = arrayList;
        }

        @Override // xsna.dqe0.a
        public final tlo0 a() {
            return this.b;
        }

        @Override // xsna.dqe0.a
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c && this.d.equals(dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(u11.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiSelectQuestionnaire(stepTitleText=");
            sb.append(this.a);
            sb.append(", titleText=");
            sb.append(this.b);
            sb.append(", nextButtonEnabled=");
            sb.append(this.c);
            sb.append(", questions=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class e implements a {
        public final tlo0.g a;
        public final tlo0.h b;
        public final boolean c;
        public final ArrayList d;

        public e(tlo0.g gVar, tlo0.h hVar, boolean z, ArrayList arrayList) {
            this.a = gVar;
            this.b = hVar;
            this.c = z;
            this.d = arrayList;
        }

        @Override // xsna.dqe0.a
        public final tlo0 a() {
            return this.b;
        }

        @Override // xsna.dqe0.a
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c == eVar.c && this.d.equals(eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(u11.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectQuestionnaire(stepTitleText=");
            sb.append(this.a);
            sb.append(", titleText=");
            sb.append(this.b);
            sb.append(", nextButtonEnabled=");
            sb.append(this.c);
            sb.append(", questions=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class f implements dqe0 {
        public final Image a;
        public final tlo0.h b;

        public f(Image image, tlo0.h hVar) {
            this.a = image;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StarsQuestionnaire(clipImage=");
            sb.append(this.a);
            sb.append(", titleText=");
            return jq.c(sb, this.b, ')');
        }
    }

    /* compiled from: QuestionnaireUIModel.kt */
    public static final class g implements a {
        public final tlo0.g a;
        public final tlo0.h b;
        public final boolean c;
        public final tlo0.h d;
        public final int e;

        public g(tlo0.g gVar, tlo0.h hVar, boolean z, tlo0.h hVar2, int i) {
            this.a = gVar;
            this.b = hVar;
            this.c = z;
            this.d = hVar2;
            this.e = i;
        }

        @Override // xsna.dqe0.a
        public final tlo0 a() {
            return this.b;
        }

        @Override // xsna.dqe0.a
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c == gVar.c && this.d.equals(gVar.d) && this.e == gVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + u11.c(qoy.b(u11.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextQuestionnaire(stepTitleText=");
            sb.append(this.a);
            sb.append(", titleText=");
            sb.append(this.b);
            sb.append(", nextButtonEnabled=");
            sb.append(this.c);
            sb.append(", limitText=");
            sb.append(this.d);
            sb.append(", textLimit=");
            return vu5.b(sb, this.e, ')');
        }
    }
}
