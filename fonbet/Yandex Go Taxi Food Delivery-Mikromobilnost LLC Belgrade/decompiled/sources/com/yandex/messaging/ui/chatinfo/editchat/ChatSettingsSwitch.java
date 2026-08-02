package com.yandex.messaging.ui.chatinfo.editchat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.ai91;
import defpackage.ci8;
import defpackage.e9h0;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.k3i0;
import defpackage.olh0;
import defpackage.rfa;
import defpackage.t9b;
import defpackage.tls;
import defpackage.u9b;
import defpackage.y3b1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR.\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001e¨\u0006,"}, d2 = {"Lcom/yandex/messaging/ui/chatinfo/editchat/ChatSettingsSwitch;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "drawableId", "tintColorAttr", "Lzy11;", "setIconWithStyle", "(II)V", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/SwitchCompat;", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "Landroid/view/View;", "switchScreen", "Landroid/view/View;", "", "value", "isBlocked", "Z", "()Z", "setBlocked", "(Z)V", "isSwitchEnabled", "setSwitchEnabled", "Lkotlin/Function1;", "onCheckedChangeListener", "Ltls;", "getOnCheckedChangeListener", "()Ltls;", "setOnCheckedChangeListener", "(Ltls;)V", "isChecked", "setChecked", "Companion", "u9b", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatSettingsSwitch extends FrameLayout {
    public static final int $stable = 8;
    public static final u9b Companion = new u9b();
    private static final int DEFAULT_TINT = jng0.messagingCommonIconsPrimaryColor;
    private boolean isBlocked;
    private boolean isSwitchEnabled;
    private final TextView labelView;
    private tls onCheckedChangeListener;
    private final SwitchCompat switch;
    private final View switchScreen;

    public ChatSettingsSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isSwitchEnabled = true;
        this.onCheckedChangeListener = new rfa(14);
        View.inflate(context, olh0.msg_v_chat_settings_switch, this);
        ai91.c(this, false);
        TextView textView = (TextView) findViewById(e9h0.chat_settings_label);
        this.labelView = textView;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(e9h0.chat_settings_switch);
        switchCompat.setOnCheckedChangeListener(new t9b(this, 1));
        this.switch = switchCompat;
        this.switchScreen = findViewById(e9h0.switch_screen);
        switchCompat.setEnabled(this.isSwitchEnabled);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.ChatSettingsSwitch, i, 0);
        textView.setText(obtainStyledAttributes.getString(k3i0.ChatSettingsSwitch_css_label));
        int resourceId = obtainStyledAttributes.getResourceId(k3i0.ChatSettingsSwitch_css_icon, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(k3i0.ChatSettingsSwitch_css_tint, DEFAULT_TINT);
        if (resourceId != 0) {
            setIconWithStyle(resourceId, resourceId2);
        }
        obtainStyledAttributes.recycle();
        setOnClickListener(new ci8(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ChatSettingsSwitch chatSettingsSwitch, View view) {
        if (!chatSettingsSwitch.isBlocked && chatSettingsSwitch.isSwitchEnabled && chatSettingsSwitch.getVisibility() == 0) {
            chatSettingsSwitch.switch.toggle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_isChecked_$lambda$0(ChatSettingsSwitch chatSettingsSwitch, CompoundButton compoundButton, boolean z) {
        chatSettingsSwitch.onCheckedChangeListener.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ChatSettingsSwitch chatSettingsSwitch, CompoundButton compoundButton, boolean z) {
        chatSettingsSwitch.onCheckedChangeListener.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCheckedChangeListener$lambda$1(boolean z) {
        return zy11.a;
    }

    private final void setIconWithStyle(int drawableId, int tintColorAttr) {
        Context context = this.labelView.getContext();
        Drawable f = y3b1.f(context, drawableId, fxa1.c(tintColorAttr, context).data);
        TextView textView = this.labelView;
        Drawable drawable = textView.getLayoutDirection() == 0 ? f : null;
        if (textView.getLayoutDirection() == 0) {
            f = null;
        }
        textView.setCompoundDrawables(drawable, null, f, null);
    }

    public final tls getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    /* renamed from: isBlocked, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    /* renamed from: isSwitchEnabled, reason: from getter */
    public final boolean getIsSwitchEnabled() {
        return this.isSwitchEnabled;
    }

    public final void setBlocked(boolean z) {
        if (this.isBlocked == z) {
            return;
        }
        this.isBlocked = z;
        View view = this.switchScreen;
        if (z) {
            ai91.f(view, false);
        } else {
            ai91.c(view, false);
        }
    }

    public final void setChecked(boolean z) {
        if (this.switch.isChecked() == z) {
            return;
        }
        this.switch.setOnCheckedChangeListener(null);
        this.switch.setChecked(z);
        this.switch.setOnCheckedChangeListener(new t9b(this, 0));
    }

    public final void setOnCheckedChangeListener(tls tlsVar) {
        this.onCheckedChangeListener = tlsVar;
    }

    public final void setSwitchEnabled(boolean z) {
        if (this.isSwitchEnabled == z) {
            return;
        }
        this.isSwitchEnabled = z;
        this.switch.setEnabled(z);
    }

    public ChatSettingsSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ChatSettingsSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ChatSettingsSwitch(Context context) {
        this(context, null, 0, 6, null);
    }
}
