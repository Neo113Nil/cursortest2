package xsna;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.core.view.TargetSendActionView;
import kotlin.NoWhenBranchMatchedException;
import xsna.nii0;
import xsna.sii0;
import xsna.uii0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fod0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ fod0(Object obj, KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = obj;
        this.d = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                god0 god0Var = (god0) this.c;
                god0Var.a.d((FragmentActivity) this.d);
                return;
            default:
                sii0.a aVar = (sii0.a) this.c;
                TargetSendActionView targetSendActionView = (TargetSendActionView) this.d;
                uii0.b bVar = aVar.q;
                izs<nii0, s3q0> izsVar = aVar.l;
                if (bVar == null) {
                    return;
                }
                UserId userId = bVar.b.a;
                int i = sii0.a.C3668a.$EnumSwitchMapping$0[targetSendActionView.getCurrentState().ordinal()];
                if (i == 1) {
                    izsVar.invoke(new nii0.i(userId.b, TargetSendActionView.State.CANCEL));
                    return;
                } else if (i == 2) {
                    izsVar.invoke(new nii0.g(userId.b));
                    return;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(new nii0.i(userId.b, TargetSendActionView.State.SEND));
                    return;
                }
        }
    }
}
