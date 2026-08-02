package com.yandex.go.taxi.order.rate;

import defpackage.ci70;
import defpackage.dm21;
import defpackage.isq;
import defpackage.kdd0;
import defpackage.ksq;
import defpackage.o2y0;
import defpackage.orq;
import defpackage.s8i0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.tje;
import defpackage.vtq;
import defpackage.yh70;
import java.util.HashMap;
import kotlin.text.Regex;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class e implements s8i0 {
    public final /* synthetic */ RateView a;

    public e(RateView rateView) {
        this.a = rateView;
    }

    @Override // defpackage.s8i0
    public final void c(String str, boolean z) {
        c presenter = this.a.getPresenter();
        tje.N(presenter.Jg(), null, null, new RatePresenter$onRatingReasonClick$1(presenter, null), 3);
        kdd0 kdd0Var = presenter.O;
        orq orqVar = (orq) kdd0Var.c;
        String str2 = ((o2y0) kdd0Var.a).b().a;
        yh70 yh70Var = orqVar.d;
        String b = ((ci70) orqVar.c).b(str2);
        yh70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        yh70Var.a.a(sb2.q("${screen}.DidChangeLowRatingReasons", hashMap), hashMap, 1, hashMap2);
        dm21 dm21Var = (dm21) kdd0Var.b;
        o2y0 o2y0Var = (o2y0) kdd0Var.a;
        ksq b2 = ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).b(o2y0Var.b().a);
        String str3 = o2y0Var.b().a;
        ksq ksqVar = new ksq(new isq(str3, b2));
        if (((o2y0) kdd0Var.a).b().h.b == DriveState.COMPLETE) {
            ((com.yandex.go.taxi.order.feedback.domain.b) ((dm21) kdd0Var.b)).d(str3, ksqVar);
        } else {
            ((com.yandex.go.taxi.order.feedback.domain.b) ((vtq) kdd0Var.d).a).c(ksqVar, true);
        }
    }
}
