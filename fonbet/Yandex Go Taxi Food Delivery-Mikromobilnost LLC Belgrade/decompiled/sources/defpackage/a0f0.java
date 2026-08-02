package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationModalView;
import defpackage.sls;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes14.dex */
public final class a0f0 implements c0f0 {
    public final /* synthetic */ PriceRecalculationModalView a;

    public a0f0(PriceRecalculationModalView priceRecalculationModalView) {
        this.a = priceRecalculationModalView;
    }

    @Override // defpackage.c0f0
    public final void dismissView() {
        this.a.dismiss();
    }

    @Override // defpackage.c0f0
    public final void i1(l0f0 l0f0Var) {
        b0f0 binding;
        b0f0 binding2;
        b0f0 binding3;
        b0f0 binding4;
        b0f0 binding5;
        b0f0 binding6;
        int shimmeringColor;
        FloatButtonIconComponent floatBackButton;
        b0f0 binding7;
        b0f0 binding8;
        b0f0 binding9;
        b0f0 binding10;
        b0f0 binding11;
        b0f0 binding12;
        b0f0 binding13;
        b0f0 binding14;
        b0f0 binding15;
        b0f0 binding16;
        b0f0 binding17;
        b0f0 binding18;
        b0f0 binding19;
        b0f0 binding20;
        b0f0 binding21;
        b0f0 binding22;
        b0f0 binding23;
        b0f0 binding24;
        FloatButtonIconComponent floatBackButton2;
        b0f0 binding25;
        b0f0 binding26;
        b0f0 binding27;
        b0f0 binding28;
        b0f0 binding29;
        b0f0 binding30;
        b0f0 binding31;
        b0f0 binding32;
        b0f0 binding33;
        b0f0 binding34;
        b0f0 binding35;
        b0f0 binding36;
        b0f0 binding37;
        b0f0 binding38;
        b0f0 binding39;
        b0f0 binding40;
        b0f0 binding41;
        FloatButtonIconComponent floatBackButton3;
        b0f0 binding42;
        b0f0 binding43;
        b0f0 binding44;
        b0f0 binding45;
        b0f0 binding46;
        b0f0 binding47;
        b0f0 binding48;
        b0f0 binding49;
        b0f0 binding50;
        b0f0 binding51;
        b0f0 binding52;
        b0f0 binding53;
        b0f0 binding54;
        b0f0 binding55;
        FloatButtonIconComponent floatBackButton4;
        b0f0 binding56;
        b0f0 binding57;
        boolean z = l0f0Var instanceof k0f0;
        PriceRecalculationModalView priceRecalculationModalView = this.a;
        if (z) {
            k0f0 k0f0Var = (k0f0) l0f0Var;
            binding44 = priceRecalculationModalView.getBinding();
            binding44.e.setTitle(k0f0Var.a);
            binding45 = priceRecalculationModalView.getBinding();
            binding45.e.setSubtitle(k0f0Var.e);
            binding46 = priceRecalculationModalView.getBinding();
            binding46.d.setTitle(k0f0Var.b);
            binding47 = priceRecalculationModalView.getBinding();
            binding47.b.setText(k0f0Var.d);
            binding48 = priceRecalculationModalView.getBinding();
            binding48.c.setTitle(k0f0Var.c);
            binding49 = priceRecalculationModalView.getBinding();
            binding49.i.setVisibility(0);
            binding50 = priceRecalculationModalView.getBinding();
            binding50.i.setShimmering(true);
            binding51 = priceRecalculationModalView.getBinding();
            binding51.h.setVisibility(8);
            binding52 = priceRecalculationModalView.getBinding();
            binding52.c.setClickable(false);
            binding53 = priceRecalculationModalView.getBinding();
            binding53.c.setAlpha(0.5f);
            binding54 = priceRecalculationModalView.getBinding();
            binding54.c.stopTitleProgressAnimation();
            binding55 = priceRecalculationModalView.getBinding();
            binding55.g.setVisibility(8);
            floatBackButton4 = priceRecalculationModalView.getFloatBackButton();
            floatBackButton4.setVisibility(0);
            binding56 = priceRecalculationModalView.getBinding();
            binding56.b.setClickable(true);
            binding57 = priceRecalculationModalView.getBinding();
            binding57.b.setAlpha(1.0f);
            priceRecalculationModalView.setDismissOnTouchOutside(true);
            priceRecalculationModalView.setDismissOnBackPressed(true);
            priceRecalculationModalView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
            return;
        }
        if (l0f0Var instanceof j0f0) {
            j0f0 j0f0Var = (j0f0) l0f0Var;
            binding27 = priceRecalculationModalView.getBinding();
            binding27.e.setTitle(j0f0Var.a);
            binding28 = priceRecalculationModalView.getBinding();
            binding28.e.setSubtitle(j0f0Var.e);
            binding29 = priceRecalculationModalView.getBinding();
            binding29.d.setTitle(j0f0Var.b);
            binding30 = priceRecalculationModalView.getBinding();
            binding30.b.setText(j0f0Var.d);
            binding31 = priceRecalculationModalView.getBinding();
            binding31.c.setTitle(j0f0Var.c);
            binding32 = priceRecalculationModalView.getBinding();
            binding32.i.setVisibility(8);
            binding33 = priceRecalculationModalView.getBinding();
            binding33.i.setShimmering(false);
            binding34 = priceRecalculationModalView.getBinding();
            binding34.h.setVisibility(0);
            binding35 = priceRecalculationModalView.getBinding();
            binding35.h.setText(j0f0Var.f);
            binding36 = priceRecalculationModalView.getBinding();
            binding36.c.setClickable(true);
            binding37 = priceRecalculationModalView.getBinding();
            binding37.c.setAlpha(1.0f);
            binding38 = priceRecalculationModalView.getBinding();
            binding38.c.stopTitleProgressAnimation();
            binding39 = priceRecalculationModalView.getBinding();
            ListItemComponent listItemComponent = binding39.c;
            final sls slsVar = j0f0Var.g;
            listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.taxi.order.recalculation.ui.a
                @Override // java.lang.Runnable
                public final void run() {
                    ((PriceRecalculationPresenter$bindNewPriceLoadedSuccessState$state$1) sls.this).invoke();
                }
            });
            binding40 = priceRecalculationModalView.getBinding();
            binding40.b.setDebounceClickListener(new oxe0(4, j0f0Var.h));
            binding41 = priceRecalculationModalView.getBinding();
            binding41.g.setVisibility(8);
            floatBackButton3 = priceRecalculationModalView.getFloatBackButton();
            floatBackButton3.setVisibility(0);
            binding42 = priceRecalculationModalView.getBinding();
            binding42.b.setClickable(true);
            binding43 = priceRecalculationModalView.getBinding();
            binding43.b.setAlpha(1.0f);
            priceRecalculationModalView.setDismissOnTouchOutside(true);
            priceRecalculationModalView.setDismissOnBackPressed(true);
            priceRecalculationModalView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
            return;
        }
        if (!(l0f0Var instanceof i0f0)) {
            if (!(l0f0Var instanceof h0f0)) {
                w511.b();
                return;
            }
            binding = priceRecalculationModalView.getBinding();
            binding.i.setVisibility(8);
            binding2 = priceRecalculationModalView.getBinding();
            binding2.i.setShimmering(false);
            binding3 = priceRecalculationModalView.getBinding();
            binding3.h.setVisibility(0);
            binding4 = priceRecalculationModalView.getBinding();
            binding4.c.setClickable(false);
            binding5 = priceRecalculationModalView.getBinding();
            binding5.c.setAlpha(1.0f);
            binding6 = priceRecalculationModalView.getBinding();
            ListItemComponent listItemComponent2 = binding6.c;
            shimmeringColor = priceRecalculationModalView.getShimmeringColor();
            listItemComponent2.startTitleProgressAnimation(Integer.valueOf(shimmeringColor), 800);
            floatBackButton = priceRecalculationModalView.getFloatBackButton();
            floatBackButton.setVisibility(8);
            binding7 = priceRecalculationModalView.getBinding();
            binding7.b.setClickable(false);
            binding8 = priceRecalculationModalView.getBinding();
            binding8.b.setAlpha(0.5f);
            priceRecalculationModalView.setDismissOnTouchOutside(false);
            priceRecalculationModalView.setDismissOnBackPressed(false);
            priceRecalculationModalView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
            return;
        }
        i0f0 i0f0Var = (i0f0) l0f0Var;
        binding9 = priceRecalculationModalView.getBinding();
        binding9.e.setTitle(i0f0Var.a);
        binding10 = priceRecalculationModalView.getBinding();
        binding10.e.setSubtitle(i0f0Var.e);
        binding11 = priceRecalculationModalView.getBinding();
        binding11.d.setTitle(i0f0Var.b);
        binding12 = priceRecalculationModalView.getBinding();
        binding12.b.setText(i0f0Var.d);
        binding13 = priceRecalculationModalView.getBinding();
        binding13.c.setTitle(i0f0Var.c);
        binding14 = priceRecalculationModalView.getBinding();
        binding14.i.setVisibility(8);
        binding15 = priceRecalculationModalView.getBinding();
        binding15.i.setShimmering(false);
        binding16 = priceRecalculationModalView.getBinding();
        binding16.h.setVisibility(0);
        binding17 = priceRecalculationModalView.getBinding();
        binding17.h.setText(i0f0Var.f);
        binding18 = priceRecalculationModalView.getBinding();
        binding18.c.setClickable(true);
        binding19 = priceRecalculationModalView.getBinding();
        binding19.c.setAlpha(1.0f);
        binding20 = priceRecalculationModalView.getBinding();
        binding20.c.stopTitleProgressAnimation();
        binding21 = priceRecalculationModalView.getBinding();
        binding21.c.setDebounceClickListener(new oxe0(2, i0f0Var.g));
        binding22 = priceRecalculationModalView.getBinding();
        binding22.b.setDebounceClickListener(new oxe0(3, i0f0Var.h));
        binding23 = priceRecalculationModalView.getBinding();
        binding23.g.setVisibility(0);
        binding24 = priceRecalculationModalView.getBinding();
        binding24.g.setShimmering(true);
        floatBackButton2 = priceRecalculationModalView.getFloatBackButton();
        floatBackButton2.setVisibility(0);
        binding25 = priceRecalculationModalView.getBinding();
        binding25.b.setClickable(true);
        binding26 = priceRecalculationModalView.getBinding();
        binding26.b.setAlpha(1.0f);
        priceRecalculationModalView.setDismissOnTouchOutside(true);
        priceRecalculationModalView.setDismissOnBackPressed(true);
        priceRecalculationModalView.setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
    }

    @Override // defpackage.c0f0
    public final void t7(Bitmap bitmap) {
        b0f0 binding;
        b0f0 binding2;
        b0f0 binding3;
        b0f0 binding4;
        b0f0 binding5;
        PriceRecalculationModalView priceRecalculationModalView = this.a;
        binding = priceRecalculationModalView.getBinding();
        binding.g.setShimmering(false);
        binding2 = priceRecalculationModalView.getBinding();
        binding2.g.setBackgroundTintList(null);
        if (bitmap == null) {
            binding3 = priceRecalculationModalView.getBinding();
            binding3.f.setVisibility(8);
        } else {
            binding4 = priceRecalculationModalView.getBinding();
            binding4.f.setVisibility(0);
            binding5 = priceRecalculationModalView.getBinding();
            binding5.f.setImageBitmap(bitmap);
        }
    }
}
