package com.yandex.fintechsdk.features.error.internal.presentation;

import defpackage.bpb1;
import defpackage.dnd0;
import defpackage.mkp;
import defpackage.sls;
import defpackage.tls;
import defpackage.yr31;

/* loaded from: classes12.dex */
public final class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ Object c;

    public a(mkp mkpVar) {
        this.a = 0;
        this.b = ErrorFragment$componentStore$2.b;
        this.c = mkpVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (yr31) this.b.invoke((mkp) obj);
            default:
                mkp resolveDependencies = bpb1.d((ErrorFragment) obj).resolveDependencies();
                ErrorFragment$componentStore$2 errorFragment$componentStore$2 = ErrorFragment$componentStore$2.b;
                return new dnd0(1, new a(resolveDependencies));
        }
    }

    public a(ErrorFragment errorFragment) {
        this.a = 1;
        ErrorFragment$componentStore$2 errorFragment$componentStore$2 = ErrorFragment$componentStore$2.b;
        this.c = errorFragment;
        this.b = errorFragment$componentStore$2;
    }
}
