package com.yandex.passport.data.network;

import defpackage.w511;

/* loaded from: classes15.dex */
public final class yc implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            uc ucVar = (uc) ((com.yandex.passport.common.network.i) jVar).a;
            return new wc(ucVar.a, ucVar.b, ucVar.c, ucVar.d, ucVar.e);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.j0 j0Var = (com.yandex.passport.common.network.j0) ((com.yandex.passport.common.network.g) jVar).a;
        if (j0Var.a.contains("biometrics_ebs.tib_user_access_denied")) {
            return vc.a;
        }
        com.yandex.passport.data.exceptions.a.a(j0Var.a);
        throw null;
    }
}
