package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import xsna.b9s0;
import xsna.vha;

/* compiled from: SearchVideoCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class ozh0 extends b9s0 {
    public final k140 t0;
    public final VideoAutoPlayDelayType u0;

    /* compiled from: SearchVideoCatalogConfiguration.kt */
    public static final class a extends z160 {
        @Override // xsna.vha
        public final c2q0 o(RecyclerView recyclerView) {
            return new vha.a(this, recyclerView, null, new q5u0(0.8f, 0.8f), 4);
        }
    }

    public ozh0(Bundle bundle, b9s0.a aVar) {
        super(bundle, aVar);
        this.t0 = new k140(new v4v(29));
        this.u0 = VideoAutoPlayDelayType.SEARCH_VIDEO;
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.t0.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return this.u0;
    }
}
