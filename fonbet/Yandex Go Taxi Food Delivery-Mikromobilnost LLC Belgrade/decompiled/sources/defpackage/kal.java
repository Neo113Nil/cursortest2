package defpackage;

import com.yandex.div.core.view2.divs.t;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;

/* loaded from: classes11.dex */
public final class kal implements jl11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DivSliderView b;
    public final /* synthetic */ t c;
    public final /* synthetic */ aw5 w;

    public /* synthetic */ kal(DivSliderView divSliderView, t tVar, aw5 aw5Var, int i) {
        this.a = i;
        this.b = divSliderView;
        this.c = tVar;
        this.w = aw5Var;
    }

    @Override // defpackage.jl11
    public final void a(Object obj) {
        int i = this.a;
        DivSliderView divSliderView = this.b;
        switch (i) {
            case 0:
                divSliderView.setThumbSecondaryValue(((Long) obj) != null ? Float.valueOf(r5.longValue()) : null, false);
                break;
            default:
                divSliderView.setThumbValue(((Long) obj) != null ? r5.longValue() : 0.0f, false);
                break;
        }
    }

    @Override // defpackage.jl11
    public final void e(tls tlsVar) {
        int i = this.a;
        aw5 aw5Var = this.w;
        t tVar = this.c;
        DivSliderView divSliderView = this.b;
        switch (i) {
            case 0:
                divSliderView.addOnThumbChangedListener(new jal(tVar, aw5Var, divSliderView, tlsVar));
                break;
            default:
                divSliderView.addOnThumbChangedListener(new lal(tVar, aw5Var, divSliderView, tlsVar));
                break;
        }
    }
}
