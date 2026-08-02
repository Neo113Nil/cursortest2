package com.ybsdk.widgets.common.keyboard.delegators;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.dzh0;
import defpackage.fch0;
import defpackage.fkx;
import defpackage.nyg0;
import defpackage.sls;
import defpackage.ung0;
import defpackage.vix;
import defpackage.wm60;
import defpackage.xm60;
import defpackage.zm60;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/widgets/common/keyboard/delegators/KeyboardImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lxm60;", "type", "Lzy11;", "renderBiometricButton", "(Lxm60;)V", "renderBackButton", "()V", "Lzm60;", "render", "(Lzm60;)V", "Lkotlin/Function0;", "onItemClicked", "Lsls;", "getOnItemClicked", "()Lsls;", "setOnItemClicked", "(Lsls;)V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeyboardImageView extends AppCompatImageView {
    private sls onItemClicked;

    public KeyboardImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onItemClicked = new vix(1);
        setBackgroundResource(nyg0.ybsdk_keyboard_item_background);
        setScaleType(ImageView.ScaleType.CENTER);
        b.z(this, b.g(ung0.ybColor_textIcon_primary, this));
    }

    private final void renderBackButton() {
        setId(fch0.ybsdkNumberKeyboardButtonBackspace);
        setContentDescription(getContext().getText(dzh0.ybsdk_pin_backspace_accessibility_text));
        setImageResource(nyg0.ybsdk_ic_backspace);
        setOnClickListener(new fkx(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBackButton$lambda$2(KeyboardImageView keyboardImageView, View view) {
        keyboardImageView.onItemClicked.invoke();
    }

    private final void renderBiometricButton(xm60 type) {
        setContentDescription(getContext().getString(dzh0.ybsdk_pin_accessibility_biometric_button));
        boolean z = type.a;
        setImportantForAccessibility(z ? 1 : 4);
        setVisibility(z ? 0 : 8);
        if (z) {
            setImageResource(nyg0.ybsdk_ic_fingerprint);
            setOnClickListener(new fkx(this, 0));
        } else {
            setImageDrawable(null);
            setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBiometricButton$lambda$1(KeyboardImageView keyboardImageView, View view) {
        keyboardImageView.onItemClicked.invoke();
    }

    public final sls getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void render(zm60 type) {
        if (type.equals(wm60.a)) {
            renderBackButton();
        } else if (type instanceof xm60) {
            renderBiometricButton((xm60) type);
        }
    }

    public final void setOnItemClicked(sls slsVar) {
        this.onItemClicked = slsVar;
    }

    public /* synthetic */ KeyboardImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
