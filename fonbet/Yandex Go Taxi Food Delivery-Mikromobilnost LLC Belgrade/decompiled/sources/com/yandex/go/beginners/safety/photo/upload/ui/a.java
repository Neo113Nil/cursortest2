package com.yandex.go.beginners.safety.photo.upload.ui;

import android.net.Uri;
import com.yandex.go.beginners.safety.photo.upload.domain.model.SafetyPhotoUploadScreenState$Type;
import defpackage.lxl0;
import defpackage.ohb0;
import defpackage.pzt0;
import defpackage.qxl0;
import defpackage.rq21;
import defpackage.rxl0;
import defpackage.tje;
import defpackage.tse;
import java.io.File;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.beginners.safety.photo.domain.b a;
    public final rq21 b;
    public pzt0 c;
    public pzt0 d;
    public volatile long e = 1000;
    public volatile long f = 1000;

    public a(com.yandex.go.beginners.safety.photo.domain.b bVar, rq21 rq21Var) {
        this.a = bVar;
        this.b = rq21Var;
    }

    public final void a(tse tseVar, ohb0 ohb0Var, lxl0 lxl0Var, rxl0 rxl0Var) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = null;
        pzt0 pzt0Var2 = this.d;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.d = null;
        Uri.Builder buildUpon = ohb0Var.a.buildUpon();
        rq21 rq21Var = this.b;
        rq21Var.getClass();
        File file = new File(rq21Var.a.getCacheDir(), "user_photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "user_photo.jpg");
        Long valueOf = file2.exists() ? Long.valueOf(file2.lastModified()) : null;
        Uri build = buildUpon.appendQueryParameter("v", valueOf != null ? String.valueOf(valueOf.longValue()) : null).build();
        r0 r0Var = rxl0Var.a;
        qxl0 qxl0Var = new qxl0(SafetyPhotoUploadScreenState$Type.LOADING, build, null);
        r0Var.getClass();
        r0Var.m(null, qxl0Var);
        this.c = tje.N(tseVar, null, null, new SafetyPhotoUploadUiActionHandler$startUpload$1(this, build, ohb0Var, tseVar, lxl0Var, rxl0Var, null), 3);
    }
}
