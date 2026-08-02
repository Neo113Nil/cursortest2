package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.b;

/* loaded from: classes5.dex */
public final class l100 implements n100 {
    public final zzs a;
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 b;
    public final /* synthetic */ MaasMetroPickModalView c;

    public l100(MaasMetroPickModalView maasMetroPickModalView, zzs zzsVar, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        this.c = maasMetroPickModalView;
        this.a = zzsVar;
        this.b = multiTransportChooseStationCardAnalytics$OpenReasonV2;
    }

    @Override // defpackage.n100
    public final void Af(ik50 ik50Var) {
        View view;
        ListTitleComponent listTitleComponent;
        ButtonComponent buttonComponent;
        qk50 qk50Var;
        MaasMetroPickModalView maasMetroPickModalView = this.c;
        view = maasMetroPickModalView.content;
        maasMetroPickModalView.changeView(view);
        listTitleComponent = maasMetroPickModalView.title;
        listTitleComponent.setTitle(ik50Var.b.a);
        buttonComponent = maasMetroPickModalView.done;
        buttonComponent.setText(ik50Var.b.b);
        qk50Var = maasMetroPickModalView.adapter;
        qk50Var.w = ik50Var.a;
        qk50Var.f(qk50Var.x);
        qk50Var.notifyDataSetChanged();
    }

    @Override // defpackage.n100
    public final void S3(int i, int i2, boolean z) {
        View errorView;
        View errorView2;
        ListTitleComponent title;
        View errorView3;
        ListTextComponent subtitle;
        ButtonComponent tryAgain;
        MaasMetroPickModalView maasMetroPickModalView = this.c;
        errorView = maasMetroPickModalView.getErrorView();
        maasMetroPickModalView.changeView(errorView);
        errorView2 = maasMetroPickModalView.getErrorView();
        title = maasMetroPickModalView.getTitle(errorView2);
        title.setTitle(i);
        errorView3 = maasMetroPickModalView.getErrorView();
        subtitle = maasMetroPickModalView.getSubtitle(errorView3);
        subtitle.setText(i2);
        tryAgain = maasMetroPickModalView.getTryAgain(maasMetroPickModalView);
        tryAgain.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.n100
    public final void anchor() {
        this.c.anchor();
    }

    @Override // defpackage.n100
    public final zzs bb() {
        return this.a;
    }

    @Override // defpackage.n100
    public final void bd(j7u0 j7u0Var, ga0 ga0Var) {
        k100 k100Var;
        MaasMetroPickModalView maasMetroPickModalView = this.c;
        k100Var = maasMetroPickModalView.listener;
        e100 e100Var = (e100) k100Var;
        b bVar = (b) e100Var.b;
        r100 r100Var = (r100) e100Var.c;
        s100 s100Var = bVar.L;
        if (j7u0Var == null) {
            if (s100Var != null) {
                s100Var.detach();
            }
            bVar.L = null;
            xm00 xm00Var = bVar.M;
            if (xm00Var != null) {
                xm00Var.d();
            }
            bVar.M = null;
            ((ru.yandex.taxi.viewholder.b) bVar.J).f(r100Var);
            bVar.r(new qu(9));
        } else {
            if (s100Var != null) {
                s100Var.detach();
            }
            bVar.L = null;
            xm00 xm00Var2 = bVar.M;
            if (xm00Var2 != null) {
                xm00Var2.d();
            }
            bVar.M = null;
            ((ru.yandex.taxi.viewholder.b) bVar.J).f(r100Var);
            bVar.r(new ynn(22, ga0Var, j7u0Var, (m000) e100Var.w));
        }
        maasMetroPickModalView.dismiss();
    }

    @Override // defpackage.n100
    public final void close() {
        k100 k100Var;
        MaasMetroPickModalView maasMetroPickModalView = this.c;
        k100Var = maasMetroPickModalView.listener;
        e100 e100Var = (e100) k100Var;
        b bVar = (b) e100Var.b;
        s100 s100Var = bVar.L;
        if (s100Var != null) {
            s100Var.detach();
        }
        bVar.L = null;
        xm00 xm00Var = bVar.M;
        if (xm00Var != null) {
            xm00Var.d();
        }
        bVar.M = null;
        ((ru.yandex.taxi.viewholder.b) bVar.J).f((r100) e100Var.c);
        bVar.r(new qu(9));
        maasMetroPickModalView.dismiss();
    }

    @Override // defpackage.n100
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 j() {
        return this.b;
    }

    @Override // defpackage.n100
    public final void setDoneEnabled(boolean z) {
        this.c.setDoneEnabled(z);
    }

    @Override // defpackage.n100
    public final void showLoading() {
        FrameLayout loadingView;
        MaasMetroPickModalView maasMetroPickModalView = this.c;
        loadingView = maasMetroPickModalView.getLoadingView();
        maasMetroPickModalView.changeView(loadingView);
    }
}
