package com.airbnb.lottie.compose;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.e530;
import defpackage.n8e;
import defpackage.p8e;
import defpackage.rzo;
import defpackage.tls;
import defpackage.v0y;
import defpackage.x910;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class b extends e530 implements v0y {
    public int a;
    public int b;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        long a;
        long d = p8e.d(j, rzo.h(this.a, this.b));
        if (n8e.h(j) == Integer.MAX_VALUE && n8e.i(j) != Integer.MAX_VALUE) {
            int i = (int) (d >> 32);
            int i2 = (this.b * i) / this.a;
            a = p8e.a(i, i, i2, i2);
        } else if (n8e.i(j) != Integer.MAX_VALUE || n8e.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (d >> 32);
            int i4 = (int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            a = p8e.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i6 = (this.a * i5) / this.b;
            a = p8e.a(i6, i6, i5, i5);
        }
        final o l0 = x910Var.l0(a);
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.o((o.a) obj, o.this, 0, 0);
                return zy11.a;
            }
        });
    }
}
