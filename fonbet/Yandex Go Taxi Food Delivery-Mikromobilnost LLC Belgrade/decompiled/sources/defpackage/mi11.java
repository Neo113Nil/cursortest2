package defpackage;

import android.os.Bundle;
import android.support.customtabs.trusted.ITrustedWebActivityService;

/* loaded from: classes10.dex */
public final class mi11 {
    public final ITrustedWebActivityService a;

    public mi11(ITrustedWebActivityService iTrustedWebActivityService) {
        this.a = iTrustedWebActivityService;
    }

    public static void a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        ny61.g("Bundle must contain ".concat(str));
    }
}
