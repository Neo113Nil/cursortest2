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
import defpackage.scc;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.ycc;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class b implements irb0 {
    public final com.yandex.mobile.drive.scan.dao.a a;
    public final ir1 b;
    public final String c;
    public final String d;
    public final a e;
    public final ArrayList f = new ArrayList();
    public final LinkedHashMap g = new LinkedHashMap();

    public b(com.yandex.mobile.drive.scan.dao.a aVar, ir1 ir1Var, String str, String str2, File file) {
        this.a = aVar;
        this.b = ir1Var;
        this.c = str;
        this.d = str2;
        this.e = new a(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // defpackage.irb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Bitmap bitmap, am31 am31Var, boolean z, boolean z2, Integer num, ContinuationImpl continuationImpl) {
        ChatPictureService$processPicture$1 chatPictureService$processPicture$1;
        int i;
        am31 am31Var2;
        Object d;
        String str2;
        Bitmap bitmap2;
        boolean z3;
        boolean z4;
        am31 am31Var3;
        String str3;
        String str4;
        if (continuationImpl instanceof ChatPictureService$processPicture$1) {
            chatPictureService$processPicture$1 = (ChatPictureService$processPicture$1) continuationImpl;
            int i2 = chatPictureService$processPicture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatPictureService$processPicture$1.label = i2 - Integer.MIN_VALUE;
                ChatPictureService$processPicture$1 chatPictureService$processPicture$12 = chatPictureService$processPicture$1;
                Object obj = chatPictureService$processPicture$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatPictureService$processPicture$12.label;
                ArrayList arrayList = this.f;
                LinkedHashMap linkedHashMap = this.g;
                boolean z5 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chatPictureService$processPicture$12.L$0 = str;
                    chatPictureService$processPicture$12.L$1 = bitmap;
                    am31Var2 = am31Var;
                    chatPictureService$processPicture$12.L$2 = am31Var2;
                    chatPictureService$processPicture$12.L$3 = null;
                    chatPictureService$processPicture$12.Z$0 = z;
                    chatPictureService$processPicture$12.Z$1 = z2;
                    chatPictureService$processPicture$12.label = 1;
                    d = d(bitmap, str, z, z2, chatPictureService$processPicture$12);
                    if (d != obj2) {
                        str2 = str;
                        bitmap2 = bitmap;
                        z3 = z;
                        z4 = z2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    am31Var3 = (am31) chatPictureService$processPicture$12.L$2;
                    str3 = (String) chatPictureService$processPicture$12.L$0;
                    kotlin.b.b(obj);
                    str4 = (String) obj;
                    if (str4 == null) {
                        arrayList.add(str4);
                        linkedHashMap.put(str3, am31Var3);
                    } else {
                        linkedHashMap.remove(str3);
                        z5 = false;
                    }
                    return Boolean.valueOf(z5);
                }
                boolean z6 = chatPictureService$processPicture$12.Z$1;
                z3 = chatPictureService$processPicture$12.Z$0;
                am31 am31Var4 = (am31) chatPictureService$processPicture$12.L$2;
                bitmap2 = (Bitmap) chatPictureService$processPicture$12.L$1;
                str2 = (String) chatPictureService$processPicture$12.L$0;
                kotlin.b.b(obj);
                d = obj;
                am31Var2 = am31Var4;
                z4 = z6;
                if (((Boolean) d).booleanValue()) {
                    linkedHashMap.remove(str2);
                    return Boolean.FALSE;
                }
                String i3 = oyr.i(arrayList.size(), "photo");
                chatPictureService$processPicture$12.L$0 = str2;
                chatPictureService$processPicture$12.L$1 = null;
                chatPictureService$processPicture$12.L$2 = am31Var2;
                chatPictureService$processPicture$12.L$3 = null;
                chatPictureService$processPicture$12.Z$0 = z3;
                chatPictureService$processPicture$12.Z$1 = z4;
                chatPictureService$processPicture$12.label = 2;
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b, new ChatPictureRepository$savePicture$2(this.e, str2, i3, bitmap2, null), chatPictureService$processPicture$12);
                if (k0 != obj2) {
                    am31 am31Var5 = am31Var2;
                    obj = k0;
                    am31Var3 = am31Var5;
                    str3 = str2;
                    str4 = (String) obj;
                    if (str4 == null) {
                    }
                    return Boolean.valueOf(z5);
                }
                return obj2;
            }
        }
        chatPictureService$processPicture$1 = new ChatPictureService$processPicture$1(this, continuationImpl);
        ChatPictureService$processPicture$1 chatPictureService$processPicture$122 = chatPictureService$processPicture$1;
        Object obj3 = chatPictureService$processPicture$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatPictureService$processPicture$122.label;
        ArrayList arrayList2 = this.f;
        LinkedHashMap linkedHashMap2 = this.g;
        boolean z52 = true;
        if (i != 0) {
        }
        if (((Boolean) d).booleanValue()) {
        }
    }

    @Override // defpackage.irb0
    public final void b(String str) {
        ArrayList arrayList = this.f;
        a.b((String) arrayList.remove(scc.f(arrayList)));
        am31 am31Var = (am31) this.g.remove(str);
        if (am31Var != null) {
            am31Var.b.a.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.irb0
    public final List c() {
        d dVar = d.a;
        ycc.r(kotlin.collections.a.J0(this.g.values()), d.b);
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ScanResult((String) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return arrayList2;
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
        ChatPictureService$verifyPhoto$1 chatPictureService$verifyPhoto$1;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        jvj0 jvj0Var;
        ResponseError.Details details;
        if (continuationImpl instanceof ChatPictureService$verifyPhoto$1) {
            chatPictureService$verifyPhoto$1 = (ChatPictureService$verifyPhoto$1) continuationImpl;
            int i2 = chatPictureService$verifyPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatPictureService$verifyPhoto$1.label = i2 - Integer.MIN_VALUE;
                ChatPictureService$verifyPhoto$1 chatPictureService$verifyPhoto$12 = chatPictureService$verifyPhoto$1;
                Object obj = chatPictureService$verifyPhoto$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatPictureService$verifyPhoto$12.label;
                ir1 ir1Var = this.b;
                boolean z6 = true;
                if (i == 0) {
                    if (i == 1) {
                        z2 = chatPictureService$verifyPhoto$12.Z$1;
                        z = chatPictureService$verifyPhoto$12.Z$0;
                        if (chatPictureService$verifyPhoto$12.L$3 != null) {
                            ny61.u();
                            return null;
                        }
                        str = (String) chatPictureService$verifyPhoto$12.L$1;
                        Bitmap bitmap2 = (Bitmap) chatPictureService$verifyPhoto$12.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            bitmap = bitmap2;
                        } else {
                            AlertView a = ir1.a(ir1Var, null, this.c, this.d, 120);
                            chatPictureService$verifyPhoto$12.L$0 = null;
                            chatPictureService$verifyPhoto$12.L$1 = null;
                            chatPictureService$verifyPhoto$12.L$2 = null;
                            chatPictureService$verifyPhoto$12.L$3 = null;
                            chatPictureService$verifyPhoto$12.Z$0 = z;
                            chatPictureService$verifyPhoto$12.Z$1 = z2;
                            chatPictureService$verifyPhoto$12.label = 2;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                if (chatPictureService$verifyPhoto$12.L$3 != null) {
                                    ny61.u();
                                    return null;
                                }
                                kotlin.b.b(obj);
                                z6 = false;
                                return Boolean.valueOf(z6);
                            }
                            z4 = chatPictureService$verifyPhoto$12.Z$1;
                            z5 = chatPictureService$verifyPhoto$12.Z$0;
                            if (chatPictureService$verifyPhoto$12.L$3 != null) {
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
                                chatPictureService$verifyPhoto$12.L$0 = null;
                                chatPictureService$verifyPhoto$12.L$1 = null;
                                chatPictureService$verifyPhoto$12.L$2 = null;
                                chatPictureService$verifyPhoto$12.L$3 = null;
                                chatPictureService$verifyPhoto$12.L$4 = null;
                                chatPictureService$verifyPhoto$12.Z$0 = z5;
                                chatPictureService$verifyPhoto$12.Z$1 = z4;
                                chatPictureService$verifyPhoto$12.label = 4;
                            }
                            return Boolean.valueOf(z6);
                        }
                        if (chatPictureService$verifyPhoto$12.L$3 != null) {
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
                chatPictureService$verifyPhoto$12.L$0 = null;
                chatPictureService$verifyPhoto$12.L$1 = null;
                chatPictureService$verifyPhoto$12.L$2 = null;
                chatPictureService$verifyPhoto$12.L$3 = null;
                chatPictureService$verifyPhoto$12.Z$0 = z3;
                chatPictureService$verifyPhoto$12.Z$1 = z8;
                chatPictureService$verifyPhoto$12.label = 3;
                Object b = this.a.b(bitmap, null, str2, z3, chatPictureService$verifyPhoto$12);
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
        chatPictureService$verifyPhoto$1 = new ChatPictureService$verifyPhoto$1(this, continuationImpl);
        ChatPictureService$verifyPhoto$1 chatPictureService$verifyPhoto$122 = chatPictureService$verifyPhoto$1;
        Object obj2 = chatPictureService$verifyPhoto$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatPictureService$verifyPhoto$122.label;
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
