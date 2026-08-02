package defpackage;

import com.yandex.go.taxi.order.rate.c;
import com.yandex.go.taxi.order.state.checkin.a;
import com.yandex.go.taxi.order.state.search.ui.e;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class dgb implements hjz0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dgb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hjz0
    public final void a(b980 b980Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).Qg(b980Var);
                break;
            case 1:
                ((com.yandex.go.taxi.order.state.driving.a) obj).Qg(b980Var);
                break;
            case 2:
                c cVar = (c) obj;
                ((g7i0) cVar.Dg()).setTitles(b980Var);
                ((g7i0) cVar.Dg()).showSubtitleNavigationIcon(b980Var.g);
                break;
            case 3:
                ((hom0) obj).Qg(b980Var);
                break;
            case 4:
                ((e) obj).Qg(b980Var);
                break;
            case 5:
                ((tls) obj).invoke(b980Var);
                break;
            default:
                ((hc11) obj).Qg(b980Var);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hjz0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (a) obj, a.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, (com.yandex.go.taxi.order.state.driving.a) obj, com.yandex.go.taxi.order.state.driving.a.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, (c) obj, c.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
            case 3:
                return new FunctionReferenceImpl(1, (hom0) obj, hom0.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
            case 4:
                return new FunctionReferenceImpl(1, (e) obj, e.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
            case 5:
                return (tls) obj;
            default:
                return new FunctionReferenceImpl(1, (hc11) obj, hc11.class, "onTitlesChanged", "onTitlesChanged(Lcom/yandex/go/taxi/order/api/titles/OrderTitles;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
