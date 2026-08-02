package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h2a implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h2a(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                CatalogBlockVariant.a aVar = CatalogBlockVariant.Companion;
                List<CatalogButtonDto> e = ((CatalogBlockDto) obj).e();
                if (e != null) {
                    List<CatalogButtonDto> list = e;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            BaseLinkButtonActionDto d = ((CatalogButtonDto) it.next()).d();
                            if ((d != null ? d.C() : null) == BaseLinkButtonActionTypeDto.SAVE_AS_PLAYLIST) {
                            }
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                hzg0 hzg0Var = pjp.a;
                return Boolean.TRUE;
        }
    }
}
