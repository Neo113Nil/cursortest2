package xsna;

import com.vk.dto.common.im.ImageList;

/* compiled from: JoinCallContentViewState.kt */
/* loaded from: classes7.dex */
public final class gzx {
    public final boolean a;
    public final int b;
    public final String c;
    public final a d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: JoinCallContentViewState.kt */
    public static abstract class a {

        /* compiled from: JoinCallContentViewState.kt */
        /* renamed from: xsna.gzx$a$a, reason: collision with other inner class name */
        public static final class C2962a extends a {
            public final String a;

            public C2962a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2962a) && epx.f(this.a, ((C2962a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AsAnonym(name="), this.a, ')');
            }
        }

        /* compiled from: JoinCallContentViewState.kt */
        public static final class b extends a {
            public final String a;
            public final ImageList b;

            public b(String str, ImageList imageList) {
                this.a = str;
                this.b = imageList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "AsGroup(name=" + this.a + ", avatar=" + this.b + ')';
            }
        }

        /* compiled from: JoinCallContentViewState.kt */
        public static final class c extends a {
            public final String a;
            public final ImageList b;

            public c(String str, ImageList imageList) {
                this.a = str;
                this.b = imageList;
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
                return this.b.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "AsUser(name=" + this.a + ", avatar=" + this.b + ')';
            }
        }

        /* compiled from: JoinCallContentViewState.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    public gzx(boolean z, int i, String str, a aVar, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = aVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzx)) {
            return false;
        }
        gzx gzxVar = (gzx) obj;
        return this.a == gzxVar.a && this.b == gzxVar.b && epx.f(this.c, gzxVar.c) && epx.f(this.d, gzxVar.d) && this.e == gzxVar.e && this.f == gzxVar.f && this.g == gzxVar.g;
    }

    public final int hashCode() {
        int a2 = shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b((this.d.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinCallContentViewState(isQrCodeVisible=");
        sb.append(this.a);
        sb.append(", peopleCount=");
        sb.append(this.b);
        sb.append(", callName=");
        sb.append(this.c);
        sb.append(", joinAs=");
        sb.append(this.d);
        sb.append(", isTransparentLoading=");
        sb.append(this.e);
        sb.append(", isCameraPreviewEnabled=");
        sb.append(this.f);
        sb.append(", isMicrophoneEnabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
