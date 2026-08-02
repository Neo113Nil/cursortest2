package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class ixc0 implements poh {
    public static final String m = poh.class.getName().concat(".loadingUnitMapping");
    public lvt0 a;
    public FlutterJNI b;
    public xjg c;
    public Context d;
    public gl e;
    public SparseArray f;
    public SparseIntArray g;
    public SparseArray h;
    public HashMap i;
    public SparseArray j;
    public SparseArray k;
    public hxc0 l;

    public final void a() {
        this.a.d(this.l);
        this.c = null;
        this.b = null;
    }

    public final void b(int i, String str) {
        if (str == null) {
            str = (String) this.j.get(i);
        }
        if (str == null) {
            Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
            return;
        }
        if (str.equals("") && i > 0) {
            c(i, str);
            return;
        }
        hhs0 hhs0Var = new hhs0(6);
        hhs0Var.g(str);
        this.a.startInstall(new SplitInstallRequest(hhs0Var)).addOnSuccessListener(new fxc0()).addOnFailureListener(new gxc0());
    }

    public final void c(int i, String str) {
        if (this.b == null) {
            Log.e("PlayStoreDeferredComponentManager", "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
            return;
        }
        if (i < 0) {
            return;
        }
        String str2 = (String) this.k.get(i);
        if (str2 == null) {
            str2 = ((String) this.e.b) + "-" + i + ".part.so";
        }
        String str3 = Build.SUPPORTED_ABIS[0];
        String replace = str3.replace("-", "_");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.d.getFilesDir());
        for (String str4 : this.d.getApplicationInfo().splitSourceDirs) {
            linkedList.add(new File(str4));
        }
        while (!linkedList.isEmpty()) {
            File file = (File) linkedList.remove();
            if (file == null || !file.isDirectory() || file.listFiles() == null) {
                String name = file.getName();
                if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(replace))) {
                    arrayList.add(file.getAbsolutePath());
                } else if (name.equals(str2)) {
                    arrayList2.add(file.getAbsolutePath());
                }
            } else {
                for (File file2 : file.listFiles()) {
                    linkedList.add(file2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(oyr.q((String) it.next(), "!lib/", str3, "/", str2));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) it2.next());
        }
        this.b.loadDartDeferredLibrary(i, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
    }

    public final void d(xjg xjgVar) {
        this.c = xjgVar;
    }

    public final boolean e(int i, String str) {
        HashMap hashMap = this.i;
        if (str == null) {
            str = (String) this.j.get(i);
        }
        if (str == null) {
            Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.a.deferredUninstall(arrayList);
        if (hashMap.get(str) == null) {
            return true;
        }
        this.h.delete(((Integer) hashMap.get(str)).intValue());
        return true;
    }
}
