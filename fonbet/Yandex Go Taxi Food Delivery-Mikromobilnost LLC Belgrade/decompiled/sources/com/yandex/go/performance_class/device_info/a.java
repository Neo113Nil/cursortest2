package com.yandex.go.performance_class.device_info;

import android.content.Context;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final tt2 b;

    public a(Context context, tt2 tt2Var) {
        this.a = context;
        this.b = tt2Var;
    }

    public final Object a(Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new AndroidDeviceInfoProvider$getMaxCpuFreqMhz$2(2, null), continuation);
    }
}
