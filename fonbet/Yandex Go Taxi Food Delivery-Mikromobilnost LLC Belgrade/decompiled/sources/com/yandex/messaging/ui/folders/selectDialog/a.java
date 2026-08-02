package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.twr;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements sls {
    public final /* synthetic */ e a;
    public final /* synthetic */ twr b;

    public a(e eVar, twr twrVar) {
        this.a = eVar;
        this.b = twrVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str = this.b.a;
        e eVar = this.a;
        eVar.getClass();
        tje.N(ds31.a(eVar), null, null, new SelectFolderViewModel$onFolderClick$1(eVar, str, null), 3);
        return zy11.a;
    }
}
