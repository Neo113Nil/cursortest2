package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.dto.common.id.UserId;

/* compiled from: SearchCommunitiesOnMapCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class wnh0 extends smh0 {

    /* compiled from: SearchCommunitiesOnMapCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wnh0(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
    }

    @Override // xsna.smh0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new vmh0(true) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }
}
