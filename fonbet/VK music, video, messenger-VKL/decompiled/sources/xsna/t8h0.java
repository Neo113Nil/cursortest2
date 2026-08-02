package xsna;

import android.database.sqlite.SQLiteDatabase;
import xsna.v8h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t8h0 implements v8h0.a {
    @Override // xsna.v8h0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
    }
}
