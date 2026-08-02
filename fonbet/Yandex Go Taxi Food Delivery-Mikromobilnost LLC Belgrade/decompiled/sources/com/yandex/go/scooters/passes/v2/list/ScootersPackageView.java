package com.yandex.go.scooters.passes.v2.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cma1;
import defpackage.h8;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.s0h0;
import defpackage.srh0;
import defpackage.vng;
import defpackage.xng0;
import defpackage.y6o0;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lcom/yandex/go/scooters/passes/v2/list/ScootersPackageView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "", "selected", "", "dividerColor", "(Landroid/view/View;Z)I", "Lzy11;", "setSelected", "(Z)V", BackendConfig.Restrictions.ENABLED, "setEnabled", "Ly6o0;", "binding", "Ly6o0;", "Lru/yandex/taxi/widget/RobotoTextView;", "title", "Lru/yandex/taxi/widget/RobotoTextView;", "getTitle", "()Lru/yandex/taxi/widget/RobotoTextView;", "price", "getPrice", "Lcom/yandex/go/design/view/GoLinearLayout;", "arrowView", "Lcom/yandex/go/design/view/GoLinearLayout;", "getArrowView", "()Lcom/yandex/go/design/view/GoLinearLayout;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "getDescription", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPackageView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final GoLinearLayout arrowView;
    private final y6o0 binding;
    private final RobotoTextView description;
    private final RobotoTextView price;
    private final RobotoTextView title;

    public ScootersPackageView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(srh0.scooters_package_view, this);
        int i = qfh0.arrow_view;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
        if (goLinearLayout != null) {
            i = qfh0.barrier;
            if (((Barrier) cma1.O(i, this)) != null) {
                i = qfh0.check;
                GoImageView goImageView = (GoImageView) cma1.O(i, this);
                if (goImageView != null) {
                    i = qfh0.divider;
                    GoView goView = (GoView) cma1.O(i, this);
                    if (goView != null) {
                        i = qfh0.package_description;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                        if (robotoTextView != null) {
                            i = qfh0.price;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                            if (robotoTextView2 != null) {
                                i = qfh0.title;
                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, this);
                                if (robotoTextView3 != null) {
                                    this.binding = new y6o0(this, goLinearLayout, goImageView, goView, robotoTextView, robotoTextView2, robotoTextView3);
                                    setBackground(vng.t(s0h0.scooters_tariff_item_bg, getContext()));
                                    this.title = robotoTextView3;
                                    this.price = robotoTextView2;
                                    this.arrowView = goLinearLayout;
                                    this.description = robotoTextView;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final int dividerColor(View view, boolean z) {
        return c.c(z ? xng0.textOnControl : xng0.line, view);
    }

    public final GoLinearLayout getArrowView() {
        return this.arrowView;
    }

    public final RobotoTextView getDescription() {
        return this.description;
    }

    public final RobotoTextView getPrice() {
        return this.price;
    }

    public final RobotoTextView getTitle() {
        return this.title;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).setAlpha(enabled ? 1.0f : 0.5f);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        this.binding.b.setSelected(selected);
        this.binding.c.setBackgroundColor(dividerColor(this, selected));
    }
}
