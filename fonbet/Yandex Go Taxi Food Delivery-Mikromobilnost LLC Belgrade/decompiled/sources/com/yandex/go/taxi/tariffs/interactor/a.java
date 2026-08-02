package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import defpackage.gid0;
import defpackage.j2d0;
import defpackage.jjj0;
import defpackage.kgx;
import defpackage.ojc;
import defpackage.p8f;
import defpackage.pl2;
import defpackage.py1;
import defpackage.qnx0;
import defpackage.u0h;
import defpackage.ur40;
import defpackage.uy1;
import defpackage.vmd0;
import defpackage.w511;
import defpackage.wu1;
import defpackage.yu1;
import defpackage.yx00;
import defpackage.zo40;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.taxi.tariffs.internal.repository.k a;

    public a(com.yandex.go.taxi.tariffs.internal.repository.k kVar) {
        this.a = kVar;
    }

    public static boolean b(wu1 wu1Var) {
        if ((wu1Var instanceof vmd0) || (wu1Var instanceof j2d0)) {
            return true;
        }
        if ((wu1Var instanceof u0h) || (wu1Var instanceof ojc) || (wu1Var instanceof py1) || (wu1Var instanceof uy1) || (wu1Var instanceof pl2) || (wu1Var instanceof gid0) || (wu1Var instanceof p8f) || (wu1Var instanceof zo40) || (wu1Var instanceof ur40) || (wu1Var instanceof yx00) || (wu1Var instanceof jjj0) || (wu1Var instanceof qnx0) || (wu1Var instanceof yu1) || wu1Var == null) {
            return false;
        }
        w511.b();
        return false;
    }

    public final void a(String str) {
        ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1 applyOptionByOfferForAllTariffsInteractorImpl$apply$1 = new ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1(this, str, null);
        kgx[] kgxVarArr = com.yandex.go.taxi.tariffs.internal.repository.k.m;
        this.a.a(TariffChangeReason.DEFAULT, applyOptionByOfferForAllTariffsInteractorImpl$apply$1);
    }
}
