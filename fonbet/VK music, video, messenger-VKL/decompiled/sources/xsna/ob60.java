package xsna;

import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import xsna.hov;
import xsna.oap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ob60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ob60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                pb60 pb60Var = (pb60) this.c;
                pb60Var.b.b(pb60Var.c(new oap.b((kym0) obj)), false);
                break;
            case 1:
                ((ir4) this.c).F(kzc0.e, kzc0.f, (Collection) obj);
                break;
            case 2:
                String str = (String) this.c;
                hov.a aVar = (hov.a) obj;
                if (aVar.a != 0) {
                    ConcurrentHashMap concurrentHashMap = wmi0.e;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = null;
                    }
                    concurrentHashMap.put(str, new SoftReference(aVar.a));
                }
                break;
            default:
                ((ToggleManager) this.c).w((b.c) obj);
                break;
        }
        return s3q0.a;
    }
}
