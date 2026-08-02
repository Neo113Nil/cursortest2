package com.yandex.passport.internal.ui.domik.common;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseSmsFragment b;

    public /* synthetic */ c(BaseSmsFragment baseSmsFragment, int i) {
        this.a = i;
        this.b = baseSmsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lambda$onViewCreated$2;
        zy11 lambda$onViewCreated$4;
        int i = this.a;
        BaseSmsFragment baseSmsFragment = this.b;
        switch (i) {
            case 0:
                lambda$onViewCreated$2 = baseSmsFragment.lambda$onViewCreated$2();
                return lambda$onViewCreated$2;
            default:
                lambda$onViewCreated$4 = baseSmsFragment.lambda$onViewCreated$4();
                return lambda$onViewCreated$4;
        }
    }
}
