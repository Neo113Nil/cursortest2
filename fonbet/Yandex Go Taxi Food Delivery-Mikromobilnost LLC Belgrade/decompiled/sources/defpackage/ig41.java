package defpackage;

import com.yandex.go.superapp.web.modal.WebModalView;
import ru.yandex.taxi.eatskit.d;
import ru.yandex.taxi.eatskit.dto.ErrorSource;

/* loaded from: classes5.dex */
public final class ig41 extends x3 implements wh41 {
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig41(d dVar) {
        super(5, dVar);
        this.c = dVar;
    }

    @Override // defpackage.x3, defpackage.r250
    public final void b9(f8o f8oVar, ErrorSource errorSource) {
        j7w0 j7w0Var;
        super.b9(f8oVar, errorSource);
        ja41 ja41Var = this.c.n.x;
        if (ja41Var != null) {
            d6j0 d6j0Var = f8oVar != null ? f8oVar.a : null;
            j7w0Var = ((WebModalView) ((aj31) ja41Var).b).loadCallbacks;
            if (j7w0Var != null) {
                j7w0Var.a(d6j0Var);
            }
        }
    }
}
