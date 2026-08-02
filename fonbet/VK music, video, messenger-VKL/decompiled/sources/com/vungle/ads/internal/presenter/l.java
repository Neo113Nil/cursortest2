package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;
import xsna.vu5;

/* loaded from: classes7.dex */
public final class l extends Lambda implements gzs {
    public final /* synthetic */ r a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, long j, long j2) {
        super(0);
        this.a = rVar;
        this.b = j;
        this.c = j2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.a.d;
        long j = this.b;
        long j2 = this.c;
        WebView webView = zVar.m;
        if (webView != null) {
            StringBuilder sb = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb.append(j);
            sb.append('-');
            zVar.a(webView, vu5.a(')', j2, sb));
        }
        return s3q0.a;
    }
}
