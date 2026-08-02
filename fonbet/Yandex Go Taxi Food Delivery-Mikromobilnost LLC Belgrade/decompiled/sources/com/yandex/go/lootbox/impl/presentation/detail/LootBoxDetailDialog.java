package com.yandex.go.lootbox.impl.presentation.detail;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a2i0;
import defpackage.aqz;
import defpackage.cma1;
import defpackage.fbz;
import defpackage.fpz;
import defpackage.g18;
import defpackage.k2h0;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.s8o;
import defpackage.uoz;
import defpackage.uth0;
import defpackage.wih0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/lootbox/impl/presentation/detail/LootBoxDetailDialog;", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/app/Activity;", "activity", "Luoz;", "detail", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "<init>", "(Landroid/app/Activity;Luoz;Lk7x0;Lpav;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getCustomView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lzy11;", "onDetachedFromWindow", "()V", "onViewCreated", "Luoz;", "Lk7x0;", "Lpav;", "Lg18;", "imageLoading", "Lg18;", "Laqz;", "binding", "Laqz;", "zpz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxDetailDialog extends BaseDialog<LootBoxDetailDialog> {
    private aqz binding;
    private final uoz detail;
    private final pav imageLoader;
    private g18 imageLoading;
    private final k7x0 tagUrlFormatter;

    public LootBoxDetailDialog(Activity activity, uoz uozVar, k7x0 k7x0Var, pav pavVar) {
        super(activity, new ContextThemeWrapper(activity, a2i0.Taxi_Light), null, 0);
        this.detail = uozVar;
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public View getCustomView(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(uth0.loot_box_detail_modal_view, (ViewGroup) null, false);
        int i = wih0.gift_description;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = wih0.gift_icon;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = wih0.gift_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.binding = new aqz(constraintLayout, robotoTextView, imageView, robotoTextView2);
                    return constraintLayout;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.imageLoading;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public void onViewCreated() {
        super.onViewCreated();
        aqz aqzVar = this.binding;
        if (aqzVar == null) {
            aqzVar = null;
        }
        aqzVar.d.setText(this.detail.a);
        aqz aqzVar2 = this.binding;
        if (aqzVar2 == null) {
            aqzVar2 = null;
        }
        aqzVar2.b.setText(this.detail.b);
        fpz fpzVar = this.detail.d;
        String str = fpzVar.b;
        kdc kdcVar = fpzVar.a;
        setMainActionButton(str, kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, getContext())) : null, new fbz(3, this), null);
        pav pavVar = this.imageLoader;
        aqz aqzVar3 = this.binding;
        nac nacVar = (nac) pavVar.a((aqzVar3 != null ? aqzVar3 : null).c);
        nacVar.e(k2h0.default_gift_icon);
        this.imageLoading = nacVar.c(((m7x0) this.tagUrlFormatter).a(this.detail.c));
    }
}
