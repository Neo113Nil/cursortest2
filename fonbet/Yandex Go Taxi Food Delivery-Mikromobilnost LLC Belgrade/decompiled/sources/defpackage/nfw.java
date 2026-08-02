package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing.a;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;

/* loaded from: classes14.dex */
public final class nfw {
    public final /* synthetic */ e a;

    public nfw(e eVar) {
        this.a = eVar;
    }

    public final void a(BulletsOrderPopup bulletsOrderPopup, boolean z) {
        e eVar = this.a;
        a aVar = eVar.f0;
        if (aVar == null || !gtq0.u(aVar)) {
            a aVar2 = (a) eVar.M.get();
            eVar.f0 = aVar2;
            eVar.A(aVar2, new jaw(bulletsOrderPopup, z), new wui(eVar, 10));
        }
    }
}
