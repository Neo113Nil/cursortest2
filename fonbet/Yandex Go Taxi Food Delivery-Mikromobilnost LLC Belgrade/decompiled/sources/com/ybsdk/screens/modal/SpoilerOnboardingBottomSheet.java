package com.ybsdk.screens.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.modal.SpoilerOnboardingBottomSheet;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.jah0;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.qmh0;
import defpackage.tls;
import defpackage.unr0;
import defpackage.v4b1;
import defpackage.w861;
import defpackage.xvt0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/screens/modal/SpoilerOnboardingBottomSheet;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lcom/ybsdk/screens/modal/SpoilerOnboardingBottomSheet$ButtonAction;", "Lzy11;", "onButtonClick", "setButtonsListeners", "(Ltls;)V", "Lxvt0;", "viewState", "render", "(Lxvt0;)V", CA20Status.STATUS_USER_I, "Lw861;", "binding", "Lw861;", "buttonListener", "Ltls;", "ButtonAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpoilerOnboardingBottomSheet extends ConstraintLayout {
    private final w861 binding;
    private tls buttonListener;
    private final int defStyleAttr;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/screens/modal/SpoilerOnboardingBottomSheet$ButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE_BOTTOM_SHEET", "TURN_OFF_ONBOARDING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        public static final ButtonAction CLOSE_BOTTOM_SHEET = new ButtonAction("CLOSE_BOTTOM_SHEET", 0);
        public static final ButtonAction TURN_OFF_ONBOARDING = new ButtonAction("TURN_OFF_ONBOARDING", 1);

        private static final /* synthetic */ ButtonAction[] $values() {
            return new ButtonAction[]{CLOSE_BOTTOM_SHEET, TURN_OFF_ONBOARDING};
        }

        static {
            ButtonAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ButtonAction(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ButtonAction valueOf(String str) {
            return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
        }

        public static ButtonAction[] values() {
            return (ButtonAction[]) $VALUES.clone();
        }
    }

    public SpoilerOnboardingBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defStyleAttr = i;
        LayoutInflater.from(context).inflate(qmh0.ybsdk_spoiler_onboarding_bottom_sheet, this);
        int i2 = jah0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = jah0.image;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = jah0.primaryButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
                if (ybButtonView != null) {
                    i2 = jah0.secondaryButton;
                    YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i2, this);
                    if (ybButtonView2 != null) {
                        i2 = jah0.title;
                        TextView textView2 = (TextView) cma1.O(i2, this);
                        if (textView2 != null) {
                            this.binding = new w861(this, textView, imageView, ybButtonView, ybButtonView2, textView2);
                            final int i3 = 0;
                            ybButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: wvt0
                                public final /* synthetic */ SpoilerOnboardingBottomSheet b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i4 = i3;
                                    SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet = this.b;
                                    switch (i4) {
                                        case 0:
                                            SpoilerOnboardingBottomSheet._init_$lambda$0(spoilerOnboardingBottomSheet, view);
                                            break;
                                        default:
                                            SpoilerOnboardingBottomSheet._init_$lambda$1(spoilerOnboardingBottomSheet, view);
                                            break;
                                    }
                                }
                            });
                            final int i4 = 1;
                            ybButtonView2.setOnClickListener(new View.OnClickListener(this) { // from class: wvt0
                                public final /* synthetic */ SpoilerOnboardingBottomSheet b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i42 = i4;
                                    SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet = this.b;
                                    switch (i42) {
                                        case 0:
                                            SpoilerOnboardingBottomSheet._init_$lambda$0(spoilerOnboardingBottomSheet, view);
                                            break;
                                        default:
                                            SpoilerOnboardingBottomSheet._init_$lambda$1(spoilerOnboardingBottomSheet, view);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet, View view) {
        tls tlsVar = spoilerOnboardingBottomSheet.buttonListener;
        if (tlsVar != null) {
            tlsVar.invoke(ButtonAction.CLOSE_BOTTOM_SHEET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet, View view) {
        tls tlsVar = spoilerOnboardingBottomSheet.buttonListener;
        if (tlsVar != null) {
            tlsVar.invoke(ButtonAction.TURN_OFF_ONBOARDING);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void render(xvt0 viewState) {
        w861 w861Var = this.binding;
        v4b1.k(viewState.a, w861Var.c, null, null, 6);
        w861Var.f.setText(getContext().getString(dzh0.ybsdk_spoilers_spoiler_onboarding_title));
        w861Var.b.setText(getContext().getString(dzh0.ybsdk_spoilers_spoiler_onboarding_description));
        ColorModel colorModel = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        w861Var.d.render(new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_spoilers_spoiler_onboarding_primary_button_title), null, null, colorModel, colorModel2, colorModel3, null, z, false, null, 4094));
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        w861Var.e.render(new YbButtonView.a(new Text.Resource(dzh0.ybsdk_spoilers_spoiler_onboarding_secondary_button_title), null, objArr, objArr2, colorModel, colorModel2, colorModel3, false, z, null, 4094));
    }

    public final void setButtonsListeners(tls onButtonClick) {
        this.buttonListener = onButtonClick;
    }

    public SpoilerOnboardingBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SpoilerOnboardingBottomSheet(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SpoilerOnboardingBottomSheet(Context context) {
        this(context, null, 0, 6, null);
    }
}
