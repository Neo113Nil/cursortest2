package xsna;

import com.android.billingclient.api.Purchase;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tge0 implements izs {
    public final /* synthetic */ com.vk.billing.h b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Purchase e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ner0 g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ tge0(com.vk.billing.h hVar, AtomicInteger atomicInteger, int i, Purchase purchase, String str, ner0 ner0Var, boolean z) {
        this.b = hVar;
        this.c = atomicInteger;
        this.d = i;
        this.e = purchase;
        this.f = str;
        this.g = ner0Var;
        this.h = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final nge0 nge0Var = (nge0) obj;
        int i = nge0Var.h;
        final com.vk.billing.h hVar = this.b;
        laq laqVar = hVar.g;
        int i2 = hVar.h;
        final AtomicInteger atomicInteger = this.c;
        int i3 = this.d;
        final Purchase purchase = this.e;
        String str = this.f;
        final ner0 ner0Var = this.g;
        final boolean z = this.h;
        if (i2 < 7 && (i == 0 || (i != 1 && nge0Var.g))) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.i;
                StringBuilder b = ji.b(i, "retry consume: state: ", ", error: ");
                b.append(nge0Var.f);
                L.u(l, logType, new Object[]{"Billing : PurchasesManager", b.toString()});
            }
            if (i == -4) {
                hVar.h = 0;
                laqVar.c();
                atomicInteger.incrementAndGet();
                asu0.a.getClass();
                asu0.n().submit(new Runnable() { // from class: xsna.rge0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vk.billing.h hVar2 = com.vk.billing.h.this;
                        Purchase purchase2 = purchase;
                        ner0 ner0Var2 = ner0Var;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        nge0 nge0Var2 = nge0Var;
                        try {
                            try {
                                o27 o27Var = hVar2.b;
                                String str2 = hVar2.i;
                                o27Var.getClass();
                                o27.a(str2, purchase2);
                                i0q0.j(new vr2(7, hVar2, nge0Var2));
                            } catch (Exception e) {
                                L l2 = L.a;
                                l2.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.w(l2, L.LogType.e, e, new Object[]{"Billing : PurchasesManager", "Error during #consumePurchase"}, null, null, 24);
                                }
                                if (z) {
                                    cvk.u(R.string.error_purchasing, false);
                                }
                            }
                        } finally {
                            z1u0.a(ner0Var2);
                            com.vk.billing.h.r(atomicInteger2, null);
                        }
                    }
                });
            } else {
                laqVar.b();
                hVar.h(atomicInteger, i3, purchase, str, ner0Var, z);
            }
        } else if (i2 > 7 || i != 1) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{"Billing : PurchasesManager", "Consume failed by max consume retries"});
            }
            hVar.a(z, ner0Var, null);
        } else {
            int i4 = nge0Var.j;
            if (i4 == 1 || i4 == -1) {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{"Billing : PurchasesManager", "consume success"});
                }
                hVar.h = 0;
                laqVar.c();
                atomicInteger.incrementAndGet();
                asu0.a.getClass();
                asu0.n().submit(new Runnable() { // from class: xsna.rge0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vk.billing.h hVar2 = com.vk.billing.h.this;
                        Purchase purchase2 = purchase;
                        ner0 ner0Var2 = ner0Var;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        nge0 nge0Var2 = nge0Var;
                        try {
                            try {
                                o27 o27Var = hVar2.b;
                                String str2 = hVar2.i;
                                o27Var.getClass();
                                o27.a(str2, purchase2);
                                i0q0.j(new vr2(7, hVar2, nge0Var2));
                            } catch (Exception e) {
                                L l22 = L.a;
                                l22.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.w(l22, L.LogType.e, e, new Object[]{"Billing : PurchasesManager", "Error during #consumePurchase"}, null, null, 24);
                                }
                                if (z) {
                                    cvk.u(R.string.error_purchasing, false);
                                }
                            }
                        } finally {
                            z1u0.a(ner0Var2);
                            com.vk.billing.h.r(atomicInteger2, null);
                        }
                    }
                });
            } else if (i4 == 2) {
                hVar.a(z, ner0Var, null);
            } else {
                laqVar.b();
                hVar.h(atomicInteger, i3, purchase, str, ner0Var, z);
            }
        }
        return s3q0.a;
    }
}
