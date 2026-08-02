package defpackage;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class jlo implements ji11 {
    public static final jlo c = new jlo(false, 0 == true ? 1 : 0);
    public final boolean a;
    public final int b;

    public /* synthetic */ jlo(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.ji11
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.a);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.b);
        return bundle;
    }
}
