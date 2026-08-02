package com.yandex.go.scooters.photocontrol.data;

import android.content.Context;
import android.net.Uri;
import defpackage.cmt;
import defpackage.m5j0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.scooters.data.a c;
    public final ScootersPhotocontrolVerifyApi d;

    public c(Context context, tt2 tt2Var, ru.yandex.taxi.scooters.data.a aVar, ScootersPhotocontrolVerifyApi scootersPhotocontrolVerifyApi) {
        this.a = context;
        this.b = tt2Var;
        this.c = aVar;
        this.d = scootersPhotocontrolVerifyApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c1, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r9, null, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, String str, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolUploadRepository$uploadPhoto$1 scootersPhotocontrolUploadRepository$uploadPhoto$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        String str2;
        ScootersPhotocontrolVerifyApi scootersPhotocontrolVerifyApi;
        Object k0;
        String str3;
        Map<String, String> map;
        if (continuationImpl instanceof ScootersPhotocontrolUploadRepository$uploadPhoto$1) {
            scootersPhotocontrolUploadRepository$uploadPhoto$1 = (ScootersPhotocontrolUploadRepository$uploadPhoto$1) continuationImpl;
            int i2 = scootersPhotocontrolUploadRepository$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolUploadRepository$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolUploadRepository$uploadPhoto$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolUploadRepository$uploadPhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0 = uri;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1 = str;
                    ScootersPhotocontrolVerifyApi scootersPhotocontrolVerifyApi2 = this.d;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2 = scootersPhotocontrolVerifyApi2;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.label = 1;
                    a = this.c.a(false, scootersPhotocontrolUploadRepository$uploadPhoto$1);
                    if (a != coroutineSingletons) {
                        str2 = str;
                        scootersPhotocontrolVerifyApi = scootersPhotocontrolVerifyApi2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ScootersPhotocontrolVerifyApi scootersPhotocontrolVerifyApi3 = (ScootersPhotocontrolVerifyApi) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2;
                    String str4 = (String) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1;
                    Uri uri2 = (Uri) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0;
                    kotlin.b.b(obj);
                    scootersPhotocontrolVerifyApi = scootersPhotocontrolVerifyApi3;
                    uri = uri2;
                    a = obj;
                    str2 = str4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str3 = (String) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$4;
                    map = (Map) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$3;
                    scootersPhotocontrolVerifyApi = (ScootersPhotocontrolVerifyApi) scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2;
                    kotlin.b.b(obj);
                    cmt<zy11> a2 = scootersPhotocontrolVerifyApi.a(map, str3, (m5j0) obj);
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$3 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$4 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.label = 3;
                }
                Map<String, String> map2 = (Map) a;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersPhotocontrolUploadRepository$uploadPhoto$2 scootersPhotocontrolUploadRepository$uploadPhoto$2 = new ScootersPhotocontrolUploadRepository$uploadPhoto$2(this, uri, null);
                scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0 = null;
                scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1 = null;
                scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2 = scootersPhotocontrolVerifyApi;
                scootersPhotocontrolUploadRepository$uploadPhoto$1.L$3 = map2;
                scootersPhotocontrolUploadRepository$uploadPhoto$1.L$4 = str2;
                scootersPhotocontrolUploadRepository$uploadPhoto$1.label = 2;
                k0 = tje.k0(mdhVar, scootersPhotocontrolUploadRepository$uploadPhoto$2, scootersPhotocontrolUploadRepository$uploadPhoto$1);
                if (k0 != coroutineSingletons) {
                    String str5 = str2;
                    obj = k0;
                    str3 = str5;
                    map = map2;
                    cmt<zy11> a22 = scootersPhotocontrolVerifyApi.a(map, str3, (m5j0) obj);
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$3 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.L$4 = null;
                    scootersPhotocontrolUploadRepository$uploadPhoto$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        scootersPhotocontrolUploadRepository$uploadPhoto$1 = new ScootersPhotocontrolUploadRepository$uploadPhoto$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolUploadRepository$uploadPhoto$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolUploadRepository$uploadPhoto$1.label;
        if (i != 0) {
        }
        Map<String, String> map22 = (Map) a;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersPhotocontrolUploadRepository$uploadPhoto$2 scootersPhotocontrolUploadRepository$uploadPhoto$22 = new ScootersPhotocontrolUploadRepository$uploadPhoto$2(this, uri, null);
        scootersPhotocontrolUploadRepository$uploadPhoto$1.L$0 = null;
        scootersPhotocontrolUploadRepository$uploadPhoto$1.L$1 = null;
        scootersPhotocontrolUploadRepository$uploadPhoto$1.L$2 = scootersPhotocontrolVerifyApi;
        scootersPhotocontrolUploadRepository$uploadPhoto$1.L$3 = map22;
        scootersPhotocontrolUploadRepository$uploadPhoto$1.L$4 = str2;
        scootersPhotocontrolUploadRepository$uploadPhoto$1.label = 2;
        k0 = tje.k0(mdhVar2, scootersPhotocontrolUploadRepository$uploadPhoto$22, scootersPhotocontrolUploadRepository$uploadPhoto$1);
        if (k0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
