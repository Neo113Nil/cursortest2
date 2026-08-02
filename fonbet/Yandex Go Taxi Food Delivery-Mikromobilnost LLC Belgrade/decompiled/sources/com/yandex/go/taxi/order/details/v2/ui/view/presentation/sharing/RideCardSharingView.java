package com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.coroutines.b;
import com.yandex.go.taxi.order.details.v2.domain.c;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.d;
import defpackage.ank0;
import defpackage.bkk0;
import defpackage.bnk0;
import defpackage.ckk0;
import defpackage.dkk0;
import defpackage.dnk0;
import defpackage.enk0;
import defpackage.fnk0;
import defpackage.fpf0;
import defpackage.hnk0;
import defpackage.htc;
import defpackage.ibk0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wrs0;
import defpackage.ydk0;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/sharing/RideCardSharingView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lank0;", "Landroid/content/Context;", "context", "Lhnk0;", "interactor", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "perfAnalyticsTracer", "Lydk0;", "communicationAdapterAssistedFactoryInjector", "Lckk0;", "itemsAdapterAssistedFactory", "<init>", "(Landroid/content/Context;Lhnk0;Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;Lydk0;Lckk0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lank0;", "Lhnk0;", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "Lbkk0;", "itemsAdapter", "Lbkk0;", "fnk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardSharingView extends BindingModalView<ank0> {
    public static final int $stable = 8;
    private final hnk0 interactor;
    private final bkk0 itemsAdapter;
    private final com.yandex.go.taxi.order.details.v2.analytics.perf.a perfAnalyticsTracer;

    public RideCardSharingView(Context context, hnk0 hnk0Var, com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar, ydk0 ydk0Var, ckk0 ckk0Var) {
        super(context);
        this.interactor = hnk0Var;
        this.perfAnalyticsTracer = aVar;
        htc htcVar = ydk0Var.a;
        dnk0 dnk0Var = new dnk0();
        enk0 enk0Var = new enk0();
        RideCardPresentationType rideCardPresentationType = RideCardPresentationType.SHARING;
        bkk0 a = ((dkk0) ckk0Var).a(htcVar, dnk0Var, enk0Var, rideCardPresentationType, null);
        this.itemsAdapter = a;
        aVar.g();
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(a);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        fnk0 fnk0Var = new fnk0(this);
        o8g0 o8g0Var = hnk0Var.e;
        c cVar = new c(((d) o8g0Var.a).a(rideCardPresentationType), o8g0Var);
        ((tt2) o8g0Var.b).getClass();
        sjh sjhVar = uyj.a;
        jqr jqrVar = new jqr(e.F(cVar, sjhVar), new RideCardSharingViewInteractor$trackUiStateFlow$1(2, fnk0Var, bnk0.class, "render", "render(Lcom/yandex/go/taxi/order/details/v2/state/RideCardState;)V", 4), 3);
        ike ikeVar = hnk0Var.h;
        b.h(ikeVar, jqrVar);
        hnk0Var.f.getClass();
        tje.N(ikeVar, sjhVar, null, new RideCardSharingViewInteractor$trackUiStateFlow$2(hnk0Var, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemsAdapter$lambda$0(ibk0 ibk0Var, wrs0 wrs0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemsAdapter$lambda$1(fpf0 fpf0Var) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public ank0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.ride_card_sharing_layout, parent, false);
        parent.addView(inflate);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new ank0(recyclerView, recyclerView);
        }
        ny61.t("rootView");
        return null;
    }
}
