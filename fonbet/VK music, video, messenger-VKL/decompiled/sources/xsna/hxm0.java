package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoDataByRefResponseDto;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.irt0;
import xsna.l5v0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hxm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ hxm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 1:
                byte[] bArr = (byte[]) obj;
                return bArr.length == 0 ? "" : new String(bArr, emb.b);
            case 2:
                return ((Boolean) obj).booleanValue() ? TextValidationState.SUCCESS : TextValidationState.ERROR;
            case 3:
                return ((MusicTrack) obj).Jb();
            case 4:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.m0);
            case 5:
                return s3q0.a;
            case 6:
                return Integer.valueOf((int) ((Long) obj).longValue());
            case 7:
                ass assVar = (ass) obj;
                return new UsersDiscoverPresenter.a(null, null, true, assVar.a, assVar.b, 3);
            case 8:
                String str = (String) j5g.k0(drm0.c0((String) obj, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                if (str != null) {
                    return Integer.valueOf(Integer.parseInt(str));
                }
                return null;
            case 9:
                ArrayList<UIBlock> arrayList = ((oyp0) obj).a.y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof UIBlockPlaceholder) {
                        arrayList2.add(obj2);
                    }
                }
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) j5g.a0(arrayList2);
                boolean z = uIBlockPlaceholder != null;
                CatalogViewStyle catalogViewStyle = uIBlockPlaceholder != null ? uIBlockPlaceholder.l : null;
                PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
                return new Pair(Boolean.valueOf(z), Boolean.valueOf((placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null) == PlaceholderCatalogViewStyle.Style.Elongate));
            case 10:
                return Boolean.valueOf(!((irt0.a) obj).b);
            case 11:
                return new tfu(n34.a(3));
            case 12:
                return s3q0.a;
            case 13:
                return new l5v0.a.c((ers) obj);
            case 14:
                Coordinates coordinates = ((VkMapsGeoDataByRefResponseDto) obj).d() != null ? new Coordinates(r8.get(1).floatValue(), r8.get(0).floatValue()) : null;
                it80.b.getClass();
                return new it80(coordinates);
            default:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "dalvik.system", false));
        }
    }
}
