package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class hxc0 implements nvt0 {
    public final /* synthetic */ ixc0 a;

    public hxc0(ixc0 ixc0Var) {
        this.a = ixc0Var;
    }

    @Override // defpackage.nvt0
    public final void a(Object obj) {
        mvt0 mvt0Var = (mvt0) obj;
        int g = mvt0Var.g();
        ixc0 ixc0Var = this.a;
        SparseArray sparseArray = ixc0Var.f;
        SparseIntArray sparseIntArray = ixc0Var.g;
        SparseArray sparseArray2 = ixc0Var.h;
        if (sparseArray.get(g) != null) {
            switch (mvt0Var.h()) {
                case 1:
                    String.format("Module \"%s\" (sessionId %d) install pending.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "pending");
                    break;
                case 2:
                    String.format("Module \"%s\" (sessionId %d) downloading.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "downloading");
                    break;
                case 3:
                    String.format("Module \"%s\" (sessionId %d) downloaded.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "downloaded");
                    break;
                case 4:
                    String.format("Module \"%s\" (sessionId %d) installing.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "installing");
                    break;
                case 5:
                    String.format("Module \"%s\" (sessionId %d) install successfully.", sparseArray.get(g), Integer.valueOf(g));
                    sparseIntArray.get(g);
                    if (ixc0Var.b == null) {
                        Log.e("PlayStoreDeferredComponentManager", "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
                    } else {
                        try {
                            Context context = ixc0Var.d;
                            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                            ixc0Var.d = createPackageContext;
                            ixc0Var.b.updateJavaAssetManager(createPackageContext.getAssets(), (String) ixc0Var.e.c);
                        } catch (PackageManager.NameNotFoundException e) {
                            ny61.j(e);
                            return;
                        }
                    }
                    if (sparseIntArray.get(g) > 0) {
                        ixc0Var.c(sparseIntArray.get(g), (String) sparseArray.get(g));
                    }
                    xjg xjgVar = ixc0Var.c;
                    if (xjgVar != null) {
                        String str = (String) sparseArray.get(g);
                        HashMap hashMap = (HashMap) xjgVar.c;
                        if (hashMap.containsKey(str)) {
                            Iterator it = ((List) hashMap.get(str)).iterator();
                            while (it.hasNext()) {
                                ((da20) it.next()).success(null);
                            }
                            ((List) hashMap.get(str)).clear();
                        }
                    }
                    sparseArray.delete(g);
                    sparseIntArray.delete(g);
                    sparseArray2.put(g, "installed");
                    break;
                case 6:
                    Log.e("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install failed with: %s", sparseArray.get(g), Integer.valueOf(g), Integer.valueOf(mvt0Var.c())));
                    ixc0Var.b.deferredComponentInstallFailure(sparseIntArray.get(g), "Module install failed with " + mvt0Var.c(), true);
                    xjg xjgVar2 = ixc0Var.c;
                    if (xjgVar2 != null) {
                        xjgVar2.b((String) sparseArray.get(g), "Android Deferred Component failed to install.");
                    }
                    sparseArray.delete(g);
                    sparseIntArray.delete(g);
                    sparseArray2.put(g, "failed");
                    break;
                case 7:
                    String.format("Module \"%s\" (sessionId %d) install canceled.", sparseArray.get(g), Integer.valueOf(g));
                    xjg xjgVar3 = ixc0Var.c;
                    if (xjgVar3 != null) {
                        xjgVar3.b((String) sparseArray.get(g), "Android Deferred Component installation canceled.");
                    }
                    sparseArray.delete(g);
                    sparseIntArray.delete(g);
                    sparseArray2.put(g, "cancelled");
                    break;
                case 8:
                    String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "requiresUserConfirmation");
                    break;
                case 9:
                    String.format("Module \"%s\" (sessionId %d) install canceling.", sparseArray.get(g), Integer.valueOf(g));
                    sparseArray2.put(g, "canceling");
                    break;
            }
        }
    }
}
