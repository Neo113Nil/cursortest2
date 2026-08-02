package com.yandex.go.mainscreen.superapp.popup.data.experiments;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d {
    public final t1b0 a;

    public d(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(SuperAppFallbackBehaviourExperiment.k);
    }

    public static SuperAppFallbackBehaviourExperiment.ElementBehaviour a(List list, SuperAppFallbackBehaviourExperiment.State state) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).a.contains(state)) {
                break;
            }
        }
        SuperAppFallbackBehaviourExperiment.ElementBehaviour elementBehaviour = (SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj;
        return elementBehaviour == null ? new SuperAppFallbackBehaviourExperiment.ElementBehaviour(0) : elementBehaviour;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$isEnabled$1 superAppFallbackBehaviourExperimentProvider$isEnabled$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$isEnabled$1) {
            superAppFallbackBehaviourExperimentProvider$isEnabled$1 = (SuperAppFallbackBehaviourExperimentProvider$isEnabled$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$isEnabled$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((SuperAppFallbackBehaviourExperiment) obj).h());
            }
        }
        superAppFallbackBehaviourExperimentProvider$isEnabled$1 = new SuperAppFallbackBehaviourExperimentProvider$isEnabled$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SuperAppFallbackBehaviourExperiment) obj2).h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (((com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment.ElementBehaviour) r8).c != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$isValid$1 superAppFallbackBehaviourExperimentProvider$isValid$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$isValid$1) {
            superAppFallbackBehaviourExperimentProvider$isValid$1 = (SuperAppFallbackBehaviourExperimentProvider$isValid$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$isValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$isValid$1.label = i2 - Integer.MIN_VALUE;
                obj = superAppFallbackBehaviourExperimentProvider$isValid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$isValid$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$isValid$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$isValid$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        if (((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c) {
                            SuperAppFallbackBehaviourExperiment.State state = SuperAppFallbackBehaviourExperiment.State.FAILURE_WITH_TAXI;
                            superAppFallbackBehaviourExperimentProvider$isValid$1.label = 3;
                            obj = e(state, superAppFallbackBehaviourExperimentProvider$isValid$1);
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        if (((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c) {
                            SuperAppFallbackBehaviourExperiment.State state2 = SuperAppFallbackBehaviourExperiment.State.RETRY_WITH_TAXI;
                            superAppFallbackBehaviourExperimentProvider$isValid$1.label = 4;
                            obj = e(state2, superAppFallbackBehaviourExperimentProvider$isValid$1);
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((SuperAppFallbackBehaviourExperiment) obj).h()) {
                    SuperAppFallbackBehaviourExperiment.State state3 = SuperAppFallbackBehaviourExperiment.State.LOADING_WITH_TAXI;
                    superAppFallbackBehaviourExperimentProvider$isValid$1.label = 2;
                    obj = e(state3, superAppFallbackBehaviourExperimentProvider$isValid$1);
                }
                return Boolean.valueOf(z);
            }
        }
        superAppFallbackBehaviourExperimentProvider$isValid$1 = new SuperAppFallbackBehaviourExperimentProvider$isValid$1(this, continuationImpl);
        obj = superAppFallbackBehaviourExperimentProvider$isValid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$isValid$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((SuperAppFallbackBehaviourExperiment) obj).h()) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$l10n$1 superAppFallbackBehaviourExperimentProvider$l10n$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$l10n$1) {
            superAppFallbackBehaviourExperimentProvider$l10n$1 = (SuperAppFallbackBehaviourExperimentProvider$l10n$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$l10n$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$l10n$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$l10n$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$l10n$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$l10n$1.L$0 = str;
                    superAppFallbackBehaviourExperimentProvider$l10n$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$l10n$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) superAppFallbackBehaviourExperimentProvider$l10n$1.L$0;
                    kotlin.b.b(obj);
                }
                return ((SuperAppFallbackBehaviourExperiment) obj).i.get(str);
            }
        }
        superAppFallbackBehaviourExperimentProvider$l10n$1 = new SuperAppFallbackBehaviourExperimentProvider$l10n$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$l10n$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$l10n$1.label;
        if (i != 0) {
        }
        return ((SuperAppFallbackBehaviourExperiment) obj2).i.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(SuperAppFallbackBehaviourExperiment.State state, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$orderTaxiButton$1 superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$orderTaxiButton$1) {
            superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1 = (SuperAppFallbackBehaviourExperimentProvider$orderTaxiButton$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.L$0 = state;
                    superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.L$1 = this;
                    superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.L$1;
                    state = (SuperAppFallbackBehaviourExperiment.State) superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = ((SuperAppFallbackBehaviourExperiment) obj).g;
                this.getClass();
                return a(list, state);
            }
        }
        superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1 = new SuperAppFallbackBehaviourExperimentProvider$orderTaxiButton$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$orderTaxiButton$1.label;
        if (i != 0) {
        }
        List list2 = ((SuperAppFallbackBehaviourExperiment) obj2).g;
        this.getClass();
        return a(list2, state);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(SuperAppFallbackBehaviourExperiment.State state, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1 superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1) {
            superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1 = (SuperAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.L$0 = state;
                    superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.L$1 = this;
                    superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.L$1;
                    state = (SuperAppFallbackBehaviourExperiment.State) superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = ((SuperAppFallbackBehaviourExperiment) obj).h;
                this.getClass();
                return a(list, state);
            }
        }
        superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1 = new SuperAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$orderTaxiByPhoneCallButton$1.label;
        if (i != 0) {
        }
        List list2 = ((SuperAppFallbackBehaviourExperiment) obj2).h;
        this.getClass();
        return a(list2, state);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(SuperAppFallbackBehaviourExperiment.State state, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$reloadButton$1 superAppFallbackBehaviourExperimentProvider$reloadButton$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$reloadButton$1) {
            superAppFallbackBehaviourExperimentProvider$reloadButton$1 = (SuperAppFallbackBehaviourExperimentProvider$reloadButton$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$reloadButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$reloadButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$reloadButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$reloadButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$reloadButton$1.L$0 = state;
                    superAppFallbackBehaviourExperimentProvider$reloadButton$1.L$1 = this;
                    superAppFallbackBehaviourExperimentProvider$reloadButton$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$reloadButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) superAppFallbackBehaviourExperimentProvider$reloadButton$1.L$1;
                    state = (SuperAppFallbackBehaviourExperiment.State) superAppFallbackBehaviourExperimentProvider$reloadButton$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = ((SuperAppFallbackBehaviourExperiment) obj).f;
                this.getClass();
                return a(list, state);
            }
        }
        superAppFallbackBehaviourExperimentProvider$reloadButton$1 = new SuperAppFallbackBehaviourExperimentProvider$reloadButton$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$reloadButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$reloadButton$1.label;
        if (i != 0) {
        }
        List list2 = ((SuperAppFallbackBehaviourExperiment) obj2).f;
        this.getClass();
        return a(list2, state);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(SuperAppFallbackBehaviourExperiment.State state, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$subtitle$1 superAppFallbackBehaviourExperimentProvider$subtitle$1;
        int i;
        SuperAppFallbackBehaviourExperiment.ElementBehaviour a;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$subtitle$1) {
            superAppFallbackBehaviourExperimentProvider$subtitle$1 = (SuperAppFallbackBehaviourExperimentProvider$subtitle$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$subtitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$subtitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$subtitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$subtitle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$subtitle$1.L$0 = state;
                    superAppFallbackBehaviourExperimentProvider$subtitle$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$subtitle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state = (SuperAppFallbackBehaviourExperiment.State) superAppFallbackBehaviourExperimentProvider$subtitle$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperAppFallbackBehaviourExperiment superAppFallbackBehaviourExperiment = (SuperAppFallbackBehaviourExperiment) obj;
                a = a(superAppFallbackBehaviourExperiment.e, state);
                String str = a.b;
                if (a.c || evu0.J(str)) {
                    return null;
                }
                return (String) superAppFallbackBehaviourExperiment.i.get(str);
            }
        }
        superAppFallbackBehaviourExperimentProvider$subtitle$1 = new SuperAppFallbackBehaviourExperimentProvider$subtitle$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$subtitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$subtitle$1.label;
        if (i != 0) {
        }
        SuperAppFallbackBehaviourExperiment superAppFallbackBehaviourExperiment2 = (SuperAppFallbackBehaviourExperiment) obj2;
        a = a(superAppFallbackBehaviourExperiment2.e, state);
        String str2 = a.b;
        if (a.c) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(SuperAppFallbackBehaviourExperiment.State state, ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$title$1 superAppFallbackBehaviourExperimentProvider$title$1;
        int i;
        SuperAppFallbackBehaviourExperiment.ElementBehaviour a;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$title$1) {
            superAppFallbackBehaviourExperimentProvider$title$1 = (SuperAppFallbackBehaviourExperimentProvider$title$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$title$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$title$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$title$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$title$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$title$1.L$0 = state;
                    superAppFallbackBehaviourExperimentProvider$title$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$title$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state = (SuperAppFallbackBehaviourExperiment.State) superAppFallbackBehaviourExperimentProvider$title$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperAppFallbackBehaviourExperiment superAppFallbackBehaviourExperiment = (SuperAppFallbackBehaviourExperiment) obj;
                a = a(superAppFallbackBehaviourExperiment.d, state);
                String str = a.b;
                if (a.c || evu0.J(str)) {
                    return null;
                }
                return (String) superAppFallbackBehaviourExperiment.i.get(str);
            }
        }
        superAppFallbackBehaviourExperimentProvider$title$1 = new SuperAppFallbackBehaviourExperimentProvider$title$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$title$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$title$1.label;
        if (i != 0) {
        }
        SuperAppFallbackBehaviourExperiment superAppFallbackBehaviourExperiment2 = (SuperAppFallbackBehaviourExperiment) obj2;
        a = a(superAppFallbackBehaviourExperiment2.d, state);
        String str2 = a.b;
        if (a.c) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        SuperAppFallbackBehaviourExperimentProvider$visibleStates$1 superAppFallbackBehaviourExperimentProvider$visibleStates$1;
        int i;
        if (continuationImpl instanceof SuperAppFallbackBehaviourExperimentProvider$visibleStates$1) {
            superAppFallbackBehaviourExperimentProvider$visibleStates$1 = (SuperAppFallbackBehaviourExperimentProvider$visibleStates$1) continuationImpl;
            int i2 = superAppFallbackBehaviourExperimentProvider$visibleStates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppFallbackBehaviourExperimentProvider$visibleStates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppFallbackBehaviourExperimentProvider$visibleStates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppFallbackBehaviourExperimentProvider$visibleStates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppFallbackBehaviourExperimentProvider$visibleStates$1.label = 1;
                    obj = this.a.b(superAppFallbackBehaviourExperimentProvider$visibleStates$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return kotlin.collections.a.M(((SuperAppFallbackBehaviourExperiment) obj).c);
            }
        }
        superAppFallbackBehaviourExperimentProvider$visibleStates$1 = new SuperAppFallbackBehaviourExperimentProvider$visibleStates$1(this, continuationImpl);
        Object obj2 = superAppFallbackBehaviourExperimentProvider$visibleStates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppFallbackBehaviourExperimentProvider$visibleStates$1.label;
        if (i != 0) {
        }
        return kotlin.collections.a.M(((SuperAppFallbackBehaviourExperiment) obj2).c);
    }
}
