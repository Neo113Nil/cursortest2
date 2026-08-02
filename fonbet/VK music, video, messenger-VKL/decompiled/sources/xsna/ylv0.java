package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.data.b;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: VkStatisticsBridge.kt */
/* loaded from: classes7.dex */
public final class ylv0 implements pyk0 {
    public static final ylv0 a = new ylv0();

    @Override // xsna.pyk0
    public final void a() {
        com.vkontakte.android.data.b.l();
    }

    @Override // xsna.pyk0
    public final void b(Object obj, String str) {
        if (obj instanceof DeprecatedStatisticInterface) {
            com.vkontakte.android.data.b.o((DeprecatedStatisticInterface) obj, str);
        }
    }

    @Override // xsna.pyk0
    public final JSONObject c() {
        return zeq0.b();
    }

    @Override // xsna.pyk0
    public final Set<String> d() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Cursor query = bwk.b(context).getReadableDatabase().query("sent_statistics", bwk.c, null, null, null, null, null);
        HashSet hashSet = new HashSet();
        if (query != null && query.moveToFirst()) {
            do {
                hashSet.add(query.getString(0));
            } while (query.moveToNext());
        }
        if (query != null) {
            query.close();
        }
        return hashSet;
    }

    @Override // xsna.pyk0
    public final void e(String str, Bundle bundle) {
        b.d dVar = new b.d(str);
        for (String str2 : bundle.keySet()) {
            dVar.b(bundle.get(str2), str2);
        }
        dVar.e();
    }

    @Override // xsna.pyk0
    public final boolean f(String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        bwk b = bwk.b(context);
        b.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        long insert = b.getWritableDatabase().insert("sent_statistics", "key", contentValues);
        if (insert % 100 == 0) {
            b.getWritableDatabase().delete("sent_statistics", "_id< " + (insert - 10000), null);
        }
        return true;
    }

    @Override // xsna.pyk0
    public final String getDeviceInfo() {
        return zeq0.a();
    }
}
