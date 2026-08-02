package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.HashMap;

/* compiled from: MusicCatalogTapsAnalyticHandler.kt */
/* loaded from: classes16.dex */
public final class yd40 implements wd40 {
    public final w950 a;
    public final gzs<String> b;
    public final xd40 c = new xd40(this, 0);
    public final HashMap<CatalogDataType, ud40> d = new HashMap<>();

    /* compiled from: MusicCatalogTapsAnalyticHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yd40(w950 w950Var, gzs<String> gzsVar) {
        this.a = w950Var;
        this.b = gzsVar;
    }

    @Override // xsna.wd40
    public final void a(UIBlock uIBlock, Object obj) {
        CatalogDataType catalogDataType = uIBlock.e;
        HashMap<CatalogDataType, ud40> hashMap = this.d;
        ud40 ud40Var = hashMap.get(catalogDataType);
        if (ud40Var == null) {
            ud40Var = (ud40) this.c.invoke(catalogDataType);
            if (ud40Var == null) {
                return;
            } else {
                hashMap.put(catalogDataType, ud40Var);
            }
        }
        ud40Var.a(uIBlock, obj);
    }
}
