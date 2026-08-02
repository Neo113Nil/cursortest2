package com.yandex.go.preorder.deeplinks.requirement;

import defpackage.dd61;
import defpackage.ffj0;
import defpackage.gfj0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.e;

/* loaded from: classes13.dex */
public final class a {
    public final po21 a;
    public final e b;

    public a(po21 po21Var, e eVar) {
        this.a = po21Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gfj0 gfj0Var, ContinuationImpl continuationImpl) {
        RequirementDataInteractor$fetchDataFromDeeplink$1 requirementDataInteractor$fetchDataFromDeeplink$1;
        Object obj;
        Object obj2;
        int i;
        e eVar;
        gfj0 gfj0Var2;
        try {
            if (continuationImpl instanceof RequirementDataInteractor$fetchDataFromDeeplink$1) {
                requirementDataInteractor$fetchDataFromDeeplink$1 = (RequirementDataInteractor$fetchDataFromDeeplink$1) continuationImpl;
                int i2 = requirementDataInteractor$fetchDataFromDeeplink$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    requirementDataInteractor$fetchDataFromDeeplink$1.label = i2 - Integer.MIN_VALUE;
                    obj = requirementDataInteractor$fetchDataFromDeeplink$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = requirementDataInteractor$fetchDataFromDeeplink$1.label;
                    if (i != 0) {
                        b.b(obj);
                        e eVar2 = this.b;
                        requirementDataInteractor$fetchDataFromDeeplink$1.L$0 = gfj0Var;
                        requirementDataInteractor$fetchDataFromDeeplink$1.L$1 = eVar2;
                        requirementDataInteractor$fetchDataFromDeeplink$1.label = 1;
                        Object b = b(requirementDataInteractor$fetchDataFromDeeplink$1);
                        if (b == obj2) {
                            return obj2;
                        }
                        obj = b;
                        eVar = eVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gfj0Var2 = (gfj0) requirementDataInteractor$fetchDataFromDeeplink$1.L$0;
                            b.b(obj);
                            return new ffj0(((dd61) obj).a(), gfj0Var2);
                        }
                        eVar = (e) requirementDataInteractor$fetchDataFromDeeplink$1.L$1;
                        gfj0Var = (gfj0) requirementDataInteractor$fetchDataFromDeeplink$1.L$0;
                        b.b(obj);
                    }
                    requirementDataInteractor$fetchDataFromDeeplink$1.L$0 = gfj0Var;
                    requirementDataInteractor$fetchDataFromDeeplink$1.L$1 = null;
                    requirementDataInteractor$fetchDataFromDeeplink$1.label = 2;
                    obj = eVar.e((zzs) obj, null, false, false, requirementDataInteractor$fetchDataFromDeeplink$1);
                    if (obj != obj2) {
                        gfj0Var2 = gfj0Var;
                        return new ffj0(((dd61) obj).a(), gfj0Var2);
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            requirementDataInteractor$fetchDataFromDeeplink$1.L$0 = gfj0Var;
            requirementDataInteractor$fetchDataFromDeeplink$1.L$1 = null;
            requirementDataInteractor$fetchDataFromDeeplink$1.label = 2;
            obj = eVar.e((zzs) obj, null, false, false, requirementDataInteractor$fetchDataFromDeeplink$1);
            if (obj != obj2) {
            }
            return obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        requirementDataInteractor$fetchDataFromDeeplink$1 = new RequirementDataInteractor$fetchDataFromDeeplink$1(this, continuationImpl);
        obj = requirementDataInteractor$fetchDataFromDeeplink$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementDataInteractor$fetchDataFromDeeplink$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RequirementDataInteractor$sourceGeoPointFromUserLocation$1 requirementDataInteractor$sourceGeoPointFromUserLocation$1;
        int i;
        if (continuationImpl instanceof RequirementDataInteractor$sourceGeoPointFromUserLocation$1) {
            requirementDataInteractor$sourceGeoPointFromUserLocation$1 = (RequirementDataInteractor$sourceGeoPointFromUserLocation$1) continuationImpl;
            int i2 = requirementDataInteractor$sourceGeoPointFromUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementDataInteractor$sourceGeoPointFromUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementDataInteractor$sourceGeoPointFromUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementDataInteractor$sourceGeoPointFromUserLocation$1.label;
                if (i != 0) {
                    b.b(obj);
                    requirementDataInteractor$sourceGeoPointFromUserLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).h(requirementDataInteractor$sourceGeoPointFromUserLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((mo21) obj).a();
            }
        }
        requirementDataInteractor$sourceGeoPointFromUserLocation$1 = new RequirementDataInteractor$sourceGeoPointFromUserLocation$1(this, continuationImpl);
        Object obj2 = requirementDataInteractor$sourceGeoPointFromUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementDataInteractor$sourceGeoPointFromUserLocation$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }
}
