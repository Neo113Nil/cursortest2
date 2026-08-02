package com.vk.voip.utils.timer;

import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.zrp;

/* compiled from: CountDownTimer.kt */
/* loaded from: classes7.dex */
public final class CountDownTimer {
    public static final long d = TimeUnit.SECONDS.toMillis(1);
    public long a;
    public android.os.CountDownTimer b;
    public LinkedHashSet c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CountDownTimer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State FINISHED;
        public static final State TICKING;

        static {
            State state = new State("FINISHED", 0);
            FINISHED = state;
            State state2 = new State("TICKING", 1);
            TICKING = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: CountDownTimer.kt */
    public interface a {
        void n0();

        void s0(long j);

        void u0();
    }
}
