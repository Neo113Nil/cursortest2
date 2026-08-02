package com.yandex.go.masstransit.sdk.camera.ml;

import android.media.Image;
import android.os.SystemClock;
import defpackage.m0x0;
import defpackage.tls;
import defpackage.uzy0;
import defpackage.ycg0;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class c implements m0x0 {
    public final ycg0 a;
    public final tls b;
    public final uzy0 c = new uzy0(new QrMlVisionDetector$detectWithInterval$1(1, this, c.class, "recognize", "recognize(Lkotlin/Pair;)V", 0));

    public c(ycg0 ycg0Var, tls tlsVar) {
        this.a = ycg0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.m0x0
    public final void a(Image image, int i) {
        uzy0 uzy0Var = this.c;
        Pair pair = new Pair(image, Integer.valueOf(i));
        uzy0Var.getClass();
        if (SystemClock.uptimeMillis() - uzy0Var.b >= 75) {
            uzy0Var.b = SystemClock.uptimeMillis();
            ((QrMlVisionDetector$detectWithInterval$1) uzy0Var.a).invoke(pair);
        }
    }
}
