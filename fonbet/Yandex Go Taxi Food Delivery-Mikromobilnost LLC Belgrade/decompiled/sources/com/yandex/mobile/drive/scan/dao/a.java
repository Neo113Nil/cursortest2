package com.yandex.mobile.drive.scan.dao;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import defpackage.f73;
import defpackage.fzq;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.kwu;
import defpackage.m5j0;
import defpackage.ny61;
import defpackage.p0;
import defpackage.qje;
import defpackage.qsr;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import java.io.File;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class a {
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(1:(2:10|11)(2:13|14))(1:15))(1:27)|16|(1:18)|19|20|21|(1:23)(1:24)))|29|6|(0)(0)|16|(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r6 == r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(File file, String str, ContinuationImpl continuationImpl) {
        SupportApi$uploadDocument$1 supportApi$uploadDocument$1;
        int i;
        String mimeTypeFromExtension;
        if (continuationImpl instanceof SupportApi$uploadDocument$1) {
            supportApi$uploadDocument$1 = (SupportApi$uploadDocument$1) continuationImpl;
            int i2 = supportApi$uploadDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportApi$uploadDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportApi$uploadDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportApi$uploadDocument$1.label;
                int i3 = 2;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.mobile.drive.drive_native_features.a aVar = com.yandex.mobile.drive.drive_native_features.b.z;
                    supportApi$uploadDocument$1.L$0 = file;
                    supportApi$uploadDocument$1.L$1 = str;
                    supportApi$uploadDocument$1.label = 1;
                    obj = aVar.a(supportApi$uploadDocument$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) supportApi$uploadDocument$1.L$1;
                    file = (File) supportApi$uploadDocument$1.L$0;
                    b.b(obj);
                }
                qsr qsrVar = (qsr) obj;
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.toString());
                Regex regex = wg10.e;
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "video/*";
                }
                wg10 wg10Var = qje.o(mimeTypeFromExtension);
                i3y i3yVar = com.yandex.mobile.drive.core.network.b.a;
                kwu a = com.yandex.mobile.drive.core.network.b.a("/support_api/registration/bv", qsrVar, gw00.e(new Pair("type", str)));
                t4j0 t4j0Var = new t4j0();
                t4j0Var.a = a;
                int i4 = m5j0.a;
                t4j0Var.e("POST", new fzq(wg10Var, file));
                supportApi$uploadDocument$1.L$0 = null;
                supportApi$uploadDocument$1.L$1 = null;
                supportApi$uploadDocument$1.L$2 = null;
                supportApi$uploadDocument$1.L$3 = null;
                supportApi$uploadDocument$1.L$4 = null;
                supportApi$uploadDocument$1.label = 2;
                Object c = com.yandex.mobile.drive.core.network.a.c(t4j0Var, qsrVar, "video/mp4", new p0(i3), supportApi$uploadDocument$1);
                return c != coroutineSingletons ? coroutineSingletons : c;
            }
        }
        supportApi$uploadDocument$1 = new SupportApi$uploadDocument$1(this, continuationImpl);
        Object obj2 = supportApi$uploadDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportApi$uploadDocument$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        qsr qsrVar2 = (qsr) obj2;
        String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(file.toString());
        Regex regex2 = wg10.e;
        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2);
        if (mimeTypeFromExtension == null) {
        }
        wg10 wg10Var2 = qje.o(mimeTypeFromExtension);
        i3y i3yVar2 = com.yandex.mobile.drive.core.network.b.a;
        kwu a2 = com.yandex.mobile.drive.core.network.b.a("/support_api/registration/bv", qsrVar2, gw00.e(new Pair("type", str)));
        t4j0 t4j0Var2 = new t4j0();
        t4j0Var2.a = a2;
        int i42 = m5j0.a;
        t4j0Var2.e("POST", new fzq(wg10Var2, file));
        supportApi$uploadDocument$1.L$0 = null;
        supportApi$uploadDocument$1.L$1 = null;
        supportApi$uploadDocument$1.L$2 = null;
        supportApi$uploadDocument$1.L$3 = null;
        supportApi$uploadDocument$1.L$4 = null;
        supportApi$uploadDocument$1.label = 2;
        Object c2 = com.yandex.mobile.drive.core.network.a.c(t4j0Var2, qsrVar2, "video/mp4", new p0(i32), supportApi$uploadDocument$1);
        if (c2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r9 == r14) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bitmap bitmap, byte[] bArr, String str, boolean z, ContinuationImpl continuationImpl) {
        SupportApi$uploadVerification$1 supportApi$uploadVerification$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        qsr qsrVar;
        boolean z2;
        String str2;
        if (continuationImpl instanceof SupportApi$uploadVerification$1) {
            supportApi$uploadVerification$1 = (SupportApi$uploadVerification$1) continuationImpl;
            int i2 = supportApi$uploadVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportApi$uploadVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportApi$uploadVerification$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportApi$uploadVerification$1.label;
                int i3 = 2;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.mobile.drive.drive_native_features.a aVar = com.yandex.mobile.drive.drive_native_features.b.z;
                    supportApi$uploadVerification$1.L$0 = bitmap;
                    supportApi$uploadVerification$1.L$1 = bArr;
                    supportApi$uploadVerification$1.L$2 = str;
                    supportApi$uploadVerification$1.Z$0 = z;
                    supportApi$uploadVerification$1.label = 1;
                    obj = aVar.a(supportApi$uploadVerification$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        z2 = supportApi$uploadVerification$1.Z$0;
                        bArr = (byte[]) supportApi$uploadVerification$1.L$4;
                        qsrVar = (qsr) supportApi$uploadVerification$1.L$3;
                        str2 = (String) supportApi$uploadVerification$1.L$2;
                        b.b(obj);
                        byte[] bArr2 = (byte[]) obj;
                        kwu a2 = com.yandex.mobile.drive.core.network.b.a("/support_api/user/verification_photo", qsrVar, kotlin.collections.b.i(new Pair("additional_length", String.valueOf(bArr.length)), new Pair("use_antifraud", !z2 ? "true" : "false"), new Pair("type", str2)));
                        byte[] r = f73.r(bArr2, bArr);
                        t4j0 t4j0Var = new t4j0();
                        t4j0Var.a = a2;
                        int i4 = m5j0.a;
                        t4j0Var.e("POST", wms.b(6, null, r));
                        supportApi$uploadVerification$1.L$0 = null;
                        supportApi$uploadVerification$1.L$1 = null;
                        supportApi$uploadVerification$1.L$2 = null;
                        supportApi$uploadVerification$1.L$3 = null;
                        supportApi$uploadVerification$1.L$4 = null;
                        supportApi$uploadVerification$1.L$5 = null;
                        supportApi$uploadVerification$1.L$6 = null;
                        supportApi$uploadVerification$1.Z$0 = z2;
                        supportApi$uploadVerification$1.label = 3;
                        Object c = com.yandex.mobile.drive.core.network.a.c(t4j0Var, qsrVar, null, new p0(i3), supportApi$uploadVerification$1);
                        return c != coroutineSingletons ? coroutineSingletons : c;
                    }
                    z = supportApi$uploadVerification$1.Z$0;
                    str = (String) supportApi$uploadVerification$1.L$2;
                    bArr = (byte[]) supportApi$uploadVerification$1.L$1;
                    bitmap = (Bitmap) supportApi$uploadVerification$1.L$0;
                    b.b(obj);
                }
                qsr qsrVar2 = (qsr) obj;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                supportApi$uploadVerification$1.L$0 = null;
                supportApi$uploadVerification$1.L$1 = null;
                supportApi$uploadVerification$1.L$2 = str;
                supportApi$uploadVerification$1.L$3 = qsrVar2;
                supportApi$uploadVerification$1.L$4 = bArr;
                supportApi$uploadVerification$1.Z$0 = z;
                supportApi$uploadVerification$1.label = 2;
                a = com.yandex.mobile.drive.extensions.a.a(bitmap, compressFormat, 90, supportApi$uploadVerification$1);
                if (a != coroutineSingletons) {
                    String str3 = str;
                    qsrVar = qsrVar2;
                    obj = a;
                    z2 = z;
                    str2 = str3;
                    byte[] bArr22 = (byte[]) obj;
                    kwu a22 = com.yandex.mobile.drive.core.network.b.a("/support_api/user/verification_photo", qsrVar, kotlin.collections.b.i(new Pair("additional_length", String.valueOf(bArr.length)), new Pair("use_antifraud", !z2 ? "true" : "false"), new Pair("type", str2)));
                    byte[] r2 = f73.r(bArr22, bArr);
                    t4j0 t4j0Var2 = new t4j0();
                    t4j0Var2.a = a22;
                    int i42 = m5j0.a;
                    t4j0Var2.e("POST", wms.b(6, null, r2));
                    supportApi$uploadVerification$1.L$0 = null;
                    supportApi$uploadVerification$1.L$1 = null;
                    supportApi$uploadVerification$1.L$2 = null;
                    supportApi$uploadVerification$1.L$3 = null;
                    supportApi$uploadVerification$1.L$4 = null;
                    supportApi$uploadVerification$1.L$5 = null;
                    supportApi$uploadVerification$1.L$6 = null;
                    supportApi$uploadVerification$1.Z$0 = z2;
                    supportApi$uploadVerification$1.label = 3;
                    Object c2 = com.yandex.mobile.drive.core.network.a.c(t4j0Var2, qsrVar, null, new p0(i3), supportApi$uploadVerification$1);
                    if (c2 != coroutineSingletons) {
                    }
                }
            }
        }
        supportApi$uploadVerification$1 = new SupportApi$uploadVerification$1(this, continuationImpl);
        Object obj2 = supportApi$uploadVerification$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportApi$uploadVerification$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        qsr qsrVar22 = (qsr) obj2;
        if (bArr == null) {
        }
        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
        supportApi$uploadVerification$1.L$0 = null;
        supportApi$uploadVerification$1.L$1 = null;
        supportApi$uploadVerification$1.L$2 = str;
        supportApi$uploadVerification$1.L$3 = qsrVar22;
        supportApi$uploadVerification$1.L$4 = bArr;
        supportApi$uploadVerification$1.Z$0 = z;
        supportApi$uploadVerification$1.label = 2;
        a = com.yandex.mobile.drive.extensions.a.a(bitmap, compressFormat2, 90, supportApi$uploadVerification$1);
        if (a != coroutineSingletons) {
        }
    }
}
