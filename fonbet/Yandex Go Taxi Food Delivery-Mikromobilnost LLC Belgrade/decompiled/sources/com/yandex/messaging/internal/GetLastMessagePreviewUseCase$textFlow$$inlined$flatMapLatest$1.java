package com.yandex.messaging.internal;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import defpackage.fi9;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n8t;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.tmt0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1", f = "GetLastMessagePreviewUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ o1b0 $chat$inlined;
    final /* synthetic */ String $messageText$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ n8t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1(Continuation continuation, n8t n8tVar, o1b0 o1b0Var, String str) {
        super(3, continuation);
        this.this$0 = n8tVar;
        this.$chat$inlined = o1b0Var;
        this.$messageText$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1 getLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1 = new GetLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$chat$inlined, this.$messageText$inlined);
        getLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return getLastMessagePreviewUseCase$textFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r7 != null) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            String str = (String) this.L$1;
            tmt0 tmt0Var = this.this$0.e;
            n8t n8tVar = this.this$0;
            o1b0 o1b0Var = this.$chat$inlined;
            String str2 = this.$messageText$inlined;
            int i2 = n8tVar.i;
            SpannableStringBuilder b = n8tVar.f.b(0, str2);
            if (!o1b0Var.d && !o1b0Var.n) {
                o1b0Var = null;
            }
            if (o1b0Var != null) {
                if (jl40.l(str, n8tVar.h)) {
                    o1b0Var = null;
                }
                if (o1b0Var != null) {
                    SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) b);
                    append.setSpan(new ForegroundColorSpan(i2), 0, append.length(), 33);
                    charSequence = append.toString();
                }
            }
            String spannableStringBuilder = b.toString();
            int i3 = n8tVar.j;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) str).append((CharSequence) ":");
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(i3), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(i2), length, spannableStringBuilder2.length(), 33);
            charSequence = spannableStringBuilder2;
            fi9 i4 = kotlinx.coroutines.flow.e.i(new SpannableMessageObservable$flow$$inlined$disposableFlowWrapper$1(null, tmt0Var, new SpannableStringBuilder(charSequence), tmt0.e));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(i4, vprVar, this) == coroutineSingletons) {
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
