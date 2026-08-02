package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CommunityCatalogVerticalDecorator.kt */
/* loaded from: classes16.dex */
public final class itg extends yog0 {

    /* compiled from: CommunityCatalogVerticalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.b.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            throw new IllegalStateException("Catalog adapter is not attached to parent");
        }
        uuk uukVar = a2.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition - 1);
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition + 1);
        UIBlock uIBlock3 = (UIBlock) uukVar.c(childAdapterPosition);
        if (uIBlock3 == null) {
            return;
        }
        CatalogViewType catalogViewType = uIBlock3.d;
        int i = a.$EnumSwitchMapping$1[uIBlock3.e.ordinal()];
        int i2 = sca.f;
        if (i == 1) {
            if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 && yog0.m(uIBlock)) {
                rect.top += i2;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 4 && yog0.m(uIBlock2)) {
                rect.bottom += i2;
                return;
            }
            return;
        }
        int i3 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i3 == 2) {
            if (yog0.m(uIBlock2)) {
                rect.bottom += sca.j;
            }
        } else if (i3 == 3 && childAdapterPosition == 0) {
            rect.top += sca.k;
        }
    }
}
