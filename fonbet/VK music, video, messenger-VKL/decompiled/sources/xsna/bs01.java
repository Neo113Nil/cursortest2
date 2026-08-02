package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class bs01 extends ep01 {

    @Nullable
    public static bs01 j;
    public final Handler g;
    public final gc01 h;
    public final LinkedHashSet i;

    public bs01(Context context, com.google.android.play.core.splitinstall.zzo zzoVar) {
        super(new lq01("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = zzoVar;
    }

    public static synchronized bs01 c(Context context) {
        bs01 bs01Var;
        synchronized (bs01.class) {
            try {
                if (j == null) {
                    j = new bs01(context, com.google.android.play.core.splitinstall.zzo.zza);
                }
                bs01Var = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bs01Var;
    }

    public final synchronized void d(gtz0 gtz0Var) {
        try {
            Iterator it = new LinkedHashSet(this.i).iterator();
            while (it.hasNext()) {
                ((plk0) it.next()).a(gtz0Var);
            }
            synchronized (this) {
                Iterator it2 = new HashSet(this.d).iterator();
                while (it2.hasNext()) {
                    ((suk0) it2.next()).a(gtz0Var);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
