package com.yandex.passport.sloth.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/sloth/data/SlothRegistrationType;", "", "", "value", "Ljava/lang/String;", "Portal", "Neophonish", "Doregish", "Nothing", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SlothRegistrationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothRegistrationType[] $VALUES;
    public static final SlothRegistrationType Doregish;
    public static final SlothRegistrationType Neophonish;
    public static final SlothRegistrationType Nothing;
    public static final SlothRegistrationType Portal;
    private final String value;

    static {
        SlothRegistrationType slothRegistrationType = new SlothRegistrationType("Portal", 0, "portal");
        Portal = slothRegistrationType;
        SlothRegistrationType slothRegistrationType2 = new SlothRegistrationType("Neophonish", 1, "neophonish");
        Neophonish = slothRegistrationType2;
        SlothRegistrationType slothRegistrationType3 = new SlothRegistrationType("Doregish", 2, "doregish");
        Doregish = slothRegistrationType3;
        SlothRegistrationType slothRegistrationType4 = new SlothRegistrationType("Nothing", 3, "nothing");
        Nothing = slothRegistrationType4;
        SlothRegistrationType[] slothRegistrationTypeArr = {slothRegistrationType, slothRegistrationType2, slothRegistrationType3, slothRegistrationType4};
        $VALUES = slothRegistrationTypeArr;
        $ENTRIES = kotlin.enums.a.a(slothRegistrationTypeArr);
    }

    public SlothRegistrationType(String str, int i, String str2) {
        this.value = str2;
    }

    public static SlothRegistrationType valueOf(String str) {
        return (SlothRegistrationType) Enum.valueOf(SlothRegistrationType.class, str);
    }

    public static SlothRegistrationType[] values() {
        return (SlothRegistrationType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
