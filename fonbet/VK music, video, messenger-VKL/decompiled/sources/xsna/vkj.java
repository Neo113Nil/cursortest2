package xsna;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* compiled from: ContentResolverExt.kt */
/* loaded from: classes17.dex */
public final class vkj {
    @TargetApi(26)
    public static final Bundle a(String str, String[] strArr, String str2, int i, int i2) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("android:query-arg-sql-selection", str);
        }
        if (strArr != null) {
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        if (str2 != null) {
            bundle.putString("android:query-arg-sql-sort-order", str2);
        }
        bundle.putInt("android:query-arg-limit", i);
        bundle.putInt("android:query-arg-offset", i2);
        return bundle;
    }

    public static Cursor b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            strArr2 = null;
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 32) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = 0;
        }
        if (i4 < 0 && i2 == 0) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, null);
        }
        String str3 = str2;
        if (Build.VERSION.SDK_INT >= 30) {
            return contentResolver.query(uri, strArr, a(str, strArr2, str3, i4, i2), null);
        }
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str3 + " LIMIT " + i4 + " OFFSET " + i2, null);
        } catch (IllegalArgumentException unused) {
            return contentResolver.query(uri, strArr, a(str, strArr2, str3, i4, i2), null);
        }
    }
}
