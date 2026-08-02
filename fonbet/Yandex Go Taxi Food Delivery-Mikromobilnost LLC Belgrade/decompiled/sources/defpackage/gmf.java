package defpackage;

import com.yandex.go.taxi.order.details.v2.domain.feedback.a;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;

/* loaded from: classes14.dex */
public final class gmf extends ad5 {
    public final fmf A;
    public final a3y0 B;
    public boolean C;
    public final a x;
    public final orq y;
    public final xdf z;

    public gmf(a aVar, orq orqVar, xdf xdfVar, fmf fmfVar) {
        super(emf.class);
        this.x = aVar;
        this.y = orqVar;
        this.z = xdfVar;
        this.A = fmfVar;
        this.B = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "CustomTipsInputPresenter");
    }

    public final void Kg(String str) {
        boolean z = str.length() == 1 && !Character.isDigit(str.charAt(0));
        if (!evu0.J(str) && !z) {
            Lg();
        } else {
            this.C = false;
            ((emf) Dg()).enableConfirmButton(false);
        }
    }

    public final void Lg() {
        this.C = true;
        emf emfVar = (emf) Dg();
        fef fefVar = this.A.f;
        emfVar.setInputState(new imf(fefVar != null ? fefVar.d : null));
        ((emf) Dg()).enableConfirmButton(true);
    }
}
