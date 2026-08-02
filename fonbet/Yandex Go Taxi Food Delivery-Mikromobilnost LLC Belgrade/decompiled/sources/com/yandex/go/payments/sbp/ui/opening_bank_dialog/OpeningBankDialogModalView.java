package com.yandex.go.payments.sbp.ui.opening_bank_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.data.model.response.BindDialog;
import com.yandex.go.payments.sbp.domain.OpeningBankDialogInteractor$DialogDataSource;
import com.yandex.go.payments.sbp.domain.analytics.SbpBindingAnalytics$Button;
import defpackage.bm50;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.dfm0;
import defpackage.e6h0;
import defpackage.g9a0;
import defpackage.gq4;
import defpackage.ia70;
import defpackage.ja70;
import defpackage.ka70;
import defpackage.luh0;
import defpackage.ma70;
import defpackage.na70;
import defpackage.ny61;
import defpackage.qa70;
import defpackage.qdb1;
import defpackage.sa70;
import defpackage.tje;
import defpackage.w511;
import defpackage.wnb1;
import defpackage.xw31;
import java.util.HashMap;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/payments/sbp/ui/opening_bank_dialog/OpeningBankDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lna70;", "Landroid/content/Context;", "context", "Lqa70;", "presenter", "<init>", "(Landroid/content/Context;Lqa70;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lna70;", "Lzy11;", "onDismissManually", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lqa70;", "ma70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpeningBankDialogModalView extends SlideableBindingModalView<na70> {
    public static final int $stable = 8;
    private final qa70 presenter;

    public OpeningBankDialogModalView(Context context, qa70 qa70Var) {
        super(context);
        this.presenter = qa70Var;
        setDismissOnTouchOutside(false);
        wnb1.d(tje.u(24, getContext()), getBinding().a);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new ka70(this, 0));
    }

    public static final /* synthetic */ na70 access$getBinding(OpeningBankDialogModalView openingBankDialogModalView) {
        return openingBankDialogModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(OpeningBankDialogModalView openingBankDialogModalView) {
        xw31.w(openingBankDialogModalView.getBinding().f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public na70 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.opening_bank_dialog_modal_view, parent, false);
        int i = e6h0.additional_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = e6h0.description;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = e6h0.footer;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = e6h0.main_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        i = e6h0.title;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView3 != null) {
                            return new na70((ConstraintLayout) inflate, buttonComponent, robotoTextView, robotoTextView2, buttonComponent2, robotoTextView3);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        OpeningBankDialogInteractor$DialogDataSource openingBankDialogInteractor$DialogDataSource;
        int i;
        BindDialog.Overrides.BindingDialogOverride bindingDialogOverride;
        String str;
        BindDialog.LegalFooter legalFooter;
        super.onAttachedToWindow();
        qa70 qa70Var = this.presenter;
        ma70 ma70Var = new ma70(this);
        qa70Var.Bg(ma70Var);
        ja70 ja70Var = qa70Var.B;
        gq4 gq4Var = qa70Var.y;
        BindDialog bindDialog = ja70Var.a.b.d;
        boolean z = gq4Var.c;
        if (!z) {
            BindDialog.Overrides overrides = bindDialog.f;
            if ((overrides != null ? overrides.a : null) != null) {
                openingBankDialogInteractor$DialogDataSource = OpeningBankDialogInteractor$DialogDataSource.WITHOUT_WEB_OVERRIDE;
                String str2 = gq4Var.a;
                i = ia70.a[openingBankDialogInteractor$DialogDataSource.ordinal()];
                int i2 = 1;
                if (i == 1) {
                    BindDialog.Overrides overrides2 = bindDialog.f;
                    if (overrides2 != null) {
                        bindingDialogOverride = overrides2.b;
                        if (bindingDialogOverride != null) {
                        }
                        String str3 = bindDialog.a;
                        String v = cvu0.v(str3, "$BANK_NAME$", str2, false);
                        if (bindingDialogOverride != null) {
                        }
                        String str4 = bindDialog.b;
                        str = str4;
                        if (bindingDialogOverride != null) {
                        }
                        ActionButton actionButton = bindDialog.c;
                        ActionButton actionButton2 = actionButton;
                        if (bindingDialogOverride != null) {
                        }
                        ActionButton actionButton3 = bindDialog.d;
                        ActionButton actionButton4 = actionButton3;
                        if (bindingDialogOverride != null) {
                        }
                        BindDialog.LegalFooter legalFooter2 = bindDialog.e;
                        legalFooter = legalFooter2;
                        sa70 sa70Var = new sa70(v, str, actionButton2, actionButton4, legalFooter);
                        access$getBinding(this).f.setText(v);
                        access$getBinding(this).f.setContentDescription(v);
                        if (str == null) {
                        }
                        ma70Var.h(actionButton4, access$getBinding(this).e);
                        ma70Var.h(actionButton2, access$getBinding(this).b);
                        if (legalFooter == null) {
                        }
                        dfm0 dfm0Var = qa70Var.C;
                        String str5 = qa70Var.y.b;
                        g9a0 g9a0Var = dfm0Var.b;
                        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = dfm0Var.d;
                        g9a0Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
                        hashMap.put("bank_id", str5);
                        g9a0Var.a.a("PaymentMethods.SBP.BankSelected", hashMap, 1, new HashMap());
                        post(new ka70(this, i2));
                        return;
                    }
                    bindingDialogOverride = null;
                    if (bindingDialogOverride != null) {
                    }
                    String str32 = bindDialog.a;
                    String v2 = cvu0.v(str32, "$BANK_NAME$", str2, false);
                    if (bindingDialogOverride != null) {
                    }
                    String str42 = bindDialog.b;
                    str = str42;
                    if (bindingDialogOverride != null) {
                    }
                    ActionButton actionButton5 = bindDialog.c;
                    ActionButton actionButton22 = actionButton5;
                    if (bindingDialogOverride != null) {
                    }
                    ActionButton actionButton32 = bindDialog.d;
                    ActionButton actionButton42 = actionButton32;
                    if (bindingDialogOverride != null) {
                    }
                    BindDialog.LegalFooter legalFooter22 = bindDialog.e;
                    legalFooter = legalFooter22;
                    sa70 sa70Var2 = new sa70(v2, str, actionButton22, actionButton42, legalFooter);
                    access$getBinding(this).f.setText(v2);
                    access$getBinding(this).f.setContentDescription(v2);
                    if (str == null) {
                    }
                    ma70Var.h(actionButton42, access$getBinding(this).e);
                    ma70Var.h(actionButton22, access$getBinding(this).b);
                    if (legalFooter == null) {
                    }
                    dfm0 dfm0Var2 = qa70Var.C;
                    String str52 = qa70Var.y.b;
                    g9a0 g9a0Var2 = dfm0Var2.b;
                    PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen2 = dfm0Var2.d;
                    g9a0Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen2.getEventValue());
                    hashMap2.put("bank_id", str52);
                    g9a0Var2.a.a("PaymentMethods.SBP.BankSelected", hashMap2, 1, new HashMap());
                    post(new ka70(this, i2));
                    return;
                }
                if (i == 2) {
                    BindDialog.Overrides overrides3 = bindDialog.f;
                    if (overrides3 != null) {
                        bindingDialogOverride = overrides3.a;
                        if (bindingDialogOverride != null || (str32 = bindingDialogOverride.a) == null) {
                            String str322 = bindDialog.a;
                        }
                        String v22 = cvu0.v(str322, "$BANK_NAME$", str2, false);
                        if (bindingDialogOverride != null || (str42 = bindingDialogOverride.b) == null) {
                            String str422 = bindDialog.b;
                        }
                        str = str422;
                        if (bindingDialogOverride != null || (actionButton5 = bindingDialogOverride.c) == null) {
                            ActionButton actionButton52 = bindDialog.c;
                        }
                        ActionButton actionButton222 = actionButton52;
                        if (bindingDialogOverride != null || (actionButton32 = bindingDialogOverride.d) == null) {
                            ActionButton actionButton322 = bindDialog.d;
                        }
                        ActionButton actionButton422 = actionButton322;
                        if (bindingDialogOverride != null || (legalFooter22 = bindingDialogOverride.e) == null) {
                            BindDialog.LegalFooter legalFooter222 = bindDialog.e;
                        }
                        legalFooter = legalFooter222;
                        sa70 sa70Var22 = new sa70(v22, str, actionButton222, actionButton422, legalFooter);
                        access$getBinding(this).f.setText(v22);
                        access$getBinding(this).f.setContentDescription(v22);
                        if (str == null) {
                            access$getBinding(this).c.setVisibility(0);
                            access$getBinding(this).c.setText(str);
                            access$getBinding(this).c.setContentDescription(str);
                        } else {
                            access$getBinding(this).c.setVisibility(8);
                        }
                        ma70Var.h(actionButton422, access$getBinding(this).e);
                        ma70Var.h(actionButton222, access$getBinding(this).b);
                        if (legalFooter == null) {
                            access$getBinding(this).d.setVisibility(0);
                            qa70 qa70Var2 = this.presenter;
                            tje.N(qa70Var2.Jg(), null, null, new OpeningBankDialogPresenter$loadFormattedText$1(new OpeningBankDialogModalView$OpeningBankDialogMvpViewImpl$render$1$1(1, access$getBinding(this).d, RobotoTextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 0), qa70Var2, legalFooter.b, null), 3);
                            c.z(new bm50(6, this, sa70Var22), access$getBinding(this).d);
                        } else {
                            access$getBinding(this).d.setVisibility(8);
                        }
                        dfm0 dfm0Var22 = qa70Var.C;
                        String str522 = qa70Var.y.b;
                        g9a0 g9a0Var22 = dfm0Var22.b;
                        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen22 = dfm0Var22.d;
                        g9a0Var22.getClass();
                        HashMap hashMap22 = new HashMap();
                        hashMap22.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen22.getEventValue());
                        hashMap22.put("bank_id", str522);
                        g9a0Var22.a.a("PaymentMethods.SBP.BankSelected", hashMap22, 1, new HashMap());
                        post(new ka70(this, i2));
                        return;
                    }
                } else if (i != 3) {
                    w511.b();
                    return;
                }
                bindingDialogOverride = null;
                if (bindingDialogOverride != null) {
                }
                String str3222 = bindDialog.a;
                String v222 = cvu0.v(str3222, "$BANK_NAME$", str2, false);
                if (bindingDialogOverride != null) {
                }
                String str4222 = bindDialog.b;
                str = str4222;
                if (bindingDialogOverride != null) {
                }
                ActionButton actionButton522 = bindDialog.c;
                ActionButton actionButton2222 = actionButton522;
                if (bindingDialogOverride != null) {
                }
                ActionButton actionButton3222 = bindDialog.d;
                ActionButton actionButton4222 = actionButton3222;
                if (bindingDialogOverride != null) {
                }
                BindDialog.LegalFooter legalFooter2222 = bindDialog.e;
                legalFooter = legalFooter2222;
                sa70 sa70Var222 = new sa70(v222, str, actionButton2222, actionButton4222, legalFooter);
                access$getBinding(this).f.setText(v222);
                access$getBinding(this).f.setContentDescription(v222);
                if (str == null) {
                }
                ma70Var.h(actionButton4222, access$getBinding(this).e);
                ma70Var.h(actionButton2222, access$getBinding(this).b);
                if (legalFooter == null) {
                }
                dfm0 dfm0Var222 = qa70Var.C;
                String str5222 = qa70Var.y.b;
                g9a0 g9a0Var222 = dfm0Var222.b;
                PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen222 = dfm0Var222.d;
                g9a0Var222.getClass();
                HashMap hashMap222 = new HashMap();
                hashMap222.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen222.getEventValue());
                hashMap222.put("bank_id", str5222);
                g9a0Var222.a.a("PaymentMethods.SBP.BankSelected", hashMap222, 1, new HashMap());
                post(new ka70(this, i2));
                return;
            }
        }
        if (z) {
            BindDialog.Overrides overrides4 = bindDialog.f;
            if ((overrides4 != null ? overrides4.b : null) != null) {
                openingBankDialogInteractor$DialogDataSource = OpeningBankDialogInteractor$DialogDataSource.WEB_OVERRIDE;
                String str22 = gq4Var.a;
                i = ia70.a[openingBankDialogInteractor$DialogDataSource.ordinal()];
                int i22 = 1;
                if (i == 1) {
                }
            }
        }
        openingBankDialogInteractor$DialogDataSource = OpeningBankDialogInteractor$DialogDataSource.ORIGINAL;
        String str222 = gq4Var.a;
        i = ia70.a[openingBankDialogInteractor$DialogDataSource.ordinal()];
        int i222 = 1;
        if (i == 1) {
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        qa70 qa70Var = this.presenter;
        qa70Var.C.a(qa70Var.y.b, SbpBindingAnalytics$Button.BACK);
    }
}
