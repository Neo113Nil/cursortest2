package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.dto.common.id.UserId;

/* compiled from: SearchAllGamesCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class wmh0 extends smh0 {
    public final k140 M;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wmh0(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        this.M = new k140(new bws(18));
    }

    @Override // xsna.smh0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.M.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }
}
