package com.yandex.messaging.chat.attachments;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tw80;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lzj51;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskAttachmentsUploader$prepareFiles$2", f = "YaDiskAttachmentsUploader.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskAttachmentsUploader$prepareFiles$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $groupUploadId;
    final /* synthetic */ List<tw80> $newAttachments;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskAttachmentsUploader$prepareFiles$2(List list, c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$newAttachments = list;
        this.this$0 = cVar;
        this.$groupUploadId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        YaDiskAttachmentsUploader$prepareFiles$2 yaDiskAttachmentsUploader$prepareFiles$2 = new YaDiskAttachmentsUploader$prepareFiles$2(this.$newAttachments, this.this$0, this.$groupUploadId, continuation);
        yaDiskAttachmentsUploader$prepareFiles$2.L$0 = obj;
        return yaDiskAttachmentsUploader$prepareFiles$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskAttachmentsUploader$prepareFiles$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
            List<tw80> list = this.$newAttachments;
            c cVar = this.this$0;
            String str = this.$groupUploadId;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(tje.h(tseVar, cVar.k.d, null, new YaDiskAttachmentsUploader$prepareFiles$2$1$1(cVar, (tw80) obj2, newKeySet, str, i2, null), 2));
                i2 = i3;
            }
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
