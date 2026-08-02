package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$State;
import defpackage.jl40;
import defpackage.w511;
import defpackage.yhl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class c9 implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        x8 x8Var = (x8) obj;
        if (jVar instanceof com.yandex.passport.common.network.i) {
            String c = x8Var.c();
            b9 b9Var = (b9) ((com.yandex.passport.common.network.i) jVar).a;
            String str = b9Var.c;
            return new GetTrackFromMagicRequest$Result(c, jl40.l(str, "otp_auth_not_ready") ? GetTrackFromMagicRequest$State.NotReady.INSTANCE : jl40.l(str, "otp_auth_finished") ? GetTrackFromMagicRequest$State.Ready.INSTANCE : new GetTrackFromMagicRequest$State.UnknownState(b9Var.c));
        }
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
}
