package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.log.L;
import com.vk.security.proxy.ProxySecurityActivity;

/* compiled from: SecurePendingIntent.kt */
/* loaded from: classes5.dex */
public final class t2i0 {
    public static final PendingIntent a(final Context context, final int i, final Intent intent, final int i2) {
        return c(intent, context, false, new izs() { // from class: xsna.s2i0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i3 = i2;
                boolean z = (33554432 & i3) != 0;
                int i4 = Build.VERSION.SDK_INT;
                Intent intent2 = intent;
                if (i4 >= 34 && nax.a(intent2) && z) {
                    i3 |= C.DEFAULT_MUXED_BUFFER_SIZE;
                }
                return PendingIntent.getActivity(context, i, intent2, i3, null);
            }
        });
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return c(intent, context, false, new r2i0(context, i, intent, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if ("huawei".equalsIgnoreCase(r5) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PendingIntent c(Intent intent, Context context, boolean z, izs izsVar) {
        if (intent.getComponent() == null && !z) {
            int i = ProxySecurityActivity.b;
            Intent intent2 = new Intent(context, (Class<?>) ProxySecurityActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtra("EXTRA_PROXY_INTENT", intent);
            Uri data = intent.getData();
            if (data != null && epx.f(data.getScheme(), X3.i.b)) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Illegal file path in intent [" + intent.toUri(0) + ']'));
            }
            intent = intent2;
        }
        try {
            try {
                PendingIntent pendingIntent = (PendingIntent) izsVar.invoke(intent);
                return pendingIntent == null ? (PendingIntent) izsVar.invoke(intent.addFlags(268435456)) : pendingIntent;
            } catch (NullPointerException e) {
                L.i(e);
                return (PendingIntent) izsVar.invoke(intent.addFlags(268435456));
            }
        } catch (SecurityException e2) {
            L.i(e2);
            if (!t5m.b()) {
                String str = Build.MANUFACTURER;
                if (!"vivo".equalsIgnoreCase(str)) {
                }
            }
            if (gz80.a(30)) {
                return null;
            }
            throw e2;
        }
    }
}
