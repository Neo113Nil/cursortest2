package androidx.datastore.preferences.core;

import defpackage.ez40;
import defpackage.mme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmme0;", "it", "<anonymous>", "(Lmme0;)Lmme0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {343}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class PreferencesKt$edit$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$transform = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, continuation);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesKt$edit$2) create((mme0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ez40 ez40Var = (ez40) this.L$0;
            kotlin.b.b(obj);
            return ez40Var;
        }
        kotlin.b.b(obj);
        ez40 ez40Var2 = new ez40(new LinkedHashMap(((mme0) this.L$0).a()), false);
        wls wlsVar = this.$transform;
        this.L$0 = ez40Var2;
        this.label = 1;
        return wlsVar.invoke(ez40Var2, this) == coroutineSingletons ? coroutineSingletons : ez40Var2;
    }
}
