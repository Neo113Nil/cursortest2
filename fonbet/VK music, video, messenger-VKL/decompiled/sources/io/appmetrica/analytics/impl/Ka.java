package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class Ka implements Callable {
    public final /* synthetic */ La a;

    public Ka(La la) {
        this.a = la;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.a.a.getContentResolver();
        La la = this.a;
        la.b = contentResolver.query(parse, null, null, new String[]{la.a.getPackageName()}, null);
        Cursor cursor = this.a.b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.a.b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C5298xg(string, this.a.b.getLong(1), this.a.b.getLong(2), EnumC5273wg.d);
    }
}
