package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VoipParticipantSettingsBottomSheet.kt */
/* loaded from: classes7.dex */
public final class qtw0 extends tl50<stw0, duw0, ptw0> {
    public static final int l1 = iah0.a(8);
    public cuw0 i1;
    public vtw0 j1;
    public xtw0 k1;

    /* compiled from: VoipParticipantSettingsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final CallMemberId e;

        public a(Context context, CallMemberId callMemberId) {
            super(context, tzp0.a(null, 3));
            this.e = callMemberId;
            int i = qtw0.l1;
            p0(i);
            n0(i);
            o0(i);
            m0(i);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            qtw0 qtw0Var = new qtw0();
            qtw0Var.setArguments(yfb.b(new Pair("call_member_id", this.e)));
            return qtw0Var;
        }
    }

    /* compiled from: VoipParticipantSettingsBottomSheet.kt */
    public static final class b {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.voip_participant_settings_view, (ViewGroup) null);
        this.i1 = new cuw0(inflate, this, new n9t0(this, 6));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        duw0 duw0Var = (duw0) ao50Var;
        cuw0 cuw0Var = this.i1;
        if (cuw0Var != null) {
            gm50.a.b(this, duw0Var.a, new ufg0(10, this, cuw0Var));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        stw0 stw0Var = (stw0) vk50Var;
        stw0Var.m.a(new ljw0(this, 2), this);
        stw0Var.l.a(new whw0(this, 4), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j1 = new vtw0(requireContext(), new w2j0(this, 26));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j1 = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.k1 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r7 == null) goto L15;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        CallMemberId a2;
        Parcelable parcelable;
        Object parcelable2;
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
        CallMemberId callMemberId = a2;
        return new stw0(callMemberId, OKVoipEngine.b, r99.a.a(), new ttw0(callMemberId), ((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        this.k1 = new xtw0(requireContext(), yn.getWindow());
        return yn;
    }
}
