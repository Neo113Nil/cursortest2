package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RoundedCornersCatalogVerticalDecorator.kt */
/* loaded from: classes16.dex */
public class yog0 extends sca {
    public final int q;
    public final int r;
    public final Rect s;
    public final Path t;
    public final Paint u;

    public yog0() {
        int a = iah0.a(18);
        this.q = a;
        this.r = a * 2;
        this.s = new Rect();
        this.t = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.u = paint;
    }

    public static boolean m(UIBlock uIBlock) {
        return (uIBlock instanceof UIBlockSeparator) && e43.l(CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND, CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT).contains(((UIBlockSeparator) uIBlock).d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        yog0 yog0Var = this;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        yog0Var.b.getClass();
        lca a = b4a.a(adapter);
        if (a == null) {
            throw new RuntimeException();
        }
        uuk uukVar = a.c;
        int f = e3m.f(R.attr.vk_ui_background, recyclerView2.getContext());
        Paint paint = yog0Var.u;
        paint.setColor(f);
        ArrayList arrayList = (ArrayList) a.y0();
        int i = 0;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UIBlock uIBlock = (UIBlock) it.next();
                if (uIBlock.d == CatalogViewType.GRID && uIBlock.e == CatalogDataType.DATA_TYPE_GROUPS_ITEMS) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!(i5 < recyclerView2.getChildCount())) {
                Integer valueOf = z ? Integer.valueOf(i3) : null;
                int childCount = recyclerView2.getChildCount();
                while (i < childCount) {
                    View childAt = recyclerView2.getChildAt(i);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
                    UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition - 1);
                    UIBlock uIBlock3 = (UIBlock) uukVar.c(childAdapterPosition + i2);
                    Rect rect = yog0Var.s;
                    rect.setEmpty();
                    yog0Var.getItemOffsets(rect, childAt, recyclerView2, a0Var);
                    float top = childAt.getTop() - rect.top;
                    float bottom = childAt.getBottom() + rect.bottom;
                    float left = childAt.getLeft() - rect.left;
                    float right = childAt.getRight() + rect.right;
                    boolean m = m(uIBlock2);
                    int i6 = yog0Var.r;
                    int i7 = yog0Var.q;
                    int i8 = childCount;
                    Path path = yog0Var.t;
                    if (m) {
                        path.reset();
                        path.moveTo(left, top);
                        float f2 = i7 + top;
                        path.lineTo(left, f2);
                        float f3 = i6;
                        float f4 = top + f3;
                        path.addArc(left, top, left + f3, f4, 180.0f, 90.0f);
                        path.lineTo(left, top);
                        canvas.drawPath(path, paint);
                        path.reset();
                        path.moveTo(right, top);
                        path.lineTo(right, f2);
                        path.addArc(right - f3, top, right, f4, 360.0f, -90.0f);
                        path.lineTo(right, top);
                        canvas.drawPath(path, paint);
                    }
                    if (m(uIBlock3)) {
                        if (valueOf != null && i == valueOf.intValue()) {
                            left = recyclerView.getLeft() + recyclerView.getPaddingLeft();
                        }
                        if (valueOf != null && i == valueOf.intValue()) {
                            right = recyclerView.getRight() - recyclerView.getPaddingRight();
                        }
                        path.reset();
                        path.moveTo(left, bottom);
                        float f5 = bottom - i7;
                        path.lineTo(left, f5);
                        float f6 = i6;
                        float f7 = bottom - f6;
                        path.addArc(left, f7, left + f6, bottom, 180.0f, -90.0f);
                        path.lineTo(left, bottom);
                        canvas.drawPath(path, paint);
                        path.reset();
                        path.moveTo(right, bottom);
                        path.lineTo(right, f5);
                        path.arcTo(right - f6, f7, right, bottom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
                        path.lineTo(right, bottom);
                        canvas.drawPath(path, paint);
                    }
                    i++;
                    yog0Var = this;
                    recyclerView2 = recyclerView;
                    childCount = i8;
                    i2 = 1;
                }
                return;
            }
            int i9 = i5 + 1;
            View childAt2 = recyclerView2.getChildAt(i5);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            if (childAt2 instanceof VkTile) {
                i3 = i4;
            }
            i4++;
            i5 = i9;
        }
    }
}
