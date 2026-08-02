package sg.bigo.ads.av;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class b {
    public long a;
    public String b;
    public String c;
    public int d;
    public String e;
    public long f;
    public long g;

    public b(Cursor cursor) {
        this.a = -1L;
        this.a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getInt(cursor.getColumnIndex("states"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j = this.a;
        return j >= 0 && j == ((b) obj).a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.a + ",eventInfo=" + this.c;
    }

    public b(String str, String str2) {
        this.a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = 0;
        this.e = "";
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }
}
