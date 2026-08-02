package com.yandex.passport.sloth.ui;

import android.webkit.WebView;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.ui.challenge.vpn.o oVar = (com.yandex.passport.internal.ui.challenge.vpn.o) obj;
                return new j0((b1) oVar.a, (l) oVar.b, (com.yandex.passport.sloth.dependencies.h) oVar.c);
            default:
                ((WebView) obj).goBack();
                return zy11.a;
        }
    }
}
