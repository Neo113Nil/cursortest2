package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes15.dex */
public final class jde {
    public static final String[] b = {"display_name", "data1", "contact_id"};
    public final Application a;

    public jde(Application application) {
        this.a = application;
    }

    public final ide a(Intent intent) {
        ide ideVar;
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        ContentResolver contentResolver = this.a.getContentResolver();
        String[] strArr = b;
        Cursor query = contentResolver.query(data, strArr, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor == null || !cursor.moveToFirst()) {
                ideVar = null;
            } else {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[0]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                cursor.getString(cursor.getColumnIndexOrThrow(strArr[2]));
                if (string == null) {
                    string = "";
                }
                if (string2 == null) {
                    string2 = "";
                }
                ideVar = new ide(string, string2, 4);
            }
            ooc.g(query, null);
            return ideVar;
        } finally {
        }
    }
}
