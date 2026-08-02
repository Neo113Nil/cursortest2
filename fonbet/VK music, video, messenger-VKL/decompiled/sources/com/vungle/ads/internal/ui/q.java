package com.vungle.ads.internal.ui;

import kotlin.jvm.internal.Lambda;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes7.dex */
public final class q extends Lambda implements wzs {
    public final /* synthetic */ z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar) {
        super(2);
        this.a = zVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        this.a.a((String) obj2, intValue);
        return s3q0.a;
    }
}
