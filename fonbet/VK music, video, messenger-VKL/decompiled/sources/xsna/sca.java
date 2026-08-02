package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogRecyclerVerticalOffsetsItemDecorator.kt */
/* loaded from: classes16.dex */
public class sca extends RecyclerView.n {
    public static final int c = iah0.a(1);
    public static final int d = iah0.a(2);
    public static final int e = iah0.a(3);
    public static final int f = iah0.a(4);
    public static final int g = iah0.a(5);
    public static final int h = iah0.a(6);
    public static final int i = iah0.a(8);
    public static final int j = iah0.a(10);
    public static final int k = iah0.a(12);
    public static final int l = iah0.a(14);
    public static final int m = iah0.a(16);
    public static final int n = iah0.a(20);
    public static final int o = iah0.a(32);
    public static final int p = iah0.a(64);
    public final b4a b = new b4a();

    /* compiled from: CatalogRecyclerVerticalOffsetsItemDecorator.kt */
    public static final class a {
        public static final CatalogDataType a(UIBlock uIBlock) {
            int i = sca.c;
            if (!(uIBlock instanceof UIBlockList)) {
                return uIBlock.e;
            }
            UIBlock uIBlock2 = (UIBlock) j5g.a0(((UIBlockList) uIBlock).y);
            if (uIBlock2 != null) {
                return uIBlock2.e;
            }
            return null;
        }
    }

    /* compiled from: CatalogRecyclerVerticalOffsetsItemDecorator.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UPLOAD_VIDEO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.SUBSECTION_TABS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.TEXT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.PODCAST_FAVORITES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_GRID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.PODCAST_CATEGORY_GENRE_BUTTONS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.FEATURED_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogViewType.MAP_PREVIEW.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogViewType.CROP_SLIDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LARGE_SLIDER.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogViewType.MUSIC_EXCLUSIVE_SLIDER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogViewType.MY_SHELF_PLAYABLE_ITEM.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogViewType.AD_BANNER.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED.ordinal()] = 9;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED.ordinal()] = 10;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 12;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 13;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 14;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 17;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 19;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 20;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS.ordinal()] = 21;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 22;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 23;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_AD_BLOCKS.ordinal()] = 24;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused66) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x013d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0455  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        CatalogDataType catalogDataType;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        int i5;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new IllegalStateException("Catalog adapter can't be null");
        }
        uuk uukVar = a2.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition - 1);
        UIBlock uIBlock3 = (UIBlock) uukVar.c(childAdapterPosition + 1);
        UIBlock uIBlock4 = (UIBlock) uukVar.c(childAdapterPosition);
        if (uIBlock4 == null) {
            return;
        }
        CatalogDataType catalogDataType2 = uIBlock4.e;
        CatalogViewType catalogViewType = uIBlock4.d;
        boolean z3 = childAdapterPosition == 0;
        boolean z4 = childAdapterPosition == b4a.c(recyclerView.getAdapter()) - 1;
        int i6 = b.$EnumSwitchMapping$1[catalogDataType2.ordinal()];
        int i7 = j;
        int i8 = f;
        int i9 = m;
        int i10 = d;
        int i11 = h;
        boolean z5 = z3;
        int i12 = i;
        boolean z6 = z4;
        int i13 = k;
        switch (i6) {
            case 1:
                switch (b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        if ((uIBlock3 != null ? uIBlock3.e : null) == CatalogDataType.DATA_TYPE_ACTION) {
                            i12 = 0;
                        }
                        i2 = 0;
                        rect.set(0, z5 ? i13 : 0, 0, i12);
                        s3q0 s3q0Var = s3q0.a;
                        break;
                    default:
                        s3q0 s3q0Var2 = s3q0.a;
                        i2 = 0;
                        break;
                }
            case 2:
                i2 = 0;
                switch (b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        rect.set(0, z5 ? i13 : 0, 0, 0);
                        s3q0 s3q0Var3 = s3q0.a;
                        i2 = 0;
                        break;
                    case 14:
                        if (!z5) {
                            i7 = 0;
                        }
                        rect.set(0, i7, 0, 0);
                        s3q0 s3q0Var4 = s3q0.a;
                        break;
                    case 15:
                        rect.set(0, i7, 0, 0);
                        s3q0 s3q0Var5 = s3q0.a;
                        break;
                    default:
                        s3q0 s3q0Var6 = s3q0.a;
                        break;
                }
            case 3:
                i2 = 0;
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 16) {
                    rect.set(0, z5 ? l : 0, 0, 0);
                }
                s3q0 s3q0Var7 = s3q0.a;
                break;
            case 4:
                switch (b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 17:
                        i2 = 0;
                        if (!z5) {
                            i11 = 0;
                        }
                        rect.set(0, i11, 0, 0);
                        s3q0 s3q0Var8 = s3q0.a;
                        break;
                    case 18:
                        i2 = 0;
                        rect.set(0, z5 ? i13 : 0, 0, 0);
                        s3q0 s3q0Var9 = s3q0.a;
                        break;
                    case 19:
                        if ((uIBlock3 != null ? uIBlock3.e : null) != CatalogDataType.DATA_TYPE_PODCAST_EPISODES) {
                            if ((uIBlock3 != null ? uIBlock3.e : null) != CatalogDataType.DATA_TYPE_AUDIOBOOKS) {
                                i3 = i13;
                                i2 = 0;
                                rect.set(0, 0, 0, i3);
                                s3q0 s3q0Var10 = s3q0.a;
                                break;
                            }
                        }
                        i3 = 0;
                        i2 = 0;
                        rect.set(0, 0, 0, i3);
                        s3q0 s3q0Var102 = s3q0.a;
                    case 20:
                        rect.set(0, z5 ? i13 : 0, 0, (uIBlock3 != null ? uIBlock3.d : null) == CatalogViewType.MY_SHELF_PLAYABLE_ITEM ? i10 : i13);
                        s3q0 s3q0Var11 = s3q0.a;
                        i2 = 0;
                        break;
                    case 21:
                        rect.set(0, z5 ? i13 : 0, 0, i13);
                        s3q0 s3q0Var12 = s3q0.a;
                        i2 = 0;
                        break;
                    case 22:
                        i4 = 0;
                        rect.set(0, 0, 0, 0);
                        s3q0 s3q0Var13 = s3q0.a;
                        i2 = i4;
                        break;
                    case 23:
                        List l2 = e43.l(CatalogDataType.DATA_TYPE_CATALOG_BANNERS, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE);
                        if (!(l2 instanceof Collection) || !l2.isEmpty()) {
                            Iterator it = l2.iterator();
                            while (it.hasNext()) {
                                if ((uIBlock2 != null ? uIBlock2.e : null) == ((CatalogDataType) it.next())) {
                                    z = true;
                                    if (z) {
                                        if ((uIBlock2 != null ? uIBlock2.d : null) != CatalogViewType.SMALL_LIST) {
                                            i8 = i13;
                                            i4 = 0;
                                            rect.set(i4, i8, i4, i4);
                                            s3q0 s3q0Var14 = s3q0.a;
                                            i2 = i4;
                                            break;
                                        }
                                    }
                                    if (!z) {
                                        i4 = 0;
                                        i8 = 0;
                                        rect.set(i4, i8, i4, i4);
                                        s3q0 s3q0Var142 = s3q0.a;
                                        i2 = i4;
                                    }
                                    i4 = 0;
                                    rect.set(i4, i8, i4, i4);
                                    s3q0 s3q0Var1422 = s3q0.a;
                                    i2 = i4;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (!z) {
                        }
                        i4 = 0;
                        rect.set(i4, i8, i4, i4);
                        s3q0 s3q0Var14222 = s3q0.a;
                        i2 = i4;
                        break;
                    default:
                        s3q0 s3q0Var15 = s3q0.a;
                        i2 = 0;
                        break;
                }
                break;
            case 5:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17) {
                    if (!z5) {
                        i12 = 0;
                    }
                    rect.set(0, i12, 0, 0);
                }
                s3q0 s3q0Var16 = s3q0.a;
                i2 = 0;
                break;
            case 6:
                int i14 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i14 == 24) {
                    i4 = 0;
                    rect.set(i9, z5 ? g : 0, i9, 0);
                    s3q0 s3q0Var17 = s3q0.a;
                } else if (i14 != 25) {
                    s3q0 s3q0Var18 = s3q0.a;
                    i2 = 0;
                    break;
                } else {
                    i4 = 0;
                    rect.set(0, 0, 0, i12);
                    s3q0 s3q0Var19 = s3q0.a;
                }
                i2 = i4;
                break;
            case 7:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17) {
                    rect.set(0, z5 ? i13 : 0, 0, 0);
                }
                s3q0 s3q0Var20 = s3q0.a;
                i2 = 0;
                break;
            case 8:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 26) {
                    rect.set(0, 0, 0, i10);
                }
                s3q0 s3q0Var21 = s3q0.a;
                i2 = 0;
                break;
            case 9:
            case 10:
            case 11:
                int i15 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 17) {
                    CatalogDataType a3 = uIBlock2 != null ? a.a(uIBlock2) : null;
                    CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_CATALOG_BANNERS;
                    boolean z7 = a3 == catalogDataType3;
                    boolean z8 = (uIBlock3 != null ? a.a(uIBlock3) : null) == catalogDataType3;
                    CatalogDataType a4 = uIBlock2 != null ? a.a(uIBlock2) : null;
                    CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS;
                    boolean z9 = a4 == catalogDataType4;
                    boolean z10 = (uIBlock3 != null ? a.a(uIBlock3) : null) == catalogDataType4;
                    int i16 = z9 ? i10 : z7 ? i11 : 0;
                    if (z10) {
                        i11 = i10;
                    } else if (!z8) {
                        i11 = 0;
                    }
                    rect.set(i9, i16, i9, i11);
                    s3q0 s3q0Var22 = s3q0.a;
                } else if (i15 != 27) {
                    s3q0 s3q0Var23 = s3q0.a;
                } else {
                    rect.set(i9, i13, i9, i12);
                    s3q0 s3q0Var24 = s3q0.a;
                }
                i2 = 0;
                break;
            case 12:
                int i17 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i17 == 17) {
                    if ((uIBlock2 != null ? a.a(uIBlock2) : null) != CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS && !z5) {
                        i8 = 0;
                    }
                    rect.top = i8;
                    s3q0 s3q0Var25 = s3q0.a;
                } else if (i17 != 24) {
                    s3q0 s3q0Var26 = s3q0.a;
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
                    if (bVar != null) {
                        int i18 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                        int i19 = bVar.g;
                        if (i19 < i18) {
                            int i20 = bVar.f;
                            boolean z11 = i20 == 0;
                            boolean z12 = i20 + i19 == i18;
                            rect.left = z11 ? i7 : 0;
                            if (!z12) {
                                i7 = 0;
                            }
                            rect.right = i7;
                        }
                        UIBlock uIBlock5 = (UIBlock) uukVar.c((childAdapterPosition - (bVar.f / i19)) - 1);
                        if (uIBlock5 == null) {
                            rect.top = i9;
                        } else if (uIBlock5.e == CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS) {
                            rect.top = i8;
                        }
                        if ((i18 / bVar.g) + childAdapterPosition >= b4a.c(a2) && !z6 && !(uIBlock4 instanceof UIBlockSeparator)) {
                            rect.bottom += i9;
                        }
                        s3q0 s3q0Var27 = s3q0.a;
                    }
                }
                i2 = 0;
                break;
            case 13:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
                    rect.bottom += i12;
                }
                s3q0 s3q0Var28 = s3q0.a;
                i2 = 0;
                break;
            case 14:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17 && childAdapterPosition == a2.E0() - 1) {
                    rect.bottom = iah0.a(38) + rect.bottom;
                }
                s3q0 s3q0Var29 = s3q0.a;
                i2 = 0;
                break;
            case 15:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 16) {
                    rect.bottom += i12;
                }
                s3q0 s3q0Var30 = s3q0.a;
                i2 = 0;
                break;
            case 16:
                int i21 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i21 == 10 || i21 == 11) {
                    rect.top += i13;
                    rect.bottom += i12;
                }
                s3q0 s3q0Var31 = s3q0.a;
                i2 = 0;
                break;
            case 17:
                int i22 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i22 == 10 || i22 == 11) {
                    rect.top += i13;
                    rect.bottom += i12;
                }
                s3q0 s3q0Var32 = s3q0.a;
                i2 = 0;
                break;
            case 18:
                switch (b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 28:
                        rect.set(0, i8, 0, z6 ? p : i13);
                        s3q0 s3q0Var33 = s3q0.a;
                        i2 = 0;
                        break;
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        i4 = 0;
                        if ((uIBlock3 != null ? uIBlock3.d : null) == CatalogViewType.SEPARATOR) {
                            rect.set(0, 0, 0, i13);
                        } else {
                            rect.set(0, 0, 0, 0);
                        }
                        s3q0 s3q0Var34 = s3q0.a;
                        i2 = i4;
                        break;
                    case 33:
                        i4 = 0;
                        rect.set(0, i12, 0, i12);
                        s3q0 s3q0Var35 = s3q0.a;
                        i2 = i4;
                        break;
                    case 34:
                    case 35:
                    case 36:
                        i4 = 0;
                        rect.set(0, 0, 0, i13);
                        s3q0 s3q0Var36 = s3q0.a;
                        i2 = i4;
                        break;
                    case 37:
                    case 38:
                        i4 = 0;
                        rect.set(0, i11, 0, i12);
                        s3q0 s3q0Var37 = s3q0.a;
                        i2 = i4;
                        break;
                    default:
                        CatalogDataType a5 = uIBlock2 != null ? a.a(uIBlock2) : null;
                        CatalogDataType catalogDataType5 = CatalogDataType.DATA_TYPE_CATALOG_BANNERS;
                        boolean z13 = a5 == catalogDataType5;
                        boolean z14 = (uIBlock3 != null ? a.a(uIBlock3) : null) == catalogDataType5;
                        CatalogDataType a6 = uIBlock2 != null ? a.a(uIBlock2) : null;
                        CatalogDataType catalogDataType6 = CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS;
                        boolean z15 = a6 == catalogDataType6;
                        if (uIBlock3 != null) {
                            z2 = z13;
                            catalogDataType = a.a(uIBlock3);
                        } else {
                            z2 = z13;
                            catalogDataType = null;
                        }
                        boolean z16 = catalogDataType == catalogDataType6;
                        if (a.a(uIBlock4) == catalogDataType5) {
                            int i23 = z15 ? i10 : z2 ? i11 : 0;
                            if (z16) {
                                i11 = i10;
                            } else if (!z14) {
                                i4 = 0;
                                i11 = 0;
                                rect.set(i4, i23, i4, i11);
                            }
                            i4 = 0;
                            rect.set(i4, i23, i4, i11);
                        } else {
                            i4 = 0;
                        }
                        s3q0 s3q0Var38 = s3q0.a;
                        i2 = i4;
                        break;
                }
            case 19:
            case 20:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 39) {
                    rect.set(i9, i8, i9, i9);
                }
                s3q0 s3q0Var39 = s3q0.a;
                i2 = 0;
                break;
            case 21:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17) {
                    UIBlockList uIBlockList = uIBlock3 instanceof UIBlockList ? (UIBlockList) uIBlock3 : null;
                    if (((uIBlockList == null || (arrayList = uIBlockList.y) == null || (uIBlock = (UIBlock) j5g.a0(arrayList)) == null) ? null : uIBlock.e) == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) {
                        rect.bottom += i12;
                        if (z5) {
                            rect.top += i11;
                        }
                    } else {
                        rect.bottom += i10;
                    }
                }
                s3q0 s3q0Var40 = s3q0.a;
                i2 = 0;
                break;
            case 22:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 40) {
                    rect.set(i13, 0, i13, i12);
                }
                s3q0 s3q0Var41 = s3q0.a;
                i2 = 0;
                break;
            case 23:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17) {
                    CatalogDataType a7 = uIBlock2 != null ? a.a(uIBlock2) : null;
                    CatalogDataType catalogDataType7 = CatalogDataType.DATA_TYPE_CONCERTS;
                    boolean z17 = a7 == catalogDataType7;
                    boolean z18 = (uIBlock3 != null ? a.a(uIBlock3) : null) == catalogDataType7;
                    int i24 = z17 ? i11 : 0;
                    if (!z18) {
                        i11 = 0;
                    }
                    rect.top += i24;
                    rect.bottom += i11;
                }
                s3q0 s3q0Var42 = s3q0.a;
                i2 = 0;
                break;
            case 24:
                if (b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 41) {
                    rect.set(0, 0, 0, i9);
                }
                s3q0 s3q0Var43 = s3q0.a;
                i2 = 0;
                break;
            default:
                s3q0 s3q0Var44 = s3q0.a;
                i2 = 0;
                break;
        }
        if (catalogViewType.l()) {
            l(uIBlock2, uIBlock3, rect);
        }
        boolean P = j5g.P(e43.l(CatalogDataType.DATA_TYPE_SEARCH_AUTHORS, CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION), uIBlock3 != null ? uIBlock3.e : null);
        if (catalogDataType2 == CatalogDataType.DATA_TYPE_NONE && P) {
            rect.bottom -= i10;
        }
        if ((uIBlock2 != null ? uIBlock2.d : null) == CatalogViewType.BUTTONS_HORIZONTAL && (catalogDataType2 == CatalogDataType.DATA_TYPE_VIDEO_ALBUMS || catalogDataType2 == CatalogDataType.DATA_TYPE_LINKS)) {
            rect.top += i13;
        }
        int i25 = (catalogDataType2 == CatalogDataType.DATA_SYNTHETIC_SECTION && catalogViewType == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS) ? 1 : i2;
        if (uIBlock3 != null) {
            i5 = (uIBlock3.e == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && e43.l(CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT, CatalogViewType.LARGE_LIST, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE).contains(uIBlock3.d)) ? 1 : i2;
        } else {
            i5 = i2;
        }
        if (i25 != 0 && i5 != 0) {
            rect.bottom += i13;
        }
        if (!z6 || (uIBlock4 instanceof UIBlockSeparator)) {
            return;
        }
        rect.bottom += i9;
    }

    public void l(UIBlock uIBlock, UIBlock uIBlock2, Rect rect) {
        CatalogViewType catalogViewType = uIBlock != null ? uIBlock.d : null;
        int i2 = catalogViewType == null ? -1 : b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        int i3 = h;
        if (i2 == 16) {
            if (b.$EnumSwitchMapping$1[uIBlock.e.ordinal()] == 3) {
                rect.top = i3;
            }
        } else if (i2 == 17 || i2 == 28) {
            if (b.$EnumSwitchMapping$1[uIBlock.e.ordinal()] == 25) {
                rect.top += k;
            } else {
                rect.top += i3;
            }
        }
        CatalogViewType catalogViewType2 = uIBlock2 != null ? uIBlock2.d : null;
        switch (catalogViewType2 != null ? b.$EnumSwitchMapping$0[catalogViewType2.ordinal()] : -1) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                rect.bottom = m;
                break;
        }
    }
}
