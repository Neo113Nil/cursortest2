package xsna;

import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o6n0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aaba;
        switch (this.b) {
            case 0:
                ((xy0) this.c).invoke();
                return s3q0.a;
            default:
                aaba = aacl.aaba((HealthKitApiInvoker) this.c);
                return aaba;
        }
    }
}
