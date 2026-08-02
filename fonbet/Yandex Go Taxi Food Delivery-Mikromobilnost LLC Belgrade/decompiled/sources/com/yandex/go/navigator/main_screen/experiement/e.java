package com.yandex.go.navigator.main_screen.experiement;

import defpackage.d6z;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.rqy;
import defpackage.t1b0;
import defpackage.tc50;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class e {
    public final com.yandex.go.navigator.utils.a a;
    public final t1b0 b;
    public final d c;

    public e(rqo rqoVar, com.yandex.go.navigator.utils.a aVar) {
        this.a = aVar;
        NavigatorMainScreenExperiment.Companion.getClass();
        NavigatorMainScreenExperiment navigatorMainScreenExperiment = NavigatorMainScreenExperiment.k;
        t1b0 e = ((jbh) rqoVar).e(navigatorMainScreenExperiment);
        this.b = e;
        this.c = new d(com.yandex.go.coroutines.b.d(e.a(), new NavigatorMainScreenExperimentRepository$special$$inlined$start$1(navigatorMainScreenExperiment, null)), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NavigatorMainScreenExperimentRepository$config$1 navigatorMainScreenExperimentRepository$config$1;
        int i;
        if (continuationImpl instanceof NavigatorMainScreenExperimentRepository$config$1) {
            navigatorMainScreenExperimentRepository$config$1 = (NavigatorMainScreenExperimentRepository$config$1) continuationImpl;
            int i2 = navigatorMainScreenExperimentRepository$config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMainScreenExperimentRepository$config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorMainScreenExperimentRepository$config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMainScreenExperimentRepository$config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    navigatorMainScreenExperimentRepository$config$1.L$0 = this;
                    navigatorMainScreenExperimentRepository$config$1.label = 1;
                    obj = this.b.b(navigatorMainScreenExperimentRepository$config$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (e) navigatorMainScreenExperimentRepository$config$1.L$0;
                    kotlin.b.b(obj);
                }
                navigatorMainScreenExperimentRepository$config$1.L$0 = null;
                navigatorMainScreenExperimentRepository$config$1.label = 2;
                Object b = this.b((NavigatorMainScreenExperiment) obj, navigatorMainScreenExperimentRepository$config$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        navigatorMainScreenExperimentRepository$config$1 = new NavigatorMainScreenExperimentRepository$config$1(this, continuationImpl);
        Object obj2 = navigatorMainScreenExperimentRepository$config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMainScreenExperimentRepository$config$1.label;
        if (i != 0) {
        }
        navigatorMainScreenExperimentRepository$config$1.L$0 = null;
        navigatorMainScreenExperimentRepository$config$1.label = 2;
        Object b2 = this.b((NavigatorMainScreenExperiment) obj2, navigatorMainScreenExperimentRepository$config$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(NavigatorMainScreenExperiment navigatorMainScreenExperiment, ContinuationImpl continuationImpl) {
        NavigatorMainScreenExperimentRepository$mapExperiment$1 navigatorMainScreenExperimentRepository$mapExperiment$1;
        Object obj;
        int i;
        boolean z;
        NavigatorMainScreenExperiment navigatorMainScreenExperiment2;
        Object c;
        boolean z2;
        List list;
        NavigatorMainScreenExperiment navigatorMainScreenExperiment3;
        if (continuationImpl instanceof NavigatorMainScreenExperimentRepository$mapExperiment$1) {
            navigatorMainScreenExperimentRepository$mapExperiment$1 = (NavigatorMainScreenExperimentRepository$mapExperiment$1) continuationImpl;
            int i2 = navigatorMainScreenExperimentRepository$mapExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMainScreenExperimentRepository$mapExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorMainScreenExperimentRepository$mapExperiment$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMainScreenExperimentRepository$mapExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean z3 = navigatorMainScreenExperiment.b;
                    List list2 = navigatorMainScreenExperiment.f;
                    NavigatorMainScreenExperimentRepository$mapExperiment$2 navigatorMainScreenExperimentRepository$mapExperiment$2 = new NavigatorMainScreenExperimentRepository$mapExperiment$2(1, navigatorMainScreenExperiment, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
                    navigatorMainScreenExperimentRepository$mapExperiment$1.L$0 = navigatorMainScreenExperiment;
                    navigatorMainScreenExperimentRepository$mapExperiment$1.Z$0 = z3;
                    navigatorMainScreenExperimentRepository$mapExperiment$1.label = 1;
                    Object b = this.a.b(list2, navigatorMainScreenExperimentRepository$mapExperiment$2, navigatorMainScreenExperimentRepository$mapExperiment$1);
                    if (b != obj) {
                        obj2 = b;
                        z = z3;
                        navigatorMainScreenExperiment2 = navigatorMainScreenExperiment;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = navigatorMainScreenExperimentRepository$mapExperiment$1.Z$0;
                    List list3 = (List) navigatorMainScreenExperimentRepository$mapExperiment$1.L$1;
                    navigatorMainScreenExperiment3 = (NavigatorMainScreenExperiment) navigatorMainScreenExperimentRepository$mapExperiment$1.L$0;
                    kotlin.b.b(obj2);
                    z2 = z4;
                    list = list3;
                    return new tc50(z2, navigatorMainScreenExperiment3.c, d6z.Y(navigatorMainScreenExperiment3, navigatorMainScreenExperiment3.d), list, (rqy) obj2, navigatorMainScreenExperiment3.i, navigatorMainScreenExperiment3.e);
                }
                z = navigatorMainScreenExperimentRepository$mapExperiment$1.Z$0;
                navigatorMainScreenExperiment2 = (NavigatorMainScreenExperiment) navigatorMainScreenExperimentRepository$mapExperiment$1.L$0;
                kotlin.b.b(obj2);
                List list4 = (List) obj2;
                ListButtonsDto listButtonsDto = navigatorMainScreenExperiment2.g;
                navigatorMainScreenExperimentRepository$mapExperiment$1.L$0 = navigatorMainScreenExperiment2;
                navigatorMainScreenExperimentRepository$mapExperiment$1.L$1 = list4;
                navigatorMainScreenExperimentRepository$mapExperiment$1.Z$0 = z;
                navigatorMainScreenExperimentRepository$mapExperiment$1.label = 2;
                c = c(listButtonsDto, navigatorMainScreenExperiment2, navigatorMainScreenExperimentRepository$mapExperiment$1);
                if (c != obj) {
                    z2 = z;
                    list = list4;
                    navigatorMainScreenExperiment3 = navigatorMainScreenExperiment2;
                    obj2 = c;
                    return new tc50(z2, navigatorMainScreenExperiment3.c, d6z.Y(navigatorMainScreenExperiment3, navigatorMainScreenExperiment3.d), list, (rqy) obj2, navigatorMainScreenExperiment3.i, navigatorMainScreenExperiment3.e);
                }
                return obj;
            }
        }
        navigatorMainScreenExperimentRepository$mapExperiment$1 = new NavigatorMainScreenExperimentRepository$mapExperiment$1(this, continuationImpl);
        Object obj22 = navigatorMainScreenExperimentRepository$mapExperiment$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMainScreenExperimentRepository$mapExperiment$1.label;
        if (i != 0) {
        }
        List list42 = (List) obj22;
        ListButtonsDto listButtonsDto2 = navigatorMainScreenExperiment2.g;
        navigatorMainScreenExperimentRepository$mapExperiment$1.L$0 = navigatorMainScreenExperiment2;
        navigatorMainScreenExperimentRepository$mapExperiment$1.L$1 = list42;
        navigatorMainScreenExperimentRepository$mapExperiment$1.Z$0 = z;
        navigatorMainScreenExperimentRepository$mapExperiment$1.label = 2;
        c = c(listButtonsDto2, navigatorMainScreenExperiment2, navigatorMainScreenExperimentRepository$mapExperiment$1);
        if (c != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ListButtonsDto listButtonsDto, NavigatorMainScreenExperiment navigatorMainScreenExperiment, ContinuationImpl continuationImpl) {
        NavigatorMainScreenExperimentRepository$mapListButtons$1 navigatorMainScreenExperimentRepository$mapListButtons$1;
        int i;
        boolean z;
        if (continuationImpl instanceof NavigatorMainScreenExperimentRepository$mapListButtons$1) {
            navigatorMainScreenExperimentRepository$mapListButtons$1 = (NavigatorMainScreenExperimentRepository$mapListButtons$1) continuationImpl;
            int i2 = navigatorMainScreenExperimentRepository$mapListButtons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMainScreenExperimentRepository$mapListButtons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorMainScreenExperimentRepository$mapListButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMainScreenExperimentRepository$mapListButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z2 = listButtonsDto.a;
                    List list = listButtonsDto.b;
                    NavigatorMainScreenExperimentRepository$mapListButtons$2 navigatorMainScreenExperimentRepository$mapListButtons$2 = new NavigatorMainScreenExperimentRepository$mapListButtons$2(1, navigatorMainScreenExperiment, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
                    navigatorMainScreenExperimentRepository$mapListButtons$1.L$0 = null;
                    navigatorMainScreenExperimentRepository$mapListButtons$1.L$1 = null;
                    navigatorMainScreenExperimentRepository$mapListButtons$1.Z$0 = z2;
                    navigatorMainScreenExperimentRepository$mapListButtons$1.label = 1;
                    Object b = this.a.b(list, navigatorMainScreenExperimentRepository$mapListButtons$2, navigatorMainScreenExperimentRepository$mapListButtons$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = navigatorMainScreenExperimentRepository$mapListButtons$1.Z$0;
                    kotlin.b.b(obj);
                }
                return new rqy(z, (List) obj);
            }
        }
        navigatorMainScreenExperimentRepository$mapListButtons$1 = new NavigatorMainScreenExperimentRepository$mapListButtons$1(this, continuationImpl);
        Object obj2 = navigatorMainScreenExperimentRepository$mapListButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMainScreenExperimentRepository$mapListButtons$1.label;
        if (i != 0) {
        }
        return new rqy(z, (List) obj2);
    }
}
