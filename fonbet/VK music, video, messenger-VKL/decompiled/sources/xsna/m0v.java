package xsna;

import android.content.Context;
import android.os.Binder;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Predicate;

/* compiled from: HealthDataSdkServiceStubImpl.java */
/* loaded from: classes12.dex */
public final class m0v extends fnv {
    public final Context b;
    public final Executor e;

    public m0v(Context context, ExecutorService executorService) {
        super(0);
        attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        this.b = context;
        this.e = executorService;
    }

    public final void f(final String str) {
        String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new Predicate() { // from class: xsna.l0v
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals((String) obj);
            }
        })) {
            throw new SecurityException("Invalid package name!");
        }
        if (!"com.google.android.apps.healthdata".equals(str)) {
            throw new SecurityException("Not allowed!");
        }
    }
}
