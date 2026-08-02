package xsna;

import com.vk.permission.PermissionHelper;
import java.util.List;
import xsna.cxl;

/* compiled from: DeliveryPointsMapOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class pxl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pxl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                PermissionHelper.a.getClass();
                if (p4g.b((List) obj, rl3.u0(PermissionHelper.h))) {
                    ((mxl) this.c).a.invoke(cxl.m.b);
                }
                return s3q0.a;
            case 1:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            default:
                ((gzg0) this.c).resumeWith(Boolean.FALSE);
                return s3q0.a;
        }
    }
}
