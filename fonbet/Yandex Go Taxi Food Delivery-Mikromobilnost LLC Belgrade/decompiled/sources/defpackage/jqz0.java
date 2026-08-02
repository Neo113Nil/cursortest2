package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.telemetry.domain.a;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.logistics.sdk.management.storage.f;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.widgets.domain.c;

/* loaded from: classes9.dex */
public final class jqz0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ jqz0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new iqz0((opz0) xvf0Var.get());
            case 1:
                return new to4((b220) xvf0Var.get(), 1);
            case 2:
                return new nzz0((y8j0) xvf0Var.get());
            case 3:
                return new a((tt2) xvf0Var.get());
            case 4:
                return new rj9(i2, (ru.yandex.taxi.layers.domain.links.a) xvf0Var.get());
            case 5:
                return new c((y) xvf0Var.get());
            case 6:
                return new a601((rqo) xvf0Var.get());
            case 7:
                return new d((Context) xvf0Var.get());
            case 8:
                return new f((Context) xvf0Var.get());
            case 9:
                return new s701((Context) xvf0Var.get());
            case 10:
                return new i801((gc80) xvf0Var.get());
            case 11:
                return new x801((awa0) xvf0Var.get());
            case 12:
                return osb1.c((se01) xvf0Var.get());
            case 13:
                return osb1.d((se01) xvf0Var.get());
            case 14:
                return osb1.e((dnp0) xvf0Var.get());
            case 15:
                return new ef01((b) xvf0Var.get());
            case 16:
                return new ly01((FragmentActivity) xvf0Var.get());
            case 17:
                return new b011((pho) xvf0Var.get());
            case 18:
                return new r((el00) xvf0Var.get());
            case 19:
                return new b611((pho) xvf0Var.get());
            case 20:
                return new u811((i) xvf0Var.get());
            case 21:
                return new ec11((rqo) xvf0Var.get());
            case 22:
                return new bd11((k7x0) xvf0Var.get());
            case 23:
                return new qc20(xvf0Var.get());
            case 24:
                return new a201((rqo) xvf0Var.get());
            case 25:
                return new wyo0(4, xvf0Var);
            case 26:
                return new hbp(i2, (di11) xvf0Var.get());
            case 27:
                return new di11((ei11) xvf0Var.get());
            case 28:
                return new ei11((Context) xvf0Var.get());
            default:
                return new xj11((rqo) xvf0Var.get());
        }
    }
}
