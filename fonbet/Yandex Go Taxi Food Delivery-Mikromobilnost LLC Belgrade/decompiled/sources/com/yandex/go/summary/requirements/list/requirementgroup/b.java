package com.yandex.go.summary.requirements.list.requirementgroup;

import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.f580;
import defpackage.g580;
import defpackage.lot0;
import defpackage.pwy0;
import defpackage.roj0;
import defpackage.tpr;
import defpackage.x8;
import defpackage.yt11;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public final class b implements yt11 {
    public final TariffInfoGroupDefinition a;
    public final lot0 b;
    public final g580 c;
    public final f580 d;
    public final roj0 e;
    public final a f;

    public b(TariffInfoGroupDefinition tariffInfoGroupDefinition, pwy0 pwy0Var, lot0 lot0Var, g580 g580Var, f580 f580Var, roj0 roj0Var) {
        this.a = tariffInfoGroupDefinition;
        this.b = lot0Var;
        this.c = g580Var;
        this.d = f580Var;
        this.e = roj0Var;
        this.f = new a(new tpr[]{pwy0Var.a(), new n(((x8) g580Var).b, new RequirementGroupScreenUiStateInteractor$uiStateFlow$1(2, null))}, this);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.f;
    }
}
