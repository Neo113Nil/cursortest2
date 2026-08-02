package xsna;

import android.content.Context;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.calls.dto.CallsStartMuteAudioDto;
import com.vk.api.generated.calls.dto.CallsStartMuteScreenSharingDto;
import com.vk.api.generated.calls.dto.CallsStartMuteVideoDto;
import com.vk.api.generated.calls.dto.CallsStartRecurrenceRuleDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallReportType;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import com.vk.voip.userid.CallsUserId;
import com.vk.voip.utils.ics.CalendarVersion;
import com.vk.voip.utils.ics.Freq;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.a7f0;
import xsna.fxw0;
import xsna.hww0;
import xsna.nww0;
import xsna.q7h0;
import xsna.sww0;
import xsna.tww0;

/* compiled from: VoipScheduleCallFeature.kt */
/* loaded from: classes7.dex */
public final class pww0 extends wk50<VoipScheduleCallViewState, fxw0, hww0, tww0> {
    public final q7h0 f;
    public final b25 g;
    public final x5h0 h;
    public final sdy i;
    public final u98 j;
    public final fhw0 k;
    public final jcx0 l;
    public final n6h0 m;
    public final f4z<sww0> n;
    public final f4z<nww0> o;
    public final bpn0 p;
    public final SimpleDateFormat q;

    /* compiled from: VoipScheduleCallFeature.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final Date d;
        public final Date e;
        public final q5o f;
        public final TimeZone g;

        public a(String str, String str2, String str3, Date date, Date date2, q5o q5oVar, TimeZone timeZone) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = date;
            this.e = date2;
            this.f = q5oVar;
            this.g = timeZone;
        }

        public final File a() {
            PrivateFiles.a b;
            String name = BuildInfo.a.name();
            Regex regex = com.vk.core.files.a.a;
            PrivateFiles privateFiles = e8r.a;
            PrivateSubdir privateSubdir = PrivateSubdir.INTERNAL_TEMP_UPLOADS;
            privateFiles.getClass();
            b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
            File file = b.a;
            StringBuilder b2 = ho8.b(name, BundleUtil.UNDERLINE_TAG);
            b2.append(System.currentTimeMillis());
            b2.append(".".concat("ics"));
            File file2 = new File(file, b2.toString());
            CalendarVersion calendarVersion = CalendarVersion.V2;
            qs9 qs9Var = new qs9();
            TimeZone timeZone = this.g;
            qs9Var.b = timeZone;
            int rawOffset = TimeZone.getDefault().getRawOffset() - timeZone.getRawOffset();
            vxp.a.getClass();
            vxp.e = this.b;
            vxp.f = this.c;
            long j = rawOffset;
            vxp.c = new Date(this.d.getTime() + j);
            vxp.d = new Date(this.e.getTime() + j);
            vxp.b = this.a;
            q5o q5oVar = this.f;
            if (q5oVar != null) {
                vxp.g = q5oVar;
            }
            had hadVar = new had(file2, 1);
            hadVar.c("BEGIN:VCALENDAR");
            hadVar.b("VERSION", calendarVersion.h());
            hadVar.b("PRODID", "VK CALLS APP");
            hadVar.b("CALSCALE", "GREGORIAN");
            hadVar.c("BEGIN:VTIMEZONE");
            hadVar.b("TZID", timeZone.getID());
            hadVar.b("TZNAME", ((TimeZone) qs9Var.b).getID());
            hadVar.c("BEGIN:STANDARD");
            hadVar.b("TZNAME", ((TimeZone) qs9Var.b).getDisplayName(false, 0));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            hadVar.b("TZOFFSETFROM", String.format("+%02d00", Arrays.copyOf(new Object[]{Integer.valueOf((int) timeUnit.toHours(r0.getOffset(System.currentTimeMillis())))}, 1)));
            hadVar.b("TZOFFSETTO", String.format("+%02d00", Arrays.copyOf(new Object[]{Integer.valueOf((int) timeUnit.toHours(r0.getOffset(System.currentTimeMillis())))}, 1)));
            hadVar.c("DTSTART:19700101T000000");
            hadVar.c("END:STANDARD");
            hadVar.c("END:VTIMEZONE");
            hadVar.c("BEGIN:VEVENT");
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            hadVar.b("DTSTAMP", simpleDateFormat.format(date));
            Date date2 = vxp.c;
            if (date2 != null) {
                hadVar.a("DTSTART;TZID=");
                hadVar.a(timeZone.getID());
                hadVar.a(StringUtils.PROCESS_POSTFIX_DELIMITER);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
                simpleDateFormat2.setTimeZone(timeZone);
                hadVar.a(simpleDateFormat2.format(date2));
                hadVar.a("\n");
            }
            Date date3 = vxp.d;
            if (date3 != null) {
                hadVar.a("DTEND;TZID=");
                hadVar.a(timeZone.getID());
                hadVar.a(StringUtils.PROCESS_POSTFIX_DELIMITER);
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
                simpleDateFormat3.setTimeZone(timeZone);
                hadVar.a(simpleDateFormat3.format(date3));
                hadVar.a("\n");
            }
            hadVar.b("SUMMARY", vxp.e);
            hadVar.b("URL", vxp.b);
            hadVar.b(NativeAdContent.ViewTag.AD_DESCRIPTION, vxp.f);
            q5o q5oVar2 = vxp.g;
            if (q5oVar2 != null) {
                hadVar.b("RRULE", u3r0.b(q5oVar2, timeZone));
            }
            hadVar.c("END:VEVENT");
            hadVar.c("END:VCALENDAR");
            return file2;
        }
    }

    /* compiled from: VoipScheduleCallFeature.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipScheduledCallReportType.values().length];
            try {
                iArr[VoipScheduledCallReportType.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipScheduledCallReportType.SCHEDULED_CALL_EDITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScheduledCallRecurrence.values().length];
            try {
                iArr2[ScheduledCallRecurrence.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScheduledCallRecurrence.WEEKEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScheduledCallRecurrence.WEEKDAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScheduledCallRecurrence.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ScheduledCallRecurrence.YEARLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pww0(www0 www0Var, q7h0 q7h0Var, b25 b25Var, x5h0 x5h0Var, u98 u98Var, fhw0 fhw0Var, kcx0 kcx0Var, n6h0 n6h0Var) {
        super(hww0.j.b, www0Var);
        sdy sdyVar = sdy.k;
        this.f = q7h0Var;
        this.g = b25Var;
        this.h = x5h0Var;
        this.i = sdyVar;
        this.j = u98Var;
        this.k = fhw0Var;
        this.l = kcx0Var;
        this.m = n6h0Var;
        this.n = new f4z<>();
        this.o = new f4z<>();
        this.p = new bpn0(new jo60(28));
        this.q = new SimpleDateFormat("dd MMMM HH:mm", Locale.getDefault());
    }

    public static void U(Throwable th) {
        if (h03.a(th)) {
            Context context = e43.a;
            (context != null ? context : null).getString(R.string.common_network_error);
        } else {
            Context context2 = e43.a;
            j03.f(context2 != null ? context2 : null, th);
        }
    }

    public static q5o X(fxw0.a aVar) {
        ScheduledCallRecurrence scheduledCallRecurrence = aVar.j;
        if (scheduledCallRecurrence == ScheduledCallRecurrence.NEVER) {
            scheduledCallRecurrence = null;
        }
        if (scheduledCallRecurrence == null) {
            return null;
        }
        int i = b.$EnumSwitchMapping$1[scheduledCallRecurrence.ordinal()];
        q5o q5oVar = new q5o(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Freq.DAILY : Freq.YEARLY : Freq.MONTHLY : Freq.WEEKDAYS : Freq.WEEKENDS : Freq.WEEKLY);
        mvo0 mvo0Var = aVar.k;
        q5oVar.b = mvo0Var != null ? new Date(mvo0Var.a) : null;
        return q5oVar;
    }

    @Override // xsna.wk50
    public final void N(fxw0 fxw0Var, hww0 hww0Var) {
        Object obj;
        CallsStartMuteVideoDto callsStartMuteVideoDto;
        CallsStartMuteAudioDto callsStartMuteAudioDto;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto;
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto2;
        rww0 rww0Var;
        sww0 eVar;
        CallsUserId callsUserId;
        fxw0 fxw0Var2 = fxw0Var;
        hww0 hww0Var2 = hww0Var;
        int i = 5;
        if (!(hww0Var2 instanceof hww0.j)) {
            boolean z = hww0Var2 instanceof hww0.k;
            int i2 = 2;
            int i3 = 3;
            q7h0 q7h0Var = this.f;
            if (z) {
                if (fxw0Var2 instanceof fxw0.e) {
                    T(tww0.k.b.b);
                    x5h0 x5h0Var = this.h;
                    if (x5h0Var != null) {
                        q7h0Var.getClass();
                        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new u0n(q7h0Var, i3));
                        asu0.a.getClass();
                        a7f0.a.f(this, vVar.q(asu0.k()), new tot0(i2, this, x5h0Var), new lxh0(this, 23), 1);
                    } else {
                        io.reactivex.rxjava3.internal.operators.single.y l = rsg0.w0(yfb.x(q7h0Var.a.c())).l(new he40(new uuz(22), 8));
                        io.reactivex.rxjava3.internal.operators.single.v vVar2 = new io.reactivex.rxjava3.internal.operators.single.v(new u0n(q7h0Var, i3));
                        asu0.a.getClass();
                        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(l, vVar2.q(asu0.k()), new mvc0(qww0.b, 12)), new egt0(this, 12), new mrw0(this, i2), 1);
                    }
                }
            } else if (hww0Var2 instanceof hww0.v) {
                if (fxw0Var2 instanceof fxw0.a) {
                    if (((fxw0.a) fxw0Var2).m) {
                        T(tww0.u.a.b);
                    } else {
                        T(tww0.u.b.b);
                    }
                }
            } else if (hww0Var2 instanceof hww0.m) {
                if ((fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null) != null) {
                    T(new tww0.m(!((fxw0.a) fxw0Var2).n));
                }
            } else if (hww0Var2 instanceof hww0.a) {
                if (fxw0Var2 instanceof fxw0.a) {
                    if (((fxw0.a) fxw0Var2).o) {
                        T(tww0.a.C3777a.b);
                    } else {
                        T(tww0.a.b.b);
                    }
                }
            } else if (!(hww0Var2 instanceof hww0.i)) {
                boolean z2 = hww0Var2 instanceof hww0.l;
                f4z<sww0> f4zVar = this.n;
                if (z2) {
                    hww0.l lVar = (hww0.l) hww0Var2;
                    boolean z3 = lVar instanceof hww0.l.a;
                    if (z3) {
                        f4zVar.b(sww0.a.a);
                    } else if ((fxw0Var2 instanceof fxw0.a) && !z3) {
                        if (lVar instanceof hww0.l.e) {
                            fxw0.a aVar = (fxw0.a) fxw0Var2;
                            ScheduledCallRecurrence scheduledCallRecurrence = aVar.j;
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(aVar.e);
                            eVar = new sww0.g(scheduledCallRecurrence, calendar);
                        } else if (lVar instanceof hww0.l.d) {
                            fxw0.a aVar2 = (fxw0.a) fxw0Var2;
                            eVar = new sww0.f(aVar2.e, aVar2.k);
                        } else if (lVar instanceof hww0.l.c) {
                            eVar = new sww0.d(((fxw0.a) fxw0Var2).s);
                        } else if (lVar instanceof hww0.l.h) {
                            eVar = new sww0.j(((fxw0.a) fxw0Var2).t);
                        } else if (lVar instanceof hww0.l.g) {
                            fxw0.a aVar3 = (fxw0.a) fxw0Var2;
                            eVar = new sww0.i(aVar3.h, aVar3.i);
                        } else if (lVar instanceof hww0.l.f) {
                            fxw0.a.AbstractC2899a abstractC2899a = ((fxw0.a) fxw0Var2).l;
                            if (abstractC2899a instanceof fxw0.a.AbstractC2899a.C2900a) {
                                callsUserId = null;
                            } else {
                                if (!(abstractC2899a instanceof fxw0.a.AbstractC2899a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                callsUserId = ((fxw0.a.AbstractC2899a.b) abstractC2899a).a.a;
                            }
                            eVar = new sww0.e(callsUserId);
                        } else {
                            if (!(lVar instanceof hww0.l.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fxw0.a aVar4 = (fxw0.a) fxw0Var2;
                            eVar = new sww0.c(new VoipScheduledCallSettingsConfig(new VoipScheduledCallSettingsConfig.CallSettings(aVar4.m, aVar4.o, aVar4.p, aVar4.s, aVar4.t, aVar4.u, aVar4.x, aVar4.y, aVar4.z)));
                        }
                        f4zVar.b(eVar);
                    }
                } else if (hww0Var2 instanceof hww0.q) {
                    if (fxw0Var2 instanceof fxw0.a) {
                        fxw0.a aVar5 = (fxw0.a) fxw0Var2;
                        long rawOffset = TimeZone.getDefault().getRawOffset() - aVar5.h.e;
                        long j = aVar5.e + rawOffset;
                        mvo0 mvo0Var = aVar5.k;
                        Long valueOf = mvo0Var != null ? Long.valueOf(mvo0Var.a + rawOffset) : null;
                        String str = aVar5.d;
                        boolean z4 = !aVar5.o;
                        boolean z5 = aVar5.p;
                        boolean z6 = aVar5.m;
                        boolean z7 = aVar5.n;
                        fxw0.a.AbstractC2899a abstractC2899a2 = aVar5.l;
                        fxw0.a.AbstractC2899a.b bVar = abstractC2899a2 instanceof fxw0.a.AbstractC2899a.b ? (fxw0.a.AbstractC2899a.b) abstractC2899a2 : null;
                        CallsUserId callsUserId2 = (bVar == null || (rww0Var = bVar.a) == null) ? null : rww0Var.a;
                        ScheduledAudioMuteOption scheduledAudioMuteOption = aVar5.s;
                        ScheduledVideoMuteOption scheduledVideoMuteOption = aVar5.t;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long seconds = timeUnit.toSeconds(j);
                        CallsUserId callsUserId3 = callsUserId2;
                        Long valueOf2 = valueOf != null ? Long.valueOf(timeUnit.toSeconds(valueOf.longValue())) : null;
                        ScheduledCallRecurrence scheduledCallRecurrence2 = aVar5.j;
                        long seconds2 = timeUnit.toSeconds(aVar5.g);
                        ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = aVar5.x;
                        boolean z8 = aVar5.y;
                        boolean z9 = aVar5.z;
                        this.i.getClass();
                        if (!myc0.f(drm0.p0(str).toString())) {
                            T(tww0.g.b);
                            T(tww0.h.b);
                        } else if (new Date().getTime() < TimeUnit.SECONDS.toMillis(seconds)) {
                            rd9 rd9Var = q7h0Var.b;
                            UserId b2 = callsUserId3 != null ? com.vk.voip.userid.a.b(callsUserId3) : null;
                            int i4 = q7h0.b.$EnumSwitchMapping$0[scheduledVideoMuteOption.ordinal()];
                            if (i4 == 1) {
                                callsStartMuteVideoDto = CallsStartMuteVideoDto.MUTE;
                            } else if (i4 == 2) {
                                callsStartMuteVideoDto = CallsStartMuteVideoDto.MUTE_PERMANENT;
                            } else {
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                callsStartMuteVideoDto = CallsStartMuteVideoDto.UNMUTE;
                            }
                            CallsStartMuteVideoDto callsStartMuteVideoDto2 = callsStartMuteVideoDto;
                            int i5 = q7h0.b.$EnumSwitchMapping$1[scheduledAudioMuteOption.ordinal()];
                            if (i5 == 1) {
                                callsStartMuteAudioDto = CallsStartMuteAudioDto.MUTE;
                            } else if (i5 == 2) {
                                callsStartMuteAudioDto = CallsStartMuteAudioDto.MUTE_PERMANENT;
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                callsStartMuteAudioDto = CallsStartMuteAudioDto.UNMUTE;
                            }
                            CallsStartMuteAudioDto callsStartMuteAudioDto2 = callsStartMuteAudioDto;
                            int i6 = (int) seconds2;
                            if (scheduledCallRecurrence2 != null) {
                                switch (q7h0.b.$EnumSwitchMapping$3[scheduledCallRecurrence2.ordinal()]) {
                                    case 1:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.DAILY;
                                        break;
                                    case 2:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.WEEKLY;
                                        break;
                                    case 3:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.WEEKDAYS;
                                        break;
                                    case 4:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.WEEKEND;
                                        break;
                                    case 5:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.MONTHLY;
                                        break;
                                    case 6:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.YEARLY;
                                        break;
                                    default:
                                        callsStartRecurrenceRuleDto2 = CallsStartRecurrenceRuleDto.NEVER;
                                        break;
                                }
                                callsStartRecurrenceRuleDto = callsStartRecurrenceRuleDto2;
                            } else {
                                callsStartRecurrenceRuleDto = null;
                            }
                            int i7 = q7h0.b.$EnumSwitchMapping$2[scheduledScreenSharingMuteOption.ordinal()];
                            if (i7 == 1) {
                                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.MUTE;
                            } else if (i7 == 2) {
                                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.MUTE_PERMANENT;
                            } else {
                                if (i7 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.UNMUTE;
                            }
                            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(qd9.b(rd9Var, Boolean.valueOf(z4), b2, str, Long.valueOf(seconds), Integer.valueOf(i6), valueOf2, callsStartRecurrenceRuleDto, Boolean.valueOf(z7), Boolean.valueOf(z6), callsStartMuteAudioDto2, callsStartMuteVideoDto2, callsStartMuteScreenSharingDto, null, Boolean.valueOf(z5), Boolean.valueOf(z8), Boolean.valueOf(z9), 125485121))).l(new tuz(new zsw(17), 12)).l(new gwn0(new tbs0(6, this, fxw0Var2), 11)).m(asu0.a.d()), new d120(new n9t0(this, 7), 29)), new hgb(this, 5)), new kf8(f4zVar, 12), new mf8(1, this, pww0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, 12), 1);
                        } else {
                            this.o.b(nww0.a.a);
                        }
                    }
                } else if (hww0Var2 instanceof hww0.h) {
                    ui uiVar = new ui(1, this, pww0.class, "applyEditScheduledCall", "applyEditScheduledCall(Lcom/vk/voip/ui/scheduled/creation/feature/VoipScheduleCallState;)V", 0, 11);
                    fxw0.a aVar6 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
                    if (aVar6 != null) {
                        uiVar.invoke(aVar6);
                    }
                } else if (hww0Var2 instanceof hww0.p) {
                    hww0.p pVar = (hww0.p) hww0Var2;
                    if (fxw0Var2 instanceof fxw0.a) {
                        if (pVar instanceof hww0.p.a) {
                            T(tww0.c.a.b);
                        } else {
                            if (!(pVar instanceof hww0.p.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Iterator<T> it = ((fxw0.a) fxw0Var2).c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next = it.next();
                                UserId b3 = com.vk.voip.userid.a.b(((rww0) next).a);
                                if (epx.f(b3 != null ? fkq0.a(b3) : null, fkq0.a(((hww0.p.b) pVar).b))) {
                                    obj = next;
                                    break;
                                }
                            }
                            rww0 rww0Var2 = (rww0) obj;
                            if (rww0Var2 != null) {
                                T(new tww0.c.b(rww0Var2));
                            }
                        }
                    }
                } else if (hww0Var2 instanceof hww0.e) {
                    T(new tww0.e(((hww0.e) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.f) {
                    T(new tww0.f(((hww0.f) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.o) {
                    T(new tww0.o(((hww0.o) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.n) {
                    T(new tww0.n(((hww0.n) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.s) {
                    T(new tww0.s(((hww0.s) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.g) {
                    T(new tww0.q(((hww0.g) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.d) {
                    T(new tww0.p(((hww0.d) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.c) {
                    T(new tww0.d(((hww0.c) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.b) {
                    T(new tww0.b(((hww0.b) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.u) {
                    T(new tww0.t(((hww0.u) hww0Var2).b));
                } else if (hww0Var2 instanceof hww0.w) {
                    if (fxw0Var2 instanceof fxw0.a) {
                        if (((fxw0.a) fxw0Var2).u.c) {
                            T(tww0.v.a.b);
                        } else {
                            T(tww0.v.b.b);
                        }
                    }
                } else if (hww0Var2 instanceof hww0.r) {
                    pyw0 pyw0Var = ((hww0.r) hww0Var2).b;
                    if (fxw0Var2 instanceof fxw0.a) {
                        VoipScheduledCallReportType voipScheduledCallReportType = pyw0Var.a;
                        MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel = pyw0Var.c;
                        CallId callId = pyw0Var.b;
                        int i8 = b.$EnumSwitchMapping$0[voipScheduledCallReportType.ordinal()];
                        bpn0 bpn0Var = this.p;
                        if (i8 == 1) {
                            ((iww0) bpn0Var.getValue()).a.p0(callId, sharingChannel);
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((iww0) bpn0Var.getValue()).a.j(callId, sharingChannel);
                        }
                    }
                } else {
                    if (!(hww0Var2 instanceof hww0.t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m6h0 m6h0Var = this.m.a;
                    if (m6h0Var != null) {
                        T(new tww0.r(m6h0Var));
                    }
                }
            } else if (fxw0Var2 instanceof fxw0.a) {
                if (((fxw0.a) fxw0Var2).p) {
                    T(tww0.i.a.b);
                } else {
                    T(tww0.i.b.b);
                }
            }
        } else if (fxw0Var2 instanceof fxw0.d) {
            fhw0 fhw0Var = this.k;
            if (fhw0Var.isInitialized()) {
                T(tww0.j.c.b);
                C(hww0.k.b);
            } else {
                L.G("calls are not initialized when opening call scheduler");
                T(tww0.j.b.b);
                io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new x2j0(this, 24), new whw0(this, i));
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final f1x0 V(fxw0.a aVar) {
        long j = aVar.g;
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = aVar.h;
        boolean z = j == VoipScheduledCallDuration.DAY.h();
        int rawOffset = TimeZone.getDefault().getRawOffset() - voipScheduleCallTimeZone.e;
        String str = aVar.d;
        String W = W(aVar);
        long j2 = aVar.e;
        long j3 = rawOffset;
        long j4 = j2 + j3;
        long j5 = j2 + aVar.g + j3;
        q5o X = X(aVar);
        return new f1x0(str, W, X != null ? u3r0.b(X, TimeZone.getTimeZone(voipScheduleCallTimeZone.b)) : null, z, j4, j5, null, aVar.r);
    }

    public final String W(fxw0.a aVar) {
        String str;
        String str2 = aVar.d;
        fxw0.a.AbstractC2899a abstractC2899a = aVar.l;
        SimpleDateFormat simpleDateFormat = y7h0.a;
        if (abstractC2899a instanceof fxw0.a.AbstractC2899a.C2900a) {
            str = this.g.o().b().e;
        } else {
            if (!(abstractC2899a instanceof fxw0.a.AbstractC2899a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((fxw0.a.AbstractC2899a.b) abstractC2899a).a.b;
        }
        long j = aVar.e;
        long j2 = aVar.g + j;
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = aVar.h;
        String str3 = aVar.r;
        if (str3 == null) {
            str3 = "";
        }
        return new a49(str2, str, j, j2, voipScheduleCallTimeZone, str3).a();
    }

    public final sww0 Y(fxw0.a aVar, f1x0 f1x0Var) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        q5o X = X(aVar);
        long j = aVar.e;
        CallId callId = aVar.b;
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = aVar.h;
        String str = aVar.d;
        String W = W(aVar);
        String str2 = aVar.r;
        if (str2 == null) {
            str2 = "";
        }
        return (BuildInfo.s() || BuildInfo.t()) ? new sww0.b(callId, voipScheduleCallTimeZone) : new sww0.h(callId, new g1x0(str, W, new a(str2, drm0.N(str) ? context.getString(R.string.voip_schedule_call_default_title) : str, W, new Date(j), new Date(aVar.g + j), X, TimeZone.getTimeZone(voipScheduleCallTimeZone.b)).a()), f1x0Var, this.q.format(new Date(j)));
    }
}
