package xsna;

import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: DbMigration.kt */
/* loaded from: classes.dex */
public interface b2l {

    /* compiled from: DbMigration.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final SQLiteDatabase a;
        public final int b;
        public final int c;
        public final String d;
        public final int e;

        public a(SQLiteDatabase sQLiteDatabase, int i, int i2, String str, int i3) {
            this.a = sQLiteDatabase;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = i3;
        }

        public final SQLiteDatabase a() {
            return this.a;
        }

        public final int b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
            String str = this.d;
            return Integer.hashCode(this.e) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Args(db=");
            sb.append(this.a);
            sb.append(", oldVersion=");
            sb.append(this.b);
            sb.append(", newVersion=");
            sb.append(this.c);
            sb.append(", databaseName=");
            sb.append(this.d);
            sb.append(", migrationVersion=");
            return vu5.b(sb, this.e, ')');
        }
    }

    void a(a aVar);
}
