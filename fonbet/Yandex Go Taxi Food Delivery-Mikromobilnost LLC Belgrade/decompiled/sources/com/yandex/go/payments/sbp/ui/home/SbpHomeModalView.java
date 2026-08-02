package com.yandex.go.payments.sbp.ui.home;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import defpackage.at3;
import defpackage.cde;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dfm0;
import defpackage.dq4;
import defpackage.e6h0;
import defpackage.ff2;
import defpackage.g0c;
import defpackage.g1a0;
import defpackage.g9a0;
import defpackage.gq4;
import defpackage.he7;
import defpackage.iq4;
import defpackage.luh0;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.qzm;
import defpackage.rc6;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.ugm0;
import defpackage.utg0;
import defpackage.vp4;
import defpackage.w04;
import defpackage.wgm0;
import defpackage.wnb1;
import defpackage.xgm0;
import defpackage.ygm0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B5\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010\u001cJ/\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00108\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u00109\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00102R\u0014\u0010:\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102¨\u0006<"}, d2 = {"Lcom/yandex/go/payments/sbp/ui/home/SbpHomeModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxgm0;", "Landroid/content/Context;", "context", "Lygm0;", "presenter", "Lg1a0;", "paymentImageLoader", "Lkotlin/Function1;", "Lgq4;", "Lzy11;", "onBankItemSelected", "<init>", "(Landroid/content/Context;Lygm0;Lg1a0;Ltls;)V", "Landroid/view/ViewGroup;", "container", "", "barHeight", "barTopMargin", "barStartMargin", "barEndMargin", "addShimmeringBar", "(Landroid/view/ViewGroup;IIII)V", "bankInfo", "onItemSelected", "(Lgq4;)V", "closeKeyboard", "()V", "Landroid/view/LayoutInflater;", "inflater", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxgm0;", "onAttachedToWindow", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "getTopPadding", "()I", "Lygm0;", "Ltls;", "Lugm0;", "sbpHomeBanksAdapter", "Lugm0;", "shimmeringBarMarginStart", CA20Status.STATUS_USER_I, "topShimmeringBarHeight", "topShimmeringBarMarginTop", "topShimmeringBarMarginEnd", "bottomShimmeringBarHeight", "bottomShimmeringBarMarginTop", "bottomShimmeringBarMarginStart", "bottomShimmeringBarMarginEnd", "modalViewCornerRadius", "wgm0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpHomeModalView extends SlideableBindingModalView<xgm0> {
    public static final int $stable = 8;
    private final int bottomShimmeringBarHeight;
    private final int bottomShimmeringBarMarginEnd;
    private final int bottomShimmeringBarMarginStart;
    private final int bottomShimmeringBarMarginTop;
    private final int modalViewCornerRadius;
    private final tls onBankItemSelected;
    private final ygm0 presenter;
    private final ugm0 sbpHomeBanksAdapter;
    private final int shimmeringBarMarginStart;
    private final int topShimmeringBarHeight;
    private final int topShimmeringBarMarginEnd;
    private final int topShimmeringBarMarginTop;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.payments.sbp.ui.home.SbpHomeModalView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(((ugm0) this.receiver).getItem(((Number) obj).intValue()) instanceof dq4);
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.payments.sbp.ui.home.SbpHomeModalView$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((ygm0) this.receiver).A.g((String) obj);
            return zy11.a;
        }
    }

    public SbpHomeModalView(Context context, ygm0 ygm0Var, g1a0 g1a0Var, tls tlsVar) {
        super(context);
        this.presenter = ygm0Var;
        this.onBankItemSelected = tlsVar;
        SbpHomeModalView$sbpHomeBanksAdapter$1 sbpHomeModalView$sbpHomeBanksAdapter$1 = new SbpHomeModalView$sbpHomeBanksAdapter$1(1, this, SbpHomeModalView.class, "onItemSelected", "onItemSelected(Lcom/yandex/go/payments/sbp/domain/model/BankInfo;)V", 0);
        int i = rc6.U;
        g0c a = qoi0.a(dq4.class);
        at3 at3Var = new at3(17);
        at3 at3Var2 = new at3(18);
        Class a2 = a.a();
        int i2 = 1;
        he7 he7Var = new he7(i2, at3Var2);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, at3Var, emptyList, he7Var, null);
        int i3 = vp4.W;
        g0c a3 = qoi0.a(iq4.class);
        ugm0 ugm0Var = new ugm0(scc.g(zxsVar, new zxs(a3.a(), 0, new at3(16), emptyList, new he7(i2, new w04(7, sbpHomeModalView$sbpHomeBanksAdapter$1, g1a0Var)), null)));
        this.sbpHomeBanksAdapter = ugm0Var;
        int u = tje.u(16, getContext());
        this.shimmeringBarMarginStart = u;
        int u2 = tje.u(22, getContext());
        this.topShimmeringBarHeight = u2;
        int u3 = tje.u(0, getContext());
        this.topShimmeringBarMarginTop = u3;
        int u4 = tje.u(16, getContext());
        this.topShimmeringBarMarginEnd = u4;
        this.bottomShimmeringBarHeight = tje.u(24, getContext());
        this.bottomShimmeringBarMarginTop = tje.u(24, getContext());
        this.bottomShimmeringBarMarginStart = tje.u(24, getContext());
        this.bottomShimmeringBarMarginEnd = tje.u(200, getContext());
        int r = tje.r(utg0.sbp_home_modal_view_corner_radius, getContext());
        this.modalViewCornerRadius = r;
        wnb1.d(r, getBottomSheet());
        ((RecyclerView) getBinding().b.d).setAdapter(ugm0Var);
        ((RecyclerView) getBinding().b.d).setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((RecyclerView) getBinding().b.d).addItemDecoration(new cde((RecyclerView) getBinding().b.d, new AnonymousClass1(1, ugm0Var, ugm0.class, "isHeader", "isHeader(I)Z", 0)));
        setFocusableInTouchMode(true);
        ((ListItemInputComponent) getBinding().b.g).setInputPaddingBottom((int) tje.x(getContext(), 13.5f));
        ((ListItemInputComponent) getBinding().b.g).setTrailPaddingBottom((int) tje.x(getContext(), 13.5f));
        ((ListItemInputComponent) getBinding().b.g).setInputType(1);
        ((ListItemInputComponent) getBinding().b.g).setImeOptions(3);
        ((ListItemInputComponent) getBinding().b.g).setOnEditorActionListener(new ff2(14, this));
        ((ListItemInputComponent) getBinding().b.g).getInput().addTextChangedListener(new TextChangedListener(new AnonymousClass3(1, ygm0Var, ygm0.class, "searchQueryUpdated", "searchQueryUpdated(Ljava/lang/String;)V", 0)));
        SbpHomeModalView sbpHomeModalView = this;
        sbpHomeModalView.addShimmeringBar((LinearLayout) getBinding().c.c, u2, u3, u, u4);
        int i4 = 0;
        while (i4 < 20) {
            sbpHomeModalView.addShimmeringBar((LinearLayout) sbpHomeModalView.getBinding().c.c, sbpHomeModalView.bottomShimmeringBarHeight, sbpHomeModalView.bottomShimmeringBarMarginTop, sbpHomeModalView.bottomShimmeringBarMarginStart, sbpHomeModalView.bottomShimmeringBarMarginEnd);
            i4++;
            sbpHomeModalView = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SbpHomeModalView sbpHomeModalView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return true;
        }
        sbpHomeModalView.closeKeyboard();
        return true;
    }

    private final void addShimmeringBar(ViewGroup container, int barHeight, int barTopMargin, int barStartMargin, int barEndMargin) {
        View shimmeringBar = new ShimmeringBar(getContext(), null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, barHeight);
        marginLayoutParams.topMargin = barTopMargin;
        marginLayoutParams.setMarginStart(barStartMargin);
        marginLayoutParams.setMarginEnd(barEndMargin);
        shimmeringBar.setLayoutParams(marginLayoutParams);
        container.addView(shimmeringBar);
    }

    private final void closeKeyboard() {
        ((ListItemInputComponent) getBinding().b.g).getInput().clearFocus();
        KeyboardAwareRobotoEditText input = ((ListItemInputComponent) getBinding().b.g).getInput();
        if (input == null) {
            return;
        }
        input.post(new ce0(input, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemSelected(gq4 bankInfo) {
        closeKeyboard();
        this.onBankItemSelected.invoke(bankInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xgm0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(luh0.sbp_home_modal_view, parent, false);
        int i = e6h0.sbp_home_content_group;
        View O2 = cma1.O(i, inflate);
        if (O2 != null) {
            int i2 = e6h0.banks_list;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, O2);
            if (recyclerView != null) {
                i2 = e6h0.not_found_message;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O2);
                if (robotoTextView != null) {
                    i2 = e6h0.retry_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O2);
                    if (buttonComponent != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) O2;
                        i2 = e6h0.search_bar;
                        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i2, O2);
                        if (listItemInputComponent != null) {
                            i2 = e6h0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O2);
                            if (robotoTextView2 != null && (O = cma1.O((i2 = e6h0.view), O2)) != null) {
                                qzm qzmVar = new qzm(constraintLayout, recyclerView, robotoTextView, buttonComponent, listItemInputComponent, robotoTextView2, O);
                                i = e6h0.sbp_home_loading_group;
                                View O3 = cma1.O(i, inflate);
                                if (O3 != null) {
                                    LinearLayout linearLayout = (LinearLayout) O3;
                                    return new xgm0((FrameLayout) inflate, qzmVar, new nzm(linearLayout, 7, linearLayout));
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return tje.v(getContext(), 8.0f);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ygm0 ygm0Var = this.presenter;
        ygm0Var.Bg(new wgm0(this));
        dfm0 dfm0Var = ygm0Var.y;
        g9a0 g9a0Var = dfm0Var.b;
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = dfm0Var.d;
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        g9a0Var.a.a("PaymentMethods.SBP.BankListShown", hashMap, 1, new HashMap());
        pzt0 pzt0Var = ygm0Var.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ygm0Var.B = tje.N(ygm0Var.Jg(), null, null, new SbpHomePresenter$requestSbpTokenHomeInfo$1(ygm0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        ViewGroup bottomSheet = getBottomSheet();
        ViewGroup.LayoutParams layoutParams = getBottomSheet().getLayoutParams();
        layoutParams.height = getContent().getMeasuredHeight();
        bottomSheet.setLayoutParams(layoutParams);
    }
}
