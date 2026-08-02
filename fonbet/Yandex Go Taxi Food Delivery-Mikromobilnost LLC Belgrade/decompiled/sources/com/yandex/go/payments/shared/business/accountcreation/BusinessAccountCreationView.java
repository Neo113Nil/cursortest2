package com.yandex.go.payments.shared.business.accountcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.a60;
import defpackage.amp0;
import defpackage.aue;
import defpackage.ax6;
import defpackage.bc;
import defpackage.bi41;
import defpackage.bue;
import defpackage.c0g;
import defpackage.c230;
import defpackage.c800;
import defpackage.clh;
import defpackage.cma1;
import defpackage.cve;
import defpackage.d0g;
import defpackage.d82;
import defpackage.dp41;
import defpackage.due;
import defpackage.e230;
import defpackage.e32;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.ffe;
import defpackage.fg41;
import defpackage.fw6;
import defpackage.g1a0;
import defpackage.gw6;
import defpackage.hw6;
import defpackage.hwf;
import defpackage.hxx;
import defpackage.i6r;
import defpackage.id00;
import defpackage.il;
import defpackage.iw6;
import defpackage.j3j0;
import defpackage.jor0;
import defpackage.k7x0;
import defpackage.kv90;
import defpackage.kw6;
import defpackage.lpu0;
import defpackage.lq31;
import defpackage.luh0;
import defpackage.lv90;
import defpackage.m470;
import defpackage.m6;
import defpackage.mh3;
import defpackage.ms41;
import defpackage.n20;
import defpackage.npu0;
import defpackage.nsa1;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pnu0;
import defpackage.pph0;
import defpackage.px6;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qor0;
import defpackage.qqy;
import defpackage.qx6;
import defpackage.r5f;
import defpackage.rk6;
import defpackage.rmr0;
import defpackage.rpu0;
import defpackage.rqo;
import defpackage.sn8;
import defpackage.t0a0;
import defpackage.t61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tlu0;
import defpackage.tmr0;
import defpackage.to41;
import defpackage.tor0;
import defpackage.tpu0;
import defpackage.u90;
import defpackage.uf41;
import defpackage.uma0;
import defpackage.uor0;
import defpackage.uva;
import defpackage.v770;
import defpackage.vnr0;
import defpackage.vor0;
import defpackage.vw6;
import defpackage.ww6;
import defpackage.wwf;
import defpackage.x3;
import defpackage.xw31;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.ynr0;
import defpackage.zm41;
import defpackage.zor0;
import defpackage.zuj0;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.n;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.stories.data.StoriesState;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.LoadingStoriesComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListViewType;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B9\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020%2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020%H\u0016¢\u0006\u0004\b5\u0010'J\u000f\u00106\u001a\u00020%H\u0016¢\u0006\u0004\b6\u0010'J\u0017\u00109\u001a\u00020%2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020%H\u0014¢\u0006\u0004\b;\u0010'J\u000f\u0010<\u001a\u00020%H\u0014¢\u0006\u0004\b<\u0010'J\u000f\u0010=\u001a\u00020%H\u0014¢\u0006\u0004\b=\u0010'J\u0017\u0010>\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020%H\u0002¢\u0006\u0004\b@\u0010'J\u000f\u0010A\u001a\u00020%H\u0002¢\u0006\u0004\bA\u0010'J#\u0010C\u001a\b\u0012\u0004\u0012\u00020B0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020%2\u0006\u00102\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0014\u0010a\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\\R\u0014\u0010e\u001a\u00020b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010oR\u0014\u0010t\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010oR\u0014\u0010v\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010oR\u0014\u0010x\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010oR\u0014\u0010z\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010oR\u0014\u0010~\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010}R\u0016\u0010\u0082\u0001\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\\¨\u0006\u0083\u0001"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/BusinessAccountCreationView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lqx6;", "Lhw6;", "Landroid/content/Context;", "context", "Lgw6;", "creationComponent", "Lffe;", "contentContainer", "Lqnu0;", "storiesUiHolderFactory", "Lzm41;", "webViewContainerDependencies", "Lbue;", "corpAccountFlowDataInteractorFactory", "<init>", "(Landroid/content/Context;Lgw6;Lffe;Lqnu0;Lzm41;Lbue;)V", "Le230;", "insetsType", "()Le230;", "Le32;", "getAnalyticsContext", "()Le32;", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lqx6;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "settlingLayoutChanges", "()Z", "", "Lru/yandex/taxi/communications/api/dto/Story;", "stories", "setStories", "(Ljava/util/List;)V", "Lax6;", ClidProvider.STATE, "updateViews", "(Lax6;)V", "showLoader", "hideLoader", "Lru/yandex/taxi/web/UiWebViewConfig;", ConfigConstants.CONFIG, "showWebView", "(Lru/yandex/taxi/web/UiWebViewConfig;)V", "onBackPressed", "onSlideOut", "onTouchOutside", "setupStories", "(Lgw6;)V", "setupViews", "setButtonAnalyticsNames", "Lrpu0;", "convertStoryToStoryPreviewInfo", "(Ljava/util/List;)Ljava/util/List;", "Lvw6;", "setPaymentView", "(Lvw6;)V", "Lffe;", "Lqnu0;", "Lzm41;", "Lbue;", "Lcom/yandex/go/payments/shared/business/accountcreation/a;", "presenter", "Lcom/yandex/go/payments/shared/business/accountcreation/a;", "Lg1a0;", "paymentImageLoader", "Lg1a0;", "Lpnu0;", "storiesUiHolder", "Lpnu0;", "analyticsContext", "Le32;", "Landroid/view/View$OnLayoutChangeListener;", "addButtonContainerLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "getScrollView", "()Landroid/view/View;", "scrollView", "getItemsContainer", "itemsContainer", "getShimmerLayout", "shimmerLayout", "Lru/yandex/taxi/design/ListTitleComponent;", "getTitleComponent", "()Lru/yandex/taxi/design/ListTitleComponent;", "titleComponent", "getStoriesContainer", "()Landroid/view/ViewGroup;", "storiesContainer", "Lru/yandex/taxi/design/LoadingStoriesComponent;", "getStoriesLoading", "()Lru/yandex/taxi/design/LoadingStoriesComponent;", "storiesLoading", "Lru/yandex/taxi/design/ListItemComponent;", "getPaymentMethodComponent", "()Lru/yandex/taxi/design/ListItemComponent;", "paymentMethodComponent", "getEmailComponent", "emailComponent", "getInvitationComponent", "invitationComponent", "getOpenCorpAccountWebViewComponent", "openCorpAccountWebViewComponent", "getOpenCorpAccountScreenComponent", "openCorpAccountScreenComponent", "getSettingsComponent", "settingsComponent", "Lru/yandex/taxi/design/ButtonComponent;", "getOrderDeliveryComponent", "()Lru/yandex/taxi/design/ButtonComponent;", "orderDeliveryComponent", "getDoneButtonComponent", "doneButtonComponent", "getButtonContainer", "buttonContainer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BusinessAccountCreationView extends SlideableBindingModalView<qx6> implements hw6 {
    public static final int $stable = 8;
    private final View.OnLayoutChangeListener addButtonContainerLayoutListener;
    private final e32 analyticsContext;
    private final ffe contentContainer;
    private final bue corpAccountFlowDataInteractorFactory;
    private final g1a0 paymentImageLoader;
    private final a presenter;
    private pnu0 storiesUiHolder;
    private final qnu0 storiesUiHolderFactory;
    private final zm41 webViewContainerDependencies;

    public BusinessAccountCreationView(Context context, gw6 gw6Var, ffe ffeVar, qnu0 qnu0Var, zm41 zm41Var, bue bueVar) {
        super(context);
        this.contentContainer = ffeVar;
        this.storiesUiHolderFactory = qnu0Var;
        this.webViewContainerDependencies = zm41Var;
        this.corpAccountFlowDataInteractorFactory = bueVar;
        wwf wwfVar = (wwf) gw6Var;
        iw6 iw6Var = (iw6) wwfVar.a;
        c0g c0gVar = (c0g) ((i6r) wwfVar.b);
        v W2 = c0gVar.W2();
        zor0 zor0Var = (zor0) c0gVar.y9.get();
        q5z.h(zor0Var);
        c0g c0gVar2 = c0gVar.A;
        d0g d0gVar = c0gVar2.a;
        b bVar = new b(d0gVar.a.d1());
        zzf zzfVar = d0gVar.b.z;
        c cVar = new c(bVar, new bue(new due((rqo) zzfVar.C.get()), (ru.yandex.taxi.settings.email.a) zzfVar.ck.get(), (g) zzfVar.W0.get(), (h) zzfVar.a0.get()));
        ru.yandex.taxi.stories.domain.b bVar2 = ((tlu0) c0gVar2.a.a.dm.get()).o;
        q5z.i(bVar2);
        ww6 ww6Var = new ww6(bVar2);
        y50 y50Var = (y50) c0gVar.n0.get();
        q5z.h(y50Var);
        zzf zzfVar2 = c0gVar.z;
        ycq0 ycq0Var = (ycq0) zzfVar2.Xi.get();
        n20 n20Var = (n20) zzfVar2.o4.get();
        q5z.h(n20Var);
        vnr0 vnr0Var = (vnr0) zzfVar2.bk.get();
        q5z.h(vnr0Var);
        hwf hwfVar = (hwf) wwfVar.c;
        q5z.h((o3h) zzfVar2.K.get());
        fw6 fw6Var = new fw6();
        oep0 a6 = c0gVar.a6();
        q5z.h(a6);
        this.presenter = new a(iw6Var, W2, zor0Var, cVar, ww6Var, y50Var, ycq0Var, n20Var, vnr0Var, hwfVar, fw6Var, a6);
        c0g c0gVar3 = (c0g) ((i6r) ((wwf) gw6Var).b);
        zuj0 c = c0gVar3.c();
        q5z.h(c);
        zzf zzfVar3 = c0gVar3.z;
        uma0 h1 = zzfVar3.h1();
        pav e = c0gVar3.e();
        q5z.h(e);
        k7x0 s6 = c0gVar3.s6();
        q5z.h(s6);
        this.paymentImageLoader = new g1a0(c, h1, e, s6, zzfVar3.b1());
        this.addButtonContainerLayoutListener = new u90(10, this);
        setupStories(gw6Var);
        setupViews();
        this.analyticsContext = createAnalyticsContext("CreateGroupAccount", nsa1.d());
        setButtonAnalyticsNames();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addButtonContainerLayoutListener$lambda$0(BusinessAccountCreationView businessAccountCreationView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        xw31.x(i4 - i2, businessAccountCreationView.getScrollView());
    }

    private final List<rpu0> convertStoryToStoryPreviewInfo(List<Story> stories) {
        List<Story> list = stories;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tpu0.a((Story) it.next()));
        }
        return arrayList;
    }

    private final View getButtonContainer() {
        return getBinding().c;
    }

    private final ButtonComponent getDoneButtonComponent() {
        return getBinding().k;
    }

    private final ListItemComponent getEmailComponent() {
        return getBinding().d;
    }

    private final ListItemComponent getInvitationComponent() {
        return getBinding().e;
    }

    private final View getItemsContainer() {
        return getBinding().l;
    }

    private final ListItemComponent getOpenCorpAccountScreenComponent() {
        return getBinding().m;
    }

    private final ListItemComponent getOpenCorpAccountWebViewComponent() {
        return getBinding().b;
    }

    private final ButtonComponent getOrderDeliveryComponent() {
        return getBinding().f;
    }

    private final ListItemComponent getPaymentMethodComponent() {
        return getBinding().g;
    }

    private final View getScrollView() {
        return getBinding().h;
    }

    private final ListItemComponent getSettingsComponent() {
        return getBinding().i;
    }

    private final View getShimmerLayout() {
        return getBinding().n.b;
    }

    private final ViewGroup getStoriesContainer() {
        return getBinding().o;
    }

    private final LoadingStoriesComponent getStoriesLoading() {
        return getBinding().p;
    }

    private final ListTitleComponent getTitleComponent() {
        return getBinding().j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(BusinessAccountCreationView businessAccountCreationView) {
        return businessAccountCreationView.getBinding().a;
    }

    private final void setButtonAnalyticsNames() {
        getPaymentMethodComponent().setAnalyticsButtonName(SharedPaymentAnalytics$Button.CARD.getAnalyticsName());
        getEmailComponent().setAnalyticsButtonName(SharedPaymentAnalytics$Button.MAIL.getAnalyticsName());
        getInvitationComponent().setAnalyticsButtonName(SharedPaymentAnalytics$Button.ADD_PARTICIPANTS.getAnalyticsName());
        getSettingsComponent().setAnalyticsButtonName(SharedPaymentAnalytics$Button.SETTINGS.getAnalyticsName());
        getDoneButtonComponent().setAnalyticsButtonName(SharedPaymentAnalytics$Button.ACTION_BUTTON.getAnalyticsName());
    }

    private final void setPaymentView(vw6 state) {
        getPaymentMethodComponent().setTitle(state.a);
        getPaymentMethodComponent().setSubtitle(state.b);
        String str = state.a;
        getPaymentMethodComponent().title().setVisibility(!(str == null || evu0.J(str)) ? 0 : 8);
        t0a0 t0a0Var = state.c;
        if (t0a0Var == null) {
            getPaymentMethodComponent().setTrailImage(f1h0.ic_chevron_next_circle);
            getPaymentMethodComponent().setTrailImageStartEndPadding(0, 0, tje.u(-16, getContext()), 0);
            getPaymentMethodComponent().clearLeadView();
        } else {
            getPaymentMethodComponent().clearTrailView();
            getPaymentMethodComponent().setTrailMode(2);
            this.paymentImageLoader.b(getPaymentMethodComponent().getLeadImageView(), t0a0Var);
        }
    }

    private final void setupStories(gw6 creationComponent) {
        qnu0 qnu0Var = this.storiesUiHolderFactory;
        tlu0 tlu0Var = (tlu0) ((c0g) ((i6r) ((wwf) creationComponent).b)).z.dm.get();
        q5z.h(tlu0Var);
        int i = pph0.taxi_communications_story_preview;
        StoriesPreviewsListViewType storiesPreviewsListViewType = StoriesPreviewsListViewType.LINEAR;
        ((clh) qnu0Var).getClass();
        amp0 amp0Var = new amp0(this, tlu0Var, i, storiesPreviewsListViewType);
        this.storiesUiHolder = amp0Var;
        amp0Var.P(StoriesState.AT_TOP);
        StoriesPreviewsListView storiesPreviewsListView = (StoriesPreviewsListView) ((amp0) this.storiesUiHolder).b;
        if (storiesPreviewsListView != null) {
            storiesPreviewsListView.setUiDelegate(new m6(24, this));
        } else {
            setStories(EmptyList.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupStories$lambda$0(BusinessAccountCreationView businessAccountCreationView, List list, String str) {
        a aVar = businessAccountCreationView.presenter;
        kw6 kw6Var = new kw6(businessAccountCreationView, 0);
        aVar.getClass();
        ((pep0) aVar.I).f(new uva(2, (ru.yandex.taxi.communications.stories.domain.a) aVar.G.get(), kw6Var), new npu0((x3) new lpu0(list, str), "business_account", (Float) null, false, HProv.PP_SAME_MEDIA), hxx.a);
    }

    private final void setupViews() {
        getPaymentMethodComponent().setDebounceClickListener(new kw6(this, 1));
        getEmailComponent().setDebounceClickListener(new kw6(this, 2));
        getInvitationComponent().setDebounceClickListener(new kw6(this, 3));
        getSettingsComponent().setDebounceClickListener(new kw6(this, 4));
        getDoneButtonComponent().setDebounceClickListener(new kw6(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$0(BusinessAccountCreationView businessAccountCreationView) {
        a aVar = businessAccountCreationView.presenter;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.CARD);
        tor0 tor0Var = iw6Var.b;
        il a = iw6Var.a();
        y yVar = tor0Var.a;
        yVar.c.a().c(new sn8(new bc(a.a != null ? a.b().e.b : null, new uor0(yVar), a, SharedPaymentContext.DETAILS)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$1(BusinessAccountCreationView businessAccountCreationView) {
        a aVar = businessAccountCreationView.presenter;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.MAIL);
        tor0 tor0Var = iw6Var.b;
        il a = iw6Var.a();
        y yVar = tor0Var.a;
        qor0 a2 = yVar.c.a();
        ynr0 ynr0Var = tor0Var.b;
        a2.c(new j3j0(a, new vor0(yVar, ynr0Var), ynr0Var.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$2(BusinessAccountCreationView businessAccountCreationView) {
        a aVar = businessAccountCreationView.presenter;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.ADD_PARTICIPANTS);
        tor0 tor0Var = iw6Var.b;
        y.b(tor0Var.a, iw6Var.a(), MemberListMode.DETAILS, tor0Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$3(BusinessAccountCreationView businessAccountCreationView) {
        a aVar = businessAccountCreationView.presenter;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.SETTINGS);
        tor0 tor0Var = iw6Var.b;
        il a = iw6Var.a();
        y yVar = tor0Var.a;
        qor0 a2 = yVar.c.a();
        ynr0 ynr0Var = tor0Var.b;
        a2.c(new jor0(new vor0(yVar, ynr0Var), a, ynr0Var.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$4(BusinessAccountCreationView businessAccountCreationView) {
        a aVar = businessAccountCreationView.presenter;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.ACTION_BUTTON);
        iw6Var.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateViews$lambda$0(BusinessAccountCreationView businessAccountCreationView, aue aueVar) {
        iw6 iw6Var = businessAccountCreationView.presenter.x;
        tor0 tor0Var = iw6Var.b;
        tmr0 tmr0Var = iw6Var.a;
        cve cveVar = (cve) tor0Var.a.j.get();
        cveVar.getClass();
        cveVar.b(SharedPaymentsOpenReason.BUSINESS_ACCOUNT, new d82(1), aueVar, tmr0Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateViews$lambda$1(BusinessAccountCreationView businessAccountCreationView, ax6 ax6Var) {
        a aVar = businessAccountCreationView.presenter;
        String str = ax6Var.o;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        vnr0Var.l(iw6Var.a().b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.BIG_COMPANY);
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = str;
        aVar2.e = true;
        aVar2.i = true;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        ((hw6) aVar.Dg()).showWebView(uiWebViewConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateViews$lambda$2(BusinessAccountCreationView businessAccountCreationView, ax6 ax6Var) {
        a aVar = businessAccountCreationView.presenter;
        String str = ax6Var.r;
        vnr0 vnr0Var = aVar.F;
        iw6 iw6Var = aVar.x;
        il a = iw6Var.a();
        tor0 tor0Var = iw6Var.b;
        vnr0Var.l(a.b, iw6Var.c, aVar.Mg(), SharedPaymentAnalytics$Button.ACTION_BUTTON);
        String str2 = iw6Var.a().b().e.b;
        if (str2 == null || evu0.J(str2)) {
            il a2 = iw6Var.a();
            y yVar = tor0Var.a;
            yVar.c.a().c(new sn8(new bc(a2.a != null ? a2.b().e.b : null, new uor0(yVar), a2, SharedPaymentContext.DETAILS)));
            return;
        }
        Account b = iw6Var.a().b();
        SharedPayment sharedPayment = b.e;
        String str3 = b.a;
        if (!evu0.J(sharedPayment.b) && !aVar.y.k(str3)) {
            ycq0 ycq0Var = aVar.D;
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
            kv90Var.getClass();
            ycq0Var.a(kv90.b(str3, paymentMethod$Type));
        }
        ((a60) aVar.C).c(str, v770.o);
        tor0Var.a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public qx6 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        int i = 0;
        View inflate = inflater.inflate(luh0.business_payments_creation_view, parent, false);
        int i2 = e6h0.account_creation_big_company;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
        if (listItemComponent != null) {
            i2 = e6h0.account_creation_button_container;
            BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i2, inflate);
            if (bottomEdgeButtonLayout != null) {
                i2 = e6h0.account_creation_email;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent2 != null) {
                    i2 = e6h0.account_creation_invitation;
                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i2, inflate);
                    if (listItemComponent3 != null) {
                        i2 = e6h0.account_creation_order_delivery;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
                        if (buttonComponent != null) {
                            i2 = e6h0.account_creation_payment_method;
                            ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i2, inflate);
                            if (listItemComponent4 != null) {
                                FrameLayout frameLayout = (FrameLayout) inflate;
                                i2 = e6h0.account_creation_scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i2, inflate);
                                if (nestedScrollView != null) {
                                    i2 = e6h0.account_creation_settings;
                                    ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i2, inflate);
                                    if (listItemComponent5 != null) {
                                        i2 = e6h0.account_creation_title;
                                        ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i2, inflate);
                                        if (listTitleComponent != null) {
                                            i2 = e6h0.creation_card_root;
                                            if (((LinearLayout) cma1.O(i2, inflate)) != null) {
                                                i2 = e6h0.done_component;
                                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i2, inflate);
                                                if (buttonComponent2 != null) {
                                                    i2 = e6h0.items_container;
                                                    LinearLayout linearLayout = (LinearLayout) cma1.O(i2, inflate);
                                                    if (linearLayout != null) {
                                                        i2 = e6h0.open_corp_account;
                                                        ListItemComponent listItemComponent6 = (ListItemComponent) cma1.O(i2, inflate);
                                                        if (listItemComponent6 != null && (O = cma1.O((i2 = e6h0.shimmer_layout), inflate)) != null) {
                                                            px6 px6Var = new px6((LinearLayout) O, i);
                                                            int i3 = e6h0.stories_container;
                                                            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i3, inflate);
                                                            if (frameLayout2 != null) {
                                                                i3 = e6h0.stories_loading;
                                                                LoadingStoriesComponent loadingStoriesComponent = (LoadingStoriesComponent) cma1.O(i3, inflate);
                                                                if (loadingStoriesComponent != null) {
                                                                    return new qx6(frameLayout, listItemComponent, bottomEdgeButtonLayout, listItemComponent2, listItemComponent3, buttonComponent, listItemComponent4, nestedScrollView, listItemComponent5, listTitleComponent, buttonComponent2, linearLayout, listItemComponent6, px6Var, frameLayout2, loadingStoriesComponent);
                                                                }
                                                            }
                                                            i2 = i3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.f32
    public e32 getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return this.presenter.F.t;
    }

    @Override // defpackage.hw6
    public void hideLoader() {
        getShimmerLayout().setVisibility(8);
        getItemsContainer().setVisibility(0);
        getButtonContainer().setVisibility(0);
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new rk6(5, this), false);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i;
        Object obj;
        Object obj2;
        ?? r7;
        super.onAttachedToWindow();
        a aVar = this.presenter;
        rmr0 rmr0Var = aVar.J;
        c cVar = aVar.A;
        vnr0 vnr0Var = aVar.F;
        aVar.Bg(this);
        iw6 iw6Var = aVar.x;
        boolean z = iw6Var.e != null;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = iw6Var.c;
        c800 c800Var = iw6Var.d;
        m470 m470Var = m470.c;
        if (z) {
            i = 3;
            if (iw6Var.a().a != null) {
                tje.N(aVar.Jg(), null, null, new BusinessAccountCreationPresenter$attachView$1(aVar, null), 3);
                obj = ClidProvider.STATE;
                obj2 = null;
            } else {
                hw6 hw6Var = (hw6) aVar.Dg();
                cVar.getClass();
                obj = ClidProvider.STATE;
                obj2 = null;
                hw6Var.updateViews(new ax6(c800Var, rmr0Var.b, "", "", "", false, null, m470Var, "", "", null, false, vw6.d));
                ((hw6) aVar.Dg()).showLoader();
                tje.N(aVar.Jg(), null, null, new BusinessAccountCreationPresenter$loadAccountDetails$1(aVar, null), 3);
            }
            vnr0Var.t.put("group_id", iw6Var.a().b);
            String str = iw6Var.a().b;
            ListBuilder h = vnr0.h(aVar.Mg());
            t61 t61Var = vnr0Var.e;
            ArrayList arrayList = new ArrayList(tcc.n(h, 10));
            ListIterator listIterator = h.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                } else {
                    arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
                }
            }
            String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
            String k = vnr0Var.k(str);
            t61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button_list", arrayList);
            if (str != null) {
                hashMap.put("group_id", str);
            }
            if (analyticsName != null) {
                hashMap.put("open_reason", analyticsName);
            }
            if (k != null) {
                hashMap.put(obj, k);
            }
            t61Var.a.a("GroupAccount.Shown", hashMap, 1, new HashMap());
            r7 = obj2;
        } else {
            hw6 hw6Var2 = (hw6) aVar.Dg();
            cVar.getClass();
            hw6Var2.updateViews(new ax6(c800Var, rmr0Var.b, "", "", "", false, null, m470Var, "", "", null, false, vw6.d));
            ((hw6) aVar.Dg()).showLoader();
            tje.N(aVar.Jg(), null, null, new BusinessAccountCreationPresenter$createAccount$1(aVar, null), 3);
            tmr0 tmr0Var = iw6Var.a;
            r5f r5fVar = vnr0Var.d;
            String str2 = vnr0Var.x;
            if (str2.length() <= 0) {
                str2 = null;
            }
            String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
            String str3 = tmr0Var.a;
            r5fVar.getClass();
            HashMap hashMap2 = new HashMap();
            if (str2 != null) {
                hashMap2.put("title_utm", str2);
            }
            if (analyticsName2 != null) {
                hashMap2.put("open_reason", analyticsName2);
            }
            if (str3 != null) {
                hashMap2.put(ClidProvider.STATE, str3);
            }
            r5fVar.a.a("CreateGroupAccount.Shown", hashMap2, 1, new HashMap());
            r7 = 0;
            i = 3;
        }
        ww6 ww6Var = aVar.B;
        tje.N(aVar.Jg(), r7, r7, new BusinessAccountCreationPresenter$attachView$$inlined$safeCollectIn$1(new n(ww6Var.a.e.b("business_account"), new BusinessAccountStoriesRepository$loadStories$1(ww6Var, "business_account", r7)), r7, this), i);
        getButtonContainer().addOnLayoutChangeListener(this.addButtonContainerLayoutListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        a aVar = this.presenter;
        iw6 iw6Var = aVar.x;
        boolean z = iw6Var.e != null;
        tmr0 tmr0Var = iw6Var.a;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = iw6Var.c;
        vnr0 vnr0Var = aVar.F;
        if (z) {
            vnr0Var.l(iw6Var.a().b, sharedPaymentsOpenReason, aVar.Mg(), SharedPaymentAnalytics$Button.BACK);
        } else {
            vnr0Var.f(tmr0Var, sharedPaymentsOpenReason, SharedPaymentAnalytics$Button.BACK);
            vnr0Var.g(tmr0Var, sharedPaymentsOpenReason, SharedPaymentAnalytics$CloseReason.BACK);
        }
        iw6Var.b.a();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getButtonContainer().removeOnLayoutChangeListener(this.addButtonContainerLayoutListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        this.presenter.Lg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.Lg();
    }

    @Override // defpackage.hw6
    public void setStories(List<Story> stories) {
        if (stories.isEmpty()) {
            getStoriesContainer().setVisibility(8);
            return;
        }
        getStoriesContainer().setVisibility(0);
        List<rpu0> convertStoryToStoryPreviewInfo = convertStoryToStoryPreviewInfo(stories);
        pnu0 pnu0Var = this.storiesUiHolder;
        if (pnu0Var != null) {
            amp0 amp0Var = (amp0) pnu0Var;
            ((StoriesPreviewsListView) amp0Var.b).setStories(convertStoryToStoryPreviewInfo);
            if (convertStoryToStoryPreviewInfo.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) amp0Var.a;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                amp0Var.P((StoriesState) amp0Var.c);
            }
        }
        cma1.L(getStoriesLoading());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }

    @Override // defpackage.hw6
    public void showLoader() {
        getItemsContainer().setVisibility(8);
        getButtonContainer().setVisibility(8);
        getShimmerLayout().setVisibility(0);
    }

    @Override // defpackage.hw6
    public void showWebView(UiWebViewConfig config) {
        uf41 uf41Var = null;
        fg41 fg41Var = null;
        WebContainerModalView webContainerModalView = new WebContainerModalView(config, id00.e(this.webViewContainerDependencies, config, bi41.D4, dp41.a, to41.a, ms41.a).c(), uf41Var, fg41Var, 8, null);
        webContainerModalView.show(this.contentContainer.a, 0.0f);
        this.contentContainer.a(webContainerModalView, ContentContainer$ZOrder.MOST_IMPORTANT);
    }

    @Override // defpackage.hw6
    public void updateViews(final ax6 state) {
        getTitleComponent().setTitle(state.b);
        ListTitleComponent titleComponent = getTitleComponent();
        String str = state.c;
        titleComponent.setSubtitle(str);
        c800 c800Var = state.a;
        getDoneButtonComponent().setText(c800Var.b);
        getSettingsComponent().setTitle(c800Var.a);
        final int i = 1;
        getTitleComponent().subtitle().setVisibility(!(str == null || evu0.J(str)) ? 0 : 8);
        setPaymentView(state.h);
        getEmailComponent().setTitle(state.d);
        getEmailComponent().setSubtitle(state.e);
        aue a = bue.a(this.corpAccountFlowDataInteractorFactory);
        if (state.i && a.c()) {
            getOpenCorpAccountScreenComponent().setVisibility(0);
            getOpenCorpAccountScreenComponent().setTitle(state.j);
            getOpenCorpAccountScreenComponent().setSubtitle(state.k);
            getOpenCorpAccountScreenComponent().setDebounceClickListener(new mh3(21, this, a));
            getOpenCorpAccountWebViewComponent().setVisibility(8);
        } else if (state.l) {
            getOpenCorpAccountWebViewComponent().setVisibility(0);
            getOpenCorpAccountWebViewComponent().setTitle(state.m);
            getOpenCorpAccountWebViewComponent().setSubtitle(state.n);
            getOpenCorpAccountWebViewComponent().setDebounceClickListener(new Runnable(this) { // from class: jw6
                public final /* synthetic */ BusinessAccountCreationView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = r3;
                    ax6 ax6Var = state;
                    BusinessAccountCreationView businessAccountCreationView = this.b;
                    switch (i2) {
                        case 0:
                            BusinessAccountCreationView.updateViews$lambda$1(businessAccountCreationView, ax6Var);
                            break;
                        default:
                            BusinessAccountCreationView.updateViews$lambda$2(businessAccountCreationView, ax6Var);
                            break;
                    }
                }
            });
        } else {
            getOpenCorpAccountWebViewComponent().setVisibility(8);
        }
        getInvitationComponent().setTitle(state.f);
        getInvitationComponent().setSubtitle(state.g);
        getOrderDeliveryComponent().setText(state.q);
        getOrderDeliveryComponent().setDebounceClickListener(new Runnable(this) { // from class: jw6
            public final /* synthetic */ BusinessAccountCreationView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ax6 ax6Var = state;
                BusinessAccountCreationView businessAccountCreationView = this.b;
                switch (i2) {
                    case 0:
                        BusinessAccountCreationView.updateViews$lambda$1(businessAccountCreationView, ax6Var);
                        break;
                    default:
                        BusinessAccountCreationView.updateViews$lambda$2(businessAccountCreationView, ax6Var);
                        break;
                }
            }
        });
        getOrderDeliveryComponent().setVisibility(state.p ? 0 : 8);
        getDoneButtonComponent().setVisibility(state.p ? 8 : 0);
    }
}
