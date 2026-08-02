package xsna;

import android.content.Context;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersNewOrderItemDto;
import com.vk.dto.common.Peer;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fom(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                e0w e0wVar = (e0w) obj;
                for (Peer peer : (Collection) this.d) {
                    StringBuilder b = fp.b(this.c, "\n                    DELETE FROM dialog_members\n                    WHERE dialog_id = ", " AND member_type = ");
                    b.append(peer.c.h());
                    b.append(" AND member_id = ");
                    b.append(peer.d);
                    b.append("\n                    ");
                    e0wVar.execSQL(b.toString());
                }
                break;
            default:
                final mov0 mov0Var = (mov0) this.d;
                final GoodsOrdersNewOrderItemDto goodsOrdersNewOrderItemDto = (GoodsOrdersNewOrderItemDto) obj;
                final long j = this.c;
                i0q0.f(new gzs() { // from class: xsna.hov0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        GoodsOrdersNewOrderItemDto goodsOrdersNewOrderItemDto2 = GoodsOrdersNewOrderItemDto.this;
                        String e = goodsOrdersNewOrderItemDto2.e();
                        int d = goodsOrdersNewOrderItemDto2.d();
                        if (e != null) {
                            mov0 mov0Var2 = mov0Var;
                            mov0Var2.h = d;
                            rex0 rex0Var = e370.j;
                            if (rex0Var == null) {
                                rex0Var = null;
                            }
                            Context context = ((ggu0) mov0Var2.f.c).b;
                            rex0Var.a(j, context, (r8 & 8) != 0 ? null : 125, e);
                        }
                        return s3q0.a;
                    }
                });
                break;
        }
        return s3q0.a;
    }
}
