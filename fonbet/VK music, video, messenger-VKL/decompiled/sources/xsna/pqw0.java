package xsna;

import android.content.Context;
import com.vk.api.generated.messages.dto.MessagesCallScheduleDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager.view.c;
import com.vk.voip.utils.ics.Freq;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.arw0;
import xsna.nqw0;
import xsna.pww0;
import xsna.uqw0;

/* compiled from: VoipInviteToScheduledCallFeature.kt */
/* loaded from: classes7.dex */
public final class pqw0 extends wk50<erw0, arw0, nqw0, vqw0> {
    public final CallId f;
    public final VoipScheduleCallTimeZone g;
    public final vg20 h;
    public final b25 i;
    public final f4z j;
    public final f4z<brw0> k;
    public final com.vk.voip.ui.share.link.pager.view.b l;
    public final h1x0 m;

    /* compiled from: VoipInviteToScheduledCallFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesCallScheduleDto.RecurrenceRuleDto.values().length];
            try {
                iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagesCallScheduleDto.RecurrenceRuleDto.WEEKDAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessagesCallScheduleDto.RecurrenceRuleDto.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessagesCallScheduleDto.RecurrenceRuleDto.YEARLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pqw0(CallId callId, VoipScheduleCallTimeZone voipScheduleCallTimeZone, vg20 vg20Var, b25 b25Var) {
        super(nqw0.a.b, new zqw0());
        this.f = callId;
        this.g = voipScheduleCallTimeZone;
        this.h = vg20Var;
        this.i = b25Var;
        this.j = new f4z();
        this.k = new f4z<>();
        com.vk.voip.ui.share.link.pager.view.b bVar = new com.vk.voip.ui.share.link.pager.view.b(callId, null, VoipShareLinkPagerState.TypeControl.SINGLE_SHARE, vg20Var, new z4t0(this, 12));
        this.l = bVar;
        h1x0 h1x0Var = new h1x0(new bpn0(new pkd0(14)));
        this.m = h1x0Var;
        h1x0Var.c();
        h1x0Var.a(bVar.k);
    }

    public static VoipScheduleCallTimeZone U() {
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getDefault();
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

    public static q5o X(MessagesCallScheduleDto.RecurrenceRuleDto recurrenceRuleDto, Long l) {
        if (recurrenceRuleDto == MessagesCallScheduleDto.RecurrenceRuleDto.NEVER) {
            recurrenceRuleDto = null;
        }
        if (recurrenceRuleDto == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[recurrenceRuleDto.ordinal()];
        q5o q5oVar = new q5o(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Freq.DAILY : Freq.YEARLY : Freq.MONTHLY : Freq.WEEKDAYS : Freq.WEEKENDS : Freq.WEEKLY);
        q5oVar.b = l != null ? new Date(l.longValue()) : null;
        return q5oVar;
    }

    @Override // xsna.wk50
    public final void N(arw0 arw0Var, nqw0 nqw0Var) {
        nqw0 nqw0Var2 = nqw0Var;
        arw0.a aVar = arw0Var.c;
        if (nqw0Var2 instanceof nqw0.a) {
            String str = this.f.b;
            this.h.getClass();
            tfx tfxVar = new tfx("messages.getScheduledCallById", new eq(22), new com.vk.movika.sdk.base.model.history.b(21));
            tfx.o(tfxVar, "call_id", str, 0, 0, 12);
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(tfxVar)), new j5v0(new oqw0(this, 0), 4)), new v29(this, 4)).l(new xhb0(new p6e0(this, 28), 18)), new anw0(this, 1), new fda0(this, 27), 1);
            return;
        }
        boolean z = nqw0Var2 instanceof nqw0.d;
        f4z f4zVar = this.j;
        if (z) {
            if (aVar.a.length() == 0) {
                return;
            }
            f4zVar.b(new uqw0.c(aVar.a));
            return;
        }
        if (nqw0Var2 instanceof nqw0.b) {
            MessagesScheduledCallItemDto messagesScheduledCallItemDto = aVar.d;
            if (messagesScheduledCallItemDto == null) {
                return;
            }
            MessagesCallScheduleDto u = messagesScheduledCallItemDto.u();
            String V = V(W(), messagesScheduledCallItemDto);
            q5o X = X(u.e(), u.f());
            VoipScheduleCallTimeZone voipScheduleCallTimeZone = this.g;
            if (voipScheduleCallTimeZone == null) {
                voipScheduleCallTimeZone = U();
            }
            f4zVar.b(new uqw0.a(new f1x0(messagesScheduledCallItemDto.l(), V, X != null ? u3r0.b(X, TimeZone.getTimeZone(voipScheduleCallTimeZone.b)) : null, ((long) u.getDuration()) == VoipScheduledCallDuration.DAY.h(), u.g(), u.g() + u.getDuration(), null, messagesScheduledCallItemDto.D())));
            return;
        }
        if (!(nqw0Var2 instanceof nqw0.c)) {
            if (!(nqw0Var2 instanceof nqw0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar.a.length() == 0) {
                return;
            }
            f4zVar.b(new uqw0.d(aVar.a));
            return;
        }
        MessagesScheduledCallItemDto messagesScheduledCallItemDto2 = aVar.d;
        if (messagesScheduledCallItemDto2 == null) {
            return;
        }
        String W = W();
        MessagesCallScheduleDto u2 = messagesScheduledCallItemDto2.u();
        q5o X2 = X(u2.e(), u2.f());
        String V2 = V(W, messagesScheduledCallItemDto2);
        f4zVar.b(new uqw0.b(new g1x0(aVar.d.l(), V2, new pww0.a(W, messagesScheduledCallItemDto2.l(), V2, new Date(u2.g()), new Date(u2.g() + u2.getDuration()), X2, TimeZone.getDefault()).a())));
    }

    public final String V(String str, MessagesScheduledCallItemDto messagesScheduledCallItemDto) {
        String l = messagesScheduledCallItemDto.l();
        String str2 = this.i.o().b().e;
        long g = messagesScheduledCallItemDto.u().g();
        long g2 = messagesScheduledCallItemDto.u().g() + messagesScheduledCallItemDto.u().getDuration();
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = this.g;
        if (voipScheduleCallTimeZone == null) {
            voipScheduleCallTimeZone = U();
        }
        return new a49(l, str2, g, g2, voipScheduleCallTimeZone, str).a();
    }

    public final String W() {
        com.vk.voip.ui.share.link.pager.view.c cVar = this.l.f;
        if (cVar instanceof c.a) {
            return ((c.a) cVar).a;
        }
        if (!(cVar instanceof c.b)) {
            return "";
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c.b bVar = (c.b) cVar;
        return context.getString(R.string.voip_share_link_page_with_password_link, bVar.a, bVar.b);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.m.e();
    }
}
