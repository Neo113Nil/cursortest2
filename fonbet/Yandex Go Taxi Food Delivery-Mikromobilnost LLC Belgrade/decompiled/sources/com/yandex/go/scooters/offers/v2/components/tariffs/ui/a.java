package com.yandex.go.scooters.offers.v2.components.tariffs.ui;

import defpackage.d590;
import defpackage.jqx0;
import defpackage.l5p0;
import defpackage.tls;
import defpackage.wys;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wys b;

    public /* synthetic */ a(wys wysVar, int i) {
        this.a = i;
        this.b = wysVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wys wysVar = this.b;
        switch (i) {
            case 0:
                ((d590) wysVar).b0(new PackageViewHolder$1$1((l5p0) obj, null));
                break;
            default:
                ((jqx0) wysVar).b0(new TariffViewHolder$1$1((l5p0) obj, null));
                break;
        }
        return zy11Var;
    }
}
