package com.yandex.go.preorder.navigation;

import defpackage.hbp0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ wls b;

    public d(g gVar, wls wlsVar) {
        this.a = gVar;
        this.b = wlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        if (((Boolean) obj).booleanValue()) {
            hbp0.e(this.a.c, null, null, new PreorderPresenceRepositoryImpl$repeatOnPresent$2$1(this.b, null), 3);
        }
        return zy11.a;
    }
}
