package com.yandex.go.taxi.order.cancel.similar.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$State;
import com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersModalView;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.c6j;
import defpackage.cma1;
import defpackage.co40;
import defpackage.cx7;
import defpackage.e08;
import defpackage.hh5;
import defpackage.ip11;
import defpackage.iz7;
import defpackage.j08;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.nz7;
import defpackage.p08;
import defpackage.p8h0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qu;
import defpackage.tje;
import defpackage.tse0;
import defpackage.w47;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xz7;
import defpackage.yz7;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001-B%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/yandex/go/taxi/order/cancel/similar/view/CancelSimilarOrdersModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyz7;", "Le08;", "Landroid/content/Context;", "context", "Lj08;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lj08;Lip11;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "renderImageMode", "(Lyz7;Landroid/graphics/drawable/Drawable;)V", "Lp08;", "uiState", "renderOrderCardMode", "(Lyz7;Lp08;)V", "Lru/yandex/taxi/common_models/net/Orientation;", "orientation", "updateLayoutManager", "(Lru/yandex/taxi/common_models/net/Orientation;)V", "", "isArrowsPermanentlyHidden", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyz7;", "settlingLayoutChanges", "render", "(Lp08;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lj08;", "Lip11;", "Lw47;", "adapter", "Lw47;", "a08", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelSimilarOrdersModalView extends SlideableBindingModalView<yz7> implements e08 {
    public static final int $stable = 8;
    private final w47 adapter;
    private final j08 presenter;
    private final ip11 typefaceDelegate;

    public CancelSimilarOrdersModalView(Context context, j08 j08Var, ip11 ip11Var) {
        super(context);
        this.presenter = j08Var;
        this.typefaceDelegate = ip11Var;
        this.adapter = new w47(new cx7(3, this));
        final int i = 0;
        qdb1.c(this, new Runnable(this) { // from class: wz7
            public final /* synthetic */ CancelSimilarOrdersModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                CancelSimilarOrdersModalView cancelSimilarOrdersModalView = this.b;
                switch (i2) {
                    case 0:
                        cancelSimilarOrdersModalView.onBackPressed();
                        break;
                    default:
                        CancelSimilarOrdersModalView._init_$lambda$0(cancelSimilarOrdersModalView);
                        break;
                }
            }
        });
        final int i2 = 1;
        setOnBackPressedListener(new Runnable(this) { // from class: wz7
            public final /* synthetic */ CancelSimilarOrdersModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                CancelSimilarOrdersModalView cancelSimilarOrdersModalView = this.b;
                switch (i22) {
                    case 0:
                        cancelSimilarOrdersModalView.onBackPressed();
                        break;
                    default:
                        CancelSimilarOrdersModalView._init_$lambda$0(cancelSimilarOrdersModalView);
                        break;
                }
            }
        });
        setDismissOnBackPressed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CancelSimilarOrdersModalView cancelSimilarOrdersModalView) {
        cancelSimilarOrdersModalView.presenter.y.b.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(CancelSimilarOrdersModalView cancelSimilarOrdersModalView, nz7 nz7Var) {
        j08 j08Var = cancelSimilarOrdersModalView.presenter;
        hh5 hh5Var = j08Var.A;
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = j08Var.x;
        String str = cancelSimilarOrdersNotification.b;
        List list = cancelSimilarOrdersNotification.c;
        co40 co40Var = (co40) hh5Var.b;
        iz7 iz7Var = iz7.INSTANCE;
        String str2 = jl40.l(nz7Var, iz7Var) ? "cancel_other_orders" : "do_nothing";
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("other_order_ids", list);
        co40Var.a.a("MultiorderCancelModalCard.Tapped", hashMap, 1, tse0.r("button", hashMap, str2));
        if (jl40.l(nz7Var, iz7Var)) {
            tje.N(j08Var.Jg(), null, null, new CancelSimilarOrdersPresenter$onTap$1(j08Var, null), 3);
        } else {
            j08Var.y.b.r(new qu(9));
        }
        return zy11.a;
    }

    private final void renderImageMode(yz7 yz7Var, Drawable drawable) {
        yz7Var.f.setVisibility(8);
        yz7Var.b.setVisibility(8);
        ImageView imageView = yz7Var.d;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    private final void renderOrderCardMode(yz7 yz7Var, p08 p08Var) {
        ImageView imageView = yz7Var.d;
        DriverSectionView driverSectionView = yz7Var.c;
        GoLinearLayout goLinearLayout = yz7Var.b;
        imageView.setVisibility(8);
        boolean l = jl40.l(p08Var.f, c6j.a);
        ShimmeringFrameLayout shimmeringFrameLayout = yz7Var.f;
        if (l) {
            shimmeringFrameLayout.setVisibility(0);
            goLinearLayout.setVisibility(8);
            return;
        }
        shimmeringFrameLayout.setVisibility(8);
        goLinearLayout.setVisibility(0);
        driverSectionView.render(p08Var.f);
        driverSectionView.setAvatarBackgroundColor(qje.t(xng0.controlMinor, getContext()));
        yz7Var.g.setText(p08Var.d);
    }

    private final void updateLayoutManager(Orientation orientation) {
        yz7 binding = getBinding();
        RecyclerView.e layoutManager = binding.e.getLayoutManager();
        int i = xz7.b[orientation.ordinal()] != 1 ? 0 : 1;
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).J == i) {
            binding.e.setLayoutManager(new LinearLayoutManager(getContext(), i, false));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yz7 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.cancel_similar_orders_modal_view, parent, false);
        int i = p8h0.driver_card;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = p8h0.driver_section;
            DriverSectionView driverSectionView = (DriverSectionView) cma1.O(i, inflate);
            if (driverSectionView != null) {
                i = p8h0.image;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    i = p8h0.rv_buttons;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = p8h0.shimmering_bar;
                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                        if (shimmeringFrameLayout != null) {
                            i = p8h0.tv_eta;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = p8h0.tv_subtitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView2 != null) {
                                    i = p8h0.tv_title;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView3 != null) {
                                        return new yz7((GoLinearLayout) inflate, goLinearLayout, driverSectionView, imageView, recyclerView, shimmeringFrameLayout, robotoTextView, robotoTextView2, robotoTextView3);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().e.setAdapter(this.adapter);
        j08 j08Var = this.presenter;
        j08Var.Bg(this);
        hh5 hh5Var = j08Var.A;
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = j08Var.x;
        String str = cancelSimilarOrdersNotification.b;
        List list = cancelSimilarOrdersNotification.c;
        co40 co40Var = (co40) hh5Var.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("other_order_ids", list);
        co40Var.a.a("MultiorderCancelModalCard.Shown", hashMap, 1, new HashMap());
        tje.N(j08Var.Jg(), null, null, new CancelSimilarOrdersPresenter$startToUpdateUiState$1(j08Var, null), 3);
        tje.N(j08Var.Jg(), null, null, new CancelSimilarOrdersPresenter$observeUiState$1(j08Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.e08
    public void render(p08 uiState) {
        yz7 binding = getBinding();
        if (uiState.e == CancelSimilarUiState$State.SUCCESS) {
            j08 j08Var = this.presenter;
            tje.N(j08Var.Jg(), null, null, new CancelSimilarOrdersPresenter$onSuccess$1(j08Var, null), 3);
            return;
        }
        binding.i.setText(uiState.b);
        binding.i.setTypeface(this.typefaceDelegate.b(getContext()));
        binding.h.setText(uiState.c);
        int i = xz7.a[uiState.h.ordinal()];
        if (i == 1) {
            UiStateDrawableWrapper uiStateDrawableWrapper = uiState.i;
            renderImageMode(binding, uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            renderOrderCardMode(binding, uiState);
        }
        updateLayoutManager(uiState.a);
        w47 w47Var = this.adapter;
        List list = uiState.g;
        w47Var.getClass();
        w47Var.submitList(list, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
