package com.yandex.go.suggest.impl.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bwp0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.SuperappSuggestTextInputRepository$forceQuery$1", f = "SuperappSuggestTextInputRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestTextInputRepository$forceQuery$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $prefixText;
    final /* synthetic */ boolean $shouldPreserveOnRestore;
    final /* synthetic */ String $text;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestTextInputRepository$forceQuery$1(a aVar, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$text = str;
        this.$prefixText = str2;
        this.$shouldPreserveOnRestore = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestTextInputRepository$forceQuery$1(this.this$0, this.$text, this.$prefixText, this.$shouldPreserveOnRestore, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestTextInputRepository$forceQuery$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            n0 n0Var = this.this$0.l;
            String str2 = this.$text;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$0;
                b.b(obj);
                this.this$0.d(str);
                return zy11Var;
            }
            b.b(obj);
        }
        String obj2 = evu0.k0(this.$text).toString();
        r0 r0Var = this.this$0.j;
        bwp0 bwp0Var = new bwp0(true, this.$shouldPreserveOnRestore, obj2, this.$prefixText);
        this.L$0 = obj2;
        this.label = 2;
        r0Var.emit(bwp0Var, this);
        if (zy11Var != coroutineSingletons) {
            str = obj2;
            this.this$0.d(str);
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
