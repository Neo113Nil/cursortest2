package com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.agh;
import defpackage.clh0;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.s8h0;
import defpackage.tje;
import defpackage.xw31;
import defpackage.yfh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/ui/items/DefaultOfferHeaderView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyfh;", ClidProvider.STATE, "Lzy11;", "render", "(Lyfh;)V", "Lagh;", "binding", "Lagh;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferHeaderView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final agh binding;

    public DefaultOfferHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(clh0.default_offer_header_view, this);
        int i2 = s8h0.center_text;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            i2 = s8h0.end_text;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView2 != null) {
                i2 = s8h0.subtitle;
                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView3 != null) {
                    i2 = s8h0.title;
                    RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView4 != null) {
                        this.binding = new agh(this, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
                        setMinHeight(tje.u(48, getContext()));
                        xw31.N(tje.u(8, getContext()), this);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(yfh state) {
        agh aghVar = this.binding;
        RobotoTextView robotoTextView = aghVar.e;
        RobotoTextView robotoTextView2 = aghVar.b;
        RobotoTextView robotoTextView3 = aghVar.c;
        CharSequence charSequence = state.a;
        CharSequence charSequence2 = state.d;
        CharSequence charSequence3 = state.c;
        robotoTextView.setText(charSequence);
        RobotoTextView robotoTextView4 = aghVar.d;
        CharSequence charSequence4 = state.b;
        robotoTextView4.setText(charSequence4);
        int i = 8;
        robotoTextView4.setVisibility((charSequence4 == null || charSequence4.length() == 0) ? 8 : 0);
        robotoTextView2.setText(charSequence3 == null ? "" : charSequence3);
        robotoTextView2.setVisibility((charSequence3 == null || charSequence3.length() == 0) ? 4 : 0);
        robotoTextView3.setText(charSequence2);
        if (charSequence2 != null && charSequence2.length() != 0) {
            i = 0;
        }
        robotoTextView3.setVisibility(i);
        robotoTextView3.setMinWidth(tje.u(state.e, getContext()));
    }

    public DefaultOfferHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DefaultOfferHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DefaultOfferHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
