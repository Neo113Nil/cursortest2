package xsna;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoAlbumCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import kotlin.Pair;

/* compiled from: CatalogRecyclerHorizontalOffsetsItemDecorator.kt */
/* loaded from: classes16.dex */
public class pca extends RecyclerView.n {
    public static final int e = iah0.a(1);
    public static final int f = iah0.a(2);
    public static final int g = iah0.a(4);
    public static final int h = iah0.a(6);
    public static final int i = iah0.a(8);
    public static final int j = iah0.a(10);
    public static final int k = iah0.a(12);
    public static final int l = iah0.a(18);
    public static final int m = iah0.a(28);
    public static final int n = iah0.a(16);
    public static final int o = iah0.a(20);
    public static final int p = iah0.a(32);
    public Boolean b;
    public jpf c;
    public final b4a d = new b4a();

    /* compiled from: CatalogRecyclerHorizontalOffsetsItemDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SLIDER_INFINITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_INFINITE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.SLIDER_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD_INFINITE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_CHIP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.MUSIC_EXCLUSIVE_SLIDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.SHOWCASE_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.FLOOR_CLIPS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.PODCAST_EXTENDED_SLIDER.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogViewType.AUDIO_CONTENT_CARD_EXTENDED_SLIDER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogViewType.VIDEO_SLIDER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LARGE_SLIDER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogViewType.CROP_SLIDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogViewType.STICKERS_SLIDER_ONLY_PRICE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogViewType.STICKERS_LARGE_SLIDER_ONLY_PRICE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogViewType.LIST_STICKERS_PREVIEW.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogViewType.CAROUSEL_CLIPS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogViewType.SEARCH_CAROUSEL_CLIPS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX_BLURRED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogViewType.ARTISTS_SLIDER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LONGREADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 6;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUP_BANNERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 12;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 13;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS.ordinal()] = 14;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS.ordinal()] = 15;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 16;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 17;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 18;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_RADIO_STATIONS.ordinal()] = 19;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 21;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS.ordinal()] = 22;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 23;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_FILTERS.ordinal()] = 24;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 26;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 27;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MOVIES.ordinal()] = 28;
            } catch (NoSuchFieldError unused67) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static Pair l(CatalogViewType catalogViewType, CatalogDataType catalogDataType, boolean z, boolean z2, boolean z3) {
        if (catalogViewType != null && catalogViewType.m()) {
            return m(catalogDataType, z, z2, z3);
        }
        int i2 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i2 != 1 && i2 != 4) {
            int i3 = k;
            if (i2 == 19) {
                return new Pair(Integer.valueOf(i3), 0);
            }
            if (i2 != 23) {
                switch (i2) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        break;
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        break;
                    case 38:
                    case 39:
                        int i4 = h;
                        int i5 = z ? i3 : i4;
                        if (!z2) {
                            i3 = i4;
                        }
                        return new Pair(Integer.valueOf(i5), Integer.valueOf(i3));
                    default:
                        return new Pair(0, 0);
                }
            }
            int i6 = g;
            int i7 = p;
            int i8 = z ? z3 ? i7 : i3 : i6;
            if (!z2) {
                i3 = i6;
            } else if (z3) {
                i3 = i7;
            }
            return new Pair(Integer.valueOf(i8), Integer.valueOf(i3));
        }
        return m(catalogDataType, z, z2, z3);
    }

    public static Pair m(CatalogDataType catalogDataType, boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = g;
        int i4 = j;
        int i5 = m;
        int i6 = z ? z3 ? i5 : i4 : catalogDataType == CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION ? i3 : 0;
        if (z2) {
            i2 = z3 ? i5 : i4;
        } else if (catalogDataType == CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION) {
            i2 = i3;
        }
        return new Pair(Integer.valueOf(i6), Integer.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x04f0, code lost:
    
        if (r1 == true) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b1, code lost:
    
        if (r14 != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x074f, code lost:
    
        if (r1 == true) goto L483;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:417:0x06f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:487:0x07ae. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        Boolean bool;
        boolean d;
        int i2;
        int i3;
        Rect rect2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int intValue;
        int intValue2;
        int i14;
        boolean z4;
        int i15;
        int i16;
        int i17;
        int i18;
        UIBlockList uIBlockList;
        int i19;
        int i20;
        UIBlockList uIBlockList2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.d.getClass();
        UIBlock b = b4a.b(childAdapterPosition, adapter);
        CatalogViewType catalogViewType = b != null ? b.d : null;
        CatalogDataType catalogDataType = b != null ? b.e : null;
        int c = b4a.c(recyclerView.getAdapter());
        CatalogViewStyle catalogViewStyle = b != null ? b.l : null;
        boolean z5 = childAdapterPosition == 0;
        int i21 = c - 1;
        if (childAdapterPosition == i21) {
            jpf jpfVar = this.c;
            if (((jpfVar == null || (uIBlockList2 = (UIBlockList) jpfVar.invoke()) == null) ? null : uIBlockList2.A) == null) {
                z = true;
                bool = this.b;
                if (bool == null) {
                    d = bool.booleanValue();
                } else {
                    d = fnj.d(view.getContext());
                    this.b = Boolean.valueOf(d);
                }
                i2 = catalogDataType != null ? -1 : a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
                int i22 = o;
                int i23 = i;
                int i24 = j;
                int i25 = m;
                int i26 = g;
                int i27 = k;
                int i28 = h;
                int i29 = n;
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        switch (catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                i3 = z5 ? i29 : i28;
                                if (z) {
                                    i28 = i29;
                                }
                                s3q0 s3q0Var = s3q0.a;
                                rect2 = rect;
                                i4 = i3;
                                i24 = i28;
                                i5 = 0;
                                i9 = 0;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                s3q0 s3q0Var2 = s3q0.a;
                                rect2 = rect;
                                i24 = i28;
                                i4 = i24;
                                i5 = 0;
                                i9 = 0;
                                break;
                            case 9:
                                int i30 = z5 ? i29 : i26;
                                if (z) {
                                    i26 = i29;
                                }
                                s3q0 s3q0Var3 = s3q0.a;
                                rect2 = rect;
                                i4 = i30;
                                i24 = i26;
                                i5 = i27;
                                i9 = 0;
                                break;
                            default:
                                s3q0 s3q0Var4 = s3q0.a;
                                rect2 = rect;
                                i5 = 0;
                                i9 = 0;
                                i24 = 0;
                                i4 = 0;
                                break;
                        }
                    case 9:
                        int i31 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i31 != 1) {
                            switch (i31) {
                                case 10:
                                    i7 = z5 ? i27 : 0;
                                    if (!z) {
                                        i27 = 0;
                                    }
                                    s3q0 s3q0Var5 = s3q0.a;
                                    rect2 = rect;
                                    i4 = i7;
                                    i24 = i27;
                                    i5 = 0;
                                    i9 = 0;
                                    break;
                                case 11:
                                    VideoCatalogViewStyle videoCatalogViewStyle = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
                                    if (videoCatalogViewStyle != null) {
                                        if (videoCatalogViewStyle.b == VideoCatalogViewStyle.Style.AuthorVideos) {
                                            z2 = true;
                                            if (z2) {
                                                if (videoCatalogViewStyle != null) {
                                                    if (videoCatalogViewStyle.b != VideoCatalogViewStyle.Style.AuthorsCircle) {
                                                        z3 = false;
                                                        break;
                                                    } else {
                                                        z3 = true;
                                                        break;
                                                    }
                                                }
                                                r10 = false;
                                                if (!r10) {
                                                    if (z5) {
                                                        i23 = i29;
                                                    }
                                                    i8 = i23;
                                                    i9 = 0;
                                                    if (!z) {
                                                        i29 = 0;
                                                    }
                                                    s3q0 s3q0Var6 = s3q0.a;
                                                    rect2 = rect;
                                                    i4 = i8;
                                                    i24 = i29;
                                                } else if (d) {
                                                    i8 = z5 ? i25 : 0;
                                                    if (!z) {
                                                        i25 = 0;
                                                    }
                                                    i29 = i25;
                                                    i9 = 0;
                                                    s3q0 s3q0Var62 = s3q0.a;
                                                    rect2 = rect;
                                                    i4 = i8;
                                                    i24 = i29;
                                                } else {
                                                    i8 = z5 ? i27 : 0;
                                                    if (!z) {
                                                        i27 = 0;
                                                    }
                                                    i29 = i27;
                                                    i9 = 0;
                                                    s3q0 s3q0Var622 = s3q0.a;
                                                    rect2 = rect;
                                                    i4 = i8;
                                                    i24 = i29;
                                                }
                                            } else {
                                                i8 = z5 ? i27 : i28;
                                                if (!z) {
                                                    i27 = i28;
                                                }
                                                if (!d) {
                                                    i9 = i29;
                                                    i29 = i27;
                                                    s3q0 s3q0Var6222 = s3q0.a;
                                                    rect2 = rect;
                                                    i4 = i8;
                                                    i24 = i29;
                                                }
                                                i29 = i27;
                                                i9 = 0;
                                                s3q0 s3q0Var62222 = s3q0.a;
                                                rect2 = rect;
                                                i4 = i8;
                                                i24 = i29;
                                            }
                                            i5 = 0;
                                            break;
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                    }
                                    i5 = 0;
                                case 12:
                                    if (z5) {
                                        i23 = i29;
                                    }
                                    if (!z) {
                                        i29 = 0;
                                    }
                                    s3q0 s3q0Var7 = s3q0.a;
                                    rect2 = rect;
                                    i4 = i23;
                                    i24 = i29;
                                    i5 = 0;
                                    i9 = 0;
                                    break;
                                default:
                                    s3q0 s3q0Var8 = s3q0.a;
                                    rect2 = rect;
                                    i5 = 0;
                                    i9 = 0;
                                    i24 = 0;
                                    i4 = 0;
                                    break;
                            }
                        } else {
                            i6 = z5 ? i24 : 0;
                            if (!z) {
                                i24 = 0;
                            }
                            s3q0 s3q0Var9 = s3q0.a;
                            rect2 = rect;
                            i4 = i6;
                            i5 = 0;
                            i9 = 0;
                        }
                    case 10:
                        int i32 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i32 == 12) {
                            i10 = z5 ? i27 : i26;
                            if (z) {
                                i26 = i27;
                            }
                            s3q0 s3q0Var10 = s3q0.a;
                            rect2 = rect;
                            i4 = i10;
                            i24 = i26;
                            i5 = 0;
                            i9 = 0;
                        } else if (i32 == 13) {
                            s3q0 s3q0Var11 = s3q0.a;
                            rect2 = rect;
                            i24 = i26;
                            i4 = i24;
                            i5 = 0;
                            i9 = 0;
                            break;
                        } else {
                            s3q0 s3q0Var12 = s3q0.a;
                            rect2 = rect;
                            i5 = 0;
                            i9 = 0;
                            i24 = 0;
                            i4 = 0;
                            break;
                        }
                    case 11:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) != 12) {
                            i7 = 0;
                        } else if (!z5) {
                            i7 = 0;
                            break;
                        } else {
                            i7 = i27;
                            break;
                        }
                        i27 = 0;
                        s3q0 s3q0Var13 = s3q0.a;
                        rect2 = rect;
                        i4 = i7;
                        i24 = i27;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 12:
                        int i33 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i33 == 4) {
                            i7 = z5 ? i27 : 0;
                            if (!z) {
                                i27 = 0;
                            }
                            s3q0 s3q0Var14 = s3q0.a;
                            rect2 = rect;
                            i4 = i7;
                            i24 = i27;
                            i5 = 0;
                            i9 = 0;
                        } else if (i33 == 9) {
                            i10 = z5 ? i29 : i26;
                            if (z) {
                                i26 = i29;
                            }
                            s3q0 s3q0Var15 = s3q0.a;
                            rect2 = rect;
                            i4 = i10;
                            i24 = i26;
                            i5 = 0;
                            i9 = 0;
                            break;
                        } else {
                            s3q0 s3q0Var16 = s3q0.a;
                            rect2 = rect;
                            i5 = 0;
                            i9 = 0;
                            i24 = 0;
                            i4 = 0;
                            break;
                        }
                    case 13:
                        int i34 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i34 != 1) {
                            if (i34 != 8) {
                                if (i34 != 14 && i34 != 4) {
                                    if (i34 != 5) {
                                        s3q0 s3q0Var17 = s3q0.a;
                                        rect2 = rect;
                                        i5 = 0;
                                        i9 = 0;
                                        i24 = 0;
                                        i4 = 0;
                                        break;
                                    }
                                }
                            }
                            s3q0 s3q0Var18 = s3q0.a;
                            rect2 = rect;
                            i24 = f;
                            i4 = i24;
                            i5 = 0;
                            i9 = 0;
                            break;
                        }
                        i6 = z5 ? i24 : 0;
                        if (!z) {
                            i24 = 0;
                        }
                        s3q0 s3q0Var19 = s3q0.a;
                        rect2 = rect;
                        i4 = i6;
                        i5 = 0;
                        i9 = 0;
                    case 14:
                        int i35 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i35 == 1) {
                            i11 = z5 ? 0 : -i24;
                            i12 = z ? 0 : -i24;
                            s3q0 s3q0Var20 = s3q0.a;
                            rect2 = rect;
                            i4 = i11;
                            i24 = i12;
                            i5 = 0;
                            i9 = 0;
                            break;
                        } else if (i35 == 4) {
                            i4 = z5 ? i29 : i28;
                            int i36 = z ? i29 : i28;
                            s3q0 s3q0Var21 = s3q0.a;
                            rect2 = rect;
                            i24 = i36;
                            i5 = i28;
                            i9 = i29;
                            break;
                        } else {
                            s3q0 s3q0Var22 = s3q0.a;
                            rect2 = rect;
                            i5 = 0;
                            i9 = 0;
                            i24 = 0;
                            i4 = 0;
                            break;
                        }
                    case 15:
                        int i37 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i37 == 1) {
                            i4 = z5 ? i29 : i26;
                            if (z) {
                                i26 = i29;
                            }
                            s3q0 s3q0Var23 = s3q0.a;
                            rect2 = rect;
                            i24 = i26;
                            i5 = i27;
                            i9 = i5;
                            break;
                        } else if (i37 == 15) {
                            int i38 = e;
                            int i39 = z5 ? i26 : i38;
                            if (!z) {
                                i26 = i38;
                            }
                            s3q0 s3q0Var24 = s3q0.a;
                            rect2 = rect;
                            i4 = i39;
                            i24 = i26;
                            i5 = 0;
                            i9 = 0;
                            break;
                        } else {
                            s3q0 s3q0Var25 = s3q0.a;
                            rect2 = rect;
                            i5 = 0;
                            i9 = 0;
                            i24 = 0;
                            i4 = 0;
                            break;
                        }
                    case 16:
                        int i40 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i40 != 1) {
                            if (i40 == 16) {
                                i6 = z5 ? d ? i25 : i24 : 0;
                                if (!z) {
                                    i24 = 0;
                                } else if (d) {
                                    i24 = i25;
                                }
                                s3q0 s3q0Var26 = s3q0.a;
                                rect2 = rect;
                                i4 = i6;
                                i5 = 0;
                                i9 = 0;
                            } else if (i40 != 17) {
                                Pair l2 = l(catalogViewType, catalogDataType, z5, z, d);
                                intValue = ((Number) l2.i()).intValue();
                                intValue2 = ((Number) l2.j()).intValue();
                                s3q0 s3q0Var27 = s3q0.a;
                                rect2 = rect;
                                i24 = intValue2;
                                i4 = intValue;
                                i5 = 0;
                                i9 = 0;
                                break;
                            }
                        }
                        i13 = z5 ? d ? i25 : i29 : i26;
                        if (!z) {
                            i25 = i26;
                        } else if (!d) {
                            i25 = i29;
                        }
                        s3q0 s3q0Var28 = s3q0.a;
                        rect2 = rect;
                        i4 = i13;
                        i24 = i25;
                        i5 = 0;
                        i9 = 0;
                    case 17:
                        int i41 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        if (i41 == 1) {
                            if (!z5) {
                                i25 = i28;
                            } else if (!d) {
                                i25 = i29;
                            }
                            if (z) {
                                i14 = iah0.a(d ? 22 : 10);
                            } else {
                                i14 = 0;
                            }
                            s3q0 s3q0Var29 = s3q0.a;
                            rect2 = rect;
                            i24 = i14;
                        } else if (i41 != 4) {
                            Pair l3 = l(catalogViewType, catalogDataType, z5, z, d);
                            intValue = ((Number) l3.i()).intValue();
                            intValue2 = ((Number) l3.j()).intValue();
                            s3q0 s3q0Var30 = s3q0.a;
                            rect2 = rect;
                            i24 = intValue2;
                            i4 = intValue;
                            i5 = 0;
                            i9 = 0;
                            break;
                        } else {
                            CatalogViewStyle catalogViewStyle2 = b.l;
                            VideoAlbumCatalogViewStyle videoAlbumCatalogViewStyle = catalogViewStyle2 instanceof VideoAlbumCatalogViewStyle ? (VideoAlbumCatalogViewStyle) catalogViewStyle2 : null;
                            if (videoAlbumCatalogViewStyle != null) {
                                if (videoAlbumCatalogViewStyle.b != VideoAlbumCatalogViewStyle.Style.VerticalCover) {
                                    z4 = false;
                                    break;
                                } else {
                                    z4 = true;
                                    break;
                                }
                            }
                            r10 = false;
                            if (r10) {
                                if (!z5) {
                                    i25 = i28;
                                } else if (!d) {
                                    i25 = i29;
                                }
                                if (!z) {
                                    i22 = i28;
                                } else if (!d) {
                                    i22 = i24;
                                }
                            } else {
                                Pair l4 = l(catalogViewType, catalogDataType, z5, z, d);
                                i25 = ((Number) l4.i()).intValue();
                                i22 = ((Number) l4.j()).intValue();
                            }
                            s3q0 s3q0Var31 = s3q0.a;
                            rect2 = rect;
                            i24 = i22;
                        }
                        i4 = i25;
                        i5 = 0;
                        i9 = 0;
                    case 18:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 4) {
                            Pair l5 = l(catalogViewType, catalogDataType, z5, z, d);
                            i16 = ((Number) l5.i()).intValue();
                            i15 = ((Number) l5.j()).intValue();
                        } else {
                            i15 = 0;
                            i16 = 0;
                            i22 = 0;
                        }
                        s3q0 s3q0Var32 = s3q0.a;
                        rect2 = rect;
                        i24 = i15;
                        i4 = i16;
                        i9 = i22;
                        i5 = 0;
                        break;
                    case 19:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 1) {
                            i17 = z5 ? d ? i25 : i29 : i28;
                            if (!z) {
                                i25 = i28;
                            } else if (!d) {
                                i25 = i29;
                            }
                        } else {
                            i17 = 0;
                            i25 = 0;
                            i27 = 0;
                        }
                        s3q0 s3q0Var33 = s3q0.a;
                        rect2 = rect;
                        i4 = i17;
                        i24 = i25;
                        i9 = i27;
                        i5 = 0;
                        break;
                    case 20:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 18) {
                            DisplayMetrics b2 = sqe0.b(view);
                            int i42 = view.getLayoutParams().width;
                            if (i42 > 0) {
                                int i43 = (i21 * i27) + (i42 * c);
                                int i44 = (i29 * 2) + i43;
                                int i45 = b2.widthPixels;
                                if (i44 < i45) {
                                    i29 = (i45 - i43) / 2;
                                }
                            }
                            int i46 = z5 ? i29 : i28;
                            if (z) {
                                i28 = i29;
                            }
                            Pair pair = new Pair(Integer.valueOf(i46), Integer.valueOf(i28));
                            i11 = ((Number) pair.i()).intValue();
                            i12 = ((Number) pair.j()).intValue();
                        } else {
                            Pair l6 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue3 = ((Number) l6.i()).intValue();
                            i12 = ((Number) l6.j()).intValue();
                            i11 = intValue3;
                        }
                        s3q0 s3q0Var34 = s3q0.a;
                        rect2 = rect;
                        i4 = i11;
                        i24 = i12;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 21:
                        int i47 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        int i48 = l;
                        int i49 = p;
                        if (i47 != 1) {
                            switch (i47) {
                                case 19:
                                    i3 = z5 ? i29 : i28;
                                    if (z) {
                                        i28 = i29;
                                    }
                                    s3q0 s3q0Var35 = s3q0.a;
                                    rect2 = rect;
                                    i4 = i3;
                                    i24 = i28;
                                    i5 = 0;
                                    i9 = 0;
                                    break;
                                case 20:
                                    Pair pair2 = new Pair(Boolean.valueOf(z5), Boolean.valueOf(d));
                                    Boolean bool2 = Boolean.TRUE;
                                    if (pair2.equals(new Pair(bool2, bool2))) {
                                        i18 = i49;
                                    } else {
                                        Boolean bool3 = Boolean.FALSE;
                                        i18 = pair2.equals(new Pair(bool2, bool3)) ? i29 : pair2.equals(new Pair(bool3, bool2)) ? i48 / 2 : pair2.equals(new Pair(bool3, bool3)) ? i28 : 0;
                                    }
                                    Pair pair3 = new Pair(Boolean.valueOf(z), Boolean.valueOf(d));
                                    if (pair3.equals(new Pair(bool2, bool2))) {
                                        i28 = i49;
                                    } else {
                                        Boolean bool4 = Boolean.FALSE;
                                        if (pair3.equals(new Pair(bool2, bool4))) {
                                            i28 = i29;
                                        } else if (pair3.equals(new Pair(bool4, bool2))) {
                                            i28 = i48 / 2;
                                        } else if (!pair3.equals(new Pair(bool4, bool4))) {
                                            i28 = 0;
                                        }
                                    }
                                    s3q0 s3q0Var36 = s3q0.a;
                                    i4 = i18;
                                    i24 = i28;
                                    i5 = 0;
                                    i9 = 0;
                                    rect2 = rect;
                                    break;
                                case 21:
                                case 22:
                                    boolean z6 = childAdapterPosition % 2 == 0;
                                    int i50 = z6 ? i27 : i28;
                                    if (!z6) {
                                        i28 = i27;
                                    }
                                    Pair pair4 = new Pair(Integer.valueOf(i50), Integer.valueOf(i28));
                                    int intValue4 = ((Number) pair4.i()).intValue();
                                    int intValue5 = ((Number) pair4.j()).intValue();
                                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                                    GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                                    int i51 = gridLayoutManager != null ? gridLayoutManager.s : 1;
                                    jpf jpfVar2 = this.c;
                                    if (childAdapterPosition / i51 == i21 / i51 && !(((jpfVar2 == null || (uIBlockList = (UIBlockList) jpfVar2.invoke()) == null) ? null : uIBlockList.A) != null)) {
                                        i27 = 0;
                                    }
                                    s3q0 s3q0Var37 = s3q0.a;
                                    rect2 = rect;
                                    i4 = intValue4;
                                    i24 = intValue5;
                                    i9 = i27;
                                    i5 = 0;
                                    break;
                                case 23:
                                    Pair l7 = l(catalogViewType, catalogDataType, z5, z, d);
                                    intValue = ((Number) l7.i()).intValue();
                                    intValue2 = ((Number) l7.j()).intValue();
                                    s3q0 s3q0Var38 = s3q0.a;
                                    rect2 = rect;
                                    i24 = intValue2;
                                    i4 = intValue;
                                    i5 = 0;
                                    i9 = 0;
                                    break;
                                default:
                                    Pair l8 = l(catalogViewType, catalogDataType, z5, z, d);
                                    intValue = ((Number) l8.i()).intValue();
                                    intValue2 = ((Number) l8.j()).intValue();
                                    s3q0 s3q0Var39 = s3q0.a;
                                    rect2 = rect;
                                    i24 = intValue2;
                                    i4 = intValue;
                                    i5 = 0;
                                    i9 = 0;
                                    break;
                            }
                        } else {
                            Pair pair5 = new Pair(Boolean.valueOf(z5), Boolean.valueOf(d));
                            Boolean bool5 = Boolean.TRUE;
                            if (!pair5.equals(new Pair(bool5, bool5))) {
                                i49 = pair5.equals(new Pair(bool5, Boolean.FALSE)) ? i27 : 0;
                            }
                            if (d) {
                                i27 = i48;
                            }
                            s3q0 s3q0Var40 = s3q0.a;
                            rect2 = rect;
                            i4 = i49;
                            i24 = i27;
                            i5 = 0;
                            i9 = 0;
                        }
                        break;
                    case 22:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 24) {
                            i19 = z5 ? i29 : i28;
                            if (!z) {
                                i29 = i28;
                            }
                        } else {
                            Pair l9 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue6 = ((Number) l9.i()).intValue();
                            i29 = ((Number) l9.j()).intValue();
                            i19 = intValue6;
                            i28 = 0;
                        }
                        s3q0 s3q0Var41 = s3q0.a;
                        rect2 = rect;
                        i4 = i19;
                        i5 = i28;
                        i24 = i29;
                        i9 = 0;
                        break;
                    case 23:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 25) {
                            i13 = z5 ? d ? i25 : i29 : i28;
                            if (!z) {
                                i25 = i28;
                            } else if (!d) {
                                i25 = i29;
                            }
                        } else {
                            Pair l10 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue7 = ((Number) l10.i()).intValue();
                            i25 = ((Number) l10.j()).intValue();
                            i13 = intValue7;
                        }
                        s3q0 s3q0Var42 = s3q0.a;
                        rect2 = rect;
                        i4 = i13;
                        i24 = i25;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 24:
                        if (!d) {
                            i29 = 0;
                        }
                        s3q0 s3q0Var43 = s3q0.a;
                        rect2 = rect;
                        i4 = i29;
                        i5 = 0;
                        i9 = 0;
                        i24 = 0;
                        break;
                    case 25:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 1) {
                            i10 = z5 ? 0 : i26;
                            if (z5) {
                                i26 = 0;
                            }
                        } else {
                            Pair l11 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue8 = ((Number) l11.i()).intValue();
                            i26 = ((Number) l11.j()).intValue();
                            i10 = intValue8;
                        }
                        s3q0 s3q0Var44 = s3q0.a;
                        rect2 = rect;
                        i4 = i10;
                        i24 = i26;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 26:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 4) {
                            intValue2 = 0;
                            intValue = 0;
                        } else {
                            Pair l12 = l(catalogViewType, catalogDataType, z5, z, d);
                            intValue = ((Number) l12.i()).intValue();
                            intValue2 = ((Number) l12.j()).intValue();
                        }
                        s3q0 s3q0Var45 = s3q0.a;
                        rect2 = rect;
                        i24 = intValue2;
                        i4 = intValue;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 27:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 26) {
                            i20 = z5 ? i23 : 0;
                            if (!z) {
                                i23 = 0;
                            }
                        } else {
                            Pair l13 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue9 = ((Number) l13.i()).intValue();
                            i23 = ((Number) l13.j()).intValue();
                            i20 = intValue9;
                        }
                        s3q0 s3q0Var46 = s3q0.a;
                        rect2 = rect;
                        i4 = i20;
                        i24 = i23;
                        i5 = 0;
                        i9 = 0;
                        break;
                    case 28:
                        if ((catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 1) {
                            i3 = z5 ? i29 : i28;
                            if (z) {
                                i28 = i29;
                            }
                        } else {
                            Pair l14 = l(catalogViewType, catalogDataType, z5, z, d);
                            int intValue10 = ((Number) l14.i()).intValue();
                            i28 = ((Number) l14.j()).intValue();
                            i3 = intValue10;
                        }
                        s3q0 s3q0Var47 = s3q0.a;
                        rect2 = rect;
                        i4 = i3;
                        i24 = i28;
                        i5 = 0;
                        i9 = 0;
                        break;
                    default:
                        Pair l15 = l(catalogViewType, catalogDataType, z5, z, d);
                        intValue = ((Number) l15.i()).intValue();
                        intValue2 = ((Number) l15.j()).intValue();
                        s3q0 s3q0Var48 = s3q0.a;
                        rect2 = rect;
                        i24 = intValue2;
                        i4 = intValue;
                        i5 = 0;
                        i9 = 0;
                        break;
                }
                rect2.set(i4, i5, i24, i9);
            }
        }
        z = false;
        bool = this.b;
        if (bool == null) {
        }
        if (catalogDataType != null) {
        }
        int i222 = o;
        int i232 = i;
        int i242 = j;
        int i252 = m;
        int i262 = g;
        int i272 = k;
        int i282 = h;
        int i292 = n;
        switch (i2) {
        }
        rect2.set(i4, i5, i242, i9);
    }
}
