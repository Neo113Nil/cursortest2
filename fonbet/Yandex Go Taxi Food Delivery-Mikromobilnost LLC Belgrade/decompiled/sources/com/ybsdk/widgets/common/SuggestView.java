package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import defpackage.cqg0;
import defpackage.kp50;
import defpackage.l1i0;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.t9v0;
import defpackage.tja1;
import defpackage.u9v0;
import defpackage.v9v0;
import defpackage.vng;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0013\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/widgets/common/SuggestView;", "Lcom/ybsdk/core/design/spoiler/SpoilerTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/SuggestView$State$WidthType;", "widthType", "Lzy11;", "renderWidth", "(Lcom/ybsdk/widgets/common/SuggestView$State$WidthType;)V", "Lcom/ybsdk/widgets/common/SuggestView$State$Behaviour;", "behaviour", "renderSpoiler", "(Lcom/ybsdk/widgets/common/SuggestView$State$Behaviour;)V", "Lu9v0;", ClidProvider.STATE, "render", "(Lu9v0;)V", "previousState", "Lu9v0;", "Companion", "t9v0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestView extends SpoilerTextView {
    private u9v0 previousState;
    private static final t9v0 Companion = new t9v0();
    private static final int HORIZONTAL_PADDING_PX = kp50.r(14);
    private static final int VERTICAL_PADDING_PX = kp50.r(11);
    private static final int SUGGEST_DOUBLE_WIDTH_PX = kp50.r(104);
    private static final int SUGGEST_TRIPLE_WIDTH_PX = kp50.r(88);

    public SuggestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i2 = HORIZONTAL_PADDING_PX;
        int i3 = VERTICAL_PADDING_PX;
        setPadding(i2, i3, i2, i3);
        setTextAppearance(l1i0.Widget_YB_Text_Body3);
        setBackground(vng.t(nyg0.ybsdk_suggest_background, context));
        setTextColor(getResources().getColorStateList(cqg0.ybsdk_suggest_title, context.getTheme()));
        tja1.b(this);
        setGravity(1);
    }

    private final void renderSpoiler(SuggestView$State$Behaviour behaviour) {
        int i = v9v0.b[behaviour.ordinal()];
        if (i == 1) {
            SpoilerTextView.updateSpoilerState$default(this, null, false, 1, null);
        } else {
            if (i == 2) {
                return;
            }
            w511.b();
        }
    }

    private final void renderWidth(SuggestView$State$WidthType widthType) {
        u9v0 u9v0Var = this.previousState;
        if ((u9v0Var != null ? u9v0Var.d : null) != widthType) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            int i = v9v0.a[widthType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    setMinWidth(SUGGEST_DOUBLE_WIDTH_PX);
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    setMinWidth(SUGGEST_TRIPLE_WIDTH_PX);
                }
            }
            setLayoutParams(layoutParams);
        }
    }

    public final void render(u9v0 state) {
        setText(state.b);
        setEnabled(state.e);
        renderWidth(state.d);
        renderSpoiler(state.c);
        this.previousState = state;
    }

    public SuggestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SuggestView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SuggestView(Context context) {
        this(context, null, 0, 6, null);
    }
}
