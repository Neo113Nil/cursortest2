package com.yandex.passport.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import defpackage.tls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/yandex/passport/internal/widget/KeyboardDetectorLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "calculateHeightChanges", "()Z", "showed", "Lzy11;", "onKeyboardStatusChanged", "(Z)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lkotlin/Function1;", "listener", "addKeyboardStateChangedListener", "(Ltls;)V", "removeKeyboardStateChangedListener", "lastHeightDifference", CA20Status.STATUS_USER_I, "", "listeners", "Ljava/util/List;", "currentState", "Z", "Companion", "com/yandex/passport/internal/widget/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardDetectorLayout extends FrameLayout {
    public static final int $stable = 8;
    public static final e Companion = new e();
    private static final int MINIMAL_KEYBOARD_HEIGHT_DP_LANDSCAPE = 140;
    private static final int MINIMAL_KEYBOARD_HEIGHT_DP_PORTRAIT = 200;
    private boolean currentState;
    private int lastHeightDifference;
    private final List<tls> listeners;

    public KeyboardDetectorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.listeners = new ArrayList();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.passport.internal.widget.d
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean _init_$lambda$0;
                _init_$lambda$0 = KeyboardDetectorLayout._init_$lambda$0(KeyboardDetectorLayout.this);
                return _init_$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(KeyboardDetectorLayout keyboardDetectorLayout) {
        boolean calculateHeightChanges = keyboardDetectorLayout.calculateHeightChanges();
        if (calculateHeightChanges) {
            keyboardDetectorLayout.requestLayout();
        }
        return !calculateHeightChanges;
    }

    private final boolean calculateHeightChanges() {
        int height = getRootView().getHeight() - getMeasuredHeight();
        int c = com.yandex.passport.legacy.d.c(com.yandex.passport.legacy.d.g(this) ? 140 : 200, getContext());
        boolean z = this.lastHeightDifference != height;
        boolean z2 = height > c;
        this.currentState = z2;
        this.lastHeightDifference = height;
        if (z) {
            onKeyboardStatusChanged(z2);
        }
        return z;
    }

    private final void onKeyboardStatusChanged(boolean showed) {
        this.currentState = showed;
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Boolean.valueOf(showed));
        }
    }

    public final void addKeyboardStateChangedListener(tls listener) {
        this.listeners.add(listener);
        listener.invoke(Boolean.valueOf(this.currentState));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    public final void removeKeyboardStateChangedListener(tls listener) {
        this.listeners.remove(listener);
    }

    public KeyboardDetectorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ KeyboardDetectorLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public KeyboardDetectorLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
