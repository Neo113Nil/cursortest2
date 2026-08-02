package xsna;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class n101 extends a.AbstractC0111a<com.google.android.gms.internal.tapandpay.zzh, a.d.InterfaceC0113d> {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ com.google.android.gms.internal.tapandpay.zzh buildClient(Context context, Looper looper, olc olcVar, a.d.InterfaceC0113d interfaceC0113d, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        return new com.google.android.gms.internal.tapandpay.zzh(context, looper, bVar, interfaceC0114c, olcVar);
    }
}
