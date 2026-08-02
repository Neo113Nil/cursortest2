package defpackage;

import java.util.Collections;

/* loaded from: classes15.dex */
public final class h7g0 implements v7p {
    public static ifg0 a() {
        try {
            return new kfg0();
        } catch (Exception e) {
            x4c.g("No QrScannerViewFactory provided", e, null, Collections.singletonList(lrp0.w), 4);
            return new vuz();
        }
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return a();
    }
}
