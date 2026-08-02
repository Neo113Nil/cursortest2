package xsna;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class poz0 extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final a.f buildClient(Context context, Looper looper, olc olcVar, Object obj, x3j x3jVar, i380 i380Var) {
        return new iqz0(context, looper, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, olcVar, x3jVar, i380Var);
    }
}
