package xsna;

/* compiled from: CommunityReviewsAnalyticsFacade.kt */
/* loaded from: classes18.dex */
public interface gyh {

    /* compiled from: CommunityReviewsAnalyticsFacade.kt */
    public static final class b {
        public final long a;
        public final Float b;
        public final Integer c;
        public final Integer d;
        public final String e;
        public final String f;
        public final Integer g;

        public b(long j, Float f, Integer num, Integer num2, String str, String str2, Integer num3) {
            this.a = j;
            this.b = f;
            this.c = num;
            this.d = num2;
            this.e = str;
            this.f = str2;
            this.g = num3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.g;
            return hashCode6 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendReviewData(ownerId=");
            sb.append(this.a);
            sb.append(", rateValue=");
            sb.append(this.b);
            sb.append(", rateCount=");
            sb.append(this.c);
            sb.append(", reviewRate=");
            sb.append(this.d);
            sb.append(", reviewText=");
            sb.append(this.e);
            sb.append(", qrSource=");
            sb.append(this.f);
            sb.append(", reviewTextLength=");
            return uqi.b(sb, this.g, ')');
        }
    }

    /* compiled from: CommunityReviewsAnalyticsFacade.kt */
    public static final class c {
        public final long a;
        public final Float b;
        public final Integer c;
        public final Float d;
        public final String e;
        public final String f;

        public c(long j, Float f, Integer num, Float f2, String str, String str2) {
            this.a = j;
            this.b = f;
            this.c = num;
            this.d = f2;
            this.e = str;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Float f2 = this.d;
            int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str = this.e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowWindowReviewData(ownerId=");
            sb.append(this.a);
            sb.append(", rateValue=");
            sb.append(this.b);
            sb.append(", rateCount=");
            sb.append(this.c);
            sb.append(", rate=");
            sb.append(this.d);
            sb.append(", comment=");
            sb.append(this.e);
            sb.append(", qrSource=");
            return ho8.a(sb, this.f, ')');
        }
    }

    void a(b bVar);

    void b(long j, Float f, Integer num);

    void c(c cVar);

    void d(c cVar);

    /* compiled from: CommunityReviewsAnalyticsFacade.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final gyh STUB = new C2961a();

        public final gyh getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityReviewsAnalyticsFacade.kt */
        /* renamed from: xsna.gyh$a$a, reason: collision with other inner class name */
        public static final class C2961a implements gyh {
            @Override // xsna.gyh
            public final void a(b bVar) {
            }

            @Override // xsna.gyh
            public final void c(c cVar) {
            }

            @Override // xsna.gyh
            public final void d(c cVar) {
            }

            @Override // xsna.gyh
            public final void b(long j, Float f, Integer num) {
            }
        }
    }
}
