package com.vungle.ads.internal.ui;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class u extends Lambda implements gzs {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str) {
        super(0);
        this.a = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("mraid Injecting JS ");
        a.append(this.a);
        return a.toString();
    }
}
