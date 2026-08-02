package com.yandex.go.clarify_address.before_order;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dai0;
import defpackage.kr0;
import defpackage.mzb;
import defpackage.tje;
import defpackage.tse;
import defpackage.w6r;
import defpackage.x880;
import defpackage.y880;
import ru.yandex.taxi.persuggest.source.f;
import ru.yandex.taxi.preorder.source.domain.u;

/* loaded from: classes12.dex */
public final class b implements y880 {
    public final tse a;
    public final mzb b;
    public final u c;
    public final kr0 d;
    public final w6r e;

    public b(tse tseVar, mzb mzbVar, u uVar, kr0 kr0Var, w6r w6rVar) {
        this.a = tseVar;
        this.b = mzbVar;
        this.c = uVar;
        this.d = kr0Var;
        this.e = w6rVar;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        Screen screen = Screen.AFTER_SUMMARY_CLARIFY_POINT;
        f fVar = (f) this.e;
        fVar.getClass();
        fVar.c(dai0.z(screen));
        tje.N(this.a, null, null, new ClarifySourceAddressBeforeOrderPart$execute$1(this, x880Var, null), 3);
    }
}
