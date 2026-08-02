package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import kotlin.Pair;

/* compiled from: CommunityCatalogGridDecorator.kt */
/* loaded from: classes16.dex */
public final class htg extends yog0 {
    public final oca v = new oca();

    /* compiled from: CommunityCatalogGridDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.HEADER_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.PREVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static Pair n(int i, int i2, int i3, int i4) {
        int i5 = (((i4 - 1) * i2) + (i * 2)) / i4;
        int b = ir.b(i2, i5, i3, i);
        return new Pair(Integer.valueOf(b), Integer.valueOf(i5 - b));
    }

    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new IllegalStateException("Catalog adapter is not attached to parent");
        }
        uuk uukVar = a2.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition);
        if (uIBlock == null) {
            return;
        }
        CatalogDataType catalogDataType = uIBlock.e;
        CatalogViewType catalogViewType = uIBlock.d;
        int[] iArr = a.$EnumSwitchMapping$1;
        int i = iArr[catalogViewType.ordinal()];
        int i2 = sca.h;
        int i3 = sca.k;
        oca ocaVar = this.v;
        if (i != 1) {
            if (i != 2) {
                ocaVar.getItemOffsets(rect, view, recyclerView, a0Var);
            } else {
                int i4 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    int i5 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
                    GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
                    int i6 = bVar.f;
                    int i7 = bVar.g;
                    Pair n = n(sca.m, i3, i6 / i7, i5 / i7);
                    rect.set(((Number) n.d()).intValue(), i2, ((Number) n.g()).intValue(), i2);
                } else {
                    ocaVar.getItemOffsets(rect, view, recyclerView, a0Var);
                }
            }
        } else if (a.$EnumSwitchMapping$0[catalogDataType.ordinal()] == 1) {
            int i8 = ((GridLayoutManager) recyclerView.getLayoutManager()).s;
            GridLayoutManager.b bVar2 = (GridLayoutManager.b) view.getLayoutParams();
            int i9 = bVar2.f;
            int i10 = bVar2.g;
            Pair n2 = n(i3, i2, i9 / i10, i8 / i10);
            rect.set(((Number) n2.d()).intValue(), 0, ((Number) n2.g()).intValue(), 0);
        } else {
            ocaVar.getItemOffsets(rect, view, recyclerView, a0Var);
        }
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition - 1);
        UIBlock uIBlock3 = (UIBlock) uukVar.c(childAdapterPosition + 1);
        int i11 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        if (i11 == 1) {
            int i12 = iArr[catalogViewType.ordinal()];
            if (i12 == 4) {
                if (yog0.m(uIBlock3)) {
                    rect.bottom += sca.j;
                    return;
                }
                return;
            } else {
                if (i12 == 5 && childAdapterPosition == 0) {
                    rect.top += i3;
                    return;
                }
                return;
            }
        }
        int i13 = sca.f;
        if (i11 == 3) {
            if (iArr[catalogViewType.ordinal()] == 3 && yog0.m(uIBlock2)) {
                rect.top += i13;
                return;
            }
            return;
        }
        if (i11 == 4 && iArr[catalogViewType.ordinal()] == 6 && yog0.m(uIBlock3)) {
            rect.bottom += i13;
        }
    }
}
