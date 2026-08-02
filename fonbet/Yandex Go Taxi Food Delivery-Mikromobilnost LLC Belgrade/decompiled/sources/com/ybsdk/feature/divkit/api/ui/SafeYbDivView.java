package com.ybsdk.feature.divkit.api.ui;

import android.graphics.Canvas;
import android.util.AttributeSet;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.api.ui.SafeYbDivView;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.b7l0;
import defpackage.c7l;
import defpackage.hpl0;
import defpackage.j0g;
import defpackage.jpl0;
import defpackage.kqe0;
import defpackage.omk;
import defpackage.sls;
import defpackage.w9m;
import defpackage.wlp;
import defpackage.x4c;
import defpackage.zmk;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 02\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\"\u0010!J!\u0010'\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/ybsdk/feature/divkit/api/ui/SafeYbDivView;", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/Div2Context;", "divContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "call", "safeCall", "(Lsls;)V", "T", "onError", "(Lsls;Lsls;)Ljava/lang/Object;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "Lomk;", Constants.KEY_DATA, "Lzmk;", "tag", "setData", "(Lomk;Lzmk;)Z", "Lc7l;", "divRemoteConfig", "Lc7l;", "getDivRemoteConfig", "()Lc7l;", "setDivRemoteConfig", "(Lc7l;)V", "Companion", "jpl0", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SafeYbDivView extends Div2View {
    private static final jpl0 Companion = new jpl0();

    @Deprecated
    public static final String ERROR_MESSAGE = "DivKitView error";
    public c7l divRemoteConfig;

    public /* synthetic */ SafeYbDivView(Div2Context div2Context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 dispatchDraw$lambda$3(SafeYbDivView safeYbDivView, Canvas canvas) {
        super.dispatchDraw(canvas);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 draw$lambda$2(SafeYbDivView safeYbDivView, Canvas canvas) {
        super.draw(canvas);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onLayout$lambda$1(SafeYbDivView safeYbDivView, boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onMeasure$lambda$0(SafeYbDivView safeYbDivView, int i, int i2) {
        super.onMeasure(i, i2);
        return zy11.a;
    }

    private final <T> T safeCall(sls onError, sls call) {
        if (!((CommonFeatureFlag) ((b) ((j0g) getDivRemoteConfig()).b).d(wlp.n0).getData()).isEnabled()) {
            return (T) call.invoke();
        }
        try {
            return (T) call.invoke();
        } catch (Exception e) {
            x4c.g(ERROR_MESSAGE, e, null, null, 12);
            return (T) onError.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setData$lambda$4() {
        return false;
    }

    @Override // com.yandex.div.core.view2.Div2View, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        safeCall(new hpl0(this, canvas, 0));
    }

    @Override // com.yandex.div.core.view2.Div2View, android.view.View
    public void draw(Canvas canvas) {
        safeCall(new hpl0(this, canvas, 1));
    }

    public final c7l getDivRemoteConfig() {
        c7l c7lVar = this.divRemoteConfig;
        if (c7lVar != null) {
            return c7lVar;
        }
        return null;
    }

    @Override // com.yandex.div.core.view2.Div2View, com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        safeCall(new sls() { // from class: ipl0
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onLayout$lambda$1;
                onLayout$lambda$1 = SafeYbDivView.onLayout$lambda$1(SafeYbDivView.this, changed, left, top, right, bottom);
                return onLayout$lambda$1;
            }
        });
    }

    @Override // com.yandex.div.core.view2.Div2View, com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        safeCall(new w9m(this, widthMeasureSpec, heightMeasureSpec, 2));
    }

    @Override // com.yandex.div.core.view2.Div2View
    public boolean setData(omk data, zmk tag) {
        return ((Boolean) safeCall(new b7l0(13), new kqe0(19, this, data, tag))).booleanValue();
    }

    public final void setDivRemoteConfig(c7l c7lVar) {
        this.divRemoteConfig = c7lVar;
    }

    @Override // com.yandex.div.core.view2.Div2View
    public void switchToState(long j) {
        switchToState(j, true);
    }

    public SafeYbDivView(Div2Context div2Context, AttributeSet attributeSet) {
        this(div2Context, attributeSet, 0, 4, null);
    }

    public SafeYbDivView(Div2Context div2Context) {
        this(div2Context, null, 0, 6, null);
    }

    public SafeYbDivView(Div2Context div2Context, AttributeSet attributeSet, int i) {
        super(div2Context, attributeSet, i);
    }

    private final void safeCall(sls call) {
        if (((CommonFeatureFlag) ((b) ((j0g) getDivRemoteConfig()).b).d(wlp.n0).getData()).isEnabled()) {
            try {
                call.invoke();
                return;
            } catch (Exception e) {
                x4c.g(ERROR_MESSAGE, e, null, null, 12);
                return;
            }
        }
        call.invoke();
    }
}
