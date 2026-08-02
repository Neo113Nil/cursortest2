package xsna;

import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import xsna.ky6;

/* compiled from: ContactSyncColdStartPromo.kt */
/* loaded from: classes17.dex */
public final class z9j implements gzs<s3q0> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x9j c;
    public final /* synthetic */ PromoSessionInfo d;

    public z9j(boolean z, x9j x9jVar, PromoSessionInfo promoSessionInfo) {
        this.b = z;
        this.c = x9jVar;
        this.d = promoSessionInfo;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (this.b) {
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.remove("__contact_sync_share_modal_dismissed__");
            aVar.a();
        } else {
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.remove("__contact_sync_perm_modal_dismissed__");
            aVar2.a();
        }
        this.c.b.a(this.d);
        return s3q0.a;
    }
}
