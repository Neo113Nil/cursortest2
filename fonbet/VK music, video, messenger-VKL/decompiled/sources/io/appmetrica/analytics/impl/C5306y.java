package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5306y extends Lambda implements izs {
    public final /* synthetic */ C5154s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5306y(C5154s c5154s) {
        super(1);
        this.a = c5154s;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.a.h = (byte[]) obj;
        return s3q0.a;
    }
}
