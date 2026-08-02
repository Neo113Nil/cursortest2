package com.yandex.go.tariffcard.ui;

import defpackage.fnx0;
import defpackage.g8e;
import defpackage.hgb;
import defpackage.iix0;
import defpackage.jst;
import defpackage.mi31;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class TariffOptionsCardView$MvpView$initAdapter$newAdapter$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        mi31 mi31Var;
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        iix0 iix0Var = (iix0) this.receiver;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) iix0Var.z).n();
        if (n != null && (mi31Var = n.a) != null) {
            if (mi31Var.a.K0) {
                ((hgb) iix0Var.A.get()).a(mi31Var, str, mi31Var.b, booleanValue);
                iix0Var.E.a(str, mi31Var, booleanValue);
            } else {
                g8e.C("Not a multiclass", jst.e);
            }
        }
        return zy11.a;
    }
}
