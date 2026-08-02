package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.j;
import defpackage.eiv;
import defpackage.fre;
import defpackage.gr5;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oay;
import defpackage.rol0;
import defpackage.tse;
import defpackage.vpy0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ eiv $imeOptions;
    final /* synthetic */ j $manager;
    final /* synthetic */ oay $state;
    final /* synthetic */ vpy0 $textInputService;
    final /* synthetic */ m3u0 $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(oay oayVar, m3u0 m3u0Var, vpy0 vpy0Var, j jVar, eiv eivVar, Continuation continuation) {
        super(2, continuation);
        this.$state = oayVar;
        this.$writeable$delegate = m3u0Var;
        this.$textInputService = vpy0Var;
        this.$manager = jVar;
        this.$imeOptions = eivVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, zy11] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                rol0 o = androidx.compose.runtime.f.o(new gr5(this.$writeable$delegate, 2));
                fre freVar = new fre(this.$state, this.$textInputService, this.$manager, this.$imeOptions, 0);
                this.label = 1;
                if (o.collect(freVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            c.f(this.$state);
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            c.f(this.$state);
            throw th;
        }
    }
}
