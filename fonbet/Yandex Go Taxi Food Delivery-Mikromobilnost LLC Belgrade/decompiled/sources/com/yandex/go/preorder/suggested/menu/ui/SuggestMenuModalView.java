package com.yandex.go.preorder.suggested.menu.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.yandex.go.preorder.suggested.menu.presenter.b;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.a6v0;
import defpackage.a7v0;
import defpackage.b7v0;
import defpackage.c7v0;
import defpackage.cma1;
import defpackage.d7v0;
import defpackage.dzg0;
import defpackage.eob0;
import defpackage.evu0;
import defpackage.ho4;
import defpackage.hwo0;
import defpackage.i6v0;
import defpackage.ikh0;
import defpackage.ip11;
import defpackage.j6v0;
import defpackage.k6v0;
import defpackage.l6v0;
import defpackage.l7n;
import defpackage.m2y;
import defpackage.m6v0;
import defpackage.ny61;
import defpackage.o6v0;
import defpackage.o7r0;
import defpackage.p6v0;
import defpackage.qje;
import defpackage.qu;
import defpackage.r6v0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.t6v0;
import defpackage.tai0;
import defpackage.vmu0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wfz;
import defpackage.xng0;
import defpackage.y7h0;
import defpackage.zmh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringImageView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B/\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u0010*\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0014¢\u0006\u0004\b'\u0010\u0014J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101¨\u00062"}, d2 = {"Lcom/yandex/go/preorder/suggested/menu/ui/SuggestMenuModalView;", "Lr6v0;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lp6v0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lcom/yandex/go/pin/api/v2/PinV2Component;", "pinView", "Lcom/yandex/go/preorder/suggested/menu/presenter/b;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lcom/yandex/go/pin/api/v2/PinV2Component;Lcom/yandex/go/preorder/suggested/menu/presenter/b;)V", "Ll6v0;", "mapState", "Lzy11;", "renderMap", "(Ll6v0;)V", "setupMapCard", "()V", "", "La6v0;", "listOfMenuActions", "renderActionItems", "(Ljava/util/List;)V", ClidProvider.STATE, "Lru/yandex/taxi/design/ListItemComponent;", "createMenuAction", "(La6v0;)Lru/yandex/taxi/design/ListItemComponent;", "item", "setupState", "(Lru/yandex/taxi/design/ListItemComponent;La6v0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp6v0;", "onAttachedToWindow", "", "contentTop", "onModalViewAppear", "(I)V", "Ld7v0;", "uiState", "render", "(Ld7v0;)V", "Lcom/yandex/go/pin/api/v2/PinV2Component;", "Lcom/yandex/go/preorder/suggested/menu/presenter/b;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestMenuModalView extends SlideableBindingModalView<p6v0> implements r6v0 {
    private final PinV2Component pinView;
    private final com.yandex.go.preorder.suggested.menu.presenter.b presenter;

    public SuggestMenuModalView(Context context, ip11 ip11Var, PinV2Component pinV2Component, com.yandex.go.preorder.suggested.menu.presenter.b bVar) {
        super(context);
        this.pinView = pinV2Component;
        this.presenter = bVar;
        getBinding().b.setTypeface(((zmh) ip11Var).d());
    }

    private final ListItemComponent createMenuAction(a6v0 state) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listItemComponent.setTitleTextColor(qje.t(xng0.textMain, listItemComponent.getContext()));
        listItemComponent.setSubtitleTextColor(qje.t(xng0.textMinor, listItemComponent.getContext()));
        setupState(listItemComponent, state);
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$2(SuggestMenuModalView suggestMenuModalView) {
        suggestMenuModalView.presenter.Vg();
    }

    private final void renderActionItems(List<a6v0> listOfMenuActions) {
        LinearLayout linearLayout = (LinearLayout) getBinding().c.c;
        linearLayout.removeAllViews();
        Iterator<T> it = listOfMenuActions.iterator();
        while (it.hasNext()) {
            linearLayout.addView(createMenuAction((a6v0) it.next()));
        }
    }

    private final void renderMap(l6v0 mapState) {
        m2y m2yVar = getBinding().f;
        boolean z = mapState instanceof k6v0;
        this.pinView.setVisibility(z ? 0 : 8);
        CardView cardView = (CardView) m2yVar.b;
        ShimmeringImageView shimmeringImageView = (ShimmeringImageView) m2yVar.d;
        cardView.setVisibility(mapState instanceof i6v0 ? 8 : 0);
        shimmeringImageView.setLoading(mapState instanceof j6v0);
        k6v0 k6v0Var = z ? (k6v0) mapState : null;
        if (k6v0Var != null) {
            shimmeringImageView.setImageBitmap(k6v0Var.a);
        }
        shimmeringImageView.setOnClickListener(new tai0(22, mapState, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderMap$lambda$0$1(l6v0 l6v0Var, SuggestMenuModalView suggestMenuModalView, View view) {
        if (l6v0Var instanceof k6v0) {
            com.yandex.go.preorder.suggested.menu.presenter.b bVar = suggestMenuModalView.presenter;
            hwo0 hwo0Var = bVar.z;
            o7r0 o7r0Var = (o7r0) hwo0Var.w;
            SuggestMenuLegacyAnalytics$Prefix suggestMenuLegacyAnalytics$Prefix = (SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(AppSettingsContract$Setting.COLUMN_PREFIX, suggestMenuLegacyAnalytics$Prefix.getEventValue());
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            o7r0Var.a.a(sb2.q("${prefix}.MapTapped", hashMap), hashMap, 1, hashMap2);
            t6v0 t6v0Var = (t6v0) bVar.y.c.g;
            if (!(bVar.H instanceof a7v0) || t6v0Var == wfz.U) {
                return;
            }
            ((com.yandex.go.preorder.suggested.menu.router.a) bVar.x.b).r(new qu(9));
            t6v0Var.a(bVar.I);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupMapCard() {
        CardView cardView = (CardView) getBinding().f.b;
        ru.yandex.taxi.design.utils.c.D(cardView.getLayoutParams().width, cardView.getWidth() / 2, cardView);
    }

    private final void setupState(ListItemComponent listItemComponent, a6v0 a6v0Var) {
        listItemComponent.setOnClickListener(new vmu0(2, a6v0Var));
        listItemComponent.setTitle(a6v0Var.b);
        listItemComponent.setLeadImage(a6v0Var.c);
        listItemComponent.setTrailMode(2);
        if (a6v0Var.d) {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
        }
        listItemComponent.setBackground(vng.t(dzg0.bg_transparent_ripple, listItemComponent.getContext()));
        listItemComponent.setVisibility(a6v0Var.a ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupState$lambda$0(a6v0 a6v0Var, View view) {
        a6v0Var.e.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public p6v0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        int i = 0;
        View inflate = inflater.inflate(ikh0.suggest_menu_modal_view, parent, false);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
        int i2 = y7h0.container_header;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
        if (robotoTextView != null && (O = cma1.O((i2 = y7h0.content_container), inflate)) != null) {
            int i3 = y7h0.item_title;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, O);
            if (listItemComponent != null) {
                i3 = y7h0.menuActions;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i3, O);
                if (linearLayout != null) {
                    ho4 ho4Var = new ho4((LinearLayoutCompat) O, listItemComponent, linearLayout);
                    i2 = y7h0.error_container;
                    View O2 = cma1.O(i2, inflate);
                    if (O2 != null) {
                        int i4 = y7h0.button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i4, O2);
                        if (buttonComponent != null) {
                            i4 = y7h0.icon;
                            if (((AppCompatImageView) cma1.O(i4, O2)) != null) {
                                i4 = y7h0.subtitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i4, O2);
                                if (robotoTextView2 != null) {
                                    i4 = y7h0.title;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i4, O2);
                                    if (robotoTextView3 != null) {
                                        eob0 eob0Var = new eob0((ConstraintLayout) O2, buttonComponent, robotoTextView2, robotoTextView3, 1);
                                        i2 = y7h0.loading_container;
                                        View O3 = cma1.O(i2, inflate);
                                        if (O3 != null) {
                                            int i5 = y7h0.loading_item_1;
                                            View O4 = cma1.O(i5, O3);
                                            if (O4 != null) {
                                                l7n.o(O4);
                                                i5 = y7h0.loading_item_2;
                                                View O5 = cma1.O(i5, O3);
                                                if (O5 != null) {
                                                    l7n.o(O5);
                                                    i5 = y7h0.loading_item_3;
                                                    View O6 = cma1.O(i5, O3);
                                                    if (O6 != null) {
                                                        l7n.o(O6);
                                                        i5 = y7h0.title_placeholder;
                                                        if (((PlaceholderView) cma1.O(i5, O3)) != null) {
                                                            m6v0 m6v0Var = new m6v0((LinearLayoutCompat) O3, i);
                                                            i2 = y7h0.map_container;
                                                            View O7 = cma1.O(i2, inflate);
                                                            if (O7 != null) {
                                                                int i6 = y7h0.horizontal_guideline;
                                                                if (((Guideline) cma1.O(i6, O7)) != null) {
                                                                    i6 = y7h0.map_image_view;
                                                                    ShimmeringImageView shimmeringImageView = (ShimmeringImageView) cma1.O(i6, O7);
                                                                    if (shimmeringImageView != null) {
                                                                        CardView cardView = (CardView) O7;
                                                                        i6 = y7h0.pin;
                                                                        ViewStub viewStub = (ViewStub) cma1.O(i6, O7);
                                                                        if (viewStub != null) {
                                                                            return new p6v0(linearLayoutCompat, robotoTextView, ho4Var, eob0Var, m6v0Var, new m2y(cardView, shimmeringImageView, cardView, viewStub, 10));
                                                                        }
                                                                    }
                                                                }
                                                                ny61.t("Missing required view with ID: ".concat(O7.getResources().getResourceName(i6)));
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i5)));
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i4)));
                        return null;
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        getBinding();
        super.onAttachedToWindow();
        final com.yandex.go.preorder.suggested.menu.presenter.b bVar = this.presenter;
        final int i = 0;
        setOnSlideOutListener(new Runnable() { // from class: n6v0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                b bVar2 = bVar;
                switch (i2) {
                    case 0:
                        bVar2.Ug();
                        break;
                    case 1:
                        bVar2.Ug();
                        break;
                    default:
                        bVar2.Ug();
                        break;
                }
            }
        });
        final com.yandex.go.preorder.suggested.menu.presenter.b bVar2 = this.presenter;
        final int i2 = 1;
        setOnBackPressedListener(new Runnable() { // from class: n6v0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                b bVar22 = bVar2;
                switch (i22) {
                    case 0:
                        bVar22.Ug();
                        break;
                    case 1:
                        bVar22.Ug();
                        break;
                    default:
                        bVar22.Ug();
                        break;
                }
            }
        });
        final com.yandex.go.preorder.suggested.menu.presenter.b bVar3 = this.presenter;
        final int i3 = 2;
        setOnTouchOutsideListener(new Runnable() { // from class: n6v0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                b bVar22 = bVar3;
                switch (i22) {
                    case 0:
                        bVar22.Ug();
                        break;
                    case 1:
                        bVar22.Ug();
                        break;
                    default:
                        bVar22.Ug();
                        break;
                }
            }
        });
        getBinding().d.c.setDebounceClickListener(new o6v0(this, i));
        ru.yandex.taxi.design.utils.c.w((ViewStub) getBinding().f.e, this.pinView);
        this.presenter.Og(this);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        ((CardView) getBinding().f.c).post(new o6v0(this, 1));
    }

    @Override // defpackage.eyi0
    public void render(d7v0 uiState) {
        p6v0 binding = getBinding();
        ho4 ho4Var = binding.c;
        RobotoTextView robotoTextView = binding.b;
        eob0 eob0Var = binding.d;
        RobotoTextView robotoTextView2 = eob0Var.e;
        ((LinearLayoutCompat) ho4Var.b).setVisibility(uiState instanceof a7v0 ? 0 : 8);
        binding.e.b.setVisibility(uiState instanceof c7v0 ? 0 : 8);
        boolean z = uiState instanceof b7v0;
        eob0Var.b.setVisibility(z ? 0 : 8);
        ((CardView) binding.f.c).setVisibility(!z ? 0 : 8);
        robotoTextView.setText(uiState.a());
        CharSequence a = uiState.a();
        robotoTextView.setVisibility((a == null || evu0.J(a)) ? 8 : 0);
        if (uiState instanceof c7v0) {
            c7v0 c7v0Var = (c7v0) uiState;
            getBinding().a.setContentDescription(c7v0Var.c);
            getBinding().a.setImportantForAccessibility(1);
            renderMap(c7v0Var.b);
            return;
        }
        if (uiState instanceof b7v0) {
            b7v0 b7v0Var = (b7v0) uiState;
            robotoTextView2.setText(b7v0Var.b);
            eob0Var.d.setText(b7v0Var.c);
            eob0Var.c.setText(b7v0Var.d);
            robotoTextView2.sendAccessibilityEvent(8);
            getBinding().a.setImportantForAccessibility(2);
            return;
        }
        if (!(uiState instanceof a7v0)) {
            w511.b();
            return;
        }
        getBinding().a.setImportantForAccessibility(2);
        a7v0 a7v0Var = (a7v0) uiState;
        renderMap(a7v0Var.f);
        renderActionItems(a7v0Var.e);
        ListItemComponent listItemComponent = (ListItemComponent) binding.c.d;
        listItemComponent.setTitle(a7v0Var.b);
        listItemComponent.setSubtitle(a7v0Var.c);
        listItemComponent.setTrailCompanionText(a7v0Var.d);
    }
}
