package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public abstract class bk01 {
    public final tk01 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();

    @Nullable
    public qi01 e = null;

    public bk01(tk01 tk01Var, IntentFilter intentFilter, Context context) {
        this.a = tk01Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(a3u a3uVar) {
        this.a.c("registerListener", new Object[0]);
        this.d.add(a3uVar);
        d();
    }

    public final synchronized void b(a3u a3uVar) {
        this.a.c("unregisterListener", new Object[0]);
        this.d.remove(a3uVar);
        d();
    }

    public final synchronized void c(ctz0 ctz0Var) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((suk0) it.next()).a(ctz0Var);
        }
    }

    public final void d() {
        qi01 qi01Var;
        HashSet hashSet = this.d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.e == null) {
            qi01 qi01Var2 = new qi01(this);
            this.e = qi01Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(qi01Var2, intentFilter, 2);
            } else {
                context.registerReceiver(qi01Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (qi01Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(qi01Var);
        this.e = null;
    }
}
