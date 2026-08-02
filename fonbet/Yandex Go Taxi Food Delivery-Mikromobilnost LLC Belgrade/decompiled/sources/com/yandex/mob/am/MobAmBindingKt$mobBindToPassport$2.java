package com.yandex.mob.am;

import com.yandex.mob.d;
import com.yandex.passport.api.KPassportEnvironment;
import defpackage.g92;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nn90;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xn90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.am.MobAmBindingKt$mobBindToPassport$2", f = "MobAmBinding.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobAmBindingKt$mobBindToPassport$2 extends SuspendLambda implements wls {
    final /* synthetic */ nn90 $apiNamesProvider;
    final /* synthetic */ xn90 $baseUrlModifier;
    final /* synthetic */ String $contour;
    final /* synthetic */ com.yandex.passport.api.b $passportApi;
    final /* synthetic */ KPassportEnvironment $passportEnvironment;
    final /* synthetic */ d $this_mobBindToPassport;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobAmBindingKt$mobBindToPassport$2(nn90 nn90Var, d dVar, String str, com.yandex.passport.api.b bVar, KPassportEnvironment kPassportEnvironment, xn90 xn90Var, Continuation continuation) {
        super(2, continuation);
        this.$apiNamesProvider = nn90Var;
        this.$this_mobBindToPassport = dVar;
        this.$contour = str;
        this.$passportApi = bVar;
        this.$passportEnvironment = kPassportEnvironment;
        this.$baseUrlModifier = xn90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobAmBindingKt$mobBindToPassport$2(this.$apiNamesProvider, this.$this_mobBindToPassport, this.$contour, this.$passportApi, this.$passportEnvironment, this.$baseUrlModifier, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobAmBindingKt$mobBindToPassport$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr mthVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map b = c.b(this.$apiNamesProvider);
            List M = kotlin.collections.a.M(b.keySet());
            d dVar = this.$this_mobBindToPassport;
            String str = this.$contour;
            if (M.isEmpty()) {
                mthVar = new g92(2, kotlin.collections.b.f());
            } else {
                ArrayList arrayList = new ArrayList(tcc.n(M, 10));
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ol20((String) it.next()));
                }
                ol20[] ol20VarArr = (ol20[]) arrayList.toArray(new ol20[0]);
                mthVar = new mth(dVar.l(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length)), 8);
            }
            a aVar = new a(this.$passportApi, b, this.$passportEnvironment, this.$baseUrlModifier);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (mthVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
