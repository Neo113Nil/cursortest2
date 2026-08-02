package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.directives.SetElementsStateDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.payment.common.result.ResultType;
import defpackage.cvw;
import defpackage.e3n;
import defpackage.iyj0;
import defpackage.jl40;
import defpackage.kh00;
import defpackage.kp50;
import defpackage.lh00;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o430;
import defpackage.s8x;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uqn;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Loyj0;", "Lzy11;", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "<anonymous>", "(Ltse;)Loyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.SetElementsStateDirectiveHandler$handle$2", f = "SetElementsStateDirectiveHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SetElementsStateDirectiveHandler$handle$2 extends SuspendLambda implements wls {
    final /* synthetic */ SetElementsStateDirective $directive;
    final /* synthetic */ uqn $stateMediator;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.chat.SetElementsStateDirectiveHandler$handle$2$4", f = "SetElementsStateDirectiveHandler.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.chat.SetElementsStateDirectiveHandler$handle$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        final /* synthetic */ SetElementsStateDirective $directive;
        final /* synthetic */ uqn $stateMediator;
        final /* synthetic */ int $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SetElementsStateDirective setElementsStateDirective, int i, uqn uqnVar, Continuation continuation) {
            super(2, continuation);
            this.$directive = setElementsStateDirective;
            this.$timeout = i;
            this.$stateMediator = uqnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.$directive, this.$timeout, this.$stateMediator, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kh00 kh00Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                SetElementsStateDirective setElementsStateDirective = this.$directive;
                List<String> list = setElementsStateDirective.ids;
                uqn uqnVar = this.$stateMediator;
                for (String str : list) {
                    String str2 = setElementsStateDirective.state;
                    int hashCode = str2.hashCode();
                    if (hashCode != 270940796) {
                        if (hashCode == 336650556 && str2.equals(ResultType.RESULT_TYPE_LOADING)) {
                            lh00 lh00Var = (lh00) uqnVar;
                            kh00 kh00Var2 = (kh00) lh00Var.a.get(str);
                            if (kh00Var2 != null) {
                                kh00Var2.c();
                            }
                            lh00Var.b.add(str);
                        }
                    } else if (str2.equals(BackendConfig.Restrictions.DISABLED)) {
                        lh00 lh00Var2 = (lh00) uqnVar;
                        kh00 kh00Var3 = (kh00) lh00Var2.a.get(str);
                        if (kh00Var3 != null) {
                            kh00Var3.b();
                        }
                        lh00Var2.b.add(str);
                    }
                }
                o430 o430Var = e3n.b;
                long e = e3n.e(kp50.U(this.$timeout, DurationUnit.SECONDS));
                this.label = 1;
                if (kotlinx.coroutines.a.i(e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            List<String> list2 = this.$directive.ids;
            uqn uqnVar2 = this.$stateMediator;
            for (String str3 : list2) {
                if (((lh00) uqnVar2).b.contains(str3) && (kh00Var = (kh00) ((lh00) uqnVar2).a.get(str3)) != null) {
                    kh00Var.a();
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetElementsStateDirectiveHandler$handle$2(SetElementsStateDirective setElementsStateDirective, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.$directive = setElementsStateDirective;
        this.$stateMediator = uqnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SetElementsStateDirectiveHandler$handle$2 setElementsStateDirectiveHandler$handle$2 = new SetElementsStateDirectiveHandler$handle$2(this.$directive, this.$stateMediator, continuation);
        setElementsStateDirectiveHandler$handle$2.L$0 = obj;
        return setElementsStateDirectiveHandler$handle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SetElementsStateDirectiveHandler$handle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        SetElementsStateDirective setElementsStateDirective = this.$directive;
        int i = setElementsStateDirective.timeoutSeconds;
        if (i < 1) {
            String str = "Invalid field of set_elements_state directive timeout_seconds = " + i + " (< 1)";
            z83.i();
            return new iyj0(new BotRequest.Error(null, null, new BotRequest.Error.ClientError(str), 3, null));
        }
        List<String> list = setElementsStateDirective.ids;
        if (list == null || list.isEmpty()) {
            String str2 = "Invalid field of set_elements_state directive ids = " + this.$directive.ids + " (null or empty)";
            z83.i();
            return new iyj0(new BotRequest.Error(null, null, new BotRequest.Error.ClientError(str2), 3, null));
        }
        if (jl40.l(this.$directive.state, ResultType.RESULT_TYPE_LOADING) || jl40.l(this.$directive.state, BackendConfig.Restrictions.DISABLED)) {
            s8x a = kotlinx.coroutines.a.a();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, cvw.U(a, o400.a), null, new AnonymousClass4(this.$directive, i, this.$stateMediator, null), 2);
            return new myj0(zy11.a);
        }
        String str3 = "Unsupported state of set_elements_state directive state=" + this.$directive.state;
        z83.i();
        return new iyj0(new BotRequest.Error(null, null, new BotRequest.Error.ClientError(str3), 3, null));
    }
}
