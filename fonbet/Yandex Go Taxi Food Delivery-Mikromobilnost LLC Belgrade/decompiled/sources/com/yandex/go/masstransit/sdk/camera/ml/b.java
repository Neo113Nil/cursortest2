package com.yandex.go.masstransit.sdk.camera.ml;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.f;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.camera.view.BaseCameraPreview;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import defpackage.co7;
import defpackage.dab1;
import defpackage.dfb1;
import defpackage.fr7;
import defpackage.g320;
import defpackage.i3y;
import defpackage.i5f0;
import defpackage.m0x0;
import defpackage.noh;
import defpackage.qp7;
import defpackage.tje;
import defpackage.tse;
import defpackage.v5a1;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class b {
    public final BaseCameraPreview a;
    public final tse b;
    public volatile boolean c;
    public m0x0 d = dab1.I;
    public final noh e;
    public final fr7 f;
    public f g;
    public final i3y h;
    public co7 i;

    public b(Context context, MtQRCameraPreview mtQRCameraPreview, tse tseVar) {
        this.a = mtQRCameraPreview;
        this.b = tseVar;
        i5f0 i5f0Var = i5f0.b;
        this.e = dfb1.c(v5a1.c(context));
        this.f = new fr7();
        this.h = kotlin.a.a(new g320(27));
    }

    public final void a() {
        this.c = false;
        this.d = dab1.I;
        this.f.a.i(Lifecycle.State.DESTROYED);
        this.a.detachPreview();
        f fVar = this.g;
        if (fVar != null) {
            fVar.H();
        }
        this.g = null;
        ((ExecutorService) this.h.getValue()).shutdown();
        this.i = null;
    }

    public final void b(boolean z) {
        qp7 b;
        co7 co7Var = this.i;
        if (co7Var == null || (b = co7Var.b()) == null) {
            return;
        }
        b.f(z);
    }

    public final void c(Size size) {
        this.f.a.i(Lifecycle.State.RESUMED);
        if (this.c) {
            return;
        }
        this.c = true;
        tje.N(this.b, null, null, new MlCameraController$start$1(size, this, null), 3);
    }
}
