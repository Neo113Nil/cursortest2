package com.yandex.go.scooters.data;

import defpackage.abn0;
import defpackage.ah00;
import defpackage.blh;
import defpackage.c0e;
import defpackage.gh00;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zan0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final ah00 a;
    public final ScootersConfigApi b;
    public final ru.yandex.taxi.scooters.data.a c;
    public final abn0 d;
    public final blh e;

    public b(ah00 ah00Var, ScootersConfigApi scootersConfigApi, ru.yandex.taxi.scooters.data.a aVar, abn0 abn0Var, blh blhVar, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = scootersConfigApi;
        this.c = aVar;
        this.d = abn0Var;
        this.e = blhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersConfigRepository$getConfig$1 scootersConfigRepository$getConfig$1;
        int i;
        if (continuationImpl instanceof ScootersConfigRepository$getConfig$1) {
            scootersConfigRepository$getConfig$1 = (ScootersConfigRepository$getConfig$1) continuationImpl;
            int i2 = scootersConfigRepository$getConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersConfigRepository$getConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersConfigRepository$getConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersConfigRepository$getConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersConfigRepository$getConfig$1.L$0 = str;
                    scootersConfigRepository$getConfig$1.label = 1;
                    obj = this.c.a(false, scootersConfigRepository$getConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        zan0 zan0Var = (zan0) obj;
                        this.d.l(zan0Var);
                        return zan0Var;
                    }
                    str = (String) scootersConfigRepository$getConfig$1.L$0;
                    kotlin.b.b(obj);
                }
                c0e c0eVar = new c0e(str, ((gh00) this.a).e.b(), null);
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersConfigRepository$getConfig$response$1 scootersConfigRepository$getConfig$response$1 = new ScootersConfigRepository$getConfig$response$1(this, (Map) obj, c0eVar, null);
                scootersConfigRepository$getConfig$1.L$0 = null;
                scootersConfigRepository$getConfig$1.L$1 = null;
                scootersConfigRepository$getConfig$1.L$2 = null;
                scootersConfigRepository$getConfig$1.label = 2;
                obj = tje.k0(mdhVar, scootersConfigRepository$getConfig$response$1, scootersConfigRepository$getConfig$1);
            }
        }
        scootersConfigRepository$getConfig$1 = new ScootersConfigRepository$getConfig$1(this, continuationImpl);
        Object obj2 = scootersConfigRepository$getConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersConfigRepository$getConfig$1.label;
        if (i != 0) {
        }
        c0e c0eVar2 = new c0e(str, ((gh00) this.a).e.b(), null);
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersConfigRepository$getConfig$response$1 scootersConfigRepository$getConfig$response$12 = new ScootersConfigRepository$getConfig$response$1(this, (Map) obj2, c0eVar2, null);
        scootersConfigRepository$getConfig$1.L$0 = null;
        scootersConfigRepository$getConfig$1.L$1 = null;
        scootersConfigRepository$getConfig$1.L$2 = null;
        scootersConfigRepository$getConfig$1.label = 2;
        obj2 = tje.k0(mdhVar2, scootersConfigRepository$getConfig$response$12, scootersConfigRepository$getConfig$1);
    }
}
