package com.yandex.go.chargers.qr.ml_detector;

import android.media.Image;
import defpackage.l0x0;
import defpackage.sk7;
import defpackage.tls;
import defpackage.tzy0;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class a implements l0x0 {
    public final sk7 a;
    public final tls b;
    public final tzy0 c = new tzy0(75, new ChargersQrMlVisionDetector$detectWithInterval$1(1, this, a.class, "recognize", "recognize(Lkotlin/Pair;)V", 0));

    public a(sk7 sk7Var, tls tlsVar) {
        this.a = sk7Var;
        this.b = tlsVar;
    }

    @Override // defpackage.l0x0
    public final void a(Image image, int i) {
        this.c.a(new Pair(image, Integer.valueOf(i)));
    }
}
