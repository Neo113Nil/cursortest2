package com.yandex.mobile.drive.scan.service;

import android.graphics.Bitmap;
import com.yandex.mobile.drive.core.network.ResponseError;
import com.yandex.mobile.drive.view.AlertView;
import defpackage.am31;
import defpackage.fvj0;
import defpackage.g3r;
import defpackage.g8e;
import defpackage.gvj0;
import defpackage.h2b1;
import defpackage.ir1;
import defpackage.irb0;
import defpackage.jvj0;
import defpackage.l0b1;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tk31;
import defpackage.w511;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class e implements irb0 {
    public final com.yandex.mobile.drive.scan.dao.a a;
    public final ir1 b;
    public final String c;
    public final String d;

    public e(com.yandex.mobile.drive.scan.dao.a aVar, ir1 ir1Var, String str, String str2) {
        this.a = aVar;
        this.b = ir1Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e4, code lost:
    
        if (r7.awaitDismiss(r13) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.irb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Bitmap bitmap, am31 am31Var, boolean z, boolean z2, Integer num, ContinuationImpl continuationImpl) {
        LandingPictureService$processPicture$1 landingPictureService$processPicture$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        tk31 tk31Var;
        String str2;
        boolean z3;
        Bitmap bitmap2;
        am31 am31Var2;
        tk31 tk31Var2;
        byte[] bArr;
        if (continuationImpl instanceof LandingPictureService$processPicture$1) {
            landingPictureService$processPicture$1 = (LandingPictureService$processPicture$1) continuationImpl;
            int i2 = landingPictureService$processPicture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                landingPictureService$processPicture$1.label = i2 - Integer.MIN_VALUE;
                Object obj = landingPictureService$processPicture$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = landingPictureService$processPicture$1.label;
                ir1 ir1Var = this.b;
                if (i == 0) {
                    if (i == 1) {
                        z2 = landingPictureService$processPicture$1.Z$1;
                        z = landingPictureService$processPicture$1.Z$0;
                        if (landingPictureService$processPicture$1.L$4 != null) {
                            ny61.u();
                            return null;
                        }
                        am31Var = (am31) landingPictureService$processPicture$1.L$2;
                        Bitmap bitmap3 = (Bitmap) landingPictureService$processPicture$1.L$1;
                        String str3 = (String) landingPictureService$processPicture$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            bitmap = bitmap3;
                            str = str3;
                        } else {
                            AlertView a = ir1.a(ir1Var, null, this.c, this.d, 120);
                            landingPictureService$processPicture$1.L$0 = null;
                            landingPictureService$processPicture$1.L$1 = null;
                            landingPictureService$processPicture$1.L$2 = null;
                            landingPictureService$processPicture$1.L$3 = null;
                            landingPictureService$processPicture$1.L$4 = null;
                            landingPictureService$processPicture$1.Z$0 = z;
                            landingPictureService$processPicture$1.Z$1 = z2;
                            landingPictureService$processPicture$1.label = 2;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                if (landingPictureService$processPicture$1.L$4 != null) {
                                    ny61.u();
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return obj;
                            }
                            z3 = landingPictureService$processPicture$1.Z$1;
                            boolean z4 = landingPictureService$processPicture$1.Z$0;
                            tk31Var2 = (tk31) landingPictureService$processPicture$1.L$5;
                            if (landingPictureService$processPicture$1.L$4 != null) {
                                ny61.u();
                                return null;
                            }
                            am31 am31Var3 = (am31) landingPictureService$processPicture$1.L$2;
                            bitmap2 = (Bitmap) landingPictureService$processPicture$1.L$1;
                            String str4 = (String) landingPictureService$processPicture$1.L$0;
                            kotlin.b.b(obj);
                            z = z4;
                            am31Var2 = am31Var3;
                            str2 = str4;
                            try {
                                try {
                                    byte[] c = g3r.c(tk31Var2.a);
                                    am31Var2.b.a.delete();
                                    bArr = c;
                                } catch (IOException e) {
                                    qgn0 qgn0Var = h2b1.c;
                                    if (qgn0Var != null) {
                                        qgn0Var.o("debug_video_landing_file_read_failed", e);
                                    }
                                    l0b1.h(new AssertionError("failed to read picture", e));
                                    ir1.a(ir1Var, null, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                                    am31Var2.b.a.delete();
                                    bArr = null;
                                }
                                landingPictureService$processPicture$1.L$0 = null;
                                landingPictureService$processPicture$1.L$1 = null;
                                landingPictureService$processPicture$1.L$2 = null;
                                landingPictureService$processPicture$1.L$3 = null;
                                landingPictureService$processPicture$1.L$4 = null;
                                landingPictureService$processPicture$1.L$5 = null;
                                landingPictureService$processPicture$1.L$6 = null;
                                landingPictureService$processPicture$1.L$7 = null;
                                landingPictureService$processPicture$1.Z$0 = z;
                                landingPictureService$processPicture$1.Z$1 = z3;
                                landingPictureService$processPicture$1.label = 4;
                                Object d = d(bitmap2, bArr, str2, z, landingPictureService$processPicture$1);
                                return d != coroutineSingletons ? coroutineSingletons : d;
                            } catch (Throwable th) {
                                am31Var2.b.a.delete();
                                throw th;
                            }
                        }
                        if (landingPictureService$processPicture$1.L$4 != null) {
                            ny61.u();
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return Boolean.FALSE;
                }
                kotlin.b.b(obj);
                tk31Var = am31Var.b;
                d dVar = d.a;
                landingPictureService$processPicture$1.L$0 = str;
                landingPictureService$processPicture$1.L$1 = bitmap;
                landingPictureService$processPicture$1.L$2 = am31Var;
                landingPictureService$processPicture$1.L$3 = null;
                landingPictureService$processPicture$1.L$4 = null;
                landingPictureService$processPicture$1.L$5 = tk31Var;
                landingPictureService$processPicture$1.Z$0 = z;
                landingPictureService$processPicture$1.Z$1 = z2;
                landingPictureService$processPicture$1.label = 3;
                if (d.b(tk31Var, landingPictureService$processPicture$1) != coroutineSingletons) {
                    str2 = str;
                    z3 = z2;
                    bitmap2 = bitmap;
                    am31Var2 = am31Var;
                    tk31Var2 = tk31Var;
                    byte[] c2 = g3r.c(tk31Var2.a);
                    am31Var2.b.a.delete();
                    bArr = c2;
                    landingPictureService$processPicture$1.L$0 = null;
                    landingPictureService$processPicture$1.L$1 = null;
                    landingPictureService$processPicture$1.L$2 = null;
                    landingPictureService$processPicture$1.L$3 = null;
                    landingPictureService$processPicture$1.L$4 = null;
                    landingPictureService$processPicture$1.L$5 = null;
                    landingPictureService$processPicture$1.L$6 = null;
                    landingPictureService$processPicture$1.L$7 = null;
                    landingPictureService$processPicture$1.Z$0 = z;
                    landingPictureService$processPicture$1.Z$1 = z3;
                    landingPictureService$processPicture$1.label = 4;
                    Object d2 = d(bitmap2, bArr, str2, z, landingPictureService$processPicture$1);
                    if (d2 != coroutineSingletons) {
                    }
                }
            }
        }
        landingPictureService$processPicture$1 = new LandingPictureService$processPicture$1(this, continuationImpl);
        Object obj2 = landingPictureService$processPicture$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = landingPictureService$processPicture$1.label;
        ir1 ir1Var2 = this.b;
        if (i == 0) {
        }
        tk31Var = am31Var.b;
        d dVar2 = d.a;
        landingPictureService$processPicture$1.L$0 = str;
        landingPictureService$processPicture$1.L$1 = bitmap;
        landingPictureService$processPicture$1.L$2 = am31Var;
        landingPictureService$processPicture$1.L$3 = null;
        landingPictureService$processPicture$1.L$4 = null;
        landingPictureService$processPicture$1.L$5 = tk31Var;
        landingPictureService$processPicture$1.Z$0 = z;
        landingPictureService$processPicture$1.Z$1 = z2;
        landingPictureService$processPicture$1.label = 3;
        if (d.b(tk31Var, landingPictureService$processPicture$1) != coroutineSingletons) {
        }
    }

    @Override // defpackage.irb0
    public final void b(String str) {
    }

    @Override // defpackage.irb0
    public final List c() {
        return EmptyList.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Bitmap bitmap, byte[] bArr, String str, boolean z, ContinuationImpl continuationImpl) {
        LandingPictureService$upload$1 landingPictureService$upload$1;
        int i;
        jvj0 jvj0Var;
        ResponseError.Details details;
        if (continuationImpl instanceof LandingPictureService$upload$1) {
            landingPictureService$upload$1 = (LandingPictureService$upload$1) continuationImpl;
            int i2 = landingPictureService$upload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                landingPictureService$upload$1.label = i2 - Integer.MIN_VALUE;
                LandingPictureService$upload$1 landingPictureService$upload$12 = landingPictureService$upload$1;
                Object obj = landingPictureService$upload$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = landingPictureService$upload$12.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    landingPictureService$upload$12.L$0 = null;
                    landingPictureService$upload$12.L$1 = null;
                    landingPictureService$upload$12.L$2 = null;
                    landingPictureService$upload$12.Z$0 = z;
                    landingPictureService$upload$12.label = 1;
                    obj = this.a.b(bitmap, bArr, str, z, landingPictureService$upload$12);
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
                jvj0Var = (jvj0) obj;
                if (!(jvj0Var instanceof gvj0)) {
                    if (!(jvj0Var instanceof fvj0)) {
                        w511.b();
                        return null;
                    }
                    fvj0 fvj0Var = (fvj0) jvj0Var;
                    ResponseError responseError = fvj0Var.a;
                    String uiMessage = (responseError == null || (details = responseError.getDetails()) == null) ? null : details.getUiMessage();
                    if (uiMessage == null) {
                        uiMessage = "";
                    }
                    Map z3 = g8e.z("error", uiMessage);
                    qgn0 qgn0Var = h2b1.c;
                    if (qgn0Var != null) {
                        qgn0Var.n("debug_video_landing_upload_failed", z3);
                    }
                    ir1.a(this.b, fvj0Var, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        landingPictureService$upload$1 = new LandingPictureService$upload$1(this, continuationImpl);
        LandingPictureService$upload$1 landingPictureService$upload$122 = landingPictureService$upload$1;
        Object obj2 = landingPictureService$upload$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = landingPictureService$upload$122.label;
        boolean z22 = true;
        if (i != 0) {
        }
        jvj0Var = (jvj0) obj2;
        if (!(jvj0Var instanceof gvj0)) {
        }
        return Boolean.valueOf(z22);
    }
}
