package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import kotlin.Pair;

/* compiled from: VideoCatalogHorizontalDecorator.kt */
/* loaded from: classes16.dex */
public class i9s0 extends pca {
    public static final int q = iah0.a(10);
    public static final int r = iah0.a(22);
    public static final int s = iah0.a(30);
    public static final int t = iah0.a(32);

    /* compiled from: VideoCatalogHorizontalDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006d  */
    @Override // xsna.pca, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean d;
        boolean z;
        int i;
        Pair pair;
        int intValue;
        int intValue2;
        Pair pair2;
        UIBlockList uIBlockList;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.d.getClass();
        UIBlock b = b4a.b(childAdapterPosition, adapter);
        Rect rect2 = null;
        CatalogViewType catalogViewType = b != null ? b.d : null;
        CatalogDataType catalogDataType = b != null ? b.e : null;
        CatalogViewStyle catalogViewStyle = b != null ? b.l : null;
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
                i = catalogDataType != null ? -1 : a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
                int i2 = pca.k;
                if (i != 1) {
                    if ((catalogViewType != null ? a.$EnumSwitchMapping$0[catalogViewType.ordinal()] : -1) == 1) {
                        boolean z3 = fxc0.B().J().I() && !d;
                        int i3 = z3 ? i2 : z2 ? d ? s : pca.n : pca.h;
                        if (!z || !z3) {
                            i2 = z ? d ? r : q : 0;
                        }
                        pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        intValue = ((Number) pair.d()).intValue();
                        intValue2 = ((Number) pair.g()).intValue();
                        rect2 = new Rect(intValue, 0, intValue2, 0);
                    }
                } else if (i == 2) {
                    if (catalogViewType == CatalogViewType.VIDEO_SLIDER || catalogViewType == CatalogViewType.SYNTHETIC_VIDEO_SLIDER_INTERACTIVE) {
                        int a2 = iah0.a(16);
                        int a3 = iah0.a(12);
                        int a4 = iah0.a(40);
                        if (childAdapterPosition <= 0) {
                            a3 = 0;
                        }
                        if (childAdapterPosition == 0) {
                            intValue = a2;
                        } else if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
                            intValue = a3;
                            intValue2 = a4;
                            rect2 = new Rect(intValue, 0, intValue2, 0);
                        } else {
                            intValue = a3;
                        }
                        intValue2 = 0;
                        rect2 = new Rect(intValue, 0, intValue2, 0);
                    }
                } else if (i == 3) {
                    if ((catalogViewType != null ? a.$EnumSwitchMapping$0[catalogViewType.ordinal()] : -1) == 1) {
                        if ((catalogViewStyle instanceof CatalogActionFilterStyle) && ((CatalogActionFilterStyle) catalogViewStyle).b == CatalogActionFilterStyle.Style.INLINE) {
                            int i4 = z2 ? 0 : pca.i;
                            if (!z) {
                                i2 = 0;
                            } else if (d) {
                                i2 = t;
                            }
                            pair2 = new Pair(Integer.valueOf(i4), Integer.valueOf(i2));
                        } else {
                            pair2 = null;
                        }
                        if (pair2 != null) {
                            intValue = ((Number) pair2.d()).intValue();
                            intValue2 = ((Number) pair2.g()).intValue();
                            rect2 = new Rect(intValue, 0, intValue2, 0);
                        }
                    }
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
        int i22 = pca.k;
        if (i != 1) {
        }
        if (rect2 == null) {
        }
    }
}
