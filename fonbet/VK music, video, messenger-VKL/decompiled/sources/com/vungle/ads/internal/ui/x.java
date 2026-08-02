package com.vungle.ads.internal.ui;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class x extends Lambda implements gzs {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(0);
        this.a = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Requested range exceeds cached file: ");
        a.append(this.a);
        return a.toString();
    }
}
