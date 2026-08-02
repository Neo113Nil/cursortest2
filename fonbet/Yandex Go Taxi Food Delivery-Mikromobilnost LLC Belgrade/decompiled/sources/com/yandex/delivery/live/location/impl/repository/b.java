package com.yandex.delivery.live.location.impl.repository;

import android.content.Context;
import defpackage.cwy;
import defpackage.dxf0;
import defpackage.ha2;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.p0u;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class b {
    public static final cwy d = new cwy();
    public static final rle0 e = jl40.I("delivery-live-location", new dxf0(new p0u(15)), null, null, 12);
    public final Context a;
    public final ha2 b;
    public final kme0 c;

    public b(Context context) {
        this.a = context;
        d.getClass();
        this.b = new ha2(6, ((tpg) e.getValue(context, cwy.a[0])).getData(), this);
        this.c = new kme0(ClidProvider.STATE);
    }

    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        d.getClass();
        Object a = androidx.datastore.preferences.core.b.a((tpg) e.getValue(this.a, cwy.a[0]), new LiveLocationStateDataStoreImpl$update$2(this, z, null), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
