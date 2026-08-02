package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pq60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ pq60(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (!(th instanceof VKApiExecutionException)) {
                    cvk.u(R.string.live_network_error_description, false);
                    break;
                } else {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                    break;
                }
            case 1:
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
    }
}
