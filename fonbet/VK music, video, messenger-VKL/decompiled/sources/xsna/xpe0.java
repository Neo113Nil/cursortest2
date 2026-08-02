package xsna;

import java.util.Collection;

/* compiled from: QuestionUiState.kt */
/* loaded from: classes6.dex */
public interface xpe0 {

    /* compiled from: QuestionUiState.kt */
    public static final class a {
        public static final aq0 a = new aq0(10);
    }

    /* compiled from: QuestionUiState.kt */
    public static final class b implements xpe0 {
        public final Collection<Integer> a;
        public final boolean b = Boolean.TRUE.booleanValue();

        public b(Collection collection) {
            this.a = collection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b) || !epx.f(this.a, ((b) obj).a)) {
                return false;
            }
            Object obj2 = a.a;
            return obj2.equals(obj2);
        }

        public final int hashCode() {
            return a.a.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // xsna.xpe0
        public final boolean isAnswered() {
            return this.b;
        }

        public final String toString() {
            return "PollChipsUiState(selectedChips=" + this.a + ", answeredCheck=" + a.a + ')';
        }
    }

    /* compiled from: QuestionUiState.kt */
    public static final class c implements xpe0 {
        public final int a;
        public final gzs<Boolean> b;
        public final boolean c;

        public c(int i, gzs<Boolean> gzsVar) {
            this.a = i;
            this.b = gzsVar;
            this.c = gzsVar.invoke().booleanValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        @Override // xsna.xpe0
        public final boolean isAnswered() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PollGradeUiState(current=");
            sb.append(this.a);
            sb.append(", answeredCheck=");
            return uf3.d(sb, this.b, ')');
        }
    }

    /* compiled from: QuestionUiState.kt */
    public static final class d implements xpe0 {
        public final boolean a;
        public final gzs<Boolean> b;
        public final boolean c;

        public d(boolean z, gzs<Boolean> gzsVar) {
            this.a = z;
            this.b = gzsVar;
            this.c = gzsVar.invoke().booleanValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        @Override // xsna.xpe0
        public final boolean isAnswered() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PollOpenViewUiState(isActive=");
            sb.append(this.a);
            sb.append(", answeredCheck=");
            return uf3.d(sb, this.b, ')');
        }
    }

    /* compiled from: QuestionUiState.kt */
    public static final class e implements xpe0 {
        public final int a;
        public final gzs<Boolean> b;
        public final boolean c;

        public e(int i, gzs<Boolean> gzsVar) {
            this.a = i;
            this.b = gzsVar;
            this.c = gzsVar.invoke().booleanValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        @Override // xsna.xpe0
        public final boolean isAnswered() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PollRatingStarUiState(active=");
            sb.append(this.a);
            sb.append(", answeredCheck=");
            return uf3.d(sb, this.b, ')');
        }
    }

    /* compiled from: QuestionUiState.kt */
    public static final class f implements xpe0 {
        public static final f a = new f();
        public static final boolean b = true;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2144523223;
        }

        @Override // xsna.xpe0
        public final boolean isAnswered() {
            return b;
        }

        public final String toString() {
            return "UnknownQuestion";
        }
    }

    boolean isAnswered();
}
