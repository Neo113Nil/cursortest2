package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class up01 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final lf01 b;
    public boolean g;
    public final Intent h;

    @Nullable
    public cp01 l;

    @Nullable
    public ka01 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ck01 j = new IBinder.DeathRecipient() { // from class: xsna.ck01
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            up01 up01Var = up01.this;
            String str = up01Var.c;
            lf01 lf01Var = up01Var.b;
            ArrayList arrayList = up01Var.d;
            lf01Var.a("reportBinderDeath", new Object[0]);
            km01 km01Var = (km01) up01Var.i.get();
            if (km01Var != null) {
                lf01Var.a("calling onBinderDied", new Object[0]);
                km01Var.zza();
            } else {
                lf01Var.a("%s : Binder has died.", str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ah01 ah01Var = (ah01) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ah01Var.b;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                arrayList.clear();
            }
            up01Var.b();
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.ck01] */
    public up01(Context context, lf01 lf01Var, Intent intent) {
        this.a = context;
        this.b = lf01Var;
        this.h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
