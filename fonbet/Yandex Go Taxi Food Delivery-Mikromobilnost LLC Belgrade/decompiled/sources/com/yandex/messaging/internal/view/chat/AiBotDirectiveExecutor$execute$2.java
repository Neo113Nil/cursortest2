package com.yandex.messaging.internal.view.chat;

import android.os.Handler;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.b00;
import defpackage.bvf0;
import defpackage.g6u;
import defpackage.k0b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.otq0;
import defpackage.oyj0;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu10;
import defpackage.uqn;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "Lkotlin/Pair;", "Lcom/yandex/messaging/core/net/entities/directives/Directive;", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$2", f = "AiBotDirectiveExecutor.kt", l = {39, 52, 53}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotDirectiveExecutor$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ Collection<Directive> $directives;
    final /* synthetic */ tu10 $messageMetaData;
    final /* synthetic */ List<BotRequest.Error> $parsingErrors;
    final /* synthetic */ uqn $stateMediator;
    final /* synthetic */ String $triggeredElementId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$2$3", f = "AiBotDirectiveExecutor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ BotRequest.Error[] $allErrors;
        final /* synthetic */ tu10 $messageMetaData;
        final /* synthetic */ String $triggeredElementId;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, tu10 tu10Var, String str, BotRequest.Error[] errorArr, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$messageMetaData = tu10Var;
            this.$triggeredElementId = str;
            this.$allErrors = errorArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$messageMetaData, this.$triggeredElementId, this.$allErrors, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k0b k0bVar = this.this$0.e;
            tu10 tu10Var = this.$messageMetaData;
            String str = tu10Var.a;
            String str2 = this.$triggeredElementId;
            long j = tu10Var.d;
            BotRequest.Error[] errorArr = this.$allErrors;
            k0bVar.getClass();
            tje.e();
            b00 b00Var = k0bVar.a;
            ((Handler) b00Var.a.get()).post(new yz(b00Var, k0bVar.b, str, str2, j, errorArr));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDirectiveExecutor$execute$2(Collection collection, List list, a aVar, String str, tu10 tu10Var, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.$directives = collection;
        this.$parsingErrors = list;
        this.this$0 = aVar;
        this.$triggeredElementId = str;
        this.$messageMetaData = tu10Var;
        this.$stateMediator = uqnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotDirectiveExecutor$execute$2(this.$directives, this.$parsingErrors, this.this$0, this.$triggeredElementId, this.$messageMetaData, this.$stateMediator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiBotDirectiveExecutor$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.yandex.messaging.core.net.entities.directives.Directive, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:14:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a6 -> B:13:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        String str;
        uqn uqnVar;
        Ref$ObjectRef ref$ObjectRef;
        a aVar;
        tu10 tu10Var;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            ArrayList arrayList2 = new ArrayList();
            Collection<Directive> collection = this.$directives;
            a aVar2 = this.this$0;
            String str2 = this.$triggeredElementId;
            tu10 tu10Var2 = this.$messageMetaData;
            uqn uqnVar2 = this.$stateMediator;
            it = collection.iterator();
            str = str2;
            uqnVar = uqnVar2;
            ref$ObjectRef = z;
            aVar = aVar2;
            tu10Var = tu10Var2;
            arrayList = arrayList2;
            if (!it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
            } else if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = (List) this.L$0;
            kotlin.b.b(obj);
            return list;
        }
        List list2 = (List) this.L$8;
        Directive directive = (Directive) this.L$7;
        Iterator it2 = (Iterator) this.L$6;
        uqn uqnVar3 = (uqn) this.L$5;
        tu10 tu10Var3 = (tu10) this.L$4;
        String str3 = (String) this.L$3;
        a aVar3 = (a) this.L$2;
        ?? r13 = (List) this.L$1;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
        ArrayList arrayList3 = r13;
        Object a = obj;
        Directive directive2 = directive;
        list2.add(new Pair(directive2, ((oyj0) a).a()));
        tu10 tu10Var4 = tu10Var3;
        uqnVar = uqnVar3;
        tu10Var = tu10Var4;
        aVar = aVar3;
        it = it2;
        str = str3;
        arrayList = arrayList3;
        ref$ObjectRef = ref$ObjectRef3;
        i2 = 1;
        if (!it.hasNext()) {
            ?? r1 = (Directive) it.next();
            if ((r1 instanceof ServerDirective) && ref$ObjectRef.element == null) {
                ref$ObjectRef.element = r1;
                i2 = 1;
                if (!it.hasNext()) {
                }
            } else {
                this.L$0 = ref$ObjectRef;
                this.L$1 = arrayList;
                this.L$2 = aVar;
                this.L$3 = str;
                this.L$4 = tu10Var;
                this.L$5 = uqnVar;
                this.L$6 = it;
                this.L$7 = r1;
                this.L$8 = arrayList;
                this.label = i2;
                a = a.a(aVar, r1, str, tu10Var, uqnVar, this);
                if (a != coroutineSingletons) {
                    uqn uqnVar4 = uqnVar;
                    tu10Var3 = tu10Var;
                    uqnVar3 = uqnVar4;
                    ref$ObjectRef3 = ref$ObjectRef;
                    arrayList3 = arrayList;
                    str3 = str;
                    it2 = it;
                    aVar3 = aVar;
                    list2 = arrayList3;
                    directive2 = r1;
                    list2.add(new Pair(directive2, ((oyj0) a).a()));
                    tu10 tu10Var42 = tu10Var3;
                    uqnVar = uqnVar3;
                    tu10Var = tu10Var42;
                    aVar = aVar3;
                    it = it2;
                    str = str3;
                    arrayList = arrayList3;
                    ref$ObjectRef = ref$ObjectRef3;
                    i2 = 1;
                    if (!it.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            BotRequest.Error error = (BotRequest.Error) ((Pair) it3.next()).f();
                            if (error != null) {
                                arrayList4.add(error);
                            }
                        }
                        List<BotRequest.Error> list3 = this.$parsingErrors;
                        if (list3 != null) {
                            arrayList4 = kotlin.collections.a.m0(arrayList4, list3);
                        }
                        BotRequest.Error[] errorArr = (BotRequest.Error[]) arrayList4.toArray(new BotRequest.Error[0]);
                        if (errorArr.length != 0 || ref$ObjectRef.element != null) {
                            ServerDirective serverDirective = (ServerDirective) ref$ObjectRef.element;
                            if (serverDirective != null) {
                                a aVar4 = this.this$0;
                                String str4 = this.$triggeredElementId;
                                tu10 tu10Var5 = this.$messageMetaData;
                                arrayList.add(new Pair(serverDirective, null));
                                otq0 otq0Var = aVar4.c;
                                this.L$0 = arrayList;
                                this.L$1 = errorArr;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 2;
                                otq0Var.getClass();
                                Object n = bvf0.n(new ServerDirectiveHandler$handle$2(otq0Var, tu10Var5, str4, serverDirective, errorArr, null), this);
                                if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    n = zy11.a;
                                }
                                if (n != coroutineSingletons) {
                                    return arrayList;
                                }
                            } else {
                                sjh sjhVar = uyj.a;
                                g6u g6uVar = o400.a;
                                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$messageMetaData, this.$triggeredElementId, errorArr, null);
                                this.L$0 = arrayList;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 3;
                                if (tje.k0(g6uVar, anonymousClass3, this) == coroutineSingletons) {
                                }
                            }
                        }
                        return arrayList;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
