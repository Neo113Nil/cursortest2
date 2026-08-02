package defpackage;

import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class gjz {
    public final tci a;
    public final /* synthetic */ kjz b;
    public final /* synthetic */ y30 c;
    public final /* synthetic */ AppVisibilitySubscriptionImpl d;

    public gjz(kjz kjzVar, y30 y30Var, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl) {
        this.b = kjzVar;
        this.c = y30Var;
        this.d = appVisibilitySubscriptionImpl;
        this.a = new tci(1, (tci) ((o) kjzVar.b).t.get());
    }

    public final jwh a() {
        return (jwh) ((o) this.b.b).d.get();
    }

    public final dci b() {
        return (dci) ((o) this.b.b).f.get();
    }

    public final hwy0 c() {
        return new hwy0(this.b.h());
    }
}
