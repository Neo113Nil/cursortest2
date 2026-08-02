package com.yandex.go.mainscreen.superapp.popup.data.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.tsv0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment;", "Lw96;", "Lc6z;", "Companion", "ElementBehaviour", "State", "com/yandex/go/mainscreen/superapp/popup/data/experiments/a", "$serializer", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppFallbackBehaviourExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] j;
    public static final SuperAppFallbackBehaviourExperiment k;
    public final boolean b;
    public final jsq0 c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment$State;", "", "Companion", "com/yandex/go/mainscreen/superapp/popup/data/experiments/c", "LOADING_WITH_TAXI", "FAILURE_WITH_TAXI", "RETRY_WITH_TAXI", "LOADING_NO_TAXI", "FAILURE_NO_TAXI", "RETRY_NO_TAXI", "NO_NETWORK_CONNECTION_NO_TAXI", "NO_NETWORK_CONNECTION_WITH_TAXI", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final State FAILURE_NO_TAXI;
        public static final State FAILURE_WITH_TAXI;
        public static final State LOADING_NO_TAXI;
        public static final State LOADING_WITH_TAXI;
        public static final State NO_NETWORK_CONNECTION_NO_TAXI;
        public static final State NO_NETWORK_CONNECTION_WITH_TAXI;
        public static final State RETRY_NO_TAXI;
        public static final State RETRY_WITH_TAXI;

        static {
            State state = new State("LOADING_WITH_TAXI", 0);
            LOADING_WITH_TAXI = state;
            State state2 = new State("FAILURE_WITH_TAXI", 1);
            FAILURE_WITH_TAXI = state2;
            State state3 = new State("RETRY_WITH_TAXI", 2);
            RETRY_WITH_TAXI = state3;
            State state4 = new State("LOADING_NO_TAXI", 3);
            LOADING_NO_TAXI = state4;
            State state5 = new State("FAILURE_NO_TAXI", 4);
            FAILURE_NO_TAXI = state5;
            State state6 = new State("RETRY_NO_TAXI", 5);
            RETRY_NO_TAXI = state6;
            State state7 = new State("NO_NETWORK_CONNECTION_NO_TAXI", 6);
            NO_NETWORK_CONNECTION_NO_TAXI = state7;
            State state8 = new State("NO_NETWORK_CONNECTION_WITH_TAXI", 7);
            NO_NETWORK_CONNECTION_WITH_TAXI = state8;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(23));
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new tsv0(15)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(16)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(17)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(18)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(19)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(20)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(21))};
        k = new SuperAppFallbackBehaviourExperiment(0);
    }

    public /* synthetic */ SuperAppFallbackBehaviourExperiment(int i, boolean z, jsq0 jsq0Var, List list, List list2, List list3, List list4, List list5, Map map) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = ksq0.a;
        } else {
            this.c = jsq0Var;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 16) == 0) {
            this.f = emptyList;
        } else {
            this.f = list3;
        }
        if ((i & 32) == 0) {
            this.g = emptyList;
        } else {
            this.g = list4;
        }
        if ((i & 64) == 0) {
            this.h = emptyList;
        } else {
            this.h = list5;
        }
        if ((i & 128) == 0) {
            this.i = kotlin.collections.b.f();
        } else {
            this.i = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.i;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment$ElementBehaviour;", "", "Companion", "$serializer", "com/yandex/go/mainscreen/superapp/popup/data/experiments/b", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ElementBehaviour {
        public static final b Companion = new b();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(22)), null, null};
        public final jsq0 a;
        public final String b;
        public final boolean c;

        public /* synthetic */ ElementBehaviour(int i, jsq0 jsq0Var, String str, boolean z) {
            this.a = (i & 1) == 0 ? ksq0.a : jsq0Var;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public ElementBehaviour() {
            this(0);
        }

        public ElementBehaviour(int i) {
            this.a = ksq0.a;
            this.b = "";
            this.c = false;
        }
    }

    public SuperAppFallbackBehaviourExperiment() {
        this(0);
    }

    public SuperAppFallbackBehaviourExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = jsq0Var;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        this.g = emptyList;
        this.h = emptyList;
        this.i = f;
    }
}
