package ru.mail.libverify.x;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class b extends SQLiteOpenHelper {
    public static final /* synthetic */ int a = 0;

    public b(Context context) {
        super(context, "verifications.db", null, 1, new f());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sms (_id INTEGER PRIMARY KEY NOT NULL, timestamp INTEGER NOT NULL, server_timestamp INTEGER NOT NULL, dialog_id INTEGER NOT NULL, text TEXT, CONSTRAINT server_id UNIQUE (server_timestamp, dialog_id) )");
        sQLiteDatabase.execSQL("CREATE TABLE dialog (_id INTEGER PRIMARY KEY NOT NULL, name TEXT NOT NULL, last_timestamp INTEGER, last_text TEXT, has_unread INTEGER )");
        FileLog.d("SmsDbHelper", "sms db created");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
