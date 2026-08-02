package com.yandex.go.address.address_map_picker.ui.state;

import com.yandex.go.address.address_map_picker.panorama.d;
import defpackage.g21;
import defpackage.j11;
import defpackage.mob0;
import defpackage.tpr;
import defpackage.yt11;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a implements yt11 {
    public final g21 a;
    public final zuj0 b;
    public final ru.yandex.taxi.address.clarification.impl.repo.a c;
    public final d d;
    public final mob0 e;
    public final j11 f;

    public a(g21 g21Var, zuj0 zuj0Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar, d dVar, mob0 mob0Var, j11 j11Var) {
        this.a = g21Var;
        this.b = zuj0Var;
        this.c = aVar;
        this.d = dVar;
        this.e = mob0Var;
        this.f = j11Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return e.m(this.a.b, e.d(this.c.h), this.d.i, this.f.b, new AddressMapPickerUiStateInteractor$uiStateFlow$1(this, null));
    }
}
