package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.HashSet;
import kotlin.Pair;

/* compiled from: SearchAllCatalogVerticalDecorator.kt */
/* loaded from: classes5.dex */
public final class vmh0 extends sca {
    public final boolean q;
    public Boolean r;

    /* compiled from: SearchAllCatalogVerticalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MINIAPPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public vmh0(boolean z) {
        this.q = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if ((r2 != null ? r2.d : null) != com.vk.catalog2.common.dto.api.CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean d;
        boolean z;
        int[] iArr;
        int i;
        Pair pair;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        if (lcaVar == null) {
            throw new IllegalStateException();
        }
        uuk uukVar = lcaVar.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Boolean bool = this.r;
        if (bool != null) {
            d = bool.booleanValue();
        } else {
            Context context = view.getContext();
            HashSet hashSet = iah0.a;
            d = fnj.d(context);
            this.r = Boolean.valueOf(d);
        }
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition);
        boolean z2 = false;
        if (uIBlock != null) {
            CatalogDataType catalogDataType = uIBlock.e;
            CatalogViewType catalogViewType = uIBlock.d;
            UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition - 1);
            boolean z3 = childAdapterPosition == 0;
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            this.b.getClass();
            boolean z4 = childAdapterPosition == b4a.c(adapter2) - 1;
            if (catalogViewType.l()) {
            }
            if (catalogViewType != CatalogViewType.HEADER_COMPACT || z4) {
                z = false;
                if (!z || ((i = (iArr = a.$EnumSwitchMapping$1)[catalogDataType.ordinal()]) == 1 || i == 2 ? catalogViewType == CatalogViewType.MAP_PREVIEW : i == 3 ? catalogViewType == CatalogViewType.SYNTHETIC_LIST_FOLLOWERS : i == 4 && catalogViewType != CatalogViewType.HEADER_LARGE)) {
                    z2 = z;
                } else {
                    int i2 = iArr[catalogDataType.ordinal()];
                    int i3 = sca.m;
                    int i4 = sca.h;
                    switch (i2) {
                        case 1:
                        case 2:
                            pair = new Pair(Integer.valueOf(this.q ? 0 : sca.i), 0);
                            break;
                        case 3:
                            pair = new Pair(Integer.valueOf(sca.l), 0);
                            break;
                        case 4:
                            pair = new Pair(Integer.valueOf(sca.f), 0);
                            break;
                        case 5:
                            pair = new Pair(Integer.valueOf(sca.k), Integer.valueOf(i3));
                            break;
                        case 6:
                        case 7:
                            pair = new Pair(Integer.valueOf(i4), 0);
                            break;
                        case 8:
                            pair = new Pair(Integer.valueOf(i4), Integer.valueOf(i3));
                            break;
                    }
                    int intValue = ((Number) pair.d()).intValue();
                    int intValue2 = ((Number) pair.g()).intValue();
                    int i5 = d ? intValue2 : 0;
                    if (!z3) {
                        intValue = 0;
                    }
                    if (!d) {
                        intValue2 = 0;
                    }
                    rect.set(i5, intValue, intValue2, 0);
                    z2 = true;
                }
                if (catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_USERS) {
                    if ((uIBlock2 != null ? uIBlock2.d : null) == CatalogViewType.HEADER_COMPACT) {
                        rect.top -= sca.c;
                    }
                }
            }
            z = true;
            if (z) {
            }
            z2 = z;
            if (catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_USERS) {
            }
        }
        if (z2) {
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, a0Var);
    }

    @Override // xsna.sca
    public final void l(UIBlock uIBlock, UIBlock uIBlock2, Rect rect) {
        CatalogViewType catalogViewType = uIBlock2 != null ? uIBlock2.d : null;
        int i = catalogViewType == null ? -1 : a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i == 1) {
            rect.set(0, 0, 0, sca.d);
        } else if (i != 2) {
            super.l(uIBlock, uIBlock2, rect);
        } else {
            rect.set(0, 0, 0, sca.f);
        }
    }
}
