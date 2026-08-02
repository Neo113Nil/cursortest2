package com.yandex.passport.internal.ui.bouncer;

import defpackage.v7p;

/* loaded from: classes15.dex */
public final class k implements v7p {
    public final /* synthetic */ int a;
    public final j b;

    public /* synthetic */ k(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                return jVar.b;
            default:
                return jVar.a;
        }
    }
}
