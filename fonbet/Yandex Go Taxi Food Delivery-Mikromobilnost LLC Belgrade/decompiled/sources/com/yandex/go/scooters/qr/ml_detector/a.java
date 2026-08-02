package com.yandex.go.scooters.qr.ml_detector;

import android.media.Image;
import defpackage.bpo0;
import defpackage.gl;
import defpackage.l0x0;
import defpackage.tls;
import defpackage.tzy0;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class a implements l0x0 {
    public final gl a;
    public final tls b;
    public bpo0 c;
    public final tzy0 d = new tzy0(75, new ScootersQrMlVisionDetector$detectWithInterval$1(1, this, a.class, "recognize", "recognize(Lkotlin/Pair;)V", 0));

    public a(gl glVar, tls tlsVar, bpo0 bpo0Var) {
        this.a = glVar;
        this.b = tlsVar;
        this.c = bpo0Var;
    }

    @Override // defpackage.l0x0
    public final void a(Image image, int i) {
        bpo0 bpo0Var = this.c;
        if (bpo0Var != null) {
            this.c = null;
            bpo0Var.invoke();
        }
        this.d.a(new Pair(image, Integer.valueOf(i)));
    }
}
