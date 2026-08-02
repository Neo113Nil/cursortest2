package org.chromium.net.telemetry;

/* loaded from: classes8.dex */
public enum OptionalBoolean {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    private final int mValue;

    OptionalBoolean(int i) {
        this.mValue = i;
    }

    public static OptionalBoolean fromBoolean(Boolean bool) {
        return bool == null ? UNSET : bool.booleanValue() ? TRUE : FALSE;
    }

    public int getValue() {
        return this.mValue;
    }
}
