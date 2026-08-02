package com.yandex.passport.internal.report.diary;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryArgumentsRecorder", f = "DiaryArgumentsRecorder.kt", l = {111, HProv.PP_CACHE_SIZE, HProv.PP_INFO, Constants.VPN_TRAFFIC, HProv.PP_SAME_MEDIA, 128, HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT, PollMessageDraft.MAX_ANSWER_LENGTH, 141, 150, ModuleDescriptor.MODULE_VERSION, 162, 175}, m = "recordIntentArguments")
/* loaded from: classes8.dex */
final class DiaryArgumentsRecorder$recordIntentArguments$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryArgumentsRecorder$recordIntentArguments$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, null, null, this);
    }
}
