package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import defpackage.ajb0;
import defpackage.ds31;
import defpackage.lrp0;
import defpackage.pz40;
import defpackage.qjb0;
import defpackage.sib0;
import defpackage.tje;
import defpackage.to7;
import defpackage.x4c;
import defpackage.xib0;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class a implements to7 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.to7
    public final void b(Exception exc) {
        r0 r0Var;
        Object value;
        x4c.g("[DOCUMENTS_CAMERA] Failed to init camera", exc, null, Collections.singletonList(lrp0.i), 4);
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, null, false, new sib0(exc), HProv.PP_VERSION_TIMESTAMP)));
    }

    @Override // defpackage.to7
    public final void c() {
        r0 r0Var;
        Object value;
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, null, false, null, 254)));
    }

    @Override // defpackage.to7
    public final void e(ImageCaptureException imageCaptureException) {
        r0 r0Var;
        Object value;
        x4c.g("[DOCUMENTS_CAMERA] Failed to take picture", imageCaptureException, null, Collections.singletonList(lrp0.i), 4);
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, xib0.a, null, null, false, null, 247)));
    }

    @Override // defpackage.to7
    public final void f(Uri uri) {
        qjb0 qjb0Var = new qjb0(false);
        b bVar = this.a;
        bVar.Z(qjb0Var);
        if (uri == null) {
            x4c.g("[DOCUMENTS_CAMERA] Photo is saved but uri is missing", null, null, Collections.singletonList(lrp0.i), 6);
        } else {
            tje.N(ds31.a(bVar), null, null, new PhotoViewModel$savePhoto$1(bVar, uri, null), 3);
        }
    }
}
