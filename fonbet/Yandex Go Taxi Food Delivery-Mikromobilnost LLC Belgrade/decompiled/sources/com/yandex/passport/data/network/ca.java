package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.models.UserInfoData;
import defpackage.w511;
import defpackage.yhl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class ca implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        x0 x0Var;
        if (!(jVar instanceof com.yandex.passport.common.network.i)) {
            if (!(jVar instanceof com.yandex.passport.common.network.g)) {
                w511.b();
                return null;
            }
            List list = ((com.yandex.passport.common.network.x) ((com.yandex.passport.common.network.g) jVar).a).a;
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                yhl.d(list, "Internal error: Can't throw exception for error list ");
                return null;
            }
            BackendError backendError = (BackendError) it.next();
            com.yandex.passport.common.network.b bVar = BackendError.Companion;
            com.yandex.passport.internal.ui.c.z(backendError);
            throw null;
        }
        aa aaVar = (aa) ((com.yandex.passport.common.network.i) jVar).a;
        com.yandex.passport.data.models.t tVar = UserInfoData.Companion;
        String a = aaVar.a();
        String b = aaVar.b();
        long d = aaVar.d();
        tVar.getClass();
        UserInfoData a2 = com.yandex.passport.data.models.t.a(d, a, b);
        if (aaVar.c().getStatus() != null) {
            x0Var = new x0(aaVar.c().getStatus(), aaVar.c().getCompletionUrl(), aaVar.c().isComplete(), aaVar.c().isCompletionAvailable(), aaVar.c().isCompletionRecommended(), aaVar.c().isCompletionRequired());
        } else {
            x0Var = null;
        }
        return new ba(a2, x0Var, aaVar.c().getMembers(), aaVar.c().getXTokenClientId(), aaVar.c().getXTokenNeedReset());
    }
}
