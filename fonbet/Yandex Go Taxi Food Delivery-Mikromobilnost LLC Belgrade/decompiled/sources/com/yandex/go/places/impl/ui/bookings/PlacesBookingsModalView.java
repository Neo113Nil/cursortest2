package com.yandex.go.places.impl.ui.bookings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.f28;
import defpackage.g0c;
import defpackage.i3y;
import defpackage.l5c0;
import defpackage.lki;
import defpackage.ny61;
import defpackage.o5c0;
import defpackage.o6h0;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.s5c0;
import defpackage.t240;
import defpackage.t5c0;
import defpackage.t9b0;
import defpackage.tt2;
import defpackage.uuh0;
import defpackage.wnb0;
import defpackage.y5c0;
import defpackage.zxs;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yandex/go/places/impl/ui/bookings/PlacesBookingsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lt5c0;", "Landroid/content/Context;", "context", "Ly5c0;", "presenter", "Lpav;", "imageLoader", "Ltt2;", "appDispatchers", "<init>", "(Landroid/content/Context;Ly5c0;Lpav;Ltt2;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt5c0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ly5c0;", "Lpav;", "Ltt2;", "Lo5c0;", "bookingsAdapter$delegate", "Li3y;", "getBookingsAdapter", "()Lo5c0;", "bookingsAdapter", "s5c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesBookingsModalView extends SlideableBindingModalView<t5c0> {
    public static final int $stable = 8;
    private final tt2 appDispatchers;

    /* renamed from: bookingsAdapter$delegate, reason: from kotlin metadata */
    private final i3y bookingsAdapter;
    private final pav imageLoader;
    private final y5c0 presenter;

    public PlacesBookingsModalView(Context context, y5c0 y5c0Var, pav pavVar, tt2 tt2Var) {
        super(context);
        this.presenter = y5c0Var;
        this.imageLoader = pavVar;
        this.appDispatchers = tt2Var;
        this.bookingsAdapter = a.b(LazyThreadSafetyMode.NONE, new t9b0(14, this));
        qdb1.c(this, new wnb0(4, y5c0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onBackButtonClicked(y5c0 y5c0Var) {
        ((f28) y5c0Var.y.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5c0 bookingsAdapter_delegate$lambda$0(PlacesBookingsModalView placesBookingsModalView) {
        pav pavVar = placesBookingsModalView.imageLoader;
        tt2 tt2Var = placesBookingsModalView.appDispatchers;
        PlacesBookingsModalView$bookingsAdapter$2$1 placesBookingsModalView$bookingsAdapter$2$1 = new PlacesBookingsModalView$bookingsAdapter$2$1(1, placesBookingsModalView.presenter, y5c0.class, "onBookingClicked", "onBookingClicked(Lcom/yandex/go/places/impl/domain/entities/bookings/PlacesBookingItem;)V", 0);
        lki lkiVar = new lki(5);
        int i = com.yandex.go.places.impl.ui.bookings.adapter.a.W;
        g0c a = qoi0.a(l5c0.class);
        return new o5c0(lkiVar, Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new t240(pavVar, tt2Var, placesBookingsModalView$bookingsAdapter$2$1, 25))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o5c0 getBookingsAdapter() {
        return (o5c0) this.bookingsAdapter.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public t5c0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.places_bookings_modal_view, parent, false);
        int i = o6h0.bookings;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            return new t5c0((GoFrameLayout) inflate, recyclerView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y5c0 y5c0Var = this.presenter;
        s5c0 s5c0Var = new s5c0(this);
        y5c0Var.Bg(s5c0Var);
        s5c0Var.render(y5c0Var.x);
        getBinding().b.setAdapter(getBookingsAdapter());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
