package sg.bigo.ads.aw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class a {
    private static long a(List<String> list) {
        list.size();
        StringBuilder sb = new StringBuilder("res_file_name in (");
        int i = 0;
        while (i < list.size()) {
            sb.append(i == 0 ? "?" : ",?");
            i++;
        }
        sb.append(")");
        return sg.bigo.ads.au.a.b("tb_resource", sb.toString(), (String[]) list.toArray(new String[0]));
    }

    public static long b(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return a(arrayList);
    }

    public static sg.bigo.ads.av.a a(String str) {
        String[] strArr = {"res_file_name"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb.append(strArr[0]);
            sb.append("=? ");
        }
        Cursor a = sg.bigo.ads.au.a.a("tb_resource", sb.toString(), new String[]{String.valueOf(str)}, null, 1);
        if (a != null) {
            r2 = a.moveToNext() ? new sg.bigo.ads.av.a(a) : null;
            a.close();
        }
        return r2;
    }
}
