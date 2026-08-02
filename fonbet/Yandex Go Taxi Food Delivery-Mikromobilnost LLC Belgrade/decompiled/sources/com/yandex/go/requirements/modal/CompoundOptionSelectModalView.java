package com.yandex.go.requirements.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import defpackage.aub;
import defpackage.cma1;
import defpackage.efh;
import defpackage.jfh0;
import defpackage.jl40;
import defpackage.jrh0;
import defpackage.kp50;
import defpackage.l7a;
import defpackage.nac;
import defpackage.ny61;
import defpackage.og20;
import defpackage.pav;
import defpackage.sud;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tud;
import defpackage.uud;
import defpackage.vud;
import defpackage.wnb1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.utils.h;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b.\u0010&J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020*H\u0014¢\u0006\u0004\b0\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010:¨\u0006;"}, d2 = {"Lcom/yandex/go/requirements/modal/CompoundOptionSelectModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lsud;", "info", "Lkotlin/Function1;", "Lefh;", "Lzy11;", "onOptionChecked", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$ModalCloseReason;", "onClose", "<init>", "(Landroid/content/Context;Lpav;Lsud;Ltls;Ltls;)V", "", "Ltud;", "oldItems", "newItems", "Landroidx/recyclerview/widget/i;", "calculateDiff", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/i;", "ignore", "Lru/yandex/taxi/design/ListItemCheckComponent;", "createView", "(Ltud;)Lru/yandex/taxi/design/ListItemCheckComponent;", "view", "item", "bindItem", "(Lru/yandex/taxi/design/ListItemCheckComponent;Ltud;)V", "removeView", "(Lru/yandex/taxi/design/ListItemCheckComponent;)V", "action", "updateSelectedOption", "(Lefh;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onDismissListener", "setOnDismissListener", "(Ljava/lang/Runnable;)V", "getFocusedForAccessibilityViewOnAppear", "onAnimationEnd", "dismissInternal", "Lpav;", "Lsud;", "Ltls;", "Lvud;", "binding", "Lvud;", "Lru/yandex/taxi/utils/h;", "listDelegate", "Lru/yandex/taxi/utils/h;", "Ljava/lang/Runnable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompoundOptionSelectModalView extends ModalView {
    public static final int $stable = 8;
    private final vud binding;
    private final pav imageLoader;
    private final sud info;
    private final h listDelegate;
    private final tls onClose;
    private Runnable onDismissListener;
    private final tls onOptionChecked;

    public CompoundOptionSelectModalView(Context context, pav pavVar, sud sudVar, tls tlsVar, tls tlsVar2) {
        super(context);
        this.imageLoader = pavVar;
        this.info = sudVar;
        this.onOptionChecked = tlsVar;
        this.onClose = tlsVar2;
        View inflate = LayoutInflater.from(context).inflate(jrh0.compound_option_select_modal_view, (ViewGroup) this, false);
        addView(inflate);
        int i = jfh0.compound_option_select_cancel_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = jfh0.compound_option_select_description;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = jfh0.compound_option_select_items;
                AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, inflate);
                if (autoDividerComponentList != null) {
                    i = jfh0.compound_option_select_scroll;
                    if (((NestedScrollViewAdvanced) cma1.O(i, inflate)) != null) {
                        i = jfh0.compound_option_select_title;
                        ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                        if (listTitleComponent != null) {
                            i = jfh0.requirements_shadow_indicator;
                            if (((ShadowScrollIndicator) cma1.O(i, inflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                this.binding = new vud(constraintLayout, buttonComponent, listTextComponent, autoDividerComponentList, listTitleComponent);
                                this.listDelegate = new h(autoDividerComponentList, new CompoundOptionSelectModalView$listDelegate$1(2, this, CompoundOptionSelectModalView.class, "calculateDiff", "calculateDiff(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", 0), new CompoundOptionSelectModalView$listDelegate$2(1, this, CompoundOptionSelectModalView.class, "createView", "createView(Lcom/yandex/go/requirements/ui/selector/compound/CompoundOptionSelectItem;)Lru/yandex/taxi/design/ListItemCheckComponent;", 0), new CompoundOptionSelectModalView$listDelegate$3(2, this, CompoundOptionSelectModalView.class, "bindItem", "bindItem(Lru/yandex/taxi/design/ListItemCheckComponent;Lcom/yandex/go/requirements/ui/selector/compound/CompoundOptionSelectItem;)V", 0), new CompoundOptionSelectModalView$listDelegate$4(1, this, CompoundOptionSelectModalView.class, "removeView", "removeView(Lru/yandex/taxi/design/ListItemCheckComponent;)V", 0));
                                String str = sudVar.a;
                                String str2 = sudVar.b;
                                listTitleComponent.setTitle(str);
                                listTitleComponent.setFocusable(true);
                                listTextComponent.setText(str2);
                                listTextComponent.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                                buttonComponent.setText(sudVar.d);
                                buttonComponent.setDebounceClickListener(new uud(this, 2));
                                wnb1.d(tje.u(24, getContext()), constraintLayout);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CompoundOptionSelectModalView compoundOptionSelectModalView) {
        compoundOptionSelectModalView.onClose.invoke(SummaryAnalytics$ModalCloseReason.CloseButton);
        compoundOptionSelectModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindItem(ListItemCheckComponent view, tud item) {
        String str = item.d;
        String str2 = item.b;
        view.setTitle(str);
        view.setSubtitle(item.e);
        view.setChecked(item.f);
        boolean z = item.g;
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.4f);
        view.setDebounceClickListener(new l7a(19, this, item));
        ClickableImageView leadImageView = view.getLeadImageView();
        this.imageLoader.c(leadImageView);
        if (str2 != null) {
            ((nac) this.imageLoader.a(leadImageView)).c(str2);
        }
        leadImageView.setVisibility(str2 != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindItem$lambda$0(CompoundOptionSelectModalView compoundOptionSelectModalView, tud tudVar) {
        compoundOptionSelectModalView.updateSelectedOption(new efh(tudVar.a, !tudVar.f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i calculateDiff(List<tud> oldItems, List<tud> newItems) {
        return kp50.f(new og20(oldItems, newItems, new aub(4)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean calculateDiff$lambda$0(tud tudVar, tud tudVar2) {
        return Boolean.valueOf(jl40.l(tudVar.a, tudVar2.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemCheckComponent createView(tud ignore) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        listItemCheckComponent.setMode(ListItemCheckComponent.Mode.SINGLE);
        return listItemCheckComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissInternal$lambda$0(Runnable runnable, CompoundOptionSelectModalView compoundOptionSelectModalView) {
        runnable.run();
        Runnable runnable2 = compoundOptionSelectModalView.onDismissListener;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CompoundOptionSelectModalView compoundOptionSelectModalView) {
        compoundOptionSelectModalView.onClose.invoke(SummaryAnalytics$ModalCloseReason.TapOutside);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(CompoundOptionSelectModalView compoundOptionSelectModalView) {
        compoundOptionSelectModalView.onClose.invoke(SummaryAnalytics$ModalCloseReason.SystemBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeView(ListItemCheckComponent view) {
        this.imageLoader.c(view.getLeadImageView());
    }

    private final void updateSelectedOption(efh action) {
        h hVar = this.listDelegate;
        List<tud> list = hVar.h;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (tud tudVar : list) {
            arrayList.add(jl40.l(tudVar.a, action.a) ? tud.a(tudVar, action.b) : tud.a(tudVar, false));
        }
        hVar.c(arrayList);
        this.onOptionChecked.invoke(action);
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.binding.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(new l7a(20, onAnimationEnd, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.binding.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.listDelegate.c(this.info.c);
        setOnTouchOutsideListener(new uud(this, 0));
        setOnBackPressedListener(new uud(this, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.listDelegate.c(EmptyList.a);
    }

    public final void setOnDismissListener(Runnable onDismissListener) {
        this.onDismissListener = onDismissListener;
    }
}
