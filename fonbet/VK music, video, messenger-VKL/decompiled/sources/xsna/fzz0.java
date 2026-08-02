package xsna;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class fzz0 extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, olc olcVar, Object obj, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        dz9.b bVar2 = (dz9.b) obj;
        exc0.j(bVar2, "Setting the API options is required.");
        return new ms01(context, looper, olcVar, bVar2.b, 0, bVar2.d, bVar2.e, bVar, interfaceC0114c);
    }
}
