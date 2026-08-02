package defpackage;

import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaFragment;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkFragment;

/* loaded from: classes3.dex */
public final class b570 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final byf c;

    public /* synthetic */ b570(n3w n3wVar, byf byfVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = byfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        byf byfVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new OpenEsiaFragment((o570) n3wVar.a, (pbo) byfVar.get());
            default:
                return new OpenEsiaSdkFragment((d570) n3wVar.a, (pbo) byfVar.get());
        }
    }
}
