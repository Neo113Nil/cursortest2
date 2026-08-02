package xsna;

import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.voip.ui.qr.ui.a;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.giw0;
import xsna.pxw0;
import xsna.q5x0;
import xsna.t5x0;
import xsna.taw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hfv0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hfv0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        q5x0.a aVar;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ymf0 ymf0Var = (ymf0) obj2;
                Reef reef = (Reef) obj;
                if (reef != null) {
                    reef.a(new ReefEvent.c(ymf0Var));
                }
                return s3q0.a;
            case 1:
                qgi0.s((tgi0) obj, ((exm0) obj2).a);
                return s3q0.a;
            case 2:
                ((qaw0) obj2).T(new taw0.b.a((Throwable) obj));
                return s3q0.a;
            case 3:
                ((lcw0) obj2).c.invoke();
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((zhw0) obj2).T(new giw0.b(th));
                return s3q0.a;
            case 5:
                int i2 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).fo((a.b) obj);
                return s3q0.a;
            case 6:
                ((qxw0) obj2).a(new pxw0.h(((Date) obj).getTime()));
                return s3q0.a;
            case 7:
                VoipSelectEffectInCallFragment voipSelectEffectInCallFragment = (VoipSelectEffectInCallFragment) obj2;
                int i3 = VoipSelectEffectInCallFragment.Q;
                if (!((VoipViewModelState) obj).i()) {
                    voipSelectEffectInCallFragment.tn();
                }
                return s3q0.a;
            case 8:
                g6x0 g6x0Var = (g6x0) obj2;
                t5x0 t5x0Var = (t5x0) obj;
                if (t5x0Var instanceof t5x0.b) {
                    aVar = new q5x0.a(R.string.voip_configure_vmoji_unsupported_character);
                } else {
                    if (!(t5x0Var instanceof t5x0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new q5x0.a(R.string.voip_configure_vmoji_lib_not_ready);
                }
                g6x0Var.c.onNext(aVar);
                return s3q0.a;
            default:
                ((gwg) obj2).invoke((List) obj);
                return s3q0.a;
        }
    }
}
