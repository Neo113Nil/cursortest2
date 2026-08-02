package com.yandex.messaging.internal.gaps;

import android.content.Context;
import android.util.TypedValue;
import defpackage.an21;
import defpackage.drb1;
import defpackage.jng0;
import defpackage.k4o;
import defpackage.wwg0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/internal/gaps/UserGapWorkflow;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "bgColor", CA20Status.STATUS_USER_I, "iconColor", "icon", "Companion", "an21", "Absence", "Trip", "ConferenceTrip", "Conference", "Learning", "Vacation", "PaidDayOff", "Illness", "Maternity", "Duty", "AtOffice", "RemoteWork", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserGapWorkflow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserGapWorkflow[] $VALUES;
    public static final UserGapWorkflow Absence;
    public static final UserGapWorkflow AtOffice;
    public static final an21 Companion;
    public static final UserGapWorkflow Conference;
    public static final UserGapWorkflow ConferenceTrip;
    public static final UserGapWorkflow Duty;
    public static final UserGapWorkflow Illness;
    public static final UserGapWorkflow Learning;
    public static final UserGapWorkflow Maternity;
    public static final UserGapWorkflow PaidDayOff;
    public static final UserGapWorkflow RemoteWork;
    public static final UserGapWorkflow Trip;
    public static final UserGapWorkflow Vacation;
    private final int bgColor;
    private final int icon;
    private final int iconColor;
    private final String id;

    static {
        UserGapWorkflow userGapWorkflow = new UserGapWorkflow(0, jng0.messagingGapsAbsenceColor, jng0.messagingGapsIconAbsenceColor, wwg0.msg_ic_gap_absence, "Absence", "absence");
        Absence = userGapWorkflow;
        int i = jng0.messagingGapsTripColor;
        int i2 = jng0.messagingGapsIconTripColor;
        int i3 = wwg0.msg_ic_gap_trip;
        UserGapWorkflow userGapWorkflow2 = new UserGapWorkflow(1, i, i2, i3, "Trip", "trip");
        Trip = userGapWorkflow2;
        UserGapWorkflow userGapWorkflow3 = new UserGapWorkflow(2, jng0.messagingGapsConferenceTripColor, jng0.messagingGapsIconConferenceTripColor, i3, "ConferenceTrip", "conference_trip");
        ConferenceTrip = userGapWorkflow3;
        UserGapWorkflow userGapWorkflow4 = new UserGapWorkflow(3, jng0.messagingGapsConferenceColor, jng0.messagingGapsIconConferenceColor, i3, "Conference", "conference");
        Conference = userGapWorkflow4;
        UserGapWorkflow userGapWorkflow5 = new UserGapWorkflow(4, jng0.messagingGapsLearningColor, jng0.messagingGapsIconLearningColor, wwg0.msg_ic_gap_learning, "Learning", "learning");
        Learning = userGapWorkflow5;
        UserGapWorkflow userGapWorkflow6 = new UserGapWorkflow(5, jng0.messagingGapsVacationColor, jng0.messagingGapsIconVacationColor, wwg0.msg_ic_gap_vacation, "Vacation", "vacation");
        Vacation = userGapWorkflow6;
        UserGapWorkflow userGapWorkflow7 = new UserGapWorkflow(6, jng0.messagingGapsPaidDayOffColor, jng0.messagingGapsIconPaidDayOffColor, wwg0.msg_ic_gap_paid_day_off, "PaidDayOff", "paid_day_off");
        PaidDayOff = userGapWorkflow7;
        UserGapWorkflow userGapWorkflow8 = new UserGapWorkflow(7, jng0.messagingGapsIllnessColor, jng0.messagingGapsIconIllnessColor, wwg0.msg_ic_gap_illness, "Illness", "illness");
        Illness = userGapWorkflow8;
        UserGapWorkflow userGapWorkflow9 = new UserGapWorkflow(8, jng0.messagingGapsMaternityColor, jng0.messagingGapsIconMaternityColor, wwg0.msg_ic_gap_maternity, "Maternity", "maternity");
        Maternity = userGapWorkflow9;
        UserGapWorkflow userGapWorkflow10 = new UserGapWorkflow(9, jng0.messagingGapsDutyColor, jng0.messagingGapsIconDutyColor, wwg0.msg_ic_gap_duty, "Duty", "duty");
        Duty = userGapWorkflow10;
        UserGapWorkflow userGapWorkflow11 = new UserGapWorkflow(10, jng0.messagingGapsAtOfficeColor, jng0.messagingGapsIconAtOfficeColor, wwg0.msg_ic_gap_at_office, "AtOffice", "office_work");
        AtOffice = userGapWorkflow11;
        UserGapWorkflow userGapWorkflow12 = new UserGapWorkflow(11, jng0.messagingGapsRemoteWorkColor, jng0.messagingGapsIconRemoteWorkColor, wwg0.msg_ic_gap_remote_work, "RemoteWork", "remote_work");
        RemoteWork = userGapWorkflow12;
        UserGapWorkflow[] userGapWorkflowArr = {userGapWorkflow, userGapWorkflow2, userGapWorkflow3, userGapWorkflow4, userGapWorkflow5, userGapWorkflow6, userGapWorkflow7, userGapWorkflow8, userGapWorkflow9, userGapWorkflow10, userGapWorkflow11, userGapWorkflow12};
        $VALUES = userGapWorkflowArr;
        $ENTRIES = a.a(userGapWorkflowArr);
        Companion = new an21();
    }

    public UserGapWorkflow(int i, int i2, int i3, int i4, String str, String str2) {
        this.id = str2;
        this.bgColor = i2;
        this.iconColor = i3;
        this.icon = i4;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static UserGapWorkflow valueOf(String str) {
        return (UserGapWorkflow) Enum.valueOf(UserGapWorkflow.class, str);
    }

    public static UserGapWorkflow[] values() {
        return (UserGapWorkflow[]) $VALUES.clone();
    }

    public final int a(Context context) {
        int i = jng0.messagingGapsBadgeIsIconColor;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return drb1.c(typedValue.data != 0 ? this.iconColor : this.bgColor, context);
    }

    public final String getId() {
        return this.id;
    }
}
