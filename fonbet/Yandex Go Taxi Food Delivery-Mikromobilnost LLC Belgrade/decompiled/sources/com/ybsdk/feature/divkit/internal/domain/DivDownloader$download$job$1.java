package com.ybsdk.feature.divkit.internal.domain;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sr51;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$download$job$1", f = "DivDownloader.kt", l = {44, 45, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$download$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ sr51 $callbacks;
    final /* synthetic */ Boolean $isPollingRequest;
    final /* synthetic */ String $logId;
    final /* synthetic */ DownloadPayload $payload;
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$download$job$1(Boolean bool, b bVar, String str, DownloadPayload downloadPayload, sr51 sr51Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.$isPollingRequest = bool;
        this.this$0 = bVar;
        this.$uri = str;
        this.$payload = downloadPayload;
        this.$callbacks = sr51Var;
        this.$logId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivDownloader$download$job$1(this.$isPollingRequest, this.this$0, this.$uri, this.$payload, this.$callbacks, this.$logId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivDownloader$download$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.ybsdk.feature.divkit.internal.domain.b.c(r5, r6, r7, r8, r9, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (com.ybsdk.feature.divkit.internal.domain.b.a(r1, r2, r3, r4, r5, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (com.ybsdk.feature.divkit.internal.domain.b.b(r1, r2, r3, r4, r5, r11) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (jl40.l(this.$isPollingRequest, Boolean.TRUE)) {
                b bVar = this.this$0;
                String str = this.$uri;
                DownloadPayload downloadPayload = this.$payload;
                sr51 sr51Var = this.$callbacks;
                String str2 = this.$logId;
                this.label = 1;
            } else {
                boolean isGeneralResponse = this.$payload.isGeneralResponse();
                b bVar2 = this.this$0;
                String str3 = this.$uri;
                if (isGeneralResponse) {
                    DownloadPayload downloadPayload2 = this.$payload;
                    sr51 sr51Var2 = this.$callbacks;
                    String str4 = this.$logId;
                    this.label = 2;
                } else {
                    DownloadPayload downloadPayload3 = this.$payload;
                    sr51 sr51Var3 = this.$callbacks;
                    String str5 = this.$logId;
                    this.label = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
