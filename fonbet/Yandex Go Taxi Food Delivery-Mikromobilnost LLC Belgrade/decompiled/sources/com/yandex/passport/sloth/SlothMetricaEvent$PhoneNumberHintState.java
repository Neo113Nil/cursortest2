package com.yandex.passport.sloth;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/passport/sloth/SlothMetricaEvent$PhoneNumberHintState", "", "Lcom/yandex/passport/sloth/SlothMetricaEvent$PhoneNumberHintState;", "", "stateValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "STARTED", "SUCCESS", "FAILED", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothMetricaEvent$PhoneNumberHintState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothMetricaEvent$PhoneNumberHintState[] $VALUES;
    public static final SlothMetricaEvent$PhoneNumberHintState FAILED;
    public static final SlothMetricaEvent$PhoneNumberHintState STARTED;
    public static final SlothMetricaEvent$PhoneNumberHintState SUCCESS;
    private final String stateValue;

    static {
        SlothMetricaEvent$PhoneNumberHintState slothMetricaEvent$PhoneNumberHintState = new SlothMetricaEvent$PhoneNumberHintState("STARTED", 0, "started");
        STARTED = slothMetricaEvent$PhoneNumberHintState;
        SlothMetricaEvent$PhoneNumberHintState slothMetricaEvent$PhoneNumberHintState2 = new SlothMetricaEvent$PhoneNumberHintState("SUCCESS", 1, "success");
        SUCCESS = slothMetricaEvent$PhoneNumberHintState2;
        SlothMetricaEvent$PhoneNumberHintState slothMetricaEvent$PhoneNumberHintState3 = new SlothMetricaEvent$PhoneNumberHintState("FAILED", 2, "failed");
        FAILED = slothMetricaEvent$PhoneNumberHintState3;
        SlothMetricaEvent$PhoneNumberHintState[] slothMetricaEvent$PhoneNumberHintStateArr = {slothMetricaEvent$PhoneNumberHintState, slothMetricaEvent$PhoneNumberHintState2, slothMetricaEvent$PhoneNumberHintState3};
        $VALUES = slothMetricaEvent$PhoneNumberHintStateArr;
        $ENTRIES = kotlin.enums.a.a(slothMetricaEvent$PhoneNumberHintStateArr);
    }

    public SlothMetricaEvent$PhoneNumberHintState(String str, int i, String str2) {
        this.stateValue = str2;
    }

    public static SlothMetricaEvent$PhoneNumberHintState valueOf(String str) {
        return (SlothMetricaEvent$PhoneNumberHintState) Enum.valueOf(SlothMetricaEvent$PhoneNumberHintState.class, str);
    }

    public static SlothMetricaEvent$PhoneNumberHintState[] values() {
        return (SlothMetricaEvent$PhoneNumberHintState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getStateValue() {
        return this.stateValue;
    }
}
