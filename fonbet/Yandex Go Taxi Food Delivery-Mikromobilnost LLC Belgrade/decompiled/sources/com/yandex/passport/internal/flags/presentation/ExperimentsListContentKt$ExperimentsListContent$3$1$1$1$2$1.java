package com.yandex.passport.internal.flags.presentation;

import defpackage.ay40;
import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zx40;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.flags.presentation.ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1", f = "ExperimentsListContent.kt", l = {BuildConfig.API_LEVEL, HProv.PP_NK_SYNC, HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $highlightedIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ zx40 $interactionSource;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1(int i, zx40 zx40Var, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$index = i;
        this.$interactionSource = zx40Var;
        this.$highlightedIndex$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1(this.$index, this.$interactionSource, this.$highlightedIndex$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (((defpackage.ay40) r9).a(r4, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (kotlinx.coroutines.a.i(300, r8) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jxe0 jxe0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$index == this.$highlightedIndex$delegate.getIntValue()) {
                jxe0 jxe0Var2 = new jxe0(0L);
                zx40 zx40Var = this.$interactionSource;
                this.L$0 = jxe0Var2;
                this.label = 1;
                if (((ay40) zx40Var).a(jxe0Var2, this) != coroutineSingletons) {
                    jxe0Var = jxe0Var2;
                }
                return coroutineSingletons;
            }
            return zy11.a;
        }
        if (i == 1) {
            jxe0Var = (jxe0) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.$highlightedIndex$delegate.setIntValue(-1);
                return zy11.a;
            }
            jxe0Var = (jxe0) this.L$0;
            kotlin.b.b(obj);
            zx40 zx40Var2 = this.$interactionSource;
            kxe0 kxe0Var = new kxe0(jxe0Var);
            this.L$0 = null;
            this.label = 3;
        }
        this.L$0 = jxe0Var;
        this.label = 2;
    }
}
