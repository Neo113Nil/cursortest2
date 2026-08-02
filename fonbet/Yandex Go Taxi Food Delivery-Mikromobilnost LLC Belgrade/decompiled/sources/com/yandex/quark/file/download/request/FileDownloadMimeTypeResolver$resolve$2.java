package com.yandex.quark.file.download.request;

import defpackage.d5j0;
import defpackage.evu0;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.loj;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.t4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zwf0;
import defpackage.zy11;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.file.download.request.FileDownloadMimeTypeResolver$resolve$2", f = "FileDownloadMimeTypeResolver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FileDownloadMimeTypeResolver$resolve$2 extends SuspendLambda implements wls {
    final /* synthetic */ kwu $httpUrl;
    final /* synthetic */ boolean $requiresAuth;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloadMimeTypeResolver$resolve$2(kwu kwuVar, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$httpUrl = kwuVar;
        this.this$0 = aVar;
        this.$requiresAuth = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileDownloadMimeTypeResolver$resolve$2(this.$httpUrl, this.this$0, this.$requiresAuth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FileDownloadMimeTypeResolver$resolve$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = this.$httpUrl;
        t4j0Var.e("HEAD", null);
        this.this$0.b.a(this.$httpUrl, this.$requiresAuth, "OkHttp", new loj(24, t4j0Var));
        try {
            kvj0 execute = ((nci0) this.this$0.a.newCall(new d5j0(t4j0Var))).execute();
            int i = execute.w;
            a aVar = this.this$0;
            kwu kwuVar = this.$httpUrl;
            try {
                zwf0 zwf0Var = aVar.c;
                zwf0Var.c("FileDownloadMimeTypeResolver", "HEAD response code=" + i + " for url=" + kwuVar);
                if (!execute.J) {
                    zwf0Var.e("FileDownloadMimeTypeResolver", "Failed to obtain mime type from HEAD for url=" + kwuVar + ", responseCode=" + i);
                    execute.close();
                    return null;
                }
                String a = execute.y.a("Content-Type");
                if (a == null) {
                    a = null;
                }
                if (a == null || (str = evu0.k0(evu0.f0(';', a, a)).toString()) == null) {
                    str = null;
                } else {
                    zwf0Var.c("FileDownloadMimeTypeResolver", "Resolved mimeType=" + str + " for url=" + kwuVar);
                }
                execute.close();
                return str;
            } finally {
            }
        } catch (IOException e) {
            this.this$0.c.a("FileDownloadMimeTypeResolver", "Failed to obtain mime type for url=" + this.$httpUrl, e);
            return null;
        }
    }
}
