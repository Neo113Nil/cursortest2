package defpackage;

import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.delivery.edit.b;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;

/* loaded from: classes5.dex */
public final class iyp0 extends fy4 {
    public final g701 c;
    public final String d;

    public iyp0(g701 g701Var, e eVar, b bVar, ov7 ov7Var, p1b p1bVar, uy31 uy31Var, i iVar, v6s v6sVar) {
        super(uy31Var.i, eVar, bVar, ov7Var, p1bVar, iVar, v6sVar);
        this.c = g701Var;
        this.d = "secondary-action-buttons-key";
    }

    @Override // defpackage.fy4
    public final ztb b(gri griVar, boolean z, boolean z2, Set set, int i, Map map) {
        return new ztb(this.a.i(griVar.e, z, z2, set.contains(this.c.a), i, map));
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.d;
    }
}
