package xsna;

import com.vk.api.generated.messages.dto.MessagesCallScheduleDto;

/* compiled from: RecurrenceRuleMapper.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class pif0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[MessagesCallScheduleDto.RecurrenceRuleDto.values().length];
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKDAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKEND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MessagesCallScheduleDto.RecurrenceRuleDto.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
