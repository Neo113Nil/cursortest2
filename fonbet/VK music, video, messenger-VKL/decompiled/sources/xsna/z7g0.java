package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import xsna.k5z;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes12.dex */
public final class z7g0 implements Handler.Callback {
    public static final a f = new a();
    public volatile y7g0 b;
    public final b c;
    public final hgs d;
    public final k5z e;

    /* compiled from: RequestManagerRetriever.java */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
    }

    public z7g0() {
        new zk3();
        a aVar = f;
        this.c = aVar;
        this.e = new k5z(aVar);
        this.d = (auu.f && auu.e) ? new ilr() : new atv0();
    }

    @Nullable
    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @NonNull
    public final y7g0 b(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = s2r0.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.d.d(fragmentActivity);
                Activity a2 = a(fragmentActivity);
                boolean z = a2 == null || !a2.isFinishing();
                com.bumptech.glide.a a3 = com.bumptech.glide.a.a(fragmentActivity.getApplicationContext());
                k5z k5zVar = this.e;
                Lifecycle lifecycle = fragmentActivity.getLifecycle();
                fragmentActivity.getSupportFragmentManager();
                k5zVar.getClass();
                s2r0.a();
                s2r0.a();
                y7g0 y7g0Var = (y7g0) k5zVar.a.get(lifecycle);
                if (y7g0Var != null) {
                    return y7g0Var;
                }
                a5z a5zVar = new a5z(lifecycle);
                b bVar = k5zVar.b;
                k5z.a aVar = new k5z.a();
                ((a) bVar).getClass();
                y7g0 y7g0Var2 = new y7g0(a3, a5zVar, aVar, fragmentActivity);
                k5zVar.a.put(lifecycle, y7g0Var2);
                a5zVar.i(new j5z(k5zVar, lifecycle));
                if (z) {
                    y7g0Var2.onStart();
                }
                return y7g0Var2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        com.bumptech.glide.a a4 = com.bumptech.glide.a.a(context.getApplicationContext());
                        b bVar2 = this.c;
                        fo50 fo50Var = new fo50();
                        c4g0 c4g0Var = new c4g0();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar2).getClass();
                        this.b = new y7g0(a4, fo50Var, c4g0Var, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
