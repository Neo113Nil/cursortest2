package com.yandex.passport.internal.ui.domik.call;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallConfirmFragment b;

    public /* synthetic */ b(CallConfirmFragment callConfirmFragment, int i) {
        this.a = i;
        this.b = callConfirmFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$3;
        zy11 onViewCreated$lambda$5;
        int i = this.a;
        CallConfirmFragment callConfirmFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$3 = CallConfirmFragment.onViewCreated$lambda$3(callConfirmFragment);
                return onViewCreated$lambda$3;
            default:
                onViewCreated$lambda$5 = CallConfirmFragment.onViewCreated$lambda$5(callConfirmFragment);
                return onViewCreated$lambda$5;
        }
    }
}
