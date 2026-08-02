package xsna;

import android.database.Cursor;
import com.ironsource.X3;

/* compiled from: MediaDatabaseColumnsIndexes.kt */
/* loaded from: classes3.dex */
public final class qq10 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public qq10(Cursor cursor) {
        this.a = cursor.getColumnIndex("media_type");
        this.b = cursor.getColumnIndex("_id");
        this.c = cursor.getColumnIndex("bucket_id");
        this.d = cursor.getColumnIndex("bucket_display_name");
        this.e = cursor.getColumnIndex("_data");
        this.f = cursor.getColumnIndex("datetaken");
        this.g = cursor.getColumnIndex("width");
        this.h = cursor.getColumnIndex("height");
        this.i = cursor.getColumnIndex("_size");
        this.j = cursor.getColumnIndex("date_modified");
        this.k = cursor.getColumnIndex(X3.i.n);
        this.l = cursor.getColumnIndex("duration");
    }
}
