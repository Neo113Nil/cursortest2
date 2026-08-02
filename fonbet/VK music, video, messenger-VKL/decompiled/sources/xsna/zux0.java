package xsna;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class zux0 {
    public static final void a(Context context) {
        String[] strArr;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            m100 c = m100.c();
            String[] strArr2 = avx0.a;
            c.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(sni.j(context), "androidx.work.workdb");
            strArr = avx0.a;
            int e = on00.e(strArr.length);
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (String str : strArr) {
                Pair pair = new Pair(new File(databasePath.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pair.i(), pair.j());
            }
            for (Map.Entry entry : pn00.o(linkedHashMap, new Pair(databasePath, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        m100 c2 = m100.c();
                        String[] strArr3 = avx0.a;
                        file3.toString();
                        c2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    m100 c3 = m100.c();
                    String[] strArr4 = avx0.a;
                    c3.getClass();
                }
            }
        }
    }
}
