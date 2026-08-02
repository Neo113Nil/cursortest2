package com.yandex.passport.internal.upgrader;

import defpackage.k8u;
import defpackage.tls;
import defpackage.uza;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8u b;

    public /* synthetic */ l(k8u k8uVar, int i) {
        this.a = i;
        this.b = k8uVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        k8u k8uVar = this.b;
        switch (i) {
            case 0:
                return com.yandex.passport.data.network.core.m.a.c((Map) obj, k8uVar).getBytes(uza.a);
            default:
                return (Map) com.yandex.passport.data.network.core.m.a.b(k8uVar, new String((byte[]) obj, uza.a));
        }
    }
}
