package com.yandex.go.superapp.orders.card.header.trails;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b6w;
import defpackage.im70;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lbm;
import defpackage.lhc;
import defpackage.mn70;
import defpackage.nac;
import defpackage.nn70;
import defpackage.nwy0;
import defpackage.pav;
import defpackage.qje;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.uh6;
import defpackage.uh60;
import defpackage.w511;
import defpackage.xng0;
import defpackage.y6i0;
import defpackage.yu0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RoundedCornersImageView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002;BBk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u0015*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u0015*\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u001d\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J7\u0010-\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020'H\u0016¢\u0006\u0004\b6\u00107R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardIconStackView;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "outlineColor", "Lpav;", "imageLoader", "Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardIconStackView$Order;", "order", "Lkotlin/Function1;", "imageSizeDp", "imageCornerRadiusDp", "imageShiftDp", "<init>", "(Landroid/content/Context;Lsls;Lpav;Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardIconStackView$Order;Ltls;Ltls;Ltls;)V", "", "Lim70;", "uiState", "Lzy11;", "configureChildViews", "(Ljava/util/List;)V", "addOutlinedImageView", "()V", "createRoundedImageView", "()Landroid/view/ViewGroup;", "Landroid/view/View;", "render", "(Landroid/view/View;Lim70;)V", "Landroid/graphics/Rect;", "rect", "layout", "(Landroid/view/View;Landroid/graphics/Rect;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "setOutlineColor", "(I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "allowTraverse", "()Z", "Lsls;", "Lpav;", "Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardIconStackView$Order;", "Lnn70;", "dimens", "Lnn70;", "tmpChildRect", "Landroid/graphics/Rect;", "currentUiState", "Ljava/util/List;", "Order", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCardIconStackView extends ViewGroup implements nwy0 {
    private List<im70> currentUiState;
    private final nn70 dimens;
    private final pav imageLoader;
    private final Order order;
    private final sls outlineColor;
    private final Rect tmpChildRect;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/OrderCardIconStackView$Order;", "", "Descending", "Ascending", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Order {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order Ascending;
        public static final Order Descending;

        static {
            Order order = new Order("Descending", 0);
            Descending = order;
            Order order2 = new Order("Ascending", 1);
            Ascending = order2;
            Order[] orderArr = {order, order2};
            $VALUES = orderArr;
            $ENTRIES = kotlin.enums.a.a(orderArr);
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }

    public OrderCardIconStackView(Context context, sls slsVar, pav pavVar, Order order, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        super(context);
        this.outlineColor = slsVar;
        this.imageLoader = pavVar;
        this.order = order;
        this.dimens = new nn70(context, tlsVar, tlsVar2, tlsVar3);
        this.tmpChildRect = new Rect();
        this.currentUiState = EmptyList.a;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    private final void addOutlinedImageView() {
        addView(createRoundedImageView(), 0, new ViewGroup.LayoutParams(-2, -2));
    }

    private final void configureChildViews(List<im70> uiState) {
        int size = uiState.size() - getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            addOutlinedImageView();
        }
        int childCount = getChildCount() - 1;
        int size2 = uiState.size();
        if (size2 <= childCount) {
            while (true) {
                removeViewAt(childCount);
                if (childCount == size2) {
                    break;
                } else {
                    childCount--;
                }
            }
        }
        for (Object obj : uiState) {
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            im70 im70Var = (im70) obj;
            View childAt = getChildAt(i);
            if (childAt != null) {
                render(childAt, im70Var);
            }
            i = i3;
        }
    }

    private final ViewGroup createRoundedImageView() {
        RoundedCornersImageView roundedCornersImageView = new RoundedCornersImageView(getContext(), null, 0, 6, null);
        roundedCornersImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(roundedCornersImageView, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = this.dimens.g;
        frameLayout.setPadding(i, i, i, i);
        return frameLayout;
    }

    private final void layout(View view, Rect rect) {
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void render(View view, im70 im70Var) {
        float[] fArr;
        lbm a;
        int intValue = ((Number) this.outlineColor.invoke()).intValue();
        float a2 = this.dimens.a(getChildCount()) + r1.g;
        Integer num = null;
        if (a2 == 0.0f || Float.isNaN(a2) || Float.isInfinite(a2)) {
            fArr = null;
        } else {
            fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = a2;
            }
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(intValue);
        view.setBackground(shapeDrawable);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        RoundedCornersImageView roundedCornersImageView = childAt instanceof RoundedCornersImageView ? (RoundedCornersImageView) childAt : null;
        if (roundedCornersImageView == null) {
            return;
        }
        nn70 nn70Var = this.dimens;
        int childCount = getChildCount();
        int intValue2 = ((Number) nn70Var.e.computeIfAbsent(Integer.valueOf(childCount), new yu0(15, new mn70(nn70Var, childCount, 2)))).intValue();
        c.D(intValue2, intValue2, roundedCornersImageView);
        roundedCornersImageView.setCornerRadius(this.dimens.a(getChildCount()));
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(roundedCornersImageView)) == null) {
            return;
        }
        Integer num2 = im70Var.b;
        if (num2 != null && num2.intValue() != 0) {
            num = num2;
        }
        if (num != null) {
            ((nac) a).e(num.intValue());
        } else {
            ((nac) a).i = new uh60(17, roundedCornersImageView);
        }
        String str = im70Var.a;
        if (str == null) {
            str = "";
        }
        ((nac) a).c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0$1(RoundedCornersImageView roundedCornersImageView) {
        roundedCornersImageView.setImageDrawable(null);
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        configureChildViews(this.currentUiState);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.tmpChildRect.set(0, top, 0, bottom);
        int i = a.a[this.order.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View v = uh6.v(this, i2);
                if (i2 > 0) {
                    int b = this.dimens.b(getChildCount());
                    Rect rect = this.tmpChildRect;
                    rect.left += b;
                    rect.right += b;
                } else {
                    this.tmpChildRect.set(-this.dimens.g, 0, getChildCount() > 1 ? v.getMeasuredHeight() - this.dimens.g : getMeasuredWidth() + this.dimens.g, bottom - top);
                }
                layout(v, this.tmpChildRect);
            }
            return;
        }
        b6w l = y6i0.l(y6i0.n(0, getChildCount()));
        int i3 = l.a;
        int i4 = l.b;
        int i5 = l.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            View v2 = uh6.v(this, i3);
            int childCount2 = getChildCount() - 1;
            Rect rect2 = this.tmpChildRect;
            if (i3 < childCount2) {
                rect2.left = rect2.right - this.dimens.b(getChildCount());
                Rect rect3 = this.tmpChildRect;
                rect3.right = v2.getMeasuredHeight() + rect3.left;
            } else {
                rect2.set(0, 0, v2.getMeasuredHeight(), bottom - top);
            }
            layout(v2, this.tmpChildRect);
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2 = 0;
        b6w l = y6i0.l(y6i0.n(0, getChildCount()));
        int i3 = l.a;
        int i4 = l.b;
        int i5 = l.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            i = 0;
        } else {
            int i6 = i3;
            int i7 = 0;
            while (true) {
                View v = uh6.v(this, i6);
                v.measure(widthMeasureSpec, heightMeasureSpec);
                int measuredHeight = v.getMeasuredHeight();
                if (measuredHeight >= i2) {
                    i2 = measuredHeight;
                }
                i7 += i6 < getChildCount() + (-1) ? this.dimens.b(getChildCount()) : v.getMeasuredHeight();
                if (i6 == i4) {
                    break;
                } else {
                    i6 += i5;
                }
            }
            i = i2;
            i2 = i7;
        }
        int paddingEnd = getPaddingEnd() + getPaddingStart() + i2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i;
        if (this.order == Order.Ascending) {
            paddingEnd -= this.dimens.g * 2;
        }
        setMeasuredDimension(paddingEnd, paddingBottom);
    }

    public final void setOutlineColor(int backgroundColor) {
        float[] fArr;
        if (this.order == Order.Ascending) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int d = lhc.d(backgroundColor, qje.t(xng0.bgMain, getContext()));
            float a = this.dimens.a(getChildCount());
            if (a == 0.0f || Float.isNaN(a) || Float.isInfinite(a)) {
                fArr = null;
            } else {
                fArr = new float[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    fArr[i2] = a;
                }
            }
            RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            shapeDrawable.getPaint().setColor(d);
            childAt.setBackground(shapeDrawable);
        }
    }

    public final void render(List<im70> uiState) {
        if (jl40.l(uiState, this.currentUiState)) {
            return;
        }
        this.currentUiState = uiState;
        configureChildViews(uiState);
    }
}
