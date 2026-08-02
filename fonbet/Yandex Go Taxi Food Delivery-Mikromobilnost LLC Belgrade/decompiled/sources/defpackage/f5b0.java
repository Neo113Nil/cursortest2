package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Triple;
import kotlin.a;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public abstract class f5b0 extends e {
    public final View B0;
    public final TextView C0;
    public final TextView D0;
    public final TextView E0;
    public final View F0;
    public final View G0;
    public final View H0;
    public final View I0;
    public final rg7 J0;
    public final DateFormat K0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f5b0(jwf jwfVar, boolean z, int i) {
        super(z, r4, jwfVar);
        ViewGroup viewGroup = (ViewGroup) jwfVar.k;
        View g = g8a1.g(viewGroup, i);
        this.B0 = g.findViewById(e9h0.personal_meeting_message_container);
        this.C0 = (TextView) g.findViewById(e9h0.personal_meeting_message_title);
        this.D0 = (TextView) g.findViewById(e9h0.personal_meeting_message_call_details);
        this.E0 = (TextView) g.findViewById(e9h0.personal_meeting_rate_button);
        this.F0 = g.findViewById(e9h0.personal_meeting_message_successful_call);
        this.G0 = g.findViewById(e9h0.personal_meeting_message_failed_call);
        this.H0 = g.findViewById(e9h0.personal_meeting_message_successful_video_call);
        this.I0 = g.findViewById(e9h0.personal_meeting_message_failed_video_call);
        Context context = viewGroup.getContext();
        rg7 rg7Var = new rg7();
        rg7Var.a = context.getString(oyh0.call_duration_hours_format);
        rg7Var.b = context.getString(oyh0.call_duration_minutes_format);
        rg7Var.c = context.getString(oyh0.call_duration_seconds_format);
        this.J0 = rg7Var;
        this.K0 = android.text.format.DateFormat.getTimeFormat(g.getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b1  */
    @Override // com.yandex.messaging.internal.view.timeline.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(yab yabVar, vb5 vb5Var) {
        int i;
        boolean z;
        String p;
        yabVar.a0();
        z83.i();
        super.X(yabVar, vb5Var);
        boolean z2 = this.R;
        this.O = z2 ? new ubz0(yabVar.Z()) : new tbz0(yabVar.Z(), yabVar.a());
        TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage = (TechPersonalMeetingEndedMessage) yabVar.R();
        Date T = yabVar.T();
        PersonalMeetingResolution e = hi91.e(techPersonalMeetingEndedMessage);
        View view = this.a;
        Resources resources = view.getResources();
        int i2 = c5b0.a[e.ordinal()];
        if (i2 == 1) {
            i = oyh0.call_finished;
        } else if (i2 == 2) {
            i = oyh0.call_finished;
        } else if (i2 == 3) {
            i = z2 ? oyh0.call_declined : oyh0.incoming_declined_call_status;
        } else if (i2 == 4) {
            i = z2 ? oyh0.outgoing_missed_call_status : oyh0.incoming_missed_call_status;
        } else {
            if (i2 != 5) {
                w511.b();
                return;
            }
            i = z2 ? oyh0.outgoing_canceled_call_status : oyh0.incoming_canceled_call_status;
        }
        String obj = resources.getText(i).toString();
        int i3 = e5b0.a[e.ordinal()];
        final int i4 = 0;
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                z = z2;
            } else if (i3 != 4 || z2) {
                z = false;
            }
            String obj2 = view.getResources().getText(techPersonalMeetingEndedMessage.callType != 0 ? (z2 && z) ? oyh0.outgoing_video_call_text_bubble : z2 ? oyh0.call_canceled : z ? oyh0.incoming_video_call_text_bubble : oyh0.incoming_video_call_failed_text_bubble : (z2 && z) ? oyh0.chat_outgoing_call : z2 ? oyh0.call_canceled : z ? oyh0.incoming_call_text_bubble : oyh0.incoming_call_failed_text_bubble).toString();
            String format = this.K0.format(T);
            if (e != PersonalMeetingResolution.Success) {
                o430 o430Var = e3n.b;
                long V = kp50.V(techPersonalMeetingEndedMessage.durationSeconds, DurationUnit.SECONDS);
                final rg7 rg7Var = this.J0;
                rg7Var.getClass();
                Triple triple = new Triple(Long.valueOf(e3n.o(V, DurationUnit.HOURS)), Integer.valueOf(e3n.f(V)), Integer.valueOf(e3n.h(V)));
                long longValue = ((Number) triple.getFirst()).longValue();
                final int intValue = ((Number) triple.getSecond()).intValue();
                final int intValue2 = ((Number) triple.getThird()).intValue();
                i3y a = a.a(new uc2(longValue, rg7Var));
                i3y a2 = a.a(new sls() { // from class: qg7
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        rg7 rg7Var2 = rg7Var;
                        int i6 = intValue;
                        switch (i5) {
                            case 0:
                                return i6 + " " + rg7Var2.b;
                            default:
                                return i6 + " " + rg7Var2.c;
                        }
                    }
                });
                i3y a3 = a.a(new sls() { // from class: qg7
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = r3;
                        rg7 rg7Var2 = rg7Var;
                        int i6 = intValue2;
                        switch (i5) {
                            case 0:
                                return i6 + " " + rg7Var2.b;
                            default:
                                return i6 + " " + rg7Var2.c;
                        }
                    }
                });
                p = g8e.p((longValue <= 0 || intValue <= 0) ? longValue > 0 ? (String) a.getValue() : (intValue <= 0 || intValue2 <= 0) ? intValue > 0 ? (String) a2.getValue() : (String) a3.getValue() : g8e.p((String) a2.getValue(), " ", (String) a3.getValue()) : g8e.p((String) a.getValue(), " ", (String) a2.getValue()), " • ", format);
            } else {
                p = g8e.p(obj, " • ", format);
            }
            r8 = techPersonalMeetingEndedMessage.callType != 1 ? 0 : 1;
            this.C0.setText(obj2);
            this.D0.setText(p);
            View view2 = this.I0;
            View view3 = this.H0;
            View view4 = this.G0;
            View view5 = this.F0;
            if (r8 == 0) {
                view5.setVisibility(!z ? 4 : 0);
                view4.setVisibility(z ? 4 : 0);
                view3.setVisibility(4);
                view2.setVisibility(4);
            } else {
                view3.setVisibility(!z ? 4 : 0);
                view2.setVisibility(z ? 4 : 0);
                view5.setVisibility(4);
                view4.setVisibility(4);
            }
            View view6 = this.B0;
            view6.setOnLongClickListener(null);
            if (this.t0.d) {
                view6.setOnClickListener(null);
            } else {
                view6.setOnClickListener(new d5b0(0, this));
            }
            this.E0.setOnClickListener(new fx00(14, this, techPersonalMeetingEndedMessage));
        }
        z = true;
        String obj22 = view.getResources().getText(techPersonalMeetingEndedMessage.callType != 0 ? (z2 && z) ? oyh0.outgoing_video_call_text_bubble : z2 ? oyh0.call_canceled : z ? oyh0.incoming_video_call_text_bubble : oyh0.incoming_video_call_failed_text_bubble : (z2 && z) ? oyh0.chat_outgoing_call : z2 ? oyh0.call_canceled : z ? oyh0.incoming_call_text_bubble : oyh0.incoming_call_failed_text_bubble).toString();
        String format2 = this.K0.format(T);
        if (e != PersonalMeetingResolution.Success) {
        }
        if (techPersonalMeetingEndedMessage.callType != 1) {
        }
        this.C0.setText(obj22);
        this.D0.setText(p);
        View view22 = this.I0;
        View view32 = this.H0;
        View view42 = this.G0;
        View view52 = this.F0;
        if (r8 == 0) {
        }
        View view62 = this.B0;
        view62.setOnLongClickListener(null);
        if (this.t0.d) {
        }
        this.E0.setOnClickListener(new fx00(14, this, techPersonalMeetingEndedMessage));
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        Drawable a = z9z0Var.a(z, z2, this.R, false, false);
        a.setLayoutDirection(this.a.getLayoutDirection());
        View view = this.B0;
        a.setBounds(view.getLeft(), this.R ? 0 : view.getTop(), view.getRight(), view.getBottom());
        a.draw(canvas);
    }
}
