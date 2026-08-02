package com.ybsdk.feature.kyc.internal.screens.photov2;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import defpackage.dox;
import defpackage.ds31;
import defpackage.gox;
import defpackage.jox;
import defpackage.lrp0;
import defpackage.pz40;
import defpackage.tje;
import defpackage.to7;
import defpackage.x4c;
import defpackage.znx;
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
        x4c.g("[KYC_Online] Failed to init camera", exc, null, Collections.singletonList(lrp0.o), 4);
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, null, null, false, new znx(exc), 63)));
    }

    @Override // defpackage.to7
    public final void c() {
        r0 r0Var;
        Object value;
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, null, null, false, null, HProv.PP_DELETE_SAVED_PASSWD)));
    }

    @Override // defpackage.to7
    public final void e(ImageCaptureException imageCaptureException) {
        r0 r0Var;
        Object value;
        x4c.g("[KYC_Online] Failed to take picture", imageCaptureException, null, Collections.singletonList(lrp0.o), 4);
        pz40 Y = this.a.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, dox.a, null, false, null, 119)));
    }

    @Override // defpackage.to7
    public final void f(Uri uri) {
        jox joxVar = new jox(false);
        b bVar = this.a;
        bVar.Z(joxVar);
        if (uri == null) {
            x4c.g("[KYC_Online] Photo is saved but uri is missing", null, null, Collections.singletonList(lrp0.o), 6);
        } else {
            tje.N(ds31.a(bVar), null, null, new KycPhotoV2ViewModel$savePhoto$1(bVar, uri, null), 3);
        }
    }
}
