package com.ybsdk.feature.kyc.internal.screens.photo;

import android.content.Context;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlineLocationRequestResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.api.KycGeoRequest;
import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import com.ybsdk.rconfig.model.ThemedImage;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import defpackage.b64;
import defpackage.b9z;
import defpackage.bpx;
import defpackage.cyg0;
import defpackage.dpx;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.em3;
import defpackage.epx;
import defpackage.ffx;
import defpackage.g5;
import defpackage.h2t;
import defpackage.if8;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.krc;
import defpackage.mdh;
import defpackage.mox;
import defpackage.mpx;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.onx;
import defpackage.opx;
import defpackage.pnx;
import defpackage.ppx;
import defpackage.pz40;
import defpackage.qke;
import defpackage.qnx;
import defpackage.qpx;
import defpackage.qya0;
import defpackage.rnx;
import defpackage.rpx;
import defpackage.scc;
import defpackage.sjh;
import defpackage.snx;
import defpackage.spx;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tnx;
import defpackage.to7;
import defpackage.tr7;
import defpackage.u6z;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.urc;
import defpackage.uyj;
import defpackage.vix;
import defpackage.vrc;
import defpackage.w511;
import defpackage.x43;
import defpackage.x4c;
import defpackage.ybz;
import defpackage.zox;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public static final urc S = new urc(0, kp50.r(31), 0, 0);
    public static final int T = kp50.r(186);
    public final KycPhotoParams B;
    public final tfl0 C;
    public final Context D;
    public final com.ybsdk.feature.kyc.internal.interactor.a E;
    public final opx F;
    public final ybz G;
    public final g5 H;
    public final AppAnalyticsReporter I;
    public final x43 J;
    public u6z K;
    public ArrayList L;
    public final ArrayList M;
    public boolean N;
    public final n0 O;
    public final h2t P;
    public final mox Q;
    public final a R;

    public b(KycPhotoParams kycPhotoParams, tfl0 tfl0Var, Context context, com.ybsdk.feature.kyc.internal.interactor.a aVar, opx opxVar, ybz ybzVar, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter, mpx mpxVar) {
        super(new vix(7), mpxVar);
        this.B = kycPhotoParams;
        this.C = tfl0Var;
        this.D = context;
        this.E = aVar;
        this.F = opxVar;
        this.G = ybzVar;
        this.H = g5Var;
        this.I = appAnalyticsReporter;
        spx spxVar = new spx(new qpx(unr0.h(Text.Companion, dzh0.ybsdk_kyc_step1_caption_title), new Text.Resource(dzh0.ybsdk_kyc_step1_caption_prompt_v2), new Text.Resource(dzh0.ybsdk_kyc_step1_caption_subtitle), new nbv(cyg0.ybsdk_kyc_photo_frame_1, null)), new rpx(new Text.Resource(dzh0.ybsdk_kyc_step1_caption_title), new Text.Resource(dzh0.ybsdk_kyc_step1_preview_prompt_v2), new Text.Resource(dzh0.ybsdk_kyc_step1_caption_subtitle)), qnx.b);
        spx spxVar2 = new spx(new qpx(new Text.Resource(dzh0.ybsdk_kyc_step2_caption_title), new Text.Resource(dzh0.ybsdk_kyc_step2_caption_prompt), new Text.Resource(dzh0.ybsdk_kyc_step2_caption_subtitle), new nbv(cyg0.ybsdk_kyc_photo_frame_2, null)), new rpx(new Text.Resource(dzh0.ybsdk_kyc_step2_caption_title), new Text.Resource(dzh0.ybsdk_kyc_step2_preview_prompt_v2), new Text.Resource(dzh0.ybsdk_kyc_step2_caption_subtitle)), rnx.b);
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_kyc_step3_caption_title);
        Text.Empty empty = Text.Empty.INSTANCE;
        nbv nbvVar = new nbv(cyg0.ybsdk_kyc_photo_frame_2, null);
        Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_kyc_step3_caption_prompt_v2);
        tr7 tr7Var = new tr7(CameraLens.FRONT);
        nbv nbvVar2 = new nbv(cyg0.ybsdk_kyc_photo_frame_landscape, null);
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
        Text.Resource resource3 = new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_title);
        ThemedImage selfieBottomSheetImage = ((if8) opxVar).a.f().getSelfieBottomSheetImage();
        x43 x43Var = new x43(scc.g(spxVar, spxVar2, new spx(new qpx(resource, resource2, empty, nbvVar, tr7Var, new ppx(new vrc(communicationFullScreenView$State$Type, resource3, null, null, null, null, null, null, null, selfieBottomSheetImage != null ? if8.h(selfieBottomSheetImage) : null, scc.g(new krc(new nbv(cyg0.ybsdk_ic_kyc_step_3_bullet_1, null), new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_bullet_1), null), new krc(new nbv(cyg0.ybsdk_ic_kyc_step_3_bullet_2, null), new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_bullet_2), null), new krc(new nbv(cyg0.ybsdk_ic_kyc_step_3_bullet_3, null), new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_bullet_3), null), new krc(new nbv(cyg0.ybsdk_ic_kyc_step_3_bullet_4, null), new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_bullet_4), null)), null, S, 0, 0, null, null, null, 0, false, null, null, null, Integer.valueOf(T), null, null, -1073751556, 3), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_step3_bottomsheet_button_title), null, null, null, null, null, null, false, false, null, 4094)), nbvVar2), new rpx(new Text.Resource(dzh0.ybsdk_kyc_step3_caption_title), new Text.Resource(dzh0.ybsdk_kyc_step3_preview_prompt_v2), empty), snx.b)));
        this.J = x43Var;
        ArrayList arrayList = new ArrayList(tcc.n(x43Var, 10));
        Iterator it = x43Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((spx) it.next()).c);
        }
        this.L = arrayList;
        this.M = new ArrayList();
        this.O = ffx.b(this.L.size(), this.L.size(), BufferOverflow.DROP_OLDEST);
        this.P = new h2t(this);
        this.Q = new mox(1, this);
        this.R = new a(this);
        g0(false);
    }

    public static final File b0(b bVar, tnx tnxVar) {
        bVar.getClass();
        return new File(bVar.D.getCacheDir(), b64.j(tnxVar.a, "_SCALED.jpg"));
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        this.I.F.a.a("kyc_online.photo.download.open.default", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, KycStatus.UPLOAD_IN_PROGRESS, null, null, false, 0, false, 252)));
        tje.N(ds31.a(this), null, null, new KycPhotoViewModel$checkPhotoUploadsStatuses$2(this, tje.N(ds31.a(this), null, null, new KycPhotoViewModel$checkPhotoUploadsStatuses$progressStateUpdateJob$1(this, null), 3), null), 3);
    }

    public final to7 d0() {
        return this.P;
    }

    public final a e0() {
        return this.R;
    }

    public final qya0 f0() {
        return this.Q;
    }

    public final void g0(boolean z) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        spx spxVar;
        ppx ppxVar;
        x43 x43Var = this.J;
        AppAnalyticsReporter appAnalyticsReporter = this.I;
        if (!z && (spxVar = (spx) x43Var.f()) != null && (ppxVar = spxVar.a.f) != null) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.bottom_sheet.open", null);
            Z(new zox(ppxVar));
            return;
        }
        spx spxVar2 = ((onx) X()).e;
        if (spxVar2 != null) {
            tnx tnxVar = spxVar2.c;
            k5c a = ds31.a(this);
            sjh sjhVar = uyj.a;
            this.M.add(tje.N(a, mdh.b, null, new KycPhotoViewModel$uploadPhoto$job$1(this, tnxVar, null), 2));
        }
        spx spxVar3 = (spx) x43Var.m();
        if (spxVar3 == null) {
            if (((if8) this.F).b() != KycGeoRequest.MANDATORY || this.K != null) {
                c0();
                return;
            }
            appAnalyticsReporter.F.a.a("kyc_online.geo_first.open", null);
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, onx.a((onx) value2, null, KycStatus.LOCATION_DEMAND, null, null, false, 0, false, 253)));
            return;
        }
        tnx tnxVar2 = spxVar3.c;
        if (tnxVar2.equals(qnx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.first_page.open", null);
        } else if (tnxVar2.equals(snx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.third_page.open", null);
        } else if (tnxVar2.equals(rnx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.second_page.open", null);
        } else if (!(tnxVar2 instanceof pnx)) {
            w511.b();
            return;
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, null, null, spxVar3, false, 0, false, MSException.ERROR_MORE_DATA)));
    }

    public final void h0() {
        this.I.F.a.a("kyc_online.photo.click.bottom_sheet.primary", null);
        g0(true);
    }

    public final void i0(boolean z) {
        if (!this.N || z == ((onx) X()).h) {
            return;
        }
        if (!z) {
            this.I.F.a.a("kyc_online.error.photo.camera_access.open", null);
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            boolean z2 = z;
            if (r0Var.k(value, onx.a((onx) value, null, null, null, null, false, 0, z2, HProv.PP_VERSION_TIMESTAMP))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void j0() {
        tr7 tr7Var;
        CameraLens cameraLens = null;
        this.I.F.a.a("kyc_online.photo.click.take_photo", null);
        spx spxVar = ((onx) X()).e;
        if (spxVar == null) {
            x4c.g("[KYC_Online] Attempted to capture a picture, but no step available", null, null, null, 14);
            return;
        }
        File q0 = q0(spxVar.c);
        if (((onx) X()).f) {
            spx spxVar2 = ((onx) X()).e;
            if (spxVar2 != null && (tr7Var = spxVar2.a.e) != null) {
                cameraLens = tr7Var.a;
            }
            if (cameraLens == CameraLens.FRONT) {
                Z(new bpx(true));
            }
        }
        Z(new dpx(q0, ((onx) X()).f));
    }

    public final void k0() {
        if (this.G.c()) {
            s0();
        } else {
            x4c.g("[KYC_Online] onLocationAvailable called, but no location is actually available", null, null, null, 14);
        }
    }

    public final void l0(boolean z) {
        if (((if8) this.F).b() != KycGeoRequest.MANDATORY) {
            return;
        }
        if (z) {
            s0();
        }
        KycStatus kycStatus = ((onx) X()).b;
        int i = kycStatus == null ? -1 : epx.a[kycStatus.ordinal()];
        if ((i == 1 || i == 2) && z) {
            tje.N(ds31.a(this), null, null, new KycPhotoViewModel$onLocationPermissionStatusChange$1(this, null), 3);
        }
    }

    public final void m0() {
        o0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(1:14)|15|(1:17)|(1:22)(2:19|20)))|32|6|7|(0)(0)|11|12|(0)|15|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        r9 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(ContinuationImpl continuationImpl) {
        KycPhotoViewModel$requestUserLocation$1 kycPhotoViewModel$requestUserLocation$1;
        int i;
        Throwable a;
        boolean z;
        if (continuationImpl instanceof KycPhotoViewModel$requestUserLocation$1) {
            kycPhotoViewModel$requestUserLocation$1 = (KycPhotoViewModel$requestUserLocation$1) continuationImpl;
            int i2 = kycPhotoViewModel$requestUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycPhotoViewModel$requestUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycPhotoViewModel$requestUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycPhotoViewModel$requestUserLocation$1.label;
                AppAnalyticsReporter appAnalyticsReporter = this.I;
                if (i != 0) {
                    kotlin.b.b(obj);
                    appAnalyticsReporter.F.a.a("kyc_online.location.request.initiated", null);
                    ybz ybzVar = this.G;
                    kycPhotoViewModel$requestUserLocation$1.label = 1;
                    obj = ybzVar.a(kycPhotoViewModel$requestUserLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object failure = (u6z) obj;
                a = Result.a(failure);
                if (a != null) {
                    em3 em3Var = appAnalyticsReporter.F;
                    KycEvents$KycOnlineLocationRequestResultResult kycEvents$KycOnlineLocationRequestResultResult = KycEvents$KycOnlineLocationRequestResultResult.ERROR;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, kycEvents$KycOnlineLocationRequestResultResult.getOriginalValue());
                    em3Var.a.a("kyc_online.location.request.result", linkedHashMap);
                    x4c.g("[KYC_Online] Failed to get location", a, null, null, 12);
                }
                z = failure instanceof Result.Failure;
                if (!z) {
                    em3 em3Var2 = appAnalyticsReporter.F;
                    KycEvents$KycOnlineLocationRequestResultResult kycEvents$KycOnlineLocationRequestResultResult2 = KycEvents$KycOnlineLocationRequestResultResult.OK;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                    linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, kycEvents$KycOnlineLocationRequestResultResult2.getOriginalValue());
                    em3Var2.a.a("kyc_online.location.request.result", linkedHashMap2);
                }
                if (z) {
                    return failure;
                }
                return null;
            }
        }
        kycPhotoViewModel$requestUserLocation$1 = new KycPhotoViewModel$requestUserLocation$1(this, continuationImpl);
        Object obj2 = kycPhotoViewModel$requestUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycPhotoViewModel$requestUserLocation$1.label;
        AppAnalyticsReporter appAnalyticsReporter2 = this.I;
        if (i != 0) {
        }
        Object failure2 = (u6z) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        z = failure2 instanceof Result.Failure;
        if (!z) {
        }
        if (z) {
        }
    }

    public final void o0() {
        r0 r0Var;
        Object value;
        this.I.F.a.a("kyc_online.geo_second.open", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, KycStatus.LOCATION_DEADEND, null, null, false, 0, false, 253)));
    }

    public final void p0() {
        em3 em3Var = this.I.F;
        em3Var.a.a("kyc_online.submit.request.initiated", new LinkedHashMap(1));
        tje.N(ds31.a(this), null, null, new KycPhotoViewModel$submitPhotos$1(this, null), 3);
    }

    public final File q0(tnx tnxVar) {
        return new File(this.D.getCacheDir(), b64.j(tnxVar.a, ".jpg"));
    }

    public final void r0() {
        List list = b9z.a;
        List list2 = b9z.a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (qke.h(this.D, (String) it.next()) != 0) {
                    return;
                }
            }
        }
        if (this.G.c()) {
            s0();
        } else {
            tje.N(ds31.a(this), null, null, new KycPhotoViewModel$tryUpdateUserLocation$1(this, null), 3);
        }
    }

    public final void s0() {
        tje.N(ds31.a(this), null, null, new KycPhotoViewModel$updateUserLocation$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t0(ContinuationImpl continuationImpl) {
        KycPhotoViewModel$waitUntilLocationIsKnown$1 kycPhotoViewModel$waitUntilLocationIsKnown$1;
        Object obj;
        int i;
        if (continuationImpl instanceof KycPhotoViewModel$waitUntilLocationIsKnown$1) {
            kycPhotoViewModel$waitUntilLocationIsKnown$1 = (KycPhotoViewModel$waitUntilLocationIsKnown$1) continuationImpl;
            int i2 = kycPhotoViewModel$waitUntilLocationIsKnown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycPhotoViewModel$waitUntilLocationIsKnown$1.label = i2 - Integer.MIN_VALUE;
                obj = kycPhotoViewModel$waitUntilLocationIsKnown$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycPhotoViewModel$waitUntilLocationIsKnown$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0();
                    kycPhotoViewModel$waitUntilLocationIsKnown$1.label = 1;
                    obj = n0(kycPhotoViewModel$waitUntilLocationIsKnown$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (obj == null) {
                    kycPhotoViewModel$waitUntilLocationIsKnown$1.label = 2;
                    if (t0(kycPhotoViewModel$waitUntilLocationIsKnown$1) == obj2) {
                        return obj2;
                    }
                }
                return zy11Var;
            }
        }
        kycPhotoViewModel$waitUntilLocationIsKnown$1 = new KycPhotoViewModel$waitUntilLocationIsKnown$1(this, continuationImpl);
        obj = kycPhotoViewModel$waitUntilLocationIsKnown$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycPhotoViewModel$waitUntilLocationIsKnown$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (obj == null) {
        }
        return zy11Var2;
    }
}
