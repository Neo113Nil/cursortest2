package xsna;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: Objects.java */
/* loaded from: classes12.dex */
public final class cq70 {

    /* compiled from: Objects.java */
    public static final class a {
        public final String a;
        public final C2677a b;
        public C2677a c;

        /* compiled from: Objects.java */
        /* renamed from: xsna.cq70$a$a, reason: collision with other inner class name */
        public static final class C2677a {
            public String a;
            public Object b;
            public C2677a c;
        }

        public a(String str) {
            C2677a c2677a = new C2677a();
            this.b = c2677a;
            this.c = c2677a;
            this.a = str;
        }

        public final void a(int i, String str) {
            d(String.valueOf(i), str);
        }

        public final void b(String str, String str2) {
            d(str2, str);
        }

        public final void c(String str, boolean z) {
            d(String.valueOf(z), str);
        }

        public final void d(Object obj, String str) {
            C2677a c2677a = new C2677a();
            this.c.c = c2677a;
            this.c = c2677a;
            c2677a.b = obj;
            c2677a.a = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            C2677a c2677a = this.b.c;
            String str = "";
            while (c2677a != null) {
                Object obj = c2677a.b;
                sb.append(str);
                String str2 = c2677a.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append(B5.U);
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                c2677a = c2677a.c;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
