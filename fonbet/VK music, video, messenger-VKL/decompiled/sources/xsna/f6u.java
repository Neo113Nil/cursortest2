package xsna;

/* compiled from: GoodPreviewEvent.kt */
/* loaded from: classes18.dex */
public interface f6u {

    /* compiled from: GoodPreviewEvent.kt */
    public static final class a implements f6u {
        public static final a a = new a();
    }

    /* compiled from: GoodPreviewEvent.kt */
    public static final class b implements f6u {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowAddToCartError(throwable="), this.a, ')');
        }
    }

    /* compiled from: GoodPreviewEvent.kt */
    public static final class c implements f6u {
        public final k7u a;
        public final boolean b;
        public final boolean c;
        public final Integer d;

        public c(k7u k7uVar, boolean z, boolean z2, Integer num) {
            this.a = k7uVar;
            this.b = z;
            this.c = z2;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleFave(good=");
            sb.append(this.a);
            sb.append(", isFave=");
            sb.append(this.b);
            sb.append(", isRecommendation=");
            sb.append(this.c);
            sb.append(", position=");
            return uqi.b(sb, this.d, ')');
        }
    }
}
