package xsna;

import com.vk.log.L;
import com.vkontakte.android.NetworkStateReceiver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s560 implements io.reactivex.rxjava3.functions.f {
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = NetworkStateReceiver.a().c;
        try {
            Thread.sleep(NetworkStateReceiver.f[5 - i]);
        } catch (Exception e) {
            L.i(e);
        }
        int i2 = i - 1;
        if (i2 > 0) {
            NetworkStateReceiver.d(false);
        } else {
            i2 = 5;
        }
        NetworkStateReceiver.a().c = i2;
    }
}
