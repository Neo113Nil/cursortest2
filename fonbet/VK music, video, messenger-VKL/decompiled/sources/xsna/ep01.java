package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.Nullable;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public abstract class ep01 {
    public final lq01 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();

    @Nullable
    public no01 e = null;
    public volatile boolean f = false;

    public ep01(lq01 lq01Var, IntentFilter intentFilter, Context context) {
        this.a = lq01Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(suk0 suk0Var) {
        this.a.d("registerListener", new Object[0]);
        if (suk0Var == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.d.add(suk0Var);
        b();
    }

    public final void b() {
        no01 no01Var;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            no01 no01Var2 = new no01(this);
            this.e = no01Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.c.registerReceiver(no01Var2, this.b, 2);
            } else {
                this.c.registerReceiver(no01Var2, this.b);
            }
        }
        if (this.f || !this.d.isEmpty() || (no01Var = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(no01Var);
        this.e = null;
    }
}
