package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetData;
import kotlin.Result;
import kotlin.sequences.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f601 implements plk {
    public final h601 b;
    public final jc60 c;

    public f601(h601 h601Var, jc60 jc60Var) {
        this.b = h601Var;
        this.c = jc60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.Result$Failure] */
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        e2r e2rVar;
        e2r e2rVar2;
        OrdersWidgetData failure;
        int i = 17;
        qrq0 v = j73.v(new qrq0[]{a.d(new pxy0(i, div2View), view.getParent()), new i73(5, div2View)});
        q2m0 q2m0Var = new q2m0(21);
        if (v instanceof yw01) {
            yw01 yw01Var = (yw01) v;
            e2rVar = new e2r(1, q2m0Var, yw01Var.a, yw01Var.b);
        } else {
            e2rVar = new e2r(1, q2m0Var, v, new abl0(i));
        }
        qrq0 v2 = j73.v(new qrq0[]{e2rVar, new i73(5, div2View.getParent())});
        q2m0 q2m0Var2 = new q2m0(21);
        if (v2 instanceof yw01) {
            yw01 yw01Var2 = (yw01) v2;
            e2rVar2 = new e2r(1, q2m0Var2, yw01Var2.a, yw01Var2.b);
        } else {
            e2rVar2 = new e2r(1, q2m0Var2, v2, new abl0(i));
        }
        s5r s5rVar = new s5r(kotlin.sequences.b.g(e2rVar2, e601.a));
        while (s5rVar.hasNext()) {
            ((ViewGroup) s5rVar.next()).setClipChildren(false);
        }
        Object tag = view.getTag(nih0.tracking_list_wrapper);
        qd80 qd80Var = tag instanceof qd80 ? (qd80) tag : null;
        if (qd80Var != null) {
            JSONObject jSONObject = clkVar.i;
            h601 h601Var = this.b;
            h601Var.getClass();
            if (jSONObject != null) {
                try {
                    failure = (OrdersWidgetData) h601Var.a.a().b(OrdersWidgetData.Companion.serializer(), jSONObject.toString());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                r12 = failure instanceof Result.Failure ? null : failure;
            }
            qd80Var.p(h601Var.a(r12));
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        qd80 qd80Var = (qd80) this.c.get();
        qd80Var.w().setTag(nih0.tracking_list_wrapper, qd80Var);
        return qd80Var.w();
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "tracking_list");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        Object tag = view.getTag(nih0.tracking_list_wrapper);
        qd80 qd80Var = tag instanceof qd80 ? (qd80) tag : null;
        if (qd80Var != null) {
            qd80Var.b();
        }
    }
}
