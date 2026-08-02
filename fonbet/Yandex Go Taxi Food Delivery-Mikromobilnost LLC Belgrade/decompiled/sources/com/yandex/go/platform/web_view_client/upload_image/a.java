package com.yandex.go.platform.web_view_client.upload_image;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;
import defpackage.evu0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public Uri b;

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(7:18|(3:20|(2:22|23)(1:25)|24)|26|27|(3:29|(3:31|(3:34|(1:36)(1:37)|32)|38)|39)|40|(1:42)(1:43))|12|13))|45|6|7|(0)(0)|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WebChromeClient.FileChooserParams fileChooserParams, ContinuationImpl continuationImpl) {
        CameraCaptureDelegate$buildIntent$1 cameraCaptureDelegate$buildIntent$1;
        int i;
        a aVar;
        if (continuationImpl instanceof CameraCaptureDelegate$buildIntent$1) {
            cameraCaptureDelegate$buildIntent$1 = (CameraCaptureDelegate$buildIntent$1) continuationImpl;
            int i2 = cameraCaptureDelegate$buildIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraCaptureDelegate$buildIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraCaptureDelegate$buildIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraCaptureDelegate$buildIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String[] acceptTypes = fileChooserParams.getAcceptTypes();
                    ArrayList arrayList = new ArrayList();
                    for (String str : acceptTypes) {
                        if (evu0.y(str, "/", false)) {
                            arrayList.add(str);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (evu0.y((String) it.next(), "image/", false)) {
                                }
                            }
                        }
                        return null;
                    }
                    Context context = this.a;
                    cameraCaptureDelegate$buildIntent$1.L$0 = this;
                    cameraCaptureDelegate$buildIntent$1.L$1 = this;
                    cameraCaptureDelegate$buildIntent$1.label = 1;
                    obj = b(context, cameraCaptureDelegate$buildIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) cameraCaptureDelegate$buildIntent$1.L$1;
                    aVar = (a) cameraCaptureDelegate$buildIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                this.b = (Uri) obj;
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", aVar.b);
                return intent;
            }
        }
        cameraCaptureDelegate$buildIntent$1 = new CameraCaptureDelegate$buildIntent$1(this, continuationImpl);
        Object obj2 = cameraCaptureDelegate$buildIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraCaptureDelegate$buildIntent$1.label;
        if (i != 0) {
        }
        this.b = (Uri) obj2;
        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        intent2.putExtra("output", aVar.b);
        return intent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, ContinuationImpl continuationImpl) {
        CameraCaptureDelegate$createTempImageFileUri$1 cameraCaptureDelegate$createTempImageFileUri$1;
        int i;
        if (continuationImpl instanceof CameraCaptureDelegate$createTempImageFileUri$1) {
            cameraCaptureDelegate$createTempImageFileUri$1 = (CameraCaptureDelegate$createTempImageFileUri$1) continuationImpl;
            int i2 = cameraCaptureDelegate$createTempImageFileUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraCaptureDelegate$createTempImageFileUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraCaptureDelegate$createTempImageFileUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraCaptureDelegate$createTempImageFileUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    CameraCaptureDelegate$createTempImageFileUri$2 cameraCaptureDelegate$createTempImageFileUri$2 = new CameraCaptureDelegate$createTempImageFileUri$2(context, null);
                    cameraCaptureDelegate$createTempImageFileUri$1.label = 1;
                    obj = tje.k0(mdhVar, cameraCaptureDelegate$createTempImageFileUri$2, cameraCaptureDelegate$createTempImageFileUri$1);
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
                return obj;
            }
        }
        cameraCaptureDelegate$createTempImageFileUri$1 = new CameraCaptureDelegate$createTempImageFileUri$1(this, continuationImpl);
        Object obj2 = cameraCaptureDelegate$createTempImageFileUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraCaptureDelegate$createTempImageFileUri$1.label;
        if (i != 0) {
        }
        return obj2;
    }
}
