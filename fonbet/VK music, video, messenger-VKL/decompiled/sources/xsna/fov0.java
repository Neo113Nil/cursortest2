package xsna;

import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.sheet.VkOrderResultSheetDialog;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fov0 implements izs {
    public final /* synthetic */ mov0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fov0(mov0 mov0Var, int i, boolean z) {
        this.b = mov0Var;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        OrdersOrderDto.StatusDto statusDto = (OrdersOrderDto.StatusDto) obj;
        OrdersOrderDto.StatusDto statusDto2 = OrdersOrderDto.StatusDto.CHARGED;
        mov0 mov0Var = this.b;
        if (statusDto == statusDto2) {
            mov0Var.c.n(JsApiMethodType.SHOW_ORDER_BOX, new JSONObject().put("success", true).put("order_id", this.c));
            if (this.d) {
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = ((ggu0) mov0Var.e.c).x;
                if (aVar != null) {
                    aVar.e();
                }
            } else {
                WebApiApplication v = mov0Var.d.v();
                new VkOrderResultSheetDialog(((ggu0) mov0Var.f.c).b).a(v != null ? v.e() : false, VkOrderResultSheetDialog.Mode.POSITIVE, new e1s0(mov0Var, 8));
            }
        } else {
            mov0Var.e(new IllegalStateException());
        }
        return s3q0.a;
    }
}
