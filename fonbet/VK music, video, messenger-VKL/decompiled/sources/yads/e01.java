package yads;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class e01 {
    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
