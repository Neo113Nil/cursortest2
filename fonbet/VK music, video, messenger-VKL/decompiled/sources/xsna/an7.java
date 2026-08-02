package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.lbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class an7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ an7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((pn7) this.d).m((com.vk.ecomm.onlinebooking.impl.calendar.j) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                wrc.a((ksc) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                d64 d64Var = (d64) this.d;
                d64 d64Var2 = (d64) this.e;
                d64 d64Var3 = (d64) this.c;
                rj50 rj50Var = (rj50) obj;
                lbf lbfVar = (lbf) obj2;
                if (lbfVar instanceof lbf.a) {
                    return rj50Var.a(d64Var, lbfVar);
                }
                if (lbfVar instanceof lbf.b) {
                    return rj50Var.a(d64Var2, lbfVar);
                }
                if (lbfVar instanceof lbf.c) {
                    return rj50Var.a(d64Var3, lbfVar);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                ((Integer) obj2).getClass();
                ((lat) this.d).i((xet) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                sd10.a((cye0) this.d, (q630) this.e, (wxe0) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((x430) this.d).i((y430) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                wte0 wte0Var = (wte0) this.d;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                wte0Var.j(ne7.I(49), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                return s3q0.a;
            case 7:
                UIBlockList uIBlockList = (UIBlockList) obj;
                i8c i8cVar = new i8c((qxh0) this.d, (UserId) this.e, (CatalogProfileLocalState.FollowSource) this.c);
                for (UIBlock uIBlock : uIBlockList.y) {
                    i8cVar.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        for (UIBlock uIBlock2 : uIBlockList2.y) {
                            i8cVar.invoke(uIBlockList2, uIBlock2);
                            if (uIBlock2 instanceof UIBlockList) {
                                UIBlockList uIBlockList3 = (UIBlockList) uIBlock2;
                                for (UIBlock uIBlock3 : uIBlockList3.y) {
                                    i8cVar.invoke(uIBlockList3, uIBlock3);
                                    if (uIBlock3 instanceof UIBlockList) {
                                        o19.w((UIBlockList) uIBlock3, i8cVar);
                                    }
                                }
                            }
                        }
                    }
                }
                return uIBlockList;
            case 8:
                ((Integer) obj2).getClass();
                yzi0.a((zzi0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((siq0) this.d).j((zjq0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((lrq0) this.d).a((List) this.e, (qvm0) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                dhu0.a((ButtonSize) this.d, (ButtonStyle) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(439));
                return s3q0.a;
        }
    }

    public /* synthetic */ an7(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ an7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
