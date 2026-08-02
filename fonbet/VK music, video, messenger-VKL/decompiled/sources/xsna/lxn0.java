package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: Table.java */
@Deprecated
/* loaded from: classes17.dex */
public final class lxn0 {
    public final String a;
    public final ArrayList<a> b = new ArrayList<>();

    /* compiled from: Table.java */
    @Deprecated
    public static class a {
        public final lxn0 a;
        public final String b;
        public final String c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;

        @Nullable
        public String g = null;

        public a(lxn0 lxn0Var, String str, String str2) {
            this.a = lxn0Var;
            this.c = str;
            this.b = str2;
        }

        public final String a() {
            return this.a.a();
        }

        public final void b() {
            this.e = true;
        }

        public final void c() {
            this.d = true;
        }

        public final a d(String str) {
            lxn0 lxn0Var = this.a;
            a aVar = new a(lxn0Var, str, "INTEGER");
            lxn0Var.b.add(aVar);
            return aVar;
        }

        public final a e(String str) {
            lxn0 lxn0Var = this.a;
            a aVar = new a(lxn0Var, str, "TEXT");
            lxn0Var.b.add(aVar);
            return aVar;
        }
    }

    public lxn0(String str) {
        this.a = str;
    }

    public static String b(String str) {
        return "DROP TABLE IF EXISTS ".concat(str);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(this.a);
        sb.append(" ");
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.b;
            if (i >= arrayList.size()) {
                return sb.toString();
            }
            if (i == 0) {
                sb.append(" (");
            }
            a aVar = arrayList.get(i);
            StringBuilder sb2 = new StringBuilder(aVar.c);
            sb2.append(" ");
            sb2.append(aVar.b);
            if (aVar.f) {
                sb2.append(" NOT NULL");
            }
            if (aVar.d) {
                sb2.append(" PRIMARY KEY");
            }
            if (aVar.e) {
                sb2.append(" AUTOINCREMENT");
            }
            if (aVar.g != null) {
                sb2.append(" DEFAULT ");
                sb2.append(aVar.g);
            }
            sb.append(sb2.toString());
            if (i == arrayList.size() - 1) {
                sb.append(");");
            } else {
                sb.append(", ");
            }
            i++;
        }
    }

    public final a c(String str) {
        a aVar = new a(this, str, "INTEGER");
        this.b.add(aVar);
        return aVar;
    }
}
