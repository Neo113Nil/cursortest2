package defpackage;

import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

/* loaded from: classes9.dex */
public final class ehs0 {
    public j4u a;

    public final void a(j4u j4uVar) {
        GuidanceOwnerId id = j4uVar.getId();
        j4u j4uVar2 = this.a;
        if (id == (j4uVar2 != null ? j4uVar2.getId() : null)) {
            return;
        }
        j4u j4uVar3 = this.a;
        if (j4uVar3 != null) {
            j4uVar3.stopGuidance();
        }
        this.a = j4uVar;
    }
}
