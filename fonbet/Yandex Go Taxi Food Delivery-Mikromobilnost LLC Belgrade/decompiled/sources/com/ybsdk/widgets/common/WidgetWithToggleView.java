package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import defpackage.aq41;
import defpackage.cg91;
import defpackage.cma1;
import defpackage.cob1;
import defpackage.fb61;
import defpackage.fch0;
import defpackage.gob1;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.ok31;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.sm91;
import defpackage.t451;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.vpb;
import defpackage.w511;
import defpackage.we6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\n\u001f*B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\f2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\f2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\u000eR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ybsdk/widgets/common/WidgetWithToggleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lt451;", "viewState", "Lzy11;", "setAccessibilityParams", "(Lt451;)V", "Landroidx/appcompat/widget/SwitchCompat;", "Lcom/ybsdk/core/utils/ColorModel;", "colorModel", "setTrackColor", "(Landroidx/appcompat/widget/SwitchCompat;Lcom/ybsdk/core/utils/ColorModel;)V", "setThumbColor", "Landroid/widget/TextView;", "setTextColor", "(Landroid/widget/TextView;Lcom/ybsdk/core/utils/ColorModel;)V", "", "isWidgetEnabled", "(Lt451;)Z", "Lkotlin/Function1;", "listener", "setTextOnClickListener", "(Ltls;)V", "Lcom/ybsdk/widgets/common/o;", "setSwitchClickListener", "render", "Lfb61;", "binding", "Lfb61;", "textClickListener", "Ltls;", "switchClickListener", "currentState", "Lt451;", "ToggleState", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WidgetWithToggleView extends LinearLayout {
    private final fb61 binding;
    private t451 currentState;
    private tls switchClickListener;
    private tls textClickListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/WidgetWithToggleView$ToggleState;", "", "<init>", "(Ljava/lang/String;I)V", "ON", "OFF", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ToggleState[] $VALUES;
        public static final ToggleState ON = new ToggleState("ON", 0);
        public static final ToggleState OFF = new ToggleState("OFF", 1);

        private static final /* synthetic */ ToggleState[] $values() {
            return new ToggleState[]{ON, OFF};
        }

        static {
            ToggleState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ToggleState(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ToggleState valueOf(String str) {
            return (ToggleState) Enum.valueOf(ToggleState.class, str);
        }

        public static ToggleState[] values() {
            return (ToggleState[]) $VALUES.clone();
        }
    }

    public WidgetWithToggleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_widget_with_toggle, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.autoTopupWidgetSwitch;
        SwitchCompat switchCompat = (SwitchCompat) cma1.O(i2, inflate);
        if (switchCompat != null) {
            i2 = fch0.autoTopupWidgetText;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                this.binding = new fb61((LinearLayout) inflate, switchCompat, textView);
                switchCompat.setOnCheckedChangeListener(new vpb(6, this));
                textView.setOnClickListener(new aq41(5, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WidgetWithToggleView widgetWithToggleView, CompoundButton compoundButton, boolean z) {
        t451 t451Var = widgetWithToggleView.currentState;
        if (t451Var != null) {
            tls tlsVar = widgetWithToggleView.switchClickListener;
            if (tlsVar != null) {
                tlsVar.invoke(t451Var.f);
            }
            cg91.c(compoundButton, ok31.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(WidgetWithToggleView widgetWithToggleView, View view) {
        tls tlsVar;
        t451 t451Var = widgetWithToggleView.currentState;
        if (t451Var == null || !widgetWithToggleView.isWidgetEnabled(t451Var) || (tlsVar = widgetWithToggleView.textClickListener) == null) {
            return;
        }
        tlsVar.invoke(t451Var);
    }

    private final boolean isWidgetEnabled(t451 t451Var) {
        t451Var.getClass();
        return t451Var.g;
    }

    private final void setAccessibilityParams(t451 viewState) {
        this.binding.c.setContentDescription(com.ybsdk.core.utils.text.d.a(getContext(), viewState.c));
        if (this.textClickListener != null) {
            androidx.core.view.b.e(this.binding.c);
        }
    }

    private final void setTextColor(TextView textView, ColorModel colorModel) {
        textView.setTextColor(colorModel.get(textView.getContext()));
    }

    private final void setThumbColor(SwitchCompat switchCompat, ColorModel colorModel) {
        int i = colorModel.get(switchCompat.getContext());
        ViewState viewState = ViewState.CHECKED;
        ViewState viewState2 = ViewState.ENABLED;
        int i2 = 1;
        we6 we6Var = new we6(i, new ViewState[]{viewState, viewState2}, i2);
        int i3 = colorModel.get(switchCompat.getContext());
        ViewState viewState3 = ViewState.DISABLED;
        we6 we6Var2 = new we6(i3, new ViewState[]{viewState, viewState3}, i2);
        int i4 = colorModel.get(switchCompat.getContext());
        ViewState viewState4 = ViewState.UNCHECKED;
        switchCompat.setThumbTintList(cob1.b(we6Var, we6Var2, new we6(i4, new ViewState[]{viewState4, viewState2}, i2), new we6(colorModel.get(switchCompat.getContext()), new ViewState[]{viewState4, viewState3}, i2)));
    }

    private final void setTrackColor(SwitchCompat switchCompat, ColorModel colorModel) {
        int i = colorModel.get(switchCompat.getContext());
        ViewState viewState = ViewState.CHECKED;
        ViewState viewState2 = ViewState.ENABLED;
        int i2 = 1;
        we6 we6Var = new we6(i, new ViewState[]{viewState, viewState2}, i2);
        int i3 = colorModel.get(switchCompat.getContext());
        ViewState viewState3 = ViewState.DISABLED;
        we6 we6Var2 = new we6(i3, new ViewState[]{viewState, viewState3}, i2);
        int i4 = colorModel.get(switchCompat.getContext());
        ViewState viewState4 = ViewState.UNCHECKED;
        switchCompat.setTrackTintList(cob1.b(we6Var, we6Var2, new we6(i4, new ViewState[]{viewState4, viewState2}, i2), new we6(colorModel.get(switchCompat.getContext()), new ViewState[]{viewState4, viewState3}, i2)));
    }

    public final void render(t451 viewState) {
        fb61 fb61Var = this.binding;
        LinearLayout linearLayout = fb61Var.a;
        TextView textView = fb61Var.c;
        gob1.b(linearLayout, viewState.a);
        SwitchCompat switchCompat = fb61Var.b;
        o oVar = viewState.f;
        setThumbColor(switchCompat, oVar.b);
        setTrackColor(switchCompat, oVar.c);
        int i = p.a[oVar.a.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            z = false;
        }
        switchCompat.setChecked(z);
        switchCompat.setEnabled(isWidgetEnabled(viewState));
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(fb61Var), viewState.c));
        setTextColor(textView, viewState.b);
        rbv rbvVar = viewState.e;
        if (rbvVar != null) {
            v4b1.h(rbvVar, textView, kp50.r(13), kp50.r(13));
        }
        setAccessibilityParams(viewState);
        this.currentState = viewState;
    }

    public final void setSwitchClickListener(tls listener) {
        this.switchClickListener = listener;
    }

    public final void setTextOnClickListener(tls listener) {
        this.textClickListener = listener;
    }

    public WidgetWithToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WidgetWithToggleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WidgetWithToggleView(Context context) {
        this(context, null, 0, 6, null);
    }
}
