package xsna;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nd60 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                qd60 qd60Var = (qd60) this.c;
                qd60Var.b();
                String str = "feed_cache_" + qd60Var.a.c().b;
                File[] listFiles = qd60Var.d.listFiles();
                long j = 0;
                if (listFiles != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file : listFiles) {
                        if (brm0.B(file.getName(), str, false) && file.getName().charAt(str.length()) == '_') {
                            arrayList.add(file);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        j += ((File) it.next()).length();
                    }
                }
                return Long.valueOf(j);
            default:
                y2o0 y2o0Var = (y2o0) this.c;
                return dv90.a(y2o0Var.a.getActiveWalletId(y2o0Var.asGoogleApiClient()), sua.g);
        }
    }
}
