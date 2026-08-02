package xsna;

/* compiled from: WebAppBottomSheetData.kt */
/* loaded from: classes6.dex */
public final class aex0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final Boolean d;
    public final CharSequence e;
    public final CharSequence f;
    public final e g;
    public final e h;
    public final e i;
    public final c j;

    /* compiled from: WebAppBottomSheetData.kt */
    public static final class a {
        public String a;
        public Integer b;
        public String c;
        public Boolean d;
        public CharSequence e;
        public CharSequence f;
        public e g;
        public e h;
        public e i;
        public c j;

        public final aex0 a() {
            return new aex0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final void b(String str, b bVar) {
            this.g = new e(str, bVar);
        }
    }

    /* compiled from: WebAppBottomSheetData.kt */
    public interface b {
        void a();
    }

    /* compiled from: WebAppBottomSheetData.kt */
    public interface c {
        void onCancel();
    }

    /* compiled from: WebAppBottomSheetData.kt */
    public interface d {
        void a();

        void b();

        void onCancel();
    }

    /* compiled from: WebAppBottomSheetData.kt */
    public static final class e {
        public final CharSequence a;
        public final b b;

        public e(CharSequence charSequence, b bVar) {
            this.a = charSequence;
            this.b = bVar;
        }

        public final CharSequence a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "WebAppBottomSheetButtonInfo(title=" + ((Object) this.a) + ", clickListener=" + this.b + ')';
        }
    }

    public aex0(String str, Integer num, String str2, Boolean bool, CharSequence charSequence, CharSequence charSequence2, e eVar, e eVar2, e eVar3, c cVar) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = bool;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = eVar;
        this.h = eVar2;
        this.i = eVar3;
        this.j = cVar;
    }

    public final e a() {
        return this.i;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final CharSequence d() {
        return this.f;
    }

    public final e e() {
        return this.h;
    }

    public final e f() {
        return this.g;
    }

    public final String g() {
        return this.a;
    }

    public final CharSequence h() {
        return this.e;
    }

    public final Boolean i() {
        return this.d;
    }
}
