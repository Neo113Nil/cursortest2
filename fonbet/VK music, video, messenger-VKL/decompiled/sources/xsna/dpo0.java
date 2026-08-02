package xsna;

import android.content.Intent;
import com.vk.im.ui.components.theme_chooser.b;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import java.lang.ref.WeakReference;
import xsna.ihu0;
import xsna.q2t0;
import xsna.yau0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dpo0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dpo0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.pix0, xsna.tb0] */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        WeakReference weakReference;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b.C1156b) obj2).invoke(obj);
                break;
            case 1:
                ((sub) obj2).invoke(obj);
                break;
            case 2:
                ((ozk0) obj2).invoke(obj);
                break;
            case 3:
                ((t50) obj2).invoke(obj);
                break;
            case 4:
                ((q2t0.a) obj2).invoke(obj);
                break;
            case 5:
                ((k22) obj2).invoke(obj);
                break;
            case 6:
                ((yau0.d.b) obj2).invoke(obj);
                break;
            case 7:
                ((ihu0.b) obj2).invoke(obj);
                break;
            case 8:
                ((efr0) obj2).invoke(obj);
                break;
            case 9:
                ((efr0) obj2).invoke(obj);
                break;
            case 10:
                int i2 = VoipCallServiceFragment.Y;
                ((VoipCallServiceFragment.d) obj2).invoke(obj);
                break;
            case 11:
                final WebViewFragment webViewFragment = (WebViewFragment) obj2;
                mge0 mge0Var = (mge0) obj;
                int i3 = WebViewFragment.O0;
                ?? r0 = new tb0() { // from class: xsna.pix0
                    @Override // xsna.tb0
                    public final void onActivityResult(int i4, int i5, Intent intent) {
                        qge0<mge0> qge0Var = WebViewFragment.this.M0;
                        if (qge0Var != null) {
                            qge0Var.i(i4, i5);
                        }
                    }
                };
                if (webViewFragment.getActivity() instanceof aeg0) {
                    aeg0 aeg0Var = (aeg0) webViewFragment.getActivity();
                    aeg0Var.Li(r0);
                    weakReference = new WeakReference(aeg0Var);
                } else {
                    weakReference = new WeakReference(null);
                }
                webViewFragment.M0 = webViewFragment.L0.d(webViewFragment.getActivity(), new uix0(webViewFragment, weakReference, r0), mge0Var);
                break;
            default:
                ((efr0) obj2).invoke(obj);
                break;
        }
    }
}
