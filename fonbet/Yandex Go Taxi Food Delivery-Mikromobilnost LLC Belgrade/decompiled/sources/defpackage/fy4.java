package defpackage;

import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.delivery.edit.b;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;

/* loaded from: classes5.dex */
public abstract class fy4 implements b801 {
    public final p1b a;
    public final cd0 b;

    public fy4(gci0 gci0Var, e eVar, b bVar, ov7 ov7Var, p1b p1bVar, i iVar, v6s v6sVar) {
        this.a = p1bVar;
        this.b = new cd0(7, new tpr[]{new ey4(new pb(eVar.e, 14), 0), gci0Var, ov7Var.b, bVar.c.b, iVar.f, v6sVar.b}, this);
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.b;
    }

    public abstract ztb b(gri griVar, boolean z, boolean z2, Set set, int i, Map map);
}
