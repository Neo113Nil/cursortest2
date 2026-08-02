package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import defpackage.gan;
import defpackage.hxj;
import defpackage.kpr0;
import defpackage.kza1;
import defpackage.r100;
import defpackage.xpb1;
import defpackage.xqc;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class b {
    public static final zzai b = zzaq.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public b(Context context, kpr0 kpr0Var, r100 r100Var, String str) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        xqc.a(context);
        xpb1.E();
        this.a = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(7, this);
        a.getClass();
        com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        Objects.requireNonNull(kpr0Var);
        kza1 kza1Var = new kza1(kpr0Var, 2);
        a2.getClass();
        com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzai zzaiVar = b;
        if (zzaiVar.containsKey(str)) {
            gan.d(context, (String) zzaiVar.get(str), false);
        }
    }
}
