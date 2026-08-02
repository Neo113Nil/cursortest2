package com.ybsdk.feature.divkit.internal.domain;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.internal.data.DivApi;
import com.ybsdk.feature.divkit.internal.dto.DivPatch;
import com.ybsdk.feature.divkit.internal.dto.DivPatchDto;
import com.ybsdk.feature.divkit.internal.dto.DivPollingDto;
import com.ybsdk.feature.divkit.internal.dto.ResponseStatus;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.snk;
import defpackage.sr51;
import defpackage.tq11;
import defpackage.wls;
import defpackage.y2l;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDto;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$polling$3", f = "DivDownloader.kt", l = {61, 69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$polling$3 extends SuspendLambda implements wls {
    final /* synthetic */ sr51 $callbacks;
    final /* synthetic */ String $logId;
    final /* synthetic */ DownloadPayload $payload;
    final /* synthetic */ String $uri;
    /* synthetic */ int I$0;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "body", "", "headers", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDto;", "<anonymous>", "(Ljava/lang/String;Ljava/util/Map;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$polling$3$1", f = "DivDownloader.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.divkit.internal.domain.DivDownloader$polling$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ String $uri;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, int i, Continuation continuation) {
            super(3, continuation);
            this.this$0 = bVar;
            this.$uri = str;
            this.$attemptNumber = i;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uri, this.$attemptNumber, (Continuation) obj3);
            anonymousClass1.L$0 = (String) obj;
            anonymousClass1.L$1 = (Map) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                Map map = (Map) this.L$1;
                DivApi divApi = this.this$0.b;
                String str2 = this.$uri;
                Map<String, String> o = kotlin.collections.b.o(map, new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(this.$attemptNumber)));
                this.L$0 = null;
                this.label = 1;
                c = divApi.c(str2, str, o, this);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c = ((Result) obj).getValue();
            }
            return new Result(c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$polling$3(b bVar, DownloadPayload downloadPayload, String str, String str2, sr51 sr51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = downloadPayload;
        this.$logId = str;
        this.$uri = str2;
        this.$callbacks = sr51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivDownloader$polling$3 divDownloader$polling$3 = new DivDownloader$polling$3(this.this$0, this.$payload, this.$logId, this.$uri, this.$callbacks, continuation);
        divDownloader$polling$3.I$0 = ((tq11) obj).a;
        return divDownloader$polling$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        DivDownloader$polling$3 divDownloader$polling$3 = new DivDownloader$polling$3(this.this$0, this.$payload, this.$logId, this.$uri, this.$callbacks, (Continuation) obj2);
        divDownloader$polling$3.I$0 = i;
        return divDownloader$polling$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object failure;
        iyd0 iyd0Var;
        DivPatch divPatch;
        String patch;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        y2l y2lVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            b bVar = this.this$0;
            DownloadPayload downloadPayload = this.$payload;
            String str = this.$logId;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$uri, i2, null);
            this.label = 1;
            d = bVar.d(downloadPayload, str, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iyd0Var = (iyd0) this.L$0;
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                if (!(failure instanceof Result.Failure)) {
                    failure = new iyd0(iyd0Var.b, failure);
                }
                sr51 sr51Var = this.$callbacks;
                b bVar2 = this.this$0;
                if (!(failure instanceof Result.Failure)) {
                    DivPollingDto divPollingDto = (DivPollingDto) ((iyd0) failure).a;
                    if (divPollingDto.getStatus() == ResponseStatus.IN_PROGRESS) {
                        DivPatchDto inProgressData = divPollingDto.getInProgressData();
                        if (inProgressData != null && (divPatch = inProgressData.getDivPatch()) != null && (patch = divPatch.getPatch()) != null) {
                            bVar2.getClass();
                            y2lVar = b.e(patch, null);
                        }
                        snk snkVar = (snk) sr51Var;
                        if (y2lVar != null) {
                            snkVar.b.applyPatch(y2lVar);
                        } else {
                            snkVar.getClass();
                        }
                    }
                }
                return new Result(failure);
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        Throwable a = Result.a(d);
        if (a != null) {
            failure = new Result.Failure(a);
            sr51 sr51Var2 = this.$callbacks;
            b bVar22 = this.this$0;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        iyd0 iyd0Var2 = (iyd0) d;
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
        DivDownloader$polling$3$2$1$1 divDownloader$polling$3$2$1$1 = new DivDownloader$polling$3$2$1$1(2, null);
        this.L$0 = iyd0Var2;
        this.label = 2;
        Object a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, divDownloader$polling$3$2$1$1, this);
        if (a2 != coroutineSingletons) {
            iyd0Var = iyd0Var2;
            failure = a2;
            if (!(failure instanceof Result.Failure)) {
            }
            sr51 sr51Var22 = this.$callbacks;
            b bVar222 = this.this$0;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
