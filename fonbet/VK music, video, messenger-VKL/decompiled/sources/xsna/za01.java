package xsna;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.auth.zzam;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class za01 extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, olc olcVar, Object obj, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        return new zzam(context, looper, olcVar, bVar, interfaceC0114c);
    }
}
