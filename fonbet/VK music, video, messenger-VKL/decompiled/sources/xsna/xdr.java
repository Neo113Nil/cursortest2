package xsna;

/* compiled from: FilterStatEvent.kt */
/* loaded from: classes4.dex */
public interface xdr extends srk0 {

    /* compiled from: FilterStatEvent.kt */
    public static final class a implements xdr {
        public final String a;
        public final String b;
        public final Integer c;

        public a(String str, String str2, Integer num) {
            this.a = str;
            this.b = str2;
            this.c = num;
        }
    }

    /* compiled from: FilterStatEvent.kt */
    public static final class b implements xdr {
        public static final b a = new b();
    }

    /* compiled from: FilterStatEvent.kt */
    public static final class c implements xdr {
        public final String a;
        public final String b;
        public final Integer c;

        public c(String str, String str2, Integer num) {
            this.a = str;
            this.b = str2;
            this.c = num;
        }
    }

    /* compiled from: FilterStatEvent.kt */
    public static final class d implements xdr {
        public static final d a = new d();
    }

    /* compiled from: FilterStatEvent.kt */
    public static final class e implements xdr {
        public final String a;
        public final String b;
        public final Integer c;
        public final int d;

        public e(int i, String str, Integer num, String str2) {
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = i;
        }
    }
}
