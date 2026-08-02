package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.b;

/* loaded from: classes5.dex */
public final class kze implements v7p {
    public final /* synthetic */ int a;
    public final v7p b;

    public /* synthetic */ kze(v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.b;
        switch (i) {
            case 0:
                return new do6((a) v7pVar.get());
            case 1:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.a((a) v7pVar.get());
            case 2:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.a((a) v7pVar.get());
            case 3:
                return new b((a) v7pVar.get());
            default:
                return new u0z((a) v7pVar.get());
        }
    }
}
