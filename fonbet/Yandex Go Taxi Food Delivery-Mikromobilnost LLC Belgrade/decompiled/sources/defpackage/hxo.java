package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class hxo implements qqo {
    public final /* synthetic */ qqo a;

    public hxo(rqo rqoVar) {
        cxo.Companion.getClass();
        this.a = ((jbh) rqoVar).c(cxo.i);
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    public final fxo d() {
        String str = b().e;
        if (str != null) {
            return new fxo(str, b().f, b().g, b().h);
        }
        return null;
    }

    @Override // defpackage.qqo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cxo b() {
        return (cxo) this.a.b();
    }

    public final boolean f(DriveState driveState) {
        if (!b().b) {
            return false;
        }
        int i = gxo.a[driveState.ordinal()];
        if (i == 1) {
            return b().c.a;
        }
        if (i != 2) {
            return false;
        }
        return b().d.a;
    }
}
