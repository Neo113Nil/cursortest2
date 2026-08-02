package com.yandex.go.navigator.map_interactions.parkings;

import android.content.Context;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.mapkit.GeoObject;
import defpackage.ah00;
import defpackage.bwa1;
import defpackage.eb50;
import defpackage.l68;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.zzs;

/* loaded from: classes12.dex */
public final class e extends pgd {
    public final Context F;
    public final w030 G;
    public final com.yandex.go.navigator.map_interactions.parkings.analytics.a H;
    public final ah00 I;
    public final eb50 J;
    public final mu5 K;

    public e(h hVar, l68 l68Var, Context context, w030 w030Var, com.yandex.go.navigator.map_interactions.parkings.analytics.a aVar, ah00 ah00Var, eb50 eb50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = aVar;
        this.I = ah00Var;
        this.J = eb50Var;
        this.K = new mu5(new d(this, hVar, l68Var));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.H.c((GeoObject) obj);
        this.J.a = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        GeoObject geoObject = (GeoObject) obj;
        this.J.a = Screen.Parking;
        this.H.d(geoObject);
        zzs b = bwa1.b(geoObject);
        if (b != null) {
            tje.N(o(), null, null, new CarParksRouter$focusOnParking$1$1(this, b, null), 3);
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
