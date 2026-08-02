package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.t;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;

/* loaded from: classes11.dex */
public final class jal implements qps0 {
    public final /* synthetic */ aw5 a;
    public final /* synthetic */ tls b;

    public jal(t tVar, aw5 aw5Var, DivSliderView divSliderView, tls tlsVar) {
        this.a = aw5Var;
        this.b = tlsVar;
    }

    @Override // defpackage.qps0
    public final void b(Float f) {
        Div2View div2View = this.a.a;
        this.b.invoke(Long.valueOf(f != null ? m810.c(f.floatValue()) : 0L));
    }
}
