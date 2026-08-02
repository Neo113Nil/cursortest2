package com.yandex.messaging.audio;

import defpackage.b1s;
import defpackage.izc0;
import defpackage.j24;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tyc0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.audio.AudioPlayerViewController$playlist$1$1", f = "AudioPlayerViewController.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AudioPlayerViewController$playlist$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ izc0 $playlist;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerViewController$playlist$1$1(izc0 izc0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$playlist = izc0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioPlayerViewController$playlist$1$1(this.$playlist, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioPlayerViewController$playlist$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            izc0 izc0Var = this.$playlist;
            this.label = 1;
            if (izc0Var.e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d dVar = this.this$0;
        dVar.h = this.$playlist.f();
        tyc0 tyc0Var = dVar.a;
        tyc0Var.a();
        boolean contains = tyc0Var.f.keySet().contains(dVar.h);
        mrj mrjVar = dVar.e;
        if (contains) {
            mrjVar.A();
        } else {
            mrjVar.E();
        }
        dVar.b();
        j24 j24Var = dVar.f;
        if (j24Var != null) {
            j24Var.invoke(dVar.h);
        }
        b1s b1sVar = dVar.g;
        if (b1sVar != null) {
            b1sVar.cancel();
        }
        dVar.g = new b1s(tyc0Var, dVar.h, dVar);
        return zy11.a;
    }
}
