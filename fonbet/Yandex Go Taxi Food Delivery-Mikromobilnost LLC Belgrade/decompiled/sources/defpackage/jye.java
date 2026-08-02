package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class jye implements b801 {
    public final fye a;
    public final cd0 b;

    public jye(e eVar, fye fyeVar) {
        this.a = fyeVar;
        this.b = new cd0(29, new syc(eVar.e, 4), this);
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.b;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return "cost-details-key";
    }
}
