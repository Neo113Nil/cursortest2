package com.yandex.go.taxi.order.chat.ui.messenger;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import com.yandex.go.messenger_native.NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Action;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Service;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Action;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Reason;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bcs;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.co40;
import defpackage.cvu0;
import defpackage.cvw;
import defpackage.e230;
import defpackage.f2a1;
import defpackage.ih01;
import defpackage.j3y0;
import defpackage.k3y0;
import defpackage.ko70;
import defpackage.l3y0;
import defpackage.m3y0;
import defpackage.m4h0;
import defpackage.mh41;
import defpackage.n3y0;
import defpackage.n8h0;
import defpackage.nh41;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q350;
import defpackage.qje;
import defpackage.qu;
import defpackage.r350;
import defpackage.scc;
import defpackage.sls;
import defpackage.t7s;
import defpackage.tje;
import defpackage.w511;
import defpackage.xd2;
import defpackage.xkh0;
import defpackage.y130;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Action;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Service;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Action;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Reason;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00013B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u001fJ\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\u001fJ\u000f\u0010+\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u00101\u001a\u00020.8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/yandex/go/taxi/order/chat/ui/messenger/TaxiOrderMessengerModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lko70;", "Lk3y0;", "Lbcs;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lm3y0;", "presenter", "Lkotlin/Function0;", "Lzy11;", "appearCompleteCallback", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lm3y0;Lsls;)V", "Lcom/yandex/go/taxi/order/models/api/objects/Driver;", "driver", "", "getFormattedCarInfo", "(Lcom/yandex/go/taxi/order/models/api/objects/Driver;)Ljava/lang/String;", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lko70;", "fragmentContainer", "()Landroid/view/ViewGroup;", "onAppearAnimationComplete", "()V", "onAttachedToWindow", "initHeader", "(Lcom/yandex/go/taxi/order/models/api/objects/Driver;)V", "Landroid/graphics/drawable/Drawable;", "avatar", "showDriverAvatar", "(Landroid/graphics/drawable/Drawable;)V", "onDetachedFromWindow", "closeKeyboard", "dismiss", "close", "onBackPressed", "Lm3y0;", "Lsls;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "j3y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderMessengerModalView extends SlideableBindingModalView<ko70> implements k3y0, bcs {
    private static final String CAR_INFO_SEPARATOR = " • ";
    public static final j3y0 Companion = new j3y0();
    private final sls appearCompleteCallback;
    private final m3y0 presenter;

    public TaxiOrderMessengerModalView(FragmentActivity fragmentActivity, m3y0 m3y0Var, sls slsVar) {
        super(fragmentActivity);
        this.presenter = m3y0Var;
        this.appearCompleteCallback = slsVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    private final String getFormattedCarInfo(Driver driver) {
        String str = driver.c;
        if (str == null) {
            str = null;
        } else if (str.length() > 0) {
            str = ((Object) f2a1.c(str.charAt(0))) + str.substring(1);
        }
        List g = scc.g(str, driver.b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(obj);
            }
        }
        String X = kotlin.collections.a.X(arrayList, " ", null, null, null, 62);
        String str3 = driver.d;
        List g2 = scc.g(t7s.a(str3 != null ? cvu0.v(str3, " ", "", false) : null), X);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : g2) {
            String str4 = (String) obj2;
            if (str4 != null && str4.length() != 0) {
                arrayList2.add(obj2);
            }
        }
        return kotlin.collections.a.X(arrayList2, CAR_INFO_SEPARATOR, null, null, null, 62);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ko70 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xkh0.order_chat_modal_view, parent, false);
        int i = n8h0.chat_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) cma1.O(i, inflate);
        if (fragmentContainerView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = n8h0.iv_chat_calling;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = n8h0.iv_chat_closing;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView2 != null) {
                    i = n8h0.order_chat_header;
                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent != null) {
                        return new ko70(linearLayout, fragmentContainerView, linearLayout, appCompatImageView, appCompatImageView2, listItemComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.k3y0
    public void close() {
        dismiss();
    }

    @Override // defpackage.k3y0
    public void closeKeyboard() {
        FragmentContainerView fragmentContainerView = getBinding().b;
        fragmentContainerView.post(new ce0(fragmentContainerView, 15));
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        closeKeyboard();
        this.presenter.E.a.r(new qu(9));
    }

    @Override // defpackage.bcs
    public ViewGroup fragmentContainer() {
        return getBinding().b;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // defpackage.k3y0
    public void initHeader(Driver driver) {
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ko70 binding = getBinding();
        ru.yandex.taxi.design.utils.c.z(new TaxiOrderMessengerModalView$initHeader$1$1(0, this.presenter, m3y0.class, "onCloseClick", "onCloseClick()V", 0), binding.e);
        AppCompatImageView appCompatImageView = binding.d;
        appCompatImageView.setVisibility(!driver.t ? 0 : 8);
        if (appCompatImageView.getVisibility() == 0) {
            m3y0 m3y0Var = this.presenter;
            n3y0 n3y0Var = m3y0Var.D;
            int i = l3y0.b[m3y0Var.F.ordinal()];
            if (i == 1) {
                r350 r350Var = m3y0Var.B;
                NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service = NativeMessengerAnalyticsFacade$Service.TAXI;
                String str = n3y0Var.b;
                NativeMessengerAnalyticsFacade$Action nativeMessengerAnalyticsFacade$Action = NativeMessengerAnalyticsFacade$Action.CALL;
                co40 co40Var = r350Var.a;
                NativeMessengerAnalytics$Service b = r350.b(nativeMessengerAnalyticsFacade$Service);
                if (q350.c[nativeMessengerAnalyticsFacade$Action.ordinal()] != 1) {
                    w511.b();
                    return;
                }
                NativeMessengerAnalytics$Action nativeMessengerAnalytics$Action = NativeMessengerAnalytics$Action.Call;
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.KEY_SERVICE, b.getEventValue());
                hashMap.put("chat_id", str);
                hashMap.put("action", nativeMessengerAnalytics$Action.getEventValue());
                co40Var.a.a("NativeMessenger.InnerAction.Shown", hashMap, 1, new HashMap());
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                nh41 nh41Var = m3y0Var.C;
                WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service = WebMessengerAnalyticsFacade$Service.TAXI;
                String str2 = n3y0Var.b;
                WebMessengerAnalyticsFacade$Action webMessengerAnalyticsFacade$Action = WebMessengerAnalyticsFacade$Action.CALL;
                ih01 ih01Var = nh41Var.a;
                WebMessengerAnalytics$Service a = nh41.a(webMessengerAnalyticsFacade$Service);
                if (mh41.c[webMessengerAnalyticsFacade$Action.ordinal()] != 1) {
                    w511.b();
                    return;
                }
                WebMessengerAnalytics$Action webMessengerAnalytics$Action = WebMessengerAnalytics$Action.Call;
                ih01Var.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Constants.KEY_SERVICE, a.getEventValue());
                hashMap2.put("chat_id", str2);
                hashMap2.put("action", webMessengerAnalytics$Action.getEventValue());
                ih01Var.a.a("WebMessenger.InnerAction.Shown", hashMap2, 1, new HashMap());
            }
        }
        ru.yandex.taxi.design.utils.c.z(new TaxiOrderMessengerModalView$initHeader$1$2(0, this.presenter, m3y0.class, "callPhone", "callPhone()V", 0), appCompatImageView);
        ListItemComponent listItemComponent = binding.f;
        listItemComponent.setTitle(driver.n);
        listItemComponent.setSubtitle(getFormattedCarInfo(driver));
        listItemComponent.setLeadImage(m4h0.ic_chat_avatar_placeholder);
        listItemComponent.getLeadImageView().animate();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(0, new TaxiOrderMessengerModalView$insetsType$1(getBinding(), ko70.class, "chatContent", "getChatContent()Landroid/widget/LinearLayout;", 0), true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        this.appearCompleteCallback.invoke();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cvw.g0(qje.t(getFullscreenBackgroundAttrRes(), getContext()), getCornersRadius(), getBottomSheet());
        FragmentContainerView fragmentContainerView = getBinding().b;
        fragmentContainerView.post(new xd2(fragmentContainerView, 1));
        m3y0 m3y0Var = this.presenter;
        m3y0Var.Bg(this);
        n3y0 n3y0Var = m3y0Var.D;
        o2y0 o2y0Var = n3y0Var.a;
        String str = n3y0Var.b;
        initHeader(o2y0Var.b().V().g);
        tje.N(m3y0Var.Jg(), null, null, new TaxiOrderMessengerPresenter$attachView$1(m3y0Var, o2y0Var, this, null), 3);
        com.yandex.go.messenger_native.d dVar = m3y0Var.A;
        tje.N(m3y0Var.Jg(), null, null, new TaxiOrderMessengerPresenter$attachView$$inlined$collectIn$1(e.t(new b(e.X(e.t(dVar.c.a.a()), new NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1(null, dVar)))), null, m3y0Var), 3);
        tje.N(m3y0Var.H, null, null, new TaxiOrderMessengerPresenter$attachView$4(this, m3y0Var, null), 3);
        int i = l3y0.b[m3y0Var.F.ordinal()];
        if (i == 1) {
            r350 r350Var = m3y0Var.B;
            NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service = NativeMessengerAnalyticsFacade$Service.TAXI;
            co40 co40Var = r350Var.a;
            NativeMessengerAnalytics$Service b = r350.b(nativeMessengerAnalyticsFacade$Service);
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.KEY_SERVICE, b.getEventValue());
            hashMap.put("chat_id", str);
            co40Var.a.a("NativeMessenger.Opened", hashMap, 1, new HashMap());
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        nh41 nh41Var = m3y0Var.C;
        WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service = WebMessengerAnalyticsFacade$Service.TAXI;
        ih01 ih01Var = nh41Var.a;
        WebMessengerAnalytics$Service a = nh41.a(webMessengerAnalyticsFacade$Service);
        ih01Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Constants.KEY_SERVICE, a.getEventValue());
        hashMap2.put("chat_id", str);
        ih01Var.a.a("WebMessenger.Opened", hashMap2, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        m3y0 m3y0Var = this.presenter;
        n3y0 n3y0Var = m3y0Var.D;
        int i = l3y0.b[m3y0Var.F.ordinal()];
        if (i == 1) {
            m3y0Var.B.a(NativeMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, NativeMessengerAnalyticsFacade$Reason.BACK_PRESSED);
        } else if (i == 2) {
            m3y0Var.C.b(WebMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, WebMessengerAnalyticsFacade$Reason.BACK_PRESSED);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.k3y0
    public void showDriverAvatar(Drawable avatar) {
        getBinding().f.setLeadImage(avatar);
    }
}
