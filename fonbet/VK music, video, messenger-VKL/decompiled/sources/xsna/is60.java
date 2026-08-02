package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;

/* compiled from: NewsfeedListViewState.kt */
/* loaded from: classes4.dex */
public interface is60 extends lm50 {

    /* compiled from: NewsfeedListViewState.kt */
    public static final class a implements is60 {
        public final sq60 b;
        public final ListLoadingState c;
        public final boolean d;
        public final boolean e;

        static {
            sq60 sq60Var = sq60.i;
        }

        public a(sq60 sq60Var, ListLoadingState listLoadingState, boolean z, boolean z2) {
            this.b = sq60Var;
            this.c = listLoadingState;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(items=");
            sb.append(this.b);
            sb.append(", loadingState=");
            sb.append(this.c);
            sb.append(", isLoaderVisible=");
            sb.append(this.d);
            sb.append(", isErrorVisible=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
