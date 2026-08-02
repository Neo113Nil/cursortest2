package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hr5;

/* compiled from: UserEditableData.kt */
/* loaded from: classes5.dex */
public interface ir5 {

    /* compiled from: UserEditableData.kt */
    public static final class a implements ir5 {
        public final List<Integer> a;

        public a() {
            this(0);
        }

        @Override // xsna.ir5
        public final List<Integer> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Empty(removedIds="), this.a);
        }

        public a(List<Integer> list) {
            this.a = list;
        }

        public a(int i) {
            this(EmptyList.b);
        }
    }

    /* compiled from: UserEditableData.kt */
    public static final class b implements ir5 {
        public final hr5 a;
        public final gr5 b;
        public final List<Integer> c;

        public b(hr5 hr5Var, gr5 gr5Var, List<Integer> list) {
            this.a = hr5Var;
            this.b = gr5Var;
            this.c = list;
        }

        @Override // xsna.ir5
        public final List<Integer> a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            hr5 hr5Var = this.a;
            return this.c.hashCode() + ((this.b.hashCode() + ((hr5Var == null ? 0 : hr5Var.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("New(original=");
            sb.append(this.a);
            sb.append(", new=");
            sb.append(this.b);
            sb.append(", removedIds=");
            return ms9.a(')', sb, this.c);
        }
    }

    List<Integer> a();

    /* compiled from: UserEditableData.kt */
    public static final class c implements ir5 {
        public final hr5 a;
        public final List<Integer> b;

        public c(hr5 hr5Var, List<Integer> list) {
            this.a = hr5Var;
            this.b = list;
        }

        @Override // xsna.ir5
        public final List<Integer> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Original(original=");
            sb.append(this.a);
            sb.append(", removedIds=");
            return ms9.a(')', sb, this.b);
        }

        public c(hr5.a aVar) {
            this(aVar, EmptyList.b);
        }
    }
}
