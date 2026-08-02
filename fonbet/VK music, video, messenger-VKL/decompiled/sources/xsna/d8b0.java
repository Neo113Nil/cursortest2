package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;

/* compiled from: PlaylistComposeCatalogConfiguration.kt */
/* loaded from: classes3.dex */
public abstract class d8b0 implements epi {

    /* compiled from: PlaylistComposeCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.epi
    public final void a(Object obj, androidx.compose.runtime.a aVar) {
        aVar.K(-996431897);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-996431897, 0, -1, "com.vk.music.playlist.framework.presentation.catalog.PlaylistComposeCatalogConfiguration.ComponentForUiBlock (PlaylistComposeCatalogConfiguration.kt:15)");
        }
        int i = a.$EnumSwitchMapping$0[((UIBlock) obj).e.ordinal()];
        if (i == 1) {
            aVar.K(2111487281);
            UIBlockList uIBlockList = obj instanceof UIBlockList ? (UIBlockList) obj : null;
            if (uIBlockList == null) {
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return;
            }
            if (uIBlockList.y.isEmpty()) {
                aVar.K(2110746939);
            } else {
                aVar.K(2111604089);
                sfv.a(uIBlockList, aVar, 0);
            }
            aVar.j();
            aVar.j();
        } else if (i == 2) {
            aVar.K(2111775395);
            UIBlockMusicPlaylist uIBlockMusicPlaylist = obj instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) obj : null;
            if (uIBlockMusicPlaylist == null) {
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return;
            }
            x050.a(uIBlockMusicPlaylist, null, aVar, 0);
            aVar.j();
        } else if (i != 3) {
            aVar.K(2112221113);
            aVar.j();
        } else {
            aVar.K(2112030122);
            UIBlockPlaceholder uIBlockPlaceholder = obj instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) obj : null;
            if (uIBlockPlaceholder == null) {
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return;
            }
            f3k0.a(uIBlockPlaceholder, aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
