package com.yandex.android.beacon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import defpackage.doq0;
import defpackage.eoq0;
import defpackage.evu0;
import defpackage.foq0;
import defpackage.mi5;
import defpackage.ooc;
import defpackage.w53;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000 -2\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0012¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010'\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/yandex/android/beacon/SendBeaconDb;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "databaseName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/database/Cursor;", "cursor", "Lmi5;", "beaconItemFromCursor", "(Landroid/database/Cursor;)Lmi5;", "", "columnIndex", "getNullableString", "(Landroid/database/Cursor;I)Ljava/lang/String;", "Lorg/json/JSONObject;", "getNullableJson", "(Landroid/database/Cursor;I)Lorg/json/JSONObject;", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lzy11;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "", "allItems", "()Ljava/util/List;", "Landroid/net/Uri;", SendBeaconDb.COLUMN_URL, "", SendBeaconDb.COLUMN_HEADERS, "", "addTimestamp", SendBeaconDb.COLUMN_PAYLOAD, "add", "(Landroid/net/Uri;Ljava/util/Map;JLorg/json/JSONObject;)Lmi5;", "item", "", "remove", "(Lmi5;)Z", "Companion", "eoq0", "foq0", "beacon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SendBeaconDb extends SQLiteOpenHelper {
    private static final String ADD_PAYLOAD_COLUMN_TO_ITEM = "\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ";
    private static final String COLUMN_ID = "_id";
    private static final String DATABASE_CREATE = "\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)";
    private static final int DATABASE_INIT_VERSION = 1;
    private static final int DATABASE_VERSION = 2;
    private static final String REMOVE_CLAUSE = "_id = ?";
    private static final String TABLE_ITEMS = "items";
    public static final eoq0 Companion = new eoq0();
    private static final String COLUMN_URL = "url";
    private static final String COLUMN_HEADERS = "headers";
    private static final String COLUMN_ADD_TIMESTAMP = "add_timestamp";
    private static final String COLUMN_PAYLOAD = "payload";
    private static final String[] QUERY_COLUMNS = {"_id", COLUMN_URL, COLUMN_HEADERS, COLUMN_ADD_TIMESTAMP, COLUMN_PAYLOAD};
    public static foq0 factory = doq0.a;

    public SendBeaconDb(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    private mi5 beaconItemFromCursor(Cursor cursor) {
        Map map;
        Uri parse = Uri.parse(cursor.getString(1));
        String string = cursor.getString(2);
        if (string == null) {
            map = b.f();
        } else {
            List Y = evu0.Y(string, new char[]{0}, 0, 6);
            if (Y.isEmpty()) {
                map = b.f();
            } else {
                w53 w53Var = new w53(Y.size());
                int size = Y.size();
                for (int i = 0; i < size; i++) {
                    List Y2 = evu0.Y((CharSequence) Y.get(i), new char[]{'\t'}, 0, 6);
                    if (Y2.size() == 1) {
                        w53Var.put(Y2.get(0), "");
                    } else {
                        w53Var.put(Y2.get(0), Y2.get(1));
                    }
                }
                map = w53Var;
            }
        }
        return new mi5(parse, map, getNullableJson(cursor, 4), cursor.getLong(3), cursor.getLong(0));
    }

    private JSONObject getNullableJson(Cursor cursor, int i) {
        String nullableString = getNullableString(cursor, i);
        if (nullableString == null || nullableString.length() <= 0) {
            return null;
        }
        try {
            return new JSONObject(nullableString);
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    private String getNullableString(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    public mi5 add(Uri url, Map<String, String> headers, long addTimestamp, JSONObject payload) {
        String sb;
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(COLUMN_URL, url.toString());
        if (headers.isEmpty()) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb2.append(key);
                sb2.append('\t');
                sb2.append(value);
                sb2.append((char) 0);
            }
            sb = sb2.toString();
        }
        contentValues.put(COLUMN_HEADERS, sb);
        contentValues.put(COLUMN_ADD_TIMESTAMP, Long.valueOf(addTimestamp));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long insert = writableDatabase.insert(TABLE_ITEMS, null, contentValues);
            ooc.g(writableDatabase, null);
            return new mi5(url, headers, payload, addTimestamp, insert);
        } finally {
        }
    }

    public List<mi5> allItems() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor cursor = null;
        try {
            cursor = readableDatabase.query(TABLE_ITEMS, QUERY_COLUMNS, null, null, null, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    arrayList.add(beaconItemFromCursor(cursor));
                }
            }
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            readableDatabase.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (oldVersion == 1) {
            sqLiteDatabase.execSQL(ADD_PAYLOAD_COLUMN_TO_ITEM);
        }
    }

    public boolean remove(mi5 item) {
        if (item == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int delete = writableDatabase.delete(TABLE_ITEMS, REMOVE_CLAUSE, new String[]{String.valueOf(item.d)});
            ooc.g(writableDatabase, null);
            return delete != 0;
        } finally {
        }
    }
}
