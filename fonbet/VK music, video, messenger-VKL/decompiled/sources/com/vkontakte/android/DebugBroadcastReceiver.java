package com.vkontakte.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.debug.ui.DebugTabsFragment;
import xsna.oz50;

/* loaded from: classes7.dex */
public class DebugBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent n = new oz50(DebugTabsFragment.class, null, null).n(context);
        n.addFlags(268435456);
        context.startActivity(n);
    }
}
