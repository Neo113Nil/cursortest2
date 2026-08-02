package defpackage;

import ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.a;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.b;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.c;

/* loaded from: classes5.dex */
public final class okp0 implements v7p {
    public final /* synthetic */ int a;
    public final ubq0 b;

    public /* synthetic */ okp0(ubq0 ubq0Var, int i) {
        this.a = i;
        this.b = ubq0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        ubq0 ubq0Var = this.b;
        switch (i) {
            case 0:
                return new a((c) ubq0Var.get());
            default:
                return new b((c) ubq0Var.get());
        }
    }
}
