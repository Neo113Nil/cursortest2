package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class g extends Lambda implements gzs {
    public final /* synthetic */ View a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ j c;
    public final /* synthetic */ Window d;
    public final /* synthetic */ izs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebView webView, Lazy lazy, j jVar, Window window, i iVar) {
        super(0);
        this.a = webView;
        this.b = lazy;
        this.c = jVar;
        this.d = window;
        this.e = iVar;
    }

    public final void a() {
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        int[] iArr = new int[2];
        this.a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final Rect rect = new Rect(i, i2, i + width, i2 + height);
        com.vungle.ads.internal.executor.j jVar = ((com.vungle.ads.internal.executor.d) j.a(this.b)).c;
        final j jVar2 = this.c;
        final Window window = this.d;
        final izs izsVar = this.e;
        jVar.execute(new Runnable() { // from class: xsna.uwy0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.util.g.a(width, height, jVar2, window, rect, izsVar);
            }
        });
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return s3q0.a;
    }

    public static final void a(int i, int i2, j jVar, Window window, Rect rect, izs izsVar) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                j.a(jVar, window, rect, bitmap, izsVar);
            } catch (Throwable th) {
                th = th;
                boolean z = u.a;
                t.a("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                izsVar.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }
}
