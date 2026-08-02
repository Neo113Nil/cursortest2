package com.yandex.go.payments.shared.members.list;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.ai10;
import defpackage.e32;
import defpackage.e6h0;
import defpackage.g5c;
import defpackage.il;
import defpackage.jc4;
import defpackage.l8x;
import defpackage.lq31;
import defpackage.luh0;
import defpackage.mys;
import defpackage.nsa1;
import defpackage.ny61;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.rp31;
import defpackage.rx2;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vnr0;
import defpackage.xm2;
import defpackage.xw31;
import defpackage.yh10;
import defpackage.yln;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.ToolbarModalView;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001NB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010*R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u001f0Dj\b\u0012\u0004\u0012\u00020\u001f`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/yandex/go/payments/shared/members/list/MembersListView;", "Lru/yandex/taxi/widget/ToolbarModalView;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lcom/yandex/go/payments/shared/members/list/b;", "presenter", "<init>", "(Landroid/content/Context;Ltse;Lcom/yandex/go/payments/shared/members/list/b;)V", "Lzy11;", "setupButtonAnalyticsNames", "()V", "initList", "updateShadowVisibility", "Lru/yandex/taxi/design/ListItemInputComponent;", "getCommonLimitInput", "()Lru/yandex/taxi/design/ListItemInputComponent;", "", "height", "setMargins", "(I)V", "onBackPressed", "onTouchOutside", "onAttachedToWindow", "onDetachedFromWindow", "getContentLayoutRes", "()I", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Ltse;", "Lcom/yandex/go/payments/shared/members/list/b;", "Lg5c;", "modalViewBackPressedReason", "Lg5c;", "Landroid/view/View;", "scrollView", "Landroid/view/View;", "commonLimit", "Lru/yandex/taxi/design/ListItemInputComponent;", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "commonLimitDivider", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "shadow", "noMembersView", "bottomButtonContainer", "Lru/yandex/taxi/design/ButtonComponent;", "bottomButton", "Lru/yandex/taxi/design/ButtonComponent;", "controlsBlocker", "Lru/yandex/taxi/design/ListItemComponent;", "noMembersViewTitle", "Lru/yandex/taxi/design/ListItemComponent;", "noMembersViewSubtitle", "Lyh10;", "membersListAdapter", "Lyh10;", "Le32;", "analyticsContext", "Le32;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "additionalButtonsList", "Ljava/util/ArrayList;", "Ll8x;", "textValueJob", "Ll8x;", "Landroid/view/View$OnLayoutChangeListener;", "buttonContainerLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/go/payments/shared/members/list/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MembersListView extends ToolbarModalView {
    public static final int $stable = 8;
    private final ArrayList<String> additionalButtonsList;
    private final e32 analyticsContext;
    private final ButtonComponent bottomButton;
    private final View bottomButtonContainer;
    private final View.OnLayoutChangeListener buttonContainerLayoutListener;
    private final ListItemInputComponent commonLimit;
    private final ListGroupHeaderComponent commonLimitDivider;
    private final View controlsBlocker;
    private final tse coroutineScope;
    private final RecyclerView list;
    private final yh10 membersListAdapter;
    private final g5c modalViewBackPressedReason;
    private final View noMembersView;
    private final ListItemComponent noMembersViewSubtitle;
    private final ListItemComponent noMembersViewTitle;
    private final b presenter;
    private final View scrollView;
    private final View shadow;
    private l8x textValueJob;

    /* JADX WARN: Multi-variable type inference failed */
    public MembersListView(Context context, tse tseVar, b bVar) {
        super(context, null, 2, 0 == true ? 1 : 0);
        this.coroutineScope = tseVar;
        this.presenter = bVar;
        this.modalViewBackPressedReason = new mys(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
        int i = e6h0.shared_payments_members_list_scroll_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.scrollView = (View) rp31.d(this, i);
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, e6h0.shared_payments_members_list_common_limit));
        this.commonLimit = listItemInputComponent;
        this.commonLimitDivider = (ListGroupHeaderComponent) ((View) rp31.d(this, e6h0.shared_payments_members_list_divider));
        this.list = (RecyclerView) ((View) rp31.d(this, e6h0.shared_payments_members_list_recycler_view));
        this.shadow = (View) rp31.d(this, e6h0.shared_payments_members_list_shadow);
        this.noMembersView = (View) rp31.d(this, e6h0.shared_payments_members_empty_view);
        this.bottomButtonContainer = (View) rp31.d(this, e6h0.shared_payments_members_list_bottom_button_container);
        this.bottomButton = (ButtonComponent) ((View) rp31.d(this, e6h0.shared_payments_members_list_bottom_button));
        this.controlsBlocker = (View) rp31.d(this, e6h0.shared_payment_controls_blocker);
        this.noMembersViewTitle = (ListItemComponent) ((View) rp31.d(this, e6h0.shared_payments_members_empty_view_title));
        this.noMembersViewSubtitle = (ListItemComponent) ((View) rp31.d(this, e6h0.shared_payments_members_empty_view_subtitle));
        this.membersListAdapter = new yh10();
        this.additionalButtonsList = new ArrayList<>();
        this.buttonContainerLayoutListener = new yln(3, this);
        initList();
        getToolbar().setTrailTextStyle(1);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        this.textValueJob = tje.N(tseVar, null, null, new MembersListView$special$$inlined$safeCollectIn$1(listItemInputComponent.textValueFlow(), null, this), 3);
        e32 e32Var = new e32(bVar.x.a == MemberListMode.LIMITS ? "MonthLimitsCard" : "GroupAccountParticipantsListCard", AnalyticsContext$ElementState.CARD, nsa1.d());
        this.analyticsContext = e32Var;
        setAnalyticsContext(e32Var);
        setupButtonAnalyticsNames();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttonContainerLayoutListener$lambda$0(MembersListView membersListView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        xm2 xm2Var = new xm2(membersListView, i4 - i2, 12);
        Rect rect = xw31.a;
        xm2Var.run();
        view.post(xm2Var);
    }

    private final void initList() {
        this.list.setLayoutManager(new LinearLayoutManager(getContext()));
        this.list.setAdapter(this.membersListAdapter);
    }

    private final void setupButtonAnalyticsNames() {
        getToolbar().setNavigationButtonAnalyticsName(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShadowVisibility() {
        if (this.list.getAdapter() == null || this.list.getLayoutManager() == null) {
            return;
        }
        if (this.bottomButtonContainer.getVisibility() != 0) {
            this.shadow.setVisibility(8);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.list.getLayoutManager();
        RecyclerView.Adapter adapter = this.list.getAdapter();
        if (adapter == null) {
            ny61.g("Required value was null.");
            return;
        }
        int itemCount = adapter.getItemCount() - 1;
        int L1 = linearLayoutManager.L1();
        this.shadow.setVisibility((L1 == -1 || L1 == itemCount) ? false : true ? 0 : 8);
    }

    /* renamed from: getCommonLimitInput, reason: from getter */
    public final ListItemInputComponent getCommonLimit() {
        return this.commonLimit;
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView
    public int getContentLayoutRes() {
        return luh0.shared_payments_members_list;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        b bVar = this.presenter;
        vnr0 vnr0Var = bVar.B;
        String str = bVar.Mg().a;
        LinkedHashMap linkedHashMap = vnr0Var.u;
        linkedHashMap.put(ClidProvider.STATE, vnr0Var.k(str));
        return linkedHashMap;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        SharedPaymentsOpenReason Kg;
        super.onAttachedToWindow();
        b bVar = this.presenter;
        c cVar = new c(this);
        vnr0 vnr0Var = bVar.B;
        bVar.Bg(cVar);
        ai10 ai10Var = bVar.x;
        il ilVar = ai10Var.e;
        MemberListMode memberListMode = ai10Var.a;
        Long l = ilVar.b().o;
        String valueOf = l != null ? String.valueOf(l.longValue()) : null;
        if (valueOf == null) {
            valueOf = "";
        }
        ai10Var.g = valueOf;
        bVar.Tg();
        if (memberListMode == MemberListMode.LIMITS) {
            Kg = bVar.Lg();
            int size = bVar.Mg().d.size();
            vnr0Var.getClass();
            ListBuilder a = rcc.a();
            a.add(SharedPaymentAnalytics$Button.BACK);
            a.add(SharedPaymentAnalytics$Button.DONE);
            if (size > 1) {
                a.add(SharedPaymentAnalytics$Button.USER_SELECTED);
            }
            ListBuilder j = a.j();
            jc4 jc4Var = vnr0Var.j;
            ArrayList arrayList = new ArrayList(tcc.n(j, 10));
            ListIterator listIterator = j.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                } else {
                    arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
                }
            }
            String analyticsName = Kg.getAnalyticsName();
            jc4Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button_list", arrayList);
            if (analyticsName != null) {
                hashMap.put("open_reason", analyticsName);
            }
            jc4Var.a.a("MonthLimitsCard.Shown", hashMap, 1, new HashMap());
            ai10Var.f = false;
        } else {
            Kg = bVar.Kg();
            String str = bVar.Mg().a;
            boolean z = bVar.J;
            int size2 = bVar.Mg().d.size();
            vnr0Var.getClass();
            ListBuilder j2 = vnr0.j(z, memberListMode, size2);
            rx2 rx2Var = vnr0Var.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(j2, 10));
            ListIterator listIterator2 = j2.listIterator(0);
            while (true) {
                qqy qqyVar2 = (qqy) listIterator2;
                if (!qqyVar2.hasNext()) {
                    break;
                } else {
                    arrayList2.add(((SharedPaymentAnalytics$Button) qqyVar2.next()).getAnalyticsName());
                }
            }
            String analyticContext = memberListMode.getAnalyticContext();
            String analyticsName2 = Kg.getAnalyticsName();
            String k = vnr0Var.k(str);
            rx2Var.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("button_list", arrayList2);
            if (analyticContext != null) {
                hashMap2.put("element_state", analyticContext);
            }
            if (analyticsName2 != null) {
                hashMap2.put("open_reason", analyticsName2);
            }
            if (k != null) {
                hashMap2.put(ClidProvider.STATE, k);
            }
            rx2Var.a.a("GroupAccountParticipantsListCard.Shown", hashMap2, 1, new HashMap());
        }
        vnr0Var.u.put("open_reason", Kg.getAnalyticsName());
        this.bottomButtonContainer.addOnLayoutChangeListener(this.buttonContainerLayoutListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.onBackClick();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.textValueJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.presenter.Cg();
        this.bottomButtonContainer.removeOnLayoutChangeListener(this.buttonContainerLayoutListener);
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView, ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        b bVar = this.presenter;
        ai10 ai10Var = bVar.x;
        MemberListMode memberListMode = ai10Var.a;
        MemberListMode memberListMode2 = MemberListMode.LIMITS;
        vnr0 vnr0Var = bVar.B;
        if (memberListMode == memberListMode2) {
            vnr0Var.t(bVar.Lg(), SharedPaymentAnalytics$Button.BACK, bVar.Mg().d.size());
        } else {
            vnr0Var.p(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$Button.BACK, bVar.J, ai10Var.a, bVar.Mg().d.size());
            bVar.B.o(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$CloseReason.OUT_CARD, bVar.J, ai10Var.a, bVar.Mg().d.size());
        }
        ai10Var.b.b();
    }

    public final void setMargins(int height) {
        xw31.x(height, this.list);
        xw31.x(height, this.noMembersView);
        xw31.x(height, this.shadow);
        xw31.x(height, this.scrollView);
        updateShadowVisibility();
    }
}
