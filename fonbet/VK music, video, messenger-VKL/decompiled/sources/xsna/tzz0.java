package xsna;

import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class tzz0 {
    public static boolean a(ClassLoader classLoader, File file, File file2, boolean z, sdi sdiVar, String str, jcr jcrVar) {
        ArrayList arrayList = new ArrayList();
        Field T = f370.T(classLoader, "pathList");
        try {
            Object cast = Object.class.cast(T.get(classLoader));
            r301 Q = f370.Q(Object.class, cast, "dexElements");
            List asList = Arrays.asList((Object[]) Q.d());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : asList) {
                Field T2 = f370.T(obj, str);
                try {
                    arrayList2.add((File) File.class.cast(T2.get(obj)));
                } catch (Exception e) {
                    String name = T2.getName();
                    String name2 = obj.getClass().getName();
                    String name3 = File.class.getName();
                    StringBuilder a = xe9.a("Failed to get value of field ", name, " of type ", name2, " on object of type ");
                    a.append(name3);
                    throw new zzbl(a.toString(), e);
                }
            }
            if (arrayList2.contains(file2)) {
                return true;
            }
            if (!z) {
                jcrVar.getClass();
            }
            ArrayList arrayList3 = new ArrayList(Collections.singleton(file2));
            sdiVar.getClass();
            try {
                Q.f(Arrays.asList((Object[]) Object[].class.cast(f370.U(cast.getClass(), "makePathElements", List.class, File.class, List.class).invoke(cast, arrayList3, file, arrayList))));
                if (arrayList.isEmpty()) {
                    return true;
                }
                zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = (IOException) arrayList.get(i);
                    Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
                    } catch (Exception unused) {
                    }
                }
                f370.Q(IOException.class, cast, "dexElementsSuppressedExceptions").f(arrayList);
                throw zzbhVar;
            } catch (Exception e2) {
                throw new zzbl("Failed to invoke method makePathElements on an object of type " + cast.getClass(), e2);
            }
        } catch (Exception e3) {
            String name4 = T.getName();
            String name5 = classLoader.getClass().getName();
            String name6 = Object.class.getName();
            StringBuilder a2 = xe9.a("Failed to get value of field ", name4, " of type ", name5, " on object of type ");
            a2.append(name6);
            throw new zzbl(a2.toString(), e3);
        }
    }
}
