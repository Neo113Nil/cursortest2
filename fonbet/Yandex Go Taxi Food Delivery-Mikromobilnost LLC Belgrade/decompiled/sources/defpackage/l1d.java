package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class l1d implements zvf0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l1d(int i) {
        this.a = i;
    }

    @Override // defpackage.zvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                j3y j3yVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new tqh(Executors.newFixedThreadPool(4, new zlf("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                j3y j3yVar2 = ExecutorsRegistrar.a;
                return new tqh(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new zlf("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                j3y j3yVar3 = ExecutorsRegistrar.a;
                return new tqh(Executors.newCachedThreadPool(new zlf("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                j3y j3yVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new zlf("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
