package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;

/* compiled from: VoipFinishCallForAllModalDialog.kt */
/* loaded from: classes7.dex */
public final class eow0 extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: VoipFinishCallForAllModalDialog.kt */
    public static final class a extends dw20.b {
        public final String e;

        public a(Context context, String str) {
            super(context, tzp0.a(null, 3));
            this.e = str;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            eow0 eow0Var = new eow0();
            eow0Var.setArguments(yfb.b(new Pair("screen", new VoipAnalyticsEventScreen(this.e))));
            return eow0Var;
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_finish_call_for_all_modal_dialog, (ViewGroup) null, false);
        jjc.g(inflate.findViewById(R.id.finish_call_for_all_button), new z7t0(this, 7));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
