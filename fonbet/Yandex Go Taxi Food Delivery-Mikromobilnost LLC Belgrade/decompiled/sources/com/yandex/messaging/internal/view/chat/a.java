package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.OpenUriDirective;
import com.yandex.messaging.core.net.entities.directives.SendMessageDirective;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.core.net.entities.directives.SetElementsStateDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.bvf0;
import defpackage.g6u;
import defpackage.iyj0;
import defpackage.k0b;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.otq0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tu10;
import defpackage.uqn;
import defpackage.uyj;
import defpackage.x870;
import defpackage.xoq0;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes15.dex */
public final class a {
    public final xoq0 a;
    public final x870 b;
    public final otq0 c;
    public final ChatRequest d;
    public final k0b e;

    public a(xoq0 xoq0Var, x870 x870Var, otq0 otq0Var, ChatRequest chatRequest, k0b k0bVar) {
        this.a = xoq0Var;
        this.b = x870Var;
        this.c = otq0Var;
        this.d = chatRequest;
        this.e = k0bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (defpackage.tje.k0(r1, r4, r2) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (defpackage.tje.k0(r1, r4, r2) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (r14 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Directive directive, String str, tu10 tu10Var, uqn uqnVar, ContinuationImpl continuationImpl) {
        AiBotDirectiveExecutor$execute$3 aiBotDirectiveExecutor$execute$3;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof AiBotDirectiveExecutor$execute$3) {
            aiBotDirectiveExecutor$execute$3 = (AiBotDirectiveExecutor$execute$3) continuationImpl;
            int i2 = aiBotDirectiveExecutor$execute$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiBotDirectiveExecutor$execute$3.label = i2 - Integer.MIN_VALUE;
                Object obj = aiBotDirectiveExecutor$execute$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiBotDirectiveExecutor$execute$3.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                } else {
                    kotlin.b.b(obj);
                    if (directive instanceof OpenUriDirective) {
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        AiBotDirectiveExecutor$execute$4 aiBotDirectiveExecutor$execute$4 = new AiBotDirectiveExecutor$execute$4(aVar, directive, null);
                        aiBotDirectiveExecutor$execute$3.label = 1;
                    } else {
                        if (!(directive instanceof SendMessageDirective)) {
                            if (directive instanceof SetElementsStateDirective) {
                                sjh sjhVar2 = uyj.a;
                                g6u g6uVar2 = o400.a;
                                AiBotDirectiveExecutor$execute$6 aiBotDirectiveExecutor$execute$6 = new AiBotDirectiveExecutor$execute$6(directive, uqnVar, null);
                                aiBotDirectiveExecutor$execute$3.label = 3;
                                Object k0 = tje.k0(g6uVar2, aiBotDirectiveExecutor$execute$6, aiBotDirectiveExecutor$execute$3);
                                if (k0 != coroutineSingletons) {
                                    return k0;
                                }
                            } else {
                                if (!(directive instanceof ServerDirective)) {
                                    return new iyj0(new BotRequest.Error(new BotRequest.Error.UnsupportedDirective(directive.a), null, null, 6, null));
                                }
                                otq0 otq0Var = aVar.c;
                                aiBotDirectiveExecutor$execute$3.label = 4;
                                otq0Var.getClass();
                                Object n = bvf0.n(new ServerDirectiveHandler$handle$2(otq0Var, tu10Var, str, (ServerDirective) directive, null, null), aiBotDirectiveExecutor$execute$3);
                                if (n != coroutineSingletons) {
                                    n = zy11Var;
                                }
                            }
                            return coroutineSingletons;
                        }
                        sjh sjhVar3 = uyj.a;
                        g6u g6uVar3 = o400.a;
                        AiBotDirectiveExecutor$execute$5 aiBotDirectiveExecutor$execute$5 = new AiBotDirectiveExecutor$execute$5(aVar, directive, null);
                        aiBotDirectiveExecutor$execute$3.label = 2;
                    }
                }
                return new myj0(zy11Var);
            }
        }
        aiBotDirectiveExecutor$execute$3 = new AiBotDirectiveExecutor$execute$3(aVar, continuationImpl);
        Object obj2 = aiBotDirectiveExecutor$execute$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiBotDirectiveExecutor$execute$3.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        return new myj0(zy11Var2);
    }

    public final Object b(Collection collection, List list, String str, tu10 tu10Var, uqn uqnVar, SuspendLambda suspendLambda) {
        return bvf0.n(new AiBotDirectiveExecutor$execute$2(collection, list, this, str, tu10Var, uqnVar, null), suspendLambda);
    }
}
