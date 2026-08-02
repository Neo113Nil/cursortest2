package com.yandex.messaging.audio;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rh3;
import defpackage.sh3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.audio.AudioTracksRepository$readTrackFromCursor$3$1$1", f = "AudioTracksRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AudioTracksRepository$readTrackFromCursor$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rh3 $audioTrack;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTracksRepository$readTrackFromCursor$3$1$1(rh3 rh3Var, Continuation continuation) {
        super(2, continuation);
        this.$audioTrack = rh3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioTracksRepository$readTrackFromCursor$3$1$1(this.$audioTrack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AudioTracksRepository$readTrackFromCursor$3$1$1 audioTracksRepository$readTrackFromCursor$3$1$1 = (AudioTracksRepository$readTrackFromCursor$3$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        audioTracksRepository$readTrackFromCursor$3$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        sh3 sh3Var = (sh3) this.$audioTrack;
        sh3Var.a.j(sh3Var);
        return zy11.a;
    }
}
