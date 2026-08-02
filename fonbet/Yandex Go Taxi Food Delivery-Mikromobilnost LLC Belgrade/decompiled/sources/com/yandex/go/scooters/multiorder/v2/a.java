package com.yandex.go.scooters.multiorder.v2;

import android.content.Context;
import defpackage.k7x0;
import defpackage.q6o0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u501;
import defpackage.w201;

/* loaded from: classes12.dex */
public final class a implements u501 {
    public final Context a;
    public final k7x0 b;

    public a(Context context, k7x0 k7x0Var) {
        this.a = context;
        this.b = k7x0Var;
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return new rol0(new ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1((q6o0) w201Var, this, null));
    }
}
