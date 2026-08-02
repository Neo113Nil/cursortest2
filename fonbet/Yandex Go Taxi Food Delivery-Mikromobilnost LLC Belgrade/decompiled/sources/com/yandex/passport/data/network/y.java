package com.yandex.passport.data.network;

import defpackage.w511;
import java.util.List;

/* loaded from: classes15.dex */
public final class y implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            return new com.yandex.passport.common.ebs.l(((x) ((com.yandex.passport.common.network.i) jVar).a).a);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        List list = ((com.yandex.passport.common.network.j0) ((com.yandex.passport.common.network.g) jVar).a).a;
        if (list.contains("biometrics_ebs.verified_age_restriction")) {
            return com.yandex.passport.common.ebs.m.a;
        }
        if (list.contains("biometrics_ebs.consent_needed")) {
            return com.yandex.passport.common.ebs.j.a;
        }
        if (list.contains("biometrics_ebs.bio_incorrect")) {
            return com.yandex.passport.common.ebs.i.a;
        }
        if (list.contains("biometrics_ebs.ebs_registration_pending")) {
            return com.yandex.passport.common.ebs.k.a;
        }
        com.yandex.passport.data.exceptions.a.a(list);
        throw null;
    }
}
