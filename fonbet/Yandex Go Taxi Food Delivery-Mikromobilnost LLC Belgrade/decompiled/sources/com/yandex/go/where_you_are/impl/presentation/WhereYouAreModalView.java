package com.yandex.go.where_you_are.impl.presentation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.biv0;
import defpackage.bov0;
import defpackage.bz41;
import defpackage.c230;
import defpackage.c2n0;
import defpackage.c9l0;
import defpackage.cma1;
import defpackage.cz41;
import defpackage.d6l0;
import defpackage.d9h0;
import defpackage.da0;
import defpackage.dz41;
import defpackage.e230;
import defpackage.e6g;
import defpackage.ec31;
import defpackage.ez41;
import defpackage.f0l0;
import defpackage.fpv0;
import defpackage.gz41;
import defpackage.hh31;
import defpackage.hxx;
import defpackage.hz41;
import defpackage.jpv0;
import defpackage.jy31;
import defpackage.kip;
import defpackage.kjt0;
import defpackage.kr0;
import defpackage.kz41;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mzb;
import defpackage.nlh0;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.pv0;
import defpackage.qq31;
import defpackage.sy41;
import defpackage.tje;
import defpackage.uet0;
import defpackage.xit0;
import defpackage.xvw;
import defpackage.xw31;
import defpackage.xy41;
import defpackage.yy41;
import defpackage.zlm;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020(H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0014¢\u0006\u0004\b.\u0010\u0017J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0018\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010A\u001a\u00020(8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010*¨\u0006B"}, d2 = {"Lcom/yandex/go/where_you_are/impl/presentation/WhereYouAreModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lgz41;", "Landroid/app/Activity;", "activity", "Lyy41;", "analytics", "La3v;", "focusCoordinator", "Ldz41;", "whereYouAreListener", "Lhz41;", "originScreenHolder", "Lkr0;", "addressClarificationInteractor", "Lcz41;", "chooseOtherAddressInteractor", "Lmzb;", "clarifySourceAddressBeforeOrderInteractor", "<init>", "(Landroid/app/Activity;Lyy41;La3v;Ldz41;Lhz41;Lkr0;Lcz41;Lmzb;)V", "Lzy11;", "openSourcePicker", "()V", "closed", "Lkz41;", ClidProvider.STATE, "render", "(Lkz41;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lgz41;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "Le230;", "insetsType", "()Le230;", "Lyy41;", "La3v;", "Ldz41;", "Lhz41;", "Lkr0;", "Lcz41;", "Lmzb;", "Lxy41;", "addressesAdapter", "Lxy41;", "backPressed", "Z", "needOpenAddressSuggest", "needCallbackOnDisappear", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WhereYouAreModalView extends SlideableBindingModalView<gz41> {
    private final kr0 addressClarificationInteractor;
    private final xy41 addressesAdapter;
    private final yy41 analytics;
    private boolean backPressed;
    private final cz41 chooseOtherAddressInteractor;
    private final mzb clarifySourceAddressBeforeOrderInteractor;
    private boolean closed;
    private final a3v focusCoordinator;
    private boolean needCallbackOnDisappear;
    private boolean needOpenAddressSuggest;
    private final hz41 originScreenHolder;
    private final dz41 whereYouAreListener;

    public WhereYouAreModalView(Activity activity, yy41 yy41Var, a3v a3vVar, dz41 dz41Var, hz41 hz41Var, kr0 kr0Var, cz41 cz41Var, mzb mzbVar) {
        super(activity);
        this.analytics = yy41Var;
        this.focusCoordinator = a3vVar;
        this.whereYouAreListener = dz41Var;
        this.originScreenHolder = hz41Var;
        this.addressClarificationInteractor = kr0Var;
        this.chooseOtherAddressInteractor = cz41Var;
        this.clarifySourceAddressBeforeOrderInteractor = mzbVar;
        xy41 xy41Var = new xy41();
        this.addressesAdapter = xy41Var;
        final int i = 1;
        this.needCallbackOnDisappear = true;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        final int i2 = 0;
        setDismissOnTouchOutside(false);
        setArrowState(ArrowsView.State.GONE);
        xy41Var.b = new ez41(this, i);
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(xy41Var);
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: fz41
            public final /* synthetic */ WhereYouAreModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                WhereYouAreModalView whereYouAreModalView = this.b;
                switch (i3) {
                    case 0:
                        WhereYouAreModalView._init_$lambda$2(whereYouAreModalView);
                        break;
                    default:
                        whereYouAreModalView.backPressed = true;
                        break;
                }
            }
        });
        setOnBackPressedListener(new Runnable(this) { // from class: fz41
            public final /* synthetic */ WhereYouAreModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                WhereYouAreModalView whereYouAreModalView = this.b;
                switch (i3) {
                    case 0:
                        WhereYouAreModalView._init_$lambda$2(whereYouAreModalView);
                        break;
                    default:
                        whereYouAreModalView.backPressed = true;
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(WhereYouAreModalView whereYouAreModalView, zzs zzsVar) {
        ((com.yandex.go.clarify_address.before_order.a) whereYouAreModalView.clarifySourceAddressBeforeOrderInteractor).b.d = true;
        whereYouAreModalView.analytics.a("WhereAreYou.Tapped", "select_suggested_address");
        ((e6g) whereYouAreModalView.whereYouAreListener).b(zzsVar);
        whereYouAreModalView.dismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(WhereYouAreModalView whereYouAreModalView) {
        whereYouAreModalView.analytics.a("WhereAreYou.Tapped", "select_other_address");
        whereYouAreModalView.openSourcePicker();
    }

    private final void closed() {
        Polyline a;
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.focusCoordinator.a0(WhereYouAreModalView.class);
        dz41 dz41Var = this.whereYouAreListener;
        Screen screen = this.originScreenHolder.a;
        if (screen == null) {
            screen = Screen.TAXI_MAIN;
        }
        boolean z = this.backPressed;
        boolean z2 = !z;
        e6g e6gVar = (e6g) dz41Var;
        xvw xvwVar = (xvw) e6gVar.m;
        kjt0 kjt0Var = (kjt0) e6gVar.k;
        xit0 xit0Var = (xit0) e6gVar.s;
        ((com.yandex.go.navigation.screen.c) e6gVar.a).i(screen);
        if (screen == Screen.SUMMARY) {
            ((j) e6gVar.b).a();
            if (((com.yandex.go.route.interactor.c) e6gVar.c).d() == null) {
                e6gVar.a(z2);
            }
            xit0Var.b(bov0.e);
            ru.yandex.taxi.preorder.source.data.c cVar = (ru.yandex.taxi.preorder.source.data.c) e6gVar.g;
            zlm zlmVar = cVar.e;
            if (zlmVar != null && ((((a = zlmVar.a()) != null && !a.getPoints().isEmpty()) || zlmVar.a.b() != null) && z)) {
                d6l0 d6l0Var = (d6l0) e6gVar.h;
                zlm zlmVar2 = cVar.e;
                if (zlmVar2 == null) {
                    zlm zlmVar3 = new zlm(cVar.d.c(), EmptyList.a, false);
                    cVar.e = zlmVar3;
                    zlmVar2 = zlmVar3;
                }
                ((ru.yandex.taxi.preorder.source.routeoverlay.a) d6l0Var).Rg(zlmVar2, false);
            }
        } else if (screen == Screen.TAXI_MAIN && !z && ((Boolean) ((kip) e6gVar.e).a.b()).booleanValue()) {
            e6gVar.a(true);
            kjt0Var.b(false);
            xvwVar.a();
            xit0Var.b(bov0.e);
        } else if (!((c9l0) e6gVar.i).b()) {
            jpv0 b = ((biv0) e6gVar.j).b();
            b.getClass();
            if (b instanceof fpv0) {
                e6gVar.a(z2);
                kjt0Var.b(false);
                xvwVar.a();
                xit0Var.a();
                ((uet0) e6gVar.r).a();
            }
        }
        com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) ((f0l0) e6gVar.w);
        aVar.k.f();
        aVar.a.b8("SourcePointFocusOwner");
    }

    private final void openSourcePicker() {
        Screen screen = this.originScreenHolder.a;
        if (screen == null) {
            screen = Screen.TAXI_MAIN;
        }
        cz41 cz41Var = this.chooseOtherAddressInteractor;
        hh31 hh31Var = new hh31(14, this, screen);
        ec31 ec31Var = new ec31(23, this);
        int i = 0;
        ez41 ez41Var = new ez41(this, i);
        ((pep0) cz41Var.d).f(new c2n0(9, (da0) cz41Var.c.get(), new bz41(i, ec31Var, cz41Var, hh31Var), new qq31(16, ez41Var)), new sy41(screen), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openSourcePicker$lambda$0(WhereYouAreModalView whereYouAreModalView, Screen screen) {
        ru.yandex.taxi.preorder.source.data.c cVar;
        zlm zlmVar;
        Polyline a;
        ((com.yandex.go.clarify_address.before_order.a) whereYouAreModalView.clarifySourceAddressBeforeOrderInteractor).b.d = true;
        e6g e6gVar = (e6g) whereYouAreModalView.whereYouAreListener;
        ((kjt0) e6gVar.k).a(new jy31(7, e6gVar), false, false);
        if (screen == Screen.SUMMARY && (zlmVar = (cVar = (ru.yandex.taxi.preorder.source.data.c) e6gVar.g).e) != null && (((a = zlmVar.a()) != null && !a.getPoints().isEmpty()) || zlmVar.a.b() != null)) {
            d6l0 d6l0Var = (d6l0) e6gVar.h;
            zlm zlmVar2 = cVar.e;
            if (zlmVar2 == null) {
                zlm zlmVar3 = new zlm(cVar.d.c(), EmptyList.a, false);
                cVar.e = zlmVar3;
                zlmVar2 = zlmVar3;
            }
            ((ru.yandex.taxi.preorder.source.routeoverlay.a) d6l0Var).Rg(zlmVar2, false);
        }
        whereYouAreModalView.needCallbackOnDisappear = false;
        whereYouAreModalView.dismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openSourcePicker$lambda$1(WhereYouAreModalView whereYouAreModalView) {
        ((com.yandex.go.clarify_address.before_order.a) whereYouAreModalView.clarifySourceAddressBeforeOrderInteractor).b.d = true;
        ((com.yandex.go.clarify_address.a) whereYouAreModalView.addressClarificationInteractor).c(true, AddressClarificationReason.Map);
        whereYouAreModalView.closed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openSourcePicker$lambda$2(WhereYouAreModalView whereYouAreModalView, pv0 pv0Var) {
        ((com.yandex.go.clarify_address.before_order.a) whereYouAreModalView.clarifySourceAddressBeforeOrderInteractor).b.d = true;
        ((com.yandex.go.clarify_address.a) whereYouAreModalView.addressClarificationInteractor).c(true, AddressClarificationReason.Suggest);
        ((e6g) whereYouAreModalView.whereYouAreListener).b(pv0Var.a.B());
        whereYouAreModalView.dismiss();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public gz41 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(nlh0.where_you_are_modal_view, parent, false);
        int i = d9h0.where_you_are_address_recycler_view;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = d9h0.where_you_are_another_address_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                i = d9h0.where_you_are_description;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = d9h0.where_you_are_title;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new gz41(constraintLayout, recyclerView, buttonComponent, listItemComponent, listTitleComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.closed = false;
        this.focusCoordinator.b8(WhereYouAreModalView.class);
        this.focusCoordinator.Td(getContentHeight(), WhereYouAreModalView.class);
        if (this.needOpenAddressSuggest) {
            openSourcePicker();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        if (this.needCallbackOnDisappear) {
            closed();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public final void render(kz41 state) {
        xy41 xy41Var = this.addressesAdapter;
        xy41Var.a = state.d;
        xy41Var.notifyDataSetChanged();
        getBinding().e.setTitle(state.a);
        getBinding().d.setTitle(state.c);
        getBinding().c.setText(state.b);
        this.needOpenAddressSuggest = state.f;
    }
}
