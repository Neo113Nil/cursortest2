package com.ybsdk.rconfig.retriever;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import com.ybsdk.rconfig.configs.RemoteConfigCallConfig;
import com.ybsdk.rconfig.configs.RemoteConfigCallType;
import defpackage.f8z0;
import defpackage.fcy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rui0;
import defpackage.s630;
import defpackage.tse;
import defpackage.v8z0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lv8z0;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lv8z0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.rconfig.retriever.RemoteConfigRetrieverControllerImpl$createUpdateTask$1", f = "RemoteConfigRetrieverControllerImpl.kt", l = {HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY, 142}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class RemoteConfigRetrieverControllerImpl$createUpdateTask$1 extends SuspendLambda implements wls {
    final /* synthetic */ InternalSdkState $state;
    final /* synthetic */ RemoteConfigUpdateTrigger $trigger;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigRetrieverControllerImpl$createUpdateTask$1(d dVar, InternalSdkState internalSdkState, RemoteConfigUpdateTrigger remoteConfigUpdateTrigger, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$state = internalSdkState;
        this.$trigger = remoteConfigUpdateTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfigRetrieverControllerImpl$createUpdateTask$1(this.this$0, this.$state, this.$trigger, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigRetrieverControllerImpl$createUpdateTask$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        InternalSdkState internalSdkState;
        RemoteConfigUpdateTrigger remoteConfigUpdateTrigger;
        long j;
        InternalSdkState internalSdkState2;
        d dVar2;
        Object a;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar3 = this.this$0;
            InternalSdkState internalSdkState3 = this.$state;
            RemoteConfigUpdateTrigger remoteConfigUpdateTrigger2 = this.$trigger;
            long a2 = s630.a();
            f fVar = dVar3.b;
            this.L$0 = dVar3;
            this.L$1 = internalSdkState3;
            this.L$2 = remoteConfigUpdateTrigger2;
            this.J$0 = a2;
            this.label = 1;
            Object a3 = fVar.a(this);
            if (a3 != coroutineSingletons) {
                dVar = dVar3;
                obj = a3;
                internalSdkState = internalSdkState3;
                remoteConfigUpdateTrigger = remoteConfigUpdateTrigger2;
                j = a2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.J$0;
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                return new v8z0(new Result(a), f8z0.a(j2));
            }
            j = this.J$0;
            remoteConfigUpdateTrigger = (RemoteConfigUpdateTrigger) this.L$2;
            internalSdkState2 = (InternalSdkState) this.L$1;
            dVar2 = (d) this.L$0;
            kotlin.b.b(obj);
            if (((String) obj) == null) {
                fcy0 fcy0Var = dVar2.g.m0;
                String b = internalSdkState2 != null ? com.ybsdk.common.c.b(internalSdkState2) : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                if (b != null) {
                    linkedHashMap.put("sdk_state", b);
                }
                fcy0Var.a.a("tech.remote_config.session_id.waiting_timeout", linkedHashMap);
            }
            dVar = dVar2;
            a aVar = dVar.e;
            RemoteConfigCallType callType = ((RemoteConfigCallConfig) dVar.d.d(rui0.a).getData()).getCallType();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = j;
            this.label = 3;
            a = aVar.a(remoteConfigUpdateTrigger, callType, this);
            if (a != coroutineSingletons) {
                j2 = j;
                return new v8z0(new Result(a), f8z0.a(j2));
            }
            return coroutineSingletons;
        }
        j = this.J$0;
        remoteConfigUpdateTrigger = (RemoteConfigUpdateTrigger) this.L$2;
        internalSdkState = (InternalSdkState) this.L$1;
        dVar = (d) this.L$0;
        kotlin.b.b(obj);
        if (obj != null) {
            RemoteConfigRetrieverControllerImpl$createUpdateTask$1$1$1 remoteConfigRetrieverControllerImpl$createUpdateTask$1$1$1 = new RemoteConfigRetrieverControllerImpl$createUpdateTask$1$1$1(dVar, null);
            this.L$0 = dVar;
            this.L$1 = internalSdkState;
            this.L$2 = remoteConfigUpdateTrigger;
            this.J$0 = j;
            this.label = 2;
            obj = kotlinx.coroutines.a.w(15000L, remoteConfigRetrieverControllerImpl$createUpdateTask$1$1$1, this);
            if (obj != coroutineSingletons) {
                internalSdkState2 = internalSdkState;
                dVar2 = dVar;
                if (((String) obj) == null) {
                }
                dVar = dVar2;
            }
            return coroutineSingletons;
        }
        a aVar2 = dVar.e;
        RemoteConfigCallType callType2 = ((RemoteConfigCallConfig) dVar.d.d(rui0.a).getData()).getCallType();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.J$0 = j;
        this.label = 3;
        a = aVar2.a(remoteConfigUpdateTrigger, callType2, this);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
