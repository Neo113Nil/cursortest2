package xsna;

import android.content.Intent;
import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.PaymentType;
import java.util.ArrayList;
import xsna.dq20;

/* compiled from: MiniAppPurchaseManagerImpl.kt */
/* loaded from: classes11.dex */
public final class eq20 implements tb0 {
    public final oge0 b;
    public qge0<dq20> c;

    /* compiled from: MiniAppPurchaseManagerImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a implements StorePurchasesManager.b {
        public final int a;
        public final x2y b;
        public final ArrayList c = new ArrayList();
        public int d;

        public a(int i, x2y x2yVar) {
            this.a = i;
            this.b = x2yVar;
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void a() {
            int i = this.d + 1;
            this.d = i;
            if (i == this.a) {
                this.b.invoke(this.c);
                this.d = 0;
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void b() {
            int i = this.d + 1;
            this.d = i;
            if (i == this.a) {
                this.b.invoke(this.c);
                this.d = 0;
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void c(mge0 mge0Var) {
            boolean z = mge0Var instanceof dq20;
            ArrayList arrayList = this.c;
            if (z) {
                dq20 dq20Var = (dq20) mge0Var;
                dq20.a aVar = dq20Var.e;
                arrayList.add(new lhn0(aVar.c, aVar.a, aVar.b, dq20Var.b, aVar.d, dq20Var.c == PaymentType.Subs));
            }
            int i = this.d + 1;
            this.d = i;
            if (i == this.a) {
                this.b.invoke(arrayList);
                this.d = 0;
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void d(int i) {
            int i2 = this.d + i;
            this.d = i2;
            if (i2 == this.a) {
                this.b.invoke(this.c);
                this.d = 0;
            }
        }
    }

    public eq20(oge0 oge0Var) {
        this.b = oge0Var;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        qge0<dq20> qge0Var = this.c;
        if (qge0Var != null) {
            qge0Var.i(i, i2);
        }
    }
}
