package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;

/* compiled from: SandboxCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class t0h0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0h0(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return rsg0.y0(new f6a(new wba()), null, null, 3);
    }
}
