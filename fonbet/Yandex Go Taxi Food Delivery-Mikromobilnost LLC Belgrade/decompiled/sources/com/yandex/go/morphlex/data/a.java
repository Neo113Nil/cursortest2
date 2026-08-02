package com.yandex.go.morphlex.data;

import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ e c;

    public /* synthetic */ a(tse tseVar, e eVar, int i) {
        this.a = i;
        this.b = tseVar;
        this.c = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.c;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                tje.N(tseVar, null, null, new MorphlexFlexConfigFactory$createFlexSdkConfig$errorController$1$1(eVar, null), 3);
                break;
            default:
                tje.N(tseVar, null, null, new MorphlexFlexConfigFactory$createFlexSdkConfig$errorController$2$1(eVar, null), 3);
                break;
        }
        return zy11Var;
    }
}
