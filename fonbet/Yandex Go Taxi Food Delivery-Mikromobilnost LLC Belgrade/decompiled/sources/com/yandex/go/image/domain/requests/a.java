package com.yandex.go.image.domain.requests;

import android.graphics.Bitmap;
import defpackage.d1k;
import defpackage.g18;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class a implements g18 {
    public final d1k a;

    public a(d1k d1kVar) {
        this.a = d1kVar;
    }

    public final Bitmap a() {
        return (Bitmap) tje.Y(EmptyCoroutineContext.a, new CoilBitmapRequest$SubmitResultImpl$waitForBitmap$1(this, null));
    }

    @Override // defpackage.g18
    public final void cancel() {
        this.a.dispose();
    }
}
