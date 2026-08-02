package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class e extends Lambda implements gzs {
    public final /* synthetic */ View a;
    public final /* synthetic */ izs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.a = webView;
        this.b = iVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Bitmap.Config.ARGB_8888);
            this.a.draw(new Canvas(createBitmap));
            this.b.invoke(createBitmap);
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.b.invoke(null);
        }
        return s3q0.a;
    }
}
