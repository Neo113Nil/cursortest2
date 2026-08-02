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
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.drm0;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivInputView.kt */
/* loaded from: classes7.dex */
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<a.h> {
    private final /* synthetic */ DivHolderViewMixin<a.h> $$delegate_0;
    private String _hint;
    private boolean accessibilityEnabled;
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;
    private InputFocusTracker focusTracker;
    private final Drawable nativeBackground;
    private final List<izs<Editable, s3q0>> onTextChangedActions;
    private TextWatcher textChangeWatcher;

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.divInputStyle : i);
    }

    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(izs<? super Editable, s3q0> izsVar) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    List list;
                    list = DivInputView.this.onTextChangedActions;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((izs) it.next()).invoke(editable);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(izsVar);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            save = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        float f = scrollX;
        float f2 = scrollY;
        save = canvas.save();
        try {
            canvas.translate(f, f2);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f, -f2);
            super.draw(canvas);
            canvas.translate(f, f2);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.accessibilityEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public a.h getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public InputFocusTracker getFocusTracker$div_release() {
        return this.focusTracker;
    }

    public Drawable getNativeBackground$div_release() {
        return this.nativeBackground;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.$$delegate_0.onBoundsChanged(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? onCreateInputConnection : new InputConnectionWrapper(onCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$onCreateInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(CharSequence charSequence, int i) {
                TextView.OnEditorActionListener onEditorActionListener;
                if (epx.f(charSequence, "\n")) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(KeyEvent keyEvent) {
                TextView.OnEditorActionListener onEditorActionListener;
                if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        InputFocusTracker focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.inputFocusChanged(getTag(), this, z);
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((getInputType() & 131072) != 0 && (i == 66 || i == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
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

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(a.h hVar) {
        this.$$delegate_0.setDiv(hVar);
    }

    public void setEnabled$div_release(boolean z) {
        this.enabled = z;
        setFocusable(z);
        setFocusableInTouchMode(z);
    }

    public void setFocusTracker$div_release(InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public void setInputHint(String str) {
        CharSequence contentDescription;
        this._hint = str;
        CharSequence charSequence = str;
        if (getAccessibilityEnabled$div_release()) {
            if ((str == null || str.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                charSequence = null;
            } else if (str == null || str.length() == 0) {
                charSequence = getContentDescription();
            } else {
                CharSequence contentDescription2 = getContentDescription();
                charSequence = str;
                if (contentDescription2 != null) {
                    charSequence = str;
                    if (contentDescription2.length() != 0) {
                        charSequence = drm0.s0(str, JwtParser.SEPARATOR_CHAR) + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(charSequence);
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        if (getInputType() == i) {
            return;
        }
        super.setInputType(i);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (epx.f(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        super.setOnEditorActionListener(onEditorActionListener);
        this.editorActionListener = onEditorActionListener;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = context.getDrawable(getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }
}
