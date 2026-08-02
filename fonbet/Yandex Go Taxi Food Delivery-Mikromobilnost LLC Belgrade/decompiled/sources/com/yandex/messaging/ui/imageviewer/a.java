package com.yandex.messaging.ui.imageviewer;

import android.app.Activity;
import defpackage.i3y;
import defpackage.nka1;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tzt;
import defpackage.x22;
import defpackage.xav;

/* loaded from: classes15.dex */
public final class a {
    public final Activity a;
    public final xav b;
    public final x22 c;
    public final i3y d = kotlin.a.a(new tzt(7, this));

    public a(Activity activity, xav xavVar, x22 x22Var) {
        this.a = activity;
        this.b = xavVar;
        this.c = x22Var;
    }

    public final pzt0 a(ImageViewerInfo imageViewerInfo, tls tlsVar, sls slsVar) {
        int width;
        int height;
        if (imageViewerInfo.getAnimated()) {
            width = -1;
            height = -1;
        } else {
            width = imageViewerInfo.getWidth();
            height = imageViewerInfo.getHeight();
        }
        return tje.N(nka1.c(this.a), null, null, new ImageSaver$save$2(this, imageViewerInfo, width, height, tlsVar, slsVar, null), 3);
    }
}
