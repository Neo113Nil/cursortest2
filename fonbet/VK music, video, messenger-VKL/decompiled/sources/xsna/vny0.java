package xsna;

import com.huawei.hms.iap.entity.ProductInfoReq;
import java.util.ArrayList;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.impl.RefCountDelegate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class vny0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vny0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        ((com.my.tracker.obfuscated.d) this.c).a((ProductInfoReq) this.d, (ArrayList) this.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                a();
                break;
            default:
                CronetUrlRequestContext.lambda$postObservationTaskToExecutor$0((String) this.c, (Runnable) this.d, (RefCountDelegate) this.e);
                break;
        }
    }
}
