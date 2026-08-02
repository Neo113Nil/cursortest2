package coil;

import android.graphics.Bitmap;
import defpackage.cgo;
import defpackage.hev;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wis0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnev;", "<anonymous>", "(Ltse;)Lnev;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ cgo $eventListener;
    final /* synthetic */ Bitmap $placeholderBitmap;
    final /* synthetic */ hev $request;
    final /* synthetic */ wis0 $size;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(hev hevVar, c cVar, wis0 wis0Var, cgo cgoVar, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.$request = hevVar;
        this.this$0 = cVar;
        this.$size = wis0Var;
        this.$eventListener = cgoVar;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$executeMain$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hev hevVar = this.$request;
        coil.intercept.b bVar = new coil.intercept.b(hevVar, this.this$0.i, 0, hevVar, this.$size, this.$eventListener, this.$placeholderBitmap != null);
        this.label = 1;
        Object f = bVar.f(hevVar, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
