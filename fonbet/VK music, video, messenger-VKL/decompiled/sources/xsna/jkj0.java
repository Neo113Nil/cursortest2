package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.dto.video.VideoListWithTotalCount;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jkj0 implements izs {
    public final /* synthetic */ kkj0 b;
    public final /* synthetic */ UIBlock c;
    public final /* synthetic */ CatalogConfiguration d;
    public final /* synthetic */ int e;

    public /* synthetic */ jkj0(kkj0 kkj0Var, UIBlock uIBlock, CatalogConfiguration catalogConfiguration, int i) {
        this.b = kkj0Var;
        this.c = uIBlock;
        this.d = catalogConfiguration;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) this.c;
        n4t0 n4t0Var = (n4t0) this.d;
        kkj0 kkj0Var = this.b;
        kkj0Var.getClass();
        kkj0Var.b(uIBlockVideoAlbum, n4t0Var, this.e, new VideoListWithTotalCount(EmptyList.b, 0, 0));
        return s3q0.a;
    }
}
