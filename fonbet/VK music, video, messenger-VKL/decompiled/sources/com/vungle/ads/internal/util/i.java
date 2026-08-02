package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.l6m;
import xsna.msy;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes7.dex */
public final class i extends Lambda implements izs {
    public final /* synthetic */ View a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WebView webView, j jVar, int i) {
        super(1);
        this.a = webView;
        this.b = jVar;
        this.c = i;
    }

    public final void a(Bitmap bitmap) {
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new h(this.a.getContext())).getValue())).d().execute(new l6m(this.b, bitmap, this.c));
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(j jVar, Bitmap bitmap, int i) {
        wzs wzsVar;
        wzs wzsVar2;
        try {
            Pair a = j.a(bitmap, i);
            int intValue = ((Number) a.d()).intValue();
            String str = (String) a.g();
            wzsVar2 = jVar.a;
            if (wzsVar2 != null) {
                wzsVar2.invoke(Integer.valueOf(intValue), str);
            }
        } catch (Throwable th) {
            try {
                boolean z = u.a;
                t.a("BlackScreenDetector", "Black screen detection failed", th);
                wzsVar = jVar.a;
                if (wzsVar != null) {
                    wzsVar.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                jVar.a = null;
            }
        }
    }
}
