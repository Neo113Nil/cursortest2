package com.yandex.go.places.organization.card.impl.ui.card.flex.v2.extended_options.state;

import defpackage.oxo;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.yt11;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class a implements yt11 {
    public final oxo a;
    public final String b;
    public final ArrayList c;
    public final rol0 d = new rol0(new ExtendedOptionsUiStateInteractor$uiStateFlow$1(this, null));

    public a(oxo oxoVar, String str, ArrayList arrayList) {
        this.a = oxoVar;
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.d;
    }
}
