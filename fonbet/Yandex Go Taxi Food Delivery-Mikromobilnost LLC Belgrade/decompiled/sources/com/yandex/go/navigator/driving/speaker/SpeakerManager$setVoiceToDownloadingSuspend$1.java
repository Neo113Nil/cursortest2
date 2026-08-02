package com.yandex.go.navigator.driving.speaker;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.speaker.SpeakerManager", f = "SpeakerManager.kt", l = {HProv.PP_SAME_MEDIA, HProv.PP_DELETE_KEYSET, HProv.PP_LCD_QUERY, 143}, m = "setVoiceToDownloadingSuspend", v = 2)
/* loaded from: classes12.dex */
final class SpeakerManager$setVoiceToDownloadingSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeakerManager$setVoiceToDownloadingSuspend$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
