package xsna;

import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import xsna.sx40;
import xsna.tj50;
import xsna.ypr0;
import xsna.z1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class awm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ awm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 1:
                return xh2.c(anp.e(jq2.d(200, 0, null, 6), 2), anp.f(jq2.d(200, 0, null, 6), 2));
            case 2:
                return new m5n0((ViewGroup) obj);
            case 3:
                ((AppBarLayout) obj).g(true, true, true);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.e);
            case 5:
                tj50.a aVar = (tj50.a) obj;
                rpr0 rpr0Var = rpr0.b;
                ao8 ao8Var = ao8.d;
                return new ypr0.a(aVar.a(rpr0Var, ao8Var), aVar.a(spr0.b, ao8Var));
            case 6:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock == null || !(uIBlock instanceof UIBlockList)) {
                    return null;
                }
                UIBlock uIBlock2 = (UIBlock) j5g.a0(((UIBlockList) uIBlock).y);
                if ((uIBlock2 != null ? uIBlock2.e : null) == CatalogDataType.DATA_SYNTHETIC_SECTION && uIBlock2.d == CatalogViewType.SLIDER) {
                    return Integer.valueOf(VideoCatalogRootVh.M0);
                }
                return null;
            case 7:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).t;
            case 8:
                return s3q0.a;
            case 9:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            default:
                return ((z1x0.a) obj).b;
        }
    }
}
