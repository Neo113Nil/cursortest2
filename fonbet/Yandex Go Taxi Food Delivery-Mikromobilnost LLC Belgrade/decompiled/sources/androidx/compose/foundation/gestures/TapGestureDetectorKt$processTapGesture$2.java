package androidx.compose.foundation.gestures;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$2", f = "TapGestureDetector.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$processTapGesture$2 extends SuspendLambda implements wls {
    final /* synthetic */ zvd0 $down;
    final /* synthetic */ zls $onPress;
    final /* synthetic */ s $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$processTapGesture$2(zls zlsVar, s sVar, zvd0 zvd0Var, Continuation continuation) {
        super(2, continuation);
        this.$onPress = zlsVar;
        this.$pressScope = sVar;
        this.$down = zvd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapGestureDetectorKt$processTapGesture$2(this.$onPress, this.$pressScope, this.$down, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$processTapGesture$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zls zlsVar = this.$onPress;
            s sVar = this.$pressScope;
            wu60 wu60Var = new wu60(this.$down.c);
            this.label = 1;
            if (zlsVar.invoke(sVar, wu60Var, this) == coroutineSingletons) {
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
