package com.yandex.go.masstransit.sdk.order.impl.orders;

import android.content.Context;
import defpackage.hju0;
import defpackage.iju0;
import defpackage.jb7;
import defpackage.jju0;
import defpackage.ke00;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.tb3;
import defpackage.v4r0;
import defpackage.vby;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xby;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final tb3 a;

    public c(Context context, wnt wntVar) {
        this.a = new tb3(new jb7(context.getDatabasePath("masstransit_orders"), "expiration_animations_consumed"), new nfh(wntVar, ConsumedAnimationsData.Companion.serializer(), new ConsumedAnimationsData(0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$add$1 expirationAnimationStorage$add$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$add$1) {
            expirationAnimationStorage$add$1 = (ExpirationAnimationStorage$add$1) continuationImpl;
            int i2 = expirationAnimationStorage$add$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$add$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$add$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$add$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expirationAnimationStorage$add$1.L$0 = str;
                    expirationAnimationStorage$add$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) expirationAnimationStorage$add$1.L$0;
                    kotlin.b.b(obj);
                }
                ConsumedAnimationsData consumedAnimationsData = (ConsumedAnimationsData) obj;
                this.a.b(ConsumedAnimationsData.a(consumedAnimationsData, v4r0.i(consumedAnimationsData.a, str), null, 2));
                return zy11.a;
            }
        }
        expirationAnimationStorage$add$1 = new ExpirationAnimationStorage$add$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$add$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$add$1.label;
        if (i != 0) {
        }
        ConsumedAnimationsData consumedAnimationsData2 = (ConsumedAnimationsData) obj3;
        this.a.b(ConsumedAnimationsData.a(consumedAnimationsData2, v4r0.i(consumedAnimationsData2.a, str), null, 2));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Set set, ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$addSeenActive$1 expirationAnimationStorage$addSeenActive$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$addSeenActive$1) {
            expirationAnimationStorage$addSeenActive$1 = (ExpirationAnimationStorage$addSeenActive$1) continuationImpl;
            int i2 = expirationAnimationStorage$addSeenActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$addSeenActive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$addSeenActive$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$addSeenActive$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (set.isEmpty()) {
                        return zy11Var;
                    }
                    expirationAnimationStorage$addSeenActive$1.L$0 = set;
                    expirationAnimationStorage$addSeenActive$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) expirationAnimationStorage$addSeenActive$1.L$0;
                    kotlin.b.b(obj);
                }
                ConsumedAnimationsData consumedAnimationsData = (ConsumedAnimationsData) obj;
                this.a.b(ConsumedAnimationsData.a(consumedAnimationsData, null, v4r0.h(consumedAnimationsData.b, set), 1));
                return zy11Var;
            }
        }
        expirationAnimationStorage$addSeenActive$1 = new ExpirationAnimationStorage$addSeenActive$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$addSeenActive$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$addSeenActive$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ConsumedAnimationsData consumedAnimationsData2 = (ConsumedAnimationsData) obj3;
        this.a.b(ConsumedAnimationsData.a(consumedAnimationsData2, null, v4r0.h(consumedAnimationsData2.b, set), 1));
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$read$1 expirationAnimationStorage$read$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$read$1) {
            expirationAnimationStorage$read$1 = (ExpirationAnimationStorage$read$1) continuationImpl;
            int i2 = expirationAnimationStorage$read$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$read$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$read$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$read$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expirationAnimationStorage$read$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((ConsumedAnimationsData) obj).a;
            }
        }
        expirationAnimationStorage$read$1 = new ExpirationAnimationStorage$read$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$read$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$read$1.label;
        if (i != 0) {
        }
        return ((ConsumedAnimationsData) obj3).a;
    }

    public final ConsumedAnimationsData d() {
        jju0 a = this.a.a();
        if (a instanceof iju0) {
            return (ConsumedAnimationsData) ((iju0) a).b;
        }
        if (!(a instanceof hju0)) {
            w511.b();
            return null;
        }
        vby vbyVar = xby.d;
        ke00 a2 = vbyVar.b.a();
        if (a2 != null && a2.b(15)) {
            a2.a(15, null, null, "Error while reading expiration animations storage: " + ((hju0) a).c, vbyVar.a);
        }
        return new ConsumedAnimationsData(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$readSeenActive$1 expirationAnimationStorage$readSeenActive$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$readSeenActive$1) {
            expirationAnimationStorage$readSeenActive$1 = (ExpirationAnimationStorage$readSeenActive$1) continuationImpl;
            int i2 = expirationAnimationStorage$readSeenActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$readSeenActive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$readSeenActive$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$readSeenActive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expirationAnimationStorage$readSeenActive$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((ConsumedAnimationsData) obj).b;
            }
        }
        expirationAnimationStorage$readSeenActive$1 = new ExpirationAnimationStorage$readSeenActive$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$readSeenActive$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$readSeenActive$1.label;
        if (i != 0) {
        }
        return ((ConsumedAnimationsData) obj3).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$removeSeenActive$1 expirationAnimationStorage$removeSeenActive$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$removeSeenActive$1) {
            expirationAnimationStorage$removeSeenActive$1 = (ExpirationAnimationStorage$removeSeenActive$1) continuationImpl;
            int i2 = expirationAnimationStorage$removeSeenActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$removeSeenActive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$removeSeenActive$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$removeSeenActive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expirationAnimationStorage$removeSeenActive$1.L$0 = str;
                    expirationAnimationStorage$removeSeenActive$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) expirationAnimationStorage$removeSeenActive$1.L$0;
                    kotlin.b.b(obj);
                }
                ConsumedAnimationsData consumedAnimationsData = (ConsumedAnimationsData) obj;
                this.a.b(ConsumedAnimationsData.a(consumedAnimationsData, null, v4r0.f(consumedAnimationsData.b, str), 1));
                return zy11.a;
            }
        }
        expirationAnimationStorage$removeSeenActive$1 = new ExpirationAnimationStorage$removeSeenActive$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$removeSeenActive$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$removeSeenActive$1.label;
        if (i != 0) {
        }
        ConsumedAnimationsData consumedAnimationsData2 = (ConsumedAnimationsData) obj3;
        this.a.b(ConsumedAnimationsData.a(consumedAnimationsData2, null, v4r0.f(consumedAnimationsData2.b, str), 1));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Set set, ContinuationImpl continuationImpl) {
        ExpirationAnimationStorage$retainOnly$1 expirationAnimationStorage$retainOnly$1;
        int i;
        if (continuationImpl instanceof ExpirationAnimationStorage$retainOnly$1) {
            expirationAnimationStorage$retainOnly$1 = (ExpirationAnimationStorage$retainOnly$1) continuationImpl;
            int i2 = expirationAnimationStorage$retainOnly$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expirationAnimationStorage$retainOnly$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expirationAnimationStorage$retainOnly$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expirationAnimationStorage$retainOnly$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expirationAnimationStorage$retainOnly$1.L$0 = set;
                    expirationAnimationStorage$retainOnly$1.label = 1;
                    obj = d();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) expirationAnimationStorage$retainOnly$1.L$0;
                    kotlin.b.b(obj);
                }
                ConsumedAnimationsData consumedAnimationsData = (ConsumedAnimationsData) obj;
                Set set2 = set;
                this.a.b(new ConsumedAnimationsData(kotlin.collections.a.U(consumedAnimationsData.a, set2), kotlin.collections.a.U(consumedAnimationsData.b, set2)));
                return zy11.a;
            }
        }
        expirationAnimationStorage$retainOnly$1 = new ExpirationAnimationStorage$retainOnly$1(this, continuationImpl);
        Object obj3 = expirationAnimationStorage$retainOnly$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expirationAnimationStorage$retainOnly$1.label;
        if (i != 0) {
        }
        ConsumedAnimationsData consumedAnimationsData2 = (ConsumedAnimationsData) obj3;
        Set set22 = set;
        this.a.b(new ConsumedAnimationsData(kotlin.collections.a.U(consumedAnimationsData2.a, set22), kotlin.collections.a.U(consumedAnimationsData2.b, set22)));
        return zy11.a;
    }
}
