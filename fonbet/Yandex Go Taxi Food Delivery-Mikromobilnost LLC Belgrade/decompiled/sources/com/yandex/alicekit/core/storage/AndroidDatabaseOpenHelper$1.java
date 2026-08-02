package com.yandex.alicekit.core.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.d92;
import defpackage.iqg;
import defpackage.jqg;

/* loaded from: classes11.dex */
class AndroidDatabaseOpenHelper$1 extends SQLiteOpenHelper {
    final /* synthetic */ d92 this$0;
    final /* synthetic */ iqg val$ccb;
    final /* synthetic */ jqg val$ucb;

    public AndroidDatabaseOpenHelper$1(d92 d92Var, Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, iqg iqgVar, jqg jqgVar) {
        super(context, str, cursorFactory, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        throw null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw null;
    }
}
