package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import xsna.ddw0;
import xsna.t0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ufu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ufu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                break;
            case 1:
                ggu0 ggu0Var = (ggu0) obj;
                BrowserPerfState browserPerfState = ggu0Var.B;
                if (browserPerfState != null) {
                    WebApiApplication v = ggu0Var.e.v();
                    browserPerfState.h = v != null ? v.D : null;
                }
                BrowserPerfState browserPerfState2 = ggu0Var.B;
                if (browserPerfState2 != null) {
                    browserPerfState2.i = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
                }
                break;
            case 2:
                break;
            case 3:
                equ0 equ0Var = (equ0) obj;
                Context context = equ0Var.m;
                break;
            case 4:
                isv0 isv0Var = (isv0) obj;
                break;
            case 5:
                ((VkTopBarSearchQueryVh) obj).e.d();
                break;
            case 6:
                ((bdw0) obj).h.b(ddw0.a.a);
                break;
            case 7:
                ((zhw0) obj).b0(true);
                break;
            case 8:
                int i2 = VoipCallServiceFragment.Y;
                mhy.b(((VoipCallServiceFragment) obj).requireContext());
                break;
            default:
                ((w0x0) obj).C(t0x0.a.b);
                break;
        }
        return s3q0.a;
    }
}
