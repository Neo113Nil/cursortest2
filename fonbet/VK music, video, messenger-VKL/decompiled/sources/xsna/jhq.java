package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.ProductCardError;
import xsna.cpu0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jhq implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jhq(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 17;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        char c = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                khq.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                break;
            case 1:
                Throwable th = (Throwable) obj4;
                GoodFragment goodFragment = (GoodFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-401966100, intValue, -1, "com.vk.ecomm.market.good.GoodFragment.bindErrorView.<anonymous>.<anonymous> (GoodFragment.kt:672)");
                    }
                    ProductCardError productCardError = ((th instanceof VKApiExecutionException) && h03.a(th)) ? ProductCardError.Internet : ProductCardError.Server;
                    boolean y = aVar.y(goodFragment);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new m1i(goodFragment, 17);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    skd0.a(productCardError, gzsVar, txj0.d(hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), 1.0f), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) obj4;
                hxh0 hxh0Var = (hxh0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1824062913, intValue2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder.createView.<anonymous>.<anonymous> (SearchPlaylistViewHolder.kt:97)");
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d dVar = (com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d) ((zak0) searchPlaylistViewHolder.d).getValue();
                    if (dVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(128913894, new ke4(7, dVar, hxh0Var), aVar2), aVar2, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) obj4;
                e1l e1lVar = (e1l) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(579931243, intValue3, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerDialog.<anonymous> (VkDateRangePicker.kt:76)");
                    }
                    boolean J = aVar3.J(gVar);
                    Object x2 = aVar3.x();
                    if (J || x2 == c0012a) {
                        cpu0.a aVar4 = new cpu0.a(0, gVar, com.vk.core.compose.component.datetime.g.class, "dismissDialog", "dismissDialog$components_release()V", 0);
                        aVar3.R(aVar4);
                        x2 = aVar4;
                    }
                    kyk.a((gzs) ((fcy) x2), kai.c(1003240601, new cx(i2, e1lVar, gVar), aVar3), null, kai.c(135313239, new f9h(gVar, 13), aVar3), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, kai.c(-580865886, new x8d0(e1lVar, c == true ? 1 : 0), aVar3), aVar3, 100666416);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jhq(gzs gzsVar, q630 q630Var, int i) {
        this.b = 0;
        this.c = gzsVar;
        this.d = q630Var;
    }
}
