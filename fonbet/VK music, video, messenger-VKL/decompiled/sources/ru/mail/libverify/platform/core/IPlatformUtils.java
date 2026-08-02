package ru.mail.libverify.platform.core;

import android.content.BroadcastReceiver;
import android.content.Context;

/* compiled from: IPlatformUtils.kt */
/* loaded from: classes11.dex */
public interface IPlatformUtils {
    boolean checkGooglePlayServicesNewer(Context context);

    <T extends BroadcastReceiver> void disableReceiver(Context context, Class<T> cls);

    <T extends BroadcastReceiver> void enableReceiver(Context context, Class<T> cls);

    boolean hasGooglePlayServices(Context context);
}
