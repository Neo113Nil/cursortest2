package com.yandex.go.sharing_personal_goals.data;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsAcceptDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsAcceptParams;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDisplayContextDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsParams;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockParams;
import com.yandex.go.sharing_personal_goals.data.model.SharingServiceNameDto;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.krr0;
import defpackage.lr40;
import defpackage.nrr0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.srr0;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.sharing_personal_goals.data.mapper.a a;
    public final i3y b;

    public a(on2 on2Var, com.yandex.go.sharing_personal_goals.data.mapper.a aVar) {
        this.a = aVar;
        this.b = kotlin.a.a(new lr40(on2Var, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsRepository$acceptMission$1 sharingPersonalGoalsRepository$acceptMission$1;
        int i;
        try {
            if (continuationImpl instanceof SharingPersonalGoalsRepository$acceptMission$1) {
                sharingPersonalGoalsRepository$acceptMission$1 = (SharingPersonalGoalsRepository$acceptMission$1) continuationImpl;
                int i2 = sharingPersonalGoalsRepository$acceptMission$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sharingPersonalGoalsRepository$acceptMission$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sharingPersonalGoalsRepository$acceptMission$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sharingPersonalGoalsRepository$acceptMission$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<SharingPersonalGoalsAcceptDto> b = ((SharingPersonalGoalsApi) this.b.getValue()).b(new SharingPersonalGoalsAcceptParams(str));
                        sharingPersonalGoalsRepository$acceptMission$1.L$0 = null;
                        sharingPersonalGoalsRepository$acceptMission$1.label = 1;
                        obj = b.a(sharingPersonalGoalsRepository$acceptMission$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return (nrr0) obj;
                        }
                        b.b(obj);
                    }
                    com.yandex.go.sharing_personal_goals.data.mapper.a aVar = this.a;
                    SharingPersonalGoalsAcceptDto sharingPersonalGoalsAcceptDto = (SharingPersonalGoalsAcceptDto) ((fmt) obj).a;
                    sharingPersonalGoalsRepository$acceptMission$1.L$0 = null;
                    sharingPersonalGoalsRepository$acceptMission$1.L$1 = null;
                    sharingPersonalGoalsRepository$acceptMission$1.label = 2;
                    obj = aVar.d(sharingPersonalGoalsAcceptDto, sharingPersonalGoalsRepository$acceptMission$1);
                }
            }
            if (i != 0) {
            }
            com.yandex.go.sharing_personal_goals.data.mapper.a aVar2 = this.a;
            SharingPersonalGoalsAcceptDto sharingPersonalGoalsAcceptDto2 = (SharingPersonalGoalsAcceptDto) ((fmt) obj).a;
            sharingPersonalGoalsRepository$acceptMission$1.L$0 = null;
            sharingPersonalGoalsRepository$acceptMission$1.L$1 = null;
            sharingPersonalGoalsRepository$acceptMission$1.label = 2;
            obj = aVar2.d(sharingPersonalGoalsAcceptDto2, sharingPersonalGoalsRepository$acceptMission$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        sharingPersonalGoalsRepository$acceptMission$1 = new SharingPersonalGoalsRepository$acceptMission$1(this, continuationImpl);
        Object obj2 = sharingPersonalGoalsRepository$acceptMission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsRepository$acceptMission$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SharingServiceNameDto sharingServiceNameDto, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsRepository$getPersonalGoals$1 sharingPersonalGoalsRepository$getPersonalGoals$1;
        int i;
        try {
            if (continuationImpl instanceof SharingPersonalGoalsRepository$getPersonalGoals$1) {
                sharingPersonalGoalsRepository$getPersonalGoals$1 = (SharingPersonalGoalsRepository$getPersonalGoals$1) continuationImpl;
                int i2 = sharingPersonalGoalsRepository$getPersonalGoals$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sharingPersonalGoalsRepository$getPersonalGoals$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sharingPersonalGoalsRepository$getPersonalGoals$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sharingPersonalGoalsRepository$getPersonalGoals$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<SharingPersonalGoalsDto> a = ((SharingPersonalGoalsApi) this.b.getValue()).a(new SharingPersonalGoalsParams(sharingServiceNameDto));
                        sharingPersonalGoalsRepository$getPersonalGoals$1.L$0 = null;
                        sharingPersonalGoalsRepository$getPersonalGoals$1.label = 1;
                        obj = a.a(sharingPersonalGoalsRepository$getPersonalGoals$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return (krr0) obj;
                        }
                        b.b(obj);
                    }
                    com.yandex.go.sharing_personal_goals.data.mapper.a aVar = this.a;
                    SharingPersonalGoalsDto sharingPersonalGoalsDto = (SharingPersonalGoalsDto) ((fmt) obj).a;
                    sharingPersonalGoalsRepository$getPersonalGoals$1.L$0 = null;
                    sharingPersonalGoalsRepository$getPersonalGoals$1.L$1 = null;
                    sharingPersonalGoalsRepository$getPersonalGoals$1.label = 2;
                    obj = aVar.e(sharingPersonalGoalsDto, sharingPersonalGoalsRepository$getPersonalGoals$1);
                }
            }
            if (i != 0) {
            }
            com.yandex.go.sharing_personal_goals.data.mapper.a aVar2 = this.a;
            SharingPersonalGoalsDto sharingPersonalGoalsDto2 = (SharingPersonalGoalsDto) ((fmt) obj).a;
            sharingPersonalGoalsRepository$getPersonalGoals$1.L$0 = null;
            sharingPersonalGoalsRepository$getPersonalGoals$1.L$1 = null;
            sharingPersonalGoalsRepository$getPersonalGoals$1.label = 2;
            obj = aVar2.e(sharingPersonalGoalsDto2, sharingPersonalGoalsRepository$getPersonalGoals$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        sharingPersonalGoalsRepository$getPersonalGoals$1 = new SharingPersonalGoalsRepository$getPersonalGoals$1(this, continuationImpl);
        Object obj2 = sharingPersonalGoalsRepository$getPersonalGoals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsRepository$getPersonalGoals$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SharingServiceNameDto sharingServiceNameDto, SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsRepository$getPromoblock$1 sharingPersonalGoalsRepository$getPromoblock$1;
        int i;
        try {
            if (continuationImpl instanceof SharingPersonalGoalsRepository$getPromoblock$1) {
                sharingPersonalGoalsRepository$getPromoblock$1 = (SharingPersonalGoalsRepository$getPromoblock$1) continuationImpl;
                int i2 = sharingPersonalGoalsRepository$getPromoblock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sharingPersonalGoalsRepository$getPromoblock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sharingPersonalGoalsRepository$getPromoblock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sharingPersonalGoalsRepository$getPromoblock$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<SharingPersonalGoalsPromoblockDto> c = ((SharingPersonalGoalsApi) this.b.getValue()).c(new SharingPersonalGoalsPromoblockParams(sharingServiceNameDto, sharingPersonalGoalsDisplayContextDto));
                        sharingPersonalGoalsRepository$getPromoblock$1.L$0 = null;
                        sharingPersonalGoalsRepository$getPromoblock$1.L$1 = null;
                        sharingPersonalGoalsRepository$getPromoblock$1.label = 1;
                        obj = c.a(sharingPersonalGoalsRepository$getPromoblock$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return (srr0) obj;
                        }
                        b.b(obj);
                    }
                    com.yandex.go.sharing_personal_goals.data.mapper.a aVar = this.a;
                    SharingPersonalGoalsPromoblockDto sharingPersonalGoalsPromoblockDto = (SharingPersonalGoalsPromoblockDto) ((fmt) obj).a;
                    sharingPersonalGoalsRepository$getPromoblock$1.L$0 = null;
                    sharingPersonalGoalsRepository$getPromoblock$1.L$1 = null;
                    sharingPersonalGoalsRepository$getPromoblock$1.L$2 = null;
                    sharingPersonalGoalsRepository$getPromoblock$1.label = 2;
                    obj = aVar.f(sharingPersonalGoalsPromoblockDto, sharingPersonalGoalsRepository$getPromoblock$1);
                }
            }
            if (i != 0) {
            }
            com.yandex.go.sharing_personal_goals.data.mapper.a aVar2 = this.a;
            SharingPersonalGoalsPromoblockDto sharingPersonalGoalsPromoblockDto2 = (SharingPersonalGoalsPromoblockDto) ((fmt) obj).a;
            sharingPersonalGoalsRepository$getPromoblock$1.L$0 = null;
            sharingPersonalGoalsRepository$getPromoblock$1.L$1 = null;
            sharingPersonalGoalsRepository$getPromoblock$1.L$2 = null;
            sharingPersonalGoalsRepository$getPromoblock$1.label = 2;
            obj = aVar2.f(sharingPersonalGoalsPromoblockDto2, sharingPersonalGoalsRepository$getPromoblock$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        sharingPersonalGoalsRepository$getPromoblock$1 = new SharingPersonalGoalsRepository$getPromoblock$1(this, continuationImpl);
        Object obj2 = sharingPersonalGoalsRepository$getPromoblock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsRepository$getPromoblock$1.label;
    }
}
