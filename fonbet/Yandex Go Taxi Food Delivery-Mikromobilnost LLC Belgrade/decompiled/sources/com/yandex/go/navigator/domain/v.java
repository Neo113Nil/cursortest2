package com.yandex.go.navigator.domain;

import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.bvf0;
import defpackage.ehs0;
import defpackage.hiq0;
import defpackage.ihs0;
import defpackage.j4u;
import defpackage.jhs0;
import defpackage.sb50;
import defpackage.yce;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

/* loaded from: classes12.dex */
public final class v {
    public final com.yandex.go.navigator.repository.f a;
    public final sb50 b;
    public final com.yandex.go.navigator.events.f c;
    public final hiq0 d;
    public final r0 e;
    public final r0 f;
    public final ihs0 g;

    public v(com.yandex.go.navigator.repository.f fVar, sb50 sb50Var, com.yandex.go.navigator.events.f fVar2, hiq0 hiq0Var, jhs0 jhs0Var) {
        this.a = fVar;
        this.b = sb50Var;
        this.c = fVar2;
        this.d = hiq0Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.e = c;
        this.f = c;
        this.g = new ihs0(new NavigatorIsInFreeDriveRepository$singleGuidanceRegistrationController$1(0, this, v.class, "stopFreeDriveGuidance", "stopFreeDriveGuidance()V", 0), (ehs0) jhs0Var.a.a.get());
    }

    public final boolean a() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final void b() {
        if (a()) {
            Boolean bool = Boolean.FALSE;
            r0 r0Var = this.e;
            r0Var.getClass();
            r0Var.m(null, bool);
            this.b.e = false;
            this.c.b(new yce(false, 12), true);
            Navigation b = this.a.b();
            if (b != null) {
                b.stopGuidance();
            }
            ehs0 ehs0Var = this.g.b;
            GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.AUTO_NAVIGATION;
            j4u j4uVar = ehs0Var.a;
            if (guidanceOwnerId != (j4uVar != null ? j4uVar.getId() : null)) {
                return;
            }
            ehs0Var.a = null;
        }
    }
}
