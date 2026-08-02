package com.yandex.go.navigator.driving.speaker;

import com.yandex.go.navigator.repository.VoiceMode;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "", "available", BackendConfig.Restrictions.ENABLED, "Lcom/yandex/go/navigator/repository/VoiceMode;", "isInDrive", "<unused var>", "", "retries", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.speaker.SpeakerManager$subscribeToNavigationUpdates$2", f = "SpeakerManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SpeakerManager$subscribeToNavigationUpdates$2 extends SuspendLambda implements ems {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public SpeakerManager$subscribeToNavigationUpdates$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj5).intValue();
        SpeakerManager$subscribeToNavigationUpdates$2 speakerManager$subscribeToNavigationUpdates$2 = new SpeakerManager$subscribeToNavigationUpdates$2((Continuation) obj6);
        speakerManager$subscribeToNavigationUpdates$2.Z$0 = booleanValue;
        speakerManager$subscribeToNavigationUpdates$2.L$0 = (VoiceMode) obj2;
        speakerManager$subscribeToNavigationUpdates$2.Z$1 = booleanValue2;
        speakerManager$subscribeToNavigationUpdates$2.I$0 = intValue;
        return speakerManager$subscribeToNavigationUpdates$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        VoiceMode voiceMode = (VoiceMode) this.L$0;
        boolean z2 = this.Z$1;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && voiceMode != VoiceMode.TURN_OFF && z2 && i < 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
