package com.yandex.go.scooters.utils;

import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.utils.ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1", f = "ScootersPreferencesExtensions.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ cne0 $this_listenStringSet$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1(Continuation continuation, cne0 cne0Var, String str) {
        super(2, continuation);
        this.$this_listenStringSet$inlined = cne0Var;
        this.$key$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1 scootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1 = new ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1(continuation, this.$this_listenStringSet$inlined, this.$key$inlined);
        scootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1.L$0 = obj;
        return scootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Set n = this.$this_listenStringSet$inlined.n(this.$key$inlined);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(n, this) == coroutineSingletons) {
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
