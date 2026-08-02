package com.yandex.go.mainscreen.superapp.popup.data.state.scenario;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import defpackage.aka1;
import defpackage.avj0;
import defpackage.e3w0;
import defpackage.f3w0;
import defpackage.jb7;
import defpackage.kyh0;
import defpackage.l9p;
import defpackage.ny61;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final d a;
    public final jb7 b;
    public final b c;

    public c(d dVar, jb7 jb7Var, b bVar) {
        this.a = dVar;
        this.b = jb7Var;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        if (r4 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l9p l9pVar, ContinuationImpl continuationImpl) {
        FallbackAssistantScenarioMediatorMapper$getStateByScenario$1 fallbackAssistantScenarioMediatorMapper$getStateByScenario$1;
        int i;
        l9p l9pVar2;
        Object b;
        l9p l9pVar3;
        if (continuationImpl instanceof FallbackAssistantScenarioMediatorMapper$getStateByScenario$1) {
            fallbackAssistantScenarioMediatorMapper$getStateByScenario$1 = (FallbackAssistantScenarioMediatorMapper$getStateByScenario$1) continuationImpl;
            int i2 = fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label;
                d dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l9pVar2 = l9pVar;
                    fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.L$0 = l9pVar2;
                    fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label = 1;
                    b = dVar.b(fallbackAssistantScenarioMediatorMapper$getStateByScenario$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        l9pVar3 = (l9p) fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.L$0 = null;
                            fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label = 3;
                            Object a = this.c.a(l9pVar3, fallbackAssistantScenarioMediatorMapper$getStateByScenario$1);
                            return a == coroutineSingletons ? coroutineSingletons : a;
                        }
                        l9pVar2 = l9pVar3;
                        jb7 jb7Var = this.b;
                        avj0 avj0Var = (avj0) ((zuj0) jb7Var.b);
                        return new f3w0(avj0Var.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_title_without_products_cache : kyh0.super_app_fallback_assistant_title_with_products_cache), avj0Var.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_subtitle_without_products_cache : kyh0.super_app_fallback_assistant_subtitle_with_products_cache), new e3w0((String) jb7Var.c, true), l9pVar2.isLoading(), new e3w0((String) jb7Var.w, l9pVar2.a()), e3w0.c, aka1.h(l9pVar2));
                    }
                    l9p l9pVar4 = (l9p) fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    l9pVar2 = l9pVar4;
                }
                if (((Boolean) b).booleanValue()) {
                    fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.L$0 = l9pVar2;
                    fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label = 2;
                    Object c = dVar.c(fallbackAssistantScenarioMediatorMapper$getStateByScenario$1);
                    if (c != coroutineSingletons) {
                        l9pVar3 = l9pVar2;
                        obj = c;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                jb7 jb7Var2 = this.b;
                avj0 avj0Var2 = (avj0) ((zuj0) jb7Var2.b);
                return new f3w0(avj0Var2.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_title_without_products_cache : kyh0.super_app_fallback_assistant_title_with_products_cache), avj0Var2.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_subtitle_without_products_cache : kyh0.super_app_fallback_assistant_subtitle_with_products_cache), new e3w0((String) jb7Var2.c, true), l9pVar2.isLoading(), new e3w0((String) jb7Var2.w, l9pVar2.a()), e3w0.c, aka1.h(l9pVar2));
            }
        }
        fallbackAssistantScenarioMediatorMapper$getStateByScenario$1 = new FallbackAssistantScenarioMediatorMapper$getStateByScenario$1(this, continuationImpl);
        Object obj2 = fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackAssistantScenarioMediatorMapper$getStateByScenario$1.label;
        d dVar2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) b).booleanValue()) {
        }
        jb7 jb7Var22 = this.b;
        avj0 avj0Var22 = (avj0) ((zuj0) jb7Var22.b);
        return new f3w0(avj0Var22.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_title_without_products_cache : kyh0.super_app_fallback_assistant_title_with_products_cache), avj0Var22.h(l9pVar2.a() ? kyh0.super_app_fallback_assistant_subtitle_without_products_cache : kyh0.super_app_fallback_assistant_subtitle_with_products_cache), new e3w0((String) jb7Var22.c, true), l9pVar2.isLoading(), new e3w0((String) jb7Var22.w, l9pVar2.a()), e3w0.c, aka1.h(l9pVar2));
    }
}
