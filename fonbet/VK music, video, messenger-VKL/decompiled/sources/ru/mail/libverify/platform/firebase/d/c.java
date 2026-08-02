package ru.mail.libverify.platform.firebase.d;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import xsna.mmg;

/* loaded from: classes9.dex */
public final class c {
    public static boolean a(Context context) {
        int isGooglePlayServicesAvailable;
        try {
            FirebaseCoreService.Companion.getClass();
            ILog a = FirebaseCoreService.a.a();
            isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            a.d("Utils", "play services api availability: " + mmg.a(isGooglePlayServicesAvailable));
        } catch (Throwable unused) {
        }
        return isGooglePlayServicesAvailable == 0;
    }
}
