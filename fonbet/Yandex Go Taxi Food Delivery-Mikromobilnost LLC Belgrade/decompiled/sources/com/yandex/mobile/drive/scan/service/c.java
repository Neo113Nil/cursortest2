package com.yandex.mobile.drive.scan.service;

import android.graphics.Bitmap;
import com.yandex.mobile.drive.core.network.ResponseError;
import com.yandex.mobile.drive.scan.ScanResult;
import com.yandex.mobile.drive.view.AlertView;
import defpackage.am31;
import defpackage.fvj0;
import defpackage.g8e;
import defpackage.gvj0;
import defpackage.h2b1;
import defpackage.ir1;
import defpackage.irb0;
import defpackage.jvj0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qgn0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tk31;
import defpackage.uyj;
import defpackage.w511;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class c implements irb0 {
    public final com.yandex.mobile.drive.scan.dao.a a;
    public final ir1 b;
    public final String c;
    public final String d;
    public final a e;
    public final LinkedHashMap f = new LinkedHashMap();

    public c(com.yandex.mobile.drive.scan.dao.a aVar, ir1 ir1Var, String str, String str2, File file) {
        this.a = aVar;
        this.b = ir1Var;
        this.c = str;
        this.d = str2;
        this.e = new a(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // defpackage.irb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Bitmap bitmap, am31 am31Var, boolean z, boolean z2, Integer num, ContinuationImpl continuationImpl) {
        FlutterChatPictureService$processPicture$1 flutterChatPictureService$processPicture$1;
        Object obj;
        int i;
        boolean z3;
        boolean z4;
        am31 am31Var2;
        String str2;
        Bitmap bitmap2;
        String str3;
        tk31 tk31Var;
        String str4;
        tk31 tk31Var2;
        String str5;
        boolean z5;
        if (continuationImpl instanceof FlutterChatPictureService$processPicture$1) {
            flutterChatPictureService$processPicture$1 = (FlutterChatPictureService$processPicture$1) continuationImpl;
            int i2 = flutterChatPictureService$processPicture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flutterChatPictureService$processPicture$1.label = i2 - Integer.MIN_VALUE;
                FlutterChatPictureService$processPicture$1 flutterChatPictureService$processPicture$12 = flutterChatPictureService$processPicture$1;
                obj = flutterChatPictureService$processPicture$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flutterChatPictureService$processPicture$12.label;
                LinkedHashMap linkedHashMap = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flutterChatPictureService$processPicture$12.L$0 = str;
                    flutterChatPictureService$processPicture$12.L$1 = bitmap;
                    flutterChatPictureService$processPicture$12.L$2 = am31Var;
                    flutterChatPictureService$processPicture$12.L$3 = null;
                    flutterChatPictureService$processPicture$12.Z$0 = z;
                    flutterChatPictureService$processPicture$12.Z$1 = z2;
                    flutterChatPictureService$processPicture$12.label = 1;
                    Object d = d(bitmap, str, z, z2, flutterChatPictureService$processPicture$12);
                    if (d != obj2) {
                        z3 = z;
                        z4 = z2;
                        am31Var2 = am31Var;
                        obj = d;
                        str2 = str;
                        bitmap2 = bitmap;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tk31Var2 = (tk31) flutterChatPictureService$processPicture$12.L$5;
                        str4 = (String) flutterChatPictureService$processPicture$12.L$4;
                        str5 = (String) flutterChatPictureService$processPicture$12.L$0;
                        kotlin.b.b(obj);
                        String path = tk31Var2.a.getPath();
                        if (str4 != null || path == null) {
                            b(str5);
                            z5 = false;
                        } else {
                            linkedHashMap.put(str5, new ScanResult(str4, path));
                            z5 = true;
                        }
                        return Boolean.valueOf(z5);
                    }
                    z4 = flutterChatPictureService$processPicture$12.Z$1;
                    z3 = flutterChatPictureService$processPicture$12.Z$0;
                    am31Var2 = (am31) flutterChatPictureService$processPicture$12.L$2;
                    str3 = (String) flutterChatPictureService$processPicture$12.L$0;
                    kotlin.b.b(obj);
                    String str6 = (String) obj;
                    tk31Var = am31Var2.b;
                    d dVar = d.a;
                    flutterChatPictureService$processPicture$12.L$0 = str3;
                    flutterChatPictureService$processPicture$12.L$1 = null;
                    flutterChatPictureService$processPicture$12.L$2 = null;
                    flutterChatPictureService$processPicture$12.L$3 = null;
                    flutterChatPictureService$processPicture$12.L$4 = str6;
                    flutterChatPictureService$processPicture$12.L$5 = tk31Var;
                    flutterChatPictureService$processPicture$12.Z$0 = z3;
                    flutterChatPictureService$processPicture$12.Z$1 = z4;
                    flutterChatPictureService$processPicture$12.label = 3;
                    if (d.b(tk31Var, flutterChatPictureService$processPicture$12) != obj2) {
                        str4 = str6;
                        tk31Var2 = tk31Var;
                        str5 = str3;
                        String path2 = tk31Var2.a.getPath();
                        if (str4 != null) {
                        }
                        b(str5);
                        z5 = false;
                        return Boolean.valueOf(z5);
                    }
                    return obj2;
                }
                z4 = flutterChatPictureService$processPicture$12.Z$1;
                z3 = flutterChatPictureService$processPicture$12.Z$0;
                am31Var2 = (am31) flutterChatPictureService$processPicture$12.L$2;
                bitmap2 = (Bitmap) flutterChatPictureService$processPicture$12.L$1;
                str2 = (String) flutterChatPictureService$processPicture$12.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    b(str2);
                    return Boolean.FALSE;
                }
                String i3 = oyr.i(linkedHashMap.size(), "photo");
                flutterChatPictureService$processPicture$12.L$0 = str2;
                flutterChatPictureService$processPicture$12.L$1 = null;
                flutterChatPictureService$processPicture$12.L$2 = am31Var2;
                flutterChatPictureService$processPicture$12.L$3 = null;
                flutterChatPictureService$processPicture$12.Z$0 = z3;
                flutterChatPictureService$processPicture$12.Z$1 = z4;
                flutterChatPictureService$processPicture$12.label = 2;
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new ChatPictureRepository$savePicture$2(this.e, str2, i3, bitmap2, null), flutterChatPictureService$processPicture$12);
                if (obj != obj2) {
                    str3 = str2;
                    String str62 = (String) obj;
                    tk31Var = am31Var2.b;
                    d dVar2 = d.a;
                    flutterChatPictureService$processPicture$12.L$0 = str3;
                    flutterChatPictureService$processPicture$12.L$1 = null;
                    flutterChatPictureService$processPicture$12.L$2 = null;
                    flutterChatPictureService$processPicture$12.L$3 = null;
                    flutterChatPictureService$processPicture$12.L$4 = str62;
                    flutterChatPictureService$processPicture$12.L$5 = tk31Var;
                    flutterChatPictureService$processPicture$12.Z$0 = z3;
                    flutterChatPictureService$processPicture$12.Z$1 = z4;
                    flutterChatPictureService$processPicture$12.label = 3;
                    if (d.b(tk31Var, flutterChatPictureService$processPicture$12) != obj2) {
                    }
                }
                return obj2;
            }
        }
        flutterChatPictureService$processPicture$1 = new FlutterChatPictureService$processPicture$1(this, continuationImpl);
        FlutterChatPictureService$processPicture$1 flutterChatPictureService$processPicture$122 = flutterChatPictureService$processPicture$1;
        obj = flutterChatPictureService$processPicture$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flutterChatPictureService$processPicture$122.label;
        LinkedHashMap linkedHashMap2 = this.f;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.irb0
    public final void b(String str) {
        ScanResult scanResult = (ScanResult) this.f.remove(str);
        if (scanResult != null) {
            a.b(scanResult.getPhotoPath());
            String videoPath = scanResult.getVideoPath();
            if (videoPath != null) {
                new File(videoPath).delete();
            }
        }
    }

    @Override // defpackage.irb0
    public final List c() {
        return kotlin.collections.a.J0(this.f.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
    
        if (r10.awaitDismiss(r13) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        if (r8.awaitDismiss(r13) == r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Bitmap bitmap, String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        FlutterChatPictureService$verifyPhoto$1 flutterChatPictureService$verifyPhoto$1;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        jvj0 jvj0Var;
        ResponseError.Details details;
        if (continuationImpl instanceof FlutterChatPictureService$verifyPhoto$1) {
            flutterChatPictureService$verifyPhoto$1 = (FlutterChatPictureService$verifyPhoto$1) continuationImpl;
            int i2 = flutterChatPictureService$verifyPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flutterChatPictureService$verifyPhoto$1.label = i2 - Integer.MIN_VALUE;
                FlutterChatPictureService$verifyPhoto$1 flutterChatPictureService$verifyPhoto$12 = flutterChatPictureService$verifyPhoto$1;
                Object obj = flutterChatPictureService$verifyPhoto$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flutterChatPictureService$verifyPhoto$12.label;
                ir1 ir1Var = this.b;
                boolean z6 = true;
                if (i == 0) {
                    if (i == 1) {
                        z2 = flutterChatPictureService$verifyPhoto$12.Z$1;
                        z = flutterChatPictureService$verifyPhoto$12.Z$0;
                        if (flutterChatPictureService$verifyPhoto$12.L$3 != null) {
                            ny61.u();
                            return null;
                        }
                        str = (String) flutterChatPictureService$verifyPhoto$12.L$1;
                        Bitmap bitmap2 = (Bitmap) flutterChatPictureService$verifyPhoto$12.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            bitmap = bitmap2;
                        } else {
                            AlertView a = ir1.a(ir1Var, null, this.c, this.d, 120);
                            flutterChatPictureService$verifyPhoto$12.L$0 = null;
                            flutterChatPictureService$verifyPhoto$12.L$1 = null;
                            flutterChatPictureService$verifyPhoto$12.L$2 = null;
                            flutterChatPictureService$verifyPhoto$12.L$3 = null;
                            flutterChatPictureService$verifyPhoto$12.Z$0 = z;
                            flutterChatPictureService$verifyPhoto$12.Z$1 = z2;
                            flutterChatPictureService$verifyPhoto$12.label = 2;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                if (flutterChatPictureService$verifyPhoto$12.L$3 != null) {
                                    ny61.u();
                                    return null;
                                }
                                kotlin.b.b(obj);
                                z6 = false;
                                return Boolean.valueOf(z6);
                            }
                            z4 = flutterChatPictureService$verifyPhoto$12.Z$1;
                            z5 = flutterChatPictureService$verifyPhoto$12.Z$0;
                            if (flutterChatPictureService$verifyPhoto$12.L$3 != null) {
                                ny61.u();
                                return null;
                            }
                            kotlin.b.b(obj);
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
                                Map z7 = g8e.z("error", uiMessage);
                                qgn0 qgn0Var = h2b1.c;
                                if (qgn0Var != null) {
                                    qgn0Var.n("debug_video_verification_upload_failed", z7);
                                }
                                AlertView a2 = ir1.a(ir1Var, fvj0Var, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                                flutterChatPictureService$verifyPhoto$12.L$0 = null;
                                flutterChatPictureService$verifyPhoto$12.L$1 = null;
                                flutterChatPictureService$verifyPhoto$12.L$2 = null;
                                flutterChatPictureService$verifyPhoto$12.L$3 = null;
                                flutterChatPictureService$verifyPhoto$12.L$4 = null;
                                flutterChatPictureService$verifyPhoto$12.Z$0 = z5;
                                flutterChatPictureService$verifyPhoto$12.Z$1 = z4;
                                flutterChatPictureService$verifyPhoto$12.label = 4;
                            }
                            return Boolean.valueOf(z6);
                        }
                        if (flutterChatPictureService$verifyPhoto$12.L$3 != null) {
                            ny61.u();
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return Boolean.FALSE;
                }
                kotlin.b.b(obj);
                boolean z8 = z2;
                z3 = z;
                String str2 = str;
                if (z3) {
                    return Boolean.TRUE;
                }
                flutterChatPictureService$verifyPhoto$12.L$0 = null;
                flutterChatPictureService$verifyPhoto$12.L$1 = null;
                flutterChatPictureService$verifyPhoto$12.L$2 = null;
                flutterChatPictureService$verifyPhoto$12.L$3 = null;
                flutterChatPictureService$verifyPhoto$12.Z$0 = z3;
                flutterChatPictureService$verifyPhoto$12.Z$1 = z8;
                flutterChatPictureService$verifyPhoto$12.label = 3;
                Object b = this.a.b(bitmap, null, str2, z3, flutterChatPictureService$verifyPhoto$12);
                if (b != coroutineSingletons) {
                    obj = b;
                    z4 = z8;
                    z5 = z3;
                    jvj0Var = (jvj0) obj;
                    if (!(jvj0Var instanceof gvj0)) {
                    }
                    return Boolean.valueOf(z6);
                }
                return coroutineSingletons;
            }
        }
        flutterChatPictureService$verifyPhoto$1 = new FlutterChatPictureService$verifyPhoto$1(this, continuationImpl);
        FlutterChatPictureService$verifyPhoto$1 flutterChatPictureService$verifyPhoto$122 = flutterChatPictureService$verifyPhoto$1;
        Object obj2 = flutterChatPictureService$verifyPhoto$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flutterChatPictureService$verifyPhoto$122.label;
        ir1 ir1Var2 = this.b;
        boolean z62 = true;
        if (i == 0) {
        }
        boolean z82 = z2;
        z3 = z;
        String str22 = str;
        if (z3) {
        }
    }
}
