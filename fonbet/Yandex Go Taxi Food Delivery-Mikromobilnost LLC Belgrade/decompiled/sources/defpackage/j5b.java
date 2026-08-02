package defpackage;

import android.graphics.Bitmap;
import android.text.Editable;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.internal.net.Error;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class j5b implements g5b, b9b, us20, m421, ybz0, ryj0, rmt0, wb71 {
    public final /* synthetic */ y6f0 a;

    public /* synthetic */ j5b(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // defpackage.b9b
    public void a(Error error) {
        ((x6f0) this.a).d(new iyj0(error));
    }

    @Override // defpackage.us20
    public void b(String str) {
        ((x6f0) this.a).d(new kyj0(new h2e0(str)));
    }

    @Override // defpackage.ybz0
    public void c(ru10 ru10Var) {
        ((x6f0) this.a).d(ru10Var);
    }

    @Override // defpackage.b9b
    public void d(j3b j3bVar) {
        ((x6f0) this.a).d(new myj0(j3bVar));
    }

    @Override // defpackage.us20
    public void e(ct20 ct20Var) {
        ((x6f0) this.a).d(new kyj0(new i2e0(ct20Var)));
    }

    @Override // defpackage.g5b
    public void f(Metadata metadata) {
        sub1.e(this.a, metadata);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((x6f0) this.a).d(new hyj0((PaymentKitError) obj));
    }

    @Override // defpackage.m421
    public void j(String str) {
        ((x6f0) this.a).d(str);
    }

    @Override // defpackage.b9b
    public void k(j3b j3bVar, s020 s020Var) {
        ((x6f0) this.a).d(new myj0(j3bVar));
    }

    @Override // defpackage.wb71
    public void l(Bitmap bitmap, String str) {
        ((x6f0) this.a).d(new ah81(bitmap, str));
    }

    @Override // defpackage.rmt0
    public void o(Editable editable) {
        ((x6f0) this.a).d(editable);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        List<lp4> list = (List) obj;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (lp4 lp4Var : list) {
            arrayList.add(new fq4(lp4Var.a, lp4Var.g.toString(), false, true, lp4Var.b, lp4Var.f));
        }
        ((x6f0) this.a).d(new kyj0(arrayList));
    }

    @Override // defpackage.wb71
    public void a(Map map) {
        x6f0 x6f0Var = (x6f0) this.a;
        x6f0Var.getClass();
        x6f0Var.l(null);
    }
}
