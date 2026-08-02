package com.yandex.go.address.address_map_picker.panorama;

import defpackage.a8y0;
import defpackage.b8y0;
import defpackage.c9y0;
import defpackage.e8y0;
import defpackage.g21;
import defpackage.r11;
import defpackage.rpb0;
import defpackage.tse;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.panorama.l;

/* loaded from: classes12.dex */
public final class d {
    public final tse a;
    public final l b;
    public final a8y0 c;
    public final c9y0 d;
    public final b8y0 e;
    public final rpb0 f;
    public final com.yandex.go.address.address_map_picker.domain.c g;
    public final r11 h;
    public final g i;

    public d(tse tseVar, l lVar, e8y0 e8y0Var, a8y0 a8y0Var, c9y0 c9y0Var, b8y0 b8y0Var, rpb0 rpb0Var, g21 g21Var, com.yandex.go.address.address_map_picker.domain.c cVar, r11 r11Var) {
        this.a = tseVar;
        this.b = lVar;
        this.c = a8y0Var;
        this.d = c9y0Var;
        this.e = b8y0Var;
        this.f = rpb0Var;
        this.g = cVar;
        this.h = r11Var;
        this.i = e.X(e.t(new m0(g21Var.b, ru.yandex.taxi.experiments.d.b(e8y0Var), new AddressMapPickerPanoramaInteractor$buttonStateFlow$1(this, null))), new AddressMapPickerPanoramaInteractor$special$$inlined$flatMapLatest$1(this, null));
    }
}
