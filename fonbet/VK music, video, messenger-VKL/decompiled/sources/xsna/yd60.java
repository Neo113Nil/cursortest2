package xsna;

import com.vk.voip.ui.members.VoipDataProvider;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yd60 implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ yd60(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return o25.a().c();
            default:
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                return voipDataProvider.d(false);
        }
    }
}
