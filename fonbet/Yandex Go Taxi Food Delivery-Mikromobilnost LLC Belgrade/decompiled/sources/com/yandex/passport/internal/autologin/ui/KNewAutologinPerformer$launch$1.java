package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.a0;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.autologin.ui.KNewAutologinPerformer$launch$1", f = "KNewAutologinPerformer.kt", l = {HProv.PP_DHOID, 241, 101, 103}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class KNewAutologinPerformer$launch$1 extends SuspendLambda implements wls {
    final /* synthetic */ a0 $properties;
    final /* synthetic */ boolean $useCredentialManager;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNewAutologinPerformer$launch$1(boolean z, j jVar, a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.$useCredentialManager = z;
        this.this$0 = jVar;
        this.$properties = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KNewAutologinPerformer$launch$1(this.$useCredentialManager, this.this$0, this.$properties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KNewAutologinPerformer$launch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (com.yandex.passport.internal.autologin.ui.j.b(r1, r2, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if (com.yandex.passport.internal.autologin.ui.j.b(r1, r10, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r10 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$useCredentialManager;
            j jVar = this.this$0;
            if (z) {
                sjh sjhVar = uyj.a;
                CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(jVar.d.e, g1.b, new lfx[0], null);
                this.label = 2;
                obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, this);
            } else {
                a0 a0Var = this.$properties;
                this.label = 1;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object value = ((Result) obj).getValue();
        j jVar2 = this.this$0;
        a0 a0Var2 = this.$properties;
        if (!(value instanceof Result.Failure)) {
            if (((Boolean) value).booleanValue()) {
                this.label = 3;
                if (j.a(jVar2, a0Var2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.label = 4;
            }
        }
        return zy11.a;
    }
}
