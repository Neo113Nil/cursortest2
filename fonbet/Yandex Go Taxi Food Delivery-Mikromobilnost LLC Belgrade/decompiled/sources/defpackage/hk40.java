package defpackage;

import ru.yandex.taxi.masstransit.overlay.onmap.a;

/* loaded from: classes6.dex */
public final class hk40 implements so21 {
    public final /* synthetic */ a a;

    public hk40(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.so21
    public final void updateAzimuth(float f) {
        this.a.d.updateAzimuth(f);
    }

    @Override // defpackage.so21
    public final void updateUserLocation(mo21 mo21Var) {
        this.a.d.Ng(mo21Var.a, mo21Var.b, mo21Var.c);
    }
}
