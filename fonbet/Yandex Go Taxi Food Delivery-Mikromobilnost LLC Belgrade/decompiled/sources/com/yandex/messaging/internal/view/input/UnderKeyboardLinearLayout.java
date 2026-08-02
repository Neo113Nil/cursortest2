package com.yandex.messaging.internal.view.input;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import com.yandex.alicekit.core.views.BackHandlingLinearLayout;
import defpackage.gvg0;
import defpackage.jl40;
import defpackage.k751;
import defpackage.n751;
import defpackage.op31;
import defpackage.tx11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u00105\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/yandex/messaging/internal/view/input/UnderKeyboardLinearLayout;", "Lcom/yandex/alicekit/core/views/BackHandlingLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "hideKeyboard", "()V", "show", "hide", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "Ltx11;", "visibilityListener", "Ltx11;", "getVisibilityListener", "()Ltx11;", "setVisibilityListener", "(Ltx11;)V", "", "showAfterKeyboardCollapse", "Z", "keyboardVisible", "Ljava/lang/Boolean;", "lastLandscapeKeyboardSize", CA20Status.STATUS_USER_I, "lastPortraitKeyboardSize", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "isLandscape", "()Z", "getMinKeyboardHeight", "()I", "minKeyboardHeight", "", "getSharedPrefKey", "()Ljava/lang/String;", "sharedPrefKey", "value", "getKeyboardHeight", "setKeyboardHeight", "(I)V", "keyboardHeight", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnderKeyboardLinearLayout extends BackHandlingLinearLayout {
    public static final int $stable = 8;
    private Boolean keyboardVisible;
    private int lastLandscapeKeyboardSize;
    private int lastPortraitKeyboardSize;
    private SharedPreferences sharedPreferences;
    private boolean showAfterKeyboardCollapse;
    private tx11 visibilityListener;

    public /* synthetic */ UnderKeyboardLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final InputMethodManager getInputMethodManager() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    private final int getKeyboardHeight() {
        int i = isLandscape() ? this.lastLandscapeKeyboardSize : this.lastPortraitKeyboardSize;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            i = sharedPreferences.getInt(getSharedPrefKey(), 0);
        }
        return Math.max(getMinKeyboardHeight(), i);
    }

    private final int getMinKeyboardHeight() {
        return getResources().getDimensionPixelSize(gvg0.emoji_sticker_panel_height);
    }

    private final String getSharedPrefKey() {
        return isLandscape() ? "keyboard_height_land" : "keyboard_height_port";
    }

    private final void hideKeyboard() {
        getInputMethodManager().hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private final boolean isLandscape() {
        return getResources().getConfiguration().orientation == 2;
    }

    private final void setKeyboardHeight(int i) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        if (isLandscape()) {
            this.lastLandscapeKeyboardSize = i;
        } else {
            this.lastPortraitKeyboardSize = i;
        }
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putInt = edit.putInt(getSharedPrefKey(), i)) == null) {
            return;
        }
        putInt.apply();
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final tx11 getVisibilityListener() {
        return this.visibilityListener;
    }

    public final void hide() {
        setVisibility(8);
        getParent().requestLayout();
        tx11 tx11Var = this.visibilityListener;
        if (tx11Var != null) {
            tx11Var.g();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(this);
        if (a == null) {
            return super.onApplyWindowInsets(insets);
        }
        k751 k751Var = a.a;
        boolean q = k751Var.q(8);
        int i = k751Var.g(8).d;
        int i2 = k751Var.h(519).d;
        if (q) {
            setKeyboardHeight(i - i2);
        }
        this.keyboardVisible = Boolean.valueOf(q);
        if (this.showAfterKeyboardCollapse && !q) {
            this.showAfterKeyboardCollapse = false;
            setVisibility(0);
            getParent().requestLayout();
            tx11 tx11Var = this.visibilityListener;
            if (tx11Var != null) {
                tx11Var.f();
            }
        } else if (q && getVisibility() == 0) {
            setVisibility(8);
            getParent().requestLayout();
            tx11 tx11Var2 = this.visibilityListener;
            if (tx11Var2 != null) {
                tx11Var2.g();
            }
        }
        return super.onApplyWindowInsets(insets);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getVisibility() == 0 ? getKeyboardHeight() : 0, 1073741824));
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVisibilityListener(tx11 tx11Var) {
        this.visibilityListener = tx11Var;
    }

    public final void show() {
        if (getVisibility() == 0) {
            return;
        }
        if (this.keyboardVisible == null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            n751 a = op31.a(this);
            this.keyboardVisible = a != null ? Boolean.valueOf(a.a.q(8)) : null;
        }
        Boolean bool = this.keyboardVisible;
        if (bool == null) {
            this.showAfterKeyboardCollapse = true;
            hideKeyboard();
            requestApplyInsets();
        } else {
            if (jl40.l(bool, Boolean.TRUE)) {
                this.showAfterKeyboardCollapse = true;
                hideKeyboard();
                return;
            }
            setVisibility(0);
            tx11 tx11Var = this.visibilityListener;
            if (tx11Var != null) {
                tx11Var.f();
            }
        }
    }

    public UnderKeyboardLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UnderKeyboardLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public UnderKeyboardLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public UnderKeyboardLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
