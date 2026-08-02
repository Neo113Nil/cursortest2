package com.google.android.gms.common.moduleinstall.internal;

import defpackage.atx0;
import defpackage.j091;
import defpackage.pui0;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements pui0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(c cVar, Object obj, int i) {
        this.a = i;
        this.b = cVar;
        this.c = obj;
    }

    @Override // defpackage.pui0
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        c cVar = this.b;
        j091 j091Var = (j091) obj;
        atx0 atx0Var = (atx0) obj2;
        switch (i) {
            case 0:
                ((zaf) j091Var.i()).zae(new zar(cVar, atx0Var), (ApiFeatureRequest) obj3);
                break;
            case 1:
                ((zaf) j091Var.i()).zag(new zat(cVar, atx0Var), (ApiFeatureRequest) obj3, null);
                break;
            default:
                ((zaf) j091Var.i()).zai(new zav(cVar, atx0Var), (zaab) obj3);
                break;
        }
    }
}
