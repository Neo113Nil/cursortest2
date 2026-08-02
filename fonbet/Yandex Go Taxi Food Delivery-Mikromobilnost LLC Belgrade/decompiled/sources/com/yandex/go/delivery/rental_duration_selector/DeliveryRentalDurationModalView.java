package com.yandex.go.delivery.rental_duration_selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aih0;
import defpackage.aoi;
import defpackage.bbu;
import defpackage.bvf0;
import defpackage.c9u;
import defpackage.cma1;
import defpackage.g9u;
import defpackage.gzi0;
import defpackage.imi;
import defpackage.izi0;
import defpackage.jmi;
import defpackage.nt6;
import defpackage.ny61;
import defpackage.pt6;
import defpackage.rt6;
import defpackage.tcc;
import defpackage.tsd0;
import defpackage.xni;
import defpackage.y8g;
import defpackage.yxf0;
import defpackage.zsh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/DeliveryRentalDurationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Limi;", "Ljmi;", "Landroid/content/Context;", "context", "Lcom/yandex/go/delivery/rental_duration_selector/e;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/delivery/rental_duration_selector/e;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "onSlideOut", "onTouchOutside", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Limi;", "Lcom/yandex/go/delivery/rental_duration_selector/e;", "Lxni;", "engine", "Lxni;", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryRentalDurationModalView extends SlideableBindingModalView<imi> implements jmi {
    private final xni engine;
    private final e presenter;

    public DeliveryRentalDurationModalView(Context context, e eVar) {
        super(context);
        bbu bbuVar;
        pt6 pt6Var;
        aoi l;
        this.presenter = eVar;
        izi0 izi0Var = (izi0) eVar.B.getValue();
        c9u c9uVar = izi0Var.a;
        y8g y8gVar = null;
        if (c9uVar != null) {
            String str = c9uVar.a;
            String str2 = c9uVar.b;
            String str3 = c9uVar.c;
            g9u g9uVar = c9uVar.d;
            bbuVar = new bbu(str, str2, str3, g9uVar != null ? g9uVar.a : null);
        } else {
            bbuVar = null;
        }
        nt6 nt6Var = izi0Var.c;
        if (nt6Var != null) {
            List<tsd0> list = nt6Var.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (tsd0 tsd0Var : list) {
                arrayList.add(new rt6(tsd0Var.a, tsd0Var.b));
            }
            pt6Var = new pt6(arrayList);
        } else {
            pt6Var = null;
        }
        gzi0 gzi0Var = new gzi0(bbuVar, pt6Var, izi0Var.d.b, eVar.C, eVar.D);
        e eVar2 = this.presenter;
        synchronized (bvf0.g) {
            y8g y8gVar2 = bvf0.e;
            if (y8gVar2 != null) {
                y8gVar = y8gVar2;
            }
            l = y8gVar.g().l(new yxf0(gzi0Var, eVar2));
        }
        this.engine = l;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public imi bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        from.inflate(zsh0.delivery_rental_duration_modal_view, cardContentContainer);
        int i = aih0.container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, cardContentContainer);
        if (frameLayout != null) {
            return new imi(cardContentContainer, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(cardContentContainer.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.engine.b(getBinding().b);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        ((j) this.presenter.A.a).n("DeliveryCargoHour.SelectTimeScreen.Closed");
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        ((j) this.presenter.A.a).n("DeliveryCargoHour.SelectTimeScreen.Closed");
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        ((j) this.presenter.A.a).n("DeliveryCargoHour.SelectTimeScreen.Closed");
        super.onTouchOutside();
    }
}
