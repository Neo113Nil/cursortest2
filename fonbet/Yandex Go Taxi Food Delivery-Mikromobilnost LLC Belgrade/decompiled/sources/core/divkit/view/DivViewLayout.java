package core.divkit.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import core.divkit.container.DivViewContainer;
import defpackage.i3y;
import defpackage.lpl;
import defpackage.omk;
import defpackage.s7s0;
import defpackage.sls;
import defpackage.tjr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.xfz;
import defpackage.zjr;
import defpackage.zmk;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0017\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J7\u0010&\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0014¢\u0006\u0004\b*\u0010+J7\u00101\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R*\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u00020!2\u0006\u0010:\u001a\u00020!8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcore/divkit/view/DivViewLayout;", "Lcore/divkit/container/DivViewContainer;", "Lbpl;", "Landroid/content/Context;", "context", "Lcom/yandex/div/core/view2/Div2View;", "divView", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/view2/Div2View;)V", "Landroid/view/View;", "child", "Lzy11;", "addViewInternal", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "wrapLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "toContentMode", "()V", "toPlaceholderMode", "", "index", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "Lomk;", Constants.KEY_DATA, "Lzmk;", "tag", "", "setData", "(Lomk;Lzmk;)Z", "Lkotlin/Function1;", "onComplete", "setDataAsync", "(Lomk;Lzmk;Ltls;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/div/core/view2/Div2View;", "getDivView", "()Lcom/yandex/div/core/view2/Div2View;", "value", "placeholderHeight", CA20Status.STATUS_USER_I, "getPlaceholderHeight", "()I", "setPlaceholderHeight", "(I)V", "isInContentMode", "Z", "setInContentMode", "(Z)V", "Lzjr;", "logger", "Lzjr;", "getLayout", "()Lcore/divkit/view/DivViewLayout;", "layout", "Companion", "lpl", "divkit-wrap_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivViewLayout extends DivViewContainer {
    public static final lpl Companion = new lpl();
    private final Div2View divView;
    private boolean isInContentMode;
    private final zjr logger;
    private int placeholderHeight;

    /* loaded from: classes4.dex */
    public static final class a implements sls {
        public static final a a = new a();

        @Override // defpackage.sls
        public final Object invoke() {
            return b.f();
        }
    }

    public DivViewLayout(Context context, Div2View div2View) {
        super(context);
        this.divView = div2View;
        this.isInContentMode = true;
        this.logger = new zjr(xfz.b("DivViewLayout"));
        addViewInternal(getDivView());
    }

    private final void addViewInternal(View child) {
        super.addView(child, 0, wrapLayoutParams(child.getLayoutParams()));
    }

    private final void setInContentMode(boolean z) {
        if (this.isInContentMode != z) {
            this.isInContentMode = z;
            requestLayout();
        }
    }

    public static final DivViewLayout wrap(Div2View div2View, ViewGroup.LayoutParams layoutParams) {
        Companion.getClass();
        DivViewLayout divViewLayout = new DivViewLayout(div2View.getContext(), div2View);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        divViewLayout.setLayoutParams(layoutParams);
        return divViewLayout;
    }

    private final ViewGroup.LayoutParams wrapLayoutParams(ViewGroup.LayoutParams params) {
        return params != null ? new ViewGroup.LayoutParams(params) : generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        StackTraceElement stackTraceElement;
        String str;
        zjr zjrVar = this.logger;
        String type = ErrorTypes.DIVKIT_VIEW_CONTAINER_ERROR.getType();
        i3y a2 = kotlin.a.a(a.a);
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        i3y a3 = xfz.a(new Pair("errorType", type));
        zjrVar.d(FlexLogLevel.ERROR, "Unable to add view to DivViewLayout", xfz.c(a2, a3), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.isInContentMode) {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public Div2View getDivView() {
        return this.divView;
    }

    @Override // core.divkit.container.DivViewContainer
    public int getPlaceholderHeight() {
        return this.placeholderHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.isInContentMode) {
            View childAt = getChildAt(0);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.isInContentMode) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPlaceholderHeight(), 1073741824));
            return;
        }
        View childAt = getChildAt(0);
        measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public boolean setData(omk data, zmk tag) {
        return getDivView().setData(data, tag);
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public void setDataAsync(omk data, zmk tag, tls onComplete) {
        getDivView().setDataAsync(data, tag, onComplete);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        getDivView().setLayoutParams(wrapLayoutParams(params));
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public void setPlaceholderHeight(int i) {
        if (this.placeholderHeight != i) {
            this.placeholderHeight = i;
            requestLayout();
        }
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public void toContentMode() {
        if (this.isInContentMode) {
            return;
        }
        setInContentMode(true);
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public void toPlaceholderMode() {
        if (this.isInContentMode) {
            setInContentMode(false);
        }
    }

    @Override // core.divkit.container.DivViewContainer, defpackage.bpl
    public DivViewLayout getLayout() {
        return this;
    }
}
