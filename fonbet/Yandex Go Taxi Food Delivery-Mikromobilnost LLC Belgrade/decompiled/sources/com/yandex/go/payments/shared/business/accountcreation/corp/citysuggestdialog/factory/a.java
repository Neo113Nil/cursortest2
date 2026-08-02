package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory;

import defpackage.c4f;
import defpackage.e3o;
import defpackage.gtq0;
import defpackage.iwb;
import defpackage.j51;
import defpackage.pnt0;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes13.dex */
public final class a implements j51 {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final pnt0 b = new pnt0((Object) null);
    public final /* synthetic */ iwb c;
    public final /* synthetic */ c4f d;

    public a(iwb iwbVar, c4f c4fVar) {
        this.c = iwbVar;
        this.d = c4fVar;
    }

    @Override // defpackage.j51
    public final tpr a(String str) {
        return new rol0(new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1(this, str, null));
    }

    @Override // defpackage.j51
    public final tpr b(String str) {
        return str == null ? pvn.a : new rol0(new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1(this, str, null));
    }

    @Override // defpackage.j51
    public final tpr c(e3o e3oVar) {
        return pvn.a;
    }

    @Override // defpackage.j51
    public final tpr d(String str, String str2) {
        return new rol0(new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequestAsFlow$1(this, str, null));
    }

    @Override // defpackage.j51
    public final tpr e(int i, boolean z, boolean z2) {
        return new rol0(new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$resolveSelectedSuggest$1(this, i, null));
    }
}
