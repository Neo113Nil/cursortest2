package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.entities.SubmitException;
import com.ybsdk.feature.kyc.internal.entities.SubmitV2Exception;
import com.ybsdk.feature.kyc.internal.entities.UploadException;
import defpackage.ajb0;
import defpackage.akb0;
import defpackage.b64;
import defpackage.dia0;
import defpackage.ds31;
import defpackage.g5;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k801;
import defpackage.l8x;
import defpackage.lrp0;
import defpackage.mox;
import defpackage.ny61;
import defpackage.opx;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qib0;
import defpackage.qjb0;
import defpackage.qq7;
import defpackage.qya0;
import defpackage.rib0;
import defpackage.rjb0;
import defpackage.scc;
import defpackage.snx;
import defpackage.sr7;
import defpackage.tfl0;
import defpackage.tib0;
import defpackage.tje;
import defpackage.tls;
import defpackage.to7;
import defpackage.uc5;
import defpackage.vib0;
import defpackage.w511;
import defpackage.wib0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.xib0;
import defpackage.yib0;
import defpackage.z4b0;
import defpackage.zib0;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final PhotoParams B;
    public final tfl0 C;
    public final Context D;
    public final com.ybsdk.feature.kyc.internal.interactor.a E;
    public final opx F;
    public final g5 G;
    public final AppAnalyticsReporter H;
    public boolean I;
    public final a J;
    public final mox K;

    public b(PhotoParams photoParams, tfl0 tfl0Var, Context context, com.ybsdk.feature.kyc.internal.interactor.a aVar, opx opxVar, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter, akb0 akb0Var) {
        super(new z4b0(16), akb0Var);
        this.B = photoParams;
        this.C = tfl0Var;
        this.D = context;
        this.E = aVar;
        this.F = opxVar;
        this.G = g5Var;
        this.H = appAnalyticsReporter;
        this.J = new a(this);
        this.K = new mox(3, this);
        c0();
    }

    public static final void b0(b bVar, Throwable th, Uri uri) {
        PhotoState$Stage$Upload$Status photoState$Stage$Upload$Status;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        bVar.getClass();
        x4c.g("[DOCUMENTS_CAMERA] Failed to submit photo", th, null, Collections.singletonList(lrp0.i), 4);
        if ((th instanceof SubmitException) || (th instanceof UploadException)) {
            photoState$Stage$Upload$Status = PhotoState$Stage$Upload$Status.ERROR_UPLOAD;
        } else {
            if (th instanceof SubmitV2Exception) {
                pz40 Y = bVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, ajb0.a((ajb0) value2, false, null, null, null, null, false, new tib0(((SubmitV2Exception) th).getOriginalException()), HProv.PP_VERSION_TIMESTAMP)));
                return;
            }
            photoState$Stage$Upload$Status = PhotoState$Stage$Upload$Status.ERROR_GENERAL;
        }
        pz40 Y2 = bVar.Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, new yib0(photoState$Stage$Upload$Status, uri), null, null, false, null, 247)));
    }

    public static void i0(b bVar, ArrayList arrayList, Uri uri, int i) {
        r0 r0Var;
        Object value;
        ajb0 ajb0Var;
        if ((i & 1) != 0) {
            qib0 qib0Var = ((ajb0) bVar.X()).e;
            arrayList = qib0Var != null ? qib0Var.a : null;
        }
        if ((i & 2) != 0) {
            uri = Uri.EMPTY;
        }
        sr7 sr7Var = ((ajb0) bVar.X()).c;
        int indexOf = sr7Var == null ? 0 : arrayList.indexOf(sr7Var) + 1;
        if (sr7Var != null && indexOf > 0) {
            try {
                bVar.k0(sr7Var).delete();
                bVar.l0(sr7Var).delete();
            } catch (Throwable unused) {
            }
        }
        if (indexOf > scc.f(arrayList)) {
            tje.N(ds31.a(bVar), null, null, new PhotoViewModel$submitPhotos$1(bVar, ((ajb0) bVar.X()).e, uri, null), 3);
            return;
        }
        sr7 sr7Var2 = (sr7) arrayList.get(indexOf);
        bVar.H.j.a.a("camera_flow.photo.open", g8e.w(1, "document_type", sr7Var2.a.a));
        bVar.G.a(sr7Var2.h);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            ajb0Var = (ajb0) value;
        } while (!r0Var.k(value, ajb0.a(ajb0Var, false, (sr7) arrayList.get(indexOf), wib0.a, ajb0Var.e, null, false, null, 227)));
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        qq7 qq7Var = this.H.j;
        PhotoParams photoParams = this.B;
        String applicationId = photoParams.getApplicationId();
        String applicationType = photoParams.getApplicationType();
        String documentGroup = photoParams.getDocumentGroup();
        LinkedHashMap t = x4e.t(3, "application_type", applicationType, "application_id", applicationId);
        if (documentGroup != null) {
            t.put("document_group", documentGroup);
        }
        qq7Var.a.a("camera_flow.start_loader.open", t);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, null, false, null, HProv.PP_VERSION_TIMESTAMP)));
        tje.N(ds31.a(this), null, null, new PhotoViewModel$documentsInit$2(this, null), 3);
    }

    public final to7 d0() {
        return this.J;
    }

    public final qya0 e0() {
        return this.K;
    }

    public final void f0(boolean z) {
        if (!this.I || z == ((ajb0) X()).g) {
            return;
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            boolean z2 = z;
            if (r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, null, z2, null, 191))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void g0() {
        String str;
        zib0 zib0Var = ((ajb0) X()).d;
        if (zib0Var instanceof yib0) {
            return;
        }
        if (!(zib0Var instanceof xib0) && !(zib0Var instanceof wib0)) {
            if (zib0Var instanceof vib0) {
                i0(this, null, null, 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        sr7 sr7Var = ((ajb0) X()).c;
        if (sr7Var == null) {
            x4c.g("[DOCUMENTS_CAMERA] Attempted to capture a picture without specifying photo type", null, null, Collections.singletonList(lrp0.i), 6);
            return;
        }
        File k0 = k0(sr7Var);
        sr7 sr7Var2 = ((ajb0) X()).c;
        if (sr7Var2 != null && (str = sr7Var2.a.a) != null) {
            this.H.j.a.a("camera_flow.photo.take_photo.click", g8e.w(1, "document_type", str));
        }
        if (((ajb0) X()).b && jl40.l(((ajb0) X()).c, snx.b)) {
            Z(new qjb0(true));
        }
        Z(new rjb0(k0, ((ajb0) X()).b));
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        boolean z = !((ajb0) X()).b;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, z, null, null, null, null, false, null, 253)));
    }

    public final void j0(Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("[DOCUMENTS_CAMERA] Failed to fetch application info", th, null, Collections.singletonList(lrp0.i), 4);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, null, false, new rib0(th), HProv.PP_VERSION_TIMESTAMP)));
    }

    public final File k0(sr7 sr7Var) {
        return new File(this.D.getCacheDir(), b64.j(sr7Var.a.a, ".jpg"));
    }

    public final File l0(sr7 sr7Var) {
        return new File(this.D.getCacheDir(), b64.j(sr7Var.a.a, "_SCALED.jpg"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(Uri uri, boolean z, ContinuationImpl continuationImpl) {
        PhotoViewModel$uploadPhoto$1 photoViewModel$uploadPhoto$1;
        int i;
        l8x l8xVar;
        b bVar = this;
        Uri uri2 = uri;
        if (continuationImpl instanceof PhotoViewModel$uploadPhoto$1) {
            photoViewModel$uploadPhoto$1 = (PhotoViewModel$uploadPhoto$1) continuationImpl;
            int i2 = photoViewModel$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                photoViewModel$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                PhotoViewModel$uploadPhoto$1 photoViewModel$uploadPhoto$12 = photoViewModel$uploadPhoto$1;
                Object obj = photoViewModel$uploadPhoto$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = photoViewModel$uploadPhoto$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = bVar.Y();
                    while (true) {
                        r0 r0Var = (r0) Y;
                        Object value = r0Var.getValue();
                        if (r0Var.k(value, ajb0.a((ajb0) value, false, null, new yib0(PhotoState$Stage$Upload$Status.ACTIVE, uri2), null, null, false, null, 247))) {
                            break;
                        }
                        bVar = this;
                        uri2 = uri;
                    }
                    pzt0 N = tje.N(ds31.a(bVar), null, null, new PhotoViewModel$uploadPhoto$statusUpdateJob$1(bVar, uri2, null), 3);
                    sr7 sr7Var = ((ajb0) bVar.X()).c;
                    qq7 qq7Var = bVar.H.j;
                    qq7Var.a.a("camera_flow.photo.loading", g8e.w(1, "document_type", sr7Var.a.a));
                    tls dia0Var = new dia0(26);
                    wls photoViewModel$uploadPhoto$4 = new PhotoViewModel$uploadPhoto$4(bVar, sr7Var, uri2, z, N, null);
                    photoViewModel$uploadPhoto$12.L$0 = N;
                    photoViewModel$uploadPhoto$12.label = 1;
                    if (B(sr7Var, new k801(25), dia0Var, photoViewModel$uploadPhoto$4, photoViewModel$uploadPhoto$12) == obj2) {
                        return obj2;
                    }
                    l8xVar = N;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l8xVar = (l8x) photoViewModel$uploadPhoto$12.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                l8xVar.a(null);
                return zy11.a;
            }
        }
        photoViewModel$uploadPhoto$1 = new PhotoViewModel$uploadPhoto$1(bVar, continuationImpl);
        PhotoViewModel$uploadPhoto$1 photoViewModel$uploadPhoto$122 = photoViewModel$uploadPhoto$1;
        Object obj3 = photoViewModel$uploadPhoto$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoViewModel$uploadPhoto$122.label;
        if (i != 0) {
        }
        l8xVar.a(null);
        return zy11.a;
    }
}
