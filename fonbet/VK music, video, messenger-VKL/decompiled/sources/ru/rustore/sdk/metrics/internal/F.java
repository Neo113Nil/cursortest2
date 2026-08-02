package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class F extends Lambda implements gzs<String> {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str) {
        super(0);
        this.a = str;
    }

    @Override // xsna.gzs
    public final String invoke() {
        return "Delete id's from storage " + this.a;
    }
}
