package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public interface d1r {
    boolean a(Context context, au2 au2Var);

    default File f(au2 au2Var) {
        List list = au2Var.a;
        if (!au2Var.c()) {
            ny61.g("Failed requirement.");
            return null;
        }
        List subList = list.subList(1, new d6w(1, list.size(), 1).b);
        String str = File.separator;
        File file = new File(a.X(subList, str, str, null, null, 60));
        if (file.isFile()) {
            return file;
        }
        return null;
    }
}
