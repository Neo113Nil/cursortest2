package com.yandex.quark.utils.assets.internal;

import android.content.Context;
import defpackage.l93;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wly0;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a implements l93 {
    public final Context a;

    public a(Context context, wly0 wly0Var) {
        this.a = context;
    }

    public final Object a(Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new StringAssetReader$read$2(this, "quarkBridge.js", null), continuation);
    }
}
