package com.yandex.passport.sloth.command.data;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/sloth/command/data/SlothAccountType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PORTAL", "LITE", "SOCIAL", "PDD", "PHONISH", "MAILISH", "MUSIC_PHONISH", "CHILDISH", "UNDEFINED", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothAccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothAccountType[] $VALUES;
    public static final SlothAccountType CHILDISH;
    public static final SlothAccountType LITE;
    public static final SlothAccountType MAILISH;
    public static final SlothAccountType MUSIC_PHONISH;
    public static final SlothAccountType PDD;
    public static final SlothAccountType PHONISH;
    public static final SlothAccountType PORTAL;
    public static final SlothAccountType SOCIAL;
    public static final SlothAccountType UNDEFINED;
    private final String value;

    static {
        SlothAccountType slothAccountType = new SlothAccountType("PORTAL", 0, "yandex");
        PORTAL = slothAccountType;
        SlothAccountType slothAccountType2 = new SlothAccountType("LITE", 1, "lite");
        LITE = slothAccountType2;
        SlothAccountType slothAccountType3 = new SlothAccountType("SOCIAL", 2, LegacyAccountType.STRING_SOCIAL);
        SOCIAL = slothAccountType3;
        SlothAccountType slothAccountType4 = new SlothAccountType("PDD", 3, "pdd");
        PDD = slothAccountType4;
        SlothAccountType slothAccountType5 = new SlothAccountType("PHONISH", 4, "phone");
        PHONISH = slothAccountType5;
        SlothAccountType slothAccountType6 = new SlothAccountType("MAILISH", 5, "mail");
        MAILISH = slothAccountType6;
        SlothAccountType slothAccountType7 = new SlothAccountType("MUSIC_PHONISH", 6, "music_phonish");
        MUSIC_PHONISH = slothAccountType7;
        SlothAccountType slothAccountType8 = new SlothAccountType("CHILDISH", 7, "children");
        CHILDISH = slothAccountType8;
        SlothAccountType slothAccountType9 = new SlothAccountType("UNDEFINED", 8, StringUtils.UNDEFINED);
        UNDEFINED = slothAccountType9;
        SlothAccountType[] slothAccountTypeArr = {slothAccountType, slothAccountType2, slothAccountType3, slothAccountType4, slothAccountType5, slothAccountType6, slothAccountType7, slothAccountType8, slothAccountType9};
        $VALUES = slothAccountTypeArr;
        $ENTRIES = kotlin.enums.a.a(slothAccountTypeArr);
    }

    public SlothAccountType(String str, int i, String str2) {
        this.value = str2;
    }

    public static SlothAccountType valueOf(String str) {
        return (SlothAccountType) Enum.valueOf(SlothAccountType.class, str);
    }

    public static SlothAccountType[] values() {
        return (SlothAccountType[]) $VALUES.clone();
    }
}
