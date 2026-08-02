package xsna;

import com.vk.permission.PermissionHelper;
import java.util.List;
import xsna.cxl;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class db5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ db5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((to5) this.c).e.c.invoke(((if2) obj).d());
                return s3q0.a;
            case 1:
                return "above_item";
            case 2:
                PermissionHelper.a.getClass();
                if (p4g.b((List) obj, rl3.u0(PermissionHelper.h))) {
                    ((mxl) this.c).a.invoke(cxl.n.b);
                }
                return s3q0.a;
            default:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
        }
    }
}
