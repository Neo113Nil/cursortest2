package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.im.MsgType;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendOptionsPopup$Option;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kyl;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y61 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y61(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StickersBonusResult stickersBonusResult;
        com.vk.core.compose.component.cell.content.j0 j0Var;
        int i = this.b;
        int i2 = 8;
        char c = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((z61) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                dlv0 dlv0Var = (dlv0) obj4;
                o.a aVar = (o.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1313511837, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuView.<anonymous> (BookingStartScreen.kt:172)");
                    }
                    zkv0.d(dlv0Var, null, kai.c(488203589, new sz7(aVar, r5 ? 1 : 0), aVar2), aVar2, 390, 2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                d790 d790Var = (d790) obj4;
                kt8 kt8Var = (kt8) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                nge0 nge0Var = (nge0) obj2;
                boolean n = d790Var.n();
                StickerStockItem stickerStockItem2 = d790Var.a;
                if (n || !d790Var.q()) {
                    y9l0.a(new s1l0(stickerStockItem2.b));
                    if (stickerStockItem == null) {
                        stickerStockItem = stickerStockItem2;
                    }
                    y9l0.a(new t1l0(stickerStockItem));
                } else {
                    y9l0.a(new q1l0(stickerStockItem2.b));
                }
                is8 is8Var = kt8Var.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                if (nge0Var != null && (stickersBonusResult = nge0Var.l) != null) {
                    new gl7().a(kt8Var.b, stickersBonusResult);
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                bse.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                return s3q0.a;
            case 4:
                ComposeMusicActionPlayAudiosFromBlockIdVh composeMusicActionPlayAudiosFromBlockIdVh = (ComposeMusicActionPlayAudiosFromBlockIdVh) obj4;
                View view = (View) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(79296630, intValue2, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh.createView.<anonymous>.<anonymous>.<anonymous> (ComposeMusicActionPlayAudiosFromBlockIdVh.kt:70)");
                    }
                    q630 j = txj0.j(60, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                    if (composeMusicActionPlayAudiosFromBlockIdVh.d != null) {
                        aVar3.K(94145546);
                        j0Var = Cell$Left.Main.a.C0731a.a(kai.c(1840630964, new ix(c == true ? 1 : 0, composeMusicActionPlayAudiosFromBlockIdVh, view), aVar3), aVar3);
                        aVar3.j();
                    } else {
                        aVar3.K(95139592);
                        aVar3.j();
                        j0Var = null;
                    }
                    aVar3.K(-1105302286);
                    us2.b bVar = new us2.b();
                    aVar3.K(-1105300371);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int m = bVar.m(new hik0(ylu0Var.getText().a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        bVar.g(d370.N(composeMusicActionPlayAudiosFromBlockIdVh.b, 0, aVar3));
                        s3q0 s3q0Var = s3q0.a;
                        bVar.k(m);
                        aVar3.j();
                        us2 n2 = bVar.n();
                        aVar3.j();
                        Object x = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = new am0(28);
                            aVar3.R(x);
                        }
                        com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.b(n2, null, null, null, 0, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, null, aVar3, 0, 6, 958), null, null, null, aVar3, 196608, 30);
                        boolean y = aVar3.y(composeMusicActionPlayAudiosFromBlockIdVh) | aVar3.y(view);
                        Object x2 = aVar3.x();
                        if (y || x2 == c0012a) {
                            x2 = new mk(i2, composeMusicActionPlayAudiosFromBlockIdVh, view);
                            aVar3.R(x2);
                        }
                        wiu0.b(j, false, j0Var, a, null, (gzs) x2, null, aVar3, 6, 82);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } catch (Throwable th) {
                        bVar.k(m);
                        throw th;
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                kxl.c((qow) obj4, (kyl.d) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.design.compose.productattaches.a) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((co20) obj4).j((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 8:
                wi3 wi3Var = (wi3) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                int i3 = ((e520) obj2).a;
                if (i3 == MsgSendOptionsPopup$Option.MUTED.ordinal()) {
                    wi3Var.invoke(MsgType.Silent.b);
                } else if (i3 == MsgSendOptionsPopup$Option.DELAYED.ordinal()) {
                    wi3Var.invoke(MsgType.Delayed.b);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 9:
                wzk0 wzk0Var = (wzk0) obj4;
                qod0 qod0Var = (qod0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2030139354, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSimplePickerHolder.bind.<anonymous> (ProductFilterSimplePickerHolder.kt:34)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1346570635, new ps7(9, wzk0Var, qod0Var), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 10:
                ghq ghqVar = (ghq) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-502652347, intValue4, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:476)");
                    }
                    rvi.a(a4h0.a.b(ghqVar), jaiVar, aVar5, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                float floatValue = ((Float) obj).floatValue();
                ((dz1) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).element = floatValue;
                return s3q0.a;
        }
    }

    public /* synthetic */ y61(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
