package com.yandex.go.superapp.impl.interactor;

import android.util.Base64;
import defpackage.evu0;
import defpackage.fw4;
import defpackage.gvq0;
import defpackage.kb20;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.uza;
import defpackage.wnt;
import defpackage.xnt;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes14.dex */
public final class d {
    public final kb20 a;
    public final wnt b;
    public final c c;
    public final fw4 d;

    public d(kb20 kb20Var, wnt wntVar, c cVar, fw4 fw4Var) {
        this.a = kb20Var;
        this.b = wntVar;
        this.c = cVar;
        this.d = fw4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        SuperappCommonHeadersInteractorImpl$getCommonHeaders$1 superappCommonHeadersInteractorImpl$getCommonHeaders$1;
        int i;
        Map map;
        String str;
        Map map2;
        if (continuationImpl instanceof SuperappCommonHeadersInteractorImpl$getCommonHeaders$1) {
            superappCommonHeadersInteractorImpl$getCommonHeaders$1 = (SuperappCommonHeadersInteractorImpl$getCommonHeaders$1) continuationImpl;
            int i2 = superappCommonHeadersInteractorImpl$getCommonHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappCommonHeadersInteractorImpl$getCommonHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappCommonHeadersInteractorImpl$getCommonHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappCommonHeadersInteractorImpl$getCommonHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Map mapBuilder = new MapBuilder();
                    kb20 kb20Var = this.a;
                    String b = kb20Var.b();
                    if (!evu0.J(b)) {
                        mapBuilder.put("X-AppMetrica-UUID", b);
                    }
                    String a = kb20Var.a();
                    if (a != null && !evu0.J(a)) {
                        mapBuilder.put("X-AppMetrica-DeviceId", a);
                    }
                    String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(ofp0.a)}, 1));
                    mapBuilder.put("x-device-viewport", ofp0.e + RemoteBioParameters.X + ofp0.d + "@" + format);
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$0 = mapBuilder;
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$1 = null;
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$2 = null;
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$3 = null;
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$4 = "x-eatskit-context";
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$5 = mapBuilder;
                    superappCommonHeadersInteractorImpl$getCommonHeaders$1.label = 1;
                    Object b2 = b(superappCommonHeadersInteractorImpl$getCommonHeaders$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = mapBuilder;
                    str = "x-eatskit-context";
                    obj = b2;
                    map2 = map;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$5;
                    str = (String) superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$4;
                    map = (Map) superappCommonHeadersInteractorImpl$getCommonHeaders$1.L$0;
                    kotlin.b.b(obj);
                }
                map2.put(str, obj);
                return ((MapBuilder) map).j();
            }
        }
        superappCommonHeadersInteractorImpl$getCommonHeaders$1 = new SuperappCommonHeadersInteractorImpl$getCommonHeaders$1(this, continuationImpl);
        Object obj2 = superappCommonHeadersInteractorImpl$getCommonHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappCommonHeadersInteractorImpl$getCommonHeaders$1.label;
        if (i != 0) {
        }
        map2.put(str, obj2);
        return ((MapBuilder) map).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1 superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1;
        int i;
        if (continuationImpl instanceof SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1) {
            superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1 = (SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1) continuationImpl;
            int i2 = superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.label = 1;
                    obj = this.c.a(superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1);
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
                KSerializer serializer = gvq0.Companion.serializer();
                String e = ((xnt) this.b).e((gvq0) obj, serializer);
                this.d.getClass();
                return Base64.encodeToString(e.getBytes(uza.a), 2);
            }
        }
        superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1 = new SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1(this, continuationImpl);
        Object obj2 = superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1.label;
        if (i != 0) {
        }
        KSerializer serializer2 = gvq0.Companion.serializer();
        String e2 = ((xnt) this.b).e((gvq0) obj2, serializer2);
        this.d.getClass();
        return Base64.encodeToString(e2.getBytes(uza.a), 2);
    }
}
