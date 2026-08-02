package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

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
        this.b = BduiFragment$componentStore$2.b;
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
                mkp resolveDependencies = bpb1.d((BduiFragment) obj).resolveDependencies();
                BduiFragment$componentStore$2 bduiFragment$componentStore$2 = BduiFragment$componentStore$2.b;
                return new dnd0(1, new a(resolveDependencies));
        }
    }

    public a(BduiFragment bduiFragment) {
        this.a = 1;
        BduiFragment$componentStore$2 bduiFragment$componentStore$2 = BduiFragment$componentStore$2.b;
        this.c = bduiFragment;
        this.b = bduiFragment$componentStore$2;
    }
}
