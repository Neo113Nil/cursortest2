package xsna;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.rax0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class exz0 extends a.AbstractC0111a<com.google.android.gms.internal.wallet.zzv, rax0.a> {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ com.google.android.gms.internal.wallet.zzv buildClient(Context context, Looper looper, olc olcVar, rax0.a aVar, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        rax0.a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = new rax0.a();
        }
        return new com.google.android.gms.internal.wallet.zzv(context, looper, olcVar, bVar, interfaceC0114c, aVar2.b, aVar2.c, aVar2.d);
    }
}
