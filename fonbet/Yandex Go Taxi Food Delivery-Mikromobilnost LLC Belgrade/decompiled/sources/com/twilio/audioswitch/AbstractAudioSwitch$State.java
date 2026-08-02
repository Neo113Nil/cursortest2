package com.twilio.audioswitch;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/twilio/audioswitch/AbstractAudioSwitch$State", "", "Lcom/twilio/audioswitch/AbstractAudioSwitch$State;", "STARTED", "ACTIVATED", "STOPPED", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes11.dex */
public final class AbstractAudioSwitch$State {
    private static final /* synthetic */ AbstractAudioSwitch$State[] $VALUES;
    public static final AbstractAudioSwitch$State ACTIVATED;
    public static final AbstractAudioSwitch$State STARTED;
    public static final AbstractAudioSwitch$State STOPPED;

    static {
        AbstractAudioSwitch$State abstractAudioSwitch$State = new AbstractAudioSwitch$State("STARTED", 0);
        STARTED = abstractAudioSwitch$State;
        AbstractAudioSwitch$State abstractAudioSwitch$State2 = new AbstractAudioSwitch$State("ACTIVATED", 1);
        ACTIVATED = abstractAudioSwitch$State2;
        AbstractAudioSwitch$State abstractAudioSwitch$State3 = new AbstractAudioSwitch$State("STOPPED", 2);
        STOPPED = abstractAudioSwitch$State3;
        $VALUES = new AbstractAudioSwitch$State[]{abstractAudioSwitch$State, abstractAudioSwitch$State2, abstractAudioSwitch$State3};
    }

    public static AbstractAudioSwitch$State valueOf(String str) {
        return (AbstractAudioSwitch$State) Enum.valueOf(AbstractAudioSwitch$State.class, str);
    }

    public static AbstractAudioSwitch$State[] values() {
        return (AbstractAudioSwitch$State[]) $VALUES.clone();
    }
}
