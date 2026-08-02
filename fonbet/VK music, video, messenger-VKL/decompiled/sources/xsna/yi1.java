package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.f;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yi1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yi1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                zi1.a((rl1) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.i) this.d).h((f.b.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                vz7.h((String) this.d, (String) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((rqg) this.d).i((sqg) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                jai jaiVar = (jai) this.d;
                khx khxVar = (khx) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2094405415, intValue, -1, "com.vk.core.compose.component.internal.InternalScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:355)");
                    }
                    jaiVar.invoke(khxVar, new wow(arrayList), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                cy80.a((imy) this.d, (gzs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                UIBlockList uIBlockList = (UIBlockList) obj;
                a6 a6Var = new a6((enh0) this.d, (UserId) this.c, (CatalogProfileLocalState.FollowSource) this.e);
                for (UIBlock uIBlock : uIBlockList.y) {
                    a6Var.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        for (UIBlock uIBlock2 : uIBlockList2.y) {
                            a6Var.invoke(uIBlockList2, uIBlock2);
                            if (uIBlock2 instanceof UIBlockList) {
                                UIBlockList uIBlockList3 = (UIBlockList) uIBlock2;
                                for (UIBlock uIBlock3 : uIBlockList3.y) {
                                    a6Var.invoke(uIBlockList3, uIBlock3);
                                    if (uIBlock3 instanceof UIBlockList) {
                                        o19.w((UIBlockList) uIBlock3, a6Var);
                                    }
                                }
                            }
                        }
                    }
                }
                return uIBlockList;
            default:
                ((Integer) obj2).getClass();
                boj0.a((String) this.d, (String) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(3073));
                return s3q0.a;
        }
    }

    public /* synthetic */ yi1(Object obj, Object obj2, Serializable serializable, int i) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
        this.e = serializable;
    }

    public /* synthetic */ yi1(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }
}
