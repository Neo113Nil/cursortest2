package com.yandex.go.promocodes.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.evh0;
import defpackage.ijs;
import defpackage.ny61;
import defpackage.sls;
import defpackage.vrf0;
import defpackage.z6h0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/promocodes/view/PromocodesWithActiveOrderDetailsView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvrf0;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "closeListener", "<init>", "(Landroid/content/Context;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvrf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromocodesWithActiveOrderDetailsView extends SlideableBindingModalView<vrf0> {
    public PromocodesWithActiveOrderDetailsView(Context context, sls slsVar) {
        super(context);
        getBinding().b.setDebounceClickListener(new ijs(28, slsVar));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vrf0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(evh0.promocodes_with_active_order_details_view, parent, false);
        int i = z6h0.info_content_title;
        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
            i = z6h0.info_done;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                return new vrf0((ConstraintLayout) inflate, buttonComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
