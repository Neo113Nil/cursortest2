package com.ybsdk.widgets.common;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.bmg0;
import defpackage.cg91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pk31;
import defpackage.sm91;
import defpackage.t3i0;
import defpackage.ung0;
import defpackage.w9c;
import defpackage.x9c;
import defpackage.y9c;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 @2\u00020\u0001:\u0004\u001c ABB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010%R*\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00103\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\u0016\u00104\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00108R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00106R\u0011\u0010?\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0010¨\u0006C"}, d2 = {"Lcom/ybsdk/widgets/common/CodeInputView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "initialize", "", "createInitialText", "()Ljava/lang/String;", "Landroid/text/Editable;", "editable", "doActionAfterTextChanged", "(Landroid/text/Editable;)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "length", "setCodeLength", "(I)V", "Ly9c;", "onCodeReadyListener", "setOnCodeReadyListener", "(Ly9c;)V", "Lx9c;", "onCodeEditingListener", "setOnCodeEditingListener", "(Lx9c;)V", "showLoading", "()V", "stopLoading", "smsCode", "setCode", "(Ljava/lang/String;)V", "reactOnError", "", "value", "hasError", "Z", "getHasError", "()Z", "setHasError", "(Z)V", "isNormalizingCodeText", "isNormalizingSelection", "normalTextColor", CA20Status.STATUS_USER_I, "errorTextColor", "Ly9c;", "Lx9c;", "Landroid/animation/ObjectAnimator;", "loadingAnimator", "Landroid/animation/ObjectAnimator;", "codeLength", "getCode", AuthSdkActivity.RESPONSE_TYPE_CODE, "Companion", "EmptyActionModeCallback", "w9c", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CodeInputView extends AppCompatEditText {
    private static final w9c Companion = new w9c();

    @Deprecated
    public static final long LOADING_ANIMATION_DURATION = 450;

    @Deprecated
    public static final float LOADING_ANIMATION_LOWEST_ALPHA = 0.5f;

    @Deprecated
    public static final int MAX_LENGTH = 4;

    @Deprecated
    public static final char PLACEHOLDER = 8226;
    private int codeLength;
    private int errorTextColor;
    private boolean hasError;
    private boolean isNormalizingCodeText;
    private boolean isNormalizingSelection;
    private ObjectAnimator loadingAnimator;
    private int normalTextColor;
    private x9c onCodeEditingListener;
    private y9c onCodeReadyListener;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/widgets/common/CodeInputView$EmptyActionModeCallback;", "Landroid/view/ActionMode$Callback;", "<init>", "()V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Lzy11;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyActionModeCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.codeLength = 4;
        initialize(context, attributeSet, i);
    }

    private final String createInitialText() {
        StringBuilder sb = new StringBuilder();
        int i = this.codeLength;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(PLACEHOLDER);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doActionAfterTextChanged(Editable editable) {
        Character ch;
        String str;
        CharSequence charSequence;
        if (editable == null || this.isNormalizingCodeText) {
            return;
        }
        this.isNormalizingCodeText = true;
        String obj = editable.toString();
        int length = obj.length() - 1;
        Character ch2 = null;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = obj.charAt(length);
                if (charAt == 8226) {
                    ch = Character.valueOf(charAt);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        ch = null;
        if (ch != null) {
        }
        int length2 = editable.length();
        int i2 = this.codeLength;
        if (length2 > i2) {
            length2 = i2;
        }
        String obj2 = editable.subSequence(0, length2).toString();
        int i3 = this.codeLength;
        if (i3 >= 0) {
            if (i3 <= obj2.length()) {
                charSequence = obj2.subSequence(0, obj2.length());
            } else {
                StringBuilder sb = new StringBuilder(i3);
                sb.append((CharSequence) obj2);
                int length3 = i3 - obj2.length();
                if (1 <= length3) {
                    int i4 = 1;
                    while (true) {
                        sb.append(PLACEHOLDER);
                        if (i4 == length3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                charSequence = sb;
            }
            str = charSequence.toString();
        } else {
            ny61.g(oyr.j(i3, "Desired length ", " is less than zero."));
            str = null;
        }
        int length4 = str.length() - 1;
        if (length4 >= 0) {
            while (true) {
                int i5 = length4 - 1;
                char charAt2 = str.charAt(length4);
                if (charAt2 == 8226) {
                    ch2 = Character.valueOf(charAt2);
                    break;
                } else if (i5 < 0) {
                    break;
                } else {
                    length4 = i5;
                }
            }
        }
        if (ch2 == null) {
        }
        setText(str);
        this.isNormalizingCodeText = false;
        for (int i6 = 0; i6 < String.valueOf(getText()).length(); i6++) {
        }
    }

    private final void initialize(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, t3i0.YbSdkCodeInputView, defStyleAttr, 0);
        try {
            int currentTextColor = getCurrentTextColor();
            this.normalTextColor = currentTextColor;
            this.errorTextColor = obtainStyledAttributes.getColor(t3i0.YbSdkCodeInputView_ybsdk_errorTextColor, currentTextColor);
            obtainStyledAttributes.recycle();
            setText(createInitialText());
            setSelection(0);
            setTransformationMethod(null);
            setCustomSelectionActionModeCallback(new EmptyActionModeCallback());
            setCustomInsertionActionModeCallback(new EmptyActionModeCallback());
            addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.widgets.common.CodeInputView$initialize$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    CodeInputView.this.doActionAfterTextChanged(s);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final String getCode() {
        String str;
        Editable text = getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (charAt != 8226) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.isNormalizingSelection) {
            return;
        }
        Editable text = getText();
        if (text != null) {
            this.isNormalizingSelection = true;
            int length = text.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (text.charAt(i) == 8226) {
                    break;
                } else {
                    i++;
                }
            }
            selStart = i > -1 ? i : text.length();
            setSelection(selStart, selStart);
            this.isNormalizingSelection = false;
            selEnd = selStart;
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    public final void reactOnError() {
        cg91.c(this, pk31.c);
        sm91.h(bmg0.ybsdk_animation_wiggle, this);
    }

    public final void setCode(String smsCode) {
        setText(smsCode);
    }

    public final void setCodeLength(int length) {
        if (this.codeLength != length) {
            this.codeLength = length;
            setEms(length);
            setMaxEms(this.codeLength);
            doActionAfterTextChanged(getText());
        }
    }

    public final void setHasError(boolean z) {
        if (this.hasError == z) {
            return;
        }
        setTextColor(z ? this.errorTextColor : this.normalTextColor);
        this.hasError = z;
    }

    public final void setOnCodeEditingListener(x9c onCodeEditingListener) {
    }

    public final void setOnCodeReadyListener(y9c onCodeReadyListener) {
    }

    public final void showLoading() {
        ObjectAnimator objectAnimator = this.loadingAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, CaretView.ALPHA_PROPERTY, 0.5f);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(450L);
        final float alpha = getAlpha();
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.CodeInputView$showLoading$lambda$12$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                CodeInputView.this.setAlpha(alpha);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.loadingAnimator = ofFloat;
    }

    public final void stopLoading() {
        ObjectAnimator objectAnimator = this.loadingAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ung0.ybsdk_widgetsCommon_codesInput);
    }

    public CodeInputView(Context context) {
        this(context, null);
    }
}
