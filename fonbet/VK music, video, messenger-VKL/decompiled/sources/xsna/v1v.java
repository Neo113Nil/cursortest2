package xsna;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import xsna.eo5;
import xsna.oyg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v1v implements oyg0.a {
    public static String a(char c, String str, String str2) {
        return str + c + str2;
    }

    public static StringBuilder b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c);
        return sb;
    }

    @Override // xsna.oyg0.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            eo5.a a = sop0.a();
            a.b(cursor.getString(1));
            a.c = acd0.b(cursor.getInt(2));
            String string = cursor.getString(3);
            a.b = string == null ? null : Base64.decode(string, 0);
            arrayList.add(a.a());
        }
        return arrayList;
    }
}
