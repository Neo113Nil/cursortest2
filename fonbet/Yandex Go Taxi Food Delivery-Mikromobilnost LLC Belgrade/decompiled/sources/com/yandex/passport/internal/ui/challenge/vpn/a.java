package com.yandex.passport.internal.ui.challenge.vpn;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class a {
    public static Intent a(Context context, String str) {
        return new Intent(context, (Class<?>) VpnChallengeActivity.class).putExtra("vpn.challenge.url", str).addFlags(131072).addFlags(536870912);
    }

    public static boolean b() {
        boolean z;
        z = VpnChallengeActivity.isOpened;
        return z;
    }
}
