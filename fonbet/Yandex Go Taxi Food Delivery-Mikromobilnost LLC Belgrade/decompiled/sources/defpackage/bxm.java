package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.jxm;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oy91;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wjm;
import defpackage.yt0;
import defpackage.zy11;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final /* synthetic */ class bxm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wjm b;

    public /* synthetic */ bxm(wjm wjmVar, int i) {
        this.a = i;
        this.b = wjmVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final wjm wjmVar = this.b;
        int i2 = 2;
        int i3 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) wjmVar.c, btsVar, qti.e), ua3.a.a((dci) wjmVar.w)}, wwg.S(-139049338, true, new bxm(wjmVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) wjmVar.c, wwg.S(913443695, true, new bxm(wjmVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1615762264, true, new wls() { // from class: ru.yandex.logistics.sdk.cargo_form.impl.due.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            b bVar = (b) wjm.this.x;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = bVar.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), bVar, 12);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                b bVar2 = (b) ooc.G(qoi0.a(b.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                oz40 b = f.b(bVar2.C, btsVar4);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = new Triple(bVar2.z.getValue(), bVar2.A.getValue(), bVar2.B.getValue());
                                    btsVar4.o0(Q);
                                }
                                Triple triple = (Triple) Q;
                                jxm jxmVar = (jxm) b.getValue();
                                if (jxmVar == null) {
                                    btsVar4.e0(1475746102);
                                    btsVar4.t(false);
                                } else {
                                    btsVar4.e0(1475746103);
                                    boolean e = btsVar4.e(bVar2);
                                    Object Q2 = btsVar4.Q();
                                    if (e || Q2 == o430Var) {
                                        DueRoot$getView$1$1$1$1$1$1$1$1 dueRoot$getView$1$1$1$1$1$1$1$1 = new DueRoot$getView$1$1$1$1$1$1$1$1(1, bVar2, b.class, "onDaysChanged", "onDaysChanged(I)V", 0);
                                        btsVar4.o0(dueRoot$getView$1$1$1$1$1$1$1$1);
                                        Q2 = dueRoot$getView$1$1$1$1$1$1$1$1;
                                    }
                                    tls tlsVar = (tls) ((tfx) Q2);
                                    boolean e2 = btsVar4.e(bVar2);
                                    Object Q3 = btsVar4.Q();
                                    if (e2 || Q3 == o430Var) {
                                        DueRoot$getView$1$1$1$1$1$1$2$1 dueRoot$getView$1$1$1$1$1$1$2$1 = new DueRoot$getView$1$1$1$1$1$1$2$1(1, bVar2, b.class, "onHoursChanged", "onHoursChanged(I)V", 0);
                                        btsVar4.o0(dueRoot$getView$1$1$1$1$1$1$2$1);
                                        Q3 = dueRoot$getView$1$1$1$1$1$1$2$1;
                                    }
                                    tls tlsVar2 = (tls) ((tfx) Q3);
                                    boolean e3 = btsVar4.e(bVar2);
                                    Object Q4 = btsVar4.Q();
                                    if (e3 || Q4 == o430Var) {
                                        Q4 = new DueRoot$getView$1$1$1$1$1$1$3$1(1, bVar2, b.class, "onMinutesChanged", "onMinutesChanged(I)V", 0);
                                        btsVar4.o0(Q4);
                                    }
                                    tls tlsVar3 = (tls) ((tfx) Q4);
                                    boolean e4 = btsVar4.e(bVar2);
                                    Object Q5 = btsVar4.Q();
                                    if (e4 || Q5 == o430Var) {
                                        DueRoot$getView$1$1$1$1$1$1$4$1 dueRoot$getView$1$1$1$1$1$1$4$1 = new DueRoot$getView$1$1$1$1$1$1$4$1(0, bVar2, b.class, "onContinueButtonClick", "onContinueButtonClick()V", 0);
                                        btsVar4.o0(dueRoot$getView$1$1$1$1$1$1$4$1);
                                        Q5 = dueRoot$getView$1$1$1$1$1$1$4$1;
                                    }
                                    sls slsVar = (sls) ((tfx) Q5);
                                    boolean e5 = btsVar4.e(bVar2);
                                    Object Q6 = btsVar4.Q();
                                    if (e5 || Q6 == o430Var) {
                                        DueRoot$getView$1$1$1$1$1$1$5$1 dueRoot$getView$1$1$1$1$1$1$5$1 = new DueRoot$getView$1$1$1$1$1$1$5$1(0, bVar2, b.class, "onDeleteButtonClick", "onDeleteButtonClick()V", 0);
                                        btsVar4.o0(dueRoot$getView$1$1$1$1$1$1$5$1);
                                        Q6 = dueRoot$getView$1$1$1$1$1$1$5$1;
                                    }
                                    oy91.e(jxmVar, triple, tlsVar, tlsVar2, tlsVar3, slsVar, (sls) ((tfx) Q6), btsVar4, 48);
                                    btsVar4.t(false);
                                }
                            } else {
                                btsVar4.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
