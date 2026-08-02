package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.c;
import com.yandex.div.json.expressions.Expression;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d5k implements View.OnClickListener {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c b;
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ rvo w;
    public final /* synthetic */ View x;
    public final /* synthetic */ Expression y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d5k(aw5 aw5Var, rvo rvoVar, View view, Div2View div2View, c cVar, Expression expression, List list) {
        this.y = expression;
        this.c = div2View;
        this.w = rvoVar;
        this.b = cVar;
        this.z = aw5Var;
        this.x = view;
        this.A = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.A;
        Expression expression = this.y;
        Object obj2 = this.z;
        View view2 = this.x;
        rvo rvoVar = this.w;
        Div2View div2View = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                bvf0.e(view, expression, div2View.getInputFocusTracker(), rvoVar);
                cVar.a.d((aw5) obj2, view2, (List) obj, "click");
                break;
            default:
                cVar.getClass();
                cVar.b.b((v3k) obj2, rvoVar);
                bvf0.e(view, expression, div2View.getInputFocusTracker(), rvoVar);
                ((h090) obj).a().onClick(view2);
                break;
        }
    }

    public /* synthetic */ d5k(c cVar, Div2View div2View, rvo rvoVar, View view, v3k v3kVar, Expression expression, h090 h090Var) {
        this.b = cVar;
        this.c = div2View;
        this.w = rvoVar;
        this.x = view;
        this.z = v3kVar;
        this.y = expression;
        this.A = h090Var;
    }
}
