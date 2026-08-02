package xsna;

import android.widget.EditText;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.plw0;

/* compiled from: VoipCallsJoinToCallByPasswordModalDialog.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class alw0 extends FunctionReferenceImpl implements izs<plw0.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(plw0.d dVar) {
        plw0.d dVar2 = dVar;
        olw0 olw0Var = (olw0) this.receiver;
        EditText editText = olw0Var.f;
        dzp0.a(editText, dVar2.a, olw0Var.i);
        boolean z = dVar2.b;
        bwt0.p0(editText, z);
        olw0Var.e.setBackgroundResource(z ? R.drawable.voip_bg_field_background_corner8_icon_accent_stroke05 : R.drawable.voip_bg_field_background_corner8_field_border_alpha_stroke05);
        return s3q0.a;
    }
}
