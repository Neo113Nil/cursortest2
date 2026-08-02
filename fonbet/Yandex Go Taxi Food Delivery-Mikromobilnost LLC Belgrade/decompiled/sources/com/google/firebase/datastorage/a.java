package com.google.firebase.datastorage;

import android.content.Context;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.p0u;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpg;
import defpackage.weu;
import defpackage.xeu;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference2Impl;

/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ kgx[] d;
    public final String a;
    public final ThreadLocal b = new ThreadLocal();
    public final tpg c;

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        qoi0.a.getClass();
        d = new kgx[]{propertyReference2Impl};
    }

    public a(Context context, String str) {
        this.a = str;
        this.c = (tpg) jl40.I(str, new dxf0(new p0u(this)), new weu(2, this), null, 8).getValue(context, d[0]);
    }

    public final void a(tls tlsVar) {
    }

    public final Map b() {
        return (Map) tje.Y(EmptyCoroutineContext.a, new JavaDataStorage$getAllSync$1(this, null));
    }

    public final Object c() {
        return tje.Y(EmptyCoroutineContext.a, new JavaDataStorage$getSync$1(this, xeu.b, -1L, null));
    }

    public final void d(Long l) {
    }
}
