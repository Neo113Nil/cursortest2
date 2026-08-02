package com.ybsdk.feature.transfer.internal.screens.result.presentation;

import defpackage.ds31;
import defpackage.mw3;
import defpackage.ns01;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransferResultFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements tls {
    public TransferResultFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onAutoTopupOfferSwitchClicked", "onAutoTopupOfferSwitchClicked(Z)V", 0);
    }

    public final void i(boolean z) {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        mw3 mw3Var = ((ns01) bVar.X()).o;
        if (mw3Var != null) {
            mw3 a = mw3.a(mw3Var, null, Boolean.valueOf(z), 2039);
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ns01.a((ns01) value, null, null, null, null, true, 32767)));
            tje.N(ds31.a(bVar), null, null, new TransferResultViewModel$onAutoTopupOfferSwitchClicked$2(bVar, a, null), 3);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
