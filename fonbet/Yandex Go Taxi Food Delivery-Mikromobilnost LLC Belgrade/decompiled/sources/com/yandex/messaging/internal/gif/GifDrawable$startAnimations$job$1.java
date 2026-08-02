package com.yandex.messaging.internal.gif;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.aht;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.uui;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.GifDrawable$startAnimations$job$1", f = "GifDrawable.kt", l = {HProv.PP_VERSION_EX, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GifDrawable$startAnimations$job$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GifDrawable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifDrawable$startAnimations$job$1(GifDrawable gifDrawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gifDrawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GifDrawable$startAnimations$job$1 gifDrawable$startAnimations$job$1 = new GifDrawable$startAnimations$job$1(this.this$0, continuation);
        gifDrawable$startAnimations$job$1.L$0 = obj;
        return gifDrawable$startAnimations$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GifDrawable$startAnimations$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        Object waitTargetViewToGetOnScreen;
        aht ahtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            GifDrawable gifDrawable = this.this$0;
            this.L$0 = tseVar;
            this.label = 1;
            waitTargetViewToGetOnScreen = gifDrawable.waitTargetViewToGetOnScreen(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        this.this$0.controlTargetViewToGetOffscreen(tseVar);
        ahtVar = this.this$0.gifWrapper;
        b bVar = (b) ahtVar;
        bVar.getClass();
        rol0 rol0Var = new rol0(new PrecachingGifWrapper$frameFlow$1(bVar, null));
        uui uuiVar = new uui(29, this.this$0);
        this.L$0 = null;
        this.label = 2;
    }
}
