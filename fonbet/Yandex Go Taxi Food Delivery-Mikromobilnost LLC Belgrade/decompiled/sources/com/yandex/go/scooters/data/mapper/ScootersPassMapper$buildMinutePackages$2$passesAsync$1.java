package com.yandex.go.scooters.data.mapper;

import defpackage.bvf0;
import defpackage.ck90;
import defpackage.fef;
import defpackage.g590;
import defpackage.j590;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vj90;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.PassItemType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lvj90;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$buildMinutePackages$2$passesAsync$1", f = "ScootersPassMapper.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$buildMinutePackages$2$passesAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ boolean $depositExperimentEnabled;
    final /* synthetic */ g590 $packages;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$buildMinutePackages$2$passesAsync$1(g590 g590Var, d dVar, fef fefVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$packages = g590Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
        this.$depositExperimentEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$buildMinutePackages$2$passesAsync$1(this.$packages, this.this$0, this.$currencyRules, this.$depositExperimentEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$buildMinutePackages$2$passesAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j590 j590Var;
        List list;
        d dVar;
        fef fefVar;
        boolean z;
        Iterator it;
        ArrayList arrayList;
        PassItemType passItemType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ArrayList arrayList2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            List list2 = this.$packages.a;
            if (list2 != null && (j590Var = (j590) kotlin.collections.a.R(list2)) != null && (list = j590Var.d) != null) {
                d dVar2 = this.this$0;
                fef fefVar2 = this.$currencyRules;
                boolean z2 = this.$depositExperimentEnabled;
                ArrayList arrayList3 = new ArrayList();
                dVar = dVar2;
                fefVar = fefVar2;
                z = z2;
                it = list.iterator();
                arrayList = arrayList3;
                if (it.hasNext()) {
                }
            }
            if (arrayList2 != null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = this.Z$0;
            it = (Iterator) this.L$6;
            ?? r6 = (Collection) this.L$4;
            fef fefVar3 = (fef) this.L$2;
            d dVar3 = (d) this.L$1;
            kotlin.b.b(obj);
            z = z3;
            arrayList = r6;
            fefVar = fefVar3;
            dVar = dVar3;
            Object obj2 = obj;
            vj90 vj90Var = (vj90) obj2;
            if (vj90Var != null) {
                arrayList.add(vj90Var);
            }
            if (it.hasNext()) {
                ck90 ck90Var = (ck90) it.next();
                this.L$0 = null;
                this.L$1 = dVar;
                this.L$2 = fefVar;
                this.L$3 = null;
                this.L$4 = arrayList;
                this.L$5 = null;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.Z$0 = z;
                this.label = 1;
                dVar.getClass();
                String str = ck90Var.a;
                if (str == null || (passItemType = ck90Var.b) == null) {
                    obj2 = null;
                    if (null == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    obj2 = bvf0.n(new ScootersPassMapper$toPass$2(ck90Var, str, dVar, passItemType, fefVar, z, null), this);
                }
                vj90 vj90Var2 = (vj90) obj2;
                if (vj90Var2 != null) {
                }
                if (it.hasNext()) {
                    arrayList2 = arrayList;
                    return arrayList2 != null ? EmptyList.a : arrayList2;
                }
            }
        }
    }
}
