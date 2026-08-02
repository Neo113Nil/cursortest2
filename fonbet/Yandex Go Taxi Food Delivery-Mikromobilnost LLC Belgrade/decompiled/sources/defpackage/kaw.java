package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing.a;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.a3;

/* loaded from: classes14.dex */
public final class kaw implements zk7 {
    public final /* synthetic */ a a;

    public kaw(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.zk7
    public final void a(a3 a3Var) {
        boolean z = a3Var instanceof PopupUiControl.Deeplink;
        a aVar = this.a;
        if (!z) {
            aVar.i();
            return;
        }
        ((a60) aVar.L).c(((PopupUiControl.Deeplink) a3Var).a, v770.c);
        aVar.i();
    }

    @Override // defpackage.zk7
    public final void b(a3 a3Var) {
        boolean z = a3Var instanceof PopupUiControl.Deeplink;
        a aVar = this.a;
        if (!z) {
            aVar.i();
            return;
        }
        ((a60) aVar.L).c(((PopupUiControl.Deeplink) a3Var).a, v770.c);
        aVar.i();
    }
}
