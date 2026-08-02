package com.yandex.go.payments.shared.family.postcard.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;
import com.yandex.go.payments.shared.family.web.nativeapi.request.BackgroundState;
import com.yandex.go.payments.shared.family.web.nativeapi.request.PostcardParams;
import com.yandex.go.payments.shared.family.web.nativeapi.response.PostcardInfoResponse;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.age0;
import defpackage.avj0;
import defpackage.bge0;
import defpackage.bk;
import defpackage.cma1;
import defpackage.e230;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.g18;
import defpackage.jst;
import defpackage.k7d0;
import defpackage.kfe0;
import defpackage.kyh0;
import defpackage.luh0;
import defpackage.ny61;
import defpackage.pw0;
import defpackage.qu8;
import defpackage.t1w;
import defpackage.tfb0;
import defpackage.tse0;
import defpackage.ugd0;
import defpackage.vbv;
import defpackage.w130;
import defpackage.xw31;
import defpackage.y9p;
import defpackage.z9p;
import defpackage.zy11;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.LittleIconCircleButton;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b \u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010$\u001a\u00060#R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/go/payments/shared/family/postcard/ui/PostcardView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lbge0;", "Landroid/content/Context;", "activityContext", "Lcom/yandex/go/payments/shared/family/postcard/ui/a;", "presenter", "Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;", "params", "<init>", "(Landroid/content/Context;Lcom/yandex/go/payments/shared/family/postcard/ui/a;Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;)V", "Lzy11;", "applyParams", "()V", "initListeners", "updateBtnAddUserText", "Le230;", "insetsType", "()Le230;", "onModalViewDisappear", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbge0;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "Landroid/content/Context;", "getActivityContext$annotations", "Lcom/yandex/go/payments/shared/family/postcard/ui/a;", "Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;", "Lage0;", "mvpInner", "Lage0;", "Lg18;", "insetsConsumeCancellable", "Lg18;", "", "getHasCardText", "()Z", "hasCardText", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostcardView extends SlideableBindingModalView<bge0> {
    public static final int $stable = 8;
    private final Context activityContext;
    private g18 insetsConsumeCancellable;
    private final age0 mvpInner;
    private final PostcardParams params;
    private final a presenter;

    public PostcardView(Context context, a aVar, PostcardParams postcardParams) {
        super(context);
        this.activityContext = context;
        this.presenter = aVar;
        this.params = postcardParams;
        this.mvpInner = new age0(this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        initListeners();
    }

    private final void applyParams() {
        a aVar = this.presenter;
        List list = this.params.f.a;
        aVar.G = list;
        aVar.H = new Bitmap[list.size()];
        aVar.Kg(true);
        getBinding().b.setText(this.params.f.d);
        Integer num = this.params.f.b;
        getBinding().f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(num != null ? num.intValue() : PollMessageDraft.MAX_ANSWER_LENGTH)});
        getBinding().f.setHint(this.params.f.c);
        getBinding().b.setEnabled(getHasCardText());
        updateBtnAddUserText();
    }

    private static /* synthetic */ void getActivityContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasCardText() {
        if (getBinding().f.getText() != null) {
            return !evu0.J(r0);
        }
        return false;
    }

    private final void initListeners() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = getBinding().f;
        keyboardAwareRobotoEditText.setOnCloseListener(new pw0(7, this));
        keyboardAwareRobotoEditText.setOnFocusChangeListener(new bk(24, this));
        keyboardAwareRobotoEditText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.go.payments.shared.family.postcard.ui.PostcardView$initListeners$1$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                bge0 binding;
                boolean hasCardText;
                binding = PostcardView.this.getBinding();
                ButtonComponent buttonComponent = binding.b;
                hasCardText = PostcardView.this.getHasCardText();
                buttonComponent.setEnabled(hasCardText);
                PostcardView.this.updateBtnAddUserText();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        final int i = 0;
        getBinding().c.setOnClickListener(new View.OnClickListener(this) { // from class: zfe0
            public final /* synthetic */ PostcardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                PostcardView postcardView = this.b;
                switch (i2) {
                    case 0:
                        PostcardView.initListeners$lambda$1(postcardView, view);
                        break;
                    case 1:
                        PostcardView.initListeners$lambda$2(postcardView, view);
                        break;
                    case 2:
                        PostcardView.initListeners$lambda$3(postcardView, view);
                        break;
                    default:
                        PostcardView.initListeners$lambda$4(postcardView, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setOnClickListener(new View.OnClickListener(this) { // from class: zfe0
            public final /* synthetic */ PostcardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                PostcardView postcardView = this.b;
                switch (i22) {
                    case 0:
                        PostcardView.initListeners$lambda$1(postcardView, view);
                        break;
                    case 1:
                        PostcardView.initListeners$lambda$2(postcardView, view);
                        break;
                    case 2:
                        PostcardView.initListeners$lambda$3(postcardView, view);
                        break;
                    default:
                        PostcardView.initListeners$lambda$4(postcardView, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().d.setOnClickListener(new View.OnClickListener(this) { // from class: zfe0
            public final /* synthetic */ PostcardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                PostcardView postcardView = this.b;
                switch (i22) {
                    case 0:
                        PostcardView.initListeners$lambda$1(postcardView, view);
                        break;
                    case 1:
                        PostcardView.initListeners$lambda$2(postcardView, view);
                        break;
                    case 2:
                        PostcardView.initListeners$lambda$3(postcardView, view);
                        break;
                    default:
                        PostcardView.initListeners$lambda$4(postcardView, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        getBinding().g.setOnClickListener(new View.OnClickListener(this) { // from class: zfe0
            public final /* synthetic */ PostcardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                PostcardView postcardView = this.b;
                switch (i22) {
                    case 0:
                        PostcardView.initListeners$lambda$1(postcardView, view);
                        break;
                    case 1:
                        PostcardView.initListeners$lambda$2(postcardView, view);
                        break;
                    case 2:
                        PostcardView.initListeners$lambda$3(postcardView, view);
                        break;
                    default:
                        PostcardView.initListeners$lambda$4(postcardView, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0$0(PostcardView postcardView) {
        ((kfe0) postcardView.presenter.Dg()).X1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0$1(PostcardView postcardView, View view, boolean z) {
        ((kfe0) postcardView.presenter.Dg()).X1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$1(PostcardView postcardView, View view) {
        postcardView.presenter.Kg(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$2(PostcardView postcardView, View view) {
        a aVar = postcardView.presenter;
        String valueOf = String.valueOf(postcardView.getBinding().f.getText());
        z9p z9pVar = aVar.C;
        List list = aVar.G;
        int i = aVar.F;
        String str = ((BackgroundState) ((i < 0 || i >= list.size()) ? new BackgroundState(0) : list.get(i))).b;
        i d = ((j) z9pVar.a).d("FamilyAccount.CreateInvitationPostCard.AddParticipantTap");
        d.d("text", valueOf);
        d.d(C0553n3.g, str);
        d.m();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        aVar.y.a(new tfb0(((avj0) aVar.z).h(kyh0.order_for_other_choose_from_contacts), null, null, null, false, null, null, 262142), new vbv(ref$ObjectRef), new qu8(2, valueOf, aVar, ref$ObjectRef), aVar.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$3(PostcardView postcardView, View view) {
        a aVar = postcardView.presenter;
        y9p y9pVar = aVar.C.c;
        y9pVar.a.a("FamilyAccount.CreateInvitationPostCard.CloseButtonTap", tse0.n(y9pVar), 1, new HashMap());
        ((kfe0) aVar.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4(PostcardView postcardView, View view) {
        ((kfe0) postcardView.presenter.Dg()).X1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(PostcardView postcardView, t1w t1wVar) {
        postcardView.setTopSystemWindowInset(t1wVar.b);
        xw31.E(postcardView.getBinding().f, null, null, null, Integer.valueOf(t1wVar.g));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBtnAddUserText() {
        ButtonComponent buttonComponent = getBinding().b;
        boolean hasCardText = getHasCardText();
        PostcardParams postcardParams = this.params;
        buttonComponent.setText(hasCardText ? postcardParams.f.d : postcardParams.f.e);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public bge0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.postcard_view, parent, false);
        int i = e6h0.btn_add_user;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = e6h0.btn_change_background_container;
            if (((LittleIconCircleButton) cma1.O(i, inflate)) != null) {
                i = e6h0.btn_change_card_background;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    i = e6h0.btn_close;
                    ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                    if (imageView2 != null) {
                        i = e6h0.card_background;
                        ImageView imageView3 = (ImageView) cma1.O(i, inflate);
                        if (imageView3 != null) {
                            i = e6h0.card_text;
                            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) cma1.O(i, inflate);
                            if (keyboardAwareRobotoEditText != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i = e6h0.placeholder;
                                PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, inflate);
                                if (placeholderView != null) {
                                    return new bge0(constraintLayout, buttonComponent, imageView, imageView2, imageView3, keyboardAwareRobotoEditText, placeholderView);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return getBinding().d;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new k7d0(15, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        age0 age0Var = this.mvpInner;
        aVar.Bg(age0Var);
        age0Var.P7(true);
        applyParams();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        g18 g18Var = this.insetsConsumeCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        a aVar = this.presenter;
        if (aVar.I) {
            return;
        }
        PostcardInfoResponse postcardInfoResponse = new PostcardInfoResponse(EmptyList.a, null);
        jst.e.getClass();
        aVar.I = true;
        ugd0 ugd0Var = aVar.D;
        if (ugd0Var != null) {
            ugd0Var.invoke(postcardInfoResponse);
        }
        ((kfe0) aVar.Dg()).dismissView();
    }
}
