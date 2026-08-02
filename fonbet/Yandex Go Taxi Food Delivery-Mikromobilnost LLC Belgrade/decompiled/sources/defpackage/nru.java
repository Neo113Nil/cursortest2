package defpackage;

import kotlinx.coroutines.flow.e;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a;

/* loaded from: classes5.dex */
public final class nru extends m7 {
    public final hwy0 b;
    public final a c;
    public final z4s d;
    public final p6s e;
    public final s5s f;
    public final sae g;
    public final vv0 h;

    public nru(u3s u3sVar, hwy0 hwy0Var, a aVar, z4s z4sVar, p6s p6sVar, s5s s5sVar, sae saeVar, vv0 vv0Var) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = aVar;
        this.d = z4sVar;
        this.e = p6sVar;
        this.f = s5sVar;
        this.g = saeVar;
        this.h = vv0Var;
    }

    @Override // defpackage.m7
    public final String c() {
        return "horizontal-stack";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new n1f(27, new tpr[]{this.b.b, b(str), this.e.e(), e.d(this.d.a), this.f.d, e.d(this.h.a)}, this);
    }
}
