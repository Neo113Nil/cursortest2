package defpackage;

import com.yandex.go.flex.common.scaffolds.appbarscaffold.AppBarScaffold;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.c;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.design.utils.a;

/* loaded from: classes.dex */
public final class dp2 implements cxi {
    public final a a;

    public dp2(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.cxi
    public final bxi create() {
        return new bxi() { // from class: bp2
            @Override // defpackage.bxi
            public final ikm0 a(final hyi hyiVar) {
                KSerializer serializer = AppBarScaffold.Companion.serializer();
                final dp2 dp2Var = dp2.this;
                return new ikm0("AppBarScaffold", qoi0.a(AppBarScaffold.class), serializer, new ujm0() { // from class: cp2
                    @Override // defpackage.ujm0
                    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
                        w0j w0jVar = l1oVar.d;
                        hyi hyiVar2 = hyi.this;
                        return new c(w0jVar, hyiVar2.a, hyiVar2.b, l1oVar.c, l1oVar.a, dp2Var.a);
                    }
                });
            }
        };
    }
}
