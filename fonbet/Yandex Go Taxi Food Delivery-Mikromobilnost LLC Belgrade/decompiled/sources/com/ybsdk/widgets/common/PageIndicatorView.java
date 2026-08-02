package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rje;
import defpackage.u290;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.w690;
import defpackage.x690;
import defpackage.y690;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00039:;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00101R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101¨\u0006<"}, d2 = {"Lcom/ybsdk/widgets/common/PageIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "indicatorStartPosX", "indicatorPosY", "Lzy11;", "drawIndicators", "(Landroid/graphics/Canvas;FF)V", "indicatorPosX", "color", "drawIndicator", "(Landroid/graphics/Canvas;FFI)V", "oldIndicatorPosX", "getNewIndicatorPosX", "(F)F", "position", "", "isActive", "getColorByItemPosition", "(IZ)I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "attachToViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lcom/ybsdk/widgets/common/PageIndicatorView$a;", ClidProvider.STATE, "render", "(Lcom/ybsdk/widgets/common/PageIndicatorView$a;)V", "currentItemPosition", CA20Status.STATUS_USER_I, "Lcom/ybsdk/widgets/common/PageIndicatorView$a;", "Landroid/graphics/Paint;", "indicatorPaint", "Landroid/graphics/Paint;", "defaultColorActive", "defaultColorInactive", "Companion", "x690", "a", "w690", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageIndicatorView extends View {
    private static final w690 Companion = new w690();
    private static final int INDICATOR_BOTTOM_PADDING;
    private static final int INDICATOR_RIGHT_PADDING;
    private static final int INDICATOR_SIZE;
    private static final int INDICATOR_SIZE_WITH_RIGHT_PADDING;
    private int currentItemPosition;
    private final int defaultColorActive;
    private final int defaultColorInactive;
    private final Paint indicatorPaint;
    private a state;

    static {
        int q = kp50.q(6.0f);
        INDICATOR_RIGHT_PADDING = q;
        int q2 = kp50.q(6.0f);
        INDICATOR_SIZE = q2;
        INDICATOR_SIZE_WITH_RIGHT_PADDING = q2 + q;
        INDICATOR_BOTTOM_PADDING = kp50.q(8.0f);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.state = new a(0, 14);
        this.indicatorPaint = unr0.f(true);
        this.defaultColorActive = rje.a(context, ung0.ybColor_pager_indicator_active);
        this.defaultColorInactive = rje.a(context, ung0.ybColor_pager_indicator_inactive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachToRecyclerView$lambda$1(PageIndicatorView pageIndicatorView, int i) {
        if (pageIndicatorView.currentItemPosition != i) {
            pageIndicatorView.currentItemPosition = i;
            pageIndicatorView.invalidate();
        }
        return zy11.a;
    }

    private final void drawIndicator(Canvas canvas, float f, float f2, int i) {
        this.indicatorPaint.setColor(i);
        canvas.drawCircle(f, f2, INDICATOR_SIZE / 2.0f, this.indicatorPaint);
    }

    private final void drawIndicators(Canvas canvas, float indicatorStartPosX, float indicatorPosY) {
        int i = this.state.b;
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.currentItemPosition;
            drawIndicator(canvas, indicatorStartPosX, indicatorPosY, getColorByItemPosition(i3, i2 == i3));
            indicatorStartPosX = getNewIndicatorPosX(indicatorStartPosX);
            i2++;
        }
    }

    private final int getColorByItemPosition(int position, boolean isActive) {
        a aVar = this.state;
        if (isActive) {
            if (kotlin.collections.a.S(position, aVar.a) == null) {
                return this.defaultColorActive;
            }
            ny61.u();
            return 0;
        }
        if (kotlin.collections.a.S(position, aVar.a) == null) {
            return this.defaultColorInactive;
        }
        ny61.u();
        return 0;
    }

    private final float getNewIndicatorPosX(float oldIndicatorPosX) {
        return oldIndicatorPosX + INDICATOR_SIZE_WITH_RIGHT_PADDING;
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(new x690(new u290(2, this)));
    }

    public final void attachToViewPager(ViewPager2 viewPager) {
        viewPager.registerOnPageChangeCallback(new y690(this));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = INDICATOR_SIZE;
        int i2 = this.state.b;
        int i3 = i * i2;
        int max = Math.max(0, i2 - 1);
        int i4 = INDICATOR_RIGHT_PADDING;
        drawIndicators(canvas, Math.max((getWidth() - (Math.max(0, (max * i4) - i4) + i3)) / 2.0f, i / 2), getHeight() / 2.0f);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = INDICATOR_SIZE;
        int i2 = INDICATOR_RIGHT_PADDING;
        int max = Math.max(0, ((i + i2) * this.state.b) - i2);
        int i3 = (INDICATOR_BOTTOM_PADDING * 2) + i;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            max = Math.min(max, size);
        } else if (mode == 1073741824) {
            max = size;
        }
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size2);
        } else if (mode2 == 1073741824) {
            i3 = size2;
        }
        setMeasuredDimension(max, i3);
    }

    public final void render(a state) {
        if (jl40.l(this.state, state)) {
            return;
        }
        int i = this.state.b;
        int i2 = state.b;
        boolean z = i != i2;
        this.state = state;
        if (state.d) {
            setVisibility(i2 <= state.c ? 4 : 0);
        }
        if (z) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static final class a {
        public final List a;
        public final int b;
        public final int c;
        public final boolean d;

        public /* synthetic */ a(int i, int i2) {
            this(true, (i2 & 2) != 0 ? 0 : i, 1, EmptyList.a);
        }

        public static a a(a aVar, int i) {
            List list = aVar.a;
            return new a(aVar.d, aVar.b, i, list);
        }

        public final int b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "State(colorsList=" + this.a + ", elementsCount=" + this.b + ", hideOnElementsCount=" + this.c + ", internalVisibilityControl=" + this.d + Extension.C_BRAKE;
        }

        public a() {
            this(0, 15);
        }

        public a(boolean z, int i, int i2, List list) {
            this.a = list;
            this.b = i;
            this.c = i2;
            this.d = z;
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PageIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
