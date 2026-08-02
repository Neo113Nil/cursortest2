package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.yandex.div.internal.Assert;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.xv6;

/* compiled from: SendBeaconDb.kt */
/* loaded from: classes7.dex */
public final class jhi0 extends SQLiteOpenHelper {
    public static final String[] b = {"_id", "url", "headers", "add_timestamp", "payload"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.dpj0] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static xv6.a b(Cursor cursor) {
        Uri parse = Uri.parse(cursor.getString(1));
        String string = cursor.getString(2);
        ?? r4 = jgp.b;
        if (string != null) {
            List b0 = drm0.b0(string, new char[]{0}, 0, 6);
            if (b0.isEmpty()) {
                Assert.fail("Incorrect serialization: empty map should be serialized into null value!");
            } else {
                r4 = new zk3(b0.size());
                int size = b0.size();
                for (int i = 0; i < size; i++) {
                    List b02 = drm0.b0((CharSequence) b0.get(i), new char[]{'\t'}, 0, 6);
                    if (b02.size() == 1) {
                        r4.put(b02.get(0), "");
                    } else {
                        r4.put(b02.get(0), b02.get(1));
                    }
                }
            }
        }
        Map map = r4;
        JSONObject jSONObject = null;
        String string2 = cursor.isNull(4) ? null : cursor.getString(4);
        if (string2 != null && string2.length() > 0) {
            try {
                jSONObject = new JSONObject(string2);
            } catch (JSONException e) {
                Assert.fail("Payload parsing exception: " + e);
            }
        }
        return new xv6.a(parse, map, jSONObject, cursor.getLong(3), cursor.getLong(0));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
