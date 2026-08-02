package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;

/* compiled from: VoipShareLinkPagerModalDialog.kt */
/* loaded from: classes7.dex */
public final class o1x0 extends dw20 {
    public static final int g1 = iah0.a(8);
    public final h1x0 f1 = new h1x0(new bpn0(new a7p0(7)));

    /* compiled from: VoipShareLinkPagerModalDialog.kt */
    public static final class a extends dw20.b {
        public final CallId e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CallId callId, String str, Context context, int i) {
            super(context, tzp0.a(null, 3));
            str = (i & 2) != 0 ? null : str;
            this.e = callId;
            this.f = str;
            int i2 = o1x0.g1;
            n0(i2);
            o0(i2);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            o1x0 o1x0Var = new o1x0();
            o1x0Var.setArguments(yfb.b(new Pair("key_call_id", this.e), new Pair("key_join_link", this.f)));
            return o1x0Var;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f1.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dialog yn(Bundle bundle) {
        CallId callId;
        Parcelable parcelable;
        Object parcelable2;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_share_link_pager_modal_dialog_view, (ViewGroup) null, false);
        jjc.g(inflate.findViewById(R.id.close_btn), new l9v0(this, 6));
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("key_call_id", CallId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("key_call_id");
                if (!(parcelable3 instanceof CallId)) {
                    parcelable3 = null;
                }
                parcelable = (CallId) parcelable3;
            }
            callId = (CallId) parcelable;
        }
        callId = CallId.e;
        CallId callId2 = callId;
        Bundle arguments2 = getArguments();
        com.vk.voip.ui.share.link.pager.view.b bVar = new com.vk.voip.ui.share.link.pager.view.b(callId2, arguments2 != null ? arguments2.getString("key_join_link") : null, VoipShareLinkPagerState.TypeControl.SINGLE_SHARE, new vg20(), new lzl0(this, 24));
        this.f1.a(bVar.k);
        ((VoipShareLinkPagerView) inflate.findViewById(R.id.share_link_view_pager)).a(bVar);
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
