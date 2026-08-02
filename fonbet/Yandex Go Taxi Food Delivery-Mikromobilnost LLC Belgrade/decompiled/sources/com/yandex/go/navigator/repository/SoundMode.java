package com.yandex.go.navigator.repository;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import defpackage.q9t0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/navigator/repository/SoundMode;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "value", "F", "a", "()F", "Companion", "q9t0", "LOW", "MID", "HIGH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SoundMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SoundMode[] $VALUES;
    public static final q9t0 Companion;
    public static final SoundMode HIGH;
    public static final SoundMode LOW;
    public static final SoundMode MID;
    private final String id;
    private final float value;

    static {
        SoundMode soundMode = new SoundMode(0.3f, 0, "LOW", Constants.LOW);
        LOW = soundMode;
        SoundMode soundMode2 = new SoundMode(0.6f, 1, "MID", "mid");
        MID = soundMode2;
        SoundMode soundMode3 = new SoundMode(1.0f, 2, "HIGH", Constants.HIGH);
        HIGH = soundMode3;
        SoundMode[] soundModeArr = {soundMode, soundMode2, soundMode3};
        $VALUES = soundModeArr;
        $ENTRIES = kotlin.enums.a.a(soundModeArr);
        Companion = new q9t0();
    }

    public SoundMode(float f, int i, String str, String str2) {
        this.id = str2;
        this.value = f;
    }

    public static SoundMode valueOf(String str) {
        return (SoundMode) Enum.valueOf(SoundMode.class, str);
    }

    public static SoundMode[] values() {
        return (SoundMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final String getId() {
        return this.id;
    }
}
