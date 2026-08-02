package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.search.common.presenter.b;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.ybsdk.rconfig.configs.ProductsV4GradientConfig;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ii8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ ii8(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        zy11 updateMarginsForAllCards$lambda$0;
        rbv entity$lambda$1;
        stz0 closeButtonTint$lambda$4;
        switch (this.a) {
            case 0:
                int i = this.b;
                gi8 gi8Var = (gi8) obj;
                return gi8.a(gi8Var, null, ((il8) gi8Var.a.get(i)).e, i, false, 19);
            case 1:
                return Boolean.valueOf(((yab) obj).a.moveToPosition(this.b));
            case 2:
                int i2 = this.b;
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(oyr.e('.', i2, "Collection doesn't contain element at index "));
            case 3:
                w610 w610Var = (w610) obj;
                return new dfz(this.b, w610Var.b().a, w610Var.b().b + 1);
            case 4:
                return Boolean.valueOf(((b) obj).Jh(this.b));
            case 5:
                ((TaxiOrder) obj).S(new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.PREFERRED_CHOICE, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT, String.valueOf(this.b)));
                return zy11.a;
            case 6:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                taxiOrder.S(new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.PREFERRED_CHOICE, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT, String.valueOf(this.b)));
                synchronized (taxiOrder) {
                    TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                    TaxiOrderFeedback taxiOrderFeedback = taxiOrderLocalData.W;
                    TaxiOrderTipsState taxiOrderTipsState = taxiOrderFeedback.g;
                    taxiOrderTipsState.getClass();
                    taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, TaxiOrderTipsState.a(taxiOrderTipsState, null, null, 11), null, 191), false, null, false, null, null, null, -1, 16711679);
                }
                return zy11.a;
            case 7:
                int i3 = this.b;
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("INSERT INTO hidden_namespaces VALUES(?)");
                try {
                    T0.b(1, i3);
                    T0.q();
                    long t = jx81.t(oll0Var);
                    T0.close();
                    return Long.valueOf(t);
                } finally {
                }
            case 8:
                f.k((mnq0) obj, new icc(this.b, 0));
                return zy11.a;
            case 9:
                int i4 = this.b;
                Drawable t2 = vng.t(i4, ((gev) obj).a);
                if (t2 != null) {
                    return cma1.k(t2);
                }
                xfo.g(oyr.i(i4, "Invalid resource ID: "));
                return null;
            case 10:
                return Boolean.valueOf(((wyf0) obj).b == this.b);
            case 11:
                int i5 = this.b;
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("INSERT INTO no_phone_namespaces VALUES(?)");
                try {
                    T0.b(1, i5);
                    T0.q();
                    long t3 = jx81.t(oll0Var2);
                    T0.close();
                    return Long.valueOf(t3);
                } finally {
                }
            case 12:
                int i6 = this.b;
                T0 = ((oll0) obj).T0("SELECT COUNT(1) FROM no_phone_namespaces WHERE namespace = ?");
                try {
                    T0.b(1, i6);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            r3 = true;
                        }
                    }
                    T0.close();
                    return Boolean.valueOf(r3);
                } finally {
                }
            case 13:
                updateMarginsForAllCards$lambda$0 = OrganizationCardsSliderModalView.updateMarginsForAllCards$lambda$0(this.b, (OrganizationCardPageView) obj);
                return updateMarginsForAllCards$lambda$0;
            case 14:
                entity$lambda$1 = ProductsV4GradientConfig.toEntity$lambda$1(this.b, (String) obj);
                return entity$lambda$1;
            case 15:
                return Boolean.valueOf(this.b < ((zz50) obj).a());
            case 16:
                int i7 = this.b;
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("UPDATE revisions SET workspace_version = ?");
                try {
                    T0.b(1, i7);
                    T0.q();
                    int x = jx81.x(oll0Var3);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 17:
                return Integer.valueOf((((Integer) obj).intValue() / 2) - this.b);
            case 18:
                return cvu0.v((String) obj, "$s", String.valueOf(this.b), false);
            case 19:
                return cvu0.v((String) obj, "$DAYS_LEFT$", String.valueOf(this.b), false);
            case 20:
                Context context = (Context) obj;
                return (context.getResources().getDimension(this.b) / context.getResources().getDisplayMetrics().density) + "px";
            case 21:
                ((lhz0) obj).A(this.b);
                return zy11.a;
            case 22:
                ((lhz0) obj).A(this.b);
                return zy11.a;
            case 23:
                closeButtonTint$lambda$4 = ToolbarView.setCloseButtonTint$lambda$4(this.b, (stz0) obj);
                return closeButtonTint$lambda$4;
            case 24:
                int i8 = this.b;
                return new pbv((dcv) new ccv(i8), (dcv) new ccv(i8), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            default:
                ((ru.yandex.taxi.masstransit.trains.schedule.b) obj).n1(this.b);
                return zy11.a;
        }
    }
}
