package com.yandex.go.lootbox.impl.data.repository.animation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import com.yandex.go.lootbox.impl.data.api.LootBoxApi;
import defpackage.bpz;
import defpackage.cmt;
import defpackage.epz;
import defpackage.fmt;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rvj0;
import defpackage.tls;
import defpackage.x6v;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class a {
    public final LootBoxApi a;
    public final epz b;
    public final bpz c;

    public a(LootBoxApi lootBoxApi, epz epzVar, bpz bpzVar) {
        this.a = lootBoxApi;
        this.b = epzVar;
        this.c = bpzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, LootBoxAnimationType lootBoxAnimationType, String str2, tls tlsVar, ContinuationImpl continuationImpl) {
        LootBoxAnimationRepositoryImpl$loadAnimationAndSave$1 lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        String str3;
        try {
            if (continuationImpl instanceof LootBoxAnimationRepositoryImpl$loadAnimationAndSave$1) {
                lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1 = (LootBoxAnimationRepositoryImpl$loadAnimationAndSave$1) continuationImpl;
                int i2 = lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.label;
                    if (i != 0) {
                        Ref$ObjectRef z = qv10.z(obj);
                        try {
                            cmt<rvj0> a = this.a.a(str2, x6v.a);
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$0 = str;
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$1 = lootBoxAnimationType;
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$2 = str2;
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$3 = tlsVar;
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$4 = z;
                            lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.label = 1;
                            Object b = ru.yandex.taxi.network.api.a.b(a, null, lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str3 = str;
                            ref$ObjectRef = z;
                            obj = b;
                        } catch (Throwable th) {
                            th = th;
                            ref$ObjectRef = z;
                            tlsVar.invoke(th);
                            jst.e.j(th);
                            return ref$ObjectRef.element;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef = (Ref$ObjectRef) lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$4;
                        tlsVar = (tls) lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$3;
                        str2 = (String) lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$2;
                        lootBoxAnimationType = (LootBoxAnimationType) lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$1;
                        str3 = (String) lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.L$0;
                        try {
                            b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            tlsVar.invoke(th);
                            jst.e.j(th);
                            return ref$ObjectRef.element;
                        }
                    }
                    ?? byteStream = ((rvj0) ((fmt) obj).a).byteStream();
                    this.c.d(str3, lootBoxAnimationType, byteStream);
                    this.b.a.r(str3 + "_" + lootBoxAnimationType.getCacheKey(), str2);
                    ref$ObjectRef.element = byteStream;
                    return ref$ObjectRef.element;
                }
            }
            if (i != 0) {
            }
            ?? byteStream2 = ((rvj0) ((fmt) obj).a).byteStream();
            this.c.d(str3, lootBoxAnimationType, byteStream2);
            this.b.a.r(str3 + "_" + lootBoxAnimationType.getCacheKey(), str2);
            ref$ObjectRef.element = byteStream2;
            return ref$ObjectRef.element;
        } catch (CancellationException e) {
            throw e;
        }
        lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1 = new LootBoxAnimationRepositoryImpl$loadAnimationAndSave$1(this, continuationImpl);
        Object obj2 = lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationRepositoryImpl$loadAnimationAndSave$1.label;
    }
}
