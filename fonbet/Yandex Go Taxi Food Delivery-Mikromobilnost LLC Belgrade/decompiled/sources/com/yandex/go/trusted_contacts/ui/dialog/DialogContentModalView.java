package com.yandex.go.trusted_contacts.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.ui.dialog.DialogContentModalView;
import defpackage.bvg0;
import defpackage.dy20;
import defpackage.gdj;
import defpackage.kdj;
import defpackage.kk5;
import defpackage.sls;
import defpackage.t1w;
import defpackage.uxh;
import defpackage.w130;
import defpackage.xw31;
import defpackage.zvg;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.DialogContent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0016\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R$\u0010*\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u0006."}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/dialog/DialogContentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldy20;", "Landroid/content/Context;", "context", "Lgdj;", DialogContent.INTENT_PARAM_DIALOG_CONTENT, "Lkdj;", "presenter", "<init>", "(Landroid/content/Context;Lgdj;Lkdj;)V", "Lzy11;", "setupDialogContent", "()V", "", "text", "Lkotlin/Function0;", "listener", "setupAdditionalButton", "(Ljava/lang/CharSequence;Lsls;)V", "setupMainButton", "Lru/yandex/taxi/design/ButtonComponent;", "setupButton", "(Lru/yandex/taxi/design/ButtonComponent;Ljava/lang/CharSequence;Lsls;)V", "Lw130;", "insetsType", "()Lw130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldy20;", "onAttachedToWindow", "Landroid/content/Context;", "Lgdj;", "Lkdj;", "value", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getDescription", "setDescription", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DialogContentModalView extends SlideableBindingModalView<dy20> {
    private final Context context;
    private final gdj dialogContent;
    private final kdj presenter;

    public DialogContentModalView(Context context, gdj gdjVar, kdj kdjVar) {
        super(context);
        this.context = context;
        this.dialogContent = gdjVar;
        this.presenter = kdjVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    private final CharSequence getDescription() {
        return getBinding().c.getText();
    }

    private final CharSequence getTitle() {
        return getBinding().f.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DialogContentModalView dialogContentModalView, t1w t1wVar) {
        dialogContentModalView.getBinding().a.setPadding(0, dialogContentModalView.dialogContent.c == null ? dialogContentModalView.context.getResources().getDimensionPixelSize(bvg0.dialog_padding_top_without_image) : 0, 0, t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DialogContentModalView dialogContentModalView) {
        if (dialogContentModalView.getBinding().f.getVisibility() == 0) {
            xw31.w(dialogContentModalView.getBinding().f);
        } else {
            xw31.w(dialogContentModalView.getBinding().c);
        }
    }

    private final void setDescription(CharSequence charSequence) {
        RobotoTextView robotoTextView = getBinding().c;
        robotoTextView.setText(charSequence);
        robotoTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    private final void setTitle(CharSequence charSequence) {
        RobotoTextView robotoTextView = getBinding().f;
        robotoTextView.setText(charSequence);
        robotoTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    private final void setupAdditionalButton(CharSequence text, sls listener) {
        setupButton(getBinding().b, text, listener);
    }

    private final void setupButton(ButtonComponent buttonComponent, CharSequence charSequence, sls slsVar) {
        buttonComponent.setVisibility(0);
        buttonComponent.setText(charSequence);
        buttonComponent.setDebounceClickListener(new zvg(25, slsVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$lambda$0(sls slsVar, DialogContentModalView dialogContentModalView) {
        slsVar.invoke();
        dialogContentModalView.dismiss();
    }

    private final void setupDialogContent() {
        setTitle(this.dialogContent.a);
        setDescription(this.dialogContent.b);
        final int i = 0;
        if (this.dialogContent.c != null) {
            getBinding().d.setVisibility(0);
            getBinding().d.setImageResource(this.dialogContent.c.intValue());
        }
        setupAdditionalButton(this.dialogContent.d, new sls(this) { // from class: hdj
            public final /* synthetic */ DialogContentModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i2 = i;
                DialogContentModalView dialogContentModalView = this.b;
                switch (i2) {
                    case 0:
                        zy11Var = DialogContentModalView.setupDialogContent$lambda$0(dialogContentModalView);
                        return zy11Var;
                    default:
                        zy11Var2 = DialogContentModalView.setupDialogContent$lambda$1(dialogContentModalView);
                        return zy11Var2;
                }
            }
        });
        final int i2 = 1;
        setupMainButton(this.dialogContent.e, new sls(this) { // from class: hdj
            public final /* synthetic */ DialogContentModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i22 = i2;
                DialogContentModalView dialogContentModalView = this.b;
                switch (i22) {
                    case 0:
                        zy11Var = DialogContentModalView.setupDialogContent$lambda$0(dialogContentModalView);
                        return zy11Var;
                    default:
                        zy11Var2 = DialogContentModalView.setupDialogContent$lambda$1(dialogContentModalView);
                        return zy11Var2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDialogContent$lambda$0(DialogContentModalView dialogContentModalView) {
        ((kk5) dialogContentModalView.presenter.a.a).r(new zvi(5, DialogButton.ADDITIONAL));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupDialogContent$lambda$1(DialogContentModalView dialogContentModalView) {
        ((kk5) dialogContentModalView.presenter.a.a).r(new zvi(5, DialogButton.MAIN));
        return zy11.a;
    }

    private final void setupMainButton(CharSequence text, sls listener) {
        setupButton(getBinding().e, text, listener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new zvi(4, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupDialogContent();
        post(new uxh(16, this));
        requestApplyInsets();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dy20 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return dy20.o(inflater, parent);
    }
}
