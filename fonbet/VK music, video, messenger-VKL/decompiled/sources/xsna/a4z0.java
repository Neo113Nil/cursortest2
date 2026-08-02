package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Result;
import ru.rustore.sdk.core.exception.RuStoreConnectionTimeout;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import xsna.a4z0;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class a4z0 {
    public final Context a;
    public final pzy0 b;

    public a4z0(Context context, pzy0 pzy0Var) {
        this.a = context;
        this.b = pzy0Var;
    }

    public static final void b(Context context, ru.rustore.sdk.appupdate.k kVar, ServiceConnection serviceConnection) {
        List<ResolveInfo> queryIntentServices;
        PackageManager.ResolveInfoFlags of;
        if (!inj.a(context, "ru.vk.store.qa") && !inj.a(context, "ru.vk.store")) {
            kVar.invoke(new RuStoreNotInstalledException());
            return;
        }
        Intent intent = new Intent("ru.vk.store.provider.appupdate.RemoteAppUpdateFlowProvider");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentServices = packageManager.queryIntentServices(intent, of);
        } else {
            queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        }
        ComponentName k = atv0.k(queryIntentServices);
        if (k == null) {
            kVar.invoke(new RuStoreOutdatedException());
        } else {
            intent.setComponent(k);
            context.bindService(intent, serviceConnection, 1);
        }
    }

    public final suj0 a(final izs izsVar) {
        ntj0 ntj0Var = new ntj0(new izs<vtj0<Object>, s3q0>() { // from class: ru.rustore.sdk.appupdate.l$a
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final s3q0 invoke(vtj0<Object> vtj0Var) {
                Object failure;
                vtj0<Object> vtj0Var2 = vtj0Var;
                a4z0 a4z0Var = a4z0.this;
                try {
                    ServiceConnection invoke = izsVar.invoke(vtj0Var2);
                    vtj0Var2.c(new j(a4z0Var, invoke));
                    a4z0.b(a4z0Var.a, new k(vtj0Var2), invoke);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    vtj0Var2.a(a);
                }
                return s3q0.a;
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bpn0 bpn0Var = adn.a;
        return new suj0(new jwj0(ntj0Var, adn.a()), new izs<Throwable, Throwable>() { // from class: ru.rustore.sdk.appupdate.l$b
            @Override // xsna.izs
            public final Throwable invoke(Throwable th) {
                Throwable th2 = th;
                return th2 instanceof TimeoutException ? new RuStoreConnectionTimeout() : th2;
            }
        });
    }
}
