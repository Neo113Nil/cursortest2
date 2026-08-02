package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.ar20;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vy7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vy7(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = xzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                q630 q630Var = (q630) this.e;
                izs izsVar = (izs) this.c;
                ((Integer) obj2).getClass();
                wy7.a(ne7.I(49), (androidx.compose.runtime.a) obj, str, izsVar, q630Var);
                break;
            case 1:
                List list = (List) this.d;
                izs izsVar2 = (izs) this.c;
                yzs yzsVar = (yzs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-439334661, intValue, -1, "com.vk.clips.design.compose.description.subcomposeBadges.<anonymous> (ClipsEditDescriptionView.kt:153)");
                    }
                    if (list.isEmpty()) {
                        aVar.K(-1459739897);
                    } else {
                        aVar.K(-1453484190);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        ypp0.a(list, izsVar2, txj0.f(hr80.m(q630.a.a, ylu0Var.r().a, androidx.compose.ui.graphics.e.a), 1.0f), yzsVar, aVar, 0);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((eke) this.d).j((jke) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((zsl) this.d).a((d5f) this.e, (com.vk.newsfeed.common.recycler.holders.attachments.a) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                oww.a((mww) this.d, (gzs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                krx krxVar = (krx) this.d;
                izs izsVar3 = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1296048472, intValue2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.InviteFriendsContent.<anonymous> (InviteFriendsMviView.kt:117)");
                    }
                    nrx.a(krxVar, (g48) mtk0Var.getValue(), null, izsVar3, aVar2, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 6:
                b280 b280Var = (b280) this.d;
                izs izsVar4 = (izs) this.c;
                q630 q630Var2 = (q630) this.e;
                ((Integer) obj2).getClass();
                k080.a(ne7.I(385), (androidx.compose.runtime.a) obj, izsVar4, q630Var2, b280Var);
                break;
            case 7:
                x1c x1cVar = (x1c) this.d;
                bod0 bod0Var = (bod0) this.e;
                wh50 wh50Var = (wh50) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(555439168, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterCheckboxHolder.bind.<anonymous>.<anonymous> (ProductFilterCheckboxHolder.kt:37)");
                    }
                    String str2 = x1cVar.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    androidx.compose.runtime.a aVar4 = aVar3;
                    b4v0.a(ar20.a.a(str2, false, false, false, null, aVar3, 196608, 30), MiniInfoCell$Mode.Base, null, null, null, null, null, aVar4, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    Iterator<T> it = x1cVar.h.iterator();
                    while (it.hasNext()) {
                        y1c y1cVar = (y1c) it.next();
                        boolean z = y1cVar.c;
                        String str3 = y1cVar.a;
                        boolean y = aVar4.y(y1cVar) | aVar4.y(x1cVar) | aVar4.y(bod0Var);
                        Object x = aVar4.x();
                        if (y || x == a.C0011a.a) {
                            cg9 cg9Var = new cg9(y1cVar, x1cVar, bod0Var, wh50Var, 2);
                            aVar4.R(cg9Var);
                            x = cg9Var;
                        }
                        androidx.compose.runtime.a aVar5 = aVar4;
                        afv0.b(z, str3, (gzs) x, null, null, false, aVar5, 0, 120);
                        aVar4 = aVar5;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                clm0 clm0Var = (clm0) this.d;
                q630 q630Var3 = (q630) this.e;
                gzs gzsVar = (gzs) this.c;
                ((Integer) obj2).getClass();
                clm0Var.V0(ne7.I(7), (androidx.compose.runtime.a) obj, gzsVar, q630Var3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vy7(int i, int i2, Object obj, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = xzsVar;
        this.e = q630Var;
    }

    public /* synthetic */ vy7(Object obj, izs izsVar, int i, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    public /* synthetic */ vy7(x1c x1cVar, bod0 bod0Var, wh50 wh50Var) {
        this.b = 7;
        this.d = x1cVar;
        this.e = bod0Var;
        this.c = wh50Var;
    }
}
