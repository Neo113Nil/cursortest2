package xsna;

import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.DeleteOptions;
import java.util.concurrent.Callable;
import okhttp3.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kg6 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aab;
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                lg6 lg6Var = (lg6) this.d;
                okhttp3.v vVar = null;
                try {
                    p.a aVar = new p.a();
                    aVar.i(str);
                    vVar = ((f8f0) ((okhttp3.o) lg6Var.a.invoke()).a(aVar.b())).execute().h;
                    byte[] bytes = vVar.bytes();
                    vVar.close();
                    return bytes;
                } catch (Throwable th) {
                    if (vVar != null) {
                        vVar.close();
                    }
                    throw th;
                }
            default:
                aab = aacl.aab((HealthKitApiInvoker) this.c, (DeleteOptions) this.d);
                return aab;
        }
    }
}
