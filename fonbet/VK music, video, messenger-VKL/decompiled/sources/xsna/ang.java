package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.billing.StorePurchasesManager;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.nge0;

/* compiled from: CommonStickersPurchaseManager.kt */
/* loaded from: classes5.dex */
public final class ang implements obl0 {
    public final Activity b;
    public final oge0 c;
    public qge0<StickerStockItem> d;
    public nhj e;

    /* compiled from: CommonStickersPurchaseManager.kt */
    public static final class a implements StorePurchasesManager.a<StickerStockItem> {
        public final Activity b;
        public final StorePurchasesManager.a<StickerStockItem> c;

        public a(Activity activity, StorePurchasesManager.a<StickerStockItem> aVar) {
            this.b = activity;
            this.c = aVar;
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void a() {
            cvk.u(R.string.purchase_cancelled, false);
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void b() {
            this.c.b();
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void c(StickerStockItem stickerStockItem, nge0 nge0Var) {
            this.c.c(stickerStockItem, nge0Var);
            if (nge0Var.a == 1 || nge0Var.h == 1) {
                itg0.a(this.b, fsk.c.b(InAppReviewConditionKey.BUY_GIFT_OR_PACK, jgp.b).subscribe());
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void d(StickerStockItem stickerStockItem) {
            this.c.d(stickerStockItem);
        }
    }

    public ang(Activity activity) {
        this.b = activity;
        this.c = ((PurchasesManagerComponent) m7m.a(activity).a(fpf0.a(PurchasesManagerComponent.class))).J7();
    }

    @Override // xsna.obl0
    public final void H7(StickerStockItem stickerStockItem, wzs<? super StickerStockItem, ? super nge0, s3q0> wzsVar) {
        b bVar = new b(stickerStockItem, wzsVar);
        Activity activity = this.b;
        this.d = this.c.d(activity, new a(activity, bVar), stickerStockItem);
    }

    @Override // xsna.obl0
    public final void Kk(ArrayList arrayList, wzs wzsVar) {
        c cVar = new c(arrayList, wzsVar);
        Activity activity = this.b;
        this.d = this.c.g(activity, arrayList, new a(activity, cVar));
    }

    @Override // xsna.obl0
    public final void a5(yzs<? super nge0.a, ? super StickersBonusResult, ? super izs<? super Boolean, s3q0>, s3q0> yzsVar) {
        this.e = (nhj) yzsVar;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        qge0<StickerStockItem> qge0Var = this.d;
        if (qge0Var != null) {
            qge0Var.i(i, i2);
        }
    }

    /* compiled from: CommonStickersPurchaseManager.kt */
    public final class b implements StorePurchasesManager.a<StickerStockItem> {
        public final StickerStockItem b;
        public final wzs<StickerStockItem, nge0, s3q0> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(StickerStockItem stickerStockItem, wzs<? super StickerStockItem, ? super nge0, s3q0> wzsVar) {
            this.b = stickerStockItem;
            this.c = wzsVar;
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void c(StickerStockItem stickerStockItem, nge0 nge0Var) {
            StickerStockItem stickerStockItem2 = stickerStockItem;
            if (nge0Var.a == 1 || nge0Var.h == 1) {
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().A();
                t6g0.d().Z(stickerStockItem2);
            }
            nge0.a aVar = nge0Var.m;
            StickersBonusResult stickersBonusResult = nge0Var.l;
            if (stickersBonusResult == null || aVar == null) {
                this.c.invoke(stickerStockItem2, nge0Var);
                return;
            }
            ang angVar = ang.this;
            nv2 nv2Var = new nv2(12, angVar, this);
            nhj nhjVar = angVar.e;
            if (nhjVar != null) {
                nhjVar.invoke(aVar, stickersBonusResult, nv2Var);
            } else {
                new b9l0().a(angVar.b, aVar, stickersBonusResult, nv2Var);
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void d(StickerStockItem stickerStockItem) {
            this.c.invoke(stickerStockItem, null);
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void a() {
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void b() {
        }
    }

    /* compiled from: CommonStickersPurchaseManager.kt */
    public final class c implements StorePurchasesManager.a<StickerStockItem> {
        public final ArrayList b;
        public final wzs<StickerStockItem, nge0, s3q0> c;

        public c(ArrayList arrayList, wzs wzsVar) {
            this.b = arrayList;
            this.c = wzsVar;
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void c(StickerStockItem stickerStockItem, nge0 nge0Var) {
            StickerStockItem stickerStockItem2 = stickerStockItem;
            if (nge0Var.a == 1 || nge0Var.h == 1) {
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().A();
                t6g0.d().Z(stickerStockItem2);
            }
            nge0.a aVar = nge0Var.m;
            StickersBonusResult stickersBonusResult = nge0Var.l;
            if (stickersBonusResult == null || aVar == null) {
                this.c.invoke(stickerStockItem2, nge0Var);
                return;
            }
            ang angVar = ang.this;
            gb gbVar = new gb(9, angVar, this);
            nhj nhjVar = angVar.e;
            if (nhjVar != null) {
                nhjVar.invoke(aVar, stickersBonusResult, gbVar);
            } else {
                new b9l0().a(angVar.b, aVar, stickersBonusResult, gbVar);
            }
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void d(StickerStockItem stickerStockItem) {
            this.c.invoke(stickerStockItem, null);
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void a() {
        }

        @Override // com.vk.billing.StorePurchasesManager.a
        public final void b() {
        }
    }
}
