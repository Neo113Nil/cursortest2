package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class csz0 {
    public final b a;
    public final a b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final List a;

        /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
        /* renamed from: xsna.csz0$a$a, reason: collision with other inner class name */
        public static final class C2681a {
            public final String a;
            public final int b;
            public final int c;

            public C2681a(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Frame{url='");
                sb.append(this.a);
                sb.append("', width='");
                sb.append(this.b);
                sb.append("', height='");
                return h5s.c(this.c, "'}", sb);
            }
        }

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final String toString() {
            return ms9.a('}', new StringBuilder("Assets{firstFrame="), this.a);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text{title='");
            sb.append(this.a);
            sb.append("', body='");
            sb.append(this.b);
            sb.append("', domain='");
            return i5s.a(sb, this.c, "'}");
        }
    }

    public csz0(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final String toString() {
        return "YandexAdInfoExtension{text=" + this.a + ", assets=" + this.b + '}';
    }
}
