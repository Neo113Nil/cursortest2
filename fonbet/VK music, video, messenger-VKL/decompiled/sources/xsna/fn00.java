package xsna;

import android.database.Cursor;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.usi0;

/* compiled from: Mappers.kt */
/* loaded from: classes6.dex */
public final class fn00 {
    public static final String a(usi0.a aVar) {
        return aVar.c().a + "_AT";
    }

    public static final String b(String str) {
        ArrayList arrayList = new ArrayList(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
        if (arrayList.size() != 2) {
            return str;
        }
        arrayList.add(1, "%");
        return j5g.g0(arrayList, BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62);
    }

    public static final vj c(Cursor cursor) {
        return new vj(cursor.getString(cursor.getColumnIndexOrThrow("token_value")), cursor.getInt(cursor.getColumnIndexOrThrow("expires_in_sec")), cursor.getLong(cursor.getColumnIndexOrThrow("created_ms")));
    }

    public static final fhq0 d(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("user_id"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("profile_type"));
        UserId userId = new UserId(j);
        AccountProfileType.a aVar = AccountProfileType.Companion;
        Integer valueOf = Integer.valueOf(i);
        aVar.getClass();
        AccountProfileType a = AccountProfileType.a.a(valueOf);
        if (a == null) {
            a = AccountProfileType.NORMAL;
        }
        return new fhq0(userId, a);
    }
}
