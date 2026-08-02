package com.yandex.go.geosharing.controller;

import com.yandex.go.geosharing.net.LocationDataParam;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.geosharing.controller.GeoSharingControllerImpl$performUpdateLocationAction$2", f = "GeoSharingControllerImpl.kt", l = {200, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GeoSharingControllerImpl$performUpdateLocationAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ mo21 $newLocation;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingControllerImpl$performUpdateLocationAction$2(e eVar, mo21 mo21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$newLocation = mo21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoSharingControllerImpl$performUpdateLocationAction$2(this.this$0, this.$newLocation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSharingControllerImpl$performUpdateLocationAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e0, code lost:
    
        if (com.yandex.go.geosharing.controller.e.a(r4, (defpackage.a1t) r2, r18) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r9 > 120000) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (r2 == r1) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            mo21 mo21Var = this.$newLocation;
            mo21 mo21Var2 = eVar.s;
            boolean z = false;
            if (mo21Var != null) {
                if (mo21Var2 != null) {
                    long j = mo21Var.e;
                    long j2 = mo21Var2.e;
                    float f = mo21Var.c;
                    float f2 = mo21Var2.c;
                    String str = mo21Var.h;
                    String str2 = mo21Var2.h;
                    long j3 = (j / 1000000) - (j2 / 1000000);
                    if (j3 >= -120000) {
                        int i2 = (int) (f - f2);
                        if (i2 >= 0) {
                            boolean z2 = j3 > 0;
                            if (!z2 || i2 != 0) {
                                if (i2 <= 200) {
                                    if (str.equals(str2)) {
                                        z = z2;
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            }
            if (z) {
                eVar.s = mo21Var;
            } else {
                mo21 mo21Var3 = eVar.s;
                if (mo21Var3 != null) {
                    mo21Var = mo21Var3;
                }
            }
            e eVar2 = this.this$0;
            LocationDataParam locationDataParam = new LocationDataParam(eVar2.d.Hg(), new LocationDataParam.GeoPosition(mo21Var.h, mo21Var.a, mo21Var.b, mo21Var.c, eVar2.f.b(Long.valueOf(mo21Var.f))));
            e eVar3 = this.this$0;
            obj2 = null;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            c = e.c(eVar3, locationDataParam, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            c = obj;
            obj2 = null;
        }
        e eVar4 = this.this$0;
        this.L$0 = obj2;
        this.L$1 = obj2;
        this.L$2 = obj2;
        this.label = 2;
    }
}
