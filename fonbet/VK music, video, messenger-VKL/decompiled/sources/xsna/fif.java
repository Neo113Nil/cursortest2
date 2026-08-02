package xsna;

import java.io.File;

/* compiled from: ClipsUploadState.kt */
/* loaded from: classes17.dex */
public final class fif {
    public final int a;
    public final a b;
    public final Integer c;
    public final File d;
    public final boolean e;

    /* compiled from: ClipsUploadState.kt */
    public interface a {

        /* compiled from: ClipsUploadState.kt */
        /* renamed from: xsna.fif$a$a, reason: collision with other inner class name */
        public static final class C2875a implements a {
            public static final C2875a a = new C2875a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2875a);
            }

            public final int hashCode() {
                return 631941435;
            }

            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1456867362;
            }

            public final String toString() {
                return "ClientCompleted";
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 247298399;
            }

            public final String toString() {
                return "Failed";
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class d implements a {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Progress(percentage="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1254741886;
            }

            public final String toString() {
                return "Removed";
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -627432602;
            }

            public final String toString() {
                return "ServerCompleted";
            }
        }

        /* compiled from: ClipsUploadState.kt */
        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1734279265;
            }

            public final String toString() {
                return "Started";
            }
        }
    }

    public fif(int i, a aVar, Integer num, File file, boolean z) {
        this.a = i;
        this.b = aVar;
        this.c = num;
        this.d = file;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fif)) {
            return false;
        }
        fif fifVar = (fif) obj;
        return this.a == fifVar.a && epx.f(this.b, fifVar.b) && epx.f(this.c, fifVar.c) && epx.f(this.d, fifVar.d) && this.e == fifVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        File file = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadState(uploadId=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", previewFile=");
        sb.append(this.d);
        sb.append(", hasMusic=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
