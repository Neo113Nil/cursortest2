package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.delivery.ui.requirement.DeliveryRequirementView;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes5.dex */
public final class ani extends lys {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int S = 0;
    public final pav T;
    public final Object U;
    public final Object V;

    public ani(g1x g1xVar, mai maiVar, qnh qnhVar, pav pavVar) {
        super(g1xVar);
        this.U = maiVar;
        this.V = qnhVar;
        this.T = pavVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                g1x g1xVar = (g1x) ((zo31) obj2);
                AutoDividerComponentList autoDividerComponentList = g1xVar.b;
                AutoDividerComponentList autoDividerComponentList2 = g1xVar.b;
                autoDividerComponentList.removeAllViews();
                for (zlj0 zlj0Var : ((xmi) obj).a) {
                    DeliveryRequirementView deliveryRequirementView = new DeliveryRequirementView(g1xVar.a.getContext(), this.T);
                    deliveryRequirementView.bindModel(zlj0Var);
                    c.z(new bmh(12, zlj0Var, this), deliveryRequirementView);
                    autoDividerComponentList2.addView(deliveryRequirementView);
                }
                ((qnh) this.V).e(autoDividerComponentList2, F(), false);
                break;
            default:
                g65 g65Var = (g65) obj;
                zo31 zo31Var = (zo31) obj2;
                yj80 yj80Var = (yj80) zo31Var;
                c.z(new zj80(this, g65Var), yj80Var.a);
                GoFrameLayout goFrameLayout = yj80Var.a;
                goFrameLayout.setClickable(false);
                yj80Var.b.setBackgroundColor(s8o.m(g65Var.a, this.a.getContext()));
                d0(dk80.a);
                yj80 yj80Var2 = (yj80) zo31Var;
                OneShotPreDrawListener.add(yj80Var2.c, new sd30(19, this, g65Var.c.a));
                yj80Var2.a.setClipToOutline(true);
                c.z(new zj80(g65Var, this), goFrameLayout);
                break;
        }
    }

    public void c0(boolean z) {
        yj80 yj80Var = (yj80) ((zo31) this.R);
        yj80Var.c.setVisibility(!z ? 0 : 8);
        yj80Var.d.setVisibility(!z ? 0 : 8);
        yj80Var.e.setVisibility(z ? 0 : 8);
        yj80Var.a.setClickable(z);
    }

    public void d0(fk80 fk80Var) {
        zo31 zo31Var = (zo31) this.R;
        if (fk80Var instanceof dk80) {
            yj80 yj80Var = (yj80) zo31Var;
            yj80Var.c.setVisibility(8);
            yj80Var.d.setVisibility(0);
        } else {
            if (fk80Var instanceof ck80) {
                c0(true);
                return;
            }
            if (fk80Var instanceof ek80) {
                yj80 yj80Var2 = (yj80) zo31Var;
                yj80Var2.c.setVisibility(0);
                yj80Var2.d.setVisibility(8);
            } else {
                if (fk80Var.equals(bk80.a)) {
                    return;
                }
                w511.b();
            }
        }
    }

    public ani(yj80 yj80Var, pav pavVar, xvq xvqVar, tls tlsVar) {
        super(yj80Var);
        this.T = pavVar;
        this.U = xvqVar;
        this.V = tlsVar;
    }
}
