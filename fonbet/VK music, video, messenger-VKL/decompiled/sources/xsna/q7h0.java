package xsna;

import android.icu.text.TimeZoneNames;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.api.generated.messages.dto.MessagesGetScheduledCallsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.userid.CallsUserId;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: ScheduledCallsRepository.kt */
/* loaded from: classes7.dex */
public final class q7h0 {
    public final vg20 a;
    public final rd9 b;

    /* compiled from: ScheduledCallsRepository.kt */
    public static final class a {
        public final MessagesGetScheduledCallsResponseDto a;
        public final boolean b;
        public final String c;

        public a(MessagesGetScheduledCallsResponseDto messagesGetScheduledCallsResponseDto, boolean z, String str) {
            this.a = messagesGetScheduledCallsResponseDto;
            this.b = z;
            this.c = str;
        }
    }

    /* compiled from: ScheduledCallsRepository.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ScheduledVideoMuteOption.values().length];
            try {
                iArr[ScheduledVideoMuteOption.DisabledOnJoin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScheduledVideoMuteOption.DisabledPermanent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScheduledVideoMuteOption.Enabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScheduledAudioMuteOption.values().length];
            try {
                iArr2[ScheduledAudioMuteOption.MutedOnJoin.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScheduledAudioMuteOption.MutedPermanent.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScheduledAudioMuteOption.Enabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ScheduledScreenSharingMuteOption.values().length];
            try {
                iArr3[ScheduledScreenSharingMuteOption.DisabledOnJoin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ScheduledScreenSharingMuteOption.DisabledPermanent.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ScheduledScreenSharingMuteOption.Enabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ScheduledCallRecurrence.values().length];
            try {
                iArr4[ScheduledCallRecurrence.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ScheduledCallRecurrence.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ScheduledCallRecurrence.WEEKDAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ScheduledCallRecurrence.WEEKEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ScheduledCallRecurrence.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ScheduledCallRecurrence.YEARLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public q7h0(vg20 vg20Var, rd9 rd9Var) {
        this.a = vg20Var;
        this.b = rd9Var;
    }

    public static VoipScheduleCallTimeZone a(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        if (!gz80.a(24)) {
            String id = timeZone.getID();
            String displayName = timeZone.getDisplayName(false, 1, locale);
            int length = displayName.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    if (displayName.charAt(i) == ',') {
                        displayName = displayName.substring(0, i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            return new VoipScheduleCallTimeZone(id, displayName, timeZone.getDisplayName(false, 0, locale), timeZone.getRawOffset());
        }
        String displayName2 = TimeZoneNames.getInstance(locale).getDisplayName(str, TimeZoneNames.NameType.LONG_GENERIC, j);
        String displayName3 = TimeZoneNames.getInstance(locale).getDisplayName(str, TimeZoneNames.NameType.LONG_STANDARD, j);
        String displayName4 = TimeZoneNames.getInstance(locale).getDisplayName(str, TimeZoneNames.NameType.LONG_DAYLIGHT, j);
        String k0 = drm0.k0(str, DomExceptionUtils.SEPARATOR, "");
        if (k0.length() == 0) {
            k0 = null;
        }
        if (displayName2 == null) {
            displayName2 = displayName3 == null ? displayName4 == null ? k0 : displayName4 : displayName3;
        }
        String exemplarLocationName = TimeZoneNames.getInstance(locale).getExemplarLocationName(str);
        boolean f = epx.f(displayName2, exemplarLocationName);
        StringBuilder sb = new StringBuilder();
        if (displayName2 != null && !drm0.N(displayName2)) {
            sb.append(displayName2);
        }
        if (!f && sb.length() > 0 && exemplarLocationName != null && !drm0.N(exemplarLocationName)) {
            sb.append(DomExceptionUtils.SEPARATOR);
        }
        if (!f && exemplarLocationName != null && !drm0.N(exemplarLocationName)) {
            sb.append(exemplarLocationName);
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("UTC");
        sb3.append(timeZone.getRawOffset() > 0 ? "+" : "-");
        sb3.append(TimeUnit.MILLISECONDS.toHours(Math.abs(timeZone.getRawOffset())));
        return new VoipScheduleCallTimeZone(timeZone.getID(), sb2, sb3.toString(), timeZone.getRawOffset());
    }

    public static io.reactivex.rxjava3.internal.operators.single.y b(q7h0 q7h0Var, String str, CallsUserId callsUserId, int i) {
        tfx tfxVar;
        String str2 = (i & 1) != 0 ? null : str;
        CallsUserId callsUserId2 = (i & 2) != 0 ? null : callsUserId;
        vg20 vg20Var = q7h0Var.a;
        UserId b2 = callsUserId2 != null ? com.vk.voip.userid.a.b(callsUserId2) : null;
        Integer num = 100;
        vg20Var.getClass();
        tfx tfxVar2 = new tfx("messages.getScheduledCalls", new fq(21), new gq(26));
        if (str2 != null) {
            tfxVar = tfxVar2;
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        } else {
            tfxVar = tfxVar2;
        }
        tfx.l(tfxVar, "count", num.intValue(), 0, 0, 12);
        if (b2 != null) {
            tfx.n(tfxVar, "caller_id", b2, 0L, 0L, 12);
        }
        tfxVar.j("grouped", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new pi40(new r820(q7h0Var, 21), 6));
    }
}
