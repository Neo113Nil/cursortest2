package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SharedPreferencesExt.kt */
/* loaded from: classes.dex */
public final class oxc0 {
    public static final bod b = new bod(2);
    public final List<b> a;

    /* compiled from: SharedPreferencesExt.kt */
    public static final class a {
        public String a;
        public String b;
        public final ArrayList c = new ArrayList();
    }

    /* compiled from: SharedPreferencesExt.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final izs<Object, Object> c;

        /* compiled from: SharedPreferencesExt.kt */
        public static final class a {
            public String a;
            public String b;
            public izs<Object, ? extends Object> c = oxc0.b;

            public final b a() {
                this.c.equals(oxc0.b);
                String str = this.a;
                if (str == null) {
                    str = null;
                }
                String str2 = this.b;
                return new b(str, str2 != null ? str2 : null, this.c);
            }
        }

        public b() {
            throw null;
        }

        public b(String str, String str2, izs izsVar) {
            this.a = str;
            this.b = str2;
            this.c = izsVar;
        }
    }

    public oxc0(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
    }
}
