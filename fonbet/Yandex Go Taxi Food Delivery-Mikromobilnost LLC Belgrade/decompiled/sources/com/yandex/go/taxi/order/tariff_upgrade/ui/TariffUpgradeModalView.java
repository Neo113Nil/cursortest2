package com.yandex.go.taxi.order.tariff_upgrade.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.taxi.order.tariff_upgrade.analytics.TariffUpgradeButton;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.eqx0;
import defpackage.f28;
import defpackage.ffx0;
import defpackage.fqx0;
import defpackage.hbp0;
import defpackage.jhu0;
import defpackage.l8x;
import defpackage.lpx0;
import defpackage.lzu0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.ppx0;
import defpackage.qpx0;
import defpackage.qu;
import defpackage.rpx0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.upx0;
import defpackage.xw31;
import defpackage.yvf0;
import defpackage.zkh0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.a;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/go/taxi/order/tariff_upgrade/ui/TariffUpgradeModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lrpx0;", "Lupx0;", "presenter", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Lupx0;Landroid/content/Context;Lpav;)V", "", "isVisible", "Lzy11;", "updateDetailsButton", "(Z)V", "Leqx0;", "image", "setImage", "(Leqx0;)V", "loadImage", "Lfqx0;", "transformation", "Landroid/graphics/Bitmap;", "bitmap", "applyImageTransformation", "(Lfqx0;Landroid/graphics/Bitmap;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrpx0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lupx0;", "Lpav;", "Ll8x;", "loadImageJob", "Ll8x;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "qpx0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffUpgradeModalView extends BindingModalView<rpx0> {
    public static final int $stable = 8;
    private final pav imageLoader;
    private l8x loadImageJob;
    private final upx0 presenter;
    private final hbp0 scopeDelegate;

    public TariffUpgradeModalView(upx0 upx0Var, Context context, pav pavVar) {
        super(context);
        this.presenter = upx0Var;
        this.imageLoader = pavVar;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        xw31.L(tje.u(76, getContext()), getContent());
    }

    private final void applyImageTransformation(fqx0 transformation, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        float width = transformation.c / bitmap.getWidth();
        matrix.postScale(width, width);
        matrix.postTranslate(transformation.b, 0.0f);
        ImageView imageView = getBinding().d;
        imageView.setVisibility(0);
        imageView.setTranslationX(transformation.a);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(matrix);
        imageView.setImageBitmap(bitmap);
        imageView.getLayoutParams().height = Math.round(bitmap.getHeight() * width);
    }

    private final void loadImage(eqx0 image) {
        l8x l8xVar = this.loadImageJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.loadImageJob = a.c(this.imageLoader.b().b(image.a), new lzu0(20, this, image), new oew0(6, this), this.scopeDelegate.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadImage$lambda$0(TariffUpgradeModalView tariffUpgradeModalView, eqx0 eqx0Var, Bitmap bitmap) {
        tariffUpgradeModalView.applyImageTransformation(eqx0Var.c, bitmap);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadImage$lambda$1(TariffUpgradeModalView tariffUpgradeModalView) {
        tariffUpgradeModalView.getBinding().d.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$doneButtonClicked(upx0 upx0Var) {
        upx0Var.A.a(TariffUpgradeButton.DONE);
        ((f28) upx0Var.y.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImage(eqx0 image) {
        if (image != null) {
            getBinding().e.setVisibility(image.b ? 0 : 8);
            loadImage(image);
        } else {
            l8x l8xVar = this.loadImageJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            getBinding().e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDetailsButton(boolean isVisible) {
        ListItemComponent listItemComponent = getBinding().b;
        int i = 0;
        listItemComponent.setVisibility(isVisible ? 0 : 8);
        if (isVisible) {
            listItemComponent.setDebounceClickListener(new ppx0(this.presenter, i));
        } else {
            listItemComponent.setDebounceClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDetailsButton$lambda$0$detailsButtonClicked(upx0 upx0Var) {
        upx0Var.A.a(TariffUpgradeButton.DETAILS);
        lpx0 lpx0Var = upx0Var.x;
        ZoneTariffInfo zoneTariffInfo = lpx0Var.d;
        if (zoneTariffInfo != null) {
            jhu0 jhu0Var = upx0Var.y;
            Zone zone = lpx0Var.e;
            f28 f28Var = (f28) jhu0Var.a;
            f28Var.A((m950) ((yvf0) f28Var.I).get(), new ffx0(zone, zoneTariffInfo), sy60.Q2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public rpx0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.tariff_upgrade_modal_view, parent, false);
        int i = p8h0.detail_button;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = p8h0.done_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = p8h0.image;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    i = p8h0.plus_bg;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        i = p8h0.text;
                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                        if (listItemComponent2 != null) {
                            i = p8h0.title;
                            ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                            if (listHeaderComponent != null) {
                                return new rpx0(linearLayout, listItemComponent, buttonComponent, imageView, appCompatImageView, listItemComponent2, listHeaderComponent);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        upx0 upx0Var = this.presenter;
        qpx0 qpx0Var = new qpx0(this);
        upx0Var.Bg(qpx0Var);
        tje.N(upx0Var.Jg(), null, null, new TariffUpgradePresenter$attachView$1(upx0Var, qpx0Var, null), 3);
        getBinding().c.setDebounceClickListener(new ppx0(this.presenter, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
        getBinding().c.setDebounceClickListener(null);
        getBinding().b.setDebounceClickListener(null);
    }
}
