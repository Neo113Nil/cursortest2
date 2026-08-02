package com.yandex.go.navigator.map_interactions.long_taps;

import defpackage.sls;
import defpackage.tje;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class LongTapModalView$1$3$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m191invoke() {
        ynz ynzVar = (ynz) this.receiver;
        tje.N(ynzVar.Jg(), null, null, new LongTapPresenter$onGoViaClicked$1(ynzVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m191invoke();
        return zy11.a;
    }
}
