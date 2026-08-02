package xsna;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.b89;
import xsna.dw20;
import xsna.srw0;

/* compiled from: VoipParticipantSettingsAccessRightsModalDialog.kt */
/* loaded from: classes7.dex */
public final class otw0 extends dw20 {
    public static final /* synthetic */ int i1 = 0;
    public CallMemberId f1;
    public final io.reactivex.rxjava3.disposables.b g1;
    public final bpn0 h1;

    /* compiled from: VoipParticipantSettingsAccessRightsModalDialog.kt */
    public static final class a extends dw20.b {
        public final CallMemberId e;

        public a(Context context, CallMemberId callMemberId) {
            super(context, tzp0.a(null, 3));
            this.e = callMemberId;
            c(new cpo(false, 0, 3));
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            otw0 otw0Var = new otw0();
            otw0Var.setArguments(yfb.b(new Pair("call_member_id", this.e)));
            return otw0Var;
        }
    }

    /* compiled from: VoipParticipantSettingsAccessRightsModalDialog.kt */
    public static final class b {
        public final Integer a;
        public final Integer b;

        public b() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangedItemState(allowedIcon=");
            sb.append(this.a);
            sb.append(", forbiddenIcon=");
            return uqi.b(sb, this.b, ')');
        }

        public b(Integer num, Integer num2) {
            this.a = num;
            this.b = num2;
        }
    }

    /* compiled from: VoipParticipantSettingsAccessRightsModalDialog.kt */
    public static final class c {
        public final View a;
        public final int b;
        public final int c;
        public final int d;

        public c(View view, int i, int i2, int i3) {
            this.a = view;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder(parentView=");
            sb.append(this.a);
            sb.append(", textViewRes=");
            sb.append(this.b);
            sb.append(", switchViewRes=");
            sb.append(this.c);
            sb.append(", containerBtnViewRes=");
            return vu5.b(sb, this.d, ')');
        }
    }

    public otw0() {
        Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        this.f1 = CallMemberId.a.a(String.valueOf(UserId.d.b));
        this.g1 = new io.reactivex.rxjava3.disposables.b();
        this.h1 = new bpn0(new v5n0(this, 26));
    }

    public final boolean Yn(Map<CallMemberId, ? extends MediaOptionState> map) {
        return (map != null ? map.getOrDefault(this.f1, MediaOptionState.MUTED_PERMANENT) : null) != MediaOptionState.MUTED_PERMANENT;
    }

    public final void Zn(boolean z, MediaOption mediaOption) {
        if (z) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.b0().b(this.f1, on00.f(new Pair(mediaOption, MediaOptionState.UNMUTED)));
        } else {
            Map<MediaOption, ? extends MediaOptionState> f = on00.f(new Pair(mediaOption, MediaOptionState.MUTED_PERMANENT));
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.b0().b(this.f1, f);
            ((kdw0) this.h1.getValue()).b(new srw0.b.C3687b(srw0.d.b.a, f));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ao(boolean z, io.reactivex.rxjava3.internal.operators.observable.j1 j1Var, c cVar, b bVar, final izs izsVar) {
        View view = cVar.a;
        TextView textView = (TextView) view.findViewById(cVar.b);
        final SwitchCompat switchCompat = (SwitchCompat) view.findViewById(cVar.c);
        switchCompat.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.mtw0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i = otw0.i1;
                if (mnh0.q(motionEvent)) {
                    izs.this.invoke(Boolean.valueOf(!switchCompat.isChecked()));
                }
                return true;
            }
        });
        View findViewById = view.findViewById(cVar.d);
        bwt0.i0(findViewById, new whi0(10, izsVar, switchCompat));
        bwt0.p0(textView, z);
        bwt0.p0(switchCompat, z);
        bwt0.p0(findViewById, z);
        this.g1.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(j1Var, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()), null, new h2h0(17), new erh(switchCompat, this, bVar, textView)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r3 == null) goto L13;
     */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        CallMemberId a2;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("call_member_id", CallMemberId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("call_member_id");
                if (!(parcelable3 instanceof CallMemberId)) {
                    parcelable3 = null;
                }
                parcelable = (CallMemberId) parcelable3;
            }
            a2 = (CallMemberId) parcelable;
        }
        Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        a2 = CallMemberId.a.a(String.valueOf(UserId.d.b));
        this.f1 = a2;
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.g1.e();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        b89.g gVar;
        View inflate = getLayoutInflater().inflate(R.layout.voip_participant_settings_access_rights_view, (ViewGroup) null);
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y G0 = com.vk.voip.ui.c.G0(true);
        asu0 asu0Var = asu0.a;
        this.g1.b(io.reactivex.rxjava3.kotlin.c.f(2, G0.r0(asu0Var.c()).a0(asu0Var.d()), null, new t3v(29), new n9m0(this, 27)));
        bwt0.i0(inflate.findViewById(R.id.back_btn), new ijw0(this, 2));
        ao(true, com.vk.voip.ui.c.G0(true).r0(asu0Var.c()).U(new ga40(new gqq0(this, 13), 20)), new c(inflate, R.id.microphone_text, R.id.microphone_switch, R.id.microphone_container_btn), new b(Integer.valueOf(R.drawable.vk_icon_voice_outline_28), Integer.valueOf(R.drawable.vk_icon_microphone_slash_outline_28)), new w7w0(this, 4));
        ao(true, com.vk.voip.ui.c.G0(true).r0(asu0Var.c()).U(new awi0(new k7l0(this, 27), 16)), new c(inflate, R.id.camera_text, R.id.camera_switch, R.id.camera_container_btn), new b(Integer.valueOf(R.drawable.vk_icon_videocam_outline_28), Integer.valueOf(R.drawable.vk_icon_videocam_slash_outline_28)), new u5p0(this, 23));
        ao(true, com.vk.voip.ui.c.G0(true).r0(asu0Var.c()).U(new fhb0(new qjg0(this, 26), 17)), new c(inflate, R.id.screen_share_text, R.id.screen_share_switch, R.id.screen_share_container_btn), new b(Integer.valueOf(R.drawable.vk_icon_arrow_up_rectangle_outline_28), Integer.valueOf(R.drawable.vk_icon_arrow_up_rectangle_slash_outline_28)), new cbt0(this, 12));
        b79 b79Var = new b79(this.f1, OKVoipEngine.b);
        p490 a2 = r99.a.a();
        s99 j = a2.v().j();
        a2.w();
        b89.h hVar = b79Var.a(j).a;
        b89.h.b bVar = hVar instanceof b89.h.b ? (b89.h.b) hVar : null;
        ao((bVar == null || (gVar = bVar.q) == null) ? false : gVar.a, com.vk.voip.ui.c.G0(true).r0(asu0Var.c()).U(new d810(new ntw0(this, 0), 18)), new c(inflate, R.id.watch_together_text, R.id.watch_together_switch, R.id.watch_together_container_btn), new b(Integer.valueOf(R.drawable.vk_icon_logo_vk_video_outline_28), Integer.valueOf(R.drawable.vk_icon_logo_vk_video_slash_outline_28)), new ukv0(this, 7));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
