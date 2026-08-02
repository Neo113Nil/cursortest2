package defpackage;

import com.yandex.div.core.expression.local.a;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ndl implements ct31 {
    public final aw5 a;
    public final b b;
    public final h6x0 c;
    public final a w;
    public mdl x;

    public ndl(aw5 aw5Var, b bVar, h6x0 h6x0Var, a aVar, mdl mdlVar) {
        this.a = aw5Var;
        this.b = bVar;
        this.c = h6x0Var;
        this.w = aVar;
        this.x = mdlVar;
    }

    public final void a(mdl mdlVar) {
        this.x = mdlVar;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        aw5 aw5Var = this.a;
        String str = aw5Var.a.getDataTag().a;
        b bVar = this.b;
        String b = bVar.b();
        LinkedHashMap linkedHashMap = this.c.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(str, obj);
        }
        ((Map) obj).put(b, Integer.valueOf(i));
        Div2View div2View = aw5Var.a;
        mdl mdlVar = this.x;
        rvo rvoVar = aw5Var.b;
        a aVar = this.w;
        aVar.getClass();
        com.yandex.div.core.expression.a i2 = div2View.getRuntimeStore().i(rvoVar);
        if (i2 == null) {
            return;
        }
        aVar.f(mdlVar, div2View, bVar, i2);
    }
}
