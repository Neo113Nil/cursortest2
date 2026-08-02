package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;
import xsna.c99;
import xsna.ca9;
import xsna.dw20;

/* compiled from: VoipCallsExcludeParticipantDialog.kt */
/* loaded from: classes7.dex */
public final class qkw0 extends dw20 {
    public static final /* synthetic */ int h1 = 0;
    public final p490 f1;
    public final m99 g1;

    /* compiled from: VoipCallsExcludeParticipantDialog.kt */
    public static final class a extends dw20.b {
        public final CallMemberId e;

        public a(Context context, CallMemberId callMemberId) {
            super(context, tzp0.a(null, 3));
            this.e = callMemberId;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            qkw0 qkw0Var = new qkw0();
            qkw0Var.setArguments(yfb.b(new Pair("call_member_id", this.e)));
            return qkw0Var;
        }
    }

    public qkw0() {
        p490 a2 = r99.a.a();
        this.f1 = a2;
        m99 v = a2.v();
        v.b(c99.n.a);
        this.g1 = v;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f1.w();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Parcelable parcelable;
        Map<String, whr0> map;
        Object parcelable2;
        View inflate = getLayoutInflater().inflate(R.layout.voip_calls_exclude_participant_dialog, (ViewGroup) null, false);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("call_member_id", CallMemberId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("call_member_id");
            if (!(parcelable3 instanceof CallMemberId)) {
                parcelable3 = null;
            }
            parcelable = (CallMemberId) parcelable3;
        }
        CallMemberId callMemberId = (CallMemberId) parcelable;
        ca9 ca9Var = this.g1.j().c;
        ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
        if (cVar != null && (map = cVar.m) != null) {
            whr0 whr0Var = map.get(callMemberId != null ? callMemberId.b : null);
            if (whr0Var != null) {
                ((TextView) inflate.findViewById(R.id.voip_remove_participant_title)).setText(inflate.getContext().getString(whr0Var.c ? R.string.voip_remove_participant_confirmation_f : R.string.voip_remove_participant_confirmation, whr0Var.e()));
                jjc.g(inflate.findViewById(R.id.exclude_btn), new p21(callMemberId, (CheckBox) inflate.findViewById(R.id.voip_remove_participant_ban), this, 5));
                dw20.Rn(this, inflate, 6);
                return super.yn(bundle);
            }
        }
        enj.q(R.string.voip_session_room_admin_room_participants_reload_description, 0, inflate.getContext());
        tn();
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
