package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes15.dex */
public abstract class juf0 {
    public static final String[] a = {"_display_name", "_size"};
    public static au2 b;

    public static final meu a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            z7 z7Var = (z7) it.next();
            ycc.r(scc.g(kvu.c().d(z7Var), kvu.c().e(z7Var)), arrayList);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return wwg.z((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AttachInfo b(Context context, Uri uri) {
        Point point;
        int i;
        int i2;
        String path = uri.getPath();
        if ("file".equals(uri.getScheme()) && path != null) {
            File file = new File(path);
            return new AttachInfo(uri, null, null, file.getName(), file.length(), qna1.g(file.getAbsolutePath()), 0, 0);
        }
        String f = rk91.f(context, uri);
        if (AttachInfo.isImage(f)) {
            try {
                point = d5b1.j(context, uri, d5b1.k(context, uri));
            } catch (IOException unused) {
                point = new Point(0, 0);
            }
            int i3 = point.x;
            i = point.y;
            i2 = i3;
        } else {
            i2 = 0;
            i = 0;
        }
        Cursor query = context.getContentResolver().query(uri, a, null, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor != null && cursor.moveToFirst()) {
                String[] columnNames = cursor.getColumnNames();
                AttachInfo attachInfo = new AttachInfo(uri, null, null, j73.y(columnNames, "_display_name") ? cursor.getString(cursor.getColumnIndex("_display_name")) : "", j73.y(columnNames, "_size") ? cursor.getLong(cursor.getColumnIndex("_size")) : 0L, f, i2, i);
                ooc.g(query, null);
                return attachInfo;
            }
            AttachInfo attachInfo2 = new AttachInfo(uri, null, null, "", 0L, null, 0, 0);
            ooc.g(query, null);
            return attachInfo2;
        } finally {
        }
    }

    public static final boolean c(Uri uri, Set set) {
        String host = uri.getHost();
        if (host != null && (!(set instanceof Collection) || !set.isEmpty())) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (cvu0.s(host, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean d(Object obj) {
        return Boolean.valueOf(obj != null);
    }
}
