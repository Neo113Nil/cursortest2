package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.e9h0;
import defpackage.jxi;
import defpackage.k3i0;
import defpackage.olh0;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@jxi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n \u0014*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R/\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 *\u0004\b!\u0010\"R(\u0010'\u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/messaging/views/TextSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "listener", "Lzy11;", "setOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroidx/appcompat/widget/SwitchCompat;", "kotlin.jvm.PlatformType", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "Landroid/widget/TextView;", "switchLabel", "Landroid/widget/TextView;", "switchDescription", "", "<set-?>", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "getLabel$delegate", "(Lcom/yandex/messaging/views/TextSwitchView;)Ljava/lang/Object;", "label", "value", "getDescription", "setDescription", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "isChecked", "()Z", "setChecked", "(Z)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TextSwitchView extends ConstraintLayout {
    public static final int $stable = 8;
    private final SwitchCompat switch;
    private final TextView switchDescription;
    private final TextView switchLabel;
    private final View view;

    public TextSwitchView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = View.inflate(context, olh0.msg_v_text_switch, this);
        this.view = inflate;
        this.switch = (SwitchCompat) inflate.findViewById(e9h0.switch_view);
        this.switchLabel = (TextView) inflate.findViewById(e9h0.switch_label);
        this.switchDescription = (TextView) inflate.findViewById(e9h0.switch_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.TextSwitchView, i, 0);
        setLabel(obtainStyledAttributes.getString(k3i0.TextSwitchView_tsvLabel));
        setDescription(obtainStyledAttributes.getString(k3i0.TextSwitchView_tsvDescription));
        obtainStyledAttributes.recycle();
    }

    private static Object getLabel$delegate(TextSwitchView textSwitchView) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(textSwitchView.switchLabel, TextView.class, "text", "getText()Ljava/lang/CharSequence;", 2);
        qoi0.a.getClass();
        return mutablePropertyReference0Impl;
    }

    public final CharSequence getDescription() {
        return this.switchDescription.getText();
    }

    public final CharSequence getLabel() {
        return this.switchLabel.getText();
    }

    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    public final void setChecked(boolean z) {
        this.switch.setChecked(z);
    }

    public final void setDescription(CharSequence charSequence) {
        this.switchDescription.setText(charSequence);
        this.switchDescription.setVisibility(charSequence != null ? 0 : 8);
    }

    public final void setLabel(CharSequence charSequence) {
        this.switchLabel.setText(charSequence);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.switch.setOnCheckedChangeListener(listener);
    }

    public TextSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TextSwitchView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ TextSwitchView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public TextSwitchView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
