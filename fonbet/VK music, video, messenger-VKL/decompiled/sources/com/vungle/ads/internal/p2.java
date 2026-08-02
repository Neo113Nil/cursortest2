package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class p2 extends Lambda implements gzs {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return ServiceLocator.d.a(this.a).getService(com.vungle.ads.internal.task.h.class);
    }
}
