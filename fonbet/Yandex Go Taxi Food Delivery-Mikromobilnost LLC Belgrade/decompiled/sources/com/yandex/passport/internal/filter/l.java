package com.yandex.passport.internal.filter;

import android.content.Context;
import com.yandex.passport.internal.report.reporters.z0;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kme0;
import defpackage.ph41;
import defpackage.qoi0;
import defpackage.rle0;
import kotlin.jvm.internal.PropertyReference2Impl;

/* loaded from: classes8.dex */
public final class l {
    public static final com.yandex.passport.common.permission.b d;
    public static final /* synthetic */ kgx[] e;
    public static final kme0 f;
    public static final String g;
    public final Context a;
    public final z0 b;
    public final rle0 c = jl40.I(g, new dxf0(new ph41(6, this)), null, null, 12);

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(l.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        qoi0.a.getClass();
        e = new kgx[]{propertyReference2Impl};
        d = new com.yandex.passport.common.permission.b();
        f = new kme0("filter_rules");
        g = "FilterRulesStorage";
    }

    public l(Context context, z0 z0Var) {
        this.a = context;
        this.b = z0Var;
    }
}
