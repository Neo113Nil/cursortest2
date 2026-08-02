package com.yandex.messaging.internal.translator;

import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.fse;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.TranslationLanguageUiController$createFlow$1", f = "TranslationLanguageUiController.kt", l = {HProv.ALG_SID_NO_HASH, HProv.PP_CIPHEROID, HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TranslationLanguageUiController$createFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ lz40 $readFlow;
    final /* synthetic */ lz40 $writeFlow;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationLanguageUiController$createFlow$1(k kVar, lz40 lz40Var, lz40 lz40Var2, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$readFlow = lz40Var;
        this.$writeFlow = lz40Var2;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TranslationLanguageUiController$createFlow$1(this.this$0, this.$readFlow, this.$writeFlow, this.$chatRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageUiController$createFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r9, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r1.emit((java.lang.String) r9, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r9 == r0) goto L20;
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
            fse fseVar = r.a(this.this$0.a).b;
            TranslationLanguageUiController$createFlow$1$lang$1 translationLanguageUiController$createFlow$1$lang$1 = new TranslationLanguageUiController$createFlow$1$lang$1(this.this$0, this.$chatRequest, null);
            this.label = 1;
            obj = tje.k0(fseVar, translationLanguageUiController$createFlow$1$lang$1, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            lz40 lz40Var = this.$readFlow;
            lz40 lz40Var2 = this.$writeFlow;
            this.label = 3;
        }
        lz40 lz40Var3 = this.$readFlow;
        this.label = 2;
    }
}
