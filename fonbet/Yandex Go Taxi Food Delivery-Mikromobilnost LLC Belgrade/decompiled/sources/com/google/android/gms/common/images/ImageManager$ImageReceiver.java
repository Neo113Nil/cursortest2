package com.google.android.gms.common.images;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.internal.base.zau;
import defpackage.q0b1;
import defpackage.qz81;
import defpackage.yav;
import java.util.ArrayList;

/* loaded from: classes11.dex */
final class ImageManager$ImageReceiver extends ResultReceiver {
    final /* synthetic */ yav zaa;
    private final Uri zab;
    private final ArrayList zac;

    public ImageManager$ImageReceiver(yav yavVar, Uri uri) {
        super(new zau(Looper.getMainLooper()));
        this.zab = uri;
        this.zac = new ArrayList();
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        Object obj = yav.a;
        throw null;
    }

    public final void zab(qz81 qz81Var) {
        q0b1.b("ImageReceiver.addImageRequest() must be called in the main thread");
        this.zac.add(qz81Var);
    }

    public final void zac(qz81 qz81Var) {
        q0b1.b("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.zac.remove(qz81Var);
    }

    public final void zad() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.extras.uri", this.zab);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        Object obj = yav.a;
        throw null;
    }
}
