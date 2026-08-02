package xsna;

import android.database.Cursor;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import xsna.bhl0;

/* compiled from: ImDatabase.kt */
/* loaded from: classes2.dex */
public interface e0w {
    void a();

    Cursor b(String str, String[] strArr, String str2, Object[] objArr);

    void beginTransactionNonExclusive();

    <T> T c(izs<? super e0w, ? extends T> izsVar);

    void cancel();

    void clear();

    void close();

    SQLiteStatement compileStatement(String str);

    Cursor d(String str, Object[] objArr);

    void e(bhl0.a aVar);

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    int f(String str, String str2, Object[] objArr);

    SQLiteStatement g(String str);

    <T> T h(izs<? super e0w, ? extends T> izsVar);

    void i(String str, Object[] objArr);

    void j(String str);

    Cursor k(String str, Object[] objArr);

    ArrayList l(com.vk.movika.tools.controls.seekbar.l lVar);

    Cursor m(String str, Object[] objArr);

    Cursor n(String str, Object[] objArr);

    void setTransactionSuccessful();
}
