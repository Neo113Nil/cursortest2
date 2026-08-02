package com.yandex.go.promocodes.base.impl.ui.share.v2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.promocodes.base.impl.ui.share.v2.PromocodeSharingViewV2;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import com.yandex.go.promocodes.referral.impl.provider.k;
import defpackage.anf0;
import defpackage.cma1;
import defpackage.da0;
import defpackage.dvh0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g9h;
import defpackage.gwk0;
import defpackage.hrf0;
import defpackage.ief;
import defpackage.inf0;
import defpackage.ip11;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.m0z;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.q5z;
import defpackage.qu;
import defpackage.tje;
import defpackage.tmf0;
import defpackage.u3w;
import defpackage.udj;
import defpackage.umf0;
import defpackage.v5c0;
import defpackage.vjr0;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xoe;
import defpackage.xw31;
import defpackage.y6h0;
import defpackage.ymf0;
import defpackage.z3v0;
import defpackage.zmh;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.ui.CustomTypefaceSpan;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R$\u0010=\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/ui/share/v2/PromocodeSharingViewV2;", "Landroid/widget/LinearLayout;", "Linf0;", "Landroid/content/Context;", "context", "Lumf0;", "navigator", "Lymf0;", "presenter", "Lpav;", "imageLoader", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lumf0;Lymf0;Lpav;Lip11;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lanf0;", "stateViewModel", "updateState", "(Lanf0;)V", "Lxoe;", "stateModel", "updateCopyButtonState", "(Lxoe;)V", "goBack", "Ludj;", "dialogData", "showDialog", "(Ludj;)V", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "getInitialReferralCode", "()Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "Lumf0;", "Lymf0;", "Lpav;", "Lip11;", "Lhrf0;", "viewBinding", "Lhrf0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/LoadingComponent;", "loadingPlaceholder", "Lru/yandex/taxi/design/LoadingComponent;", "Landroidx/appcompat/widget/AppCompatImageView;", "shareViewPic", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/yandex/taxi/design/ListHeaderComponent;", "title", "Lru/yandex/taxi/design/ListHeaderComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "instructionItemsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/design/ListItemComponent;", "sharePromocodeButton", "Lru/yandex/taxi/design/ListItemComponent;", "copyPromocodeButton", "initialReferralCode", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "getInitialReferralCode$impl", "setInitialReferralCode$impl", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromocodeSharingViewV2 extends LinearLayout implements inf0 {
    private final ListItemComponent copyPromocodeButton;
    private final pav imageLoader;
    private ReferralCode initialReferralCode;
    private final RecyclerView instructionItemsRecyclerView;
    private final LoadingComponent loadingPlaceholder;
    private final umf0 navigator;
    private final ymf0 presenter;
    private final ListItemComponent sharePromocodeButton;
    private final AppCompatImageView shareViewPic;
    private final ListHeaderComponent title;
    private final ToolbarComponent toolbar;
    private final ip11 typefaceDelegate;
    private final hrf0 viewBinding;

    public PromocodeSharingViewV2(Context context, umf0 umf0Var, ymf0 ymf0Var, pav pavVar, ip11 ip11Var) {
        super(context);
        this.navigator = umf0Var;
        this.presenter = ymf0Var;
        this.imageLoader = pavVar;
        this.typefaceDelegate = ip11Var;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(dvh0.promocode_share_view_v2, (ViewGroup) this, false);
        addView(inflate);
        int i2 = y6h0.copy_promocode;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
        if (listItemComponent != null) {
            i2 = y6h0.instruction_items_rv;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
            if (recyclerView != null) {
                i2 = y6h0.loading_placeholder;
                LoadingComponent loadingComponent = (LoadingComponent) cma1.O(i2, inflate);
                if (loadingComponent != null) {
                    i2 = y6h0.share_promocode;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, inflate);
                    if (listItemComponent2 != null) {
                        i2 = y6h0.share_view_pic;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
                        if (appCompatImageView != null) {
                            i2 = y6h0.sharing_toolbar;
                            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i2, inflate);
                            if (toolbarComponent != null) {
                                i2 = y6h0.title;
                                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i2, inflate);
                                if (listHeaderComponent != null) {
                                    this.viewBinding = new hrf0((LinearLayout) inflate, listItemComponent, recyclerView, loadingComponent, listItemComponent2, appCompatImageView, toolbarComponent, listHeaderComponent);
                                    this.toolbar = toolbarComponent;
                                    this.loadingPlaceholder = loadingComponent;
                                    this.shareViewPic = appCompatImageView;
                                    this.title = listHeaderComponent;
                                    this.instructionItemsRecyclerView = recyclerView;
                                    this.sharePromocodeButton = listItemComponent2;
                                    this.copyPromocodeButton = listItemComponent;
                                    toolbarComponent.disableNavigationButton();
                                    toolbarComponent.enableCloseButton();
                                    toolbarComponent.setOnCloseClickListener(new Runnable(this) { // from class: krf0
                                        public final /* synthetic */ PromocodeSharingViewV2 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i3 = i;
                                            PromocodeSharingViewV2 promocodeSharingViewV2 = this.b;
                                            switch (i3) {
                                                case 0:
                                                    PromocodeSharingViewV2._init_$lambda$0(promocodeSharingViewV2);
                                                    break;
                                                case 1:
                                                    PromocodeSharingViewV2._init_$lambda$1(promocodeSharingViewV2);
                                                    break;
                                                case 2:
                                                    PromocodeSharingViewV2._init_$lambda$2(promocodeSharingViewV2);
                                                    break;
                                                default:
                                                    PromocodeSharingViewV2._init_$lambda$3(promocodeSharingViewV2);
                                                    break;
                                            }
                                        }
                                    });
                                    final int i3 = 1;
                                    recyclerView.setHasFixedSize(true);
                                    final int i4 = 2;
                                    listItemComponent.setTrailTextStyle(2);
                                    listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: krf0
                                        public final /* synthetic */ PromocodeSharingViewV2 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i32 = i3;
                                            PromocodeSharingViewV2 promocodeSharingViewV2 = this.b;
                                            switch (i32) {
                                                case 0:
                                                    PromocodeSharingViewV2._init_$lambda$0(promocodeSharingViewV2);
                                                    break;
                                                case 1:
                                                    PromocodeSharingViewV2._init_$lambda$1(promocodeSharingViewV2);
                                                    break;
                                                case 2:
                                                    PromocodeSharingViewV2._init_$lambda$2(promocodeSharingViewV2);
                                                    break;
                                                default:
                                                    PromocodeSharingViewV2._init_$lambda$3(promocodeSharingViewV2);
                                                    break;
                                            }
                                        }
                                    });
                                    listItemComponent2.setDebounceClickListener(new Runnable(this) { // from class: krf0
                                        public final /* synthetic */ PromocodeSharingViewV2 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i32 = i4;
                                            PromocodeSharingViewV2 promocodeSharingViewV2 = this.b;
                                            switch (i32) {
                                                case 0:
                                                    PromocodeSharingViewV2._init_$lambda$0(promocodeSharingViewV2);
                                                    break;
                                                case 1:
                                                    PromocodeSharingViewV2._init_$lambda$1(promocodeSharingViewV2);
                                                    break;
                                                case 2:
                                                    PromocodeSharingViewV2._init_$lambda$2(promocodeSharingViewV2);
                                                    break;
                                                default:
                                                    PromocodeSharingViewV2._init_$lambda$3(promocodeSharingViewV2);
                                                    break;
                                            }
                                        }
                                    });
                                    listItemComponent2.subtitle().setAlpha(0.6f);
                                    final int i5 = 3;
                                    Runnable runnable = new Runnable(this) { // from class: krf0
                                        public final /* synthetic */ PromocodeSharingViewV2 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i32 = i5;
                                            PromocodeSharingViewV2 promocodeSharingViewV2 = this.b;
                                            switch (i32) {
                                                case 0:
                                                    PromocodeSharingViewV2._init_$lambda$0(promocodeSharingViewV2);
                                                    break;
                                                case 1:
                                                    PromocodeSharingViewV2._init_$lambda$1(promocodeSharingViewV2);
                                                    break;
                                                case 2:
                                                    PromocodeSharingViewV2._init_$lambda$2(promocodeSharingViewV2);
                                                    break;
                                                default:
                                                    PromocodeSharingViewV2._init_$lambda$3(promocodeSharingViewV2);
                                                    break;
                                            }
                                        }
                                    };
                                    Rect rect = xw31.a;
                                    setFocusableInTouchMode(true);
                                    requestFocus();
                                    setOnKeyListener(new g9h(4, runnable));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PromocodeSharingViewV2 promocodeSharingViewV2) {
        ymf0 ymf0Var = promocodeSharingViewV2.presenter;
        tmf0 tmf0Var = ymf0Var.A;
        anf0 anf0Var = (anf0) ymf0Var.F.getValue();
        if (anf0Var instanceof z3v0) {
            z3v0 z3v0Var = (z3v0) anf0Var;
            int i = z3v0Var.i;
            ReferralService referralService = z3v0Var.h;
            tmf0Var.a("cancel", referralService, i, true);
            tmf0Var.b("cancel", referralService, i, true);
        }
        ((inf0) ymf0Var.Dg()).goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PromocodeSharingViewV2 promocodeSharingViewV2) {
        ymf0 ymf0Var = promocodeSharingViewV2.presenter;
        anf0 anf0Var = (anf0) ymf0Var.F.getValue();
        if (anf0Var instanceof z3v0) {
            tje.N(ymf0Var.Jg(), null, null, new PromoCodeSharePresenterV2$onCopyClick$1(ymf0Var, anf0Var, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(PromocodeSharingViewV2 promocodeSharingViewV2) {
        ymf0 ymf0Var = promocodeSharingViewV2.presenter;
        anf0 anf0Var = (anf0) ymf0Var.F.getValue();
        if (anf0Var instanceof z3v0) {
            z3v0 z3v0Var = (z3v0) anf0Var;
            ymf0Var.A.a("share", z3v0Var.h, z3v0Var.i, true);
            ief iefVar = z3v0Var.f;
            String str = null;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            xdf xdfVar = ymf0Var.D;
            String str2 = z3v0Var.g;
            xdfVar.getClass();
            if (str2 != null && str2.length() != 0) {
                str = (h == null || !evu0.y(str2, "$CURRENCY$", false)) ? str2 : xdf.g(h, str2);
            }
            if (str == null) {
                str = "";
            }
            vjr0 vjr0Var = ymf0Var.z;
            int i = kyh0.referral_share_title;
            Activity activity = vjr0Var.a;
            q5z.c0(str, activity.getString(i), activity, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(PromocodeSharingViewV2 promocodeSharingViewV2) {
        ymf0 ymf0Var = promocodeSharingViewV2.presenter;
        tmf0 tmf0Var = ymf0Var.A;
        anf0 anf0Var = (anf0) ymf0Var.F.getValue();
        if (anf0Var instanceof z3v0) {
            z3v0 z3v0Var = (z3v0) anf0Var;
            int i = z3v0Var.i;
            ReferralService referralService = z3v0Var.h;
            tmf0Var.a("back_button", referralService, i, true);
            tmf0Var.b("back_button", referralService, i, true);
        }
        ((inf0) ymf0Var.Dg()).goBack();
    }

    @Override // defpackage.inf0
    public ReferralCode getInitialReferralCode() {
        return this.initialReferralCode;
    }

    public final ReferralCode getInitialReferralCode$impl() {
        return this.initialReferralCode;
    }

    @Override // defpackage.inf0
    public void goBack() {
        ((da0) ((v5c0) this.navigator).b).r(new qu(9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ymf0 ymf0Var = this.presenter;
        ymf0Var.Bg(this);
        tje.N(ymf0Var.Jg(), null, null, new PromoCodeSharePresenterV2$attachView$1(ymf0Var, this, null), 3);
        ReferralCode initialReferralCode = getInitialReferralCode();
        if (initialReferralCode != null) {
            ymf0Var.Lg(initialReferralCode);
        } else {
            e.H(ymf0Var.Jg(), new o(new jqr(e.t(((k) ymf0Var.x).a()), new PromoCodeSharePresenterV2$attachView$2(ymf0Var, null), 3), new PromoCodeSharePresenterV2$attachView$3(3, null)));
        }
        this.toolbar.requestAccessibilityFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void setInitialReferralCode$impl(ReferralCode referralCode) {
        this.initialReferralCode = referralCode;
    }

    @Override // defpackage.inf0
    public void showDialog(udj dialogData) {
        ((v5c0) this.navigator).L(dialogData);
    }

    @Override // defpackage.inf0
    public void updateCopyButtonState(xoe stateModel) {
        this.copyPromocodeButton.setTitle(stateModel.a);
        ListItemComponent listItemComponent = this.copyPromocodeButton;
        String str = stateModel.b;
        listItemComponent.setTitleAlignment(str.length() == 0 ? 1 : 0);
        this.copyPromocodeButton.setSubtitle(str);
        this.copyPromocodeButton.setTrailCompanionText(stateModel.c);
    }

    @Override // defpackage.inf0
    public void updateState(anf0 stateViewModel) {
        if (stateViewModel instanceof m0z) {
            this.loadingPlaceholder.setVisibility(0);
            this.title.setVisibility(8);
            this.instructionItemsRecyclerView.setVisibility(8);
            this.sharePromocodeButton.setVisibility(8);
            this.copyPromocodeButton.setVisibility(8);
            return;
        }
        if (!(stateViewModel instanceof z3v0)) {
            w511.b();
            return;
        }
        this.loadingPlaceholder.setVisibility(8);
        z3v0 z3v0Var = (z3v0) stateViewModel;
        String str = z3v0Var.b;
        if (str.length() > 0) {
            ((nac) this.imageLoader.a(this.shareViewPic)).c(str);
        }
        ListHeaderComponent listHeaderComponent = this.title;
        SpannableString spannableString = new SpannableString(z3v0Var.a);
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        spannableString.setSpan(new CustomTypefaceSpan(((zmh) ip11Var).d()), 0, spannableString.length(), 33);
        listHeaderComponent.setTitle(spannableString);
        this.title.setVisibility(0);
        this.instructionItemsRecyclerView.setAdapter(new u3w(z3v0Var.d));
        this.instructionItemsRecyclerView.setVisibility(0);
        this.sharePromocodeButton.setTitle(z3v0Var.j);
        this.sharePromocodeButton.setSubtitle(z3v0Var.k);
        this.sharePromocodeButton.setVisibility(0);
        updateCopyButtonState(z3v0Var.e);
        this.copyPromocodeButton.setVisibility(0);
    }
}
