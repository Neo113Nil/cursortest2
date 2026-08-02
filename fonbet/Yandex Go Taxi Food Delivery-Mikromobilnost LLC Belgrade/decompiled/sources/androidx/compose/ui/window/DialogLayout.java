package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.aii0;
import defpackage.bms;
import defpackage.bts;
import defpackage.bx60;
import defpackage.fid;
import defpackage.gfj;
import defpackage.m810;
import defpackage.n751;
import defpackage.oz40;
import defpackage.qm2;
import defpackage.tm2;
import defpackage.ttd;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJD\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0010H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010&\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0010¢\u0006\u0004\b$\u0010%J#\u0010+\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170)¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0017H\u0017¢\u0006\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R7\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170)2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\b+\u0010AR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010BR\u0016\u0010C\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lgfj;", "Lbx60;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "height", "getMaxDialogHeightExcludingInsets", "(Landroid/view/Window;I)I", "T", "unchangedValue", "Lkotlin/Function4;", "block", "insetValue", "(Ljava/lang/Object;Lbms;)Ljava/lang/Object;", "", "usePlatformDefaultWidth", "decorFitsSystemWindows", "Lzy11;", "updateProperties", "(ZZ)V", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui", "(ZIIII)V", "internalOnLayout", "Lttd;", "parent", "Lkotlin/Function0;", "content", "setContent", "(Lttd;Lwls;)V", "Landroid/view/View;", "v", "Ln751;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "isInsideContent", "(Landroid/view/MotionEvent;)Z", "Content", "(Lfid;I)V", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "content$delegate", "Loz40;", "getContent", "()Lwls;", "(Lwls;)V", "Z", "hasCalledSetLayout", "value", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DialogLayout extends AbstractComposeView implements gfj, bx60 {

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final oz40 content;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        ComposableSingletons$AndroidDialog_androidKt.a.getClass();
        this.content = androidx.compose.runtime.f.j(ComposableSingletons$AndroidDialog_androidKt.b);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(this, this);
        androidx.core.view.b.u(this, new f(this));
    }

    private final wls getContent() {
        return (wls) this.content.getValue();
    }

    private final int getMaxDialogHeightExcludingInsets(Window window, int height) {
        int i = Build.VERSION.SDK_INT;
        return i < 30 ? qm2.a.a(window) : i < 32 ? tm2.a.a(window) : height;
    }

    private final <T> T insetValue(T unchangedValue, bms block) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return (T) block.invoke(Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(max3), Integer.valueOf(max4));
            }
        }
        return unchangedValue;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1735448596);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DialogLayout.this.Content((fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // defpackage.gfj
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i = right - left;
        int i2 = bottom - top;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i2 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int maxDialogHeightExcludingInsets = (mode == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && getWindow().getAttributes().height == -2) ? this.decorFitsSystemWindows ? getMaxDialogHeightExcludingInsets(getWindow(), size2) : size2 + 1 : size2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i = size - paddingRight;
        if (i < 0) {
            i = 0;
        }
        int i2 = maxDialogHeightExcludingInsets - paddingBottom;
        int i3 = i2 >= 0 ? i2 : 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingBottom <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    public final boolean isInsideContent(MotionEvent event) {
        View childAt;
        int b;
        if (Math.abs(event.getX()) > Float.MAX_VALUE || Math.abs(event.getY()) > Float.MAX_VALUE || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = childAt.getLeft() + getLeft();
        int width = childAt.getWidth() + left;
        int top = childAt.getTop() + getTop();
        int height = childAt.getHeight() + top;
        int b2 = m810.b(event.getX());
        return left <= b2 && b2 <= width && top <= (b = m810.b(event.getY())) && b <= height;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return insets.a.n(max, max2, max3, max4);
            }
        }
        return insets;
    }

    public final void setContent(ttd parent, wls content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    public final void updateProperties(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        boolean z = (this.hasCalledSetLayout && usePlatformDefaultWidth == this.usePlatformDefaultWidth && decorFitsSystemWindows == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (z) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = usePlatformDefaultWidth ? -2 : -1;
            if (i == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    private final void setContent(wls wlsVar) {
        this.content.setValue(wlsVar);
    }
}
