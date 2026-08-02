package com.ybsdk.widgets.common.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.utils.text.d;
import defpackage.kp50;
import defpackage.l1i0;
import defpackage.nyg0;
import defpackage.oqb;
import defpackage.pqb;
import defpackage.rje;
import defpackage.ung0;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0013\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/widgets/common/chip/ChipView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "Lzy11;", "updateColors", "(Z)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "setBackgroundAndTextColors", "(II)V", "Lpqb;", ClidProvider.STATE, "render", "(Lpqb;)V", "Companion", "oqb", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipView extends AppCompatTextView {
    private static final oqb Companion = new oqb();
    private static final int HORIZONTAL_PADDING_PX = kp50.r(13);
    private static final int VERTICAL_PADDING_PX = kp50.r(10);

    public ChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i2 = HORIZONTAL_PADDING_PX;
        int i3 = VERTICAL_PADDING_PX;
        setPadding(i2, i3, i2, i3);
        setTextAppearance(l1i0.Widget_YB_Text_Body2);
        setBackground(vng.t(nyg0.ybsdk_chip_background, context));
    }

    private final void setBackgroundAndTextColors(int backgroundColor, int textColor) {
        setTextColor(textColor);
        Drawable mutate = vng.t(nyg0.ybsdk_chip_background, getContext()).mutate();
        mutate.setTint(backgroundColor);
        setBackground(mutate);
    }

    private final void updateColors(boolean selected) {
        setSelected(selected);
        if (selected) {
            setBackgroundAndTextColors(rje.a(getContext(), ung0.ybColor_control_activeDark), rje.a(getContext(), ung0.ybColor_textIcon_primaryInverted));
        } else {
            setBackgroundAndTextColors(rje.a(getContext(), ung0.ybColor_control_default), rje.a(getContext(), ung0.ybColor_textIcon_primary));
        }
    }

    public final void render(pqb state) {
        setText(d.a(getContext(), state.c));
        updateColors(state.b.booleanValue());
    }

    public ChipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ChipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ChipView(Context context) {
        this(context, null, 0, 6, null);
    }
}
