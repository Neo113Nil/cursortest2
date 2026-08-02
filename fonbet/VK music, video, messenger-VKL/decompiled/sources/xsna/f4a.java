package xsna;

import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;

/* compiled from: CatalogDelegate.kt */
/* loaded from: classes6.dex */
public final class f4a {
    public static final void a(vcb0 vcb0Var, PlaylistScreenData playlistScreenData) {
        CatalogSectionStateFlow catalogSectionStateFlow = playlistScreenData.c;
        catalogSectionStateFlow.c = vcb0Var.g.b(new CatalogSectionParams(((CatalogSectionState) catalogSectionStateFlow.b.getValue()).c, false, true, true, false, vcb0Var.c), vcb0Var.h, new ey0(playlistScreenData, 9));
    }
}
