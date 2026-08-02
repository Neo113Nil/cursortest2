package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr;

import android.content.Intent;
import android.net.Uri;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dms;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.ha1;
import defpackage.j18;
import defpackage.kz11;
import defpackage.lz11;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oav0;
import defpackage.oep0;
import defpackage.tt2;
import defpackage.uj;
import defpackage.v770;
import defpackage.vu2;
import defpackage.x5u;
import defpackage.yz11;
import defpackage.z0h;
import defpackage.z5u;
import defpackage.zls;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final oep0 b;
    public final ha1 c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final lz11 h;
    public final yz11 i;

    public a(tt2 tt2Var, oep0 oep0Var, ha1 ha1Var, Set set, Set set2, Set set3, Set set4, lz11 lz11Var, yz11 yz11Var) {
        this.a = tt2Var;
        this.b = oep0Var;
        this.c = ha1Var;
        this.d = set;
        this.e = set2;
        this.f = set3;
        this.g = set4;
        this.h = lz11Var;
        this.i = yz11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01c8, code lost:
    
        if (r6 == r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, uj] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x01c8 -> B:13:0x01cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x018e -> B:28:0x0190). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c8 -> B:42:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Uri uri, ContinuationImpl continuationImpl) {
        UniversalQrScannerDeeplinkHandler$tryHandleDeeplink$1 universalQrScannerDeeplinkHandler$tryHandleDeeplink$1;
        int i;
        Iterator it;
        Uri uri2;
        Uri uri3;
        Uri data;
        Uri uri4;
        Uri uri5;
        Iterator it2;
        Iterator it3;
        Uri uri6;
        oep0 oep0Var = aVar.b;
        if (continuationImpl instanceof UniversalQrScannerDeeplinkHandler$tryHandleDeeplink$1) {
            universalQrScannerDeeplinkHandler$tryHandleDeeplink$1 = (UniversalQrScannerDeeplinkHandler$tryHandleDeeplink$1) continuationImpl;
            int i2 = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = aVar.d.iterator();
                    uri2 = uri;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    it = (Iterator) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2;
                    Uri uri7 = (Uri) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    o5u o5uVar = (o5u) obj;
                    if (!(o5uVar instanceof m5u)) {
                        return o5uVar;
                    }
                    uri2 = uri7;
                    if (it.hasNext()) {
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0 = uri2;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$1 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$3 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label = 2;
                        j18 j18Var = new j18(1, dvw.b(universalQrScannerDeeplinkHandler$tryHandleDeeplink$1));
                        Ref$ObjectRef y = b64.y(j18Var);
                        cx60 cx60Var = new cx60(13, y);
                        cl7 cl7Var = new cl7(j18Var, cx60Var);
                        UniversalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2 universalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2 = new UniversalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                        Intent intent = new Intent();
                        intent.setData(uri2);
                        intent.setAction("android.intent.action.VIEW");
                        aVar.c.b(intent, new oav0(5, universalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2));
                        y.element = uj.J;
                        if (cl7Var.c()) {
                            cx60Var.invoke();
                        } else {
                            j18Var.w(new dx60(cl7Var, 14));
                        }
                        Object s = j18Var.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s != coroutineSingletons) {
                            uri3 = uri2;
                            obj = s;
                            data = ((Intent) obj).getData();
                            if (data != null) {
                            }
                            return n5u.a;
                        }
                    } else {
                        zls a = ru.yandex.taxi.deeplinks.a.a((vu2) it.next());
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0 = uri2;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$1 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2 = it;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$3 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label = 1;
                        Object invoke = a.invoke(oep0Var, uri2, universalQrScannerDeeplinkHandler$tryHandleDeeplink$1);
                        if (invoke != coroutineSingletons) {
                            uri7 = uri2;
                            obj = invoke;
                            o5u o5uVar2 = (o5u) obj;
                            if (!(o5uVar2 instanceof m5u)) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    uri3 = (Uri) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    data = ((Intent) obj).getData();
                    if (data != null) {
                        uri4 = data;
                        uri5 = uri3;
                        it2 = aVar.f.iterator();
                        if (it2.hasNext()) {
                        }
                    }
                    return n5u.a;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it3 = (Iterator) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4;
                    uri6 = (Uri) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    Object invoke2 = obj;
                    if (((z5u) invoke2) instanceof x5u) {
                        return new m5u(false, false);
                    }
                    if (it3.hasNext()) {
                        UniversalQrScannerDeeplinkHandlerKt$processQrLink$1 universalQrScannerDeeplinkHandlerKt$processQrLink$1 = new UniversalQrScannerDeeplinkHandlerKt$processQrLink$1((kz11) it3.next(), null);
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0 = uri6;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$1 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$3 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4 = it3;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$5 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$6 = null;
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label = 4;
                        invoke2 = universalQrScannerDeeplinkHandlerKt$processQrLink$1.invoke(oep0Var, uri6, universalQrScannerDeeplinkHandler$tryHandleDeeplink$1);
                    }
                    return n5u.a;
                }
                it2 = (Iterator) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4;
                Uri uri8 = (Uri) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2;
                uri5 = (Uri) universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0;
                kotlin.b.b(obj);
                uri4 = uri8;
                o5u o5uVar3 = (o5u) obj;
                if (o5uVar3 instanceof m5u) {
                    return o5uVar3;
                }
                if (it2.hasNext()) {
                    dms b = ru.yandex.taxi.deeplinks.a.b((z0h) it2.next());
                    oep0 oep0Var2 = aVar.b;
                    DeeplinkSource deeplinkSource = DeeplinkSource.UNSPECIFIED;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$0 = uri5;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$1 = null;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$2 = uri4;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$3 = null;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$4 = it2;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$5 = null;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.L$6 = null;
                    universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label = 3;
                    UniversalQrScannerDeeplinkHandler$tryHandleDeeplink$1 universalQrScannerDeeplinkHandler$tryHandleDeeplink$12 = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1;
                    obj = b.invoke(oep0Var2, uri4, v770.b, deeplinkSource, universalQrScannerDeeplinkHandler$tryHandleDeeplink$12);
                    if (obj != coroutineSingletons) {
                        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1 = universalQrScannerDeeplinkHandler$tryHandleDeeplink$12;
                        o5u o5uVar32 = (o5u) obj;
                        if (o5uVar32 instanceof m5u) {
                        }
                        if (it2.hasNext()) {
                            it3 = aVar.e.iterator();
                            uri6 = uri5;
                            if (it3.hasNext()) {
                            }
                            return n5u.a;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        }
        universalQrScannerDeeplinkHandler$tryHandleDeeplink$1 = new UniversalQrScannerDeeplinkHandler$tryHandleDeeplink$1(aVar, continuationImpl);
        Object obj2 = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerDeeplinkHandler$tryHandleDeeplink$1.label;
        if (i != 0) {
        }
    }
}
