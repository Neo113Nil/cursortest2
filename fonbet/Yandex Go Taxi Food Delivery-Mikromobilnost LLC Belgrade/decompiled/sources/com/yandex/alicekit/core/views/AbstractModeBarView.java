package com.yandex.alicekit.core.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.alicekit.core.utils.OnFlingGestureListener;
import com.yandex.alicekit.core.views.AbstractModeBarView;
import com.yandex.alicekit.core.views.animator.DslAnimatorBuilder;
import com.yandex.alicekit.core.views.animator.a;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.a6c;
import defpackage.g8e;
import defpackage.hum;
import defpackage.jl40;
import defpackage.m810;
import defpackage.r5c;
import defpackage.scc;
import defpackage.sls;
import defpackage.t8;
import defpackage.tls;
import defpackage.w511;
import defpackage.y2t;
import defpackage.ydz;
import defpackage.zj2;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002pqB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H$¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000eH$¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u000eH$¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u001fJ7\u0010'\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u0007*\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J3\u00100\u001a\u00020\u0014*\u00020\u000e2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\r\u001a\u00028\u0000H\u0012¢\u0006\u0004\b2\u0010\u001dJ\u001f\u00104\u001a\u00020\u00142\u0006\u0010\r\u001a\u00028\u00002\u0006\u00103\u001a\u00020!H\u0012¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020!2\u0006\u00106\u001a\u00020)H\u0012¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020)09*\b\u0012\u0004\u0012\u00020)09H\u0012¢\u0006\u0004\b:\u0010;J\u001b\u0010?\u001a\u00020!*\u00020<2\u0006\u0010>\u001a\u00020=H\u0012¢\u0006\u0004\b?\u0010@J#\u0010?\u001a\u00020!*\u00020<2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)H\u0012¢\u0006\u0004\b?\u0010CJ,\u0010F\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00020\u000e0Dj\b\u0012\u0004\u0012\u00020\u000e`E2\u0006\u0010\r\u001a\u00028\u0000H\u0092\u0002¢\u0006\u0004\bF\u0010GJ4\u0010I\u001a\u00020!*\u0012\u0012\u0004\u0012\u00020\u000e0Dj\b\u0012\u0004\u0012\u00020\u000e`E2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\u000eH\u0092\u0002¢\u0006\u0004\bI\u0010JR0\u0010L\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0012@\u0012X\u0092.¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u000e0Dj\b\u0012\u0004\u0012\u00020\u000e`E8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020!8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00018\u00008\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b^\u0010_R(\u0010a\u001a\b\u0012\u0004\u0012\u00020!0`8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c\"\u0004\bd\u0010eR*\u0010\r\u001a\u00028\u00002\u0006\u0010f\u001a\u00028\u00008\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010_\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010\u001dR(\u0010m\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010f\u001a\u00020\u00078T@TX\u0094\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010\r\u001a\u00028\u0000*\u00020\u000e2\u0006\u0010f\u001a\u00028\u00008R@RX\u0092\u000e¢\u0006\f\u001a\u0004\bg\u0010n\"\u0004\bh\u0010o¨\u0006r"}, d2 = {"Lcom/yandex/alicekit/core/views/AbstractModeBarView;", "M", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initMode", "()Ljava/lang/Object;", "mode", "Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;", "createView", "(Ljava/lang/Object;)Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;", "Landroid/widget/LinearLayout$LayoutParams;", "createLayoutParams", "()Landroid/widget/LinearLayout$LayoutParams;", "Lzy11;", "makeInactive", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;)V", "makeActive", "", "modes", "init", "(Ljava/util/List;)V", "setModeSilently", "(Ljava/lang/Object;)V", "left", "()V", "right", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "", CaretView.ALPHA_PROPERTY, "(IF)I", "radius", "dx", "dy", "color", "shadow", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;IIII)V", "setActiveModeView", "animate", "invalidateModePosition", "(Ljava/lang/Object;Z)V", "delta", "validateRelativeTranslation", "(F)Z", "La6c;", "align", "(La6c;)La6c;", "Landroid/view/View;", "Landroid/view/MotionEvent;", "e", "contains", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", RemoteBioParameters.X, RemoteBioParameters.Y, "(Landroid/view/View;FF)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "get", "(Ljava/util/ArrayList;Ljava/lang/Object;)Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;", "view", "set", "(Ljava/util/ArrayList;Ljava/lang/Object;Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;)Z", "Lkotlin/Function1;", "onModeChange", "Ltls;", "getOnModeChange", "()Ltls;", "setOnModeChange", "(Ltls;)V", "allModes", "Ljava/util/List;", "allViews", "Ljava/util/ArrayList;", "isScrolling", "Z", "Ly2t;", "flingGestureDetector", "Ly2t;", "Landroid/graphics/Rect;", "containsTmpRect", "Landroid/graphics/Rect;", "scrollingMode", "Ljava/lang/Object;", "Lkotlin/Function0;", "isModeChangeEnabled", "Lsls;", "()Lsls;", "setModeChangeEnabled", "(Lsls;)V", "value", "getMode", "setMode", "getTextColor", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;)I", "setTextColor", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;I)V", "textColor", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;)Ljava/lang/Object;", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;Ljava/lang/Object;)V", "FlingGestureDetectorListener", "ModeView", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AbstractModeBarView<M> extends LinearLayout {
    private List<? extends M> allModes;
    private final ArrayList<ModeView> allViews;
    private final Rect containsTmpRect;
    private final y2t flingGestureDetector;
    private sls isModeChangeEnabled;
    private boolean isScrolling;
    private M mode;
    private tls onModeChange;
    private M scrollingMode;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/alicekit/core/views/AbstractModeBarView$FlingGestureDetectorListener;", "Lcom/yandex/alicekit/core/utils/OnFlingGestureListener;", "<init>", "(Lcom/yandex/alicekit/core/views/AbstractModeBarView;)V", "Lzy11;", "onLeftSwipe", "()V", "onRightSwipe", "Landroid/view/MotionEvent;", "e1", "e2", "", "distanceX", "distanceY", "", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "e", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FlingGestureDetectorListener extends OnFlingGestureListener {
        public FlingGestureDetectorListener() {
        }

        @Override // com.yandex.alicekit.core.utils.OnFlingGestureListener
        public void onLeftSwipe() {
            if (ydz.a.a()) {
                ydz.a();
            }
            AbstractModeBarView.this.left();
        }

        @Override // com.yandex.alicekit.core.utils.OnFlingGestureListener
        public void onRightSwipe() {
            if (ydz.a.a()) {
                ydz.a();
            }
            AbstractModeBarView.this.right();
        }

        @Override // com.yandex.alicekit.core.utils.OnFlingGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            if (!AbstractModeBarView.this.validateRelativeTranslation(-distanceX)) {
                return false;
            }
            if (ydz.a.a()) {
                ydz.a();
            }
            ((AbstractModeBarView) AbstractModeBarView.this).isScrolling = true;
            for (ModeView modeView : ((AbstractModeBarView) AbstractModeBarView.this).allViews) {
                modeView.setTranslationX(modeView.getTranslationX() - distanceX);
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.alicekit.core.utils.OnFlingGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            ArrayList<ModeView> arrayList = ((AbstractModeBarView) AbstractModeBarView.this).allViews;
            AbstractModeBarView<M> abstractModeBarView = AbstractModeBarView.this;
            for (ModeView modeView : arrayList) {
                if (abstractModeBarView.contains(modeView, e)) {
                    abstractModeBarView.setMode(abstractModeBarView.getMode(modeView));
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0014\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/alicekit/core/views/AbstractModeBarView$ModeView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ModeView extends TextView {
        public ModeView(Context context) {
            super(context);
            setTextSize(12.0f);
            setAllCaps(true);
            setLetterSpacing(0.1f);
            setGravity(17);
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (getLayoutParams().width > 0) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), heightMeasureSpec);
            }
        }
    }

    public AbstractModeBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.allViews = new ArrayList<>();
        this.flingGestureDetector = new y2t(context, new FlingGestureDetectorListener(), null);
        this.containsTmpRect = new Rect();
        this.isModeChangeEnabled = AbstractModeBarView$isModeChangeEnabled$1.w;
        this.mode = initMode();
        setOnTouchListener(new t8(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean _init_$lambda$2(AbstractModeBarView abstractModeBarView, View view, MotionEvent motionEvent) {
        if (!((Boolean) abstractModeBarView.getIsModeChangeEnabled().invoke()).booleanValue()) {
            return false;
        }
        if (abstractModeBarView.isScrolling && motionEvent.getAction() == 1) {
            abstractModeBarView.isScrolling = false;
            if (jl40.l(abstractModeBarView.getMode(), abstractModeBarView.scrollingMode)) {
                abstractModeBarView.invalidateModePosition(abstractModeBarView.getMode(), true);
            } else {
                M m = abstractModeBarView.scrollingMode;
                if (m != null) {
                    abstractModeBarView.setMode(m);
                }
            }
            abstractModeBarView.scrollingMode = null;
        }
        return abstractModeBarView.flingGestureDetector.a.onTouchEvent(motionEvent);
    }

    private a6c align(a6c a6cVar) {
        return ((Number) a6cVar.d()).floatValue() >= ((Number) a6cVar.e()).floatValue() ? a6cVar : new r5c(((Number) a6cVar.d()).floatValue(), ((Number) a6cVar.e()).floatValue());
    }

    private boolean contains(View view, float f, float f2) {
        Rect rect = this.containsTmpRect;
        view.getHitRect(rect);
        return rect.contains(m810.b(f), m810.b(f2));
    }

    private ModeView get(ArrayList<ModeView> arrayList, M m) {
        for (ModeView modeView : arrayList) {
            if (jl40.l(getMode(modeView), m)) {
                return modeView;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public M getMode(ModeView modeView) {
        return (M) modeView.getTag();
    }

    private void invalidateModePosition(M mode, boolean animate) {
        if (getWidth() == 0) {
            return;
        }
        ModeView modeView = get(this.allViews, mode);
        final float width = (getWidth() / 2.0f) - ((modeView.getWidth() / 2.0f) + modeView.getLeft());
        if (!animate) {
            Iterator<T> it = this.allViews.iterator();
            while (it.hasNext()) {
                ((ModeView) it.next()).setTranslationX(width);
            }
        } else {
            tls tlsVar = new tls() { // from class: com.yandex.alicekit.core.views.AbstractModeBarView$invalidateModePosition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    final AbstractModeBarView<M> abstractModeBarView = AbstractModeBarView.this;
                    final float f = width;
                    ((DslAnimatorBuilder) obj).targets(new tls() { // from class: com.yandex.alicekit.core.views.AbstractModeBarView$invalidateModePosition$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            hum humVar = (hum) obj2;
                            ArrayList arrayList = ((AbstractModeBarView) AbstractModeBarView.this).allViews;
                            final float f2 = f;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                new tls() { // from class: com.yandex.alicekit.core.views.AbstractModeBarView$invalidateModePosition$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        final a aVar = (a) obj3;
                                        final float f3 = f2;
                                        final float translationX = aVar.a.getTranslationX();
                                        aVar.b.invoke(new zj2(new tls() { // from class: com.yandex.alicekit.core.views.animator.ViewAnimatorBuilder$translationX$$inlined$onNewValue$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj4) {
                                                float floatValue = ((Number) obj4).floatValue();
                                                float f4 = translationX;
                                                aVar.a.setTranslationX(g8e.b(f3, f4, floatValue, f4));
                                                return zy11.a;
                                            }
                                        }));
                                        return zy11.a;
                                    }
                                }.invoke(new a((AbstractModeBarView.ModeView) it2.next(), humVar.a));
                            }
                            return zy11.a;
                        }
                    });
                    return zy11.a;
                }
            };
            DslAnimatorBuilder dslAnimatorBuilder = new DslAnimatorBuilder();
            tlsVar.invoke(dslAnimatorBuilder);
            dslAnimatorBuilder.start();
        }
    }

    private boolean set(ArrayList<ModeView> arrayList, M m, ModeView modeView) {
        setMode(modeView, m);
        return arrayList.add(modeView);
    }

    private void setActiveModeView(M mode) {
        ArrayList<ModeView> arrayList = this.allViews;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!jl40.l(getMode((ModeView) obj), mode)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            makeInactive((ModeView) it.next());
        }
        makeActive(get(this.allViews, mode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validateRelativeTranslation(float delta) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        ModeView modeView = (ModeView) kotlin.collections.a.P(this.allViews);
        ModeView modeView2 = (ModeView) kotlin.collections.a.Z(this.allViews);
        if (!align(new r5c(width - ((modeView2.getWidth() / 2.0f) + modeView2.getLeft()), width - ((modeView.getWidth() / 2.0f) + modeView.getLeft()))).b(Float.valueOf(modeView.getTranslationX() + delta))) {
            return false;
        }
        Iterator<ModeView> it = this.allViews.iterator();
        while (it.hasNext()) {
            ModeView next = it.next();
            if (contains(next, width, height)) {
                this.scrollingMode = getMode(next);
                setActiveModeView(getMode(next));
                return true;
            }
        }
        return true;
    }

    public int alpha(int i, float f) {
        return (16777215 & i) | (((int) ((f * 255.0f) + 0.5f)) << 24);
    }

    public abstract LinearLayout.LayoutParams createLayoutParams();

    public abstract ModeView createView(M mode);

    public tls getOnModeChange() {
        return this.onModeChange;
    }

    public int getTextColor(ModeView modeView) {
        return modeView.getTextColors().getDefaultColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(List<? extends M> modes) {
        this.allModes = modes;
        for (Object obj : modes) {
            ModeView createView = createView(obj);
            set(this.allViews, obj, createView);
            addView(createView, createLayoutParams());
        }
    }

    public abstract M initMode();

    /* renamed from: isModeChangeEnabled, reason: from getter */
    public sls getIsModeChangeEnabled() {
        return this.isModeChangeEnabled;
    }

    public void left() {
        if (((Boolean) getIsModeChangeEnabled().invoke()).booleanValue()) {
            List<? extends M> list = this.allModes;
            if (list == null) {
                list = null;
            }
            int indexOf = list.indexOf(getMode());
            if (indexOf == -1 || indexOf == 0) {
                return;
            }
            List<? extends M> list2 = this.allModes;
            setMode((list2 != null ? list2 : null).get(indexOf - 1));
        }
    }

    public abstract void makeActive(ModeView modeView);

    public abstract void makeInactive(ModeView modeView);

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (!changed || this.allViews.size() <= 0) {
            return;
        }
        setActiveModeView(getMode());
        invalidateModePosition(getMode(), false);
    }

    public void right() {
        if (((Boolean) getIsModeChangeEnabled().invoke()).booleanValue()) {
            List<? extends M> list = this.allModes;
            if (list == null) {
                list = null;
            }
            int indexOf = list.indexOf(getMode());
            if (indexOf == -1) {
                return;
            }
            List<? extends M> list2 = this.allModes;
            if (list2 == null) {
                list2 = null;
            }
            if (indexOf == scc.f(list2)) {
                return;
            }
            List<? extends M> list3 = this.allModes;
            setMode((list3 != null ? list3 : null).get(indexOf + 1));
        }
    }

    public void setMode(M m) {
        if (jl40.l(m, this.mode)) {
            return;
        }
        if (ydz.a.a()) {
            Objects.toString(m);
            ydz.a();
        }
        this.mode = m;
        tls onModeChange = getOnModeChange();
        if (onModeChange != null) {
            onModeChange.invoke(m);
        }
        setActiveModeView(m);
        if (this.isScrolling) {
            return;
        }
        invalidateModePosition(m, true);
    }

    public void setModeChangeEnabled(sls slsVar) {
        this.isModeChangeEnabled = slsVar;
    }

    public void setModeSilently(M mode) {
        tls onModeChange = getOnModeChange();
        setMode(mode);
        setOnModeChange(onModeChange);
    }

    public void setOnModeChange(tls tlsVar) {
        this.onModeChange = tlsVar;
    }

    public void setTextColor(ModeView modeView, int i) {
        modeView.setTextColor(i);
    }

    public void shadow(ModeView modeView, int i, int i2, int i3, int i4) {
        modeView.setShadowLayer(i, i2, i3, i4);
    }

    public M getMode() {
        return this.mode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean contains(View view, MotionEvent motionEvent) {
        return contains(view, motionEvent.getX(), motionEvent.getY());
    }

    private void setMode(ModeView modeView, M m) {
        modeView.setTag(m);
    }
}
