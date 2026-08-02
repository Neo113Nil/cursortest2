package com.ybsdk.widgets.common.communication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.hrc;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.u061;
import defpackage.ung0;
import defpackage.urc;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenGraphicsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhrc;", ClidProvider.STATE, "Lzy11;", "render", "(Lhrc;)V", "Lu061;", "binding", "Lu061;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenGraphicsView extends ConstraintLayout {
    private final u061 binding;

    public CommunicationFullScreenGraphicsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_communication_full_screen_graphics_view, this);
        int i2 = fch0.image;
        ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = (ImageViewWithCustomScaleTypes) cma1.O(i2, this);
        if (imageViewWithCustomScaleTypes != null) {
            i2 = fch0.infoView;
            CommunicationFullScreenInfoView communicationFullScreenInfoView = (CommunicationFullScreenInfoView) cma1.O(i2, this);
            if (communicationFullScreenInfoView != null) {
                this.binding = new u061(this, imageViewWithCustomScaleTypes, communicationFullScreenInfoView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(hrc state) {
        u061 u061Var = this.binding;
        Integer num = state.a;
        if (num != null) {
            u061Var.b.setBackgroundColor(num.intValue());
        } else {
            u061Var.b.setBackgroundColor(rje.a(getContext(), ung0.ybColor_background_primary));
        }
        rbv rbvVar = state.b;
        ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = u061Var.b;
        CommunicationFullScreenInfoView communicationFullScreenInfoView = u061Var.c;
        v4b1.k(rbvVar, imageViewWithCustomScaleTypes, null, null, 6);
        communicationFullScreenInfoView.setPadding(communicationFullScreenInfoView.getPaddingLeft(), state.f, communicationFullScreenInfoView.getPaddingRight(), communicationFullScreenInfoView.getPaddingBottom());
        Integer num2 = state.h;
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
        communicationFullScreenInfoView.render(state.c);
        urc urcVar = state.d;
        if (urcVar != null) {
            imageViewWithCustomScaleTypes.setPadding(urcVar.a, urcVar.b, urcVar.c, urcVar.d);
        }
        imageViewWithCustomScaleTypes.setScaleType(state.e);
        imageViewWithCustomScaleTypes.render(state.g);
    }

    public CommunicationFullScreenGraphicsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommunicationFullScreenGraphicsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CommunicationFullScreenGraphicsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
