package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5373s extends Lambda implements gzs {
    public final /* synthetic */ C5376v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5373s(C5376v c5376v) {
        super(0);
        this.a = c5376v;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ((C5378x) this.a.b).a("ContentObserverScreenshotCaptor");
        return s3q0.a;
    }
}
