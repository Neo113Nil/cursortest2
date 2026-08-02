package com.yandex.mob.am;

import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportLocation;
import com.yandex.passport.internal.network.UrlOverride;
import com.yandex.passport.internal.network.p;
import com.yandex.passport.internal.properties.UpdateableProperties;
import com.yandex.passport.internal.properties.z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xn90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ com.yandex.passport.api.b a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ KPassportEnvironment c;
    public final /* synthetic */ xn90 w;

    public a(com.yandex.passport.api.b bVar, Map map, KPassportEnvironment kPassportEnvironment, xn90 xn90Var) {
        this.a = bVar;
        this.b = map;
        this.c = kPassportEnvironment;
        this.w = xn90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map map, Continuation continuation) {
        MobAmBindingKt$mobBindToPassport$2$1$emit$1 mobAmBindingKt$mobBindToPassport$2$1$emit$1;
        int i;
        if (continuation instanceof MobAmBindingKt$mobBindToPassport$2$1$emit$1) {
            mobAmBindingKt$mobBindToPassport$2$1$emit$1 = (MobAmBindingKt$mobBindToPassport$2$1$emit$1) continuation;
            int i2 = mobAmBindingKt$mobBindToPassport$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobAmBindingKt$mobBindToPassport$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobAmBindingKt$mobBindToPassport$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobAmBindingKt$mobBindToPassport$2$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                kotlin.b.b(obj);
                UpdateableProperties.a aVar = new UpdateableProperties.a();
                Map map2 = this.b;
                boolean isEmpty = map2.isEmpty();
                KPassportEnvironment kPassportEnvironment = this.c;
                xn90 xn90Var = this.w;
                if (!isEmpty) {
                    UrlOverride.a aVar2 = new UrlOverride.a();
                    c.c(aVar2, map, map2, kPassportEnvironment, xn90Var);
                    UrlOverride.Companion.getClass();
                    aVar.a = p.a(aVar2);
                }
                Map a = c.a(map, map2);
                if (!a.isEmpty()) {
                    ArrayList arrayList = new ArrayList(a.size());
                    for (Map.Entry entry : a.entrySet()) {
                        PassportLocation passportLocation = new PassportLocation(((Number) entry.getKey()).longValue());
                        UrlOverride.a aVar3 = new UrlOverride.a();
                        c.c(aVar3, map, (Map) entry.getValue(), kPassportEnvironment, xn90Var);
                        UrlOverride.Companion.getClass();
                        arrayList.add(new Pair(passportLocation, p.a(aVar3)));
                    }
                    aVar.b = kotlin.collections.b.s(arrayList);
                }
                UpdateableProperties.Companion.getClass();
                UpdateableProperties a2 = z.a(aVar);
                mobAmBindingKt$mobBindToPassport$2$1$emit$1.L$0 = null;
                mobAmBindingKt$mobBindToPassport$2$1$emit$1.label = 1;
                return this.a.v(a2, mobAmBindingKt$mobBindToPassport$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        mobAmBindingKt$mobBindToPassport$2$1$emit$1 = new MobAmBindingKt$mobBindToPassport$2$1$emit$1(this, continuation);
        Object obj2 = mobAmBindingKt$mobBindToPassport$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobAmBindingKt$mobBindToPassport$2$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
