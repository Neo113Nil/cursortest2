package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: CatalogRecyclerGridOffsetsItemDecorator.kt */
/* loaded from: classes16.dex */
public class oca extends RecyclerView.n {
    public static final int d = iah0.a(1);
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public final b4a b = new b4a();
    public Boolean c;

    /* compiled from: CatalogRecyclerGridOffsetsItemDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CatalogViewType.CROP_SLIDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogViewType.MUSIC_CHART_TRIPLE_STACKED_SLIDER.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogViewType.VERTICAL_GRID.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[CatalogViewType.TEXT.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[CatalogViewType.SHORT_VIDEO_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[CatalogViewType.AD_BANNER_SHOWCASE.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_SUBNAVIGATION_CONTAINER.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[CatalogViewType.SEPARATOR.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        iah0.a(2);
        e = iah0.a(4);
        iah0.a(5);
        f = iah0.a(6);
        g = iah0.a(8);
        float f2 = 32;
        iah0.a(f2);
        h = iah0.a(12);
        i = iah0.a(14);
        iah0.a(15);
        j = iah0.a(16);
        k = iah0.a(18);
        l = iah0.a(20);
        m = iah0.a(24);
        n = iah0.a(26);
        o = iah0.a(28);
        p = iah0.a(30);
        q = iah0.a(f2);
    }

    public static void l(CatalogDataType catalogDataType, Rect rect, View view, UIBlock uIBlock, int i2) {
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        int i3 = i2 == 0 ? sca.f : sca.i;
        if (uIBlock.e != catalogDataType || bVar.g <= 1) {
            return;
        }
        rect.set(0, i3, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x02e3, code lost:
    
        if (r9 == null) goto L218;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean d2;
        String str;
        int i2;
        int i3;
        int i4;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new IllegalStateException();
        }
        uuk uukVar = a2.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition);
        int i5 = childAdapterPosition + 1;
        CatalogViewType catalogViewType = uIBlock != null ? uIBlock.d : null;
        CatalogDataType catalogDataType = uIBlock != null ? uIBlock.e : null;
        Boolean bool = this.c;
        if (bool != null) {
            d2 = bool.booleanValue();
        } else {
            d2 = fnj.d(view.getContext());
            this.c = Boolean.valueOf(d2);
        }
        Iterator it = ((ArrayList) a2.y0()).iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i6 = -1;
                break;
            }
            CatalogViewType catalogViewType2 = ((UIBlock) it.next()).d;
            if (catalogViewType2 == CatalogViewType.DOUBLE_STACKED_LIST || catalogViewType2 == CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD) {
                break;
            } else {
                i6++;
            }
        }
        int i7 = catalogViewType == null ? -1 : a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        int i8 = e;
        int i9 = h;
        int i10 = j;
        int i11 = f;
        int i12 = g;
        switch (i7) {
            case 1:
                l(CatalogDataType.DATA_TYPE_ACTION, rect, view, uIBlock, childAdapterPosition);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                l(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, rect, view, uIBlock, childAdapterPosition);
                return;
            case 11:
            case 12:
            case 13:
                int i13 = a.$EnumSwitchMapping$0[uIBlock.e.ordinal()];
                if (i13 != 1 && i13 != 2) {
                    boolean z = childAdapterPosition < 2;
                    if (a2.getItemCount() - 2 <= childAdapterPosition && childAdapterPosition < a2.getItemCount()) {
                        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                        if (uIBlockList == null) {
                            str = null;
                            break;
                        } else {
                            str = uIBlockList.A;
                            break;
                        }
                    }
                    r0 = false;
                    int i14 = (z && d2) ? i10 : 0;
                    if (!r0 || !d2) {
                        i10 = 0;
                    }
                    rect.set(i14, 0, i10, 0);
                    return;
                }
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition2 < 0 || childAdapterPosition2 >= itemCount) {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    return;
                }
                boolean z2 = childAdapterPosition2 == 0 || childAdapterPosition2 == 1;
                if (childAdapterPosition2 != itemCount - 2 && childAdapterPosition2 != itemCount - 1) {
                    r0 = false;
                }
                int i15 = z2 ? i11 : i9;
                int i16 = childAdapterPosition2 % 2;
                int i17 = i16 != 0 ? i11 : 0;
                if (!r0 || (itemCount % 2 != 0 && i16 != 0)) {
                    i12 = 0;
                }
                rect.set(i15, i17, i12, 0);
                return;
            case 14:
                rect.set(i8, 0, i8, i12);
                return;
            case 15:
            case 16:
            case 17:
                int itemCount2 = a2.getItemCount();
                UIBlockList uIBlockList2 = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                String str2 = uIBlockList2 != null ? uIBlockList2.A : null;
                boolean z3 = childAdapterPosition < 3;
                r0 = itemCount2 + (-3) <= childAdapterPosition && childAdapterPosition < itemCount2 && str2 == null;
                int i18 = catalogDataType != null ? a.$EnumSwitchMapping$0[catalogDataType.ordinal()] : -1;
                if (i18 == 6) {
                    rect.set(z3 ? 0 : i8, 0, i8, 0);
                    return;
                }
                if (i18 == 7) {
                    rect.set(i8, 0, i8, i12);
                    return;
                }
                int i19 = (z3 && d2) ? i10 : 0;
                if (!r0 || !d2) {
                    i10 = 0;
                }
                rect.set(i19, 0, i10, 0);
                return;
            case 18:
                int i20 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
                if (bVar.g == 1) {
                    int b = cn70.b(d2 ? 24 : 8);
                    int b2 = d2 ? cn70.b(12) : cn70.b(4);
                    int i21 = bVar.f;
                    if (i21 == 0) {
                        i2 = 0;
                        b2 = 0;
                    } else if (i21 == i20 - 1) {
                        b2 = b;
                        i2 = 0;
                        b = 0;
                    } else {
                        b = b2;
                        i2 = 0;
                    }
                    rect.set(b, i2, b2, i2);
                    return;
                }
                if (catalogDataType == CatalogDataType.DATA_TYPE_MOVIES) {
                    GridLayoutManager.b bVar2 = (GridLayoutManager.b) view.getLayoutParams();
                    int i22 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                    int i23 = bVar2.g;
                    int i24 = (i22 / i23) - 1;
                    boolean z4 = recyclerView.getChildAdapterPosition(view) == bVar2.f / i23;
                    if (i24 < 1) {
                        return;
                    }
                    int i25 = i9 / 2;
                    int i26 = i10 - i25;
                    recyclerView.setPadding(i26, 0, i26, 0);
                    Pair pair = new Pair(Integer.valueOf(i25), Integer.valueOf(i25));
                    rect.set(((Number) pair.d()).intValue(), z4 ? i8 : 0, ((Number) pair.g()).intValue(), m);
                    recyclerView.invalidate();
                    return;
                }
                return;
            case 19:
            case 20:
                int i27 = ((GridLayoutManager) recyclerView.getLayoutManager()).s / ((GridLayoutManager.b) view.getLayoutParams()).g;
                int i28 = i6 % i27;
                int i29 = childAdapterPosition % i27;
                r0 = i29 + ((((i29 ^ i27) & ((-i29) | i29)) >> 31) & i27) == i28 + ((((i28 ^ i27) & ((-i28) | i28)) >> 31) & i27);
                if (i6 < 0) {
                    return;
                }
                if ((catalogDataType != null ? a.$EnumSwitchMapping$0[catalogDataType.ordinal()] : -1) == 5) {
                    i3 = r0 ? i9 : i11;
                    if (r0) {
                        i9 = i11;
                    }
                    i4 = i9;
                } else {
                    i3 = r0 ? i10 : i11;
                    if (!r0) {
                        i11 = i10;
                    }
                    i4 = i11;
                }
                if (i27 == 2) {
                    rect.set(i3, 0, i4, i10);
                    return;
                }
                return;
            case 21:
                if (a.$EnumSwitchMapping$0[uIBlock.e.ordinal()] == 3) {
                    int i30 = childAdapterPosition == 0 ? i11 : 0;
                    if (!d2) {
                        i10 = 0;
                    }
                    rect.set(0, i30, i10, 0);
                    return;
                }
                return;
            case 22:
                if (a.$EnumSwitchMapping$0[uIBlock.e.ordinal()] == 4) {
                    UIBlock uIBlock2 = childAdapterPosition != a2.getItemCount() - 1 ? (UIBlock) uukVar.c(i5) : null;
                    CatalogViewType catalogViewType3 = uIBlock2 != null ? uIBlock2.d : null;
                    int i31 = catalogViewType3 != null ? a.$EnumSwitchMapping$1[catalogViewType3.ordinal()] : -1;
                    int i32 = i;
                    rect.set(0, i32, 0, i31 == 27 ? i11 : i32);
                    return;
                }
                return;
            case 23:
                if (a.$EnumSwitchMapping$0[uIBlock.e.ordinal()] == 5) {
                    GridLayoutManager.b bVar3 = (GridLayoutManager.b) view.getLayoutParams();
                    int i33 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                    int i34 = bVar3.g;
                    int i35 = i33 / i34;
                    int i36 = bVar3.f / i34;
                    boolean z5 = i36 == 0;
                    r0 = i36 == i35 - 1;
                    int i37 = d;
                    rect.set(z5 ? 0 : i37, i37, r0 ? 0 : i37, i37);
                    return;
                }
                return;
            case 24:
                rect.set(0, childAdapterPosition == 0 ? i11 : 0, 0, o);
                return;
            case 25:
                int b3 = d2 ? cn70.b(32) : cn70.b(12);
                rect.set(b3, 0, b3, i12);
                return;
            case 26:
                if (childAdapterPosition == 0) {
                    rect.set(0, i12, 0, 0);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
