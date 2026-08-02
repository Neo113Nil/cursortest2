package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.sloth.ui.d2;
import defpackage.i1k;
import defpackage.pey;

/* loaded from: classes15.dex */
public final class j implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ pey b;
    public final /* synthetic */ androidx.lifecycle.q c;

    public /* synthetic */ j(pey peyVar, androidx.lifecycle.q qVar, int i) {
        this.a = i;
        this.b = peyVar;
        this.c = qVar;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        androidx.lifecycle.q qVar = this.c;
        pey peyVar = this.b;
        switch (i) {
            case 0:
                peyVar.getLifecycle().d((i) qVar);
                break;
            default:
                peyVar.getLifecycle().d((d2) qVar);
                break;
        }
    }
}
