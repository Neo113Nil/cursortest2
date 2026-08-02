package com.yandex.go.navigator.map_interactions.long_taps;

import defpackage.sls;
import defpackage.tje;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class LongTapModalView$1$3$2 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m192invoke() {
        ynz ynzVar = (ynz) this.receiver;
        tje.N(ynzVar.Jg(), null, null, new LongTapPresenter$onGoHereClicked$1(ynzVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m192invoke();
        return zy11.a;
    }
}
