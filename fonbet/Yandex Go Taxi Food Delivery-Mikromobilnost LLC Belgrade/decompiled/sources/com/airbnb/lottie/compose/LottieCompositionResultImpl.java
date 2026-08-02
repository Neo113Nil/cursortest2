package com.airbnb.lottie.compose;

import androidx.compose.runtime.f;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.nsz;
import defpackage.oz40;
import defpackage.qxi;
import defpackage.sls;
import defpackage.usz;

/* loaded from: classes10.dex */
public final class LottieCompositionResultImpl implements usz {
    public final fyc a = gwk0.b();
    public final oz40 b = f.j(null);
    public final oz40 c = f.j(null);
    public final qxi w;
    public final qxi x;

    public LottieCompositionResultImpl() {
        f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(((nsz) LottieCompositionResultImpl.this.b.getValue()) == null && ((Throwable) LottieCompositionResultImpl.this.c.getValue()) == null);
            }
        });
        this.w = f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf((((nsz) LottieCompositionResultImpl.this.b.getValue()) == null && ((Throwable) LottieCompositionResultImpl.this.c.getValue()) == null) ? false : true);
            }
        });
        f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(((Throwable) LottieCompositionResultImpl.this.c.getValue()) != null);
            }
        });
        this.x = f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(((nsz) LottieCompositionResultImpl.this.b.getValue()) != null);
            }
        });
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return (nsz) this.b.getValue();
    }
}
