package com.yandex.quark.core.common.internal.supportedfeatures;

import defpackage.g050;
import defpackage.jlw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljlw0;", "newFeatures", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.core.common.internal.supportedfeatures.SupportedFeaturesManager$registerProvider$job$1", f = "SupportedFeaturesManager.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SupportedFeaturesManager$registerProvider$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<jlw0> $featuresAddedByThisProvider;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedFeaturesManager$registerProvider$job$1(b bVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$featuresAddedByThisProvider = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportedFeaturesManager$registerProvider$job$1 supportedFeaturesManager$registerProvider$job$1 = new SupportedFeaturesManager$registerProvider$job$1(this.this$0, this.$featuresAddedByThisProvider, continuation);
        supportedFeaturesManager$registerProvider$job$1.L$0 = obj;
        return supportedFeaturesManager$registerProvider$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportedFeaturesManager$registerProvider$job$1) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        List<jlw0> list;
        b bVar;
        Set<jlw0> set;
        Object value;
        Set set2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list2 = (List) this.L$0;
            b bVar2 = this.this$0;
            g050Var = bVar2.c;
            Set<jlw0> set3 = this.$featuresAddedByThisProvider;
            this.L$0 = list2;
            this.L$1 = g050Var;
            this.L$2 = set3;
            this.L$3 = bVar2;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
            bVar = bVar2;
            set = set3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$3;
            set = (Set) this.L$2;
            g050Var = (g050) this.L$1;
            list = (List) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            for (jlw0 jlw0Var : list) {
                if (!set.contains(jlw0Var)) {
                    int intValue = ((Number) bVar.d.getOrDefault(jlw0Var, new Integer(0))).intValue();
                    bVar.d.put(jlw0Var, new Integer(intValue + 1));
                    if (intValue == 0) {
                        r0 r0Var = bVar.a.b;
                        do {
                            value = r0Var.getValue();
                            set2 = (Set) value;
                            if (!set2.contains(jlw0Var)) {
                                set2 = kotlin.collections.a.M0(set2);
                                set2.add(jlw0Var);
                            }
                        } while (!r0Var.k(value, set2));
                    }
                    set.add(jlw0Var);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (!list.contains((jlw0) obj2)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jlw0 jlw0Var2 = (jlw0) it.next();
                Integer num = (Integer) bVar.d.get(jlw0Var2);
                int intValue2 = num != null ? num.intValue() : 0;
                if (intValue2 > 0) {
                    bVar.d.put(jlw0Var2, new Integer(intValue2 - 1));
                    if (intValue2 == 1) {
                        bVar.a.a(jlw0Var2);
                    }
                }
                set.remove(jlw0Var2);
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
