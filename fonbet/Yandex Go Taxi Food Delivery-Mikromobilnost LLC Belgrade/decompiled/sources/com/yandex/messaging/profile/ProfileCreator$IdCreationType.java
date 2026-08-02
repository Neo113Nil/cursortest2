package com.yandex.messaging.profile;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/profile/ProfileCreator$IdCreationType", "", "Lcom/yandex/messaging/profile/ProfileCreator$IdCreationType;", "USE_DEFAULT_OR_INITIAL", "REGENERATE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProfileCreator$IdCreationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProfileCreator$IdCreationType[] $VALUES;
    public static final ProfileCreator$IdCreationType REGENERATE;
    public static final ProfileCreator$IdCreationType USE_DEFAULT_OR_INITIAL;

    static {
        ProfileCreator$IdCreationType profileCreator$IdCreationType = new ProfileCreator$IdCreationType("USE_DEFAULT_OR_INITIAL", 0);
        USE_DEFAULT_OR_INITIAL = profileCreator$IdCreationType;
        ProfileCreator$IdCreationType profileCreator$IdCreationType2 = new ProfileCreator$IdCreationType("REGENERATE", 1);
        REGENERATE = profileCreator$IdCreationType2;
        ProfileCreator$IdCreationType[] profileCreator$IdCreationTypeArr = {profileCreator$IdCreationType, profileCreator$IdCreationType2};
        $VALUES = profileCreator$IdCreationTypeArr;
        $ENTRIES = kotlin.enums.a.a(profileCreator$IdCreationTypeArr);
    }

    public static ProfileCreator$IdCreationType valueOf(String str) {
        return (ProfileCreator$IdCreationType) Enum.valueOf(ProfileCreator$IdCreationType.class, str);
    }

    public static ProfileCreator$IdCreationType[] values() {
        return (ProfileCreator$IdCreationType[]) $VALUES.clone();
    }
}
