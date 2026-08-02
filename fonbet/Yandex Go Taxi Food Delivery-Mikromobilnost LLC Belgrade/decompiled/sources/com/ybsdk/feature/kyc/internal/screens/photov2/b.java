package com.ybsdk.feature.kyc.internal.screens.photov2;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.kyc.internal.entities.SubmitException;
import com.ybsdk.feature.kyc.internal.entities.UploadException;
import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import defpackage.b64;
import defpackage.box;
import defpackage.c03;
import defpackage.cox;
import defpackage.df6;
import defpackage.dox;
import defpackage.ds31;
import defpackage.em3;
import defpackage.enx;
import defpackage.eox;
import defpackage.fox;
import defpackage.g5;
import defpackage.g8e;
import defpackage.gox;
import defpackage.if8;
import defpackage.iox;
import defpackage.jl40;
import defpackage.jox;
import defpackage.kox;
import defpackage.l8x;
import defpackage.lox;
import defpackage.lrp0;
import defpackage.mox;
import defpackage.ny61;
import defpackage.opx;
import defpackage.pnx;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qnx;
import defpackage.qya0;
import defpackage.rnx;
import defpackage.scc;
import defpackage.snx;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tnx;
import defpackage.to7;
import defpackage.uc5;
import defpackage.vix;
import defpackage.vox;
import defpackage.w511;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.yhl;
import defpackage.ynx;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final KycPhotoV2Params B;
    public final tfl0 C;
    public final Context D;
    public final com.ybsdk.feature.kyc.internal.interactor.a E;
    public final opx F;
    public final g5 G;
    public final AppAnalyticsReporter H;
    public final df6 I;
    public boolean J;
    public final a K;
    public final mox L;

    public b(KycPhotoV2Params kycPhotoV2Params, tfl0 tfl0Var, Context context, com.ybsdk.feature.kyc.internal.interactor.a aVar, opx opxVar, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter, df6 df6Var, vox voxVar) {
        super(new vix(6), voxVar);
        this.B = kycPhotoV2Params;
        this.C = tfl0Var;
        this.D = context;
        this.E = aVar;
        this.F = opxVar;
        this.G = g5Var;
        this.H = appAnalyticsReporter;
        this.I = df6Var;
        this.K = new a(this);
        this.L = new mox(0, this);
        appAnalyticsReporter.F.a.a("kyc_online_2.photo.start_loader.open", null);
        e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v9, types: [l8x] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l8x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, Uri uri, ContinuationImpl continuationImpl) {
        KycPhotoV2ViewModel$uploadPhoto$1 kycPhotoV2ViewModel$uploadPhoto$1;
        int i;
        r0 r0Var;
        Object value;
        pzt0 pzt0Var;
        Object obj;
        Throwable a;
        Uri uri2;
        pzt0 pzt0Var2;
        Throwable th;
        r0 r0Var2;
        Object value2;
        boolean z;
        KycPhotoV2State$Stage$Upload$Status kycPhotoV2State$Stage$Upload$Status;
        pz40 Y;
        r0 r0Var3;
        Object value3;
        Uri uri3 = uri;
        AppAnalyticsReporter appAnalyticsReporter = bVar.H;
        if (continuationImpl instanceof KycPhotoV2ViewModel$uploadPhoto$1) {
            kycPhotoV2ViewModel$uploadPhoto$1 = (KycPhotoV2ViewModel$uploadPhoto$1) continuationImpl;
            int i2 = kycPhotoV2ViewModel$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycPhotoV2ViewModel$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = kycPhotoV2ViewModel$uploadPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycPhotoV2ViewModel$uploadPhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    appAnalyticsReporter.F.a.a("kyc_online_2.photo.loading", x4e.t(2, "page_index", m0(((gox) bVar.X()).c), "application_id", bVar.B.getApplicationId()));
                    pz40 Y2 = bVar.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, gox.a((gox) value, false, null, new eox(KycPhotoV2State$Stage$Upload$Status.ACTIVE, uri3), null, false, null, 119)));
                    pzt0 N = tje.N(ds31.a(bVar), null, null, new KycPhotoV2ViewModel$uploadPhoto$statusUpdateJob$1(bVar, uri3, null), 3);
                    KycPhotoV2ViewModel$uploadPhoto$3 kycPhotoV2ViewModel$uploadPhoto$3 = new KycPhotoV2ViewModel$uploadPhoto$3(bVar, ((gox) bVar.X()).c, null);
                    kycPhotoV2ViewModel$uploadPhoto$1.L$0 = uri3;
                    kycPhotoV2ViewModel$uploadPhoto$1.L$1 = N;
                    kycPhotoV2ViewModel$uploadPhoto$1.label = 1;
                    Object a2 = d.a(bVar, kycPhotoV2ViewModel$uploadPhoto$3, kycPhotoV2ViewModel$uploadPhoto$1);
                    if (a2 != coroutineSingletons) {
                        pzt0Var = N;
                        obj = a2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) kycPhotoV2ViewModel$uploadPhoto$1.L$3;
                    ?? r5 = (l8x) kycPhotoV2ViewModel$uploadPhoto$1.L$1;
                    uri2 = (Uri) kycPhotoV2ViewModel$uploadPhoto$1.L$0;
                    kotlin.b.b(obj2);
                    pzt0Var2 = r5;
                    z = th instanceof SubmitException;
                    if (z) {
                        appAnalyticsReporter.F.a.a("kyc_online_2.photo.load.error", g8e.w(1, "page_index", m0(((gox) bVar.X()).c)));
                    } else {
                        appAnalyticsReporter.F.a.a("kyc_online_2.photo.validate.error", g8e.w(1, "page_index", m0(((gox) bVar.X()).c)));
                    }
                    x4c.g("[KYC_Online] Failed to take upload photo", th, null, Collections.singletonList(lrp0.o), 4);
                    kycPhotoV2State$Stage$Upload$Status = (!z || (th instanceof UploadException)) ? KycPhotoV2State$Stage$Upload$Status.ERROR_UPLOAD : KycPhotoV2State$Stage$Upload$Status.ERROR_GENERAL;
                    Y = bVar.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, gox.a((gox) value3, false, null, new eox(kycPhotoV2State$Stage$Upload$Status, uri2), null, false, null, 119)));
                    pzt0Var = pzt0Var2;
                    pzt0Var.a(null);
                    return zy11.a;
                }
                ?? r1 = (l8x) kycPhotoV2ViewModel$uploadPhoto$1.L$1;
                Uri uri4 = (Uri) kycPhotoV2ViewModel$uploadPhoto$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                pzt0Var = r1;
                uri3 = uri4;
                if (!(obj instanceof Result.Failure)) {
                    bVar.H.F.a.a("kyc_online_2.photo.ok", g8e.w(1, "page_index", m0(((gox) bVar.X()).c)));
                    pz40 Y3 = bVar.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, gox.a((gox) value2, false, null, new box(uri3), null, false, null, 119)));
                    tje.N(ds31.a(bVar), null, null, new KycPhotoV2ViewModel$onUploadSuccess$2(bVar, null), 3);
                }
                a = Result.a(obj);
                if (a != null) {
                    kycPhotoV2ViewModel$uploadPhoto$1.L$0 = uri3;
                    kycPhotoV2ViewModel$uploadPhoto$1.L$1 = pzt0Var;
                    kycPhotoV2ViewModel$uploadPhoto$1.L$2 = obj;
                    kycPhotoV2ViewModel$uploadPhoto$1.L$3 = a;
                    kycPhotoV2ViewModel$uploadPhoto$1.label = 2;
                    if (kotlinx.coroutines.a.i(300L, kycPhotoV2ViewModel$uploadPhoto$1) != coroutineSingletons) {
                        uri2 = uri3;
                        pzt0Var2 = pzt0Var;
                        th = a;
                        z = th instanceof SubmitException;
                        if (z) {
                        }
                        x4c.g("[KYC_Online] Failed to take upload photo", th, null, Collections.singletonList(lrp0.o), 4);
                        if (z) {
                        }
                        Y = bVar.Y();
                        do {
                            r0Var3 = (r0) Y;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, gox.a((gox) value3, false, null, new eox(kycPhotoV2State$Stage$Upload$Status, uri2), null, false, null, 119)));
                        pzt0Var = pzt0Var2;
                    }
                    return coroutineSingletons;
                }
                pzt0Var.a(null);
                return zy11.a;
            }
        }
        kycPhotoV2ViewModel$uploadPhoto$1 = new KycPhotoV2ViewModel$uploadPhoto$1(bVar, continuationImpl);
        Object obj22 = kycPhotoV2ViewModel$uploadPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycPhotoV2ViewModel$uploadPhoto$1.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        pzt0Var.a(null);
        return zy11.a;
    }

    public static String m0(tnx tnxVar) {
        if (tnxVar == null) {
            return "";
        }
        if (tnxVar.equals(qnx.b)) {
            return "first_page";
        }
        if (tnxVar.equals(snx.b)) {
            return "selfie_passport";
        }
        if (tnxVar.equals(rnx.b) || (tnxVar instanceof pnx)) {
            yhl.d(tnxVar, "Unsupported photo type ");
            return null;
        }
        w511.b();
        return null;
    }

    public final to7 c0() {
        return this.K;
    }

    public final qya0 d0() {
        return this.L;
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, null, null, false, null, 63)));
        tje.N(ds31.a(this), null, null, new KycPhotoV2ViewModel$loadApplicationInfo$2(this, null), 3);
    }

    public final void f0(KycBottomSheetContent$Type kycBottomSheetContent$Type) {
        int i = lox.a[kycBottomSheetContent$Type.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.H;
        if (i == 1) {
            em3 em3Var = appAnalyticsReporter.F;
            em3Var.a.a("kyc_online_2.photo.help.ok.click", g8e.w(1, "page_index", m0(((gox) X()).c)));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            em3 em3Var2 = appAnalyticsReporter.F;
            em3Var2.a.a("kyc_online_2.photo.exit.no.click", g8e.w(1, "page_index", m0(((gox) X()).c)));
        }
    }

    public final void g0() {
        em3 em3Var = this.H.F;
        em3Var.a.a("kyc_online_2.photo.exit.yes.click", g8e.w(1, "page_index", m0(((gox) X()).c)));
        this.C.e();
    }

    public final void h0(boolean z) {
        if (!this.J || z == ((gox) X()).f) {
            return;
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            boolean z2 = z;
            if (r0Var.k(value, gox.a((gox) value, false, null, null, null, z2, null, 95))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void i0() {
        em3 em3Var = this.H.F;
        em3Var.a.a("kyc_online_2.photo.take_photo.click", g8e.w(1, "page_index", m0(((gox) X()).c)));
        fox foxVar = ((gox) X()).d;
        if (foxVar instanceof eox) {
            return;
        }
        if (!(foxVar instanceof dox) && !(foxVar instanceof cox)) {
            if (foxVar instanceof box) {
                k0(((gox) X()).e);
                return;
            } else {
                w511.b();
                return;
            }
        }
        tnx tnxVar = ((gox) X()).c;
        if (tnxVar == null) {
            x4c.g("[KYC_Online] Attempted to capture a picture without specifying photo type", null, null, Collections.singletonList(lrp0.o), 6);
            return;
        }
        File n0 = n0(tnxVar);
        if (((gox) X()).b && jl40.l(((gox) X()).c, snx.b)) {
            Z(new jox(true));
        }
        Z(new kox(n0, ((gox) X()).b));
    }

    public final void j0() {
        r0 r0Var;
        Object value;
        boolean z = !((gox) X()).b;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, z, null, null, null, false, null, HProv.PP_DELETE_KEYSET)));
    }

    public final void k0(c03 c03Var) {
        enx a;
        ArrayList arrayList = c03Var.d;
        tnx tnxVar = ((gox) X()).c;
        int indexOf = tnxVar == null ? 0 : arrayList.indexOf(tnxVar) + 1;
        if (tnxVar != null && indexOf > 0) {
            try {
                n0(tnxVar).delete();
                o0(tnxVar).delete();
            } catch (Throwable unused) {
            }
        }
        if (indexOf > scc.f(arrayList)) {
            this.G.a(((if8) this.F).a.e().getUploadSuccessDeeplink());
            return;
        }
        tnx tnxVar2 = (tnx) arrayList.get(indexOf);
        this.H.F.a.a("kyc_online_2.photo.open", g8e.w(1, "page_index", m0(tnxVar2)));
        if (jl40.l(tnxVar2, snx.b) && (a = this.I.a(tnxVar2)) != null) {
            Z(new iox(a));
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            c03 c03Var2 = c03Var;
            if (r0Var.k(value, gox.a((gox) value, false, (tnx) arrayList.get(indexOf), cox.a, c03Var2, false, null, 99))) {
                return;
            } else {
                c03Var = c03Var2;
            }
        }
    }

    public final void l0(Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("[KYC_Online] Failed to fetch application info", th, null, Collections.singletonList(lrp0.o), 4);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, null, null, false, new ynx(th), 63)));
    }

    public final File n0(tnx tnxVar) {
        return new File(this.D.getCacheDir(), b64.j(tnxVar.a, ".jpg"));
    }

    public final File o0(tnx tnxVar) {
        return new File(this.D.getCacheDir(), b64.j(tnxVar.a, "_SCALED.jpg"));
    }
}
