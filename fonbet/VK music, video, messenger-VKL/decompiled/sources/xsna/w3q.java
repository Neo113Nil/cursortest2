package xsna;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w3q implements f9e0 {
    @Override // xsna.f9e0
    public final Object get() {
        cqy<ScheduledExecutorService> cqyVar = ExecutorsRegistrar.a;
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return new gul(asu0.B(4, new wok("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
