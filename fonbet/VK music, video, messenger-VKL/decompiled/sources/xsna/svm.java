package xsna;

/* compiled from: DialogsSearchViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class svm implements yn50 {

    /* compiled from: DialogsSearchViewEvent.kt */
    public static final class a extends svm {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("ShowError(throwable="), this.a, ')');
        }
    }

    /* compiled from: DialogsSearchViewEvent.kt */
    public static final class b extends svm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1367611471;
        }

        public final String toString() {
            return "ShowJoinSnackbar";
        }
    }

    /* compiled from: DialogsSearchViewEvent.kt */
    public static final class c extends svm {
        public final long a;
        public final boolean b;

        public c(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowLeaveSnackbar(channelId=");
            sb.append(this.a);
            sb.append(", isRecommendation=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
