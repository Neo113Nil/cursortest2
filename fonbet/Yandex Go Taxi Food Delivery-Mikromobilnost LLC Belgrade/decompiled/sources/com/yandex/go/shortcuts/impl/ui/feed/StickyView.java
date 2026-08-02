package com.yandex.go.shortcuts.impl.ui.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ekh0;
import defpackage.fet0;
import defpackage.leu0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/shortcuts/impl/ui/feed/StickyView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "collapsedHeight", "()Lsls;", "Lleu0;", "binding", "Lleu0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyView extends FrameLayout {
    private final leu0 binding;

    public StickyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(ekh0.sticky_view, (ViewGroup) this, false);
        addView(inflate);
        if (inflate == null) {
            ny61.t("rootView");
            throw null;
        }
        AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) inflate;
        this.binding = new leu0(autoDividerComponentList, autoDividerComponentList);
        autoDividerComponentList.setBackgroundColor(qje.t(xng0.bgMain, context));
        autoDividerComponentList.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(mrg0.modal_view_corner_radius_big, getContext())));
        autoDividerComponentList.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collapsedHeight$lambda$0() {
        return 200;
    }

    public final sls collapsedHeight() {
        return new fet0(27);
    }

    public StickyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StickyView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StickyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
