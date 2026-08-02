package xsna;

import com.vk.api.generated.groups.dto.GroupsAddressWorkInfoStatusDto;

/* compiled from: GroupsAddressWorkInfoStatusDtoToIntMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class you {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[GroupsAddressWorkInfoStatusDto.values().length];
        try {
            iArr[GroupsAddressWorkInfoStatusDto.NO_INFORMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GroupsAddressWorkInfoStatusDto.TEMPORARILY_CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GroupsAddressWorkInfoStatusDto.ALWAYS_OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GroupsAddressWorkInfoStatusDto.TIMETABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GroupsAddressWorkInfoStatusDto.FOREVER_CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
