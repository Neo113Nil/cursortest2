package ru.mail.libverify.x;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import ru.mail.verify.core.utils.FileLog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f implements DatabaseErrorHandler {
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        FileLog.e("SmsDbHelper", "sms db has been corrupted");
    }
}
