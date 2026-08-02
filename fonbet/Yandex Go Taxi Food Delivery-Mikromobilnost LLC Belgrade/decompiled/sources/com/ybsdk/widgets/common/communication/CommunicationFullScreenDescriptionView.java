package com.ybsdk.widgets.common.communication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.core.utils.ColorModel;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.frc;
import defpackage.grc;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.t061;
import defpackage.ung0;
import defpackage.urc;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\n\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenDescriptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgrc;", ClidProvider.STATE, "Lzy11;", "render", "(Lgrc;)V", "Lt061;", "binding", "Lt061;", "Companion", "frc", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenDescriptionView extends ConstraintLayout {
    private static final frc Companion = new frc();
    private static final float DEFAULT_GUIDELINE_PERCENT = 0.45f;
    private final t061 binding;

    public CommunicationFullScreenDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_communication_full_screen_description_view, this);
        int i2 = fch0.guideline;
        Guideline guideline = (Guideline) cma1.O(i2, this);
        if (guideline != null) {
            i2 = fch0.image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = fch0.infoView;
                CommunicationFullScreenInfoView communicationFullScreenInfoView = (CommunicationFullScreenInfoView) cma1.O(i2, this);
                if (communicationFullScreenInfoView != null) {
                    this.binding = new t061(this, guideline, appCompatImageView, communicationFullScreenInfoView);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(grc state) {
        t061 t061Var = this.binding;
        Float f = state.h;
        float floatValue = f != null ? f.floatValue() : DEFAULT_GUIDELINE_PERCENT;
        Integer num = state.a;
        if (num != null) {
            t061Var.c.setBackgroundColor(num.intValue());
        } else {
            ColorModel colorModel = state.b;
            if (colorModel != null) {
                t061Var.c.setBackgroundColor(colorModel.get(getContext()));
            } else {
                t061Var.c.setBackgroundColor(rje.a(getContext(), ung0.ybColor_background_primary));
            }
        }
        rbv rbvVar = state.c;
        AppCompatImageView appCompatImageView = t061Var.c;
        CommunicationFullScreenInfoView communicationFullScreenInfoView = t061Var.d;
        v4b1.k(rbvVar, appCompatImageView, null, null, 6);
        communicationFullScreenInfoView.setPadding(communicationFullScreenInfoView.getPaddingLeft(), state.f, communicationFullScreenInfoView.getPaddingRight(), communicationFullScreenInfoView.getPaddingBottom());
        Integer num2 = state.j;
        if (num2 != null) {
            int intValue = num2.intValue();
            ViewGroup.LayoutParams layoutParams = communicationFullScreenInfoView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, intValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                communicationFullScreenInfoView.setLayoutParams(marginLayoutParams);
            }
        }
        communicationFullScreenInfoView.render(state.d);
        Integer num3 = state.i;
        t061Var.b.setGuidelineBegin(num3 != null ? num3.intValue() : (int) (getResources().getDisplayMetrics().heightPixels * floatValue));
        urc urcVar = state.e;
        if (urcVar != null) {
            appCompatImageView.setPadding(urcVar.a, urcVar.b, urcVar.c, urcVar.d);
        }
        appCompatImageView.setScaleType(state.g);
    }

    public CommunicationFullScreenDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommunicationFullScreenDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CommunicationFullScreenDescriptionView(Context context) {
        this(context, null, 0, 6, null);
    }
}
