package xsna;

import java.util.ArrayList;

/* compiled from: DzenArticleViewState.kt */
/* loaded from: classes18.dex */
public interface wso extends lm50 {

    /* compiled from: DzenArticleViewState.kt */
    public static final class a implements wso {
        public final String b;
        public final String c;
        public final ArrayList d;
        public final wzs<androidx.compose.runtime.a, Integer, us2> e;

        public a(String str, String str2, ArrayList arrayList, x2 x2Var) {
            this.b = str;
            this.c = str2;
            this.d = arrayList;
            this.e = x2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int a = qr.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            wzs<androidx.compose.runtime.a, Integer, us2> wzsVar = this.e;
            return a + (wzsVar != null ? wzsVar.hashCode() : 0);
        }

        public final String toString() {
            return "Content(toolbarTitle=" + this.b + ", toolbarIconUrl=" + this.c + ", items=" + this.d + ", infoDialogText=" + this.e + ')';
        }
    }

    /* compiled from: DzenArticleViewState.kt */
    public static final class b implements wso {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 889477355;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: DzenArticleViewState.kt */
    public static final class c implements wso {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1904884575;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
