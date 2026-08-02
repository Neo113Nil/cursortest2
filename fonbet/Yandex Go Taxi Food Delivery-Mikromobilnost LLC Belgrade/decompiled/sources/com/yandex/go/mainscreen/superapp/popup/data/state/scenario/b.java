package com.yandex.go.mainscreen.superapp.popup.data.state.scenario;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import defpackage.e3w0;
import defpackage.evu0;
import defpackage.fk7;
import defpackage.i9p;
import defpackage.j9p;
import defpackage.k9p;
import defpackage.kg7;
import defpackage.l9p;
import defpackage.ny61;
import defpackage.w511;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final d a;
    public final fk7 b;

    public b(d dVar, fk7 fk7Var) {
        this.a = dVar;
        this.b = fk7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01dc, code lost:
    
        if (r2 != r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r9 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
    
        if (r5 != r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0172, code lost:
    
        if (r9 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l9p l9pVar, ContinuationImpl continuationImpl) {
        FallbackAssistantScenarioExperimentMapper$getStateByScenario$1 fallbackAssistantScenarioExperimentMapper$getStateByScenario$1;
        int i;
        boolean z;
        FallbackAssistantScenarioExperimentMapper$BaseState fallbackAssistantScenarioExperimentMapper$BaseState;
        SuperAppFallbackBehaviourExperiment.State a;
        Object j;
        boolean z2;
        SuperAppFallbackBehaviourExperiment.State state;
        l9p l9pVar2;
        String str;
        String str2;
        Object g;
        l9p l9pVar3;
        SuperAppFallbackBehaviourExperiment.State state2;
        String str3;
        b bVar;
        Object b;
        String str4;
        l9p l9pVar4;
        Object e;
        e3w0 e3w0Var;
        SuperAppFallbackBehaviourExperiment.State state3;
        l9p l9pVar5;
        String str5;
        boolean z3;
        String str6;
        b bVar2;
        e3w0 e3w0Var2;
        String str7;
        String str8;
        SuperAppFallbackBehaviourExperiment.State state4;
        l9p l9pVar6;
        e3w0 e3w0Var3;
        Object f;
        l9p l9pVar7;
        Object b2;
        boolean z4;
        e3w0 e3w0Var4;
        e3w0 e3w0Var5;
        String str9;
        String str10;
        l9p l9pVar8;
        b bVar3 = this;
        l9p l9pVar9 = l9pVar;
        if (continuationImpl instanceof FallbackAssistantScenarioExperimentMapper$getStateByScenario$1) {
            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1 = (FallbackAssistantScenarioExperimentMapper$getStateByScenario$1) continuationImpl;
            int i2 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label;
                d dVar = bVar3.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        boolean z5 = l9pVar9 instanceof j9p;
                        boolean z6 = false;
                        fk7 fk7Var = bVar3.b;
                        if (z5) {
                            if (!((j9p) l9pVar9).b()) {
                                String b3 = ((kg7) fk7Var.a).b();
                                if (b3 != null && !evu0.J(b3)) {
                                    z2 = false;
                                    break;
                                } else {
                                    z2 = true;
                                    break;
                                }
                            }
                            fallbackAssistantScenarioExperimentMapper$BaseState = FallbackAssistantScenarioExperimentMapper$BaseState.NO_NETWORK_CONNECTION;
                            if (!z6) {
                                fallbackAssistantScenarioExperimentMapper$BaseState = null;
                            }
                            if (fallbackAssistantScenarioExperimentMapper$BaseState == null) {
                                if (!z5) {
                                    if (!(l9pVar9 instanceof i9p)) {
                                        if (!(l9pVar9 instanceof k9p)) {
                                            w511.b();
                                            break;
                                        } else {
                                            fallbackAssistantScenarioExperimentMapper$BaseState = FallbackAssistantScenarioExperimentMapper$BaseState.RETRY;
                                        }
                                    } else {
                                        fallbackAssistantScenarioExperimentMapper$BaseState = FallbackAssistantScenarioExperimentMapper$BaseState.FAILURE;
                                    }
                                } else {
                                    fallbackAssistantScenarioExperimentMapper$BaseState = FallbackAssistantScenarioExperimentMapper$BaseState.LOADING;
                                }
                            }
                            a = fallbackAssistantScenarioExperimentMapper$BaseState.a(l9pVar9.a());
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar9;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = a;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 1;
                            j = dVar.j(fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                            break;
                        } else {
                            if (!(l9pVar9 instanceof i9p)) {
                                if (!(l9pVar9 instanceof k9p)) {
                                    w511.b();
                                    break;
                                }
                            } else if (((i9p) l9pVar9).b()) {
                                String b4 = ((kg7) fk7Var.a).b();
                                if (b4 != null && !evu0.J(b4)) {
                                    z = false;
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            fallbackAssistantScenarioExperimentMapper$BaseState = FallbackAssistantScenarioExperimentMapper$BaseState.NO_NETWORK_CONNECTION;
                            if (!z6) {
                            }
                            if (fallbackAssistantScenarioExperimentMapper$BaseState == null) {
                            }
                            a = fallbackAssistantScenarioExperimentMapper$BaseState.a(l9pVar9.a());
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar9;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = a;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 1;
                            j = dVar.j(fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        }
                        break;
                    case 1:
                        SuperAppFallbackBehaviourExperiment.State state5 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9p l9pVar10 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        a = state5;
                        l9pVar9 = l9pVar10;
                        j = obj;
                        if (!((List) j).contains(a)) {
                            break;
                        } else {
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar9;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = a;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 2;
                            Object i3 = dVar.i(a, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                            if (i3 != coroutineSingletons) {
                                state = a;
                                obj = i3;
                                l9pVar2 = l9pVar9;
                                str = (String) obj;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar2;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 3;
                                obj = dVar.h(state, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        SuperAppFallbackBehaviourExperiment.State state6 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9p l9pVar11 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        l9pVar2 = l9pVar11;
                        state = state6;
                        str = (String) obj;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 3;
                        obj = dVar.h(state, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        break;
                    case 3:
                        str = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        state = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9pVar2 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        str2 = (String) obj;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = bVar3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 4;
                        g = dVar.g(state, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (g != coroutineSingletons) {
                            l9pVar3 = l9pVar2;
                            state2 = state;
                            str3 = str;
                            bVar = bVar3;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar3;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state2;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str3;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str2;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = null;
                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 5;
                            b = bVar.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) g, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                            if (b != coroutineSingletons) {
                                String str11 = str2;
                                obj = b;
                                str4 = str11;
                                l9pVar4 = l9pVar3;
                                e3w0 e3w0Var6 = (e3w0) obj;
                                boolean isLoading = l9pVar4.isLoading();
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar4;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state2;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str3;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str4;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var6;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = bVar3;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = isLoading;
                                fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 6;
                                e = dVar.e(state2, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                                if (e != coroutineSingletons) {
                                    SuperAppFallbackBehaviourExperiment.State state7 = state2;
                                    e3w0Var = e3w0Var6;
                                    obj = e;
                                    state3 = state7;
                                    l9pVar5 = l9pVar4;
                                    str5 = str4;
                                    z3 = isLoading;
                                    str6 = str3;
                                    bVar2 = bVar3;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar5;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state3;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str6;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str5;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = null;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                                    fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 7;
                                    obj = bVar2.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                                    if (obj != coroutineSingletons) {
                                        e3w0Var2 = e3w0Var;
                                        str7 = str5;
                                        str8 = str6;
                                        state4 = state3;
                                        l9pVar6 = l9pVar5;
                                        e3w0Var3 = (e3w0) obj;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar6;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = null;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str8;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str7;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var2;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = e3w0Var3;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$6 = bVar3;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 8;
                                        f = dVar.f(state4, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                                        if (f != coroutineSingletons) {
                                            l9pVar7 = l9pVar6;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar7;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = null;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str8;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str7;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var2;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = e3w0Var3;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$6 = null;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                                            fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 9;
                                            b2 = bVar3.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) f, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                                            if (b2 != coroutineSingletons) {
                                                z4 = z3;
                                                e3w0Var4 = e3w0Var3;
                                                e3w0Var5 = e3w0Var2;
                                                str9 = str7;
                                                str10 = str8;
                                                l9pVar8 = l9pVar7;
                                                obj = b2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        bVar = (b) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4;
                        String str12 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        String str13 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        SuperAppFallbackBehaviourExperiment.State state8 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9pVar3 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        g = obj;
                        str2 = str12;
                        str3 = str13;
                        state2 = state8;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = null;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 5;
                        b = bVar.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) g, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (b != coroutineSingletons) {
                        }
                        break;
                    case 5:
                        str4 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        str3 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        state2 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9pVar4 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        e3w0 e3w0Var62 = (e3w0) obj;
                        boolean isLoading2 = l9pVar4.isLoading();
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar4;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str4;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var62;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = bVar3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = isLoading2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 6;
                        e = dVar.e(state2, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (e != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        z3 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0;
                        bVar2 = (b) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5;
                        e3w0Var = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4;
                        str5 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        str6 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        state3 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9pVar5 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar5;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = state3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str6;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str5;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = null;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 7;
                        obj = bVar2.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (obj != coroutineSingletons) {
                        }
                        break;
                    case 7:
                        z3 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0;
                        e3w0Var2 = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4;
                        str7 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        str8 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        state4 = (SuperAppFallbackBehaviourExperiment.State) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1;
                        l9pVar6 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        e3w0Var3 = (e3w0) obj;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar6;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = null;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str8;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str7;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = e3w0Var3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$6 = bVar3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 8;
                        f = dVar.f(state4, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (f != coroutineSingletons) {
                        }
                        break;
                    case 8:
                        boolean z7 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0;
                        b bVar4 = (b) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$6;
                        e3w0 e3w0Var7 = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5;
                        e3w0 e3w0Var8 = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4;
                        str7 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        str8 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        l9pVar7 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        z3 = z7;
                        bVar3 = bVar4;
                        f = obj;
                        e3w0Var3 = e3w0Var7;
                        e3w0Var2 = e3w0Var8;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0 = l9pVar7;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$1 = null;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2 = str8;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3 = str7;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4 = e3w0Var2;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5 = e3w0Var3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$6 = null;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0 = z3;
                        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label = 9;
                        b2 = bVar3.b((SuperAppFallbackBehaviourExperiment.ElementBehaviour) f, fallbackAssistantScenarioExperimentMapper$getStateByScenario$1);
                        if (b2 != coroutineSingletons) {
                        }
                        break;
                    case 9:
                        boolean z8 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.Z$0;
                        e3w0 e3w0Var9 = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$5;
                        e3w0 e3w0Var10 = (e3w0) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$4;
                        String str14 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$3;
                        String str15 = (String) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$2;
                        l9pVar8 = (l9p) fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.L$0;
                        kotlin.b.b(obj);
                        z4 = z8;
                        e3w0Var4 = e3w0Var9;
                        e3w0Var5 = e3w0Var10;
                        str9 = str14;
                        str10 = str15;
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        fallbackAssistantScenarioExperimentMapper$getStateByScenario$1 = new FallbackAssistantScenarioExperimentMapper$getStateByScenario$1(bVar3, continuationImpl);
        Object obj2 = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackAssistantScenarioExperimentMapper$getStateByScenario$1.label;
        d dVar2 = bVar3.a;
        switch (i) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SuperAppFallbackBehaviourExperiment.ElementBehaviour elementBehaviour, ContinuationImpl continuationImpl) {
        FallbackAssistantScenarioExperimentMapper$toState$1 fallbackAssistantScenarioExperimentMapper$toState$1;
        int i;
        if (continuationImpl instanceof FallbackAssistantScenarioExperimentMapper$toState$1) {
            fallbackAssistantScenarioExperimentMapper$toState$1 = (FallbackAssistantScenarioExperimentMapper$toState$1) continuationImpl;
            int i2 = fallbackAssistantScenarioExperimentMapper$toState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackAssistantScenarioExperimentMapper$toState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackAssistantScenarioExperimentMapper$toState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackAssistantScenarioExperimentMapper$toState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = elementBehaviour.b;
                    fallbackAssistantScenarioExperimentMapper$toState$1.L$0 = elementBehaviour;
                    fallbackAssistantScenarioExperimentMapper$toState$1.label = 1;
                    obj = this.a.d(str, fallbackAssistantScenarioExperimentMapper$toState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    elementBehaviour = (SuperAppFallbackBehaviourExperiment.ElementBehaviour) fallbackAssistantScenarioExperimentMapper$toState$1.L$0;
                    kotlin.b.b(obj);
                }
                String str2 = (String) obj;
                return new e3w0(str2, (elementBehaviour.c || str2 == null || evu0.J(str2)) ? false : true);
            }
        }
        fallbackAssistantScenarioExperimentMapper$toState$1 = new FallbackAssistantScenarioExperimentMapper$toState$1(this, continuationImpl);
        Object obj2 = fallbackAssistantScenarioExperimentMapper$toState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackAssistantScenarioExperimentMapper$toState$1.label;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        return new e3w0(str22, (elementBehaviour.c || str22 == null || evu0.J(str22)) ? false : true);
    }
}
