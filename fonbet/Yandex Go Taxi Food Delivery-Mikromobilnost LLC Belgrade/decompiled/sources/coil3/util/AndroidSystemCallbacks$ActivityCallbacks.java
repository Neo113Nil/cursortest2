package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import coil3.c;
import defpackage.adi0;
import defpackage.nc2;
import defpackage.uci0;
import defpackage.uh;
import defpackage.vav;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"coil3/util/AndroidSystemCallbacks$ActivityCallbacks", "Lcoil3/util/DefaultActivityLifecycleCallbacks;", "Lcoil3/c;", "strongImageLoaderReference", "<init>", "(Lnc2;Lcoil3/c;)V", "Landroid/content/Context;", "context", "Lzy11;", "register", "(Landroid/content/Context;)V", "unregister", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "", "backgroundMaxSizePercent", CA20Status.STATUS_REQUEST_D, "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSystemCallbacks$ActivityCallbacks implements DefaultActivityLifecycleCallbacks {
    private final double backgroundMaxSizePercent;
    final /* synthetic */ nc2 this$0;

    public AndroidSystemCallbacks$ActivityCallbacks(nc2 nc2Var, c cVar) {
        this.this$0 = nc2Var;
        uci0 uci0Var = cVar.a;
        uh uhVar = vav.a;
        Object obj = uci0Var.b.n.a.get(vav.d);
        this.backgroundMaxSizePercent = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        super.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        unregister(activity);
    }

    @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
    }

    public final void register(Context context) {
        long a;
        if (this.backgroundMaxSizePercent == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        nc2 nc2Var = this.this$0;
        c cVar = (c) nc2Var.a.get();
        if (cVar == null) {
            nc2Var.a();
            return;
        }
        adi0 d = cVar.d();
        if (d != null) {
            double d2 = this.backgroundMaxSizePercent;
            synchronized (d.c) {
                a = d.a.a();
            }
            long j = (long) (d2 * a);
            synchronized (d.c) {
                d.a.d(j);
            }
        }
    }

    public final void unregister(Context context) {
        long a;
        if (this.backgroundMaxSizePercent == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        nc2 nc2Var = this.this$0;
        c cVar = (c) nc2Var.a.get();
        if (cVar == null) {
            nc2Var.a();
            return;
        }
        adi0 d = cVar.d();
        if (d != null) {
            synchronized (d.c) {
                a = d.a.a();
            }
            synchronized (d.c) {
                d.a.d(a);
            }
        }
    }
}
