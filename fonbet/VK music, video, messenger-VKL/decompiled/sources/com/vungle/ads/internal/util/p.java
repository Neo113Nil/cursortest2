package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.j1;
import com.vungle.ads.internal.n1;
import java.util.concurrent.Executor;
import xsna.brm0;
import xsna.izs;
import xsna.x6q;

/* loaded from: classes7.dex */
public final class p {
    public static final p b = new p();
    public Executor a;

    public final void a(com.vungle.ads.internal.executor.j jVar) {
        this.a = jVar;
    }

    public final void a(String str, j1 j1Var) {
        if (this.a == null) {
            boolean z = u.a;
            t.c(TtmlNode.TAG_P, "ImageLoader not initialized.");
        } else if (str.length() == 0) {
            boolean z2 = u.a;
            t.c(TtmlNode.TAG_P, "the uri is required.");
        } else {
            Executor executor = this.a;
            if (executor != null) {
                executor.execute(new x6q(7, str, j1Var));
            }
        }
    }

    public static final void a(String str, izs izsVar) {
        if (brm0.B(str, "file://", false)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str.substring(7));
            if (decodeFile != null) {
                izsVar.invoke(decodeFile);
            } else {
                boolean z = u.a;
                t.c(TtmlNode.TAG_P, "decode bitmap failed.");
            }
        }
    }

    public static void a(String str, n1 n1Var) {
        if (str.length() == 0 || !brm0.B(str, "file://", false)) {
            boolean z = u.a;
            t.c(TtmlNode.TAG_P, "the valid uri is required.");
            return;
        }
        String substring = str.substring(7);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(substring, options);
        n1Var.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
