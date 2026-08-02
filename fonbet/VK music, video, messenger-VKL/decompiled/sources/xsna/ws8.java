package xsna;

import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws8 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ws8(boolean z) {
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        switch (i) {
            case 0:
                int i2 = BuyMusicSubscriptionButton.z;
                ryw rywVar = k840.a.b;
                if (rywVar == null) {
                    rywVar = null;
                }
                return (ys8) rywVar.invoke(Boolean.valueOf(z));
            default:
                ((zak0) vsx.a).setValue(Boolean.valueOf(!z));
                boolean a = vsx.a();
                bqi.a = a;
                if (bqi.b.isInitialized()) {
                    bqi.a().setValue(Boolean.valueOf(a));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ws8(boolean z, r3m r3mVar) {
        this.c = z;
    }
}
