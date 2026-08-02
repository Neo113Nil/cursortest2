package com.yandex.go.eboks.objects.data.mapper;

import android.graphics.PointF;
import com.yandex.go.eboks.objects.data.model.EboksObject;
import com.yandex.go.eboks.objects.data.model.EboksType;
import com.yandex.go.eboks.objects.data.model.EboksTypeOverlay;
import com.yandex.runtime.image.ImageProvider;
import defpackage.g8e;
import defpackage.m2a1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qhn;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class b {
    public final ru.yandex.taxi.widget.c a;
    public final com.yandex.go.eboks.objects.data.b b;

    public b(ru.yandex.taxi.widget.c cVar, com.yandex.go.eboks.objects.data.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:
    
        if ((r2 != null ? r2.e : null) == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tse tseVar, EboksType eboksType, EboksObject eboksObject, ContinuationImpl continuationImpl) {
        EboksObjectsOverlayMapper$mapOverlay$1 eboksObjectsOverlayMapper$mapOverlay$1;
        int i;
        String str;
        tse tseVar2;
        FormattedText formattedText;
        EboksType eboksType2;
        CharSequence charSequence;
        CharSequence charSequence2;
        EboksType eboksType3;
        CharSequence charSequence3;
        tse tseVar3;
        PointF pointF;
        noh h;
        List b;
        String str2;
        PointF pointF2;
        PointF pointF3;
        List list;
        ImageProvider imageProvider;
        List list2;
        ImageProvider imageProvider2;
        EboksType eboksType4 = eboksType;
        if (continuationImpl instanceof EboksObjectsOverlayMapper$mapOverlay$1) {
            eboksObjectsOverlayMapper$mapOverlay$1 = (EboksObjectsOverlayMapper$mapOverlay$1) continuationImpl;
            int i2 = eboksObjectsOverlayMapper$mapOverlay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsOverlayMapper$mapOverlay$1.label = i2 - Integer.MIN_VALUE;
                EboksObjectsOverlayMapper$mapOverlay$1 eboksObjectsOverlayMapper$mapOverlay$12 = eboksObjectsOverlayMapper$mapOverlay$1;
                Object obj = eboksObjectsOverlayMapper$mapOverlay$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsOverlayMapper$mapOverlay$12.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                ImageProvider imageProvider3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (eboksType4 != null) {
                        EboksTypeOverlay eboksTypeOverlay = eboksType4.f;
                        if (eboksTypeOverlay == null || eboksTypeOverlay.a == null) {
                            if ((eboksTypeOverlay != null ? eboksTypeOverlay.c : null) == null) {
                            }
                        }
                        if (eboksType4.a == null) {
                            m2a1.c("Eboks type in types list is null");
                            return null;
                        }
                        if (eboksTypeOverlay == null || eboksTypeOverlay.a == null) {
                            m2a1.c("Overlay anchor is null");
                            return null;
                        }
                        if (eboksTypeOverlay.c == null) {
                            m2a1.c("Overlay color is null");
                            return null;
                        }
                        FormattedText formattedText2 = eboksTypeOverlay.e;
                        if (formattedText2 == null) {
                            m2a1.c("Overlay text is null");
                            return null;
                        }
                        str = eboksObject.c;
                        if (str == null) {
                            m2a1.c("Overlay text substitution is null");
                            return null;
                        }
                        Map z = g8e.z("", str);
                        eboksObjectsOverlayMapper$mapOverlay$12.L$0 = tseVar;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$1 = eboksType4;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$3 = str;
                        eboksObjectsOverlayMapper$mapOverlay$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, z, eboksObjectsOverlayMapper$mapOverlay$12, 28);
                        if (obj != coroutineSingletons) {
                            tseVar2 = tseVar;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence3 = (CharSequence) eboksObjectsOverlayMapper$mapOverlay$12.L$4;
                        eboksType3 = (EboksType) eboksObjectsOverlayMapper$mapOverlay$12.L$1;
                        tseVar3 = (tse) eboksObjectsOverlayMapper$mapOverlay$12.L$0;
                        kotlin.b.b(obj);
                        eboksType2 = eboksType3;
                        tseVar2 = tseVar3;
                        charSequence = charSequence3;
                        charSequence2 = (CharSequence) obj;
                        EboksTypeOverlay eboksTypeOverlay2 = eboksType2.f;
                        float[] fArr = eboksTypeOverlay2.a;
                        PointF pointF4 = new PointF(fArr[0], fArr[1]);
                        float[] fArr2 = eboksTypeOverlay2.b;
                        pointF = fArr2 != null ? new PointF(fArr2[0], fArr2[1]) : null;
                        qoh h2 = tje.h(tseVar2, null, null, new EboksObjectsOverlayMapper$mapOverlay$imageDef$1(this, eboksType2, charSequence, null), 3);
                        String str3 = eboksTypeOverlay2.d;
                        h = str3 != null ? tje.h(tseVar2, null, null, new EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1(this, str3, charSequence2, charSequence, null), 3) : null;
                        b = m2a1.b(eboksType2);
                        String str4 = eboksType2.a;
                        if (pointF == null) {
                            pointF = pointF4;
                        }
                        eboksObjectsOverlayMapper$mapOverlay$12.L$0 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$1 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$3 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$4 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$5 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$6 = pointF4;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$7 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$8 = null;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$9 = h;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$10 = b;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$11 = str4;
                        eboksObjectsOverlayMapper$mapOverlay$12.L$12 = pointF;
                        eboksObjectsOverlayMapper$mapOverlay$12.label = 3;
                        obj = h2.s(eboksObjectsOverlayMapper$mapOverlay$12);
                        if (obj != coroutineSingletons) {
                            str2 = str4;
                            pointF2 = pointF4;
                            pointF3 = pointF;
                            ImageProvider imageProvider4 = (ImageProvider) obj;
                            if (h != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        imageProvider2 = (ImageProvider) eboksObjectsOverlayMapper$mapOverlay$12.L$13;
                        pointF3 = (PointF) eboksObjectsOverlayMapper$mapOverlay$12.L$12;
                        str2 = (String) eboksObjectsOverlayMapper$mapOverlay$12.L$11;
                        list2 = (List) eboksObjectsOverlayMapper$mapOverlay$12.L$10;
                        pointF2 = (PointF) eboksObjectsOverlayMapper$mapOverlay$12.L$6;
                        kotlin.b.b(obj);
                        imageProvider3 = (ImageProvider) obj;
                        imageProvider = imageProvider2;
                        list = list2;
                        return new qhn(str2, null, list, pointF2, imageProvider, pointF3, imageProvider3);
                    }
                    PointF pointF5 = (PointF) eboksObjectsOverlayMapper$mapOverlay$12.L$12;
                    String str5 = (String) eboksObjectsOverlayMapper$mapOverlay$12.L$11;
                    List list3 = (List) eboksObjectsOverlayMapper$mapOverlay$12.L$10;
                    h = (noh) eboksObjectsOverlayMapper$mapOverlay$12.L$9;
                    pointF2 = (PointF) eboksObjectsOverlayMapper$mapOverlay$12.L$6;
                    kotlin.b.b(obj);
                    pointF3 = pointF5;
                    b = list3;
                    str2 = str5;
                    ImageProvider imageProvider42 = (ImageProvider) obj;
                    if (h != null) {
                        list = b;
                        imageProvider = imageProvider42;
                        return new qhn(str2, null, list, pointF2, imageProvider, pointF3, imageProvider3);
                    }
                    eboksObjectsOverlayMapper$mapOverlay$12.L$0 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$1 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$3 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$4 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$5 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$6 = pointF2;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$7 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$8 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$9 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$10 = b;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$11 = str2;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$12 = pointF3;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$13 = imageProvider42;
                    eboksObjectsOverlayMapper$mapOverlay$12.label = 4;
                    Object k = h.k(eboksObjectsOverlayMapper$mapOverlay$12);
                    if (k != coroutineSingletons) {
                        list2 = b;
                        imageProvider2 = imageProvider42;
                        obj = k;
                        imageProvider3 = (ImageProvider) obj;
                        imageProvider = imageProvider2;
                        list = list2;
                        return new qhn(str2, null, list, pointF2, imageProvider, pointF3, imageProvider3);
                    }
                    return coroutineSingletons;
                }
                String str6 = (String) eboksObjectsOverlayMapper$mapOverlay$12.L$3;
                EboksType eboksType5 = (EboksType) eboksObjectsOverlayMapper$mapOverlay$12.L$1;
                tseVar2 = (tse) eboksObjectsOverlayMapper$mapOverlay$12.L$0;
                kotlin.b.b(obj);
                str = str6;
                eboksType4 = eboksType5;
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = eboksType4.f.f;
                if (formattedText != null) {
                    eboksType2 = eboksType4;
                    charSequence = charSequence4;
                    charSequence2 = null;
                    EboksTypeOverlay eboksTypeOverlay22 = eboksType2.f;
                    float[] fArr3 = eboksTypeOverlay22.a;
                    PointF pointF42 = new PointF(fArr3[0], fArr3[1]);
                    float[] fArr22 = eboksTypeOverlay22.b;
                    if (fArr22 != null) {
                    }
                    qoh h22 = tje.h(tseVar2, null, null, new EboksObjectsOverlayMapper$mapOverlay$imageDef$1(this, eboksType2, charSequence, null), 3);
                    String str32 = eboksTypeOverlay22.d;
                    if (str32 != null) {
                    }
                    b = m2a1.b(eboksType2);
                    String str42 = eboksType2.a;
                    if (pointF == null) {
                    }
                    eboksObjectsOverlayMapper$mapOverlay$12.L$0 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$1 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$3 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$4 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$5 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$6 = pointF42;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$7 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$8 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$9 = h;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$10 = b;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$11 = str42;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$12 = pointF;
                    eboksObjectsOverlayMapper$mapOverlay$12.label = 3;
                    obj = h22.s(eboksObjectsOverlayMapper$mapOverlay$12);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                Map z2 = g8e.z("", str);
                eboksObjectsOverlayMapper$mapOverlay$12.L$0 = tseVar2;
                eboksObjectsOverlayMapper$mapOverlay$12.L$1 = eboksType4;
                eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                eboksObjectsOverlayMapper$mapOverlay$12.L$3 = null;
                eboksObjectsOverlayMapper$mapOverlay$12.L$4 = charSequence4;
                eboksObjectsOverlayMapper$mapOverlay$12.L$5 = null;
                eboksObjectsOverlayMapper$mapOverlay$12.label = 2;
                Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, z2, eboksObjectsOverlayMapper$mapOverlay$12, 28);
                if (i3 != coroutineSingletons) {
                    eboksType3 = eboksType4;
                    charSequence3 = charSequence4;
                    obj = i3;
                    tseVar3 = tseVar2;
                    eboksType2 = eboksType3;
                    tseVar2 = tseVar3;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    EboksTypeOverlay eboksTypeOverlay222 = eboksType2.f;
                    float[] fArr32 = eboksTypeOverlay222.a;
                    PointF pointF422 = new PointF(fArr32[0], fArr32[1]);
                    float[] fArr222 = eboksTypeOverlay222.b;
                    if (fArr222 != null) {
                    }
                    qoh h222 = tje.h(tseVar2, null, null, new EboksObjectsOverlayMapper$mapOverlay$imageDef$1(this, eboksType2, charSequence, null), 3);
                    String str322 = eboksTypeOverlay222.d;
                    if (str322 != null) {
                    }
                    b = m2a1.b(eboksType2);
                    String str422 = eboksType2.a;
                    if (pointF == null) {
                    }
                    eboksObjectsOverlayMapper$mapOverlay$12.L$0 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$1 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$2 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$3 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$4 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$5 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$6 = pointF422;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$7 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$8 = null;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$9 = h;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$10 = b;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$11 = str422;
                    eboksObjectsOverlayMapper$mapOverlay$12.L$12 = pointF;
                    eboksObjectsOverlayMapper$mapOverlay$12.label = 3;
                    obj = h222.s(eboksObjectsOverlayMapper$mapOverlay$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        eboksObjectsOverlayMapper$mapOverlay$1 = new EboksObjectsOverlayMapper$mapOverlay$1(this, continuationImpl);
        EboksObjectsOverlayMapper$mapOverlay$1 eboksObjectsOverlayMapper$mapOverlay$122 = eboksObjectsOverlayMapper$mapOverlay$1;
        Object obj2 = eboksObjectsOverlayMapper$mapOverlay$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsOverlayMapper$mapOverlay$122.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        ImageProvider imageProvider32 = null;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = eboksType4.f.f;
        if (formattedText != null) {
        }
    }
}
