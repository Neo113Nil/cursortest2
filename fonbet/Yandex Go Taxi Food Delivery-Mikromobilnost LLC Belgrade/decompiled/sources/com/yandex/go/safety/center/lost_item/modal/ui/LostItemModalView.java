package com.yandex.go.safety.center.lost_item.modal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$LostItemsAnalyticsDismissType;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType;
import defpackage.brz;
import defpackage.c230;
import defpackage.cma1;
import defpackage.crz;
import defpackage.dqk0;
import defpackage.erz;
import defpackage.fbz;
import defpackage.i7h0;
import defpackage.ip11;
import defpackage.irz;
import defpackage.ny61;
import defpackage.ppl0;
import defpackage.q3h0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.r7v;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.yqz;
import defpackage.zmh;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/safety/center/lost_item/modal/ui/LostItemModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcrz;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lyqz;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lyqz;)V", "Lerz;", "bullet", "Lru/yandex/taxi/design/ListItemComponent;", "createBullet", "(Landroid/content/Context;Lerz;)Lru/yandex/taxi/design/ListItemComponent;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcrz;", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lip11;", "Lyqz;", "brz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LostItemModalView extends SlideableBindingModalView<crz> {
    private final yqz presenter;
    private final ip11 typefaceDelegate;

    public LostItemModalView(Context context, ip11 ip11Var, yqz yqzVar) {
        super(context);
        this.typefaceDelegate = ip11Var;
        this.presenter = yqzVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemComponent createBullet(Context context, erz bullet) {
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setLeadImage(q3h0.ic_taxicar);
        listItemComponent.setTitle(bullet.a);
        listItemComponent.setSubtitle(bullet.b);
        listItemComponent.setDebounceClickListener(new r7v(27, this, bullet));
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.NORMAL);
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBullet$lambda$0$0(LostItemModalView lostItemModalView, erz erzVar) {
        yqz yqzVar = lostItemModalView.presenter;
        yqzVar.y.b(yqzVar.z.a, SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType.ViewOrderDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeClicked(yqz yqzVar) {
        ppl0 ppl0Var = yqzVar.y;
        String str = yqzVar.z.a;
        SafetyCenterAnalytics$LostItemsAnalyticsDismissType safetyCenterAnalytics$LostItemsAnalyticsDismissType = SafetyCenterAnalytics$LostItemsAnalyticsDismissType.CloseButtonTapped;
        ppl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("dismiss_type", safetyCenterAnalytics$LostItemsAnalyticsDismissType.getEventValue());
        ppl0Var.a.a("SafetyCenter.LostItemsModalCard.Closed", hashMap, 1, new HashMap());
        yqzVar.A.a.r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public crz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tjh0.lost_item_modal_view, parent, false);
        int i = i7h0.action_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = i7h0.bullets;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
            if (goLinearLayout != null) {
                i = i7h0.description;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = i7h0.description_shimmering_bar;
                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                        i = i7h0.header;
                        ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                        if (listHeaderComponent != null) {
                            i = i7h0.header_shimmering_bar;
                            if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                i = i7h0.icon;
                                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                                if (goImageView != null) {
                                    i = i7h0.icon_shimmering_bar;
                                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                        i = i7h0.image;
                                        GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                                        if (goImageView2 != null) {
                                            i = i7h0.loading_layout;
                                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                                            if (goLinearLayout2 != null) {
                                                i = i7h0.text_shimmering_bar;
                                                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                    return new crz((GoLinearLayout) inflate, buttonComponent, goLinearLayout, listItemComponent, listHeaderComponent, goImageView, goImageView2, goLinearLayout2);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        qdb1.c(this, new fbz(4, this.presenter));
        ListHeaderComponent listHeaderComponent = getBinding().e;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        listHeaderComponent.setTitleTypeface(((zmh) ip11Var).d());
        getBinding().e.setLeadVerticalGravity(0);
        yqz yqzVar = this.presenter;
        brz brzVar = new brz(this);
        yqzVar.Bg(brzVar);
        brzVar.eb(irz.a);
        dqk0 dqk0Var = yqzVar.z;
        tje.N(yqzVar.Jg(), null, null, new LostItemModalPresenter$loadLostItemOrder$1(yqzVar, dqk0Var, null), 3);
        ppl0 ppl0Var = yqzVar.y;
        String str = dqk0Var.a;
        ppl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        ppl0Var.a.a("SafetyCenter.LostItemsModalCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
