package androidx.compose.material;

import defpackage.ck11;
import defpackage.g8w;
import defpackage.i7h;
import defpackage.jxe0;
import defpackage.ltu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9m;
import defpackage.tse;
import defpackage.wls;
import defpackage.wqn;
import defpackage.y7m;
import defpackage.ztr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {551, 560}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DefaultButtonElevation$elevation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ g8w $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ i7h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$2$1(androidx.compose.animation.core.a aVar, float f, boolean z, i7h i7hVar, g8w g8wVar, Continuation continuation) {
        super(2, continuation);
        this.$animatable = aVar;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = i7hVar;
        this.$interaction = g8wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultButtonElevation$elevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultButtonElevation$elevation$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if ((r14 instanceof defpackage.ztr) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g8w ztrVar;
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        ck11 ck11Var = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!y7m.b(((y7m) this.$animatable.f.getValue()).a, this.$target)) {
            boolean z = this.$enabled;
            androidx.compose.animation.core.a aVar = this.$animatable;
            if (z) {
                float f2 = ((y7m) aVar.f.getValue()).a;
                this.this$0.getClass();
                if (y7m.b(f2, 8.0f)) {
                    ztrVar = new jxe0(0L);
                } else {
                    this.this$0.getClass();
                    if (y7m.b(f2, 4.0f)) {
                        ztrVar = new ltu();
                    } else {
                        this.this$0.getClass();
                        ztrVar = y7m.b(f2, 4.0f) ? new ztr() : null;
                    }
                }
                androidx.compose.animation.core.a aVar2 = this.$animatable;
                float f3 = this.$target;
                g8w g8wVar = this.$interaction;
                this.label = 2;
                ck11 ck11Var2 = wqn.b;
                ck11 ck11Var3 = wqn.a;
                if (g8wVar != null) {
                    if ((g8wVar instanceof jxe0) || (g8wVar instanceof s9m) || (g8wVar instanceof ltu) || (g8wVar instanceof ztr)) {
                        ck11Var = ck11Var3;
                    }
                } else if (ztrVar != null) {
                    if (!(ztrVar instanceof jxe0) && !(ztrVar instanceof s9m)) {
                        if (ztrVar instanceof ltu) {
                            ck11Var = wqn.c;
                        }
                    }
                    ck11Var = ck11Var2;
                }
                ck11 ck11Var4 = ck11Var;
                if (ck11Var4 == null ? (f = aVar2.f(new y7m(f3), this)) != coroutineSingletons : (f = androidx.compose.animation.core.a.d(aVar2, new y7m(f3), ck11Var4, null, null, this, 12)) != coroutineSingletons) {
                    f = zy11Var;
                }
                if (f == coroutineSingletons) {
                }
            } else {
                y7m y7mVar = new y7m(this.$target);
                this.label = 1;
                if (aVar.f(y7mVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
