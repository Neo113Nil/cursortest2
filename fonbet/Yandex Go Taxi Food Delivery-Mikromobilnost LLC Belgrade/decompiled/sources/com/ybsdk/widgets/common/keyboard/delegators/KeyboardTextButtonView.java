package com.ybsdk.widgets.common.keyboard.delegators;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import defpackage.cg91;
import defpackage.cqg0;
import defpackage.l1i0;
import defpackage.mtw;
import defpackage.nyg0;
import defpackage.ok31;
import defpackage.smg0;
import defpackage.tja1;
import defpackage.tls;
import defpackage.vsn;
import defpackage.ym60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/widgets/common/keyboard/delegators/KeyboardTextButtonView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "", "Lzy11;", "onTextPressedCallback", "Ltls;", "getOnTextPressedCallback", "()Ltls;", "setOnTextPressedCallback", "(Ltls;)V", "Lym60;", "value", "item", "Lym60;", "getItem", "()Lym60;", "setItem", "(Lym60;)V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeyboardTextButtonView extends AppCompatTextView {
    private ym60 item;
    private tls onTextPressedCallback;

    public KeyboardTextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onTextPressedCallback = new mtw(9);
        ym60 ym60Var = this.item;
        setText(String.valueOf(ym60Var != null ? Character.valueOf(ym60Var.a) : null));
        setOnClickListener(new vsn(17, this, context));
        setGravity(17);
        setTextAlignment(4);
        setTextColor(getResources().getColorStateList(cqg0.ybsdk_clickable_text, context.getTheme()));
        tja1.b(this);
        setBackgroundResource(nyg0.ybsdk_keyboard_item_background);
        setFontFeatureSettings("pnum, lnum");
        setTextAppearance(l1i0.Widget_YB_Text_Headline2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(KeyboardTextButtonView keyboardTextButtonView, Context context, View view) {
        String ch;
        keyboardTextButtonView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_keyboard_scale_animator));
        ym60 ym60Var = keyboardTextButtonView.item;
        if (ym60Var != null && (ch = Character.valueOf(ym60Var.a).toString()) != null) {
            b.r(keyboardTextButtonView, ch);
        }
        ym60 ym60Var2 = keyboardTextButtonView.item;
        if (ym60Var2 != null) {
            keyboardTextButtonView.onTextPressedCallback.invoke(Character.valueOf(ym60Var2.a));
        }
        cg91.c(keyboardTextButtonView, ok31.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onTextPressedCallback$lambda$0(char c) {
        return zy11.a;
    }

    public final ym60 getItem() {
        return this.item;
    }

    public final tls getOnTextPressedCallback() {
        return this.onTextPressedCallback;
    }

    public final void setItem(ym60 ym60Var) {
        setText(String.valueOf(ym60Var != null ? Character.valueOf(ym60Var.a) : null));
        this.item = ym60Var;
    }

    public final void setOnTextPressedCallback(tls tlsVar) {
        this.onTextPressedCallback = tlsVar;
    }

    public /* synthetic */ KeyboardTextButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardTextButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
