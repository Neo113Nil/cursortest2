package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q0r implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((v0r) obj3).g(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ul20) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((ga70) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).getClass();
                yla0.a((xla0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                yma0.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((ujd0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 7:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj3;
                String str = (String) obj;
                kea keaVar = (kea) obj2;
                int i2 = VideoCatalogRootVh.M0;
                int i3 = 22;
                keaVar.I = new qk(i3, videoCatalogRootVh, str);
                keaVar.J = new oe5(24, videoCatalogRootVh, str);
                keaVar.K = new tx(i3, videoCatalogRootVh, str);
                break;
            case 8:
                yzs yzsVar = (yzs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1624267612, intValue, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:231)");
                    }
                    yzsVar.invoke(ziv0.f(0, aVar), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((anx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q0r(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ q0r(anx anxVar, yzs yzsVar) {
        this.b = 8;
        this.c = yzsVar;
    }
}
