package com.yandex.messaging.ui.settings.folder;

import defpackage.bvf0;
import defpackage.cxr;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.krh;
import defpackage.sc5;
import defpackage.t7t;
import defpackage.vzi0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final com.yandex.messaging.internal.backendconfig.a w;
    public final r0 x;
    public final gci0 y;

    public a(t7t t7tVar, vzi0 vzi0Var, krh krhVar, com.yandex.messaging.internal.backendconfig.a aVar) {
        this.w = aVar;
        r0 c = bvf0.c(new cxr(null, 15));
        this.x = c;
        this.y = e.d(c);
        e.H(ds31.a(this), new jqr(t7tVar.a(zy11.a), new FoldersSettingsViewModel$1(this, null), 3));
    }
}
