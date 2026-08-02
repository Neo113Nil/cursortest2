package com.google.firebase.heartbeatinfo;

/* loaded from: classes.dex */
public enum HeartBeatInfo$HeartBeat {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    private final int code;

    HeartBeatInfo$HeartBeat(int i) {
        this.code = i;
    }

    public final int a() {
        return this.code;
    }
}
