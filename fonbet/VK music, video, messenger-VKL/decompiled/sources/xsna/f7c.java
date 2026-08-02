package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.tooling.PreviewActivity;
import com.ironsource.X3;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.unitylevelplay.impl.UnityLevelPlayFeatureImpl;
import xsna.kyl;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f7c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f7c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                l7c.d((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(855730333, intValue, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapScreenContent.<anonymous>.<anonymous> (DeliveryPointsMapScreen.kt:68)");
                    }
                    gyl.a(izsVar, (kyl.e) wh50Var.getValue(), ahn.E(q630.a.a, "delivery_points_bottom_sheet"), aVar, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                v8t.a((String) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                se10.d((mtk0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                Object[] objArr = (Object[]) this.c;
                rg50 rg50Var = (rg50) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i = PreviewActivity.f;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-531963740, intValue2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
                    }
                    boolean y = aVar2.y(objArr);
                    Object x = aVar2.x();
                    if (y || x == a.C0011a.a) {
                        x = new g4(17, rg50Var, objArr);
                        aVar2.R(x);
                    }
                    lrr.a((gzs) x, null, null, 0L, 0L, null, aVar2, 12582912);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 5:
                com.vk.ecomm.market.good.ui.c cVar = (com.vk.ecomm.market.good.ui.c) this.c;
                com.vk.ecomm.market.good.ui.j jVar = (com.vk.ecomm.market.good.ui.j) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1615463800, intValue3, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.bind.<anonymous> (ProductButtonsBinderRefactoredImpl.kt:44)");
                    }
                    rrv0.d(null, null, null, null, kai.c(547906435, new r21(7, cVar, jVar), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                UnityLevelPlayFeatureImpl unityLevelPlayFeatureImpl = (UnityLevelPlayFeatureImpl) this.c;
                wzs wzsVar = (wzs) this.d;
                Integer num = (Integer) obj;
                int intValue4 = num.intValue();
                String str = (String) obj2;
                unityLevelPlayFeatureImpl.d = UnityLevelPlayFeatureImpl.InitializationState.NOT_INITIALIZED;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"UnityLevelPlayFeatureImpl", com.vk.movika.sdk.base.model.history.b.b(intValue4, X3.j.d, "]: ", str)});
                }
                wzsVar.invoke(num, str);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ f7c(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
