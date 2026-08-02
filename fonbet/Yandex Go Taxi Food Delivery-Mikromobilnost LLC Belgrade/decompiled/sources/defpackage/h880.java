package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.taxi.order.models.api.status.ImageType;
import com.yandex.go.taxi.order.ui.status.OrderStatusModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class h880 implements d880 {
    public final /* synthetic */ OrderStatusModalView a;

    public h880(OrderStatusModalView orderStatusModalView) {
        this.a = orderStatusModalView;
    }

    @Override // defpackage.d880
    public final void E9(String str, t0a0 t0a0Var) {
        i880 binding;
        i880 binding2;
        z0a0 z0a0Var;
        OrderStatusModalView orderStatusModalView = this.a;
        binding = orderStatusModalView.getBinding();
        binding.c.setVisibility(0);
        binding2 = orderStatusModalView.getBinding();
        ListItemComponent listItemComponent = binding2.d;
        listItemComponent.setTitle(listItemComponent.getContext().getString(kyh0.summary_payment_method_title));
        listItemComponent.setSubtitle(str);
        listItemComponent.setTrailCompanionMode(1);
        z0a0Var = orderStatusModalView.paymentIconLoader;
        ((g1a0) z0a0Var).b(listItemComponent.getTrailCompanionImageView(), t0a0Var);
        listItemComponent.setVisibility(0);
    }

    @Override // defpackage.d880
    public final void Q3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ImageType imageType) {
        i880 binding;
        pdc pdcVar;
        kdc kdcVar;
        pdc pdcVar2;
        kdc kdcVar2;
        pdc pdcVar3;
        kdc kdcVar3;
        pdc pdcVar4;
        kdc kdcVar4;
        OrderStatusModalView orderStatusModalView = this.a;
        binding = orderStatusModalView.getBinding();
        RobotoTextView robotoTextView = binding.h;
        ImageView imageView = binding.b;
        robotoTextView.setText(str);
        binding.g.setText(str2);
        binding.e.setText(str3);
        ButtonComponent buttonComponent = binding.f;
        buttonComponent.setVisibility((str4 == null || evu0.J(str4)) ? 8 : 0);
        buttonComponent.setText(str4);
        pdcVar = orderStatusModalView.colorConverter;
        kdcVar = orderStatusModalView.primaryButtonBackgroundColor;
        orderStatusModalView.primaryButtonBackgroundColor = ((ufu) pdcVar).d(kdcVar, str5);
        pdcVar2 = orderStatusModalView.colorConverter;
        kdcVar2 = orderStatusModalView.primaryButtonTittleColor;
        orderStatusModalView.primaryButtonTittleColor = ((ufu) pdcVar2).h(kdcVar2, str7);
        pdcVar3 = orderStatusModalView.colorConverter;
        kdcVar3 = orderStatusModalView.secondaryButtonBackgroundColor;
        orderStatusModalView.secondaryButtonBackgroundColor = ((ufu) pdcVar3).d(kdcVar3, str6);
        pdcVar4 = orderStatusModalView.colorConverter;
        kdcVar4 = orderStatusModalView.secondaryButtonTittleColor;
        orderStatusModalView.secondaryButtonTittleColor = ((ufu) pdcVar4).h(kdcVar4, str8);
        int i = imageType == null ? -1 : g880.a[imageType.ordinal()];
        if (i == -1 || i == 1) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = tje.u(40, orderStatusModalView.getContext());
            marginLayoutParams.height = tje.u(40, orderStatusModalView.getContext());
            marginLayoutParams.topMargin = tje.u(10, orderStatusModalView.getContext());
            marginLayoutParams.leftMargin = tje.u(10, orderStatusModalView.getContext());
            imageView.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams2 = robotoTextView.getLayoutParams();
            if (layoutParams2 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = tje.u(8, orderStatusModalView.getContext());
                robotoTextView.setLayoutParams(marginLayoutParams2);
            }
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.width = -1;
            marginLayoutParams3.height = -2;
            marginLayoutParams3.topMargin = 0;
            marginLayoutParams3.leftMargin = 0;
            imageView.setLayoutParams(marginLayoutParams3);
            ViewGroup.LayoutParams layoutParams4 = robotoTextView.getLayoutParams();
            if (layoutParams4 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.topMargin = tje.u(12, orderStatusModalView.getContext());
                robotoTextView.setLayoutParams(marginLayoutParams4);
            }
        }
        orderStatusModalView.updateColors();
    }

    @Override // defpackage.d880
    public final void dismissView() {
        this.a.dismiss();
    }

    @Override // defpackage.d880
    public final void f7(Bitmap bitmap) {
        i880 binding;
        binding = this.a.getBinding();
        ImageView imageView = binding.b;
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
    }

    @Override // defpackage.d880
    public final void fd(uh60 uh60Var) {
        i880 binding;
        binding = this.a.getBinding();
        binding.d.setOnClickListener(new zgv(23, uh60Var));
    }

    @Override // defpackage.d880
    public final void ld() {
        FloatButtonIconComponent floatButtonIconComponent;
        floatButtonIconComponent = this.a.floatBackButton;
        floatButtonIconComponent.setVisibility(8);
    }
}
