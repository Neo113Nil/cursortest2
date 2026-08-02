package xsna;

import com.vkontakte.android.R;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a2j0 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a2j0(SharedPeerConnectionFactory sharedPeerConnectionFactory, boolean z) {
        this.d = sharedPeerConnectionFactory;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) this.d;
                if (!this.c) {
                    cvk.u(R.string.sett_no_proxy, false);
                }
                u1u0.b(cVar);
                break;
            default:
                ((SharedPeerConnectionFactory) this.d).c(this.c);
                break;
        }
    }

    public /* synthetic */ a2j0(boolean z, com.vk.core.view.components.spinner.c cVar) {
        this.c = z;
        this.d = cVar;
    }
}
