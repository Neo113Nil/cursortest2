package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.verification.base.states.BaseCodeState;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vkontakte.android.R;

/* compiled from: WhiteLabelFlowController.kt */
/* loaded from: classes15.dex */
public final class ykx0 {
    public final View a;
    public final gzs<s3q0> b;
    public final TextView c;
    public final ConstraintLayout d;
    public boolean e;

    public ykx0(View view, gzs<s3q0> gzsVar) {
        this.a = view;
        this.b = gzsVar;
        TextView textView = (TextView) view.findViewById(R.id.white_label_flow_change_number);
        this.c = textView;
        if (textView != null) {
            jjc.g(textView, new kyq0(this, 17));
        }
        this.d = (ConstraintLayout) view.findViewById(R.id.base_check_container);
    }

    public final void a(BaseCodeState baseCodeState) {
        boolean z = baseCodeState instanceof CodeState.CallResetPreview;
        ConstraintLayout constraintLayout = this.d;
        if (z) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            bVar.k(R.id.white_label_flow_change_number, 3, R.id.first_subtitle, 4);
            bVar.F(0.5f, R.id.white_label_flow_change_number);
            bVar.b(constraintLayout);
        } else if (!(baseCodeState instanceof CodeState.NotReceive)) {
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            bVar2.i(constraintLayout);
            bVar2.k(R.id.white_label_flow_change_number, 3, R.id.code_container, 4);
            if (baseCodeState instanceof MethodSelectorCodeState) {
                bVar2.F(0.5f, R.id.white_label_flow_change_number);
            } else {
                bVar2.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.id.white_label_flow_change_number);
            }
            bVar2.b(constraintLayout);
        }
        boolean z2 = baseCodeState instanceof MethodSelectorCodeState.Sms;
        TextView textView = this.c;
        if (!z2 && !(baseCodeState instanceof MethodSelectorCodeState.CallReset) && !(baseCodeState instanceof MethodSelectorCodeState.Push) && !(baseCodeState instanceof CodeState.SmsWait) && !(baseCodeState instanceof CodeState.CallResetWait) && !(baseCodeState instanceof CodeState.PushWait) && !z) {
            if ((baseCodeState instanceof CodeState.NotReceive) || textView == null) {
                return;
            }
            f4m.j(textView);
            return;
        }
        if (this.e) {
            if (textView != null) {
                f4m.j(textView);
            }
        } else if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
