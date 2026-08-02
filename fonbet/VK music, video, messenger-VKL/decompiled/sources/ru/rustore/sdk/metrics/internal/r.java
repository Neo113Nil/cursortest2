package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes11.dex */
public final class r extends Lambda implements gzs<String> {
    public final /* synthetic */ Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable th) {
        super(0);
        this.a = th;
    }

    @Override // xsna.gzs
    public final String invoke() {
        return "Http request was failed with: " + this.a;
    }
}
