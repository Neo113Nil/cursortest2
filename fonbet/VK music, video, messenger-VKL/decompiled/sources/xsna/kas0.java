package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.core.apps.BuildInfo;
import java.util.List;
import kotlin.Pair;

/* compiled from: VideoCatalogVerticalDecorator.kt */
/* loaded from: classes16.dex */
public final class kas0 extends sca {
    public final boolean q;
    public Boolean r;
    public final boolean s = BuildInfo.q();
    public final bpn0 t = new bpn0(new o2a0(16));

    /* compiled from: VideoCatalogVerticalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kas0(boolean z) {
        this.q = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean d;
        Pair pair;
        boolean z;
        int i;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        if (lcaVar == null) {
            throw new RuntimeException();
        }
        uuk uukVar = lcaVar.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z2 = childAdapterPosition == 0;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        this.b.getClass();
        boolean z3 = childAdapterPosition == b4a.c(adapter2) - 1;
        Boolean bool = this.r;
        if (bool != null) {
            d = bool.booleanValue();
        } else {
            d = fnj.d(view.getContext());
            this.r = Boolean.valueOf(d);
        }
        UIBlock uIBlock = (UIBlock) uukVar.c(childAdapterPosition);
        if (uIBlock == null) {
            return;
        }
        CatalogViewType catalogViewType = uIBlock.d;
        CatalogDataType catalogDataType = uIBlock.e;
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition + 1);
        int i2 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        bpn0 bpn0Var = this.t;
        int i3 = sca.o;
        boolean z4 = this.q;
        int i4 = sca.k;
        int i5 = sca.m;
        if (i2 == 1) {
            pair = new Pair(Integer.valueOf(i4), Integer.valueOf(i5));
        } else if (i2 == 2) {
            pair = new Pair(Integer.valueOf(i4), Integer.valueOf((z4 && ((Boolean) bpn0Var.getValue()).booleanValue()) ? i3 : i5));
        } else if (i2 == 3) {
            pair = new Pair(0, Integer.valueOf(i5));
        } else if (i2 != 4) {
            if (this.s) {
                List l = e43.l(CatalogViewType.HEADER_COMPACT, CatalogViewType.HEADER_LARGE, CatalogViewType.HEADER);
                if (catalogDataType == CatalogDataType.DATA_TYPE_NONE && l.contains(catalogViewType) && d) {
                    rect.set(i5, 0, 0, sca.d);
                    z = true;
                    if (catalogDataType == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
                        if ((uIBlock2 != null ? uIBlock2.d : null) == CatalogViewType.SLIDER) {
                            rect.bottom += sca.i;
                        }
                        if (d) {
                            rect.left += i5;
                            rect.right += i5;
                        }
                    }
                    List l2 = e43.l(CatalogViewType.LARGE_LIST, CatalogViewType.LARGE_LIST_INFINITE, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE);
                    i = CatalogDataType.b.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                    if ((i != 6 || i == 7) && l2.contains(catalogViewType)) {
                        rect.bottom = i3;
                    }
                    if (!z) {
                        super.getItemOffsets(rect, view, recyclerView, a0Var);
                        return;
                    } else {
                        if (!z3 || (uIBlock instanceof UIBlockSeparator)) {
                            return;
                        }
                        rect.bottom += i5;
                        return;
                    }
                }
            }
            z = false;
            if (catalogDataType == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
            }
            List l22 = e43.l(CatalogViewType.LARGE_LIST, CatalogViewType.LARGE_LIST_INFINITE, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE);
            i = CatalogDataType.b.$EnumSwitchMapping$0[catalogDataType.ordinal()];
            if (i != 6) {
            }
            rect.bottom = i3;
            if (!z) {
            }
        } else {
            pair = new Pair(0, Integer.valueOf(i5));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        int i6 = d ? intValue2 : 0;
        if (!z2) {
            intValue = 0;
        }
        if (!d) {
            intValue2 = 0;
        }
        rect.set(i6, intValue, intValue2, (z4 && ((Boolean) bpn0Var.getValue()).booleanValue()) ? sca.n : 0);
        z = true;
        if (catalogDataType == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
        }
        List l222 = e43.l(CatalogViewType.LARGE_LIST, CatalogViewType.LARGE_LIST_INFINITE, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE);
        i = CatalogDataType.b.$EnumSwitchMapping$0[catalogDataType.ordinal()];
        if (i != 6) {
        }
        rect.bottom = i3;
        if (!z) {
        }
    }

    @Override // xsna.sca
    public final void l(UIBlock uIBlock, UIBlock uIBlock2, Rect rect) {
        super.l(uIBlock, uIBlock2, rect);
        if (epx.f(this.r, Boolean.TRUE) && this.s) {
            rect.left += sca.m;
        }
    }
}
