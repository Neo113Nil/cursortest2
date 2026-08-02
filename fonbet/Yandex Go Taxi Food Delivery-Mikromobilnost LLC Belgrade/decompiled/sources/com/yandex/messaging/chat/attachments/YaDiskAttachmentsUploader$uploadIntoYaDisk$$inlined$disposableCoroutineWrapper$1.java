package com.yandex.messaging.chat.attachments;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.ResolvedYaDiskFile;
import defpackage.a441;
import defpackage.dvw;
import defpackage.hk51;
import defpackage.j18;
import defpackage.lc3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t2r;
import defpackage.tse;
import defpackage.tw80;
import defpackage.wls;
import defpackage.zj51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1", f = "YaDiskAttachmentsUploader.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ List $files$inlined;
    final /* synthetic */ String $messageId$inlined;
    final /* synthetic */ Map $preparedByUploadId$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1(Continuation continuation, c cVar, List list, Map map, String str) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$files$inlined = list;
        this.$preparedByUploadId$inlined = map;
        this.$messageId$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1 yaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1 = new YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1(continuation, this.this$0, this.$files$inlined, this.$preparedByUploadId$inlined, this.$messageId$inlined);
        yaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1.L$0 = obj;
        return yaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hk51 hk51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        t2r t2rVar = this.this$0.f;
        List<ResolvedYaDiskFile> list = this.$files$inlined;
        ArrayList arrayList = new ArrayList();
        for (ResolvedYaDiskFile resolvedYaDiskFile : list) {
            zj51 zj51Var = (zj51) this.$preparedByUploadId$inlined.get(resolvedYaDiskFile.getUploadId());
            if (zj51Var == null) {
                hk51Var = null;
            } else {
                tw80 tw80Var = zj51Var.b;
                hk51Var = new hk51(this.this$0.a.b, this.$messageId$inlined, Uri.parse(tw80Var.a), resolvedYaDiskFile, tw80Var.b, zj51Var.c);
            }
            if (hk51Var != null) {
                arrayList.add(hk51Var);
            }
        }
        a441 a441Var = new a441(7, j18Var, this.this$0);
        t2rVar.getClass();
        j18Var.w(new lc3(tseVar, t2rVar.c(arrayList.iterator(), new ArrayList(), a441Var), 5));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
