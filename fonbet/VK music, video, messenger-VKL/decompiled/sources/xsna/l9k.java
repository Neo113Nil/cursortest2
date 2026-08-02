package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.provider.ContactsContract;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.ref.WeakReference;
import java.util.UUID;
import xsna.p9k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l9k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l9k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                p9k p9kVar = (p9k) this.d;
                String str = (String) this.e;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.f;
                Activity activity = (Activity) weakReference.get();
                if (activity == null) {
                    return s3q0.a;
                }
                szv szvVar = p9kVar.b;
                bc6 bc6Var = new bc6(activity, new vg3(activity, 2));
                szvVar.getClass();
                Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                intent.putExtra("finishActivityOnSaveCompleted", true);
                if (!drm0.N(str)) {
                    intent.putExtra("phone", drm0.p0(str).toString());
                }
                bc6Var.D(intent, 13289, null);
                p9k.a aVar = new p9k.a(weakReference, new bu1(cVar, 23));
                if (aVar.a) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                aVar.d.post(aVar.c);
                p9kVar.d.b(new o9k(aVar));
                return s3q0.a;
            default:
                rvx0 rvx0Var = (rvx0) this.c;
                UUID uuid = (UUID) this.d;
                n7s n7sVar = (n7s) this.e;
                Context context = (Context) this.f;
                String uuid2 = uuid.toString();
                fxx0 j = rvx0Var.c.j(uuid2);
                if (j == null || j.b.h()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ohd0 ohd0Var = rvx0Var.b;
                synchronized (ohd0Var.k) {
                    try {
                        m100.c().getClass();
                        uyx0 uyx0Var = (uyx0) ohd0Var.g.remove(uuid2);
                        if (uyx0Var != null) {
                            if (ohd0Var.a == null) {
                                PowerManager.WakeLock a = z8x0.a(ohd0Var.b, "ProcessorForegroundLck");
                                ohd0Var.a = a;
                                a.acquire();
                            }
                            ohd0Var.f.put(uuid2, uyx0Var);
                            ohd0Var.b.startForegroundService(bqn0.c(ohd0Var.b, bdl.c(uyx0Var.a), n7sVar));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                svx0 c = bdl.c(j);
                String str2 = bqn0.k;
                Intent intent2 = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent2.setAction("ACTION_NOTIFY");
                intent2.putExtra("KEY_NOTIFICATION_ID", n7sVar.a);
                intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", n7sVar.b);
                intent2.putExtra("KEY_NOTIFICATION", n7sVar.c);
                intent2.putExtra("KEY_WORKSPEC_ID", c.a);
                intent2.putExtra("KEY_GENERATION", c.b);
                context.startService(intent2);
                return null;
        }
    }
}
