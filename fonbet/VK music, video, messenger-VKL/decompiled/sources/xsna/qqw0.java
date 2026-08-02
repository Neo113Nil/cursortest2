package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VoipInviteToScheduledCallModalDialog.kt */
/* loaded from: classes7.dex */
public final class qqw0 extends tl50<pqw0, erw0, nqw0> {
    public static final int j1 = iah0.a(8);
    public drw0 i1;

    /* compiled from: VoipInviteToScheduledCallModalDialog.kt */
    public static final class a extends dw20.b {
        public final CallId e;
        public final VoipScheduleCallTimeZone f;

        public a(CallId callId, VoipScheduleCallTimeZone voipScheduleCallTimeZone, Context context) {
            super(context, tzp0.a(null, 3));
            this.e = callId;
            this.f = voipScheduleCallTimeZone;
            int i = qqw0.j1;
            n0(i);
            o0(i);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            qqw0 qqw0Var = new qqw0();
            qqw0Var.setArguments(yfb.b(new Pair("key_call_id", this.e), new Pair("key_selected_time_zone", this.f)));
            return qqw0Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.voip_invite_to_scheduled_call_view, (ViewGroup) null);
        drw0 drw0Var = new drw0(inflate, this, new ijw0(this, 1));
        drw0Var.g.a(getFeature().l);
        this.i1 = drw0Var;
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        erw0 erw0Var = (erw0) ao50Var;
        drw0 drw0Var = this.i1;
        if (drw0Var != null) {
            gm50.a.b(this, erw0Var.a, new vxv0(2, this, drw0Var));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        pqw0 pqw0Var = (pqw0) vk50Var;
        pqw0Var.k.a(new gqq0(this, 12), this);
        pqw0Var.j.a(new r9c0(this, 29), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r6 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        CallId callId;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments.getParcelable("key_call_id", CallId.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments.getParcelable("key_call_id");
                if (!(parcelable5 instanceof CallId)) {
                    parcelable5 = null;
                }
                parcelable3 = (CallId) parcelable5;
            }
            callId = (CallId) parcelable3;
        }
        callId = CallId.e;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("key_selected_time_zone", VoipScheduleCallTimeZone.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable6 = arguments2.getParcelable("key_selected_time_zone");
                parcelable = parcelable6 instanceof VoipScheduleCallTimeZone ? parcelable6 : null;
            }
            r1 = (VoipScheduleCallTimeZone) parcelable;
        }
        return new pqw0(callId, r1, new vg20(), o25.a());
    }
}
