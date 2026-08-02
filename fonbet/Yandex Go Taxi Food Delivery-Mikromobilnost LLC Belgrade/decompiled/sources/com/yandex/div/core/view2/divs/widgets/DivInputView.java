package com.yandex.div.core.view2.divs.widgets;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div2.DivBorder;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.aw5;
import defpackage.evu0;
import defpackage.f1k;
import defpackage.fng0;
import defpackage.jl40;
import defpackage.jzv;
import defpackage.msk;
import defpackage.nsk;
import defpackage.p2k;
import defpackage.tls;
import defpackage.zdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u0019\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014¢\u0006\u0004\b5\u00106J)\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ%\u0010I\u001a\u00020\u000f2\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020\u000f0FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J!\u0010O\u001a\u0002072\u0006\u0010L\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010[\u001a\u00020\u000f2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\b[\u0010\\R\"\u0010_\u001a\n ^*\u0004\u0018\u00010]0]8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010k\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020\u000f0F0j8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010)8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010B8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\br\u0010sR*\u0010u\u001a\u0002072\u0006\u0010t\u001a\u0002078\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR*\u0010{\u001a\u0002072\u0006\u0010t\u001a\u0002078\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b{\u0010v\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR \u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\u000e\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R#\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0087\u0001\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010xR\u001f\u0010\u008a\u0001\u001a\u0002078\u0016@\u0016X\u0096\u000f¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010x\"\u0005\b\u0089\u0001\u0010zR\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\r0j8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\t8SX\u0092\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Lmsk;", "Lp2k;", "Lzdk;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "", "hint", "setInputHint", "(Ljava/lang/String;)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/CharSequence;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/TextView$OnEditorActionListener;", "l", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "Lkotlin/Function1;", "Landroid/text/Editable;", "action", "addAfterTextChangeAction", "(Ltls;)V", "removeAfterTextChangeListener", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "type", "setInputType", "(I)V", "Landroid/text/method/KeyListener;", "keyListener", "setKeyListener", "(Landroid/text/method/KeyListener;)V", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "nativeBackground", "Landroid/graphics/drawable/Drawable;", "getNativeBackground$div_release", "()Landroid/graphics/drawable/Drawable;", "Ljzv;", "focusTracker", "Ljzv;", "getFocusTracker$div_release", "()Ljzv;", "setFocusTracker$div_release", "(Ljzv;)V", "", "onTextChangedActions", "Ljava/util/List;", "Landroid/text/TextWatcher;", "textChangeWatcher", "Landroid/text/TextWatcher;", "_hint", "Ljava/lang/String;", "editorActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "value", BackendConfig.Restrictions.ENABLED, "Z", "getEnabled", "()Z", "setEnabled$div_release", "(Z)V", "accessibilityEnabled", "getAccessibilityEnabled$div_release", "setAccessibilityEnabled$div_release", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Lp2k;", "setDiv", "(Lp2k;)V", "div", "isTransient", "getNeedClipping", "setNeedClipping", "needClipping", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "getNativeBackgroundResId", "()I", "nativeBackgroundResId", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivInputView extends SuperLineHeightEditText implements msk, zdk {
    private final /* synthetic */ nsk $$delegate_0;
    private String _hint;
    private boolean accessibilityEnabled;
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;
    private jzv focusTracker;
    private final Drawable nativeBackground;
    private final List<tls> onTextChangedActions;
    private TextWatcher textChangeWatcher;

    public DivInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
        this.nativeBackground = context.getDrawable(getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }

    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(tls action) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    List list;
                    list = DivInputView.this.onTextChangedActions;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((tls) it.next()).invoke(s);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(action);
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            save = canvas.save();
            try {
                divBorderDrawer.b(canvas);
                super.draw(canvas);
                divBorderDrawer.c(canvas);
                return;
            } finally {
            }
        }
        float f = scrollX;
        float f2 = scrollY;
        save = canvas.save();
        try {
            canvas.translate(f, f2);
            divBorderDrawer.b(canvas);
            canvas.translate(-f, -f2);
            super.draw(canvas);
            canvas.translate(f, f2);
            divBorderDrawer.c(canvas);
        } finally {
        }
    }

    /* renamed from: getAccessibilityEnabled$div_release, reason: from getter */
    public boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public p2k getDiv() {
        return (p2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getFocusTracker$div_release, reason: from getter */
    public jzv getFocusTracker() {
        return this.focusTracker;
    }

    /* renamed from: getNativeBackground$div_release, reason: from getter */
    public Drawable getNativeBackground() {
        return this.nativeBackground;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    @Override // defpackage.ugk
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.b.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.a(width, height);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? onCreateInputConnection : new InputConnectionWrapper(onCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$onCreateInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(CharSequence text, int newCursorPosition) {
                TextView.OnEditorActionListener onEditorActionListener;
                if (jl40.l(text, "\n")) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(text, newCursorPosition);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(KeyEvent event) {
                TextView.OnEditorActionListener onEditorActionListener;
                if ((event.getKeyCode() == 66 || event.getKeyCode() == 160) && event.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, event);
                    }
                }
                return super.sendKeyEvent(event);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        jzv focusTracker = getFocusTracker();
        if (focusTracker != null) {
            Object tag = getTag();
            if (!focusTracker.b) {
                if (focused) {
                    focusTracker.a = tag;
                    jzv.d = new WeakReference(this);
                    setSelection(length());
                } else if (!focused) {
                    focusTracker.a = null;
                    jzv.d = null;
                }
            }
        }
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((getInputType() & 131072) != 0 && (keyCode == 66 || keyCode == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, event);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    public void setAccessibilityEnabled$div_release(boolean z) {
        this.accessibilityEnabled = z;
        setInputHint(this._hint);
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence contentDescription) {
        super.setContentDescription(contentDescription);
        setInputHint(this._hint);
    }

    public void setEnabled$div_release(boolean z) {
        this.enabled = z;
        setFocusable(z);
        setFocusableInTouchMode(z);
    }

    public void setFocusTracker$div_release(jzv jzvVar) {
        this.focusTracker = jzvVar;
    }

    public void setInputHint(String hint) {
        CharSequence contentDescription;
        this._hint = hint;
        CharSequence charSequence = hint;
        if (getAccessibilityEnabled()) {
            if ((hint == null || hint.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                charSequence = null;
            } else if (hint == null || hint.length() == 0) {
                charSequence = getContentDescription();
            } else {
                CharSequence contentDescription2 = getContentDescription();
                charSequence = hint;
                if (contentDescription2 != null) {
                    charSequence = hint;
                    if (contentDescription2.length() != 0) {
                        charSequence = evu0.n0(hint, '.') + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(charSequence);
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        if (getInputType() == type) {
            return;
        }
        super.setInputType(type);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (jl40.l(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(TextView.OnEditorActionListener l) {
        super.setOnEditorActionListener(l);
        this.editorActionListener = l;
    }

    @Override // defpackage.zdk
    public /* bridge */ /* synthetic */ void startDivAnimation() {
        super.startDivAnimation();
    }

    @Override // defpackage.zdk
    public /* bridge */ /* synthetic */ void stopDivAnimation() {
        super.stopDivAnimation();
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @Override // defpackage.msk
    public void setDiv(p2k p2kVar) {
        this.$$delegate_0.c = p2kVar;
    }

    public DivInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divInputStyle : i);
    }

    public DivInputView(Context context) {
        this(context, null, 0, 6, null);
    }
}
