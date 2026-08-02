package defpackage;

import java.util.Objects;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.a;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes6.dex */
public final class p9l0 implements lp0 {
    public final /* synthetic */ a a;
    public final /* synthetic */ y9l0 b;
    public final /* synthetic */ ModalViewOrigin c;
    public final /* synthetic */ RouteSelectorOpenReason w;
    public final /* synthetic */ q9l0 x;

    public p9l0(a aVar, y9l0 y9l0Var, ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason, q9l0 q9l0Var) {
        this.a = aVar;
        this.b = y9l0Var;
        this.c = modalViewOrigin;
        this.w = routeSelectorOpenReason;
        this.x = q9l0Var;
    }

    @Override // defpackage.lp0
    public final void I(xp0 xp0Var, AddressClarificationCloseReason addressClarificationCloseReason) {
        a aVar = this.a;
        byb bybVar = aVar.T;
        Objects.toString(addressClarificationCloseReason);
        bybVar.getClass();
        int i = addressClarificationCloseReason == null ? -1 : o9l0.a[addressClarificationCloseReason.ordinal()];
        if (i == 1) {
            aVar.Q(this.b, this.c, this.w, RouteSelectorOpenReason.ADJUSTMENT);
            return;
        }
        q9l0 q9l0Var = this.x;
        if (i != 2) {
            q9l0Var.dismiss();
        } else {
            q9l0Var.K();
        }
    }

    @Override // defpackage.sy60
    public final void a() {
    }
}
