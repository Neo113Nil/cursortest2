package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.clarify_address.before_order.a;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.summary.api.map.model.FocusPointType;
import com.yandex.go.taxi.summary.map.focus.data.SummarySourceAddressFocusExperiment;
import com.yandex.go.taxi.summary.map.focus.data.SummaryZoomZonesExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes8.dex */
public final class lgv0 {
    public final wiq0 a;
    public final mgv0 b;
    public final c c;
    public final ah00 d;
    public final urv0 e;
    public final zyb0 f;
    public final mzb g;
    public final yfv0 h;
    public final dqe0 i;
    public final qqo j;

    public lgv0(wiq0 wiq0Var, mgv0 mgv0Var, c cVar, ah00 ah00Var, urv0 urv0Var, zyb0 zyb0Var, mzb mzbVar, yfv0 yfv0Var, dqe0 dqe0Var, rqo rqoVar) {
        this.a = wiq0Var;
        this.b = mgv0Var;
        this.c = cVar;
        this.d = ah00Var;
        this.e = urv0Var;
        this.f = zyb0Var;
        this.g = mzbVar;
        this.h = yfv0Var;
        this.i = dqe0Var;
        this.j = ((jbh) rqoVar).c(SummarySourceAddressFocusExperiment.d);
    }

    public final boolean a() {
        return !this.c.c().b.isEmpty();
    }

    public final void b() {
        if (a()) {
            ((a) this.g).b.d = !((a) r1).b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a7, code lost:
    
        if ((r0 != null ? r0.u0 : null) == ru.yandex.taxi.tariffs.model.TariffOrderFlow.TAXI_FLOW) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iib c(FocusPointType focusPointType) {
        iib iibVar;
        Integer num;
        zzs B;
        yfv0 yfv0Var = this.h;
        boolean z = true;
        if (yfv0Var.a() && jl40.l(yfv0Var.c, lfv0.a)) {
            int i = kgv0.a[focusPointType.ordinal()];
            if (i == 1) {
                Address e = this.i.e();
                if (e != null) {
                    B = e.B();
                    if (B != null) {
                    }
                }
                B = null;
                if (B != null) {
                }
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                Address a = this.i.a();
                if (a != null) {
                    B = a.B();
                    if (B != null) {
                        iibVar = new iib(17.0f, B);
                    }
                }
                B = null;
                if (B != null) {
                }
            }
            if (iibVar == null) {
                return iibVar;
            }
            if (((a) this.g).d()) {
                boolean z2 = this.e.a() && this.b.a() && a();
                if (!((a) this.g).f() && !z2) {
                    z = false;
                }
            } else {
                if (((a) this.g).a() && (d() || e())) {
                    pex0 m = ((k) this.a).m();
                }
                z = false;
                b();
            }
            if (z) {
                FocusPointType focusPointType2 = FocusPointType.POINT_A;
                if (focusPointType == focusPointType2 && e()) {
                    zyb0 zyb0Var = this.f;
                    float floatValue = ((Number) y6i0.h(Float.valueOf(y6i0.c(17.0f, zyb0Var.a, zyb0Var.b)), ((gh00) this.d).k())).floatValue();
                    zzs zzsVar = this.b.e;
                    if (zzsVar != null) {
                        return new iib(floatValue, zzsVar);
                    }
                } else {
                    if (((a) this.g).f()) {
                        num = 17;
                    } else {
                        num = ((SummarySourceAddressFocusExperiment) this.j.b()).c;
                        if (num == null) {
                            Object b = this.e.a.b();
                            if (!((SummaryZoomZonesExperiment) b).b) {
                                b = null;
                            }
                            SummaryZoomZonesExperiment summaryZoomZonesExperiment = (SummaryZoomZonesExperiment) b;
                            num = summaryZoomZonesExperiment != null ? summaryZoomZonesExperiment.d : null;
                        }
                    }
                    Float f = num != null ? (Float) y6i0.h(Float.valueOf(num.intValue()), ((gh00) this.d).k()) : null;
                    zzs zzsVar2 = (focusPointType == focusPointType2 && d()) ? this.b.e : null;
                    if (f != null) {
                        float floatValue2 = f.floatValue();
                        if (zzsVar2 != null) {
                            return new iib(floatValue2, zzsVar2);
                        }
                    }
                }
            }
            return null;
        }
        iibVar = null;
        if (iibVar == null) {
        }
    }

    public final boolean d() {
        a aVar = (a) this.g;
        return (((SummarySourceAddressFocusExperiment) this.j.b()).b || this.e.a() || (aVar.f() && aVar.a())) && this.b.a() && a();
    }

    public final boolean e() {
        return ((Boolean) this.f.c.getValue()).booleanValue() && !((a) this.g).d();
    }

    public final boolean f() {
        return ((Boolean) this.f.e.getValue()).booleanValue() && ((a) this.g).a();
    }
}
