package com.yandex.messaging.internal.avatar;

import androidx.compose.runtime.g;
import com.yandex.messaging.profile.d;
import defpackage.dnh;
import defpackage.g9v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.v320;
import defpackage.vb61;
import defpackage.w6f0;
import defpackage.wls;
import defpackage.wv51;
import defpackage.xav;
import defpackage.yn50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw6f0;", "Lxb61;", "Lzy11;", "<anonymous>", "(Lw6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.avatar.Yx360ImageLoaderImpl$rememberImageDrawableState$1$1", f = "Yx360ImageLoaderImpl.kt", l = {122, 142}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class Yx360ImageLoaderImpl$rememberImageDrawableState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $model;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yx360ImageLoaderImpl$rememberImageDrawableState$1$1(Object obj, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$model = obj;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Yx360ImageLoaderImpl$rememberImageDrawableState$1$1 yx360ImageLoaderImpl$rememberImageDrawableState$1$1 = new Yx360ImageLoaderImpl$rememberImageDrawableState$1$1(this.$model, this.this$0, continuation);
        yx360ImageLoaderImpl$rememberImageDrawableState$1$1.L$0 = obj;
        return yx360ImageLoaderImpl$rememberImageDrawableState$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Yx360ImageLoaderImpl$rememberImageDrawableState$1$1) create((w6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (((androidx.compose.runtime.g) r1).a(r5, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w6f0 w6f0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w6f0Var = (w6f0) this.L$0;
            if (!(this.$model instanceof String)) {
                ((g) w6f0Var).setValue(vb61.b);
                return zy11.a;
            }
            d dVar = this.this$0.a;
            this.L$0 = w6f0Var;
            this.label = 1;
            obj = e.y(dVar.b(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ny61.A();
                return null;
            }
            w6f0Var = (w6f0) this.L$0;
            kotlin.b.b(obj);
        }
        g9v load = ((xav) ((p8g) ((v320) obj)).j0.get()).load((String) this.$model);
        this.this$0.b.invoke(load);
        ((yn50) load).b(null, new dnh(7, w6f0Var));
        wv51 wv51Var = new wv51(1, load);
        this.L$0 = null;
        this.label = 2;
    }
}
