package defpackage;

import com.yandex.go.inapp_calls.navigation.f;
import java.util.Optional;
import ru.yandex.taxi.masstransit.overlay.routes.a;

/* loaded from: classes5.dex */
public final class pw1 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw1(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 5:
                a aVar = (a) this.F;
                if (aVar != null) {
                    i3y i3yVar = aVar.g;
                    aVar.a.Cg();
                    aVar.e.detach();
                    aVar.i = null;
                    ((fw30) aVar.h.getValue()).a();
                    ((xm00) i3yVar.getValue()).m();
                    ((xm00) i3yVar.getValue()).d();
                    ((gh00) aVar.b).u(aVar.m);
                    ((z9x0) aVar.f).b();
                }
                this.F = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        int i2 = 1;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                A((ru.yandex.taxi.altpins.router.a) obj2, (zy11) obj, new ow1(this));
                break;
            case 1:
                A((i85) obj2, (mbe0) obj, new h85(i2, this));
                break;
            case 2:
                A((com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.a) obj2, (ate) obj, new ite(this));
                break;
            case 3:
                A((m950) ((s0g) this.F).get(), (qvm) obj, new lhd(this, i2));
                break;
            case 4:
                A((f) obj2, (hkv) obj, new xkv(this, 0));
                break;
            case 5:
                a aVar = (a) ((wvq) obj2).get();
                this.F = aVar;
                aVar.a();
                break;
            case 6:
                A((ev6) obj2, (Optional) obj, new mo30(8, this));
                break;
            case 7:
                A((jcc0) obj2, (xl80) obj, new r75(5, this));
                break;
            case 8:
                A((qzi) obj2, (wzi) obj, new j83(3, this));
                break;
            case 9:
                A((ypc) obj2, (wpc) obj, new zpc(this, i2));
                break;
            case 10:
                A((ru.yandex.taxi.communications.stories.domain.a) obj2, (npu0) obj, new yio0(12, this));
                break;
            default:
                A((com.yandex.go.order.tariffs_suggest.router.a) obj2, (fox0) obj, new gox0(this));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(wvq wvqVar) {
        super(null);
        this.D = 5;
        this.E = wvqVar;
    }
}
