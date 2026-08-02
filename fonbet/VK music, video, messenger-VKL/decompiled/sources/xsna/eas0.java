package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: VideoCatalogTabletGridDecorator.kt */
/* loaded from: classes16.dex */
public final class eas0 extends oca {
    public final boolean r;

    /* compiled from: VideoCatalogTabletGridDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_PLACEHOLDER.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogViewType.SEPARATOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_SLIDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[CatalogViewType.FLOOR_CLIPS.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 21;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 22;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public eas0(boolean z) {
        this.r = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        ArrayList<UIBlock> arrayList;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new IllegalStateException();
        }
        UIBlock uIBlock = (UIBlock) a2.c.c(recyclerView.getChildAdapterPosition(view));
        UIBlock uIBlock2 = null;
        uIBlock2 = null;
        CatalogDataType catalogDataType = uIBlock != null ? uIBlock.e : null;
        int i = catalogDataType == null ? -1 : a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        boolean z = this.r;
        int i2 = oca.m;
        int i3 = oca.h;
        int i4 = oca.e;
        int i5 = oca.q;
        int i6 = oca.j;
        switch (i) {
            case 1:
            case 2:
                CatalogViewType catalogViewType = uIBlock.d;
                switch (catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        if (z) {
                            rect.set(i6, 0, i6, i6);
                            return;
                        } else {
                            rect.set(i6, i6, i6, i4);
                            return;
                        }
                    case 11:
                        rect.set(i5, i6, i5, i4);
                        return;
                    case 12:
                    case 13:
                        m(view, recyclerView, rect);
                        return;
                    case 14:
                        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
                        int i7 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                        int i8 = bVar.g;
                        int i9 = (i7 / i8) - 1;
                        Object[] objArr = recyclerView.getChildAdapterPosition(view) == bVar.f / i8;
                        if (i9 < 1) {
                            return;
                        }
                        int i10 = oca.k / 2;
                        int i11 = i5 - i10;
                        recyclerView.setPadding(i11, 0, i11, 0);
                        Pair pair = new Pair(Integer.valueOf(i10), Integer.valueOf(i10));
                        int intValue = ((Number) pair.d()).intValue();
                        int intValue2 = ((Number) pair.g()).intValue();
                        if (objArr == false) {
                            i3 = 0;
                        }
                        rect.set(intValue, i3, intValue2, i2);
                        return;
                    default:
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        return;
                }
            case 3:
            case 4:
                CatalogViewType catalogViewType2 = uIBlock.d;
                int i12 = catalogViewType2 != null ? a.$EnumSwitchMapping$1[catalogViewType2.ordinal()] : -1;
                int i13 = oca.l;
                if (i12 == 1) {
                    if (!z) {
                        i13 = i4;
                    }
                    rect.set(i5, i4, i5, i13);
                    return;
                }
                if (i12 == 11) {
                    if (!z) {
                        i13 = i4;
                    }
                    rect.set(i6, i4, i6, i13);
                    return;
                } else {
                    if (i12 != 14) {
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        return;
                    }
                    GridLayoutManager.b bVar2 = (GridLayoutManager.b) view.getLayoutParams();
                    int i14 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                    int i15 = bVar2.g;
                    int i16 = bVar2.f / i15;
                    int i17 = (i14 / i15) - 1;
                    if (recyclerView.getChildAdapterPosition(view) != i16) {
                        i3 = 0;
                    }
                    int i18 = (i16 * i5) / i17;
                    rect.set(i5 - i18, i3, i18, i6);
                    return;
                }
            case 5:
                CatalogViewType catalogViewType3 = uIBlock.d;
                if ((catalogViewType3 != null ? a.$EnumSwitchMapping$1[catalogViewType3.ordinal()] : -1) == 15) {
                    m(view, recyclerView, rect);
                    return;
                } else {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    return;
                }
            case 6:
                CatalogViewType catalogViewType4 = uIBlock.d;
                if ((catalogViewType4 != null ? a.$EnumSwitchMapping$1[catalogViewType4.ordinal()] : -1) == 16) {
                    rect.set(i6, 0, i6, 0);
                    return;
                } else {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    return;
                }
            case 7:
                CatalogViewType catalogViewType5 = uIBlock != null ? uIBlock.d : null;
                switch (catalogViewType5 != null ? a.$EnumSwitchMapping$1[catalogViewType5.ordinal()] : -1) {
                    case 17:
                        rect.set(0, 0, 0, i6);
                        return;
                    case 18:
                        rect.set(0, 0, 0, i6);
                        return;
                    case 19:
                        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                        if (uIBlockList != null && (arrayList = uIBlockList.y) != null) {
                            uIBlock2 = (UIBlock) j5g.a0(arrayList);
                        }
                        if (uIBlock2 instanceof UIBlockGroupFilter) {
                            rect.set(0, i6, 0, i4);
                            return;
                        } else {
                            rect.set(0, 0, 0, i3);
                            return;
                        }
                    case 20:
                    case 21:
                        rect.set(i2, 0, i2, 0);
                        return;
                    default:
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        return;
                }
            case 8:
                boolean z2 = recyclerView.getChildAdapterPosition(view) == 0;
                CatalogViewType catalogViewType6 = uIBlock != null ? uIBlock.d : null;
                if ((catalogViewType6 != null ? a.$EnumSwitchMapping$1[catalogViewType6.ordinal()] : -1) == 22) {
                    rect.set(i5, z2 ? oca.i : 0, i5, i6);
                    return;
                } else {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    return;
                }
            default:
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        if (xsna.epx.f(((com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) r5).B, "section_filter") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(View view, RecyclerView recyclerView, Rect rect) {
        Pair pair;
        Boolean bool;
        int i;
        lca a2;
        int i2;
        ArrayList<UIBlock> arrayList;
        int i3;
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        int i4 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
        int i5 = bVar.g;
        int i6 = i4 / i5;
        int i7 = bVar.f / i5;
        int i8 = i6 - 1;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z = false;
        boolean z2 = childAdapterPosition == i7;
        if (i8 < 1) {
            return;
        }
        int i9 = oca.q;
        if (i6 <= 1) {
            pair = new Pair(Integer.valueOf(i9), Integer.valueOf(i9));
        } else if (i6 == 2) {
            int i10 = oca.g;
            pair = i7 == 0 ? new Pair(Integer.valueOf(i9), Integer.valueOf(i10)) : new Pair(Integer.valueOf(i10), Integer.valueOf(i9));
        } else {
            int i11 = (i7 * i9) / i8;
            pair = new Pair(Integer.valueOf(i9 - i11), Integer.valueOf(i11));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        boolean z3 = this.r;
        b4a b4aVar = this.b;
        Boolean bool2 = null;
        if (!z3) {
            if (z2) {
                i = oca.h;
            } else {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                b4aVar.getClass();
                lca a3 = b4a.a(adapter);
                if (a3 != null && (i2 = (childAdapterPosition - i7) - 1) >= 0) {
                    UIBlock uIBlock = (UIBlock) a3.c.c(i2);
                    if (uIBlock.e == CatalogDataType.DATA_SYNTHETIC_SECTION && uIBlock.d == CatalogViewType.SLIDER) {
                        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                        UIBlock uIBlock2 = (uIBlockList == null || (arrayList = uIBlockList.y) == null) ? null : (UIBlock) j5g.a0(arrayList);
                        if (uIBlock2 instanceof UIBlockActionFilter) {
                        }
                    }
                }
                int i12 = (childAdapterPosition - i7) - 1;
                UIBlock uIBlock3 = (i12 < 0 || (a2 = b4a.a(recyclerView.getAdapter())) == null) ? null : (UIBlock) a2.c.c(i12);
                if (uIBlock3 != null) {
                    CatalogDataType catalogDataType = uIBlock3.e;
                    CatalogViewType catalogViewType = uIBlock3.d;
                    bool = Boolean.valueOf((catalogViewType == CatalogViewType.STACKED_LIST && catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) || (catalogViewType == CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE && catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) || (catalogViewType == CatalogViewType.SYNTHETIC_PLACEHOLDER && catalogDataType == CatalogDataType.DATA_SYNTHETIC_LOADING));
                } else {
                    bool = null;
                }
                if (epx.f(bool, Boolean.FALSE)) {
                    i = oca.n;
                }
            }
            if (z3) {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                b4aVar.getClass();
                lca a4 = b4a.a(adapter2);
                if (a4 != null) {
                    int i13 = (childAdapterPosition - i7) + i6;
                    UIBlock uIBlock4 = i13 < a4.getItemCount() ? (UIBlock) a4.c.c(i13) : null;
                    if (uIBlock4 != null) {
                        CatalogDataType catalogDataType2 = uIBlock4.e;
                        CatalogViewType catalogViewType2 = uIBlock4.d;
                        if ((catalogViewType2 == CatalogViewType.STACKED_LIST && catalogDataType2 == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) || ((catalogViewType2 == CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE && catalogDataType2 == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) || (catalogViewType2 == CatalogViewType.SYNTHETIC_PLACEHOLDER && catalogDataType2 == CatalogDataType.DATA_SYNTHETIC_LOADING))) {
                            z = true;
                        }
                        bool2 = Boolean.valueOf(z);
                    }
                }
                i3 = epx.f(bool2, Boolean.FALSE) ? oca.i : oca.k;
            } else {
                i3 = oca.p;
            }
            rect.set(intValue, i, intValue2, i3);
        }
        i = 0;
        if (z3) {
        }
        rect.set(intValue, i, intValue2, i3);
    }
}
