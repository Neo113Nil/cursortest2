package xsna;

import android.content.SharedPreferences;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.dto.common.id.UserId;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hca implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hca(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                SharedPreferences.Editor edit = ((SharedPreferences) ((kca) obj2).a.getValue()).edit();
                Iterator it = ((m1q) obj).c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    edit.putString("rec" + i2, (String) next);
                    i2 = i3;
                }
                edit.apply();
                return s3q0.a;
            case 1:
                String str = (String) obj;
                int i4 = DebugFileManagerFragment.R;
                File file = new File((String) obj2);
                if (!file.isDirectory()) {
                    return EmptyList.b;
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return EmptyList.b;
                }
                List<File> m0 = rl3.m0(listFiles, new i5l(new h5l()));
                ArrayList arrayList = new ArrayList(c5g.u(m0, 10));
                for (File file2 : m0) {
                    arrayList.add(new s8r(file2.getName(), file2.isDirectory(), file2.isFile() ? file2.length() : 0L, file2, file2.isFile() && brm0.B(file2.getAbsolutePath(), str, false)));
                }
                return arrayList;
            case 2:
                return ((u440) obj2).r0.a((mat0) obj, false, false);
            default:
                qd60 qd60Var = (qd60) obj2;
                UserId userId = (UserId) obj;
                qd60Var.e.a.remove(userId);
                qd60Var.b();
                String str2 = "feed_cache_" + userId.b;
                File[] listFiles2 = qd60Var.d.listFiles();
                if (listFiles2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file3 : listFiles2) {
                        if (brm0.B(file3.getName(), str2, false) && file3.getName().charAt(str2.length()) == '_') {
                            arrayList2.add(file3);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((File) it2.next()).delete();
                    }
                }
                return s3q0.a;
        }
    }
}
