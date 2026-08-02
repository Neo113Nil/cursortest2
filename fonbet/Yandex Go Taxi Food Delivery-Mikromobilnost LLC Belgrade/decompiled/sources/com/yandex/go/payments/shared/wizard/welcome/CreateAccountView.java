package com.yandex.go.payments.shared.wizard.welcome;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.ce0;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.luh0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.oxe;
import defpackage.pav;
import defpackage.q3f;
import defpackage.rp31;
import defpackage.rx2;
import defpackage.smr0;
import defpackage.t3f;
import defpackage.tje;
import defpackage.tmr0;
import defpackage.tse;
import defpackage.u90;
import defpackage.uw0;
import defpackage.vnr0;
import defpackage.xm2;
import defpackage.xw31;
import defpackage.y2h0;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00018B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yandex/go/payments/shared/wizard/welcome/CreateAccountView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lcom/yandex/go/payments/shared/wizard/welcome/a;", "presenter", "<init>", "(Landroid/content/Context;Ltse;Lpav;Lk7x0;Lcom/yandex/go/payments/shared/wizard/welcome/a;)V", "Lzy11;", "finishInput", "()V", "", "createButtonHeight", "updateMargins", "(I)V", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "onTouchOutside", "onDismissManually", "Ltse;", "Lpav;", "Lk7x0;", "Lcom/yandex/go/payments/shared/wizard/welcome/a;", "Lru/yandex/taxi/design/ListItemComponent;", "title", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "subtitle", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/view/ViewGroup;", "descriptionsContainer", "Landroid/view/ViewGroup;", "Landroid/view/View;", "scrollView", "Landroid/view/View;", "scrollIndicator", "Lru/yandex/taxi/design/ListItemInputComponent;", "nameInput", "Lru/yandex/taxi/design/ListItemInputComponent;", "createButtonContainer", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "Lru/yandex/taxi/design/ButtonComponent;", "Ll8x;", "textValueJob", "Ll8x;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "t3f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateAccountView extends SlideableModalView {
    public static final int $stable = 8;
    private final tse coroutineScope;
    private final ButtonComponent createButton;
    private final View createButtonContainer;
    private final ViewGroup descriptionsContainer;
    private final pav imageLoader;
    private final ListItemInputComponent nameInput;
    private final a presenter;
    private final View scrollIndicator;
    private final View scrollView;
    private final ListTextComponent subtitle;
    private final k7x0 tagUrlFormatter;
    private l8x textValueJob;
    private final ListItemComponent title;

    public CreateAccountView(Context context, tse tseVar, pav pavVar, k7x0 k7x0Var, a aVar) {
        super(context);
        this.coroutineScope = tseVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.presenter = aVar;
        int i = e6h0.create_shared_payment_title;
        WeakHashMap weakHashMap = b.a;
        this.title = (ListItemComponent) ((View) rp31.d(this, i));
        this.subtitle = (ListTextComponent) ((View) rp31.d(this, e6h0.create_shared_payment_subtitle));
        this.descriptionsContainer = (ViewGroup) ((View) rp31.d(this, e6h0.create_shared_payment_descriptions));
        this.scrollView = (View) rp31.d(this, e6h0.create_shared_payment_account_scroll_view);
        this.scrollIndicator = (View) rp31.d(this, e6h0.create_shared_payment_account_scroll_indicator);
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, e6h0.create_shared_payment_account_name_input));
        this.nameInput = listItemInputComponent;
        View view = (View) rp31.d(this, e6h0.create_shared_payment_account_create_button_container);
        this.createButtonContainer = view;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, e6h0.create_shared_payment_account_create_button));
        this.createButton = buttonComponent;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        int i2 = 1;
        listItemInputComponent.getInput().setOnCloseListener(new uw0(i2, this));
        listItemInputComponent.getInput().setImeOptions(6);
        listItemInputComponent.getInput().setOnEditorActionListener(new ff2(6, this));
        this.textValueJob = tje.N(tseVar, null, null, new CreateAccountView$special$$inlined$safeCollectIn$1(listItemInputComponent.textValueFlow(), null, this), 3);
        buttonComponent.setDebounceClickListener(new oxe(i2, this));
        view.addOnLayoutChangeListener(new u90(20, this));
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(CreateAccountView createAccountView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return true;
        }
        createAccountView.finishInput();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CreateAccountView createAccountView) {
        if (createAccountView.createButton.getIsAnimating()) {
            return;
        }
        createAccountView.finishInput();
        createAccountView.presenter.Mg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(CreateAccountView createAccountView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        xm2 xm2Var = new xm2(createAccountView, i4 - i2, 4);
        Rect rect = xw31.a;
        xm2Var.run();
        view.post(xm2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishInput() {
        ListItemInputComponent listItemInputComponent = this.nameInput;
        if (listItemInputComponent != null) {
            listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        }
        this.nameInput.clearFocus();
        requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMargins(int createButtonHeight) {
        xw31.x(createButtonHeight, this.scrollView);
        xw31.x(createButtonHeight, this.scrollIndicator);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return luh0.create_shared_payment_account;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(new t3f(this));
        q3f q3fVar = aVar.x;
        tmr0 tmr0Var = q3fVar.a;
        this.title.setTitle(tmr0Var.d);
        String str = tmr0Var.e;
        if (str == null || evu0.J(str)) {
            this.subtitle.setVisibility(8);
        } else {
            this.subtitle.setVisibility(0);
            this.subtitle.setText(str);
        }
        List<smr0> list = tmr0Var.g;
        this.descriptionsContainer.removeAllViews();
        for (smr0 smr0Var : list) {
            ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
            listItemComponent.setTitle(smr0Var.a);
            nac nacVar = (nac) this.imageLoader.a(listItemComponent.getLeadImageView());
            nacVar.e(y2h0.shared_payment_desciption_placeholder);
            nacVar.c(((m7x0) this.tagUrlFormatter).a(smr0Var.b));
            this.descriptionsContainer.addView(listItemComponent, -1, -2);
        }
        aVar.Ng();
        vnr0 vnr0Var = aVar.A;
        String str2 = q3fVar.a.a;
        rx2 rx2Var = vnr0Var.m;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("type_group", str2);
        }
        rx2Var.a.a("CreateFamilyAccount.CardShown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.onDismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.textValueJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.textValueJob = null;
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.presenter.onDismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.onDismiss();
    }
}
