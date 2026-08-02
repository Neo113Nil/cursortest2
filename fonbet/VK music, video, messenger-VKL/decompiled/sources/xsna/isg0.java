package xsna;

import com.vk.device.store.AppStore;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class isg0 implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ isg0(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(dy2.i(AppStore.RUSTORE.j()));
            default:
                return com.vk.contacts.d.a.K0(true).get();
        }
    }
}
