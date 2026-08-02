package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScooterPassesTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedType;
import com.yandex.go.scooters.passes.v2.ScootersPackagesModalView;
import com.yandex.go.scooters.passes.v2.list.a;
import defpackage.b3b1;
import defpackage.n7o0;
import defpackage.qxm0;
import defpackage.tje;
import defpackage.vj90;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class h7o0 implements k7o0 {
    public boolean a = true;
    public final /* synthetic */ ScootersPackagesModalView b;

    public h7o0(ScootersPackagesModalView scootersPackagesModalView) {
        this.b = scootersPackagesModalView;
    }

    @Override // defpackage.k7o0
    public final void g6(hfa0 hfa0Var) {
        i7o0 binding;
        rea0 rea0Var;
        bia0 bia0Var;
        bia0 bia0Var2;
        lea0 b = hfa0Var.b();
        ScootersPackagesModalView scootersPackagesModalView = this.b;
        binding = scootersPackagesModalView.getBinding();
        ula ulaVar = binding.d;
        CompositePaymentIconsView compositePaymentIconsView = ulaVar.d;
        GoImageView goImageView = ulaVar.c;
        if (b == null || !b.e()) {
            compositePaymentIconsView.setVisibility(8);
            goImageView.setEnabled(true);
            goImageView.setVisibility(0);
            return;
        }
        goImageView.setVisibility(8);
        int i = kyh0.scooters_offer_card_v2_a11y_payment_info_button;
        rea0Var = scootersPackagesModalView.paymentModelsTitleInteractor;
        compositePaymentIconsView.setContentDescription(c.H(compositePaymentIconsView, i, ((sea0) rea0Var).a(compositePaymentIconsView.getContext(), b)));
        bia0Var = scootersPackagesModalView.paymentResourceProvider;
        Drawable a = bia0.a(bia0Var, compositePaymentIconsView.getContext(), b);
        if (a == null) {
            a = tje.y(x2h0.ic_payment_undefined, compositePaymentIconsView.getContext());
        }
        compositePaymentIconsView.setBaseIcon(a);
        bia0Var2 = scootersPackagesModalView.paymentResourceProvider;
        compositePaymentIconsView.setComplementIcon(bia0.a(bia0Var2, compositePaymentIconsView.getContext(), hfa0Var.c()));
        compositePaymentIconsView.setEnabled(true);
        compositePaymentIconsView.setVisibility(0);
    }

    public final void h() {
        i7o0 binding;
        i7o0 binding2;
        i7o0 binding3;
        ScootersPackagesModalView scootersPackagesModalView = this.b;
        binding = scootersPackagesModalView.getBinding();
        binding.c.setAlpha(1.0f);
        binding2 = scootersPackagesModalView.getBinding();
        ula ulaVar = binding2.d;
        ulaVar.e.setEnabled(true);
        GoImageView goImageView = ulaVar.c;
        goImageView.setEnabled(true);
        goImageView.setAlpha(1.0f);
        CompositePaymentIconsView compositePaymentIconsView = ulaVar.d;
        compositePaymentIconsView.setEnabled(true);
        compositePaymentIconsView.setAlpha(1.0f);
        binding3 = scootersPackagesModalView.getBinding();
        ButtonComponent buttonComponent = binding3.e;
        buttonComponent.stopAnimation();
        buttonComponent.setEnabled(true);
        buttonComponent.setAlpha(1.0f);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        i7o0 binding;
        n7o0 n7o0Var;
        i7o0 binding2;
        String str;
        i7o0 binding3;
        i7o0 binding4;
        int t;
        int t2;
        i7o0 binding5;
        i7o0 binding6;
        String str2;
        i7o0 binding7;
        i7o0 binding8;
        i7o0 binding9;
        i7o0 binding10;
        i7o0 binding11;
        i7o0 binding12;
        i7o0 binding13;
        a aVar;
        i7o0 binding14;
        i7o0 binding15;
        final n7o0 n7o0Var2;
        i7o0 binding16;
        i7o0 binding17;
        i7o0 binding18;
        mgo0 mgo0Var = (mgo0) obj;
        boolean z = mgo0Var instanceof igo0;
        ScootersPackagesModalView scootersPackagesModalView = this.b;
        if (z) {
            binding15 = scootersPackagesModalView.getBinding();
            ButtonComponent buttonComponent = binding15.e;
            n7o0Var2 = scootersPackagesModalView.presenter;
            buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.passes.v2.a
                @Override // java.lang.Runnable
                public final void run() {
                    n7o0 n7o0Var3 = n7o0.this;
                    vj90 vj90Var = (vj90) ((r0) n7o0Var3.z.c.b).getValue();
                    if (vj90Var != null) {
                        qxm0 qxm0Var = n7o0Var3.x;
                        if (n7o0Var3.G == null) {
                            w511.b();
                            return;
                        }
                        qxm0Var.f(ScootersAnalytics$ScootersPassesTappedType.Packages, b3b1.d(n7o0Var3.H), ScootersAnalytics$ScooterPassesTappedButtonName.Purchase, null, n7o0Var3.F);
                        tje.N(n7o0Var3.Jg(), null, null, new ScootersPackagesPresenter$purchasePackage$2(n7o0Var3, vj90Var, null), 3);
                    }
                }
            });
            binding16 = scootersPackagesModalView.getBinding();
            binding16.e.setText(((igo0) mgo0Var).b);
            binding17 = scootersPackagesModalView.getBinding();
            binding17.e.setEnabled(true);
            binding18 = scootersPackagesModalView.getBinding();
            binding18.e.stopAnimation();
            t = qje.t(xng0.controlMain, scootersPackagesModalView.getContext());
            t2 = qje.t(xng0.textOnControl, scootersPackagesModalView.getContext());
        } else if (mgo0Var instanceof kgo0) {
            binding5 = scootersPackagesModalView.getBinding();
            binding5.e.setDebounceClickListener(new d82(1));
            binding6 = scootersPackagesModalView.getBinding();
            ButtonComponent buttonComponent2 = binding6.e;
            str2 = scootersPackagesModalView.purchasingText;
            buttonComponent2.setText(str2);
            binding7 = scootersPackagesModalView.getBinding();
            binding7.e.setEnabled(false);
            binding8 = scootersPackagesModalView.getBinding();
            binding8.e.startAnimation();
            t = qje.t(xng0.controlMinor, scootersPackagesModalView.getContext());
            t2 = qje.t(xng0.textOnControlMinor, scootersPackagesModalView.getContext());
        } else {
            if (!(mgo0Var instanceof jgo0) && !(mgo0Var instanceof lgo0)) {
                w511.b();
                return;
            }
            binding = scootersPackagesModalView.getBinding();
            ButtonComponent buttonComponent3 = binding.e;
            n7o0Var = scootersPackagesModalView.presenter;
            buttonComponent3.setDebounceClickListener(new g7o0(n7o0Var, 2));
            binding2 = scootersPackagesModalView.getBinding();
            ButtonComponent buttonComponent4 = binding2.e;
            str = scootersPackagesModalView.doneText;
            buttonComponent4.setText(str);
            binding3 = scootersPackagesModalView.getBinding();
            binding3.e.setEnabled(true);
            binding4 = scootersPackagesModalView.getBinding();
            binding4.e.stopAnimation();
            t = qje.t(xng0.controlMinor, scootersPackagesModalView.getContext());
            t2 = qje.t(xng0.textOnControlMinor, scootersPackagesModalView.getContext());
        }
        binding9 = scootersPackagesModalView.getBinding();
        binding9.e.setButtonBackground(t);
        binding10 = scootersPackagesModalView.getBinding();
        binding10.e.setButtonTitleColor(t2);
        if (z) {
            h();
            binding14 = scootersPackagesModalView.getBinding();
            GoFrameLayout goFrameLayout = binding14.d.e;
            List list = ((igo0) mgo0Var).a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof c7o0) {
                    arrayList.add(obj2);
                }
            }
            goFrameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
        } else if (mgo0Var instanceof jgo0) {
            h();
            binding13 = scootersPackagesModalView.getBinding();
            binding13.d.e.setVisibility(8);
        } else if (mgo0Var instanceof kgo0) {
            binding11 = scootersPackagesModalView.getBinding();
            binding11.c.setAlpha(0.5f);
            binding12 = scootersPackagesModalView.getBinding();
            ula ulaVar = binding12.d;
            ulaVar.e.setEnabled(false);
            GoImageView goImageView = ulaVar.c;
            goImageView.setEnabled(false);
            goImageView.setAlpha(0.5f);
            CompositePaymentIconsView compositePaymentIconsView = ulaVar.d;
            compositePaymentIconsView.setEnabled(false);
            compositePaymentIconsView.setAlpha(0.5f);
        }
        aVar = scootersPackagesModalView.adapter;
        aVar.submitList(mgo0Var.a(), new ud30(29, scootersPackagesModalView, this, mgo0Var));
    }
}
