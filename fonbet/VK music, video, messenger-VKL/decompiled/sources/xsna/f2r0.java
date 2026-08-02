package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import xsna.c2r0;

/* compiled from: UsersStoreHelper.kt */
/* loaded from: classes6.dex */
public final class f2r0 {
    public static c2r0.b a(Cursor cursor) {
        AccountProfileType accountProfileType;
        int columnIndex = cursor.getColumnIndex("user_id");
        int columnIndex2 = cursor.getColumnIndex("name");
        int columnIndex3 = cursor.getColumnIndex("last_name");
        int columnIndex4 = cursor.getColumnIndex("phone");
        int columnIndex5 = cursor.getColumnIndex("email");
        int columnIndex6 = cursor.getColumnIndex("avatar");
        int columnIndex7 = cursor.getColumnIndex("exchange_token");
        int columnIndex8 = cursor.getColumnIndex("logged_in");
        int columnIndex9 = cursor.getColumnIndex("timestamp");
        int columnIndex10 = cursor.getColumnIndex("profile_type");
        long j = columnIndex9 != -1 ? cursor.getLong(columnIndex9) : 0L;
        if (columnIndex10 != -1) {
            AccountProfileType.a aVar = AccountProfileType.Companion;
            Integer valueOf = Integer.valueOf(cursor.getInt(columnIndex10));
            aVar.getClass();
            accountProfileType = AccountProfileType.a.a(valueOf);
            if (accountProfileType == null) {
                accountProfileType = AccountProfileType.NORMAL;
            }
        } else {
            accountProfileType = AccountProfileType.NORMAL;
        }
        AccountProfileType accountProfileType2 = accountProfileType;
        String string = columnIndex3 != -1 ? cursor.getString(columnIndex3) : null;
        String string2 = columnIndex4 != -1 ? cursor.getString(columnIndex4) : null;
        String string3 = columnIndex5 != -1 ? cursor.getString(columnIndex5) : null;
        long j2 = cursor.getLong(columnIndex);
        gzs<s3q0> gzsVar = fkq0.a;
        return new c2r0.b(new UserId(j2), cursor.getString(columnIndex2), string, string2, string3, cursor.getString(columnIndex6), cursor.getString(columnIndex7), cursor.getInt(columnIndex8) == 1, j, accountProfileType2);
    }

    public static ContentValues b(c2r0.b bVar) {
        long j = bVar.j;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        ContentValues contentValues = new ContentValues(10);
        contentValues.put("user_id", Long.valueOf(bVar.a.b));
        contentValues.put("name", bVar.b);
        contentValues.put("avatar", bVar.f);
        contentValues.put("exchange_token", bVar.g);
        String str = bVar.c;
        if (str != null) {
            contentValues.put("last_name", str);
        }
        String str2 = bVar.d;
        if (str2 != null) {
            contentValues.put("phone", str2);
        }
        String str3 = bVar.e;
        if (str3 != null) {
            contentValues.put("email", str3);
        }
        contentValues.put("logged_in", Integer.valueOf(bVar.h ? 1 : 0));
        contentValues.put("profile_type", Integer.valueOf(bVar.i.h()));
        contentValues.put("timestamp", Long.valueOf(j));
        return contentValues;
    }
}
