package com.yandex.messaging.chat.attachments;

import android.net.Uri;
import defpackage.izq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tw80;
import defpackage.wls;
import defpackage.zj51;
import defpackage.zy11;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzj51;", "<anonymous>", "(Ltse;)Lzj51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskAttachmentsUploader$prepareFiles$2$1$1", f = "YaDiskAttachmentsUploader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskAttachmentsUploader$prepareFiles$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tw80 $attachment;
    final /* synthetic */ ConcurrentHashMap.KeySetView<String, Boolean> $existedFileNames;
    final /* synthetic */ String $groupUploadId;
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskAttachmentsUploader$prepareFiles$2$1$1(c cVar, tw80 tw80Var, ConcurrentHashMap.KeySetView keySetView, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$attachment = tw80Var;
        this.$existedFileNames = keySetView;
        this.$groupUploadId = str;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YaDiskAttachmentsUploader$prepareFiles$2$1$1(this.this$0, this.$attachment, this.$existedFileNames, this.$groupUploadId, this.$index, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskAttachmentsUploader$prepareFiles$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            izq a = this.this$0.d.a(Uri.parse(this.$attachment.a), this.$attachment.b, this.$existedFileNames);
            this.$existedFileNames.add(a.b.a);
            return new zj51(this.$groupUploadId + "_" + this.$index, this.$attachment, this.this$0.d.b(a, 0L));
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }
}
