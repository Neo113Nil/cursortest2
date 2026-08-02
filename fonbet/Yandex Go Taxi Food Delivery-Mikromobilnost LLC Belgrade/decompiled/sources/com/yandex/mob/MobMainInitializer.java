package com.yandex.mob;

import defpackage.dp20;
import defpackage.gwk0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.xo20;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class MobMainInitializer {
    public oo20 d;
    public final AtomicReference a = new AtomicReference(gwk0.b());
    public final AtomicReference b = new AtomicReference(State.NOT_INITIALIZED);
    public final AtomicReference c = new AtomicReference(null);
    public final AtomicReference e = new AtomicReference(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mob/MobMainInitializer$State;", "", "NOT_INITIALIZED", "LIGHTWEIGHT_INITIALIZED", "BACKGROUND_STARTED", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BACKGROUND_STARTED;
        public static final State LIGHTWEIGHT_INITIALIZED;
        public static final State NOT_INITIALIZED;

        static {
            State state = new State("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = state;
            State state2 = new State("LIGHTWEIGHT_INITIALIZED", 1);
            LIGHTWEIGHT_INITIALIZED = state2;
            State state3 = new State("BACKGROUND_STARTED", 2);
            BACKGROUND_STARTED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r7 != r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r7 == r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(MobMainInitializer mobMainInitializer, oo20 oo20Var, ContinuationImpl continuationImpl) {
        MobMainInitializer$requestAndSaveMetricaData$1 mobMainInitializer$requestAndSaveMetricaData$1;
        int i;
        Object obj;
        Object obj2;
        dp20 dp20Var;
        mobMainInitializer.getClass();
        if (continuationImpl instanceof MobMainInitializer$requestAndSaveMetricaData$1) {
            mobMainInitializer$requestAndSaveMetricaData$1 = (MobMainInitializer$requestAndSaveMetricaData$1) continuationImpl;
            int i2 = mobMainInitializer$requestAndSaveMetricaData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobMainInitializer$requestAndSaveMetricaData$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mobMainInitializer$requestAndSaveMetricaData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobMainInitializer$requestAndSaveMetricaData$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    xo20 xo20Var = (xo20) oo20Var;
                    com.yandex.mob.datastore.d a = xo20Var.a();
                    mobMainInitializer$requestAndSaveMetricaData$1.L$0 = xo20Var;
                    mobMainInitializer$requestAndSaveMetricaData$1.label = 1;
                    obj3 = a.k(mobMainInitializer$requestAndSaveMetricaData$1);
                    obj = xo20Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj3);
                            return zy11Var;
                        }
                        dp20Var = (dp20) mobMainInitializer$requestAndSaveMetricaData$1.L$1;
                        obj2 = (oo20) mobMainInitializer$requestAndSaveMetricaData$1.L$0;
                        kotlin.b.b(obj3);
                        dp20 dp20Var2 = (dp20) obj3;
                        if (!jl40.l(dp20Var, dp20Var2)) {
                            com.yandex.mob.datastore.d a2 = ((xo20) obj2).a();
                            mobMainInitializer$requestAndSaveMetricaData$1.L$0 = null;
                            mobMainInitializer$requestAndSaveMetricaData$1.L$1 = null;
                            mobMainInitializer$requestAndSaveMetricaData$1.L$2 = null;
                            mobMainInitializer$requestAndSaveMetricaData$1.label = 3;
                            if (a2.v(dp20Var2, mobMainInitializer$requestAndSaveMetricaData$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    Object obj4 = (oo20) mobMainInitializer$requestAndSaveMetricaData$1.L$0;
                    kotlin.b.b(obj3);
                    obj = obj4;
                }
                obj2 = obj;
                dp20Var = (dp20) obj3;
                com.yandex.go.proxyprovision.mob.d dVar = (com.yandex.go.proxyprovision.mob.d) ((xo20) obj2).q.getValue();
                mobMainInitializer$requestAndSaveMetricaData$1.L$0 = obj2;
                mobMainInitializer$requestAndSaveMetricaData$1.L$1 = dp20Var;
                mobMainInitializer$requestAndSaveMetricaData$1.label = 2;
                obj3 = dVar.a(mobMainInitializer$requestAndSaveMetricaData$1);
            }
        }
        mobMainInitializer$requestAndSaveMetricaData$1 = new MobMainInitializer$requestAndSaveMetricaData$1(mobMainInitializer, continuationImpl);
        Object obj32 = mobMainInitializer$requestAndSaveMetricaData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobMainInitializer$requestAndSaveMetricaData$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        obj2 = obj;
        dp20Var = (dp20) obj32;
        com.yandex.go.proxyprovision.mob.d dVar2 = (com.yandex.go.proxyprovision.mob.d) ((xo20) obj2).q.getValue();
        mobMainInitializer$requestAndSaveMetricaData$1.L$0 = obj2;
        mobMainInitializer$requestAndSaveMetricaData$1.L$1 = dp20Var;
        mobMainInitializer$requestAndSaveMetricaData$1.label = 2;
        obj32 = dVar2.a(mobMainInitializer$requestAndSaveMetricaData$1);
    }
}
