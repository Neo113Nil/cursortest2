package com.yandex.go.drive.sdkintegration.domain.session;

import defpackage.h3y;
import defpackage.i3y;
import defpackage.iy11;
import defpackage.jnt;
import defpackage.jqr;
import defpackage.kfm;
import defpackage.nm;
import defpackage.pz40;
import defpackage.tfm;
import defpackage.tvl;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class e {
    public final tfm a;
    public final kfm b;
    public final iy11 c;
    public final h3y d;
    public final h3y e;
    public final com.yandex.go.drive.delegates.b f;
    public final i3y g = kotlin.a.a(new tvl(15));
    public final AtomicReference h = new AtomicReference(null);

    public e(tfm tfmVar, kfm kfmVar, iy11 iy11Var, h3y h3yVar, h3y h3yVar2, com.yandex.go.drive.delegates.b bVar) {
        this.a = tfmVar;
        this.b = kfmVar;
        this.c = iy11Var;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.f = bVar;
    }

    public final Object a(Continuation continuation) {
        return new n(kotlinx.coroutines.flow.e.X(new jqr(new d(kotlinx.coroutines.flow.e.t(this.c.a), this), new DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2(this, null), 3), new DriveSessionInteractorImpl$fetchSessionState$$inlined$flatMapLatest$1(3, null)), new DriveSessionInteractorImpl$fetchSessionState$3(this, null)).collect(new nm(15, this), continuation);
    }

    public final pz40 b() {
        return (pz40) this.g.getValue();
    }

    public final boolean c() {
        jnt jntVar = (jnt) ((r0) b()).getValue();
        List list = jntVar != null ? jntVar.a : null;
        return !(list == null || list.isEmpty());
    }
}
