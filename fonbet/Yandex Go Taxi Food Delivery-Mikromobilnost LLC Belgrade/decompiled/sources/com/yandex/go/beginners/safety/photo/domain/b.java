package com.yandex.go.beginners.safety.photo.domain;

import android.net.Uri;
import com.yandex.go.beginners.safety.analytics.SafeNewbiesAnalytics$SafeNewbiesPhotoType;
import com.yandex.go.beginners.safety.analytics.SafeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess;
import com.yandex.go.repositories.e;
import defpackage.bgv;
import defpackage.d9v;
import defpackage.epl0;
import defpackage.jjb0;
import defpackage.kjb0;
import defpackage.ljb0;
import defpackage.lr21;
import defpackage.mjb0;
import defpackage.ndl0;
import defpackage.njb0;
import defpackage.ny61;
import defpackage.rc21;
import defpackage.sjh;
import defpackage.sq21;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes12.dex */
public final class b {
    public final tt2 a;
    public final rc21 b;
    public final sq21 c;
    public final e d;
    public final d9v e;
    public final ndl0 f;

    public b(tt2 tt2Var, rc21 rc21Var, sq21 sq21Var, e eVar, d9v d9vVar, ndl0 ndl0Var) {
        this.a = tt2Var;
        this.b = rc21Var;
        this.c = sq21Var;
        this.d = eVar;
        this.e = d9vVar;
        this.f = ndl0Var;
    }

    public final void a(njb0 njb0Var, boolean z) {
        SafeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess safeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess;
        boolean z2 = njb0Var instanceof ljb0;
        ndl0 ndl0Var = this.f;
        if (!z2) {
            if (njb0Var instanceof mjb0) {
                String str = ((mjb0) njb0Var).a;
                epl0 epl0Var = (epl0) ndl0Var.b;
                epl0Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put(ACSPConstants.STATUS, str);
                }
                epl0Var.a.a("SafeNewbies.UploadPhoto.Rejected", hashMap, 1, new HashMap());
                return;
            }
            return;
        }
        ndl0Var.getClass();
        if (z) {
            safeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess = SafeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess.Gallery;
        } else {
            if (z) {
                w511.b();
                return;
            }
            safeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess = SafeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess.Selfie;
        }
        epl0 epl0Var2 = (epl0) ndl0Var.b;
        epl0Var2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("photo_type", safeNewbiesAnalytics$SafeNewbiesPhotoTypeSuccess.getEventValue());
        epl0Var2.a.a("SafeNewbies.UploadPhoto.Success", hashMap2, 1, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[Catch: all -> 0x00d4, CancellationException -> 0x00ef, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00d4, blocks: (B:12:0x0033, B:13:0x00ae, B:15:0x00c0, B:30:0x0098), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, boolean z, ContinuationImpl continuationImpl) {
        SafetyPhotoUploadInteractor$upload$1 safetyPhotoUploadInteractor$upload$1;
        int i;
        ndl0 ndl0Var;
        byte[] bArr;
        SafeNewbiesAnalytics$SafeNewbiesPhotoType safeNewbiesAnalytics$SafeNewbiesPhotoType;
        boolean z2;
        njb0 a;
        try {
            if (continuationImpl instanceof SafetyPhotoUploadInteractor$upload$1) {
                safetyPhotoUploadInteractor$upload$1 = (SafetyPhotoUploadInteractor$upload$1) continuationImpl;
                int i2 = safetyPhotoUploadInteractor$upload$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    safetyPhotoUploadInteractor$upload$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = safetyPhotoUploadInteractor$upload$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = safetyPhotoUploadInteractor$upload$1.label;
                    ndl0Var = this.f;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        SafetyPhotoUploadInteractor$upload$bytes$1 safetyPhotoUploadInteractor$upload$bytes$1 = new SafetyPhotoUploadInteractor$upload$bytes$1(this, uri, null);
                        safetyPhotoUploadInteractor$upload$1.L$0 = null;
                        safetyPhotoUploadInteractor$upload$1.Z$0 = z;
                        safetyPhotoUploadInteractor$upload$1.label = 1;
                        obj = tje.k0(sjhVar, safetyPhotoUploadInteractor$upload$bytes$1, safetyPhotoUploadInteractor$upload$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z2 = safetyPhotoUploadInteractor$upload$1.Z$0;
                            kotlin.b.b(obj);
                            lr21 lr21Var = (lr21) obj;
                            this.b.getClass();
                            a = rc21.a(lr21Var);
                            a(a, z2);
                            if (a instanceof ljb0) {
                                e eVar = this.d;
                                String str = lr21Var.a;
                                String str2 = lr21Var.b;
                                r0 r0Var = eVar.d;
                                bgv bgvVar = new bgv(str, str2);
                                r0Var.getClass();
                                r0Var.m(null, bgvVar);
                            }
                            return a;
                        }
                        z = safetyPhotoUploadInteractor$upload$1.Z$0;
                        kotlin.b.b(obj);
                    }
                    bArr = (byte[]) obj;
                    if (bArr != null) {
                        return jjb0.a;
                    }
                    ndl0Var.getClass();
                    if (z) {
                        safeNewbiesAnalytics$SafeNewbiesPhotoType = SafeNewbiesAnalytics$SafeNewbiesPhotoType.Gallery;
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        safeNewbiesAnalytics$SafeNewbiesPhotoType = SafeNewbiesAnalytics$SafeNewbiesPhotoType.Selfie;
                    }
                    epl0 epl0Var = (epl0) ndl0Var.b;
                    epl0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("photo_type", safeNewbiesAnalytics$SafeNewbiesPhotoType.getEventValue());
                    epl0Var.a.a("SafeNewbies.UploadPhoto.Upload.Started", hashMap, 1, new HashMap());
                    sq21 sq21Var = this.c;
                    Boolean bool = Boolean.TRUE;
                    safetyPhotoUploadInteractor$upload$1.L$0 = null;
                    safetyPhotoUploadInteractor$upload$1.L$1 = null;
                    safetyPhotoUploadInteractor$upload$1.Z$0 = z;
                    safetyPhotoUploadInteractor$upload$1.label = 2;
                    obj = ((com.yandex.go.domain.a) sq21Var).a(bArr, bool, bool, safetyPhotoUploadInteractor$upload$1);
                    if (obj != coroutineSingletons) {
                        z2 = z;
                        lr21 lr21Var2 = (lr21) obj;
                        this.b.getClass();
                        a = rc21.a(lr21Var2);
                        a(a, z2);
                        if (a instanceof ljb0) {
                        }
                        return a;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            bArr = (byte[]) obj;
            if (bArr != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            epl0 epl0Var2 = (epl0) ndl0Var.b;
            epl0Var2.getClass();
            epl0Var2.a.a("SafeNewbies.UploadPhoto.NetworkError", new HashMap(), 1, new HashMap());
            return kjb0.a;
        }
        safetyPhotoUploadInteractor$upload$1 = new SafetyPhotoUploadInteractor$upload$1(this, continuationImpl);
        Object obj2 = safetyPhotoUploadInteractor$upload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyPhotoUploadInteractor$upload$1.label;
        ndl0Var = this.f;
    }
}
