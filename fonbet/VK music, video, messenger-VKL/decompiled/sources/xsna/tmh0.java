package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import kotlin.Pair;

/* compiled from: SearchAllCatalogHorizontalDecorator.kt */
/* loaded from: classes5.dex */
public final class tmh0 extends pca {
    public static final int q = iah0.a(8);
    public static final int r = iah0.a(26);
    public static final int s = iah0.a(22);
    public static final int t = iah0.a(32);

    /* compiled from: SearchAllCatalogHorizontalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MINIAPPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_STICKER_PACKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018f  */
    @Override // xsna.pca, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean d;
        boolean z;
        int i;
        int intValue;
        int intValue2;
        int i2;
        int i3;
        Pair pair;
        Pair pair2;
        UIBlockList uIBlockList;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.d.getClass();
        UIBlock b = b4a.b(childAdapterPosition, adapter);
        Rect rect2 = null;
        CatalogViewType catalogViewType = b != null ? b.d : null;
        CatalogDataType catalogDataType = b != null ? b.e : null;
        Boolean bool = this.b;
        if (bool != null) {
            d = bool.booleanValue();
        } else {
            d = fnj.d(view.getContext());
            this.b = Boolean.valueOf(d);
        }
        boolean z2 = childAdapterPosition == 0;
        if (childAdapterPosition == b4a.c(recyclerView.getAdapter()) - 1) {
            jpf jpfVar = this.c;
            if (((jpfVar == null || (uIBlockList = (UIBlockList) jpfVar.invoke()) == null) ? null : uIBlockList.A) == null) {
                z = true;
                i = catalogDataType != null ? -1 : a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                int i4 = s;
                int i5 = q;
                int i6 = r;
                int i7 = pca.j;
                switch (i) {
                    case 1:
                        int i8 = z2 ? d ? i4 : i5 : 0;
                        if (!z) {
                            i4 = 0;
                        } else if (!d) {
                            i4 = i5;
                        }
                        Pair pair3 = new Pair(Integer.valueOf(i8), Integer.valueOf(i4));
                        intValue = ((Number) pair3.d()).intValue();
                        intValue2 = ((Number) pair3.g()).intValue();
                        rect2 = new Rect(intValue, 0, intValue2, 0);
                        break;
                    case 2:
                    case 3:
                        int i9 = z2 ? d ? i4 : i5 : 0;
                        if (!z) {
                            i4 = 0;
                        } else if (!d) {
                            i4 = i5;
                        }
                        Pair pair4 = new Pair(Integer.valueOf(i9), Integer.valueOf(i4));
                        intValue = ((Number) pair4.d()).intValue();
                        intValue2 = ((Number) pair4.g()).intValue();
                        rect2 = new Rect(intValue, 0, intValue2, 0);
                        break;
                    case 4:
                        int i10 = z2 ? d ? i6 : i7 : 0;
                        if (!z) {
                            i6 = 0;
                        } else if (!d) {
                            i6 = i7;
                        }
                        Pair pair5 = new Pair(Integer.valueOf(i10), Integer.valueOf(i6));
                        intValue = ((Number) pair5.d()).intValue();
                        intValue2 = ((Number) pair5.g()).intValue();
                        rect2 = new Rect(intValue, 0, intValue2, 0);
                        break;
                    case 5:
                        int i11 = catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1;
                        if (i11 == 1) {
                            i2 = z2 ? d ? i6 : i7 : 0;
                            if (!z) {
                                i6 = 0;
                            } else if (!d) {
                                i6 = i7;
                            }
                            i3 = i6;
                        } else if (i11 != 2) {
                            pair = null;
                            if (pair != null) {
                                intValue = ((Number) pair.d()).intValue();
                                intValue2 = ((Number) pair.g()).intValue();
                                rect2 = new Rect(intValue, 0, intValue2, 0);
                                break;
                            }
                        } else {
                            i3 = pca.g;
                            int i12 = pca.n;
                            int i13 = t;
                            i2 = z2 ? d ? i13 : i12 : i3;
                            if (z) {
                                i3 = d ? i13 : i12;
                            }
                        }
                        pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
                        if (pair != null) {
                        }
                        break;
                    case 6:
                        if ((catalogViewType != null ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] : -1) == 1) {
                            int i14 = pca.f;
                            int i15 = pca.m;
                            int i16 = z2 ? d ? i15 : i7 : i14;
                            if (!z) {
                                i7 = i14;
                            } else if (d) {
                                i7 = i15;
                            }
                            pair2 = new Pair(Integer.valueOf(i16), Integer.valueOf(i7));
                        } else {
                            pair2 = null;
                        }
                        if (pair2 != null) {
                            intValue = ((Number) pair2.d()).intValue();
                            intValue2 = ((Number) pair2.g()).intValue();
                            rect2 = new Rect(intValue, 0, intValue2, 0);
                            break;
                        }
                        break;
                }
                if (rect2 == null) {
                    rect.set(rect2);
                    return;
                } else {
                    super.getItemOffsets(rect, view, recyclerView, a0Var);
                    return;
                }
            }
        }
        z = false;
        if (catalogDataType != null) {
        }
        int i42 = s;
        int i52 = q;
        int i62 = r;
        int i72 = pca.j;
        switch (i) {
        }
        if (rect2 == null) {
        }
    }
}
