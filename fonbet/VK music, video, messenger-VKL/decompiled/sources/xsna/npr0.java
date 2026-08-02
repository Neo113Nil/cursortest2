package xsna;

import android.graphics.Bitmap;
import com.vk.upload.impl.UploadNotification;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.mpr0;
import xsna.ppr0;
import xsna.qpr0;
import xsna.wpr0;

/* compiled from: VerticalizationModeFeature.kt */
/* loaded from: classes16.dex */
public final class npr0 extends wk50<ypr0, xpr0, mpr0, qpr0> {
    public final gpj0 f;
    public final vre0 g;
    public eqr0 h;
    public final f4z i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public npr0(ppr0.b bVar, gpj0 gpj0Var, vre0 vre0Var) {
        super(r0, new vpr0(new xpr0(r3, r5, r5, r6, r7, r8, r12, r12 != null ? r12.intValue() : r9)));
        mpr0.c cVar = mpr0.c.b;
        List<String> list = bVar.f;
        boolean z = list == null;
        iz8 iz8Var = bVar.a;
        boolean z2 = z;
        String str = bVar.b;
        Bitmap bitmap = bVar.c;
        int i = 0;
        Bitmap bitmap2 = bVar.d;
        Integer num = bVar.e;
        this.f = gpj0Var;
        this.g = vre0Var;
        this.i = new f4z();
        T(qpr0.b.b);
    }

    @Override // xsna.wk50
    public final void N(xpr0 xpr0Var, mpr0 mpr0Var) {
        xpr0 xpr0Var2 = xpr0Var;
        mpr0 mpr0Var2 = mpr0Var;
        List<String> list = xpr0Var2.g;
        if (mpr0Var2 instanceof mpr0.c) {
            if (list == null) {
                eqr0 eqr0Var = new eqr0(xpr0Var2.d, this.f.getUid());
                this.h = eqr0Var;
                int i = 0;
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.q(new osk0(eqr0Var, 10)).a0(asu0.a.c()), new je40(new c220(this, 25), 16)).subscribe(new o7y(new com.vk.channels.impl.channel_screen.send_msg.e(1, this, npr0.class, "onVerticalizationDone", "onVerticalizationDone(Ljava/util/List;)V", i, 13), 24), new bdz(new pba(1, this, npr0.class, "onVerticalizationFailed", "onVerticalizationFailed(Ljava/lang/Throwable;)V", i, 9), 29));
                if (subscribe != null) {
                    this.e.b(subscribe);
                    return;
                }
                return;
            }
            return;
        }
        boolean z = mpr0Var2 instanceof mpr0.b;
        f4z f4zVar = this.i;
        if (z) {
            f4zVar.b(wpr0.b.a);
            return;
        }
        if (!(mpr0Var2 instanceof mpr0.a)) {
            if (!(mpr0Var2 instanceof mpr0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new qpr0.c(((mpr0.d) mpr0Var2).b));
            return;
        }
        Integer num = xpr0Var2.h;
        int i2 = xpr0Var2.i;
        boolean z2 = false;
        boolean z3 = num != null && num.intValue() == i2;
        if (num == null && list != null && i2 == list.size()) {
            z2 = true;
        }
        if (z3 || z2) {
            f4zVar.b(wpr0.b.a);
        } else {
            f4zVar.b(new wpr0.a(i2));
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        eqr0 eqr0Var = this.h;
        if (eqr0Var != null) {
            io.reactivex.rxjava3.disposables.c cVar = eqr0Var.f;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = eqr0Var.g;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            Integer num = eqr0Var.e;
            if (num != null) {
                ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
                com.vk.upload.impl.a.b(num.intValue(), null);
            }
            String str = eqr0Var.d;
            if (str != null) {
                eqr0Var.a(str);
            }
        }
        this.h = null;
    }
}
