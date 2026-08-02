package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.B5;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes12.dex */
public final class smz0 extends com.google.android.gms.internal.base.zar {
    public final Context a;
    public final /* synthetic */ GoogleApiAvailability b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smz0(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = googleApiAvailability;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.b;
        Context context = this.a;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        AtomicBoolean atomicBoolean = fau.a;
        if (isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 2 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9) {
            Intent b = googleApiAvailability.b(context, isGooglePlayServicesAvailable, B5.q);
            googleApiAvailability.h(context, new ConnectionResult(isGooglePlayServicesAvailable, b == null ? null : wu90.a(context, b)));
        }
    }
}
