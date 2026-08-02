package com.yandex.go.eboks.objects.data.mapper;

import android.graphics.PointF;
import com.yandex.go.eboks.objects.data.model.EboksType;
import com.yandex.go.eboks.objects.data.model.EboksTypeStyle;
import com.yandex.go.eboks.objects.data.model.EboksTypeStyleImage;
import com.yandex.runtime.image.ImageProvider;
import defpackage.m2a1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qhn;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.eboks.objects.data.b a;

    public c(com.yandex.go.eboks.objects.data.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tse tseVar, EboksType eboksType, ContinuationImpl continuationImpl) {
        EboksObjectsStyleMapper$mapToStyle$1 eboksObjectsStyleMapper$mapToStyle$1;
        int i;
        EboksTypeStyleImage eboksTypeStyleImage;
        PointF pointF;
        String str;
        noh nohVar;
        List list;
        Float f;
        PointF pointF2;
        ImageProvider imageProvider;
        List list2;
        ImageProvider imageProvider2;
        PointF pointF3;
        String str2;
        PointF pointF4;
        ImageProvider imageProvider3;
        Float f2;
        List list3;
        ImageProvider imageProvider4;
        PointF pointF5;
        if (continuationImpl instanceof EboksObjectsStyleMapper$mapToStyle$1) {
            eboksObjectsStyleMapper$mapToStyle$1 = (EboksObjectsStyleMapper$mapToStyle$1) continuationImpl;
            int i2 = eboksObjectsStyleMapper$mapToStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsStyleMapper$mapToStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsStyleMapper$mapToStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsStyleMapper$mapToStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = eboksType.a;
                    EboksTypeStyle eboksTypeStyle = eboksType.e;
                    if (str3 == null) {
                        m2a1.c("Eboks type in types list is null");
                        return null;
                    }
                    if (eboksTypeStyle != null && (eboksTypeStyleImage = eboksTypeStyle.a) != null && eboksTypeStyleImage.a != null) {
                        qoh h = tje.h(tseVar, null, null, new EboksObjectsStyleMapper$mapToStyle$imageDeferred$1(this, eboksType, null), 3);
                        String str4 = eboksTypeStyleImage.b;
                        qoh h2 = str4 != null ? tje.h(tseVar, null, null, new EboksObjectsStyleMapper$mapToStyle$selectedImageDeferred$1$1(this, str4, null), 3) : null;
                        float[] fArr = eboksTypeStyleImage.c;
                        pointF = fArr != null ? new PointF(fArr[0], fArr[1]) : new PointF(0.5f, 0.5f);
                        float[] fArr2 = eboksTypeStyleImage.d;
                        PointF pointF6 = fArr2 != null ? new PointF(fArr2[0], fArr2[1]) : pointF;
                        List b = m2a1.b(eboksType);
                        str = eboksType.a;
                        Float f3 = eboksTypeStyle.c;
                        eboksObjectsStyleMapper$mapToStyle$1.L$0 = null;
                        eboksObjectsStyleMapper$mapToStyle$1.L$1 = null;
                        eboksObjectsStyleMapper$mapToStyle$1.L$2 = null;
                        eboksObjectsStyleMapper$mapToStyle$1.L$3 = h2;
                        eboksObjectsStyleMapper$mapToStyle$1.L$4 = pointF;
                        eboksObjectsStyleMapper$mapToStyle$1.L$5 = pointF6;
                        eboksObjectsStyleMapper$mapToStyle$1.L$6 = b;
                        eboksObjectsStyleMapper$mapToStyle$1.L$7 = str;
                        eboksObjectsStyleMapper$mapToStyle$1.L$8 = f3;
                        eboksObjectsStyleMapper$mapToStyle$1.label = 1;
                        Object s = h.s(eboksObjectsStyleMapper$mapToStyle$1);
                        if (s != coroutineSingletons) {
                            nohVar = h2;
                            list = b;
                            f = f3;
                            pointF2 = pointF6;
                            obj = s;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imageProvider4 = (ImageProvider) eboksObjectsStyleMapper$mapToStyle$1.L$9;
                    f = (Float) eboksObjectsStyleMapper$mapToStyle$1.L$8;
                    str = (String) eboksObjectsStyleMapper$mapToStyle$1.L$7;
                    list3 = (List) eboksObjectsStyleMapper$mapToStyle$1.L$6;
                    pointF2 = (PointF) eboksObjectsStyleMapper$mapToStyle$1.L$5;
                    pointF5 = (PointF) eboksObjectsStyleMapper$mapToStyle$1.L$4;
                    kotlin.b.b(obj);
                    imageProvider2 = imageProvider4;
                    list2 = list3;
                    pointF3 = pointF5;
                    f2 = f;
                    str2 = str;
                    pointF4 = pointF2;
                    imageProvider3 = (ImageProvider) obj;
                    return new qhn(str2, f2, list2, pointF3, imageProvider2, pointF4, imageProvider3);
                }
                Float f4 = (Float) eboksObjectsStyleMapper$mapToStyle$1.L$8;
                String str5 = (String) eboksObjectsStyleMapper$mapToStyle$1.L$7;
                List list4 = (List) eboksObjectsStyleMapper$mapToStyle$1.L$6;
                pointF2 = (PointF) eboksObjectsStyleMapper$mapToStyle$1.L$5;
                PointF pointF7 = (PointF) eboksObjectsStyleMapper$mapToStyle$1.L$4;
                nohVar = (noh) eboksObjectsStyleMapper$mapToStyle$1.L$3;
                kotlin.b.b(obj);
                f = f4;
                list = list4;
                str = str5;
                pointF = pointF7;
                imageProvider = (ImageProvider) obj;
                if (imageProvider != null) {
                    if (nohVar == null) {
                        list2 = list;
                        imageProvider2 = imageProvider;
                        pointF3 = pointF;
                        str2 = str;
                        pointF4 = pointF2;
                        imageProvider3 = null;
                        f2 = f;
                        return new qhn(str2, f2, list2, pointF3, imageProvider2, pointF4, imageProvider3);
                    }
                    eboksObjectsStyleMapper$mapToStyle$1.L$0 = null;
                    eboksObjectsStyleMapper$mapToStyle$1.L$1 = null;
                    eboksObjectsStyleMapper$mapToStyle$1.L$2 = null;
                    eboksObjectsStyleMapper$mapToStyle$1.L$3 = null;
                    eboksObjectsStyleMapper$mapToStyle$1.L$4 = pointF;
                    eboksObjectsStyleMapper$mapToStyle$1.L$5 = pointF2;
                    eboksObjectsStyleMapper$mapToStyle$1.L$6 = list;
                    eboksObjectsStyleMapper$mapToStyle$1.L$7 = str;
                    eboksObjectsStyleMapper$mapToStyle$1.L$8 = f;
                    eboksObjectsStyleMapper$mapToStyle$1.L$9 = imageProvider;
                    eboksObjectsStyleMapper$mapToStyle$1.label = 2;
                    Object k = nohVar.k(eboksObjectsStyleMapper$mapToStyle$1);
                    if (k != coroutineSingletons) {
                        list3 = list;
                        imageProvider4 = imageProvider;
                        obj = k;
                        pointF5 = pointF;
                        imageProvider2 = imageProvider4;
                        list2 = list3;
                        pointF3 = pointF5;
                        f2 = f;
                        str2 = str;
                        pointF4 = pointF2;
                        imageProvider3 = (ImageProvider) obj;
                        return new qhn(str2, f2, list2, pointF3, imageProvider2, pointF4, imageProvider3);
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        eboksObjectsStyleMapper$mapToStyle$1 = new EboksObjectsStyleMapper$mapToStyle$1(this, continuationImpl);
        Object obj2 = eboksObjectsStyleMapper$mapToStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsStyleMapper$mapToStyle$1.label;
        if (i != 0) {
        }
        imageProvider = (ImageProvider) obj2;
        if (imageProvider != null) {
        }
        return null;
    }
}
