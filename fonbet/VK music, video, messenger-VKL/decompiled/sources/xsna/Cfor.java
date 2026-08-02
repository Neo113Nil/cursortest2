package xsna;

import com.vk.api.generated.goodsOrders.dto.GoodsOrdersOrderItemDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.sheet.VkOrderResultSheetDialog;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: xsna.for, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Cfor implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ Cfor(GoodsOrdersOrderItemDto goodsOrdersOrderItemDto, mov0 mov0Var, int i, bqu0 bqu0Var) {
        this.d = goodsOrdersOrderItemDto;
        this.e = mov0Var;
        this.c = i;
        this.f = bqu0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ror rorVar = (ror) this.d;
                rorVar.h((lpr) this.e, (lpr) this.f, null, new kor(rorVar, this.c, 0));
                break;
            default:
                GoodsOrdersOrderItemDto goodsOrdersOrderItemDto = (GoodsOrdersOrderItemDto) this.d;
                mov0 mov0Var = (mov0) this.e;
                bqu0 bqu0Var = (bqu0) this.f;
                Integer d = goodsOrdersOrderItemDto.d();
                Integer e = goodsOrdersOrderItemDto.e();
                xwv0 xwv0Var = mov0Var.d;
                ggu0 ggu0Var = (ggu0) mov0Var.f.c;
                HashMap hashMap = mov0Var.g;
                WebApiApplication v = xwv0Var.v();
                boolean e2 = v != null ? v.e() : false;
                int i = this.c;
                if (d != null && new k9x(1, 3, 1).e(d.intValue()) && e != null && e.intValue() == 1) {
                    hashMap.put(Integer.valueOf(i), Boolean.TRUE);
                    bqu0Var.dismiss();
                    if (d.intValue() == 1) {
                        mov0Var.c.n(JsApiMethodType.SHOW_GOODS_ORDER_BOX, new JSONObject().put("success", true).put("order_id", i));
                        new VkOrderResultSheetDialog(ggu0Var.b).a(e2, VkOrderResultSheetDialog.Mode.POSITIVE, null);
                    } else {
                        mov0Var.f(VkAppsErrors.Client.UNKNOWN_ERROR);
                        new VkOrderResultSheetDialog(ggu0Var.b).a(e2, VkOrderResultSheetDialog.Mode.NEGATIVE, null);
                    }
                } else if (e != null && e.intValue() == -1) {
                    hashMap.put(Integer.valueOf(i), Boolean.TRUE);
                    bqu0Var.dismiss();
                    mov0Var.f(VkAppsErrors.Client.UNKNOWN_ERROR);
                    new VkOrderResultSheetDialog(ggu0Var.b).a(e2, VkOrderResultSheetDialog.Mode.NEGATIVE, null);
                } else if (!epx.f(hashMap.get(Integer.valueOf(i)), Boolean.FALSE) || (e != null && e.intValue() == 0)) {
                    bqu0Var.dismiss();
                    mov0Var.f(VkAppsErrors.Client.USER_DENIED);
                } else {
                    mov0Var.i(bqu0Var, i);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ Cfor(ror rorVar, lpr lprVar, lpr lprVar2, int i) {
        this.d = rorVar;
        this.e = lprVar;
        this.f = lprVar2;
        this.c = i;
    }
}
