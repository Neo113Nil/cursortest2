package defpackage;

import androidx.compose.foundation.lazy.b;
import java.util.List;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.camera.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class ls7 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ls7(qor qorVar, up2 up2Var, wp2 wp2Var, f530 f530Var, jj2 jj2Var, float f, int i, int i2) {
        this.w = qorVar;
        this.x = up2Var;
        this.y = wp2Var;
        this.z = f530Var;
        this.A = jj2Var;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.A;
        Object obj4 = this.x;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                a.a((w8v) obj7, this.c, this.b, (tls) obj4, (Config$CameraLens) obj6, (sls) obj5, (jzd) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(3463);
                bmb1.a((qor) obj7, (up2) obj4, (wp2) obj6, (f530) obj5, (jj2) obj3, this.b, this.c, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                wub1.b((androidx.compose.runtime.internal.a) obj7, (androidx.compose.runtime.internal.a) obj4, (f530) obj6, this.b, (to5) obj5, (to5) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).intValue();
                int O4 = vng.O(i2 | 1);
                he91.b((b) obj7, (rqy) obj6, (List) obj5, (tls) obj4, (List) obj3, this.b, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ls7(w8v w8vVar, int i, float f, tls tlsVar, Config$CameraLens config$CameraLens, sls slsVar, jzd jzdVar, int i2) {
        this.w = w8vVar;
        this.c = i;
        this.b = f;
        this.x = tlsVar;
        this.y = config$CameraLens;
        this.z = slsVar;
        this.A = jzdVar;
    }

    public /* synthetic */ ls7(b bVar, rqy rqyVar, List list, tls tlsVar, List list2, float f, int i) {
        this.w = bVar;
        this.y = rqyVar;
        this.z = list;
        this.x = tlsVar;
        this.A = list2;
        this.b = f;
        this.c = i;
    }

    public /* synthetic */ ls7(androidx.compose.runtime.internal.a aVar, androidx.compose.runtime.internal.a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, int i) {
        this.w = aVar;
        this.x = aVar2;
        this.y = f530Var;
        this.b = f;
        this.z = to5Var;
        this.A = to5Var2;
        this.c = i;
    }
}
