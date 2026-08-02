package defpackage;

import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$addClass$$inlined$performOperation$1;
import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1;
import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes14.dex */
public final class hgb {
    public final o0m0 a;
    public final g b;

    public hgb(o0m0 o0m0Var, g gVar) {
        this.a = o0m0Var;
        this.b = gVar;
    }

    public final void a(mi31 mi31Var, String str, String str2, boolean z) {
        if (mi31Var.a.V == null) {
            return;
        }
        g gVar = this.b;
        if (z) {
            tje.N(gVar.c, null, null, new SelectedMultiTariffsRepositoryImpl$addClass$$inlined$performOperation$1(gVar, str2, null, str), 3);
        } else {
            tje.N(gVar.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar, str2, null, str), 3);
        }
        this.a.a(SavePersonalStateNotifier$SavePersonalStateReason.MULTICLASS_CLASSES);
    }
}
