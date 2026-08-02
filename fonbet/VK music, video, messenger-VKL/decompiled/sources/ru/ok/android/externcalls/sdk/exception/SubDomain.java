package ru.ok.android.externcalls.sdk.exception;

import java.util.Locale;
import ru.ok.android.annotation.CallInternalApi;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubDomain.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class SubDomain {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubDomain[] $VALUES;
    private final int code;
    public static final SubDomain RTC = new SubDomain("RTC", 0, -1);
    public static final SubDomain API = new SubDomain("API", 1, -2);
    public static final SubDomain START = new SubDomain("START", 2, -3);
    public static final SubDomain JOIN = new SubDomain("JOIN", 3, -4);
    public static final SubDomain WS = new SubDomain("WS", 4, -5);
    public static final SubDomain WT = new SubDomain("WT", 5, -6);
    public static final SubDomain RINGING_TIMEOUT = new SubDomain("RINGING_TIMEOUT", 6, 12);

    private static final /* synthetic */ SubDomain[] $values() {
        return new SubDomain[]{RTC, API, START, JOIN, WS, WT, RINGING_TIMEOUT};
    }

    static {
        SubDomain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private SubDomain(String str, int i, int i2) {
        this.code = i2;
    }

    public static zrp<SubDomain> getEntries() {
        return $ENTRIES;
    }

    public static SubDomain valueOf(String str) {
        return (SubDomain) Enum.valueOf(SubDomain.class, str);
    }

    public static SubDomain[] values() {
        return (SubDomain[]) $VALUES.clone();
    }

    public final String asString() {
        int i = this.code;
        return i <= 0 ? name().toLowerCase(Locale.ROOT) : String.valueOf(i);
    }
}
