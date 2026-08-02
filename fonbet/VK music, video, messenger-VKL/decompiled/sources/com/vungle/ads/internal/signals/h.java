package com.vungle.ads.internal.signals;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class h extends Lambda implements gzs {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return ServiceLocator.d.a(this.a).getService(com.vungle.ads.internal.executor.a.class);
    }
}
